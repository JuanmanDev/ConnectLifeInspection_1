package com.facebook.stetho.inspector.elements.android;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Util;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class ViewHighlighter {

    public static final class NoopHighlighter extends ViewHighlighter {
        public NoopHighlighter() {
        }

        public void clearHighlight() {
        }

        public void setHighlightedView(View view, Rect rect, int i) {
        }
    }

    @TargetApi(18)
    public static final class OverlayHighlighter extends ViewHighlighter {
        public AtomicReference<Rect> mBoundsToHighlight = new AtomicReference<>();
        public AtomicInteger mContentColor = new AtomicInteger();
        public final Rect mEmptyRect = new Rect();
        public final Handler mHandler = new Handler(Looper.getMainLooper());
        public final ViewHighlightOverlays mHighlightOverlays = ViewHighlightOverlays.newInstance();
        public final Runnable mHighlightViewOnUiThreadRunnable = new Runnable() {
            public void run() {
                OverlayHighlighter.this.highlightViewOnUiThread();
            }
        };
        public final Rect mHighlightedBounds = new Rect();
        public View mHighlightedView;
        public AtomicReference<View> mViewToHighlight = new AtomicReference<>();

        /* access modifiers changed from: private */
        public void highlightViewOnUiThread() {
            View andSet = this.mViewToHighlight.getAndSet((Object) null);
            Rect andSet2 = this.mBoundsToHighlight.getAndSet((Object) null);
            if (andSet2 == null) {
                andSet2 = this.mEmptyRect;
            }
            if (andSet != this.mHighlightedView || !this.mHighlightedBounds.equals(andSet2)) {
                View view = this.mHighlightedView;
                if (view != null) {
                    this.mHighlightOverlays.removeHighlight(view);
                }
                if (andSet != null) {
                    this.mHighlightOverlays.highlightView(andSet, andSet2, this.mContentColor.get());
                }
                this.mHighlightedView = andSet;
                if (andSet2 == null) {
                    this.mHighlightedBounds.setEmpty();
                } else {
                    this.mHighlightedBounds.set(andSet2);
                }
            }
        }

        private void setHighlightedViewImpl(View view, Rect rect, int i) {
            this.mHandler.removeCallbacks(this.mHighlightViewOnUiThreadRunnable);
            this.mViewToHighlight.set(view);
            this.mBoundsToHighlight.set(rect);
            this.mContentColor.set(i);
            this.mHandler.postDelayed(this.mHighlightViewOnUiThreadRunnable, 100);
        }

        public void clearHighlight() {
            setHighlightedViewImpl((View) null, (Rect) null, 0);
        }

        public void setHighlightedView(View view, Rect rect, int i) {
            setHighlightedViewImpl((View) Util.throwIfNull(view), rect, i);
        }
    }

    public static ViewHighlighter newInstance() {
        if (Build.VERSION.SDK_INT >= 18) {
            return new OverlayHighlighter();
        }
        LogUtil.m9817w("Running on pre-JBMR2: View highlighting is not supported");
        return new NoopHighlighter();
    }

    public abstract void clearHighlight();

    public abstract void setHighlightedView(View view, Rect rect, int i);
}
