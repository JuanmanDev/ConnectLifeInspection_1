package androidx.camera.core;

import android.graphics.SurfaceTexture;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.Preview;

public final class AutoValue_Preview_PreviewOutput extends Preview.PreviewOutput {
    public final int rotationDegrees;
    public final SurfaceTexture surfaceTexture;
    public final Size textureSize;

    public AutoValue_Preview_PreviewOutput(SurfaceTexture surfaceTexture2, Size size, int i) {
        if (surfaceTexture2 != null) {
            this.surfaceTexture = surfaceTexture2;
            if (size != null) {
                this.textureSize = size;
                this.rotationDegrees = i;
                return;
            }
            throw new NullPointerException("Null textureSize");
        }
        throw new NullPointerException("Null surfaceTexture");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Preview.PreviewOutput)) {
            return false;
        }
        Preview.PreviewOutput previewOutput = (Preview.PreviewOutput) obj;
        if (!this.surfaceTexture.equals(previewOutput.getSurfaceTexture()) || !this.textureSize.equals(previewOutput.getTextureSize()) || this.rotationDegrees != previewOutput.getRotationDegrees()) {
            return false;
        }
        return true;
    }

    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    @NonNull
    public Size getTextureSize() {
        return this.textureSize;
    }

    public int hashCode() {
        return ((((this.surfaceTexture.hashCode() ^ 1000003) * 1000003) ^ this.textureSize.hashCode()) * 1000003) ^ this.rotationDegrees;
    }

    public String toString() {
        return "PreviewOutput{surfaceTexture=" + this.surfaceTexture + ", textureSize=" + this.textureSize + ", rotationDegrees=" + this.rotationDegrees + "}";
    }
}
