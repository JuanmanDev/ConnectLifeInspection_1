package p691no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.NonNull;

/* renamed from: no.nordicsemi.android.dfu.DfuDefaultDeviceSelector */
public class DfuDefaultDeviceSelector implements DfuDeviceSelector {
    public boolean matches(@NonNull BluetoothDevice bluetoothDevice, int i, @NonNull byte[] bArr, @NonNull String str, @NonNull String str2) {
        return str.equals(bluetoothDevice.getAddress()) || str2.equals(bluetoothDevice.getAddress());
    }
}
