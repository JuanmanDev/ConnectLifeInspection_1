package androidx.camera.camera2.impl.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.impl.compat.CameraDeviceCompat;
import androidx.camera.camera2.impl.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.impl.compat.params.SessionConfigurationCompat;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
public class CameraDeviceCompatBaseImpl implements CameraDeviceCompat.CameraDeviceCompatImpl {
    public static void checkPhysicalCameraIdValid(CameraDevice cameraDevice, @NonNull List<OutputConfigurationCompat> list) {
        String id = cameraDevice.getId();
        for (OutputConfigurationCompat physicalCameraId : list) {
            String physicalCameraId2 = physicalCameraId.getPhysicalCameraId();
            if (physicalCameraId2 != null && !physicalCameraId2.isEmpty()) {
                "Camera " + id + ": Camera doesn't support physicalCameraId " + physicalCameraId2 + ". Ignoring.";
            }
        }
    }

    public static void checkPreconditions(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat) {
        Preconditions.checkNotNull(cameraDevice);
        Preconditions.checkNotNull(sessionConfigurationCompat);
        Preconditions.checkNotNull(sessionConfigurationCompat.getStateCallback());
        List<OutputConfigurationCompat> outputConfigurations = sessionConfigurationCompat.getOutputConfigurations();
        if (outputConfigurations == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        } else if (sessionConfigurationCompat.getExecutor() != null) {
            checkPhysicalCameraIdValid(cameraDevice, outputConfigurations);
        } else {
            throw new IllegalArgumentException("Invalid executor");
        }
    }

    public static List<Surface> unpackSurfaces(@NonNull List<OutputConfigurationCompat> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (OutputConfigurationCompat surface : list) {
            arrayList.add(surface.getSurface());
        }
        return arrayList;
    }

    public void createBaseCaptureSession(@NonNull CameraDevice cameraDevice, @NonNull List<Surface> list, @NonNull CameraCaptureSession.StateCallback stateCallback, @NonNull Handler handler) {
        cameraDevice.createCaptureSession(list, stateCallback, handler);
    }

    public void createCaptureSession(@NonNull CameraDevice cameraDevice, @NonNull SessionConfigurationCompat sessionConfigurationCompat) {
        checkPreconditions(cameraDevice, sessionConfigurationCompat);
        if (sessionConfigurationCompat.getInputConfiguration() != null) {
            throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
        } else if (sessionConfigurationCompat.getSessionType() != 1) {
            createBaseCaptureSession(cameraDevice, unpackSurfaces(sessionConfigurationCompat.getOutputConfigurations()), new CameraCaptureSessionCompat.StateCallbackExecutorWrapper(sessionConfigurationCompat.getExecutor(), sessionConfigurationCompat.getStateCallback()), MainThreadAsyncHandler.getInstance());
        } else {
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
    }
}
