package p691no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import androidx.annotation.NonNull;
import java.util.UUID;

/* renamed from: no.nordicsemi.android.dfu.ButtonlessDfuWithoutBondSharingImpl */
public class ButtonlessDfuWithoutBondSharingImpl extends ButtonlessDfuImpl {
    public static UUID BUTTONLESS_DFU_SERVICE_UUID = DEFAULT_BUTTONLESS_DFU_SERVICE_UUID;
    public static UUID BUTTONLESS_DFU_UUID;
    public static final UUID DEFAULT_BUTTONLESS_DFU_SERVICE_UUID = SecureDfuImpl.DEFAULT_DFU_SERVICE_UUID;
    public static final UUID DEFAULT_BUTTONLESS_DFU_UUID;
    public BluetoothGattCharacteristic mButtonlessDfuCharacteristic;

    static {
        UUID uuid = new UUID(-8157989233041780896L, -6937650605005804976L);
        DEFAULT_BUTTONLESS_DFU_UUID = uuid;
        BUTTONLESS_DFU_UUID = uuid;
    }

    public ButtonlessDfuWithoutBondSharingImpl(@NonNull Intent intent, @NonNull DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
    }

    public BluetoothGattCharacteristic getButtonlessDfuCharacteristic() {
        return this.mButtonlessDfuCharacteristic;
    }

    public int getResponseType() {
        return 2;
    }

    public boolean isClientCompatible(@NonNull Intent intent, @NonNull BluetoothGatt bluetoothGatt) {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattService service = bluetoothGatt.getService(BUTTONLESS_DFU_SERVICE_UUID);
        if (service == null || (characteristic = service.getCharacteristic(BUTTONLESS_DFU_UUID)) == null || characteristic.getDescriptor(BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG) == null) {
            return false;
        }
        this.mButtonlessDfuCharacteristic = characteristic;
        return true;
    }

    public void performDfu(@NonNull Intent intent) {
        logi("Buttonless service without bond sharing found -> SDK 13 or newer");
        if (isBonded()) {
            logw("Device is paired! Use Buttonless DFU with Bond Sharing instead (SDK 14 or newer)");
        }
        super.performDfu(intent);
    }

    public boolean shouldScanForBootloader() {
        return true;
    }
}
