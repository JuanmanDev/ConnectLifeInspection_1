package androidx.camera.core;

import android.util.Size;

public final class FixedSizeSurfaceTextures {
    public static FixedSizeSurfaceTexture createDetachedSurfaceTexture(Size size) {
        FixedSizeSurfaceTexture fixedSizeSurfaceTexture = new FixedSizeSurfaceTexture(0, size);
        fixedSizeSurfaceTexture.detachFromGLContext();
        return fixedSizeSurfaceTexture;
    }
}
