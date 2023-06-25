package androidx.camera.core;

import androidx.annotation.RestrictTo;
import androidx.camera.core.CaptureConfig;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface CaptureStage {

    public static final class DefaultCaptureStage implements CaptureStage {
        public final CaptureConfig mCaptureConfig = new CaptureConfig.Builder().build();

        public CaptureConfig getCaptureConfig() {
            return this.mCaptureConfig;
        }

        public int getId() {
            return 0;
        }
    }

    CaptureConfig getCaptureConfig();

    int getId();
}
