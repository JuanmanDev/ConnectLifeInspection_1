package p691no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.NonNull;

/* renamed from: no.nordicsemi.android.dfu.DfuDeviceSelector */
public interface DfuDeviceSelector {
    boolean matches(@NonNull BluetoothDevice bluetoothDevice, int i, @NonNull byte[] bArr, @NonNull String str, @NonNull String str2);
}
