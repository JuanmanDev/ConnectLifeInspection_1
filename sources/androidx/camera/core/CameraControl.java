package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.List;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface CameraControl {
    public static final CameraControl DEFAULT_EMPTY_INSTANCE = new CameraControl() {
        public void cancelAfAeTrigger(boolean z, boolean z2) {
        }

        public void enableTorch(boolean z) {
        }

        public void focus(Rect rect, Rect rect2) {
        }

        public void focus(Rect rect, Rect rect2, @Nullable Executor executor, @Nullable OnFocusListener onFocusListener) {
        }

        public FlashMode getFlashMode() {
            return null;
        }

        public boolean isFocusLocked() {
            return false;
        }

        public boolean isTorchOn() {
            return false;
        }

        public void setCropRegion(Rect rect) {
        }

        public void setFlashMode(FlashMode flashMode) {
        }

        public void submitCaptureRequests(List<CaptureConfig> list) {
        }

        public void triggerAePrecapture() {
        }

        public void triggerAf() {
        }
    };

    public interface ControlUpdateListener {
        void onCameraControlCaptureRequests(List<CaptureConfig> list);

        void onCameraControlUpdateSessionConfig(SessionConfig sessionConfig);
    }

    void cancelAfAeTrigger(boolean z, boolean z2);

    void enableTorch(boolean z);

    void focus(@NonNull Rect rect, @NonNull Rect rect2);

    @SuppressLint({"LambdaLast"})
    void focus(@NonNull Rect rect, @NonNull Rect rect2, @NonNull Executor executor, @NonNull OnFocusListener onFocusListener);

    FlashMode getFlashMode();

    boolean isFocusLocked();

    boolean isTorchOn();

    void setCropRegion(Rect rect);

    void setFlashMode(FlashMode flashMode);

    void submitCaptureRequests(List<CaptureConfig> list);

    void triggerAePrecapture();

    void triggerAf();
}
