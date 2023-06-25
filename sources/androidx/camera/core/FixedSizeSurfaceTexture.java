package androidx.camera.core;

import android.graphics.SurfaceTexture;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;

public final class FixedSizeSurfaceTexture extends SurfaceTexture {
    public static final Owner SELF_OWNER = new Owner() {
        public boolean requestRelease() {
            return true;
        }
    };
    @VisibleForTesting
    public boolean mIsSuperReleased;
    public final Owner mOwner;

    public interface Owner {
        boolean requestRelease();
    }

    public FixedSizeSurfaceTexture(int i, Size size) {
        this(i, size, SELF_OWNER);
    }

    public void release() {
        if (this.mOwner.requestRelease()) {
            super.release();
            this.mIsSuperReleased = true;
        }
    }

    public void setDefaultBufferSize(int i, int i2) {
    }

    public FixedSizeSurfaceTexture(int i, Size size, Owner owner) {
        super(i);
        this.mIsSuperReleased = false;
        super.setDefaultBufferSize(size.getWidth(), size.getHeight());
        this.mOwner = owner;
    }

    public FixedSizeSurfaceTexture(int i, boolean z, Size size) {
        super(i, z);
        this.mIsSuperReleased = false;
        super.setDefaultBufferSize(size.getWidth(), size.getHeight());
        this.mOwner = SELF_OWNER;
    }

    @RequiresApi(api = 26)
    public FixedSizeSurfaceTexture(boolean z, Size size) {
        super(z);
        this.mIsSuperReleased = false;
        super.setDefaultBufferSize(size.getWidth(), size.getHeight());
        this.mOwner = SELF_OWNER;
    }
}
