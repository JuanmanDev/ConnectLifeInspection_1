package androidx.camera.core;

import android.os.Handler;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageReaderProxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class QueuedImageReaderProxy implements ImageReaderProxy, ForwardingImageProxy.OnImageCloseListener {
    @GuardedBy("this")
    public final Set<ImageProxy> mAcquiredImages = new HashSet();
    @GuardedBy("this")
    public boolean mClosed;
    @GuardedBy("this")
    public int mCurrentPosition;
    public final int mFormat;
    public final int mHeight;
    @GuardedBy("this")
    public final List<ImageProxy> mImages;
    public final int mMaxImages;
    @GuardedBy("this")
    @Nullable
    public Handler mOnImageAvailableHandler;
    @GuardedBy("this")
    @Nullable
    public ImageReaderProxy.OnImageAvailableListener mOnImageAvailableListener;
    @GuardedBy("this")
    public final Set<OnReaderCloseListener> mOnReaderCloseListeners = new HashSet();
    @GuardedBy("this")
    public final Surface mSurface;
    public final int mWidth;

    public interface OnReaderCloseListener {
        void onReaderClose(ImageReaderProxy imageReaderProxy);
    }

    public QueuedImageReaderProxy(int i, int i2, int i3, int i4, Surface surface) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mFormat = i3;
        this.mMaxImages = i4;
        this.mSurface = surface;
        this.mImages = new ArrayList(i4);
        this.mCurrentPosition = 0;
        this.mClosed = false;
    }

    private synchronized void notifyOnReaderCloseListeners() {
        for (OnReaderCloseListener onReaderClose : this.mOnReaderCloseListeners) {
            onReaderClose.onReaderClose(this);
        }
    }

    private synchronized void throwExceptionIfClosed() {
        if (this.mClosed) {
            throw new IllegalStateException("This reader is already closed.");
        }
    }

    @Nullable
    public synchronized ImageProxy acquireLatestImage() {
        throwExceptionIfClosed();
        if (this.mImages.isEmpty()) {
            return null;
        }
        if (this.mCurrentPosition < this.mImages.size()) {
            ArrayList<ImageProxy> arrayList = new ArrayList<>();
            for (int i = 0; i < this.mImages.size() - 1; i++) {
                if (!this.mAcquiredImages.contains(this.mImages.get(i))) {
                    arrayList.add(this.mImages.get(i));
                }
            }
            for (ImageProxy close : arrayList) {
                close.close();
            }
            int size = this.mImages.size() - 1;
            this.mCurrentPosition = size;
            List<ImageProxy> list = this.mImages;
            this.mCurrentPosition = size + 1;
            ImageProxy imageProxy = list.get(size);
            this.mAcquiredImages.add(imageProxy);
            return imageProxy;
        }
        throw new IllegalStateException("Max images have already been acquired without close.");
    }

    @Nullable
    public synchronized ImageProxy acquireNextImage() {
        throwExceptionIfClosed();
        if (this.mImages.isEmpty()) {
            return null;
        }
        if (this.mCurrentPosition < this.mImages.size()) {
            List<ImageProxy> list = this.mImages;
            int i = this.mCurrentPosition;
            this.mCurrentPosition = i + 1;
            ImageProxy imageProxy = list.get(i);
            this.mAcquiredImages.add(imageProxy);
            return imageProxy;
        }
        throw new IllegalStateException("Max images have already been acquired without close.");
    }

    public synchronized void addOnReaderCloseListener(OnReaderCloseListener onReaderCloseListener) {
        this.mOnReaderCloseListeners.add(onReaderCloseListener);
    }

    public synchronized void close() {
        if (!this.mClosed) {
            setOnImageAvailableListener((ImageReaderProxy.OnImageAvailableListener) null, (Handler) null);
            for (ImageProxy close : new ArrayList(this.mImages)) {
                close.close();
            }
            this.mImages.clear();
            this.mClosed = true;
            notifyOnReaderCloseListeners();
        }
    }

    public synchronized void enqueueImage(ForwardingImageProxy forwardingImageProxy) {
        throwExceptionIfClosed();
        if (this.mImages.size() < this.mMaxImages) {
            this.mImages.add(forwardingImageProxy);
            forwardingImageProxy.addOnImageCloseListener(this);
            if (!(this.mOnImageAvailableListener == null || this.mOnImageAvailableHandler == null)) {
                final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener = this.mOnImageAvailableListener;
                this.mOnImageAvailableHandler.post(new Runnable() {
                    public void run() {
                        if (!QueuedImageReaderProxy.this.isClosed()) {
                            onImageAvailableListener.onImageAvailable(QueuedImageReaderProxy.this);
                        }
                    }
                });
            }
        } else {
            forwardingImageProxy.close();
        }
    }

    public synchronized int getCurrentImages() {
        throwExceptionIfClosed();
        return this.mImages.size();
    }

    public int getHeight() {
        throwExceptionIfClosed();
        return this.mHeight;
    }

    public int getImageFormat() {
        throwExceptionIfClosed();
        return this.mFormat;
    }

    public int getMaxImages() {
        throwExceptionIfClosed();
        return this.mMaxImages;
    }

    public synchronized Surface getSurface() {
        throwExceptionIfClosed();
        return this.mSurface;
    }

    public int getWidth() {
        throwExceptionIfClosed();
        return this.mWidth;
    }

    public synchronized boolean isClosed() {
        return this.mClosed;
    }

    public synchronized void onImageClose(ImageProxy imageProxy) {
        int indexOf = this.mImages.indexOf(imageProxy);
        if (indexOf >= 0) {
            this.mImages.remove(indexOf);
            if (indexOf <= this.mCurrentPosition) {
                this.mCurrentPosition--;
            }
        }
        this.mAcquiredImages.remove(imageProxy);
    }

    public synchronized void setOnImageAvailableListener(@Nullable ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, @Nullable Handler handler) {
        throwExceptionIfClosed();
        this.mOnImageAvailableListener = onImageAvailableListener;
        this.mOnImageAvailableHandler = handler;
    }
}
