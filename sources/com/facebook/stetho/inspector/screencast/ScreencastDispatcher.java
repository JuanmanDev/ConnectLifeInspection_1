package com.facebook.stetho.inspector.screencast;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Base64OutputStream;
import android.view.View;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.inspector.elements.android.ActivityTracker;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback;
import com.facebook.stetho.inspector.protocol.module.Page;
import java.io.ByteArrayOutputStream;

public final class ScreencastDispatcher {
    public static final long FRAME_DELAY = 200;
    public final ActivityTracker mActivityTracker = ActivityTracker.get();
    public Handler mBackgroundHandler;
    public Bitmap mBitmap;
    public final BitmapFetchRunnable mBitmapFetchRunnable = new BitmapFetchRunnable();
    public Canvas mCanvas;
    public Page.ScreencastFrameEvent mEvent = new Page.ScreencastFrameEvent();
    public final EventDispatchRunnable mEventDispatchRunnable = new EventDispatchRunnable();
    public HandlerThread mHandlerThread;
    public boolean mIsRunning;
    public final Handler mMainHandler = new Handler(Looper.getMainLooper());
    public Page.ScreencastFrameEventMetadata mMetadata = new Page.ScreencastFrameEventMetadata();
    public JsonRpcPeer mPeer;
    public Page.StartScreencastRequest mRequest;
    public ByteArrayOutputStream mStream;
    public final RectF mTempDst = new RectF();
    public final RectF mTempSrc = new RectF();

    public class BitmapFetchRunnable implements Runnable {
        public BitmapFetchRunnable() {
        }

        private void updateScreenBitmap() {
            Activity tryGetTopActivity;
            if (ScreencastDispatcher.this.mIsRunning && (tryGetTopActivity = ScreencastDispatcher.this.mActivityTracker.tryGetTopActivity()) != null) {
                View decorView = tryGetTopActivity.getWindow().getDecorView();
                try {
                    if (ScreencastDispatcher.this.mBitmap == null) {
                        int width = decorView.getWidth();
                        float f = (float) width;
                        float height = (float) decorView.getHeight();
                        float min = Math.min(((float) ScreencastDispatcher.this.mRequest.maxWidth) / f, ((float) ScreencastDispatcher.this.mRequest.maxHeight) / height);
                        int i = (int) (f * min);
                        int i2 = (int) (min * height);
                        Bitmap unused = ScreencastDispatcher.this.mBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
                        Canvas unused2 = ScreencastDispatcher.this.mCanvas = new Canvas(ScreencastDispatcher.this.mBitmap);
                        Matrix matrix = new Matrix();
                        ScreencastDispatcher.this.mTempSrc.set(0.0f, 0.0f, f, height);
                        ScreencastDispatcher.this.mTempDst.set(0.0f, 0.0f, (float) i, (float) i2);
                        matrix.setRectToRect(ScreencastDispatcher.this.mTempSrc, ScreencastDispatcher.this.mTempDst, Matrix.ScaleToFit.CENTER);
                        ScreencastDispatcher.this.mCanvas.setMatrix(matrix);
                    }
                    decorView.draw(ScreencastDispatcher.this.mCanvas);
                } catch (OutOfMemoryError unused3) {
                    LogUtil.m9817w("Out of memory trying to allocate screencast Bitmap.");
                }
            }
        }

        public void run() {
            updateScreenBitmap();
            ScreencastDispatcher.this.mBackgroundHandler.post(ScreencastDispatcher.this.mEventDispatchRunnable.withEndAction(this));
        }
    }

    public class CancellationRunnable implements Runnable {
        public CancellationRunnable() {
        }

        public void run() {
            ScreencastDispatcher.this.mHandlerThread.interrupt();
            ScreencastDispatcher.this.mMainHandler.removeCallbacks(ScreencastDispatcher.this.mBitmapFetchRunnable);
            ScreencastDispatcher.this.mBackgroundHandler.removeCallbacks(ScreencastDispatcher.this.mEventDispatchRunnable);
            boolean unused = ScreencastDispatcher.this.mIsRunning = false;
            HandlerThread unused2 = ScreencastDispatcher.this.mHandlerThread = null;
            Bitmap unused3 = ScreencastDispatcher.this.mBitmap = null;
            Canvas unused4 = ScreencastDispatcher.this.mCanvas = null;
            ByteArrayOutputStream unused5 = ScreencastDispatcher.this.mStream = null;
        }
    }

    public class EventDispatchRunnable implements Runnable {
        public Runnable mEndAction;

        public EventDispatchRunnable() {
        }

        /* access modifiers changed from: private */
        public EventDispatchRunnable withEndAction(Runnable runnable) {
            this.mEndAction = runnable;
            return this;
        }

        public void run() {
            if (ScreencastDispatcher.this.mIsRunning && ScreencastDispatcher.this.mBitmap != null) {
                int width = ScreencastDispatcher.this.mBitmap.getWidth();
                int height = ScreencastDispatcher.this.mBitmap.getHeight();
                ScreencastDispatcher.this.mStream.reset();
                Base64OutputStream base64OutputStream = new Base64OutputStream(ScreencastDispatcher.this.mStream, 0);
                ScreencastDispatcher.this.mBitmap.compress(Bitmap.CompressFormat.valueOf(ScreencastDispatcher.this.mRequest.format.toUpperCase()), ScreencastDispatcher.this.mRequest.quality, base64OutputStream);
                ScreencastDispatcher.this.mEvent.data = ScreencastDispatcher.this.mStream.toString();
                ScreencastDispatcher.this.mMetadata.pageScaleFactor = 1;
                ScreencastDispatcher.this.mMetadata.deviceWidth = width;
                ScreencastDispatcher.this.mMetadata.deviceHeight = height;
                ScreencastDispatcher.this.mEvent.metadata = ScreencastDispatcher.this.mMetadata;
                ScreencastDispatcher.this.mPeer.invokeMethod("Page.screencastFrame", ScreencastDispatcher.this.mEvent, (PendingRequestCallback) null);
                ScreencastDispatcher.this.mMainHandler.postDelayed(this.mEndAction, 200);
            }
        }
    }

    public void startScreencast(JsonRpcPeer jsonRpcPeer, Page.StartScreencastRequest startScreencastRequest) {
        LogUtil.m9801d("Starting screencast");
        this.mRequest = startScreencastRequest;
        HandlerThread handlerThread = new HandlerThread("Screencast Thread");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mPeer = jsonRpcPeer;
        this.mIsRunning = true;
        this.mStream = new ByteArrayOutputStream();
        this.mBackgroundHandler = new Handler(this.mHandlerThread.getLooper());
        this.mMainHandler.postDelayed(this.mBitmapFetchRunnable, 200);
    }

    public void stopScreencast() {
        LogUtil.m9801d("Stopping screencast");
        this.mBackgroundHandler.post(new CancellationRunnable());
    }
}
