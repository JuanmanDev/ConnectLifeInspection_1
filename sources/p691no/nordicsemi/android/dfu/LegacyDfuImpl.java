package p691no.nordicsemi.android.dfu;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.UUID;
import p691no.nordicsemi.android.dfu.BaseCustomDfuImpl;
import p691no.nordicsemi.android.dfu.internal.exception.UnknownResponseException;

@SuppressLint({"MissingPermission"})
/* renamed from: no.nordicsemi.android.dfu.LegacyDfuImpl */
public class LegacyDfuImpl extends BaseCustomDfuImpl {
    public static final UUID DEFAULT_DFU_CONTROL_POINT_UUID = new UUID(23300500811742L, 1523193452336828707L);
    public static final UUID DEFAULT_DFU_PACKET_UUID = new UUID(23304795779038L, 1523193452336828707L);
    public static final UUID DEFAULT_DFU_SERVICE_UUID = new UUID(23296205844446L, 1523193452336828707L);
    public static final UUID DEFAULT_DFU_VERSION_UUID;
    public static UUID DFU_CONTROL_POINT_UUID = DEFAULT_DFU_CONTROL_POINT_UUID;
    public static UUID DFU_PACKET_UUID = DEFAULT_DFU_PACKET_UUID;
    public static UUID DFU_SERVICE_UUID = DEFAULT_DFU_SERVICE_UUID;
    public static final int DFU_STATUS_SUCCESS = 1;
    public static UUID DFU_VERSION_UUID = null;
    public static final byte[] OP_CODE_ACTIVATE_AND_RESET = {5};
    public static final int OP_CODE_ACTIVATE_AND_RESET_KEY = 5;
    public static final byte[] OP_CODE_INIT_DFU_PARAMS = {2};
    public static final byte[] OP_CODE_INIT_DFU_PARAMS_COMPLETE = {2, 1};
    public static final int OP_CODE_INIT_DFU_PARAMS_KEY = 2;
    public static final byte[] OP_CODE_INIT_DFU_PARAMS_START = {2, 0};
    public static final int OP_CODE_PACKET_RECEIPT_NOTIF_KEY = 17;
    public static final byte[] OP_CODE_PACKET_RECEIPT_NOTIF_REQ = {8, 0, 0};
    public static final int OP_CODE_PACKET_RECEIPT_NOTIF_REQ_KEY = 8;
    public static final byte[] OP_CODE_RECEIVE_FIRMWARE_IMAGE = {3};
    public static final int OP_CODE_RECEIVE_FIRMWARE_IMAGE_KEY = 3;
    public static final byte[] OP_CODE_RESET = {6};
    public static final int OP_CODE_RESET_KEY = 6;
    public static final int OP_CODE_RESPONSE_CODE_KEY = 16;
    public static final byte[] OP_CODE_START_DFU = {1, 0};
    public static final int OP_CODE_START_DFU_KEY = 1;
    public static final byte[] OP_CODE_START_DFU_V1 = {1};
    public static final byte[] OP_CODE_VALIDATE = {4};
    public static final int OP_CODE_VALIDATE_KEY = 4;
    public final LegacyBluetoothCallback mBluetoothCallback = new LegacyBluetoothCallback();
    public BluetoothGattCharacteristic mControlPointCharacteristic;
    public boolean mImageSizeInProgress;
    public BluetoothGattCharacteristic mPacketCharacteristic;

    /* renamed from: no.nordicsemi.android.dfu.LegacyDfuImpl$LegacyBluetoothCallback */
    public class LegacyBluetoothCallback extends BaseCustomDfuImpl.BaseCustomBluetoothCallback {
        public LegacyBluetoothCallback() {
            super();
        }

        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            if (bluetoothGattCharacteristic.getIntValue(17, 0).intValue() == 17) {
                LegacyDfuImpl.this.mProgressInfo.setBytesReceived(bluetoothGattCharacteristic.getIntValue(20, 1).intValue());
                handlePacketReceiptNotification(bluetoothGatt, bluetoothGattCharacteristic);
            } else if (!LegacyDfuImpl.this.mRemoteErrorOccurred) {
                if (bluetoothGattCharacteristic.getIntValue(17, 2).intValue() != 1) {
                    LegacyDfuImpl.this.mRemoteErrorOccurred = true;
                }
                handleNotification(bluetoothGatt, bluetoothGattCharacteristic);
            }
            LegacyDfuImpl.this.notifyLock();
        }

        public void onPacketCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (LegacyDfuImpl.this.mImageSizeInProgress) {
                DfuBaseService dfuBaseService = LegacyDfuImpl.this.mService;
                dfuBaseService.sendLogBroadcast(5, "Data written to " + bluetoothGattCharacteristic.getUuid() + ", value (0x): " + parse(bluetoothGattCharacteristic));
                boolean unused = LegacyDfuImpl.this.mImageSizeInProgress = false;
            }
        }
    }

    static {
        UUID uuid = new UUID(23313385713630L, 1523193452336828707L);
        DEFAULT_DFU_VERSION_UUID = uuid;
        DFU_VERSION_UUID = uuid;
    }

    public LegacyDfuImpl(@NonNull Intent intent, @NonNull DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
    }

    private int getStatusCode(@Nullable byte[] bArr, int i) {
        if (bArr != null && bArr.length == 3 && bArr[0] == 16 && bArr[1] == i && bArr[2] >= 1 && bArr[2] <= 6) {
            return bArr[2];
        }
        throw new UnknownResponseException("Invalid response received", bArr, 16, i);
    }

    private int readVersion(@Nullable BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic != null) {
            return bluetoothGattCharacteristic.getIntValue(18, 0).intValue();
        }
        return 0;
    }

    private void resetAndRestart(@NonNull BluetoothGatt bluetoothGatt, @NonNull Intent intent) {
        this.mService.sendLogBroadcast(15, "Last upload interrupted. Restarting device...");
        this.mProgressInfo.setProgress(-5);
        logi("Sending Reset command (Op Code = 6)");
        writeOpCode(this.mControlPointCharacteristic, OP_CODE_RESET);
        this.mService.sendLogBroadcast(10, "Reset request sent");
        this.mService.waitUntilDisconnected();
        this.mService.sendLogBroadcast(5, "Disconnected by the remote device");
        BluetoothGattService service = bluetoothGatt.getService(BaseDfuImpl.GENERIC_ATTRIBUTE_SERVICE_UUID);
        this.mService.refreshDeviceCache(bluetoothGatt, !((service == null || service.getCharacteristic(BaseDfuImpl.SERVICE_CHANGED_UUID) == null) ? false : true));
        this.mService.close(bluetoothGatt);
        logi("Restarting the service");
        Intent intent2 = new Intent();
        intent2.fillIn(intent, 24);
        restartService(intent2, false);
    }

    private void setNumberOfPackets(@NonNull byte[] bArr, int i) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void writeImageSize(@androidx.annotation.NonNull android.bluetooth.BluetoothGattCharacteristic r5, int r6) {
        /*
            r4 = this;
            r0 = 0
            r4.mReceivedData = r0
            r0 = 0
            r4.mError = r0
            r1 = 1
            r4.mImageSizeInProgress = r1
            r5.setWriteType(r1)
            r2 = 4
            byte[] r2 = new byte[r2]
            r5.setValue(r2)
            r2 = 20
            r5.setValue(r6, r2, r0)
            no.nordicsemi.android.dfu.DfuBaseService r6 = r4.mService
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Writing to characteristic "
            r2.append(r3)
            java.util.UUID r3 = r5.getUuid()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r6.sendLogBroadcast(r1, r2)
            no.nordicsemi.android.dfu.DfuBaseService r6 = r4.mService
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "gatt.writeCharacteristic("
            r1.append(r2)
            java.util.UUID r2 = r5.getUuid()
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r6.sendLogBroadcast(r0, r1)
            android.bluetooth.BluetoothGatt r6 = r4.mGatt
            r6.writeCharacteristic(r5)
            java.lang.Object r5 = r4.mLock     // Catch:{ InterruptedException -> 0x0077 }
            monitor-enter(r5)     // Catch:{ InterruptedException -> 0x0077 }
        L_0x0058:
            boolean r6 = r4.mImageSizeInProgress     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x0068
            boolean r6 = r4.mConnected     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x0068
            int r6 = r4.mError     // Catch:{ all -> 0x0074 }
            if (r6 != 0) goto L_0x0068
            boolean r6 = r4.mAborted     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x006c
        L_0x0068:
            boolean r6 = r4.mPaused     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x0072
        L_0x006c:
            java.lang.Object r6 = r4.mLock     // Catch:{ all -> 0x0074 }
            r6.wait()     // Catch:{ all -> 0x0074 }
            goto L_0x0058
        L_0x0072:
            monitor-exit(r5)     // Catch:{ all -> 0x0074 }
            goto L_0x007d
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0074 }
            throw r6     // Catch:{ InterruptedException -> 0x0077 }
        L_0x0077:
            r5 = move-exception
            java.lang.String r6 = "Sleeping interrupted"
            r4.loge(r6, r5)
        L_0x007d:
            boolean r5 = r4.mAborted
            if (r5 != 0) goto L_0x009c
            boolean r5 = r4.mConnected
            if (r5 == 0) goto L_0x0094
            int r5 = r4.mError
            if (r5 != 0) goto L_0x008a
            return
        L_0x008a:
            no.nordicsemi.android.dfu.internal.exception.DfuException r5 = new no.nordicsemi.android.dfu.internal.exception.DfuException
            java.lang.String r6 = "Unable to write Image Size"
            int r0 = r4.mError
            r5.<init>(r6, r0)
            throw r5
        L_0x0094:
            no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException r5 = new no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException
            java.lang.String r6 = "Unable to write Image Size: device disconnected"
            r5.<init>(r6)
            throw r5
        L_0x009c:
            no.nordicsemi.android.dfu.internal.exception.UploadAbortedException r5 = new no.nordicsemi.android.dfu.internal.exception.UploadAbortedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p691no.nordicsemi.android.dfu.LegacyDfuImpl.writeImageSize(android.bluetooth.BluetoothGattCharacteristic, int):void");
    }

    private void writeOpCode(@NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr) {
        boolean z = false;
        if (bArr[0] == 6 || bArr[0] == 5) {
            z = true;
        }
        writeOpCode(bluetoothGattCharacteristic, bArr, z);
    }

    public UUID getControlPointCharacteristicUUID() {
        return DFU_CONTROL_POINT_UUID;
    }

    public UUID getDfuServiceUUID() {
        return DFU_SERVICE_UUID;
    }

    public UUID getPacketCharacteristicUUID() {
        return DFU_PACKET_UUID;
    }

    public boolean isClientCompatible(@NonNull Intent intent, @NonNull BluetoothGatt bluetoothGatt) {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattService service = bluetoothGatt.getService(DFU_SERVICE_UUID);
        if (service == null || (characteristic = service.getCharacteristic(DFU_CONTROL_POINT_UUID)) == null || characteristic.getDescriptor(BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG) == null) {
            return false;
        }
        this.mControlPointCharacteristic = characteristic;
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(DFU_PACKET_UUID);
        this.mPacketCharacteristic = characteristic2;
        if (characteristic2 != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03ca, code lost:
        if (r5 == 1) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03cc, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x065f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0660, code lost:
        r2 = r0;
        loge("Disconnected while sending data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0666, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x066c, code lost:
        throw new p691no.nordicsemi.android.dfu.internal.exception.RemoteDfuException("Starting DFU failed", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x066d, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x066e, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x066f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0671, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0672, code lost:
        r3 = r0;
        r4 = "Reset request sent";
        r2 = "Sending Reset command (Op Code = 6)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0677, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0678, code lost:
        r3 = r0;
        r4 = "Reset request sent";
        r2 = "Sending Reset command (Op Code = 6)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x067d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x067e, code lost:
        r21 = "Reset request sent";
        r22 = "Sending Reset command (Op Code = 6)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0682, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x06de, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x06df, code lost:
        r4 = "Reset request sent";
        r2 = "Sending Reset command (Op Code = 6)";
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x06e2, code lost:
        loge(r3.getMessage());
        r1.mService.sendLogBroadcast(20, r3.getMessage());
        logi(r2);
        writeOpCode(r1.mControlPointCharacteristic, OP_CODE_RESET);
        r1.mService.sendLogBroadcast(10, r4);
        r1.mService.terminateConnection(r10, p691no.nordicsemi.android.dfu.DfuBaseService.ERROR_INVALID_RESPONSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x070d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x070e, code lost:
        r4 = "Reset request sent";
        r2 = "Sending Reset command (Op Code = 6)";
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0711, code lost:
        logi(r2);
        r1.mAborted = false;
        writeOpCode(r1.mControlPointCharacteristic, OP_CODE_RESET);
        r1.mService.sendLogBroadcast(10, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0725, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01f6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01f8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01f9, code lost:
        r24 = "DFU Start sent (Op Code = 1, Upload Mode = ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01fc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01fd, code lost:
        r3 = r0;
        r4 = r21;
        r2 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0204, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0205, code lost:
        r3 = r0;
        r4 = r21;
        r2 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x021b, code lost:
        if (r20 <= 0) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0221, code lost:
        r1.mRemoteErrorOccurred = false;
        r3 = r23;
        logw(r3);
        r1.mService.sendLogBroadcast(15, r3);
        r5 = r5 & -5;
        r1.mFileType = r5;
        OP_CODE_START_DFU[1] = (byte) r5;
        r1.mProgressInfo.setTotalPart(2);
        ((p691no.nordicsemi.android.dfu.internal.ArchiveInputStream) r1.mFirmwareStream).setContentType(r5);
        r1.mService.sendLogBroadcast(1, "Sending only SD/BL");
        logi("Resending Start DFU command (Op Code = 1, Upload Mode = " + r5 + ")");
        writeOpCode(r1.mControlPointCharacteristic, OP_CODE_START_DFU);
        r3 = r1.mService;
        r3.sendLogBroadcast(10, r24 + r5 + ")");
        logi("Sending image size array to DFU Packet: [" + r14 + "b, " + r8 + "b, " + 0 + "b]");
        writeImageSize(r1.mPacketCharacteristic, r14, r8, 0);
        r3 = r1.mService;
        r3.sendLogBroadcast(10, "Firmware image size sent [" + r14 + "b, " + r8 + "b, " + 0 + "b]");
        r3 = readNotificationResponse();
        r8 = getStatusCode(r3, 1);
        r9 = r1.mService;
        r9.sendLogBroadcast(10, "Response received (Op Code = " + r3[1] + " Status = " + r8 + ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0309, code lost:
        if (r8 == 2) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x030b, code lost:
        resetAndRestart(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x030e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0310, code lost:
        if (r8 != 1) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x031c, code lost:
        throw new p691no.nordicsemi.android.dfu.internal.exception.RemoteDfuException("Starting DFU failed", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x031d, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x031e, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x031f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0320, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0326, code lost:
        if (r3.getErrorNumber() == 3) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0329, code lost:
        if (r5 == 4) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x032b, code lost:
        r1.mRemoteErrorOccurred = false;
        r3 = r17;
        logw(r3);
        r1.mService.sendLogBroadcast(15, r3);
        r1.mService.sendLogBroadcast(1, "Switching to DFU v.1");
        logi("Resending Start DFU command (Op Code = 1)");
        writeOpCode(r1.mControlPointCharacteristic, OP_CODE_START_DFU_V1);
        r1.mService.sendLogBroadcast(10, "DFU Start sent (Op Code = 1)");
        logi("Sending application image size to DFU Packet: " + r1.mImageSizeInBytes + " bytes");
        writeImageSize(r1.mPacketCharacteristic, r1.mImageSizeInBytes);
        r3 = r1.mService;
        r3.sendLogBroadcast(10, "Firmware image size sent (" + r1.mImageSizeInBytes + " bytes)");
        r3 = readNotificationResponse();
        r5 = getStatusCode(r3, 1);
        r6 = r1.mService;
        r8 = new java.lang.StringBuilder();
        r8.append("Response received (Op Code = ");
        r8.append(r3[1]);
        r3 = r16;
        r8.append(r3);
        r8.append(r5);
        r8.append(")");
        r6.sendLogBroadcast(10, r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x03c3, code lost:
        if (r5 == 2) goto L_0x03c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03c5, code lost:
        resetAndRestart(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03c8, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x03d1 A[Catch:{ DeviceDisconnectedException -> 0x065f, RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0485 A[Catch:{ DeviceDisconnectedException -> 0x065f, RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0497 A[Catch:{ DeviceDisconnectedException -> 0x065f, RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0567 A[Catch:{ DeviceDisconnectedException -> 0x065f, RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0657 A[Catch:{ DeviceDisconnectedException -> 0x065f, RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0671 A[ExcHandler: UnknownResponseException (r0v5 'e' no.nordicsemi.android.dfu.internal.exception.UnknownResponseException A[CUSTOM_DECLARE]), Splitter:B:15:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0677 A[ExcHandler: UploadAbortedException (r0v4 'e' no.nordicsemi.android.dfu.internal.exception.UploadAbortedException A[CUSTOM_DECLARE]), Splitter:B:15:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x067d A[ExcHandler: RemoteDfuException (e no.nordicsemi.android.dfu.internal.exception.RemoteDfuException), Splitter:B:13:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01fc A[ExcHandler: UnknownResponseException (r0v12 'e' no.nordicsemi.android.dfu.internal.exception.UnknownResponseException A[CUSTOM_DECLARE]), Splitter:B:45:0x0127] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0204 A[ExcHandler: UploadAbortedException (r0v11 'e' no.nordicsemi.android.dfu.internal.exception.UploadAbortedException A[CUSTOM_DECLARE]), Splitter:B:45:0x0127] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x021b A[Catch:{ DeviceDisconnectedException -> 0x065f, RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x031e A[Catch:{ DeviceDisconnectedException -> 0x065f, RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void performDfu(@androidx.annotation.NonNull android.content.Intent r28) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            java.lang.String r3 = "b)"
            java.lang.String r4 = "DFU Start sent (Op Code = 1, Upload Mode = "
            java.lang.String r5 = "DFU target does not support DFU v.2"
            java.lang.String r6 = "DFU target does not support (SD/BL)+App update"
            java.lang.String r7 = "Starting DFU failed"
            java.lang.String r8 = "Reset request sent"
            java.lang.String r9 = "Sending Reset command (Op Code = 6)"
            java.lang.String r10 = ", Status = "
            java.lang.String r11 = "Response received (Op Code = "
            java.lang.String r12 = "b, "
            java.lang.String r13 = ")"
            java.lang.String r14 = "Legacy DFU bootloader found"
            r1.logw(r14)
            no.nordicsemi.android.dfu.DfuProgressInfo r14 = r1.mProgressInfo
            r15 = -2
            r14.setProgress(r15)
            java.lang.String r14 = "no.nordicsemi.android.dfu.extra.EXTRA_MTU"
            boolean r15 = r2.hasExtra(r14)
            if (r15 == 0) goto L_0x0053
            int r15 = android.os.Build.VERSION.SDK_INT
            r16 = r10
            r10 = 21
            if (r15 < r10) goto L_0x0055
            r10 = 517(0x205, float:7.24E-43)
            int r10 = r2.getIntExtra(r14, r10)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Requesting MTU = "
            r14.append(r15)
            r14.append(r10)
            java.lang.String r14 = r14.toString()
            r1.logi(r14)
            r1.requestMtu(r10)
            goto L_0x0055
        L_0x0053:
            r16 = r10
        L_0x0055:
            android.bluetooth.BluetoothGatt r10 = r1.mGatt
            java.util.UUID r14 = DFU_SERVICE_UUID
            android.bluetooth.BluetoothGattService r14 = r10.getService(r14)
            java.util.UUID r15 = DFU_VERSION_UUID
            android.bluetooth.BluetoothGattCharacteristic r14 = r14.getCharacteristic(r15)
            int r14 = r1.readVersion(r14)
            r15 = 5
            r17 = r5
            r5 = 20
            if (r14 < r15) goto L_0x0095
            java.io.InputStream r15 = r1.mInitPacketStream
            if (r15 != 0) goto L_0x0095
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Init packet not set for the DFU Bootloader version "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r1.logw(r2)
            no.nordicsemi.android.dfu.DfuBaseService r2 = r1.mService
            java.lang.String r3 = "The Init packet is required by this version DFU Bootloader"
            r2.sendLogBroadcast(r5, r3)
            no.nordicsemi.android.dfu.DfuBaseService r2 = r1.mService
            r3 = 4107(0x100b, float:5.755E-42)
            r2.terminateConnection(r10, r3)
            return
        L_0x0095:
            r15 = 1
            android.bluetooth.BluetoothGattCharacteristic r5 = r1.mControlPointCharacteristic     // Catch:{ UploadAbortedException -> 0x070d, UnknownResponseException -> 0x06de, RemoteDfuException -> 0x067d }
            r1.enableCCCD(r5, r15)     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x067d }
            no.nordicsemi.android.dfu.DfuBaseService r5 = r1.mService     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x067d }
            java.lang.String r15 = "Notifications enabled"
            r19 = r14
            r14 = 10
            r5.sendLogBroadcast(r14, r15)     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x067d }
            int r5 = r1.mFileType     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x067d }
            r14 = r5 & 1
            if (r14 <= 0) goto L_0x00b7
            int r14 = r1.mImageSizeInBytes     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            goto L_0x00b8
        L_0x00af:
            r0 = move-exception
            r2 = r0
            r21 = r8
            r22 = r9
            goto L_0x0683
        L_0x00b7:
            r14 = 0
        L_0x00b8:
            r15 = r5 & 2
            if (r15 <= 0) goto L_0x00bf
            int r15 = r1.mImageSizeInBytes     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            goto L_0x00c0
        L_0x00bf:
            r15 = 0
        L_0x00c0:
            r20 = r5 & 4
            if (r20 <= 0) goto L_0x00cb
            r21 = r14
            int r14 = r1.mImageSizeInBytes     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            r22 = r14
            goto L_0x00cf
        L_0x00cb:
            r21 = r14
            r22 = 0
        L_0x00cf:
            java.io.InputStream r14 = r1.mFirmwareStream     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x067d }
            boolean r14 = r14 instanceof p691no.nordicsemi.android.dfu.internal.ArchiveInputStream     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x067d }
            if (r14 == 0) goto L_0x011e
            java.io.InputStream r14 = r1.mFirmwareStream     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            no.nordicsemi.android.dfu.internal.ArchiveInputStream r14 = (p691no.nordicsemi.android.dfu.internal.ArchiveInputStream) r14     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            boolean r15 = r14.isSecureDfuRequired()     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            if (r15 == 0) goto L_0x0106
            java.lang.String r2 = "Secure DFU is required to upload selected firmware"
            r1.loge(r2)     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            no.nordicsemi.android.dfu.DfuBaseService r2 = r1.mService     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            java.lang.String r3 = "The device does not support given firmware."
            r4 = 20
            r2.sendLogBroadcast(r4, r3)     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            r1.logi(r9)     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            android.bluetooth.BluetoothGattCharacteristic r2 = r1.mControlPointCharacteristic     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            byte[] r3 = OP_CODE_RESET     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            r1.writeOpCode(r2, r3)     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            no.nordicsemi.android.dfu.DfuBaseService r2 = r1.mService     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            r3 = 10
            r2.sendLogBroadcast(r3, r8)     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            no.nordicsemi.android.dfu.DfuBaseService r2 = r1.mService     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            r3 = 4099(0x1003, float:5.744E-42)
            r2.terminateConnection(r10, r3)     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            return
        L_0x0106:
            int r15 = r14.softDeviceImageSize()     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            int r21 = r14.bootloaderImageSize()     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            int r14 = r14.applicationImageSize()     // Catch:{ UploadAbortedException -> 0x0677, UnknownResponseException -> 0x0671, RemoteDfuException -> 0x00af }
            r25 = r21
            r21 = r8
            r8 = r25
            r26 = r15
            r15 = r14
            r14 = r26
            goto L_0x0125
        L_0x011e:
            r14 = r21
            r21 = r8
            r8 = r15
            r15 = r22
        L_0x0125:
            r22 = r9
            byte[] r23 = OP_CODE_START_DFU     // Catch:{ RemoteDfuException -> 0x020c, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            byte r9 = (byte) r5     // Catch:{ RemoteDfuException -> 0x020c, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r18 = 1
            r23[r18] = r9     // Catch:{ RemoteDfuException -> 0x020c, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ RemoteDfuException -> 0x020c, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r9.<init>()     // Catch:{ RemoteDfuException -> 0x020c, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r23 = r6
            java.lang.String r6 = "Sending Start DFU command (Op Code = 1, Upload Mode = "
            r9.append(r6)     // Catch:{ RemoteDfuException -> 0x01f8, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r9.append(r5)     // Catch:{ RemoteDfuException -> 0x01f8, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r9.append(r13)     // Catch:{ RemoteDfuException -> 0x01f8, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r6 = r9.toString()     // Catch:{ RemoteDfuException -> 0x01f8, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r1.logi(r6)     // Catch:{ RemoteDfuException -> 0x01f8, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            android.bluetooth.BluetoothGattCharacteristic r6 = r1.mControlPointCharacteristic     // Catch:{ RemoteDfuException -> 0x01f8, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            byte[] r9 = OP_CODE_START_DFU     // Catch:{ RemoteDfuException -> 0x01f8, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r1.writeOpCode(r6, r9)     // Catch:{ RemoteDfuException -> 0x01f8, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            no.nordicsemi.android.dfu.DfuBaseService r6 = r1.mService     // Catch:{ RemoteDfuException -> 0x01f8, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ RemoteDfuException -> 0x01f8, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r9.<init>()     // Catch:{ RemoteDfuException -> 0x01f8, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r9.append(r4)     // Catch:{ RemoteDfuException -> 0x01f8, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r9.append(r5)     // Catch:{ RemoteDfuException -> 0x01f8, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r9.append(r13)     // Catch:{ RemoteDfuException -> 0x01f8, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r9 = r9.toString()     // Catch:{ RemoteDfuException -> 0x01f8, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r24 = r4
            r4 = 10
            r6.sendLogBroadcast(r4, r9)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r4.<init>()     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r6 = "Sending image size array to DFU Packet ("
            r4.append(r6)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r4.append(r14)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r4.append(r12)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r4.append(r8)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r4.append(r12)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r4.append(r15)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r4.append(r3)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r4 = r4.toString()     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r1.logi(r4)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            android.bluetooth.BluetoothGattCharacteristic r4 = r1.mPacketCharacteristic     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r1.writeImageSize(r4, r14, r8, r15)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            no.nordicsemi.android.dfu.DfuBaseService r4 = r1.mService     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6.<init>()     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r9 = "Firmware image size sent ("
            r6.append(r9)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6.append(r14)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6.append(r12)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6.append(r8)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6.append(r12)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6.append(r15)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6.append(r3)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r3 = r6.toString()     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6 = 10
            r4.sendLogBroadcast(r6, r3)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            byte[] r3 = r27.readNotificationResponse()     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r4 = 1
            int r6 = r1.getStatusCode(r3, r4)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            no.nordicsemi.android.dfu.DfuBaseService r9 = r1.mService     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r15.<init>()     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r15.append(r11)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            byte r3 = r3[r4]     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r15.append(r3)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r3 = " Status = "
            r15.append(r3)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r15.append(r6)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r15.append(r13)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r3 = r15.toString()     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r4 = 10
            r9.sendLogBroadcast(r4, r3)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r3 = 2
            if (r6 != r3) goto L_0x01eb
            r1.resetAndRestart(r10, r2)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            return
        L_0x01eb:
            r3 = 1
            if (r6 != r3) goto L_0x01f0
            goto L_0x0312
        L_0x01f0:
            no.nordicsemi.android.dfu.internal.exception.RemoteDfuException r3 = new no.nordicsemi.android.dfu.internal.exception.RemoteDfuException     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r3.<init>(r7, r6)     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            throw r3     // Catch:{ RemoteDfuException -> 0x01f6, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
        L_0x01f6:
            r0 = move-exception
            goto L_0x0211
        L_0x01f8:
            r0 = move-exception
            r24 = r4
            goto L_0x0211
        L_0x01fc:
            r0 = move-exception
            r3 = r0
            r4 = r21
            r2 = r22
            goto L_0x06e2
        L_0x0204:
            r0 = move-exception
            r3 = r0
            r4 = r21
            r2 = r22
            goto L_0x0711
        L_0x020c:
            r0 = move-exception
            r24 = r4
            r23 = r6
        L_0x0211:
            r3 = r0
            r4 = 15
            int r6 = r3.getErrorNumber()     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r9 = 3
            if (r6 != r9) goto L_0x031e
            if (r20 <= 0) goto L_0x031d
            r6 = r5 & 3
            if (r6 <= 0) goto L_0x031d
            r6 = 0
            r1.mRemoteErrorOccurred = r6     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r3 = r23
            r1.logw(r3)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            no.nordicsemi.android.dfu.DfuBaseService r6 = r1.mService     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6.sendLogBroadcast(r4, r3)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r5 = r5 & -5
            r1.mFileType = r5     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            byte[] r3 = OP_CODE_START_DFU     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            byte r6 = (byte) r5     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r9 = 1
            r3[r9] = r6     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            no.nordicsemi.android.dfu.DfuProgressInfo r3 = r1.mProgressInfo     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6 = 2
            r3.setTotalPart(r6)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.io.InputStream r3 = r1.mFirmwareStream     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            no.nordicsemi.android.dfu.internal.ArchiveInputStream r3 = (p691no.nordicsemi.android.dfu.internal.ArchiveInputStream) r3     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r3.setContentType(r5)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            no.nordicsemi.android.dfu.DfuBaseService r3 = r1.mService     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r6 = "Sending only SD/BL"
            r9 = 1
            r3.sendLogBroadcast(r9, r6)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r3.<init>()     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r6 = "Resending Start DFU command (Op Code = 1, Upload Mode = "
            r3.append(r6)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r3.append(r5)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r3.append(r13)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r3 = r3.toString()     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r1.logi(r3)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            android.bluetooth.BluetoothGattCharacteristic r3 = r1.mControlPointCharacteristic     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            byte[] r6 = OP_CODE_START_DFU     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r1.writeOpCode(r3, r6)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            no.nordicsemi.android.dfu.DfuBaseService r3 = r1.mService     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6.<init>()     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r9 = r24
            r6.append(r9)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6.append(r5)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6.append(r13)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r6 = r6.toString()     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r9 = 10
            r3.sendLogBroadcast(r9, r6)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r3.<init>()     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r6 = "Sending image size array to DFU Packet: ["
            r3.append(r6)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r3.append(r14)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r3.append(r12)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r3.append(r8)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r3.append(r12)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6 = 0
            r3.append(r6)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r6 = "b]"
            r3.append(r6)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r3 = r3.toString()     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r1.logi(r3)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            android.bluetooth.BluetoothGattCharacteristic r3 = r1.mPacketCharacteristic     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6 = 0
            r1.writeImageSize(r3, r14, r8, r6)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            no.nordicsemi.android.dfu.DfuBaseService r3 = r1.mService     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6.<init>()     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r9 = "Firmware image size sent ["
            r6.append(r9)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6.append(r14)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6.append(r12)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6.append(r8)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6.append(r12)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r8 = 0
            r6.append(r8)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r8 = "b]"
            r6.append(r8)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r6 = r6.toString()     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r8 = 10
            r3.sendLogBroadcast(r8, r6)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            byte[] r3 = r27.readNotificationResponse()     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6 = 1
            int r8 = r1.getStatusCode(r3, r6)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            no.nordicsemi.android.dfu.DfuBaseService r9 = r1.mService     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r12.<init>()     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r12.append(r11)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            byte r3 = r3[r6]     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r12.append(r3)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r3 = " Status = "
            r12.append(r3)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r12.append(r8)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r12.append(r13)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            java.lang.String r3 = r12.toString()     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r6 = 10
            r9.sendLogBroadcast(r6, r3)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r3 = 2
            if (r8 != r3) goto L_0x030f
            r1.resetAndRestart(r10, r2)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            return
        L_0x030f:
            r3 = 1
            if (r8 != r3) goto L_0x0317
        L_0x0312:
            r3 = r16
            r4 = 1
            goto L_0x03cd
        L_0x0317:
            no.nordicsemi.android.dfu.internal.exception.RemoteDfuException r3 = new no.nordicsemi.android.dfu.internal.exception.RemoteDfuException     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            r3.<init>(r7, r8)     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
            throw r3     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
        L_0x031d:
            throw r3     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
        L_0x031e:
            throw r3     // Catch:{ RemoteDfuException -> 0x031f, UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc }
        L_0x031f:
            r0 = move-exception
            r3 = r0
            int r6 = r3.getErrorNumber()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r8 = 3
            if (r6 != r8) goto L_0x066e
            r6 = 4
            if (r5 != r6) goto L_0x066d
            r5 = 0
            r1.mRemoteErrorOccurred = r5     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r3 = r17
            r1.logw(r3)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            no.nordicsemi.android.dfu.DfuBaseService r5 = r1.mService     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r5.sendLogBroadcast(r4, r3)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            no.nordicsemi.android.dfu.DfuBaseService r3 = r1.mService     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r4 = "Switching to DFU v.1"
            r5 = 1
            r3.sendLogBroadcast(r5, r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r3 = "Resending Start DFU command (Op Code = 1)"
            r1.logi(r3)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            android.bluetooth.BluetoothGattCharacteristic r3 = r1.mControlPointCharacteristic     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            byte[] r4 = OP_CODE_START_DFU_V1     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r1.writeOpCode(r3, r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            no.nordicsemi.android.dfu.DfuBaseService r3 = r1.mService     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r4 = "DFU Start sent (Op Code = 1)"
            r5 = 10
            r3.sendLogBroadcast(r5, r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r3.<init>()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r4 = "Sending application image size to DFU Packet: "
            r3.append(r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            int r4 = r1.mImageSizeInBytes     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r3.append(r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r4 = " bytes"
            r3.append(r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r3 = r3.toString()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r1.logi(r3)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            android.bluetooth.BluetoothGattCharacteristic r3 = r1.mPacketCharacteristic     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            int r4 = r1.mImageSizeInBytes     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r1.writeImageSize(r3, r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            no.nordicsemi.android.dfu.DfuBaseService r3 = r1.mService     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r4.<init>()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r5 = "Firmware image size sent ("
            r4.append(r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            int r5 = r1.mImageSizeInBytes     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r4.append(r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r5 = " bytes)"
            r4.append(r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r4 = r4.toString()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r5 = 10
            r3.sendLogBroadcast(r5, r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            byte[] r3 = r27.readNotificationResponse()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r4 = 1
            int r5 = r1.getStatusCode(r3, r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            no.nordicsemi.android.dfu.DfuBaseService r6 = r1.mService     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r8.<init>()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r8.append(r11)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            byte r3 = r3[r4]     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r8.append(r3)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r3 = r16
            r8.append(r3)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r8.append(r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r8.append(r13)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r4 = r8.toString()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r8 = 10
            r6.sendLogBroadcast(r8, r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r4 = 2
            if (r5 != r4) goto L_0x03c9
            r1.resetAndRestart(r10, r2)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            return
        L_0x03c9:
            r4 = 1
            if (r5 != r4) goto L_0x0667
            r4 = 0
        L_0x03cd:
            java.io.InputStream r5 = r1.mInitPacketStream     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            if (r5 == 0) goto L_0x0483
            no.nordicsemi.android.dfu.DfuBaseService r5 = r1.mService     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r6 = "Writing Initialize DFU Parameters..."
            r7 = 10
            r5.sendLogBroadcast(r7, r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            if (r4 == 0) goto L_0x041f
            java.lang.String r5 = "Sending the Initialize DFU Parameters START (Op Code = 2, Value = 0)"
            r1.logi(r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            android.bluetooth.BluetoothGattCharacteristic r5 = r1.mControlPointCharacteristic     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            byte[] r6 = OP_CODE_INIT_DFU_PARAMS_START     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r1.writeOpCode(r5, r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r5.<init>()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r6 = "Sending "
            r5.append(r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            int r6 = r1.mInitPacketSizeInBytes     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r5.append(r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r6 = " bytes of init packet"
            r5.append(r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r5 = r5.toString()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r1.logi(r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            android.bluetooth.BluetoothGattCharacteristic r5 = r1.mPacketCharacteristic     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r6 = 0
            r1.writeInitData(r5, r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r5 = "Sending the Initialize DFU Parameters COMPLETE (Op Code = 2, Value = 1)"
            r1.logi(r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            android.bluetooth.BluetoothGattCharacteristic r5 = r1.mControlPointCharacteristic     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            byte[] r6 = OP_CODE_INIT_DFU_PARAMS_COMPLETE     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r1.writeOpCode(r5, r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            no.nordicsemi.android.dfu.DfuBaseService r5 = r1.mService     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r6 = "Initialize DFU Parameters completed"
            r7 = 10
            r5.sendLogBroadcast(r7, r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            goto L_0x044c
        L_0x041f:
            java.lang.String r5 = "Sending the Initialize DFU Parameters (Op Code = 2)"
            r1.logi(r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            android.bluetooth.BluetoothGattCharacteristic r5 = r1.mControlPointCharacteristic     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            byte[] r6 = OP_CODE_INIT_DFU_PARAMS     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r1.writeOpCode(r5, r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r5.<init>()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r6 = "Sending "
            r5.append(r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            int r6 = r1.mInitPacketSizeInBytes     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r5.append(r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r6 = " bytes of init packet"
            r5.append(r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r5 = r5.toString()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r1.logi(r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            android.bluetooth.BluetoothGattCharacteristic r5 = r1.mPacketCharacteristic     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r6 = 0
            r1.writeInitData(r5, r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
        L_0x044c:
            byte[] r5 = r27.readNotificationResponse()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r6 = 2
            int r7 = r1.getStatusCode(r5, r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            no.nordicsemi.android.dfu.DfuBaseService r6 = r1.mService     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r8.<init>()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r8.append(r11)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r9 = 1
            byte r5 = r5[r9]     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r8.append(r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r8.append(r3)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r8.append(r7)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r8.append(r13)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r5 = r8.toString()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r8 = 10
            r6.sendLogBroadcast(r8, r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r5 = 1
            if (r7 != r5) goto L_0x047b
            goto L_0x0483
        L_0x047b:
            no.nordicsemi.android.dfu.internal.exception.RemoteDfuException r2 = new no.nordicsemi.android.dfu.internal.exception.RemoteDfuException     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r3 = "Device returned error after sending init packet"
            r2.<init>(r3, r7)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            throw r2     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
        L_0x0483:
            if (r4 != 0) goto L_0x0493
            int r4 = r1.mPacketsBeforeNotification     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            if (r4 <= 0) goto L_0x0490
            int r4 = r1.mPacketsBeforeNotification     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r5 = 10
            if (r4 > r5) goto L_0x0490
            goto L_0x0493
        L_0x0490:
            r4 = 10
            goto L_0x0495
        L_0x0493:
            int r4 = r1.mPacketsBeforeNotification     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
        L_0x0495:
            if (r4 <= 0) goto L_0x04d7
            r1.mPacketsBeforeNotification = r4     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r5.<init>()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r6 = "Sending the number of packets before notifications (Op Code = 8, Value = "
            r5.append(r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r5.append(r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r5.append(r13)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r5 = r5.toString()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r1.logi(r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            byte[] r5 = OP_CODE_PACKET_RECEIPT_NOTIF_REQ     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r1.setNumberOfPackets(r5, r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            android.bluetooth.BluetoothGattCharacteristic r5 = r1.mControlPointCharacteristic     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            byte[] r6 = OP_CODE_PACKET_RECEIPT_NOTIF_REQ     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r1.writeOpCode(r5, r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            no.nordicsemi.android.dfu.DfuBaseService r5 = r1.mService     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r6.<init>()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r7 = "Packet Receipt Notif Req (Op Code = 8) sent (Value = "
            r6.append(r7)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r6.append(r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r6.append(r13)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r4 = r6.toString()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r6 = 10
            r5.sendLogBroadcast(r6, r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
        L_0x04d7:
            java.lang.String r4 = "Sending Receive Firmware Image request (Op Code = 3)"
            r1.logi(r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            android.bluetooth.BluetoothGattCharacteristic r4 = r1.mControlPointCharacteristic     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            byte[] r5 = OP_CODE_RECEIVE_FIRMWARE_IMAGE     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r1.writeOpCode(r4, r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            no.nordicsemi.android.dfu.DfuBaseService r4 = r1.mService     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r5 = "Receive Firmware Image request sent"
            r6 = 10
            r4.sendLogBroadcast(r6, r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            no.nordicsemi.android.dfu.DfuProgressInfo r6 = r1.mProgressInfo     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r7 = 0
            r6.setBytesSent(r7)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r6 = "Uploading firmware..."
            r1.logi(r6)     // Catch:{ DeviceDisconnectedException -> 0x065f }
            no.nordicsemi.android.dfu.DfuBaseService r6 = r1.mService     // Catch:{ DeviceDisconnectedException -> 0x065f }
            java.lang.String r7 = "Uploading firmware..."
            r8 = 10
            r6.sendLogBroadcast(r8, r7)     // Catch:{ DeviceDisconnectedException -> 0x065f }
            android.bluetooth.BluetoothGattCharacteristic r6 = r1.mPacketCharacteristic     // Catch:{ DeviceDisconnectedException -> 0x065f }
            r1.uploadFirmwareImage(r6)     // Catch:{ DeviceDisconnectedException -> 0x065f }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            byte[] r8 = r27.readNotificationResponse()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r9 = 3
            int r9 = r1.getStatusCode(r8, r9)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r12.<init>()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r12.append(r11)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r14 = 0
            byte r15 = r8[r14]     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r12.append(r15)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r14 = ", Req Op Code = "
            r12.append(r14)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r14 = 1
            byte r15 = r8[r14]     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r12.append(r15)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r12.append(r3)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r14 = 2
            byte r15 = r8[r14]     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r12.append(r15)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r12.append(r13)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r12 = r12.toString()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r1.logi(r12)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            no.nordicsemi.android.dfu.DfuBaseService r12 = r1.mService     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r14.<init>()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r14.append(r11)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r15 = 1
            byte r8 = r8[r15]     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r14.append(r8)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r14.append(r3)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r14.append(r9)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r14.append(r13)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r8 = r14.toString()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r14 = 10
            r12.sendLogBroadcast(r14, r8)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r8 = 1
            if (r9 != r8) goto L_0x0657
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r8.<init>()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r9 = "Transfer of "
            r8.append(r9)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            no.nordicsemi.android.dfu.DfuProgressInfo r9 = r1.mProgressInfo     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            int r9 = r9.getBytesSent()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r8.append(r9)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r9 = " bytes has taken "
            r8.append(r9)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            long r6 = r6 - r4
            r8.append(r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r4 = " ms"
            r8.append(r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r4 = r8.toString()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r1.logi(r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            no.nordicsemi.android.dfu.DfuBaseService r4 = r1.mService     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r5.<init>()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r8 = "Upload completed in "
            r5.append(r8)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r5.append(r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r6 = " ms"
            r5.append(r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r5 = r5.toString()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r6 = 10
            r4.sendLogBroadcast(r6, r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r4 = "Sending Validate request (Op Code = 4)"
            r1.logi(r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            android.bluetooth.BluetoothGattCharacteristic r4 = r1.mControlPointCharacteristic     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            byte[] r5 = OP_CODE_VALIDATE     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r1.writeOpCode(r4, r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            no.nordicsemi.android.dfu.DfuBaseService r4 = r1.mService     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r5 = "Validate request sent"
            r6 = 10
            r4.sendLogBroadcast(r6, r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            byte[] r4 = r27.readNotificationResponse()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r5 = 4
            int r5 = r1.getStatusCode(r4, r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r6.<init>()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r6.append(r11)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r7 = 0
            byte r8 = r4[r7]     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r6.append(r8)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r7 = ", Req Op Code = "
            r6.append(r7)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r7 = 1
            byte r8 = r4[r7]     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r6.append(r8)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r6.append(r3)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r7 = 2
            byte r7 = r4[r7]     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r6.append(r7)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r6.append(r13)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r6 = r6.toString()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r1.logi(r6)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            no.nordicsemi.android.dfu.DfuBaseService r6 = r1.mService     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r7.<init>()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r7.append(r11)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r8 = 1
            byte r4 = r4[r8]     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r7.append(r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r7.append(r3)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r7.append(r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r7.append(r13)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r3 = r7.toString()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r4 = 10
            r6.sendLogBroadcast(r4, r3)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r3 = 1
            if (r5 != r3) goto L_0x064f
            no.nordicsemi.android.dfu.DfuProgressInfo r3 = r1.mProgressInfo     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r4 = -5
            r3.setProgress(r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r3 = "Sending Activate and Reset request (Op Code = 5)"
            r1.logi(r3)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            android.bluetooth.BluetoothGattCharacteristic r3 = r1.mControlPointCharacteristic     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            byte[] r4 = OP_CODE_ACTIVATE_AND_RESET     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r1.writeOpCode(r3, r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            no.nordicsemi.android.dfu.DfuBaseService r3 = r1.mService     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r4 = "Activate and Reset request sent"
            r5 = 10
            r3.sendLogBroadcast(r5, r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            no.nordicsemi.android.dfu.DfuBaseService r3 = r1.mService     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r3.waitUntilDisconnected()     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            no.nordicsemi.android.dfu.DfuBaseService r3 = r1.mService     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r4 = "Disconnected by the remote device"
            r5 = 5
            r3.sendLogBroadcast(r5, r4)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r3 = r19
            if (r3 != r5) goto L_0x0649
            r3 = 1
            goto L_0x064a
        L_0x0649:
            r3 = 0
        L_0x064a:
            r1.finalize(r2, r3)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            goto L_0x070c
        L_0x064f:
            no.nordicsemi.android.dfu.internal.exception.RemoteDfuException r2 = new no.nordicsemi.android.dfu.internal.exception.RemoteDfuException     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r3 = "Device returned validation error"
            r2.<init>(r3, r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            throw r2     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
        L_0x0657:
            no.nordicsemi.android.dfu.internal.exception.RemoteDfuException r2 = new no.nordicsemi.android.dfu.internal.exception.RemoteDfuException     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            java.lang.String r3 = "Device returned error after sending file"
            r2.<init>(r3, r9)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            throw r2     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
        L_0x065f:
            r0 = move-exception
            r2 = r0
            java.lang.String r3 = "Disconnected while sending data"
            r1.loge(r3)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            throw r2     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
        L_0x0667:
            no.nordicsemi.android.dfu.internal.exception.RemoteDfuException r2 = new no.nordicsemi.android.dfu.internal.exception.RemoteDfuException     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            r2.<init>(r7, r5)     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
            throw r2     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
        L_0x066d:
            throw r3     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
        L_0x066e:
            throw r3     // Catch:{ UploadAbortedException -> 0x0204, UnknownResponseException -> 0x01fc, RemoteDfuException -> 0x066f }
        L_0x066f:
            r0 = move-exception
            goto L_0x0682
        L_0x0671:
            r0 = move-exception
            r3 = r0
            r4 = r8
            r2 = r9
            goto L_0x06e2
        L_0x0677:
            r0 = move-exception
            r3 = r0
            r4 = r8
            r2 = r9
            goto L_0x0711
        L_0x067d:
            r0 = move-exception
            r21 = r8
            r22 = r9
        L_0x0682:
            r2 = r0
        L_0x0683:
            int r3 = r2.getErrorNumber()
            r3 = r3 | 256(0x100, float:3.59E-43)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = ": "
            r4.append(r2)
            java.lang.String r2 = p641l.p642a.p643a.p647b.C9600b.m25761a(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.loge(r2)
            no.nordicsemi.android.dfu.DfuBaseService r2 = r1.mService
            java.util.Locale r4 = java.util.Locale.US
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = p641l.p642a.p643a.p647b.C9600b.m25761a(r3)
            r7 = 0
            r5[r7] = r6
            java.lang.String r6 = "Remote DFU error: %s"
            java.lang.String r4 = java.lang.String.format(r4, r6, r5)
            r5 = 20
            r2.sendLogBroadcast(r5, r4)
            r2 = r22
            r1.logi(r2)
            android.bluetooth.BluetoothGattCharacteristic r2 = r1.mControlPointCharacteristic
            byte[] r4 = OP_CODE_RESET
            r1.writeOpCode(r2, r4)
            no.nordicsemi.android.dfu.DfuBaseService r2 = r1.mService
            r4 = r21
            r5 = 10
            r2.sendLogBroadcast(r5, r4)
            no.nordicsemi.android.dfu.DfuBaseService r2 = r1.mService
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
            r2.terminateConnection(r10, r3)
            goto L_0x070c
        L_0x06de:
            r0 = move-exception
            r4 = r8
            r2 = r9
            r3 = r0
        L_0x06e2:
            java.lang.String r5 = r3.getMessage()
            r1.loge(r5)
            no.nordicsemi.android.dfu.DfuBaseService r5 = r1.mService
            java.lang.String r3 = r3.getMessage()
            r6 = 20
            r5.sendLogBroadcast(r6, r3)
            r1.logi(r2)
            android.bluetooth.BluetoothGattCharacteristic r2 = r1.mControlPointCharacteristic
            byte[] r3 = OP_CODE_RESET
            r1.writeOpCode(r2, r3)
            no.nordicsemi.android.dfu.DfuBaseService r2 = r1.mService
            r3 = 10
            r2.sendLogBroadcast(r3, r4)
            no.nordicsemi.android.dfu.DfuBaseService r2 = r1.mService
            r3 = 4104(0x1008, float:5.751E-42)
            r2.terminateConnection(r10, r3)
        L_0x070c:
            return
        L_0x070d:
            r0 = move-exception
            r4 = r8
            r2 = r9
            r3 = r0
        L_0x0711:
            r1.logi(r2)
            r2 = 0
            r1.mAborted = r2
            android.bluetooth.BluetoothGattCharacteristic r2 = r1.mControlPointCharacteristic
            byte[] r5 = OP_CODE_RESET
            r1.writeOpCode(r2, r5)
            no.nordicsemi.android.dfu.DfuBaseService r2 = r1.mService
            r5 = 10
            r2.sendLogBroadcast(r5, r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p691no.nordicsemi.android.dfu.LegacyDfuImpl.performDfu(android.content.Intent):void");
    }

    public BaseCustomDfuImpl.BaseCustomBluetoothCallback getGattCallback() {
        return this.mBluetoothCallback;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void writeImageSize(@androidx.annotation.NonNull android.bluetooth.BluetoothGattCharacteristic r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            r0 = 0
            r3.mReceivedData = r0
            r0 = 0
            r3.mError = r0
            r1 = 1
            r3.mImageSizeInProgress = r1
            r4.setWriteType(r1)
            r2 = 12
            byte[] r2 = new byte[r2]
            r4.setValue(r2)
            r2 = 20
            r4.setValue(r5, r2, r0)
            r5 = 4
            r4.setValue(r6, r2, r5)
            r5 = 8
            r4.setValue(r7, r2, r5)
            no.nordicsemi.android.dfu.DfuBaseService r5 = r3.mService
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Writing to characteristic "
            r6.append(r7)
            java.util.UUID r7 = r4.getUuid()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.sendLogBroadcast(r1, r6)
            no.nordicsemi.android.dfu.DfuBaseService r5 = r3.mService
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "gatt.writeCharacteristic("
            r6.append(r7)
            java.util.UUID r7 = r4.getUuid()
            r6.append(r7)
            java.lang.String r7 = ")"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.sendLogBroadcast(r0, r6)
            android.bluetooth.BluetoothGatt r5 = r3.mGatt
            r5.writeCharacteristic(r4)
            java.lang.Object r4 = r3.mLock     // Catch:{ InterruptedException -> 0x0081 }
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x0081 }
        L_0x0062:
            boolean r5 = r3.mImageSizeInProgress     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x0072
            boolean r5 = r3.mConnected     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x0072
            int r5 = r3.mError     // Catch:{ all -> 0x007e }
            if (r5 != 0) goto L_0x0072
            boolean r5 = r3.mAborted     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x0076
        L_0x0072:
            boolean r5 = r3.mPaused     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x007c
        L_0x0076:
            java.lang.Object r5 = r3.mLock     // Catch:{ all -> 0x007e }
            r5.wait()     // Catch:{ all -> 0x007e }
            goto L_0x0062
        L_0x007c:
            monitor-exit(r4)     // Catch:{ all -> 0x007e }
            goto L_0x0087
        L_0x007e:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x007e }
            throw r5     // Catch:{ InterruptedException -> 0x0081 }
        L_0x0081:
            r4 = move-exception
            java.lang.String r5 = "Sleeping interrupted"
            r3.loge(r5, r4)
        L_0x0087:
            boolean r4 = r3.mAborted
            if (r4 != 0) goto L_0x00a6
            boolean r4 = r3.mConnected
            if (r4 == 0) goto L_0x009e
            int r4 = r3.mError
            if (r4 != 0) goto L_0x0094
            return
        L_0x0094:
            no.nordicsemi.android.dfu.internal.exception.DfuException r4 = new no.nordicsemi.android.dfu.internal.exception.DfuException
            java.lang.String r5 = "Unable to write Image Sizes"
            int r6 = r3.mError
            r4.<init>(r5, r6)
            throw r4
        L_0x009e:
            no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException r4 = new no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException
            java.lang.String r5 = "Unable to write Image Sizes: device disconnected"
            r4.<init>(r5)
            throw r4
        L_0x00a6:
            no.nordicsemi.android.dfu.internal.exception.UploadAbortedException r4 = new no.nordicsemi.android.dfu.internal.exception.UploadAbortedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p691no.nordicsemi.android.dfu.LegacyDfuImpl.writeImageSize(android.bluetooth.BluetoothGattCharacteristic, int, int, int):void");
    }
}
