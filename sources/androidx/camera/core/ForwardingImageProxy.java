package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.GuardedBy;
import androidx.camera.core.ImageProxy;
import java.util.HashSet;
import java.util.Set;

public abstract class ForwardingImageProxy implements ImageProxy {
    @GuardedBy("this")
    public final ImageProxy mImage;
    @GuardedBy("this")
    public final Set<OnImageCloseListener> mOnImageCloseListeners = new HashSet();

    public interface OnImageCloseListener {
        void onImageClose(ImageProxy imageProxy);
    }

    public ForwardingImageProxy(ImageProxy imageProxy) {
        this.mImage = imageProxy;
    }

    public synchronized void addOnImageCloseListener(OnImageCloseListener onImageCloseListener) {
        this.mOnImageCloseListeners.add(onImageCloseListener);
    }

    public synchronized void close() {
        this.mImage.close();
        notifyOnImageCloseListeners();
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
        return this.mImage.getImage();
    }

    public synchronized ImageInfo getImageInfo() {
        return this.mImage.getImageInfo();
    }

    public synchronized ImageProxy.PlaneProxy[] getPlanes() {
        return this.mImage.getPlanes();
    }

    public synchronized long getTimestamp() {
        return this.mImage.getTimestamp();
    }

    public synchronized int getWidth() {
        return this.mImage.getWidth();
    }

    public synchronized void notifyOnImageCloseListeners() {
        for (OnImageCloseListener onImageClose : this.mOnImageCloseListeners) {
            onImageClose.onImageClose(this);
        }
    }

    public synchronized void setCropRect(Rect rect) {
        this.mImage.setCropRect(rect);
    }

    public synchronized void setTimestamp(long j) {
        this.mImage.setTimestamp(j);
    }
}
