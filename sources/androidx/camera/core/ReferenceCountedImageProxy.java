package androidx.camera.core;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

public final class ReferenceCountedImageProxy extends ForwardingImageProxy {
    @GuardedBy("this")
    public int mReferenceCount = 1;

    public ReferenceCountedImageProxy(ImageProxy imageProxy) {
        super(imageProxy);
    }

    public synchronized void close() {
        if (this.mReferenceCount > 0) {
            int i = this.mReferenceCount - 1;
            this.mReferenceCount = i;
            if (i <= 0) {
                super.close();
            }
        }
    }

    @Nullable
    public synchronized ImageProxy fork() {
        if (this.mReferenceCount <= 0) {
            return null;
        }
        this.mReferenceCount++;
        return new SingleCloseImageProxy(this);
    }

    public synchronized int getReferenceCount() {
        return this.mReferenceCount;
    }
}
