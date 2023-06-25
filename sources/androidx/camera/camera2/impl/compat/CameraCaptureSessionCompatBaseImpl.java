package androidx.camera.camera2.impl.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.compat.CameraCaptureSessionCompat;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import androidx.core.util.Preconditions;
import java.util.List;
import java.util.concurrent.Executor;

@RequiresApi(21)
public class CameraCaptureSessionCompatBaseImpl implements CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl {
    public int captureBurstRequests(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.checkNotNull(cameraCaptureSession);
        return cameraCaptureSession.captureBurst(list, new CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, captureCallback), MainThreadAsyncHandler.getInstance());
    }

    public int captureSingleRequest(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.checkNotNull(cameraCaptureSession);
        return cameraCaptureSession.capture(captureRequest, new CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, captureCallback), MainThreadAsyncHandler.getInstance());
    }

    public int setRepeatingBurstRequests(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.checkNotNull(cameraCaptureSession);
        return cameraCaptureSession.setRepeatingBurst(list, new CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, captureCallback), MainThreadAsyncHandler.getInstance());
    }

    public int setSingleRepeatingRequest(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.checkNotNull(cameraCaptureSession);
        return cameraCaptureSession.setRepeatingRequest(captureRequest, new CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, captureCallback), MainThreadAsyncHandler.getInstance());
    }
}
