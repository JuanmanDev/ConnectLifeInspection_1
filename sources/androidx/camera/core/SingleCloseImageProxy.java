package androidx.camera.core;

import androidx.annotation.GuardedBy;

public final class SingleCloseImageProxy extends ForwardingImageProxy {
    @GuardedBy("this")
    public boolean mClosed = false;

    public SingleCloseImageProxy(ImageProxy imageProxy) {
        super(imageProxy);
    }

    public synchronized void close() {
        if (!this.mClosed) {
            this.mClosed = true;
            super.close();
        }
    }
}
