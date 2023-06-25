package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import android.os.Build;
import androidx.annotation.GuardedBy;
import androidx.camera.core.ImageProxy;
import java.nio.ByteBuffer;

public final class AndroidImageProxy implements ImageProxy {
    public static final boolean SET_TIMESTAMP_AVAILABLE_IN_FRAMEWORK = (Build.VERSION.SDK_INT >= 23);
    @GuardedBy("this")
    public final Image mImage;
    @GuardedBy("this")
    public final PlaneProxy[] mPlanes;
    @GuardedBy("this")
    public long mTimestamp;

    public static final class PlaneProxy implements ImageProxy.PlaneProxy {
        @GuardedBy("this")
        public final Image.Plane mPlane;

        public PlaneProxy(Image.Plane plane) {
            this.mPlane = plane;
        }

        public synchronized ByteBuffer getBuffer() {
            return this.mPlane.getBuffer();
        }

        public synchronized int getPixelStride() {
            return this.mPlane.getPixelStride();
        }

        public synchronized int getRowStride() {
            return this.mPlane.getRowStride();
        }
    }

    public AndroidImageProxy(Image image) {
        this.mImage = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.mPlanes = new PlaneProxy[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.mPlanes[i] = new PlaneProxy(planes[i]);
            }
        } else {
            this.mPlanes = new PlaneProxy[0];
        }
        this.mTimestamp = image.getTimestamp();
    }

    public synchronized void close() {
        this.mImage.close();
    }

    public synchronized Rect getCropRect() {
        return this.mImage.getCropRect();
    }

    public synchronized int getFormat() {
        return this.mImage.getFormat();
    }

    public synchronized int getHeight() {
        return this.mImage.getHeight();
    }

    public synchronized Image getImage() {
        return this.mImage;
    }

    public ImageInfo getImageInfo() {
        return null;
    }

    public synchronized ImageProxy.PlaneProxy[] getPlanes() {
        return this.mPlanes;
    }

    public synchronized long getTimestamp() {
        if (SET_TIMESTAMP_AVAILABLE_IN_FRAMEWORK) {
            return this.mImage.getTimestamp();
        }
        return this.mTimestamp;
    }

    public synchronized int getWidth() {
        return this.mImage.getWidth();
    }

    public synchronized void setCropRect(Rect rect) {
        this.mImage.setCropRect(rect);
    }

    public synchronized void setTimestamp(long j) {
        if (SET_TIMESTAMP_AVAILABLE_IN_FRAMEWORK) {
            this.mImage.setTimestamp(j);
        } else {
            this.mTimestamp = j;
        }
    }
}
