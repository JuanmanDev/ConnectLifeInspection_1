package p691no.nordicsemi.android.dfu;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelUuid;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.RequiresApi;
import java.security.InvalidParameterException;
import java.util.UUID;

/* renamed from: no.nordicsemi.android.dfu.DfuServiceInitiator */
public final class DfuServiceInitiator {
    public static final int DEFAULT_MBR_SIZE = 4096;
    public static final int DEFAULT_PRN_VALUE = 12;
    public static final long DEFAULT_SCAN_TIMEOUT = 5000;
    public static final int SCOPE_APPLICATION = 2;
    public static final int SCOPE_SYSTEM_COMPONENTS = 1;
    public Parcelable[] buttonlessDfuWithBondSharingUuids;
    public Parcelable[] buttonlessDfuWithoutBondSharingUuids;
    public int currentMtu = 23;
    public long dataObjectDelay = 0;
    public final String deviceAddress;
    public String deviceName;
    public boolean disableNotification = false;
    public boolean disableResume = false;
    public boolean enableUnsafeExperimentalButtonlessDfu = false;
    public Parcelable[] experimentalButtonlessDfuUuids;
    public String filePath;
    public int fileResId;
    public int fileType = -1;
    public Uri fileUri;
    public boolean forceDfu = false;
    public boolean forceScanningForNewAddressInLegacyDfu = false;
    public String initFilePath;
    public int initFileResId;
    public Uri initFileUri;
    public boolean keepBond;
    public Parcelable[] legacyDfuUuids;
    public int mbrSize = 4096;
    public String mimeType;
    public int mtu = 517;
    public int numberOfPackets = 12;
    public int numberOfRetries = 0;
    public Boolean packetReceiptNotificationsEnabled;
    public long rebootTime = 0;
    public boolean restoreBond;
    public long scanTimeout = 5000;
    public Parcelable[] secureDfuUuids;
    public boolean startAsForegroundService = true;

    public DfuServiceInitiator(@NonNull String str) {
        this.deviceAddress = str;
    }

    @RequiresApi(api = 26)
    public static void createDfuNotificationChannel(@NonNull Context context) {
        NotificationChannel notificationChannel = new NotificationChannel(DfuBaseService.NOTIFICATION_CHANNEL_DFU, context.getString(C9843R.string.dfu_channel_name), 2);
        notificationChannel.setDescription(context.getString(C9843R.string.dfu_channel_description));
        notificationChannel.setShowBadge(false);
        notificationChannel.setLockscreenVisibility(1);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    private DfuServiceInitiator init(@Nullable Uri uri, @Nullable String str, @RawRes int i) {
        if (!DfuBaseService.MIME_TYPE_ZIP.equals(this.mimeType)) {
            this.initFileUri = uri;
            this.initFilePath = str;
            this.initFileResId = i;
            return this;
        }
        throw new InvalidParameterException("Init file must be located inside the ZIP");
    }

    public DfuServiceInitiator disableMtuRequest() {
        this.mtu = 0;
        return this;
    }

    public DfuServiceInitiator disableResume() {
        this.disableResume = true;
        return this;
    }

    @Deprecated
    public DfuServiceInitiator setBinOrHex(int i, @NonNull Uri uri) {
        if (i != 0) {
            return init(uri, (String) null, 0, i, "application/octet-stream");
        }
        throw new UnsupportedOperationException("You must specify the file type");
    }

    public DfuServiceInitiator setCurrentMtu(@IntRange(from = 23, mo840to = 517) int i) {
        this.currentMtu = i;
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForButtonlessDfuWithBondSharing(@Nullable UUID uuid, @Nullable UUID uuid2) {
        ParcelUuid[] parcelUuidArr = new ParcelUuid[2];
        ParcelUuid parcelUuid = null;
        parcelUuidArr[0] = uuid != null ? new ParcelUuid(uuid) : null;
        if (uuid2 != null) {
            parcelUuid = new ParcelUuid(uuid2);
        }
        parcelUuidArr[1] = parcelUuid;
        this.buttonlessDfuWithBondSharingUuids = parcelUuidArr;
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForButtonlessDfuWithoutBondSharing(@Nullable UUID uuid, @Nullable UUID uuid2) {
        ParcelUuid[] parcelUuidArr = new ParcelUuid[2];
        ParcelUuid parcelUuid = null;
        parcelUuidArr[0] = uuid != null ? new ParcelUuid(uuid) : null;
        if (uuid2 != null) {
            parcelUuid = new ParcelUuid(uuid2);
        }
        parcelUuidArr[1] = parcelUuid;
        this.buttonlessDfuWithoutBondSharingUuids = parcelUuidArr;
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForExperimentalButtonlessDfu(@Nullable UUID uuid, @Nullable UUID uuid2) {
        ParcelUuid[] parcelUuidArr = new ParcelUuid[2];
        ParcelUuid parcelUuid = null;
        parcelUuidArr[0] = uuid != null ? new ParcelUuid(uuid) : null;
        if (uuid2 != null) {
            parcelUuid = new ParcelUuid(uuid2);
        }
        parcelUuidArr[1] = parcelUuid;
        this.experimentalButtonlessDfuUuids = parcelUuidArr;
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForLegacyDfu(@Nullable UUID uuid, @Nullable UUID uuid2, @Nullable UUID uuid3, @Nullable UUID uuid4) {
        ParcelUuid[] parcelUuidArr = new ParcelUuid[4];
        ParcelUuid parcelUuid = null;
        parcelUuidArr[0] = uuid != null ? new ParcelUuid(uuid) : null;
        parcelUuidArr[1] = uuid2 != null ? new ParcelUuid(uuid2) : null;
        parcelUuidArr[2] = uuid3 != null ? new ParcelUuid(uuid3) : null;
        if (uuid4 != null) {
            parcelUuid = new ParcelUuid(uuid4);
        }
        parcelUuidArr[3] = parcelUuid;
        this.legacyDfuUuids = parcelUuidArr;
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForSecureDfu(@Nullable UUID uuid, @Nullable UUID uuid2, @Nullable UUID uuid3) {
        ParcelUuid[] parcelUuidArr = new ParcelUuid[3];
        ParcelUuid parcelUuid = null;
        parcelUuidArr[0] = uuid != null ? new ParcelUuid(uuid) : null;
        parcelUuidArr[1] = uuid2 != null ? new ParcelUuid(uuid2) : null;
        if (uuid3 != null) {
            parcelUuid = new ParcelUuid(uuid3);
        }
        parcelUuidArr[2] = parcelUuid;
        this.secureDfuUuids = parcelUuidArr;
        return this;
    }

    public DfuServiceInitiator setDeviceName(@Nullable String str) {
        this.deviceName = str;
        return this;
    }

    public DfuServiceInitiator setDisableNotification(boolean z) {
        this.disableNotification = z;
        return this;
    }

    public DfuServiceInitiator setForceDfu(boolean z) {
        this.forceDfu = z;
        return this;
    }

    public DfuServiceInitiator setForceScanningForNewAddressInLegacyDfu(boolean z) {
        this.forceScanningForNewAddressInLegacyDfu = z;
        return this;
    }

    public DfuServiceInitiator setForeground(boolean z) {
        this.startAsForegroundService = z;
        return this;
    }

    @Deprecated
    public DfuServiceInitiator setInitFile(@NonNull Uri uri) {
        return init(uri, (String) null, 0);
    }

    public DfuServiceInitiator setKeepBond(boolean z) {
        this.keepBond = z;
        return this;
    }

    public DfuServiceInitiator setMbrSize(@IntRange(from = 0) int i) {
        this.mbrSize = i;
        return this;
    }

    public DfuServiceInitiator setMtu(@IntRange(from = 23, mo840to = 517) int i) {
        this.mtu = i;
        return this;
    }

    public DfuServiceInitiator setNumberOfRetries(@IntRange(from = 0) int i) {
        this.numberOfRetries = i;
        return this;
    }

    public DfuServiceInitiator setPacketsReceiptNotificationsEnabled(boolean z) {
        this.packetReceiptNotificationsEnabled = Boolean.valueOf(z);
        return this;
    }

    public DfuServiceInitiator setPacketsReceiptNotificationsValue(@IntRange(from = 0) int i) {
        if (i <= 0) {
            i = 12;
        }
        this.numberOfPackets = i;
        return this;
    }

    public DfuServiceInitiator setPrepareDataObjectDelay(long j) {
        this.dataObjectDelay = j;
        return this;
    }

    public DfuServiceInitiator setRebootTime(long j) {
        this.rebootTime = j;
        return this;
    }

    public DfuServiceInitiator setRestoreBond(boolean z) {
        this.restoreBond = z;
        return this;
    }

    public DfuServiceInitiator setScanTimeout(long j) {
        this.scanTimeout = j;
        return this;
    }

    public DfuServiceInitiator setScope(int i) {
        if (DfuBaseService.MIME_TYPE_ZIP.equals(this.mimeType)) {
            if (i == 2) {
                this.fileType = 4;
            } else if (i == 1) {
                this.fileType = 3;
            } else if (i == 3) {
                this.fileType = 0;
            } else {
                throw new UnsupportedOperationException("Unknown scope");
            }
            return this;
        }
        throw new UnsupportedOperationException("Scope can be set only for a ZIP file");
    }

    public DfuServiceInitiator setUnsafeExperimentalButtonlessServiceInSecureDfuEnabled(boolean z) {
        this.enableUnsafeExperimentalButtonlessDfu = z;
        return this;
    }

    public DfuServiceInitiator setZip(@NonNull Uri uri) {
        return init(uri, (String) null, 0, 0, DfuBaseService.MIME_TYPE_ZIP);
    }

    public DfuServiceController start(@NonNull Context context, @NonNull Class<? extends DfuBaseService> cls) {
        if (this.fileType != -1) {
            Intent intent = new Intent(context, cls);
            intent.putExtra(DfuBaseService.EXTRA_DEVICE_ADDRESS, this.deviceAddress);
            intent.putExtra(DfuBaseService.EXTRA_DEVICE_NAME, this.deviceName);
            intent.putExtra(DfuBaseService.EXTRA_DISABLE_NOTIFICATION, this.disableNotification);
            intent.putExtra(DfuBaseService.EXTRA_FOREGROUND_SERVICE, this.startAsForegroundService);
            intent.putExtra(DfuBaseService.EXTRA_FILE_MIME_TYPE, this.mimeType);
            intent.putExtra(DfuBaseService.EXTRA_FILE_TYPE, this.fileType);
            intent.putExtra(DfuBaseService.EXTRA_FILE_URI, this.fileUri);
            intent.putExtra(DfuBaseService.EXTRA_FILE_PATH, this.filePath);
            intent.putExtra(DfuBaseService.EXTRA_FILE_RES_ID, this.fileResId);
            intent.putExtra(DfuBaseService.EXTRA_INIT_FILE_URI, this.initFileUri);
            intent.putExtra(DfuBaseService.EXTRA_INIT_FILE_PATH, this.initFilePath);
            intent.putExtra(DfuBaseService.EXTRA_INIT_FILE_RES_ID, this.initFileResId);
            intent.putExtra(DfuBaseService.EXTRA_KEEP_BOND, this.keepBond);
            intent.putExtra(DfuBaseService.EXTRA_RESTORE_BOND, this.restoreBond);
            intent.putExtra(DfuBaseService.EXTRA_FORCE_DFU, this.forceDfu);
            intent.putExtra(DfuBaseService.EXTRA_FORCE_SCANNING_FOR_BOOTLOADER_IN_LEGACY_DFU, this.forceScanningForNewAddressInLegacyDfu);
            intent.putExtra(DfuBaseService.EXTRA_DISABLE_RESUME, this.disableResume);
            intent.putExtra(DfuBaseService.EXTRA_MAX_DFU_ATTEMPTS, this.numberOfRetries);
            intent.putExtra(DfuBaseService.EXTRA_MBR_SIZE, this.mbrSize);
            intent.putExtra(DfuBaseService.EXTRA_DATA_OBJECT_DELAY, this.dataObjectDelay);
            intent.putExtra(DfuBaseService.EXTRA_SCAN_TIMEOUT, this.scanTimeout);
            intent.putExtra(DfuBaseService.EXTRA_SCAN_DELAY, this.rebootTime);
            int i = this.mtu;
            if (i > 0) {
                intent.putExtra(DfuBaseService.EXTRA_MTU, i);
            }
            intent.putExtra(DfuBaseService.EXTRA_CURRENT_MTU, this.currentMtu);
            intent.putExtra(DfuBaseService.EXTRA_UNSAFE_EXPERIMENTAL_BUTTONLESS_DFU, this.enableUnsafeExperimentalButtonlessDfu);
            Boolean bool = this.packetReceiptNotificationsEnabled;
            if (bool != null) {
                intent.putExtra(DfuBaseService.EXTRA_PACKET_RECEIPT_NOTIFICATIONS_ENABLED, bool);
                intent.putExtra(DfuBaseService.EXTRA_PACKET_RECEIPT_NOTIFICATIONS_VALUE, this.numberOfPackets);
            }
            Parcelable[] parcelableArr = this.legacyDfuUuids;
            if (parcelableArr != null) {
                intent.putExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_LEGACY_DFU, parcelableArr);
            }
            Parcelable[] parcelableArr2 = this.secureDfuUuids;
            if (parcelableArr2 != null) {
                intent.putExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_SECURE_DFU, parcelableArr2);
            }
            Parcelable[] parcelableArr3 = this.experimentalButtonlessDfuUuids;
            if (parcelableArr3 != null) {
                intent.putExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_EXPERIMENTAL_BUTTONLESS_DFU, parcelableArr3);
            }
            Parcelable[] parcelableArr4 = this.buttonlessDfuWithoutBondSharingUuids;
            if (parcelableArr4 != null) {
                intent.putExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITHOUT_BOND_SHARING, parcelableArr4);
            }
            Parcelable[] parcelableArr5 = this.buttonlessDfuWithBondSharingUuids;
            if (parcelableArr5 != null) {
                intent.putExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITH_BOND_SHARING, parcelableArr5);
            }
            if (Build.VERSION.SDK_INT < 26 || !this.startAsForegroundService) {
                context.startService(intent);
            } else {
                context.startForegroundService(intent);
            }
            return new DfuServiceController(context);
        }
        throw new UnsupportedOperationException("You must specify the firmware file before starting the service");
    }

    @Deprecated
    public DfuServiceInitiator setInitFile(@Nullable String str) {
        return init((Uri) null, str, 0);
    }

    public DfuServiceInitiator setZip(@NonNull String str) {
        return init((Uri) null, str, 0, 0, DfuBaseService.MIME_TYPE_ZIP);
    }

    @Deprecated
    public DfuServiceInitiator setBinOrHex(int i, @NonNull String str) {
        if (i != 0) {
            return init((Uri) null, str, 0, i, "application/octet-stream");
        }
        throw new UnsupportedOperationException("You must specify the file type");
    }

    @Deprecated
    public DfuServiceInitiator setInitFile(@RawRes int i) {
        return init((Uri) null, (String) null, i);
    }

    public DfuServiceInitiator setZip(@RawRes int i) {
        return init((Uri) null, (String) null, i, 0, DfuBaseService.MIME_TYPE_ZIP);
    }

    @Deprecated
    public DfuServiceInitiator setInitFile(@Nullable Uri uri, @Nullable String str) {
        return init(uri, str, 0);
    }

    public DfuServiceInitiator setZip(@Nullable Uri uri, @Nullable String str) {
        return init(uri, str, 0, 0, DfuBaseService.MIME_TYPE_ZIP);
    }

    @Deprecated
    public DfuServiceInitiator setBinOrHex(int i, @Nullable Uri uri, @Nullable String str) {
        if (i != 0) {
            return init(uri, str, 0, i, "application/octet-stream");
        }
        throw new UnsupportedOperationException("You must specify the file type");
    }

    private DfuServiceInitiator init(@Nullable Uri uri, @Nullable String str, @RawRes int i, int i2, @NonNull String str2) {
        this.fileUri = uri;
        this.filePath = str;
        this.fileResId = i;
        this.fileType = i2;
        this.mimeType = str2;
        if (DfuBaseService.MIME_TYPE_ZIP.equals(str2)) {
            this.initFileUri = null;
            this.initFilePath = null;
            this.initFileResId = 0;
        }
        return this;
    }

    @Deprecated
    public DfuServiceInitiator setBinOrHex(int i, @RawRes int i2) {
        if (i != 0) {
            return init((Uri) null, (String) null, i2, i, "application/octet-stream");
        }
        throw new UnsupportedOperationException("You must specify the file type");
    }
}
