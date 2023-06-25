package androidx.camera.camera2.impl.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.List;
import java.util.concurrent.Executor;

@RequiresApi(28)
public class CameraCaptureSessionCompatApi28Impl extends CameraCaptureSessionCompatBaseImpl {
    public int captureBurstRequests(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.checkNotNull(cameraCaptureSession);
        return cameraCaptureSession.captureBurstRequests(list, executor, captureCallback);
    }

    public int captureSingleRequest(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.checkNotNull(cameraCaptureSession);
        return cameraCaptureSession.captureSingleRequest(captureRequest, executor, captureCallback);
    }

    public int setRepeatingBurstRequests(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.checkNotNull(cameraCaptureSession);
        return cameraCaptureSession.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    public int setSingleRepeatingRequest(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.checkNotNull(cameraCaptureSession);
        return cameraCaptureSession.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
