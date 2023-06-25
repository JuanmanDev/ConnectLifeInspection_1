package p691no.nordicsemi.android.dfu;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.os.Build;
import android.preference.PreferenceManager;
import androidx.annotation.NonNull;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.util.UUID;

@SuppressLint({"MissingPermission"})
/* renamed from: no.nordicsemi.android.dfu.LegacyButtonlessDfuImpl */
public class LegacyButtonlessDfuImpl extends BaseButtonlessDfuImpl {
    public static UUID DFU_CONTROL_POINT_UUID = LegacyDfuImpl.DEFAULT_DFU_CONTROL_POINT_UUID;
    public static UUID DFU_SERVICE_UUID = LegacyDfuImpl.DEFAULT_DFU_SERVICE_UUID;
    public static UUID DFU_VERSION_UUID = LegacyDfuImpl.DEFAULT_DFU_VERSION_UUID;
    public static final byte[] OP_CODE_ENTER_BOOTLOADER = {1, 4};
    public BluetoothGattCharacteristic mControlPointCharacteristic;
    public int mVersion;

    public LegacyButtonlessDfuImpl(@NonNull Intent intent, @NonNull DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
    }

    private String getVersionFeatures(int i) {
        return i != 0 ? i != 1 ? i != 5 ? i != 6 ? i != 7 ? i != 8 ? "Unknown version" : "Bootloader from SDK 9.0 or newer. Signature supported" : "Bootloader from SDK 8.0 or newer. SHA-256 used instead of CRC-16 in the Init Packet" : "Bootloader from SDK 8.0 or newer. Bond sharing supported" : "Bootloader from SDK 7.0 or newer. No bond sharing" : "Application with Legacy buttonless update from SDK 7.0 or newer" : "Bootloader from SDK 6.1 or older";
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int readVersion(android.bluetooth.BluetoothGatt r6, android.bluetooth.BluetoothGattCharacteristic r7) {
        /*
            r5 = this;
            boolean r0 = r5.mConnected
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r5.mAborted
            if (r0 != 0) goto L_0x00a8
            r0 = 0
            if (r7 != 0) goto L_0x000c
            return r0
        L_0x000c:
            r1 = 0
            r5.mReceivedData = r1
            r5.mError = r0
            java.lang.String r2 = "Reading DFU version number..."
            r5.logi(r2)
            no.nordicsemi.android.dfu.DfuBaseService r2 = r5.mService
            r3 = 1
            java.lang.String r4 = "Reading DFU version number..."
            r2.sendLogBroadcast(r3, r4)
            r7.setValue(r1)
            no.nordicsemi.android.dfu.DfuBaseService r1 = r5.mService
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "gatt.readCharacteristic("
            r2.append(r3)
            java.util.UUID r3 = r7.getUuid()
            r2.append(r3)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.sendLogBroadcast(r0, r2)
            r6.readCharacteristic(r7)
            java.lang.Object r6 = r5.mLock     // Catch:{ InterruptedException -> 0x006d }
            monitor-enter(r6)     // Catch:{ InterruptedException -> 0x006d }
        L_0x0046:
            boolean r1 = r5.mRequestCompleted     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0050
            byte[] r1 = r7.getValue()     // Catch:{ all -> 0x006a }
            if (r1 != 0) goto L_0x005c
        L_0x0050:
            boolean r1 = r5.mConnected     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x005c
            int r1 = r5.mError     // Catch:{ all -> 0x006a }
            if (r1 != 0) goto L_0x005c
            boolean r1 = r5.mAborted     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0060
        L_0x005c:
            boolean r1 = r5.mPaused     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0068
        L_0x0060:
            r5.mRequestCompleted = r0     // Catch:{ all -> 0x006a }
            java.lang.Object r1 = r5.mLock     // Catch:{ all -> 0x006a }
            r1.wait()     // Catch:{ all -> 0x006a }
            goto L_0x0046
        L_0x0068:
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            goto L_0x0073
        L_0x006a:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            throw r1     // Catch:{ InterruptedException -> 0x006d }
        L_0x006d:
            r6 = move-exception
            java.lang.String r1 = "Sleeping interrupted"
            r5.loge(r1, r6)
        L_0x0073:
            boolean r6 = r5.mConnected
            if (r6 == 0) goto L_0x00a0
            int r6 = r5.mError
            if (r6 != 0) goto L_0x0096
            byte[] r6 = r7.getValue()
            if (r6 == 0) goto L_0x0095
            byte[] r6 = r7.getValue()
            int r6 = r6.length
            r1 = 2
            if (r6 >= r1) goto L_0x008a
            goto L_0x0095
        L_0x008a:
            r6 = 18
            java.lang.Integer r6 = r7.getIntValue(r6, r0)
            int r6 = r6.intValue()
            return r6
        L_0x0095:
            return r0
        L_0x0096:
            no.nordicsemi.android.dfu.internal.exception.DfuException r6 = new no.nordicsemi.android.dfu.internal.exception.DfuException
            java.lang.String r7 = "Unable to read version number"
            int r0 = r5.mError
            r6.<init>(r7, r0)
            throw r6
        L_0x00a0:
            no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException r6 = new no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException
            java.lang.String r7 = "Unable to read version number: device disconnected"
            r6.<init>(r7)
            throw r6
        L_0x00a8:
            no.nordicsemi.android.dfu.internal.exception.UploadAbortedException r6 = new no.nordicsemi.android.dfu.internal.exception.UploadAbortedException
            r6.<init>()
            throw r6
        L_0x00ae:
            no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException r6 = new no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException
            java.lang.String r7 = "Unable to read version number: device disconnected"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p691no.nordicsemi.android.dfu.LegacyButtonlessDfuImpl.readVersion(android.bluetooth.BluetoothGatt, android.bluetooth.BluetoothGattCharacteristic):int");
    }

    public boolean isClientCompatible(@NonNull Intent intent, @NonNull BluetoothGatt bluetoothGatt) {
        BluetoothGattCharacteristic characteristic;
        int i;
        BluetoothGattService service = bluetoothGatt.getService(DFU_SERVICE_UUID);
        if (service == null || (characteristic = service.getCharacteristic(DFU_CONTROL_POINT_UUID)) == null || characteristic.getDescriptor(BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG) == null) {
            return false;
        }
        this.mControlPointCharacteristic = characteristic;
        this.mProgressInfo.setProgress(-2);
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(DFU_VERSION_UUID);
        if (characteristic2 != null) {
            i = readVersion(bluetoothGatt, characteristic2);
            this.mVersion = i;
            int i2 = i & 15;
            int i3 = i >> 8;
            logi("Version number read: " + i3 + MAPCookie.DOT + i2 + " -> " + getVersionFeatures(i));
            DfuBaseService dfuBaseService = this.mService;
            StringBuilder sb = new StringBuilder();
            sb.append("Version number read: ");
            sb.append(i3);
            sb.append(MAPCookie.DOT);
            sb.append(i2);
            dfuBaseService.sendLogBroadcast(10, sb.toString());
        } else {
            logi("No DFU Version characteristic found -> " + getVersionFeatures(0));
            this.mService.sendLogBroadcast(10, "DFU Version characteristic not found");
            i = 0;
        }
        boolean z = PreferenceManager.getDefaultSharedPreferences(this.mService).getBoolean(DfuSettingsConstants.SETTINGS_ASSUME_DFU_NODE, false);
        if (intent.hasExtra(DfuBaseService.EXTRA_FORCE_DFU)) {
            z = intent.getBooleanExtra(DfuBaseService.EXTRA_FORCE_DFU, false);
        }
        boolean z2 = bluetoothGatt.getServices().size() > 3;
        if (i == 0 && z2) {
            logi("Additional services found -> Bootloader from SDK 6.1. Updating SD and BL supported, extended init packet not supported");
        }
        if (i == 1 || (!z && i == 0 && z2)) {
            return true;
        }
        return false;
    }

    public void performDfu(@NonNull Intent intent) {
        logw("Application with legacy buttonless update found");
        this.mService.sendLogBroadcast(15, "Application with buttonless update found");
        boolean z = true;
        this.mService.sendLogBroadcast(1, "Jumping to the DFU Bootloader...");
        if (intent.hasExtra(DfuBaseService.EXTRA_MTU) && Build.VERSION.SDK_INT >= 21) {
            int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_MTU, 517);
            logi("Requesting MTU = " + intExtra);
            requestMtu(intExtra);
        }
        enableCCCD(this.mControlPointCharacteristic, 1);
        this.mService.sendLogBroadcast(10, "Notifications enabled");
        this.mProgressInfo.setProgress(-3);
        logi("Sending Start DFU command (Op Code = 1, Upload Mode = 4)");
        writeOpCode(this.mControlPointCharacteristic, OP_CODE_ENTER_BOOTLOADER, true);
        this.mService.sendLogBroadcast(10, "Jump to bootloader sent (Op Code = 1, Upload Mode = 4)");
        BluetoothGatt bluetoothGatt = this.mGatt;
        boolean booleanExtra = intent.getBooleanExtra(DfuBaseService.EXTRA_FORCE_SCANNING_FOR_BOOTLOADER_IN_LEGACY_DFU, false);
        if (booleanExtra || this.mVersion == 0) {
            this.mService.disconnect(bluetoothGatt);
        } else {
            this.mService.waitUntilDisconnected();
            this.mService.sendLogBroadcast(5, "Disconnected by the remote device");
        }
        logi("Device disconnected");
        if (!booleanExtra && this.mVersion != 0) {
            z = false;
        }
        finalize(intent, false, z);
    }
}
