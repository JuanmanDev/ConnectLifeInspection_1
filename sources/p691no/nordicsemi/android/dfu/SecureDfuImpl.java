package p691no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.UUID;
import p641l.p642a.p643a.p647b.C9601c;
import p691no.nordicsemi.android.dfu.BaseCustomDfuImpl;
import p691no.nordicsemi.android.dfu.BaseDfuImpl;
import p691no.nordicsemi.android.dfu.internal.ArchiveInputStream;
import p691no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import p691no.nordicsemi.android.dfu.internal.exception.RemoteDfuException;
import p691no.nordicsemi.android.dfu.internal.exception.RemoteDfuExtendedErrorException;
import p691no.nordicsemi.android.dfu.internal.exception.UnknownResponseException;

/* renamed from: no.nordicsemi.android.dfu.SecureDfuImpl */
public class SecureDfuImpl extends BaseCustomDfuImpl {
    public static final UUID DEFAULT_DFU_CONTROL_POINT_UUID = new UUID(-8157989241631715488L, -6937650605005804976L);
    public static final UUID DEFAULT_DFU_PACKET_UUID;
    public static final UUID DEFAULT_DFU_SERVICE_UUID = new UUID(279658205548544L, -9223371485494954757L);
    public static UUID DFU_CONTROL_POINT_UUID = DEFAULT_DFU_CONTROL_POINT_UUID;
    public static UUID DFU_PACKET_UUID = null;
    public static UUID DFU_SERVICE_UUID = DEFAULT_DFU_SERVICE_UUID;
    public static final int DFU_STATUS_SUCCESS = 1;
    public static final int MAX_ATTEMPTS = 3;
    public static final int OBJECT_COMMAND = 1;
    public static final int OBJECT_DATA = 2;
    public static final byte[] OP_CODE_CALCULATE_CHECKSUM = {3};
    public static final int OP_CODE_CALCULATE_CHECKSUM_KEY = 3;
    public static final byte[] OP_CODE_CREATE_COMMAND = {1, 1, 0, 0, 0, 0};
    public static final byte[] OP_CODE_CREATE_DATA = {1, 2, 0, 0, 0, 0};
    public static final int OP_CODE_CREATE_KEY = 1;
    public static final byte[] OP_CODE_EXECUTE = {4};
    public static final int OP_CODE_EXECUTE_KEY = 4;
    public static final byte[] OP_CODE_PACKET_RECEIPT_NOTIF_REQ = {2, 0, 0};
    public static final int OP_CODE_PACKET_RECEIPT_NOTIF_REQ_KEY = 2;
    public static final int OP_CODE_RESPONSE_CODE_KEY = 96;
    public static final byte[] OP_CODE_SELECT_OBJECT = {6, 0};
    public static final int OP_CODE_SELECT_OBJECT_KEY = 6;
    public final SecureBluetoothCallback mBluetoothCallback = new SecureBluetoothCallback();
    public BluetoothGattCharacteristic mControlPointCharacteristic;
    public BluetoothGattCharacteristic mPacketCharacteristic;
    public long prepareObjectDelay;

    /* renamed from: no.nordicsemi.android.dfu.SecureDfuImpl$ObjectChecksum */
    public static class ObjectChecksum {
        public int CRC32;
        public int offset;

        public ObjectChecksum() {
        }
    }

    /* renamed from: no.nordicsemi.android.dfu.SecureDfuImpl$ObjectInfo */
    public static class ObjectInfo extends ObjectChecksum {
        public int maxSize;

        public ObjectInfo() {
            super();
        }
    }

    /* renamed from: no.nordicsemi.android.dfu.SecureDfuImpl$SecureBluetoothCallback */
    public class SecureBluetoothCallback extends BaseCustomDfuImpl.BaseCustomBluetoothCallback {
        public SecureBluetoothCallback() {
            super();
        }

        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            if (bluetoothGattCharacteristic.getValue() == null || bluetoothGattCharacteristic.getValue().length < 3) {
                SecureDfuImpl secureDfuImpl = SecureDfuImpl.this;
                secureDfuImpl.loge("Empty response: " + parse(bluetoothGattCharacteristic));
                SecureDfuImpl secureDfuImpl2 = SecureDfuImpl.this;
                secureDfuImpl2.mError = DfuBaseService.ERROR_INVALID_RESPONSE;
                secureDfuImpl2.notifyLock();
                return;
            }
            if (bluetoothGattCharacteristic.getIntValue(17, 0).intValue() != 96) {
                SecureDfuImpl secureDfuImpl3 = SecureDfuImpl.this;
                secureDfuImpl3.loge("Invalid response: " + parse(bluetoothGattCharacteristic));
                SecureDfuImpl.this.mError = DfuBaseService.ERROR_INVALID_RESPONSE;
            } else if (bluetoothGattCharacteristic.getIntValue(17, 1).intValue() == 3) {
                int intValue = bluetoothGattCharacteristic.getIntValue(20, 3).intValue();
                if (((int) (((ArchiveInputStream) SecureDfuImpl.this.mFirmwareStream).getCrc32() & 4294967295L)) == bluetoothGattCharacteristic.getIntValue(20, 7).intValue()) {
                    SecureDfuImpl.this.mProgressInfo.setBytesReceived(intValue);
                } else {
                    SecureDfuImpl secureDfuImpl4 = SecureDfuImpl.this;
                    if (secureDfuImpl4.mFirmwareUploadInProgress) {
                        secureDfuImpl4.mFirmwareUploadInProgress = false;
                        secureDfuImpl4.notifyLock();
                        return;
                    }
                }
                handlePacketReceiptNotification(bluetoothGatt, bluetoothGattCharacteristic);
            } else if (!SecureDfuImpl.this.mRemoteErrorOccurred) {
                if (bluetoothGattCharacteristic.getIntValue(17, 2).intValue() != 1) {
                    SecureDfuImpl.this.mRemoteErrorOccurred = true;
                }
                handleNotification(bluetoothGatt, bluetoothGattCharacteristic);
            }
            SecureDfuImpl.this.notifyLock();
        }
    }

    static {
        UUID uuid = new UUID(-8157989237336748192L, -6937650605005804976L);
        DEFAULT_DFU_PACKET_UUID = uuid;
        DFU_PACKET_UUID = uuid;
    }

    public SecureDfuImpl(@NonNull Intent intent, @NonNull DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
    }

    private int getStatusCode(byte[] bArr, int i) {
        if (bArr != null && bArr.length >= 3 && bArr[0] == 96 && bArr[1] == i && (bArr[2] == 1 || bArr[2] == 2 || bArr[2] == 3 || bArr[2] == 4 || bArr[2] == 5 || bArr[2] == 7 || bArr[2] == 8 || bArr[2] == 10 || bArr[2] == 11)) {
            return bArr[2];
        }
        throw new UnknownResponseException("Invalid response received", bArr, 96, i);
    }

    private ObjectChecksum readChecksum() {
        if (this.mConnected) {
            writeOpCode(this.mControlPointCharacteristic, OP_CODE_CALCULATE_CHECKSUM);
            byte[] readNotificationResponse = readNotificationResponse();
            int statusCode = getStatusCode(readNotificationResponse, 3);
            if (statusCode == 11) {
                throw new RemoteDfuExtendedErrorException("Receiving Checksum failed", readNotificationResponse[3]);
            } else if (statusCode == 1) {
                ObjectChecksum objectChecksum = new ObjectChecksum();
                objectChecksum.offset = unsignedBytesToInt(readNotificationResponse, 3);
                objectChecksum.CRC32 = unsignedBytesToInt(readNotificationResponse, 7);
                return objectChecksum;
            } else {
                throw new RemoteDfuException("Receiving Checksum failed", statusCode);
            }
        } else {
            throw new DeviceDisconnectedException("Unable to read Checksum: device disconnected");
        }
    }

    private ObjectInfo selectObject(int i) {
        if (this.mConnected) {
            byte[] bArr = OP_CODE_SELECT_OBJECT;
            bArr[1] = (byte) i;
            writeOpCode(this.mControlPointCharacteristic, bArr);
            byte[] readNotificationResponse = readNotificationResponse();
            int statusCode = getStatusCode(readNotificationResponse, 6);
            if (statusCode == 11) {
                throw new RemoteDfuExtendedErrorException("Selecting object failed", readNotificationResponse[3]);
            } else if (statusCode == 1) {
                ObjectInfo objectInfo = new ObjectInfo();
                objectInfo.maxSize = unsignedBytesToInt(readNotificationResponse, 3);
                objectInfo.offset = unsignedBytesToInt(readNotificationResponse, 7);
                objectInfo.CRC32 = unsignedBytesToInt(readNotificationResponse, 11);
                return objectInfo;
            } else {
                throw new RemoteDfuException("Selecting object failed", statusCode);
            }
        } else {
            throw new DeviceDisconnectedException("Unable to read object info: device disconnected");
        }
    }

    private void sendFirmware(BluetoothGatt bluetoothGatt) {
        int i;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        BluetoothGatt bluetoothGatt2 = bluetoothGatt;
        int i2 = this.mPacketsBeforeNotification;
        String str2 = ")";
        if (i2 > 0) {
            setPacketReceiptNotifications(i2);
            this.mService.sendLogBroadcast(10, "Packet Receipt Notif Req (Op Code = 2) sent (Value = " + i2 + str2);
        }
        logi("Setting object to Data (Op Code = 6, Type = 2)");
        ObjectInfo selectObject = selectObject(2);
        logi(String.format(Locale.US, "Data object info received (Max size = %d, Offset = %d, CRC = %08X)", new Object[]{Integer.valueOf(selectObject.maxSize), Integer.valueOf(selectObject.offset), Integer.valueOf(selectObject.CRC32)}));
        this.mService.sendLogBroadcast(10, String.format(Locale.US, "Data object info received (Max size = %d, Offset = %d, CRC = %08X)", new Object[]{Integer.valueOf(selectObject.maxSize), Integer.valueOf(selectObject.offset), Integer.valueOf(selectObject.CRC32)}));
        this.mProgressInfo.setMaxObjectSizeInBytes(selectObject.maxSize);
        int i3 = this.mImageSizeInBytes;
        int i4 = selectObject.maxSize;
        int i5 = ((i3 + i4) - 1) / i4;
        int i6 = selectObject.offset;
        if (i6 > 0) {
            try {
                i = i6 / i4;
                int i7 = i4 * i;
                int i8 = i6 - i7;
                if (i8 == 0) {
                    i7 -= i4;
                } else {
                    i4 = i8;
                }
                int i9 = i7;
                if (i9 > 0) {
                    this.mFirmwareStream.read(new byte[i9]);
                    this.mFirmwareStream.mark(selectObject.maxSize);
                }
                this.mFirmwareStream.read(new byte[i4]);
                if (((int) (((ArchiveInputStream) this.mFirmwareStream).getCrc32() & 4294967295L)) == selectObject.CRC32) {
                    logi(selectObject.offset + " bytes of data sent before, CRC match");
                    this.mService.sendLogBroadcast(10, selectObject.offset + " bytes of data sent before, CRC match");
                    this.mProgressInfo.setBytesSent(selectObject.offset);
                    this.mProgressInfo.setBytesReceived(selectObject.offset);
                    if (i4 != selectObject.maxSize || selectObject.offset >= this.mImageSizeInBytes) {
                        z = true;
                    } else {
                        logi("Executing data object (Op Code = 4)");
                        writeExecute();
                        this.mService.sendLogBroadcast(10, "Data object executed");
                    }
                } else {
                    logi(selectObject.offset + " bytes sent before, CRC does not match");
                    this.mService.sendLogBroadcast(15, selectObject.offset + " bytes sent before, CRC does not match");
                    this.mProgressInfo.setBytesSent(i9);
                    this.mProgressInfo.setBytesReceived(i9);
                    selectObject.offset = selectObject.offset - i4;
                    selectObject.CRC32 = 0;
                    this.mFirmwareStream.reset();
                    logi("Resuming from byte " + selectObject.offset + "...");
                    this.mService.sendLogBroadcast(10, "Resuming from byte " + selectObject.offset + "...");
                }
            } catch (RemoteDfuException e) {
                if (e.getErrorNumber() == 8) {
                    this.mService.sendLogBroadcast(10, "Data object already executed");
                    this.mRemoteErrorOccurred = false;
                } else {
                    throw e;
                }
            } catch (IOException e2) {
                loge("Error while reading firmware stream", e2);
                this.mService.terminateConnection(bluetoothGatt2, DfuBaseService.ERROR_FILE_IO_EXCEPTION);
                return;
            }
            z = false;
        } else {
            this.mProgressInfo.setBytesSent(0);
            z = false;
            i = 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (selectObject.offset < this.mImageSizeInBytes) {
            int i10 = 1;
            while (this.mProgressInfo.getAvailableObjectSizeIsBytes() > 0) {
                if (!z) {
                    int availableObjectSizeIsBytes = this.mProgressInfo.getAvailableObjectSizeIsBytes();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Creating Data object (Op Code = 1, Type = 2, Size = ");
                    sb.append(availableObjectSizeIsBytes);
                    sb.append(") (");
                    int i11 = i + 1;
                    sb.append(i11);
                    boolean z4 = z;
                    sb.append("/");
                    sb.append(i5);
                    sb.append(str2);
                    logi(sb.toString());
                    writeCreateRequest(2, availableObjectSizeIsBytes);
                    DfuBaseService dfuBaseService = this.mService;
                    StringBuilder sb2 = new StringBuilder();
                    str = str2;
                    sb2.append("Data object (");
                    sb2.append(i11);
                    sb2.append("/");
                    sb2.append(i5);
                    sb2.append(") created");
                    dfuBaseService.sendLogBroadcast(10, sb2.toString());
                    if (this.prepareObjectDelay > 0 || i5 == 0) {
                        DfuBaseService dfuBaseService2 = this.mService;
                        long j = this.prepareObjectDelay;
                        if (j <= 0) {
                            j = 400;
                        }
                        dfuBaseService2.waitFor(j);
                    }
                    this.mService.sendLogBroadcast(10, "Uploading firmware...");
                    z2 = z4;
                } else {
                    str = str2;
                    this.mService.sendLogBroadcast(10, "Resuming uploading firmware...");
                    z2 = false;
                }
                try {
                    logi("Uploading firmware...");
                    uploadFirmwareImage(this.mPacketCharacteristic);
                    logi("Sending Calculate Checksum command (Op Code = 3)");
                    ObjectChecksum readChecksum = readChecksum();
                    logi(String.format(Locale.US, "Checksum received (Offset = %d, CRC = %08X)", new Object[]{Integer.valueOf(readChecksum.offset), Integer.valueOf(readChecksum.CRC32)}));
                    boolean z5 = z2;
                    this.mService.sendLogBroadcast(10, String.format(Locale.US, "Checksum received (Offset = %d, CRC = %08X)", new Object[]{Integer.valueOf(readChecksum.offset), Integer.valueOf(readChecksum.CRC32)}));
                    int bytesSent = this.mProgressInfo.getBytesSent() - readChecksum.offset;
                    if (bytesSent > 0) {
                        logw(bytesSent + " bytes were lost!");
                        this.mService.sendLogBroadcast(15, bytesSent + " bytes were lost");
                        try {
                            this.mFirmwareStream.reset();
                            this.mFirmwareStream.read(new byte[(selectObject.maxSize - bytesSent)]);
                            this.mProgressInfo.setBytesSent(readChecksum.offset);
                            int i12 = this.mPacketsBeforeNotification;
                            if (i12 == 0 || i12 > 1) {
                                this.mPacketsBeforeNotification = 1;
                                setPacketReceiptNotifications(1);
                                this.mService.sendLogBroadcast(10, "Packet Receipt Notif Req (Op Code = 2) sent (Value = 1)");
                            }
                        } catch (IOException e3) {
                            loge("Error while reading firmware stream", e3);
                            this.mService.terminateConnection(bluetoothGatt2, DfuBaseService.ERROR_FILE_IO_EXCEPTION);
                            return;
                        } catch (Throwable th) {
                            loge("Progress lost. Bytes sent: " + this.mProgressInfo.getBytesSent(), th);
                            this.mService.terminateConnection(bluetoothGatt2, DfuBaseService.ERROR_PROGRESS_LOST);
                            return;
                        }
                    }
                    int crc32 = (int) (((ArchiveInputStream) this.mFirmwareStream).getCrc32() & 4294967295L);
                    if (crc32 != readChecksum.CRC32) {
                        String format = String.format(Locale.US, "CRC does not match! Expected %08X but found %08X.", new Object[]{Integer.valueOf(crc32), Integer.valueOf(readChecksum.CRC32)});
                        if (i10 < 3) {
                            i10++;
                            String str3 = format + String.format(Locale.US, " Retrying...(%d/%d)", new Object[]{Integer.valueOf(i10), 3});
                            logi(str3);
                            this.mService.sendLogBroadcast(15, str3);
                            try {
                                this.mFirmwareStream.reset();
                                this.mProgressInfo.setBytesSent(((ArchiveInputStream) this.mFirmwareStream).getBytesRead());
                            } catch (IOException e4) {
                                loge("Error while resetting the firmware stream", e4);
                                this.mService.terminateConnection(bluetoothGatt2, DfuBaseService.ERROR_FILE_IO_EXCEPTION);
                                return;
                            }
                        } else {
                            loge(format);
                            this.mService.sendLogBroadcast(20, format);
                            this.mService.terminateConnection(bluetoothGatt2, DfuBaseService.ERROR_CRC_ERROR);
                            return;
                        }
                    } else if (bytesSent > 0) {
                        str2 = str;
                        z3 = true;
                    } else {
                        logi("Executing data object (Op Code = 4)");
                        writeExecute(this.mProgressInfo.isComplete());
                        this.mService.sendLogBroadcast(10, "Data object executed");
                        i++;
                        this.mFirmwareStream.mark(0);
                        i10 = 1;
                    }
                    z3 = z5;
                    str2 = str;
                } catch (DeviceDisconnectedException e5) {
                    loge("Disconnected while sending data");
                    throw e5;
                }
            }
        } else {
            logi("Executing data object (Op Code = 4)");
            writeExecute(true);
            this.mService.sendLogBroadcast(10, "Data object executed");
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Transfer of ");
        sb3.append(this.mProgressInfo.getBytesSent() - selectObject.offset);
        sb3.append(" bytes has taken ");
        long j2 = elapsedRealtime2 - elapsedRealtime;
        sb3.append(j2);
        sb3.append(" ms");
        logi(sb3.toString());
        this.mService.sendLogBroadcast(10, "Upload completed in " + j2 + " ms");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void sendInitPacket(@androidx.annotation.NonNull android.bluetooth.BluetoothGatt r18, boolean r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            java.util.zip.CRC32 r3 = new java.util.zip.CRC32
            r3.<init>()
            java.lang.String r0 = "Setting object to Command (Op Code = 6, Type = 1)"
            r1.logi(r0)
            r4 = 1
            no.nordicsemi.android.dfu.SecureDfuImpl$ObjectInfo r5 = r1.selectObject(r4)
            java.util.Locale r0 = java.util.Locale.US
            r6 = 3
            java.lang.Object[] r7 = new java.lang.Object[r6]
            int r8 = r5.maxSize
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 0
            r7[r9] = r8
            int r8 = r5.offset
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r4] = r8
            int r8 = r5.CRC32
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10 = 2
            r7[r10] = r8
            java.lang.String r8 = "Command object info received (Max size = %d, Offset = %d, CRC = %08X)"
            java.lang.String r0 = java.lang.String.format(r0, r8, r7)
            r1.logi(r0)
            no.nordicsemi.android.dfu.DfuBaseService r0 = r1.mService
            java.util.Locale r7 = java.util.Locale.US
            java.lang.Object[] r11 = new java.lang.Object[r6]
            int r12 = r5.maxSize
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r9] = r12
            int r12 = r5.offset
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r4] = r12
            int r12 = r5.CRC32
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r10] = r12
            java.lang.String r7 = java.lang.String.format(r7, r8, r11)
            r8 = 10
            r0.sendLogBroadcast(r8, r7)
            int r0 = r1.mInitPacketSizeInBytes
            int r7 = r5.maxSize
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r7 = 4100(0x1004, float:5.745E-42)
            java.lang.String r13 = "Error while resetting the init packet stream"
            if (r19 == 0) goto L_0x0114
            int r14 = r5.offset
            if (r14 <= 0) goto L_0x0114
            if (r14 > r0) goto L_0x0114
            byte[] r0 = new byte[r14]     // Catch:{ IOException -> 0x00e0 }
            java.io.InputStream r14 = r1.mInitPacketStream     // Catch:{ IOException -> 0x00e0 }
            r14.read(r0)     // Catch:{ IOException -> 0x00e0 }
            r3.update(r0)     // Catch:{ IOException -> 0x00e0 }
            long r14 = r3.getValue()     // Catch:{ IOException -> 0x00e0 }
            long r14 = r14 & r11
            int r0 = (int) r14     // Catch:{ IOException -> 0x00e0 }
            int r14 = r5.CRC32     // Catch:{ IOException -> 0x00e0 }
            if (r14 != r0) goto L_0x00d5
            java.lang.String r0 = "Init packet CRC is the same"
            r1.logi(r0)     // Catch:{ IOException -> 0x00e0 }
            int r0 = r5.offset     // Catch:{ IOException -> 0x00e0 }
            int r14 = r1.mInitPacketSizeInBytes     // Catch:{ IOException -> 0x00e0 }
            if (r0 != r14) goto L_0x00ab
            java.lang.String r0 = "-> Whole Init packet was sent before"
            r1.logi(r0)     // Catch:{ IOException -> 0x00e0 }
            no.nordicsemi.android.dfu.DfuBaseService r0 = r1.mService     // Catch:{ IOException -> 0x00a6 }
            java.lang.String r14 = "Received CRC match Init packet"
            r0.sendLogBroadcast(r8, r14)     // Catch:{ IOException -> 0x00a6 }
            r0 = r4
            r14 = r9
            goto L_0x0116
        L_0x00a6:
            r0 = move-exception
            r15 = r0
            r0 = r4
            r14 = r9
            goto L_0x00e4
        L_0x00ab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00e0 }
            r0.<init>()     // Catch:{ IOException -> 0x00e0 }
            java.lang.String r14 = "-> "
            r0.append(r14)     // Catch:{ IOException -> 0x00e0 }
            int r14 = r5.offset     // Catch:{ IOException -> 0x00e0 }
            r0.append(r14)     // Catch:{ IOException -> 0x00e0 }
            java.lang.String r14 = " bytes of Init packet were sent before"
            r0.append(r14)     // Catch:{ IOException -> 0x00e0 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x00e0 }
            r1.logi(r0)     // Catch:{ IOException -> 0x00e0 }
            no.nordicsemi.android.dfu.DfuBaseService r0 = r1.mService     // Catch:{ IOException -> 0x00d0 }
            java.lang.String r14 = "Resuming sending Init packet..."
            r0.sendLogBroadcast(r8, r14)     // Catch:{ IOException -> 0x00d0 }
            r14 = r4
            r0 = r9
            goto L_0x0116
        L_0x00d0:
            r0 = move-exception
            r15 = r0
            r14 = r4
            r0 = r9
            goto L_0x00e4
        L_0x00d5:
            java.io.InputStream r0 = r1.mInitPacketStream     // Catch:{ IOException -> 0x00e0 }
            r0.reset()     // Catch:{ IOException -> 0x00e0 }
            r3.reset()     // Catch:{ IOException -> 0x00e0 }
            r5.offset = r9     // Catch:{ IOException -> 0x00e0 }
            goto L_0x0114
        L_0x00e0:
            r0 = move-exception
            r15 = r0
            r0 = r9
            r14 = r0
        L_0x00e4:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Error while reading "
            r10.append(r11)
            int r11 = r5.offset
            r10.append(r11)
            java.lang.String r11 = " bytes from the init packet stream"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r1.loge(r10, r15)
            java.io.InputStream r10 = r1.mInitPacketStream     // Catch:{ IOException -> 0x010a }
            r10.reset()     // Catch:{ IOException -> 0x010a }
            r3.reset()     // Catch:{ IOException -> 0x010a }
            r5.offset = r9     // Catch:{ IOException -> 0x010a }
            goto L_0x0116
        L_0x010a:
            r0 = move-exception
            r1.loge(r13, r0)
            no.nordicsemi.android.dfu.DfuBaseService r0 = r1.mService
            r0.terminateConnection(r2, r7)
            return
        L_0x0114:
            r0 = r9
            r14 = r0
        L_0x0116:
            if (r0 != 0) goto L_0x0257
            r1.setPacketReceiptNotifications(r9)
            no.nordicsemi.android.dfu.DfuBaseService r0 = r1.mService
            java.lang.String r10 = "Packet Receipt Notif disabled (Op Code = 2, Value = 0)"
            r0.sendLogBroadcast(r8, r10)
            r0 = r4
        L_0x0123:
            if (r0 > r6) goto L_0x0257
            java.lang.String r10 = ")"
            if (r14 != 0) goto L_0x014e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Creating Init packet object (Op Code = 1, Type = 1, Size = "
            r11.append(r12)
            int r12 = r1.mInitPacketSizeInBytes
            r11.append(r12)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            r1.logi(r11)
            int r11 = r1.mInitPacketSizeInBytes
            r1.writeCreateRequest(r4, r11)
            no.nordicsemi.android.dfu.DfuBaseService r11 = r1.mService
            java.lang.String r12 = "Command object created"
            r11.sendLogBroadcast(r8, r12)
        L_0x014e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ DeviceDisconnectedException -> 0x0250 }
            r11.<init>()     // Catch:{ DeviceDisconnectedException -> 0x0250 }
            java.lang.String r12 = "Sending "
            r11.append(r12)     // Catch:{ DeviceDisconnectedException -> 0x0250 }
            int r12 = r1.mInitPacketSizeInBytes     // Catch:{ DeviceDisconnectedException -> 0x0250 }
            int r14 = r5.offset     // Catch:{ DeviceDisconnectedException -> 0x0250 }
            int r12 = r12 - r14
            r11.append(r12)     // Catch:{ DeviceDisconnectedException -> 0x0250 }
            java.lang.String r12 = " bytes of init packet..."
            r11.append(r12)     // Catch:{ DeviceDisconnectedException -> 0x0250 }
            java.lang.String r11 = r11.toString()     // Catch:{ DeviceDisconnectedException -> 0x0250 }
            r1.logi(r11)     // Catch:{ DeviceDisconnectedException -> 0x0250 }
            android.bluetooth.BluetoothGattCharacteristic r11 = r1.mPacketCharacteristic     // Catch:{ DeviceDisconnectedException -> 0x0250 }
            r1.writeInitData(r11, r3)     // Catch:{ DeviceDisconnectedException -> 0x0250 }
            long r11 = r3.getValue()
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r14
            int r11 = (int) r11
            no.nordicsemi.android.dfu.DfuBaseService r12 = r1.mService
            java.util.Locale r14 = java.util.Locale.US
            java.lang.Object[] r15 = new java.lang.Object[r4]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r11)
            r15[r9] = r16
            java.lang.String r7 = "Command object sent (CRC = %08X)"
            java.lang.String r7 = java.lang.String.format(r14, r7, r15)
            r12.sendLogBroadcast(r8, r7)
            java.lang.String r7 = "Sending Calculate Checksum command (Op Code = 3)"
            r1.logi(r7)
            no.nordicsemi.android.dfu.SecureDfuImpl$ObjectChecksum r7 = r17.readChecksum()
            no.nordicsemi.android.dfu.DfuBaseService r12 = r1.mService
            java.util.Locale r14 = java.util.Locale.US
            r15 = 2
            java.lang.Object[] r6 = new java.lang.Object[r15]
            int r15 = r7.offset
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r6[r9] = r15
            int r15 = r7.CRC32
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r6[r4] = r15
            java.lang.String r15 = "Checksum received (Offset = %d, CRC = %08X)"
            java.lang.String r6 = java.lang.String.format(r14, r15, r6)
            r12.sendLogBroadcast(r8, r6)
            java.util.Locale r6 = java.util.Locale.US
            r12 = 2
            java.lang.Object[] r14 = new java.lang.Object[r12]
            int r12 = r7.offset
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r14[r9] = r12
            int r12 = r7.CRC32
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r14[r4] = r12
            java.lang.String r6 = java.lang.String.format(r6, r15, r14)
            r1.logi(r6)
            int r6 = r7.CRC32
            if (r11 != r6) goto L_0x01dc
            goto L_0x0257
        L_0x01dc:
            r6 = 3
            if (r0 >= r6) goto L_0x023c
            int r0 = r0 + 1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "CRC does not match! Retrying...("
            r7.append(r11)
            r7.append(r0)
            java.lang.String r12 = "/"
            r7.append(r12)
            r7.append(r6)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r1.logi(r7)
            no.nordicsemi.android.dfu.DfuBaseService r7 = r1.mService
            r14 = 15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r11)
            r15.append(r0)
            r15.append(r12)
            r15.append(r6)
            r15.append(r10)
            java.lang.String r10 = r15.toString()
            r7.sendLogBroadcast(r14, r10)
            r5.offset = r9     // Catch:{ IOException -> 0x0230 }
            r5.CRC32 = r9     // Catch:{ IOException -> 0x0230 }
            java.io.InputStream r7 = r1.mInitPacketStream     // Catch:{ IOException -> 0x0230 }
            r7.reset()     // Catch:{ IOException -> 0x0230 }
            r3.reset()     // Catch:{ IOException -> 0x0230 }
            r14 = r9
            r7 = 4100(0x1004, float:5.745E-42)
            goto L_0x0123
        L_0x0230:
            r0 = move-exception
            r1.loge(r13, r0)
            no.nordicsemi.android.dfu.DfuBaseService r0 = r1.mService
            r3 = 4100(0x1004, float:5.745E-42)
            r0.terminateConnection(r2, r3)
            return
        L_0x023c:
            java.lang.String r0 = "CRC does not match!"
            r1.loge(r0)
            no.nordicsemi.android.dfu.DfuBaseService r3 = r1.mService
            r4 = 20
            r3.sendLogBroadcast(r4, r0)
            no.nordicsemi.android.dfu.DfuBaseService r0 = r1.mService
            r3 = 4109(0x100d, float:5.758E-42)
            r0.terminateConnection(r2, r3)
            return
        L_0x0250:
            r0 = move-exception
            java.lang.String r2 = "Disconnected while sending init packet"
            r1.loge(r2)
            throw r0
        L_0x0257:
            java.lang.String r0 = "Executing init packet (Op Code = 4)"
            r1.logi(r0)
            r17.writeExecute()
            no.nordicsemi.android.dfu.DfuBaseService r0 = r1.mService
            java.lang.String r2 = "Command object executed"
            r0.sendLogBroadcast(r8, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p691no.nordicsemi.android.dfu.SecureDfuImpl.sendInitPacket(android.bluetooth.BluetoothGatt, boolean):void");
    }

    private void setNumberOfPackets(@NonNull byte[] bArr, int i) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
    }

    private void setObjectSize(@NonNull byte[] bArr, int i) {
        bArr[2] = (byte) (i & 255);
        bArr[3] = (byte) ((i >> 8) & 255);
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 24) & 255);
    }

    private void setPacketReceiptNotifications(int i) {
        if (this.mConnected) {
            logi("Sending the number of packets before notifications (Op Code = 2, Value = " + i + ")");
            setNumberOfPackets(OP_CODE_PACKET_RECEIPT_NOTIF_REQ, i);
            writeOpCode(this.mControlPointCharacteristic, OP_CODE_PACKET_RECEIPT_NOTIF_REQ);
            byte[] readNotificationResponse = readNotificationResponse();
            int statusCode = getStatusCode(readNotificationResponse, 2);
            if (statusCode == 11) {
                throw new RemoteDfuExtendedErrorException("Sending the number of packets failed", readNotificationResponse[3]);
            } else if (statusCode != 1) {
                throw new RemoteDfuException("Sending the number of packets failed", statusCode);
            }
        } else {
            throw new DeviceDisconnectedException("Unable to read Checksum: device disconnected");
        }
    }

    private int unsignedBytesToInt(@NonNull byte[] bArr, int i) {
        return (bArr[i] & 255) + ((bArr[i + 1] & 255) << 8) + ((bArr[i + 2] & 255) << 16) + ((bArr[i + 3] & 255) << 24);
    }

    private void writeCreateRequest(int i, int i2) {
        if (this.mConnected) {
            byte[] bArr = i == 1 ? OP_CODE_CREATE_COMMAND : OP_CODE_CREATE_DATA;
            setObjectSize(bArr, i2);
            writeOpCode(this.mControlPointCharacteristic, bArr);
            byte[] readNotificationResponse = readNotificationResponse();
            int statusCode = getStatusCode(readNotificationResponse, 1);
            if (statusCode == 11) {
                throw new RemoteDfuExtendedErrorException("Creating Command object failed", readNotificationResponse[3]);
            } else if (statusCode != 1) {
                throw new RemoteDfuException("Creating Command object failed", statusCode);
            }
        } else {
            throw new DeviceDisconnectedException("Unable to create object: device disconnected");
        }
    }

    private void writeExecute() {
        if (this.mConnected) {
            writeOpCode(this.mControlPointCharacteristic, OP_CODE_EXECUTE);
            byte[] readNotificationResponse = readNotificationResponse();
            int statusCode = getStatusCode(readNotificationResponse, 4);
            if (statusCode == 11) {
                throw new RemoteDfuExtendedErrorException("Executing object failed", readNotificationResponse[3]);
            } else if (statusCode != 1) {
                throw new RemoteDfuException("Executing object failed", statusCode);
            }
        } else {
            throw new DeviceDisconnectedException("Unable to read Checksum: device disconnected");
        }
    }

    private void writeOpCode(@NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr) {
        writeOpCode(bluetoothGattCharacteristic, bArr, false);
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

    public boolean initialize(@NonNull Intent intent, @NonNull BluetoothGatt bluetoothGatt, int i, @NonNull InputStream inputStream, @Nullable InputStream inputStream2) {
        if (inputStream2 != null) {
            return super.initialize(intent, bluetoothGatt, i, inputStream, inputStream2);
        }
        this.mService.sendLogBroadcast(20, "The Init packet is required by this version DFU Bootloader");
        this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_INIT_PACKET_REQUIRED);
        return false;
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

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0167, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0168, code lost:
        loge(r9.getMessage());
        r8.mService.sendLogBroadcast(20, r9.getMessage());
        r8.mService.terminateConnection(r1, p691no.nordicsemi.android.dfu.DfuBaseService.ERROR_INVALID_RESPONSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0180, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0181, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0068 A[Catch:{ RemoteDfuException -> 0x0071, UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0167 A[ExcHandler: UnknownResponseException (r9v2 'e' no.nordicsemi.android.dfu.internal.exception.UnknownResponseException A[CUSTOM_DECLARE]), Splitter:B:6:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0180 A[ExcHandler: UploadAbortedException (r9v1 'e' no.nordicsemi.android.dfu.internal.exception.UploadAbortedException A[CUSTOM_DECLARE]), Splitter:B:6:0x0048] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void performDfu(@androidx.annotation.NonNull android.content.Intent r9) {
        /*
            r8 = this;
            java.lang.String r0 = "no.nordicsemi.android.dfu.extra.EXTRA_DISABLE_RESUME"
            java.lang.String r1 = "Secure DFU bootloader found"
            r8.logw(r1)
            no.nordicsemi.android.dfu.DfuProgressInfo r1 = r8.mProgressInfo
            r2 = -2
            r1.setProgress(r2)
            android.bluetooth.BluetoothGatt r1 = r8.mGatt
            java.lang.String r2 = "no.nordicsemi.android.dfu.extra.EXTRA_MTU"
            boolean r3 = r9.hasExtra(r2)
            if (r3 == 0) goto L_0x003a
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r3 < r4) goto L_0x003a
            r3 = 517(0x205, float:7.24E-43)
            int r2 = r9.getIntExtra(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Requesting MTU = "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r8.logi(r3)
            r8.requestMtu(r2)
        L_0x003a:
            r2 = 0
            java.lang.String r4 = "no.nordicsemi.android.dfu.extra.EXTRA_DATA_OBJECT_DELAY"
            long r2 = r9.getLongExtra(r4, r2)
            r8.prepareObjectDelay = r2
            r2 = 20
            r3 = 1
            r4 = 0
            android.bluetooth.BluetoothGattCharacteristic r5 = r8.mControlPointCharacteristic     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            r8.enableCCCD(r5, r3)     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            no.nordicsemi.android.dfu.DfuBaseService r5 = r8.mService     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            r6 = 10
            java.lang.String r7 = "Notifications enabled"
            r5.sendLogBroadcast(r6, r7)     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            boolean r5 = r9.hasExtra(r0)     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            if (r5 == 0) goto L_0x0065
            boolean r0 = r9.getBooleanExtra(r0, r4)     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            if (r0 != 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r0 = r4
            goto L_0x0066
        L_0x0065:
            r0 = r3
        L_0x0066:
            if (r0 != 0) goto L_0x006d
            java.lang.String r5 = "Resume feature disabled. Performing fresh DFU"
            r8.logi(r5)     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
        L_0x006d:
            r8.sendInitPacket(r1, r0)     // Catch:{ RemoteDfuException -> 0x0071, UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167 }
            goto L_0x00b1
        L_0x0071:
            r0 = move-exception
            no.nordicsemi.android.dfu.DfuProgressInfo r5 = r8.mProgressInfo     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            boolean r5 = r5.isLastPart()     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            if (r5 != 0) goto L_0x00cc
            r8.mRemoteErrorOccurred = r4     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            java.lang.String r0 = "Sending SD+BL failed. Trying to send App only"
            r8.logw(r0)     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            no.nordicsemi.android.dfu.DfuBaseService r0 = r8.mService     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            r5 = 15
            java.lang.String r6 = "Invalid system components. Trying to send application"
            r0.sendLogBroadcast(r5, r6)     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            r0 = 4
            r8.mFileType = r0     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            java.io.InputStream r5 = r8.mFirmwareStream     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            no.nordicsemi.android.dfu.internal.ArchiveInputStream r5 = (p691no.nordicsemi.android.dfu.internal.ArchiveInputStream) r5     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            r5.setContentType(r0)     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            byte[] r0 = r5.getApplicationInit()     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            r6.<init>(r0)     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            r8.mInitPacketStream = r6     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            int r0 = r0.length     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            r8.mInitPacketSizeInBytes = r0     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            int r0 = r5.applicationImageSize()     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            r8.mImageSizeInBytes = r0     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            no.nordicsemi.android.dfu.DfuProgressInfo r5 = r8.mProgressInfo     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            r6 = 2
            r5.init(r0, r6, r6)     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            r8.sendInitPacket(r1, r4)     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
        L_0x00b1:
            r8.sendFirmware(r1)     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            no.nordicsemi.android.dfu.DfuProgressInfo r0 = r8.mProgressInfo     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            r5 = -5
            r0.setProgress(r5)     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            no.nordicsemi.android.dfu.DfuBaseService r0 = r8.mService     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            r0.waitUntilDisconnected()     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            no.nordicsemi.android.dfu.DfuBaseService r0 = r8.mService     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            r5 = 5
            java.lang.String r6 = "Disconnected by the remote device"
            r0.sendLogBroadcast(r5, r6)     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            r8.finalize(r9, r4)     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
            goto L_0x017f
        L_0x00cc:
            throw r0     // Catch:{ UploadAbortedException -> 0x0180, UnknownResponseException -> 0x0167, RemoteDfuException -> 0x00cd }
        L_0x00cd:
            r9 = move-exception
            int r0 = r9.getErrorNumber()
            r0 = r0 | 512(0x200, float:7.175E-43)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r9.getMessage()
            r5.append(r6)
            java.lang.String r6 = ": "
            r5.append(r6)
            java.lang.String r6 = p641l.p642a.p643a.p647b.C9601c.m25762a(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r8.loge(r5)
            no.nordicsemi.android.dfu.DfuBaseService r5 = r8.mService
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r7 = p641l.p642a.p643a.p647b.C9601c.m25762a(r0)
            r3[r4] = r7
            java.lang.String r4 = "Remote DFU error: %s"
            java.lang.String r3 = java.lang.String.format(r6, r4, r3)
            r5.sendLogBroadcast(r2, r3)
            boolean r3 = r9 instanceof p691no.nordicsemi.android.dfu.internal.exception.RemoteDfuExtendedErrorException
            if (r3 == 0) goto L_0x015f
            no.nordicsemi.android.dfu.internal.exception.RemoteDfuExtendedErrorException r9 = (p691no.nordicsemi.android.dfu.internal.exception.RemoteDfuExtendedErrorException) r9
            int r0 = r9.getExtendedErrorNumber()
            r0 = r0 | 1024(0x400, float:1.435E-42)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Extended Error details: "
            r3.append(r4)
            java.lang.String r4 = p641l.p642a.p643a.p647b.C9601c.m25764c(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r8.loge(r3)
            no.nordicsemi.android.dfu.DfuBaseService r3 = r8.mService
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Details: "
            r4.append(r5)
            java.lang.String r5 = p641l.p642a.p643a.p647b.C9601c.m25764c(r0)
            r4.append(r5)
            java.lang.String r5 = " (Code = "
            r4.append(r5)
            int r9 = r9.getExtendedErrorNumber()
            r4.append(r9)
            java.lang.String r9 = ")"
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            r3.sendLogBroadcast(r2, r9)
            no.nordicsemi.android.dfu.DfuBaseService r9 = r8.mService
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r9.terminateConnection(r1, r0)
            goto L_0x017f
        L_0x015f:
            no.nordicsemi.android.dfu.DfuBaseService r9 = r8.mService
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r9.terminateConnection(r1, r0)
            goto L_0x017f
        L_0x0167:
            r9 = move-exception
            java.lang.String r0 = r9.getMessage()
            r8.loge(r0)
            no.nordicsemi.android.dfu.DfuBaseService r0 = r8.mService
            java.lang.String r9 = r9.getMessage()
            r0.sendLogBroadcast(r2, r9)
            no.nordicsemi.android.dfu.DfuBaseService r9 = r8.mService
            r0 = 4104(0x1008, float:5.751E-42)
            r9.terminateConnection(r1, r0)
        L_0x017f:
            return
        L_0x0180:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p691no.nordicsemi.android.dfu.SecureDfuImpl.performDfu(android.content.Intent):void");
    }

    public BaseDfuImpl.BaseBluetoothGattCallback getGattCallback() {
        return this.mBluetoothCallback;
    }

    private void writeExecute(boolean z) {
        try {
            writeExecute();
        } catch (RemoteDfuException e) {
            if (!z || e.getErrorNumber() != 5) {
                throw e;
            }
            logw(e.getMessage() + ": " + C9601c.m25762a(517));
            if (this.mFileType == 1) {
                logw("Are you sure your new SoftDevice is API compatible with the updated one? If not, update the bootloader as well");
            }
            this.mService.sendLogBroadcast(15, String.format(Locale.US, "Remote DFU error: %s. SD busy? Retrying...", new Object[]{C9601c.m25762a(517)}));
            logi("SD busy? Retrying...");
            logi("Executing data object (Op Code = 4)");
            writeExecute();
        }
    }
}
