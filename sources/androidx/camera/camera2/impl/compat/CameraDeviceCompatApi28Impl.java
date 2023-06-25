package androidx.camera.camera2.impl.compat;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.compat.params.SessionConfigurationCompat;
import androidx.core.util.Preconditions;

@RequiresApi(28)
public class CameraDeviceCompatApi28Impl extends CameraDeviceCompatApi24Impl {
    public void createCaptureSession(@NonNull CameraDevice cameraDevice, @NonNull SessionConfigurationCompat sessionConfigurationCompat) {
        Preconditions.checkNotNull(cameraDevice);
        SessionConfiguration sessionConfiguration = (SessionConfiguration) sessionConfigurationCompat.unwrap();
        Preconditions.checkNotNull(sessionConfiguration);
        cameraDevice.createCaptureSession(sessionConfiguration);
    }
}
