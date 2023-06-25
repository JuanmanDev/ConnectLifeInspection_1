package p691no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Intent;
import androidx.annotation.NonNull;
import p691no.nordicsemi.android.dfu.internal.exception.UnknownResponseException;

/* renamed from: no.nordicsemi.android.dfu.ButtonlessDfuImpl */
public abstract class ButtonlessDfuImpl extends BaseButtonlessDfuImpl {
    public static final int DFU_STATUS_SUCCESS = 1;
    public static final byte[] OP_CODE_ENTER_BOOTLOADER = {1};
    public static final int OP_CODE_ENTER_BOOTLOADER_KEY = 1;
    public static final int OP_CODE_RESPONSE_CODE_KEY = 32;

    public ButtonlessDfuImpl(@NonNull Intent intent, @NonNull DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
    }

    private int getStatusCode(byte[] bArr, int i) {
        if (bArr != null && bArr.length >= 3 && bArr[0] == 32 && bArr[1] == i && (bArr[2] == 1 || bArr[2] == 2 || bArr[2] == 4)) {
            return bArr[2];
        }
        throw new UnknownResponseException("Invalid response received", bArr, 32, i);
    }

    public abstract BluetoothGattCharacteristic getButtonlessDfuCharacteristic();

    public abstract int getResponseType();

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4 = r12.mReceivedData;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x006d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void performDfu(@androidx.annotation.NonNull android.content.Intent r13) {
        /*
            r12 = this;
            java.lang.String r0 = ")"
            java.lang.String r1 = ", Status = "
            java.lang.String r2 = "Response received (Op Code = "
            no.nordicsemi.android.dfu.DfuProgressInfo r3 = r12.mProgressInfo
            r4 = -2
            r3.setProgress(r4)
            android.bluetooth.BluetoothGatt r3 = r12.mGatt
            no.nordicsemi.android.dfu.DfuBaseService r4 = r12.mService
            r5 = 15
            java.lang.String r6 = "Application with buttonless update found"
            r4.sendLogBroadcast(r5, r6)
            no.nordicsemi.android.dfu.DfuBaseService r4 = r12.mService
            r5 = 1
            java.lang.String r6 = "Jumping to the DFU Bootloader..."
            r4.sendLogBroadcast(r5, r6)
            android.bluetooth.BluetoothGattCharacteristic r4 = r12.getButtonlessDfuCharacteristic()
            int r6 = r12.getResponseType()
            int r7 = r12.getResponseType()
            r12.enableCCCD(r4, r7)
            no.nordicsemi.android.dfu.DfuBaseService r7 = r12.mService
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 2
            if (r6 != r9) goto L_0x003b
            java.lang.String r6 = "Indications"
            goto L_0x003d
        L_0x003b:
            java.lang.String r6 = "Notifications"
        L_0x003d:
            r8.append(r6)
            java.lang.String r6 = " enabled"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r8 = 10
            r7.sendLogBroadcast(r8, r6)
            r6 = 0
            r7 = 20
            no.nordicsemi.android.dfu.DfuProgressInfo r9 = r12.mProgressInfo     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r10 = -3
            r9.setProgress(r10)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            java.lang.String r9 = "Sending Enter Bootloader (Op Code = 1)"
            r12.logi(r9)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            byte[] r9 = OP_CODE_ENTER_BOOTLOADER     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r12.writeOpCode(r4, r9, r5)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            no.nordicsemi.android.dfu.DfuBaseService r4 = r12.mService     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            java.lang.String r9 = "Enter bootloader sent (Op Code = 1)"
            r4.sendLogBroadcast(r8, r9)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            byte[] r4 = r12.readNotificationResponse()     // Catch:{ DeviceDisconnectedException -> 0x006d }
            goto L_0x006f
        L_0x006d:
            byte[] r4 = r12.mReceivedData     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
        L_0x006f:
            if (r4 == 0) goto L_0x00da
            int r9 = r12.getStatusCode(r4, r5)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r10.<init>()     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r10.append(r2)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            byte r11 = r4[r5]     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r10.append(r11)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r10.append(r1)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r10.append(r9)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r10.append(r0)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            java.lang.String r10 = r10.toString()     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r12.logi(r10)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            no.nordicsemi.android.dfu.DfuBaseService r10 = r12.mService     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r11.<init>()     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r11.append(r2)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            byte r2 = r4[r5]     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r11.append(r2)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r11.append(r1)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r11.append(r9)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r11.append(r0)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            java.lang.String r0 = r11.toString()     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r10.sendLogBroadcast(r8, r0)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            if (r9 != r5) goto L_0x00d2
            boolean r0 = r12.shouldScanForBootloader()     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            if (r0 == 0) goto L_0x00bf
            no.nordicsemi.android.dfu.DfuBaseService r0 = r12.mService     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r0.disconnect(r3)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            goto L_0x00cc
        L_0x00bf:
            no.nordicsemi.android.dfu.DfuBaseService r0 = r12.mService     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r0.waitUntilDisconnected()     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            no.nordicsemi.android.dfu.DfuBaseService r0 = r12.mService     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r1 = 5
            java.lang.String r2 = "Disconnected by the remote device"
            r0.sendLogBroadcast(r1, r2)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
        L_0x00cc:
            java.lang.String r0 = "Device disconnected"
            r12.logi(r0)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            goto L_0x00df
        L_0x00d2:
            no.nordicsemi.android.dfu.internal.exception.RemoteDfuException r13 = new no.nordicsemi.android.dfu.internal.exception.RemoteDfuException     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            java.lang.String r0 = "Device returned error after sending Enter Bootloader"
            r13.<init>(r0, r9)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            throw r13     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
        L_0x00da:
            java.lang.String r0 = "Device disconnected before receiving notification"
            r12.logi(r0)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
        L_0x00df:
            boolean r0 = r12.shouldScanForBootloader()     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            r12.finalize(r13, r6, r0)     // Catch:{ UnknownResponseException -> 0x0112, RemoteDfuException -> 0x00e7 }
            goto L_0x012a
        L_0x00e7:
            r13 = move-exception
            int r0 = r13.getErrorNumber()
            r0 = r0 | 2048(0x800, float:2.87E-42)
            java.lang.String r13 = r13.getMessage()
            r12.loge(r13)
            no.nordicsemi.android.dfu.DfuBaseService r13 = r12.mService
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r4 = p641l.p642a.p643a.p647b.C9601c.m25763b(r0)
            r2[r6] = r4
            java.lang.String r4 = "Remote DFU error: %s"
            java.lang.String r1 = java.lang.String.format(r1, r4, r2)
            r13.sendLogBroadcast(r7, r1)
            no.nordicsemi.android.dfu.DfuBaseService r13 = r12.mService
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r13.terminateConnection(r3, r0)
            goto L_0x012a
        L_0x0112:
            r13 = move-exception
            java.lang.String r0 = r13.getMessage()
            r12.loge(r0)
            no.nordicsemi.android.dfu.DfuBaseService r0 = r12.mService
            java.lang.String r13 = r13.getMessage()
            r0.sendLogBroadcast(r7, r13)
            no.nordicsemi.android.dfu.DfuBaseService r13 = r12.mService
            r0 = 4104(0x1008, float:5.751E-42)
            r13.terminateConnection(r3, r0)
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p691no.nordicsemi.android.dfu.ButtonlessDfuImpl.performDfu(android.content.Intent):void");
    }

    public abstract boolean shouldScanForBootloader();
}
