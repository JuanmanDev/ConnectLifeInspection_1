package androidx.camera.core;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CameraDeviceStateCallbacks {

    public static final class ComboDeviceStateCallback extends CameraDevice.StateCallback {
        public final List<CameraDevice.StateCallback> mCallbacks = new ArrayList();

        public ComboDeviceStateCallback(List<CameraDevice.StateCallback> list) {
            for (CameraDevice.StateCallback next : list) {
                if (!(next instanceof NoOpDeviceStateCallback)) {
                    this.mCallbacks.add(next);
                }
            }
        }

        public void onClosed(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback onClosed : this.mCallbacks) {
                onClosed.onClosed(cameraDevice);
            }
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback onDisconnected : this.mCallbacks) {
                onDisconnected.onDisconnected(cameraDevice);
            }
        }

        public void onError(CameraDevice cameraDevice, int i) {
            for (CameraDevice.StateCallback onError : this.mCallbacks) {
                onError.onError(cameraDevice, i);
            }
        }

        public void onOpened(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback onOpened : this.mCallbacks) {
                onOpened.onOpened(cameraDevice);
            }
        }
    }

    public static final class NoOpDeviceStateCallback extends CameraDevice.StateCallback {
        public void onClosed(CameraDevice cameraDevice) {
        }

        public void onDisconnected(CameraDevice cameraDevice) {
        }

        public void onError(CameraDevice cameraDevice, int i) {
        }

        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public static CameraDevice.StateCallback createComboCallback(List<CameraDevice.StateCallback> list) {
        if (list.isEmpty()) {
            return createNoOpCallback();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new ComboDeviceStateCallback(list);
    }

    public static CameraDevice.StateCallback createNoOpCallback() {
        return new NoOpDeviceStateCallback();
    }

    public static CameraDevice.StateCallback createComboCallback(CameraDevice.StateCallback... stateCallbackArr) {
        return createComboCallback((List<CameraDevice.StateCallback>) Arrays.asList(stateCallbackArr));
    }
}
