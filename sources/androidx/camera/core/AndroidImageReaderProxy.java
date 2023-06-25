package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageReaderProxy;

public final class AndroidImageReaderProxy implements ImageReaderProxy {
    @GuardedBy("this")
    public final ImageReader mImageReader;

    public AndroidImageReaderProxy(ImageReader imageReader) {
        this.mImageReader = imageReader;
    }

    @Nullable
    public synchronized ImageProxy acquireLatestImage() {
        Image acquireLatestImage = this.mImageReader.acquireLatestImage();
        if (acquireLatestImage == null) {
            return null;
        }
        return new AndroidImageProxy(acquireLatestImage);
    }

    @Nullable
    public synchronized ImageProxy acquireNextImage() {
        Image acquireNextImage = this.mImageReader.acquireNextImage();
        if (acquireNextImage == null) {
            return null;
        }
        return new AndroidImageProxy(acquireNextImage);
    }

    public synchronized void close() {
        this.mImageReader.close();
    }

    public synchronized int getHeight() {
        return this.mImageReader.getHeight();
    }

    public synchronized int getImageFormat() {
        return this.mImageReader.getImageFormat();
    }

    public synchronized int getMaxImages() {
        return this.mImageReader.getMaxImages();
    }

    public synchronized Surface getSurface() {
        return this.mImageReader.getSurface();
    }

    public synchronized int getWidth() {
        return this.mImageReader.getWidth();
    }

    public synchronized void setOnImageAvailableListener(@Nullable final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, @Nullable Handler handler) {
        this.mImageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
            public void onImageAvailable(ImageReader imageReader) {
                onImageAvailableListener.onImageAvailable(AndroidImageReaderProxy.this);
            }
        }, handler);
    }
}
