package p691no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothGatt;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;

/* renamed from: no.nordicsemi.android.dfu.DfuService */
public interface DfuService extends DfuCallback {
    boolean initialize(@NonNull Intent intent, @NonNull BluetoothGatt bluetoothGatt, int i, @NonNull InputStream inputStream, @Nullable InputStream inputStream2);

    boolean isClientCompatible(@NonNull Intent intent, @NonNull BluetoothGatt bluetoothGatt);

    void performDfu(@NonNull Intent intent);

    void release();
}
