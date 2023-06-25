package p691no.nordicsemi.android.dfu;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import net.sqlcipher.database.SQLiteDatabase;
import p691no.nordicsemi.android.dfu.DfuProgressInfo;
import p691no.nordicsemi.android.dfu.internal.ArchiveInputStream;
import p691no.nordicsemi.android.dfu.internal.HexInputStream;

@SuppressLint({"MissingPermission"})
/* renamed from: no.nordicsemi.android.dfu.DfuBaseService */
public abstract class DfuBaseService extends IntentService implements DfuProgressInfo.ProgressListener {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int ACTION_ABORT = 2;
    public static final int ACTION_PAUSE = 0;
    public static final int ACTION_RESUME = 1;
    public static final String BROADCAST_ACTION = "no.nordicsemi.android.dfu.broadcast.BROADCAST_ACTION";
    public static final String BROADCAST_ERROR = "no.nordicsemi.android.dfu.broadcast.BROADCAST_ERROR";
    public static final String BROADCAST_LOG = "no.nordicsemi.android.dfu.broadcast.BROADCAST_LOG";
    public static final String BROADCAST_PROGRESS = "no.nordicsemi.android.dfu.broadcast.BROADCAST_PROGRESS";
    public static boolean DEBUG = false;
    public static final int ERROR_BLUETOOTH_DISABLED = 4106;
    public static final int ERROR_CONNECTION_MASK = 16384;
    public static final int ERROR_CONNECTION_STATE_MASK = 32768;
    public static final int ERROR_CRC_ERROR = 4109;
    public static final int ERROR_DEVICE_DISCONNECTED = 4096;
    public static final int ERROR_DEVICE_NOT_BONDED = 4110;
    public static final int ERROR_FILE_ERROR = 4098;
    public static final int ERROR_FILE_INVALID = 4099;
    public static final int ERROR_FILE_IO_EXCEPTION = 4100;
    public static final int ERROR_FILE_NOT_FOUND = 4097;
    public static final int ERROR_FILE_SIZE_INVALID = 4108;
    public static final int ERROR_FILE_TYPE_UNSUPPORTED = 4105;
    public static final int ERROR_INIT_PACKET_REQUIRED = 4107;
    public static final int ERROR_INVALID_RESPONSE = 4104;
    public static final int ERROR_MASK = 4096;
    public static final int ERROR_PROGRESS_LOST = 4111;
    public static final int ERROR_REMOTE_MASK = 8192;
    public static final int ERROR_REMOTE_TYPE_LEGACY = 256;
    public static final int ERROR_REMOTE_TYPE_SECURE = 512;
    public static final int ERROR_REMOTE_TYPE_SECURE_BUTTONLESS = 2048;
    public static final int ERROR_REMOTE_TYPE_SECURE_EXTENDED = 1024;
    public static final int ERROR_SERVICE_DISCOVERY_NOT_STARTED = 4101;
    public static final int ERROR_SERVICE_NOT_FOUND = 4102;
    public static final int ERROR_TYPE_COMMUNICATION = 2;
    public static final int ERROR_TYPE_COMMUNICATION_STATE = 1;
    public static final int ERROR_TYPE_DFU_REMOTE = 3;
    public static final int ERROR_TYPE_OTHER = 0;
    public static final String EXTRA_ACTION = "no.nordicsemi.android.dfu.extra.EXTRA_ACTION";
    public static final String EXTRA_AVG_SPEED_B_PER_MS = "no.nordicsemi.android.dfu.extra.EXTRA_AVG_SPEED_B_PER_MS";
    public static final String EXTRA_CURRENT_MTU = "no.nordicsemi.android.dfu.extra.EXTRA_CURRENT_MTU";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITHOUT_BOND_SHARING = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITHOUT_BOND_SHARING";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITH_BOND_SHARING = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITH_BOND_SHARING";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_EXPERIMENTAL_BUTTONLESS_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_EXPERIMENTAL_BUTTONLESS_DFU";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_LEGACY_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_LEGACY_DFU";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_SECURE_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_SECURE_DFU";
    public static final String EXTRA_DATA = "no.nordicsemi.android.dfu.extra.EXTRA_DATA";
    public static final String EXTRA_DATA_OBJECT_DELAY = "no.nordicsemi.android.dfu.extra.EXTRA_DATA_OBJECT_DELAY";
    public static final String EXTRA_DEVICE_ADDRESS = "no.nordicsemi.android.dfu.extra.EXTRA_DEVICE_ADDRESS";
    public static final String EXTRA_DEVICE_NAME = "no.nordicsemi.android.dfu.extra.EXTRA_DEVICE_NAME";
    public static final String EXTRA_DFU_ATTEMPT = "no.nordicsemi.android.dfu.extra.EXTRA_DFU_ATTEMPT";
    public static final String EXTRA_DISABLE_NOTIFICATION = "no.nordicsemi.android.dfu.extra.EXTRA_DISABLE_NOTIFICATION";
    public static final String EXTRA_DISABLE_RESUME = "no.nordicsemi.android.dfu.extra.EXTRA_DISABLE_RESUME";
    public static final String EXTRA_ERROR_TYPE = "no.nordicsemi.android.dfu.extra.EXTRA_ERROR_TYPE";
    public static final String EXTRA_FILE_MIME_TYPE = "no.nordicsemi.android.dfu.extra.EXTRA_MIME_TYPE";
    public static final String EXTRA_FILE_PATH = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_PATH";
    public static final String EXTRA_FILE_RES_ID = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_RES_ID";
    public static final String EXTRA_FILE_TYPE = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_TYPE";
    public static final String EXTRA_FILE_URI = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_URI";
    public static final String EXTRA_FORCE_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_FORCE_DFU";
    public static final String EXTRA_FORCE_SCANNING_FOR_BOOTLOADER_IN_LEGACY_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_FORCE_SCANNING_FOR_BOOTLOADER_IN_LEGACY_DFU";
    public static final String EXTRA_FOREGROUND_SERVICE = "no.nordicsemi.android.dfu.extra.EXTRA_FOREGROUND_SERVICE";
    public static final String EXTRA_INIT_FILE_PATH = "no.nordicsemi.android.dfu.extra.EXTRA_INIT_FILE_PATH";
    public static final String EXTRA_INIT_FILE_RES_ID = "no.nordicsemi.android.dfu.extra.EXTRA_INIT_FILE_RES_ID";
    public static final String EXTRA_INIT_FILE_URI = "no.nordicsemi.android.dfu.extra.EXTRA_INIT_FILE_URI";
    public static final String EXTRA_KEEP_BOND = "no.nordicsemi.android.dfu.extra.EXTRA_KEEP_BOND";
    public static final String EXTRA_LOG_LEVEL = "no.nordicsemi.android.dfu.extra.EXTRA_LOG_LEVEL";
    public static final String EXTRA_LOG_MESSAGE = "no.nordicsemi.android.dfu.extra.EXTRA_LOG_INFO";
    public static final String EXTRA_MAX_DFU_ATTEMPTS = "no.nordicsemi.android.dfu.extra.EXTRA_MAX_DFU_ATTEMPTS";
    public static final String EXTRA_MBR_SIZE = "no.nordicsemi.android.dfu.extra.EXTRA_MBR_SIZE";
    public static final String EXTRA_MTU = "no.nordicsemi.android.dfu.extra.EXTRA_MTU";
    public static final String EXTRA_PACKET_RECEIPT_NOTIFICATIONS_ENABLED = "no.nordicsemi.android.dfu.extra.EXTRA_PRN_ENABLED";
    public static final String EXTRA_PACKET_RECEIPT_NOTIFICATIONS_VALUE = "no.nordicsemi.android.dfu.extra.EXTRA_PRN_VALUE";
    public static final String EXTRA_PARTS_TOTAL = "no.nordicsemi.android.dfu.extra.EXTRA_PARTS_TOTAL";
    public static final String EXTRA_PART_CURRENT = "no.nordicsemi.android.dfu.extra.EXTRA_PART_CURRENT";
    public static final String EXTRA_PROGRESS = "no.nordicsemi.android.dfu.extra.EXTRA_PROGRESS";
    public static final String EXTRA_RECONNECTION_ATTEMPT = "no.nordicsemi.android.dfu.extra.EXTRA_RECONNECTION_ATTEMPT";
    public static final String EXTRA_RESTORE_BOND = "no.nordicsemi.android.dfu.extra.EXTRA_RESTORE_BOND";
    public static final String EXTRA_SCAN_DELAY = "no.nordicsemi.android.dfu.extra.EXTRA_SCAN_DELAY";
    public static final String EXTRA_SCAN_TIMEOUT = "no.nordicsemi.android.dfu.extra.EXTRA_SCAN_TIMEOUT";
    public static final String EXTRA_SPEED_B_PER_MS = "no.nordicsemi.android.dfu.extra.EXTRA_SPEED_B_PER_MS";
    public static final String EXTRA_UNSAFE_EXPERIMENTAL_BUTTONLESS_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_UNSAFE_EXPERIMENTAL_BUTTONLESS_DFU";
    public static final int LOG_LEVEL_APPLICATION = 10;
    public static final int LOG_LEVEL_DEBUG = 0;
    public static final int LOG_LEVEL_ERROR = 20;
    public static final int LOG_LEVEL_INFO = 5;
    public static final int LOG_LEVEL_VERBOSE = 1;
    public static final int LOG_LEVEL_WARNING = 15;
    public static final String MIME_TYPE_OCTET_STREAM = "application/octet-stream";
    public static final String MIME_TYPE_ZIP = "application/zip";
    public static final String NOTIFICATION_CHANNEL_DFU = "dfu";
    public static final int NOTIFICATION_ID = 283;
    public static final int PROGRESS_ABORTED = -7;
    public static final int PROGRESS_COMPLETED = -6;
    public static final int PROGRESS_CONNECTING = -1;
    public static final int PROGRESS_DISCONNECTING = -5;
    public static final int PROGRESS_ENABLING_DFU_MODE = -3;
    public static final int PROGRESS_STARTING = -2;
    public static final int PROGRESS_VALIDATING = -4;
    public static final int STATE_CLOSED = -5;
    public static final int STATE_CONNECTED = -2;
    public static final int STATE_CONNECTED_AND_READY = -3;
    public static final int STATE_CONNECTING = -1;
    public static final int STATE_DISCONNECTED = 0;
    public static final int STATE_DISCONNECTING = -4;
    public static final String TAG = "DfuBaseService";
    public static final int TYPE_APPLICATION = 4;
    public static final int TYPE_AUTO = 0;
    public static final int TYPE_BOOTLOADER = 2;
    public static final int TYPE_SOFT_DEVICE = 1;
    public boolean mAborted;
    public BluetoothAdapter mBluetoothAdapter;
    public final BroadcastReceiver mBluetoothStateBroadcastReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
            int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", 12);
            DfuBaseService dfuBaseService = DfuBaseService.this;
            dfuBaseService.logw("Action received: android.bluetooth.adapter.action.STATE_CHANGED [state: " + intExtra + ", previous state: " + intExtra2 + "]");
            if (intExtra2 != 12) {
                return;
            }
            if (intExtra == 13 || intExtra == 10) {
                DfuBaseService.this.sendLogBroadcast(15, "Bluetooth adapter disabled");
                DfuBaseService dfuBaseService2 = DfuBaseService.this;
                dfuBaseService2.mConnectionState = 0;
                if (dfuBaseService2.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDisconnected();
                }
                synchronized (DfuBaseService.this.mLock) {
                    DfuBaseService.this.mLock.notifyAll();
                }
            }
        }
    };
    public final BroadcastReceiver mBondStateBroadcastReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            int intExtra;
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice != null && bluetoothDevice.getAddress().equals(DfuBaseService.this.mDeviceAddress) && (intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1)) != 11 && DfuBaseService.this.mDfuServiceImpl != null) {
                DfuBaseService.this.mDfuServiceImpl.onBondStateChanged(intExtra);
            }
        }
    };
    public int mConnectionState;
    public final BroadcastReceiver mConnectionStateBroadcastReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice != null && bluetoothDevice.getAddress().equals(DfuBaseService.this.mDeviceAddress)) {
                String action = intent.getAction();
                DfuBaseService dfuBaseService = DfuBaseService.this;
                dfuBaseService.logi("Action received: " + action);
                DfuBaseService dfuBaseService2 = DfuBaseService.this;
                dfuBaseService2.sendLogBroadcast(0, "[Broadcast] Action received: " + action);
            }
        }
    };
    public String mDeviceAddress;
    public String mDeviceName;
    public final BroadcastReceiver mDfuActionReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_ACTION, 0);
            DfuBaseService dfuBaseService = DfuBaseService.this;
            dfuBaseService.logi("User action received: " + intExtra);
            if (intExtra == 0) {
                DfuBaseService.this.sendLogBroadcast(15, "[Broadcast] Pause action received");
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.pause();
                }
            } else if (intExtra == 1) {
                DfuBaseService.this.sendLogBroadcast(15, "[Broadcast] Resume action received");
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.resume();
                }
            } else if (intExtra == 2) {
                DfuBaseService.this.sendLogBroadcast(15, "[Broadcast] Abort action received");
                boolean unused = DfuBaseService.this.mAborted = true;
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.abort();
                }
            }
        }
    };
    public DfuCallback mDfuServiceImpl;
    public boolean mDisableNotification;
    public int mError;
    public InputStream mFirmwareInputStream;
    public final BluetoothGattCallback mGattCallback = new BluetoothGattCallback() {
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            if (DfuBaseService.this.mDfuServiceImpl != null) {
                DfuBaseService.this.mDfuServiceImpl.getGattCallback().onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            }
        }

        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (DfuBaseService.this.mDfuServiceImpl != null) {
                DfuBaseService.this.mDfuServiceImpl.getGattCallback().onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
            }
        }

        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (DfuBaseService.this.mDfuServiceImpl != null) {
                DfuBaseService.this.mDfuServiceImpl.getGattCallback().onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            }
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            if (i != 0) {
                if (i == 8 || i == 19) {
                    DfuBaseService dfuBaseService = DfuBaseService.this;
                    dfuBaseService.logw("Target device disconnected with status: " + i);
                } else {
                    DfuBaseService dfuBaseService2 = DfuBaseService.this;
                    dfuBaseService2.loge("Connection state change error: " + i + " newState: " + i2);
                }
                int unused = DfuBaseService.this.mError = i | 32768;
                if (i2 == 0) {
                    DfuBaseService dfuBaseService3 = DfuBaseService.this;
                    dfuBaseService3.mConnectionState = 0;
                    if (dfuBaseService3.mDfuServiceImpl != null) {
                        DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDisconnected();
                    }
                }
            } else if (i2 == 2) {
                DfuBaseService.this.logi("Connected to GATT server");
                DfuBaseService dfuBaseService4 = DfuBaseService.this;
                dfuBaseService4.sendLogBroadcast(5, "Connected to " + DfuBaseService.this.mDeviceAddress);
                DfuBaseService.this.mConnectionState = -2;
                if (bluetoothGatt.getDevice().getBondState() == 12) {
                    DfuBaseService.this.logi("Waiting 1600 ms for a possible Service Changed indication...");
                    DfuBaseService.this.waitFor(1600);
                }
                DfuBaseService.this.sendLogBroadcast(1, "Discovering services...");
                DfuBaseService.this.sendLogBroadcast(0, "gatt.discoverServices()");
                boolean discoverServices = bluetoothGatt.discoverServices();
                DfuBaseService dfuBaseService5 = DfuBaseService.this;
                StringBuilder sb = new StringBuilder();
                sb.append("Attempting to start service discovery... ");
                sb.append(discoverServices ? "succeed" : "failed");
                dfuBaseService5.logi(sb.toString());
                if (!discoverServices) {
                    int unused2 = DfuBaseService.this.mError = DfuBaseService.ERROR_SERVICE_DISCOVERY_NOT_STARTED;
                } else {
                    return;
                }
            } else if (i2 == 0) {
                DfuBaseService.this.logi("Disconnected from GATT server");
                DfuBaseService dfuBaseService6 = DfuBaseService.this;
                dfuBaseService6.mConnectionState = 0;
                if (dfuBaseService6.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDisconnected();
                }
            }
            synchronized (DfuBaseService.this.mLock) {
                DfuBaseService.this.mLock.notifyAll();
            }
        }

        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            if (DfuBaseService.this.mDfuServiceImpl != null) {
                DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
            }
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            if (DfuBaseService.this.mDfuServiceImpl != null) {
                DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            }
        }

        @SuppressLint({"NewApi"})
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            if (DfuBaseService.this.mDfuServiceImpl != null) {
                DfuBaseService.this.mDfuServiceImpl.getGattCallback().onMtuChanged(bluetoothGatt, i, i2);
            }
        }

        @SuppressLint({"NewApi"})
        public void onPhyUpdate(BluetoothGatt bluetoothGatt, int i, int i2, int i3) {
            if (DfuBaseService.this.mDfuServiceImpl != null) {
                DfuBaseService.this.mDfuServiceImpl.getGattCallback().onPhyUpdate(bluetoothGatt, i, i2, i3);
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            if (i == 0) {
                DfuBaseService.this.logi("Services discovered");
                DfuBaseService.this.mConnectionState = -3;
            } else {
                DfuBaseService dfuBaseService = DfuBaseService.this;
                dfuBaseService.loge("Service discovery error: " + i);
                int unused = DfuBaseService.this.mError = i | 16384;
            }
            synchronized (DfuBaseService.this.mLock) {
                DfuBaseService.this.mLock.notifyAll();
            }
        }
    };
    public InputStream mInitFileInputStream;
    public long mLastNotificationTime;
    public int mLastProgress = -1;
    public final Object mLock = new Object();
    public DfuProgressInfo mProgressInfo;

    static {
        Class<DfuBaseService> cls = DfuBaseService.class;
    }

    public DfuBaseService() {
        super(TAG);
    }

    private boolean initialize() {
        BluetoothManager bluetoothManager = (BluetoothManager) getSystemService("bluetooth");
        if (bluetoothManager == null) {
            loge("Unable to initialize BluetoothManager.");
            return false;
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.mBluetoothAdapter = adapter;
        if (adapter != null) {
            return true;
        }
        loge("Unable to obtain a BluetoothAdapter.");
        return false;
    }

    /* access modifiers changed from: private */
    public void loge(String str) {
    }

    private void loge(String str, Throwable th) {
    }

    /* access modifiers changed from: private */
    public void logi(String str) {
        boolean z = DEBUG;
    }

    /* access modifiers changed from: private */
    public void logw(String str) {
        boolean z = DEBUG;
    }

    public static IntentFilter makeDfuActionIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BROADCAST_ACTION);
        return intentFilter;
    }

    private InputStream openInputStream(@NonNull String str, String str2, int i, int i2) {
        FileInputStream fileInputStream = new FileInputStream(str);
        if (MIME_TYPE_ZIP.equals(str2)) {
            return new ArchiveInputStream(fileInputStream, i, i2);
        }
        return str.toLowerCase(Locale.US).endsWith("hex") ? new HexInputStream((InputStream) fileInputStream, i) : fileInputStream;
    }

    private void report(int i) {
        sendErrorBroadcast(i);
        if (!this.mDisableNotification) {
            String str = this.mDeviceAddress;
            String str2 = this.mDeviceName;
            if (str2 == null) {
                str2 = getString(C9843R.string.dfu_unknown_name);
            }
            NotificationCompat.Builder autoCancel = new NotificationCompat.Builder((Context) this, NOTIFICATION_CHANNEL_DFU).setSmallIcon(17301640).setOnlyAlertOnce(true).setColor(SupportMenu.CATEGORY_MASK).setOngoing(false).setContentTitle(getString(C9843R.string.dfu_status_error)).setSmallIcon(17301641).setContentText(getString(C9843R.string.dfu_status_error_msg)).setAutoCancel(true);
            Intent intent = new Intent(this, getNotificationTarget());
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            intent.putExtra(EXTRA_DEVICE_ADDRESS, str);
            intent.putExtra(EXTRA_DEVICE_NAME, str2);
            intent.putExtra(EXTRA_PROGRESS, i);
            int i2 = 134217728;
            if (Build.VERSION.SDK_INT >= 23) {
                i2 = 201326592;
            }
            autoCancel.setContentIntent(PendingIntent.getActivity(this, 0, intent, i2));
            updateErrorNotification(autoCancel);
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.notify(NOTIFICATION_ID, autoCancel.build());
            }
        }
    }

    private void sendErrorBroadcast(int i) {
        Intent intent = new Intent(BROADCAST_ERROR);
        if ((i & 16384) > 0) {
            intent.putExtra(EXTRA_DATA, i & -16385);
            intent.putExtra(EXTRA_ERROR_TYPE, 2);
        } else if ((32768 & i) > 0) {
            intent.putExtra(EXTRA_DATA, i & -32769);
            intent.putExtra(EXTRA_ERROR_TYPE, 1);
        } else if ((i & 8192) > 0) {
            intent.putExtra(EXTRA_DATA, i & -8193);
            intent.putExtra(EXTRA_ERROR_TYPE, 3);
        } else {
            intent.putExtra(EXTRA_DATA, i);
            intent.putExtra(EXTRA_ERROR_TYPE, 0);
        }
        intent.putExtra(EXTRA_DEVICE_ADDRESS, this.mDeviceAddress);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    private void sendProgressBroadcast(DfuProgressInfo dfuProgressInfo) {
        Intent intent = new Intent(BROADCAST_PROGRESS);
        intent.putExtra(EXTRA_DATA, dfuProgressInfo.getProgress());
        intent.putExtra(EXTRA_DEVICE_ADDRESS, this.mDeviceAddress);
        intent.putExtra(EXTRA_PART_CURRENT, dfuProgressInfo.getCurrentPart());
        intent.putExtra(EXTRA_PARTS_TOTAL, dfuProgressInfo.getTotalParts());
        intent.putExtra(EXTRA_SPEED_B_PER_MS, dfuProgressInfo.getSpeed());
        intent.putExtra(EXTRA_AVG_SPEED_B_PER_MS, dfuProgressInfo.getAverageSpeed());
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    private void startForeground() {
        NotificationCompat.Builder ongoing = new NotificationCompat.Builder((Context) this, NOTIFICATION_CHANNEL_DFU).setSmallIcon(17301640).setContentTitle(getString(C9843R.string.dfu_status_foreground_title)).setContentText(getString(C9843R.string.dfu_status_foreground_content)).setColor(-7829368).setPriority(-1).setOngoing(true);
        Class<? extends Activity> notificationTarget = getNotificationTarget();
        if (notificationTarget != null) {
            Intent intent = new Intent(this, notificationTarget);
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            intent.putExtra(EXTRA_DEVICE_ADDRESS, this.mDeviceAddress);
            intent.putExtra(EXTRA_DEVICE_NAME, this.mDeviceName);
            int i = 134217728;
            if (Build.VERSION.SDK_INT >= 23) {
                i = 201326592;
            }
            ongoing.setContentIntent(PendingIntent.getActivity(this, 0, intent, i));
        } else {
            logw("getNotificationTarget() should not return null if the service is to be started as a foreground service");
        }
        updateForegroundNotification(ongoing);
        startForeground(NOTIFICATION_ID, ongoing.build());
    }

    public void close(@NonNull BluetoothGatt bluetoothGatt) {
        logi("Cleaning up...");
        sendLogBroadcast(0, "gatt.disconnect()");
        bluetoothGatt.disconnect();
        sendLogBroadcast(0, "gatt.close()");
        bluetoothGatt.close();
        this.mConnectionState = -5;
    }

    public BluetoothGatt connect(@NonNull String str) {
        BluetoothGatt bluetoothGatt;
        if (!this.mBluetoothAdapter.isEnabled()) {
            return null;
        }
        this.mConnectionState = -1;
        logi("Connecting to the device...");
        BluetoothDevice remoteDevice = this.mBluetoothAdapter.getRemoteDevice(str);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            sendLogBroadcast(0, "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE, preferredPhy = LE_1M | LE_2M)");
            bluetoothGatt = remoteDevice.connectGatt(this, false, this.mGattCallback, 2, 3);
        } else if (i >= 23) {
            sendLogBroadcast(0, "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE)");
            bluetoothGatt = remoteDevice.connectGatt(this, false, this.mGattCallback, 2);
        } else {
            sendLogBroadcast(0, "gatt = device.connectGatt(autoConnect = false)");
            bluetoothGatt = remoteDevice.connectGatt(this, false, this.mGattCallback);
        }
        try {
            synchronized (this.mLock) {
                while (true) {
                    if ((this.mConnectionState == -1 || this.mConnectionState == -2) && this.mError == 0 && !this.mAborted) {
                        this.mLock.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            loge("Sleeping interrupted", e);
        }
        return bluetoothGatt;
    }

    public void disconnect(@NonNull BluetoothGatt bluetoothGatt) {
        if (this.mConnectionState != 0) {
            sendLogBroadcast(1, "Disconnecting...");
            this.mProgressInfo.setProgress(-5);
            this.mConnectionState = -4;
            logi("Disconnecting from the device...");
            sendLogBroadcast(0, "gatt.disconnect()");
            bluetoothGatt.disconnect();
            waitUntilDisconnected();
            sendLogBroadcast(5, "Disconnected");
        }
    }

    @NonNull
    public DfuDeviceSelector getDeviceSelector() {
        return new DfuDefaultDeviceSelector();
    }

    @Nullable
    public abstract Class<? extends Activity> getNotificationTarget();

    public boolean isDebug() {
        return false;
    }

    public void onCreate() {
        super.onCreate();
        DEBUG = isDebug();
        logi("DFU service created. Version: 2.3.0");
        initialize();
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this);
        IntentFilter makeDfuActionIntentFilter = makeDfuActionIntentFilter();
        instance.registerReceiver(this.mDfuActionReceiver, makeDfuActionIntentFilter);
        registerReceiver(this.mDfuActionReceiver, makeDfuActionIntentFilter);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        registerReceiver(this.mConnectionStateBroadcastReceiver, intentFilter);
        registerReceiver(this.mBondStateBroadcastReceiver, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
        registerReceiver(this.mBluetoothStateBroadcastReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    public void onDestroy() {
        super.onDestroy();
        DfuCallback dfuCallback = this.mDfuServiceImpl;
        if (dfuCallback != null) {
            dfuCallback.abort();
        }
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.mDfuActionReceiver);
        unregisterReceiver(this.mDfuActionReceiver);
        unregisterReceiver(this.mConnectionStateBroadcastReceiver);
        unregisterReceiver(this.mBondStateBroadcastReceiver);
        unregisterReceiver(this.mBluetoothStateBroadcastReceiver);
        try {
            if (this.mFirmwareInputStream != null) {
                this.mFirmwareInputStream.close();
            }
            if (this.mInitFileInputStream != null) {
                this.mInitFileInputStream.close();
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.mFirmwareInputStream = null;
            this.mInitFileInputStream = null;
            throw th;
        }
        this.mFirmwareInputStream = null;
        this.mInitFileInputStream = null;
        logi("DFU service destroyed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0439, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x043b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x043c, code lost:
        r3 = r0;
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0440, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0441, code lost:
        r3 = r0;
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0444, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0445, code lost:
        r15 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0446, code lost:
        r3 = r0;
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x044a, code lost:
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x045b, code lost:
        r4 = r4 & -32769;
        sendLogBroadcast(20, java.lang.String.format(java.util.Locale.US, "Error (0x%02X): %s", new java.lang.Object[]{java.lang.Integer.valueOf(r4), p641l.p642a.p643a.p647b.C9599a.m25759b(r4)}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x047e, code lost:
        r4 = r4 & -16385;
        sendLogBroadcast(20, java.lang.String.format(java.util.Locale.US, "Error (0x%02X): %s", new java.lang.Object[]{java.lang.Integer.valueOf(r4), p641l.p642a.p643a.p647b.C9599a.m25758a(r4)}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04ac, code lost:
        if (r2 != null) goto L_0x04ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:?, code lost:
        r2.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x04d6, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("Restarting the service (");
        r3 = r3 + 1;
        r5.append(r3);
        r5.append(" /");
        r5.append(r4);
        r5.append(")");
        logi(r5.toString());
        r4 = new android.content.Intent();
        r4.fillIn(r8, 24);
        r4.putExtra(EXTRA_DFU_ATTEMPT, r3);
        startService(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x050b, code lost:
        if (r2 != null) goto L_0x050d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:?, code lost:
        r2.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0510, code lost:
        if (r12 != false) goto L_0x0512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0512, code lost:
        stopForeground(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:?, code lost:
        report(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0519, code lost:
        if (r2 != null) goto L_0x051b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x052d, code lost:
        if (r2 != null) goto L_0x04ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:?, code lost:
        r2.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010b, code lost:
        if (r4 < 0) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0116, code lost:
        if (r4 < 0) goto L_0x0118;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x021f A[Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189, all -> 0x0185 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0247 A[SYNTHETIC, Splitter:B:146:0x0247] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x043b A[ExcHandler: all (r0v7 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:218:0x0404] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0440 A[ExcHandler: DfuException (r0v6 'e' no.nordicsemi.android.dfu.internal.exception.DfuException A[CUSTOM_DECLARE]), Splitter:B:218:0x0404] */
    /* JADX WARNING: Removed duplicated region for block: B:248:? A[ExcHandler: UploadAbortedException (unused no.nordicsemi.android.dfu.internal.exception.UploadAbortedException), SYNTHETIC, Splitter:B:218:0x0404] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x045b A[Catch:{ all -> 0x044d }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x047e A[Catch:{ all -> 0x044d }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04d6 A[Catch:{ all -> 0x044d }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0516 A[SYNTHETIC, Splitter:B:275:0x0516] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0539 A[SYNTHETIC, Splitter:B:285:0x0539] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x05d4  */
    /* JADX WARNING: Removed duplicated region for block: B:335:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(@androidx.annotation.Nullable android.content.Intent r26) {
        /*
            r25 = this;
            r1 = r25
            r8 = r26
            java.lang.String r2 = "Bluetooth adapter disabled"
            if (r8 != 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r3 = "no.nordicsemi.android.dfu.extra.EXTRA_DEVICE_ADDRESS"
            java.lang.String r3 = r8.getStringExtra(r3)
            java.lang.String r4 = "no.nordicsemi.android.dfu.extra.EXTRA_DEVICE_NAME"
            java.lang.String r4 = r8.getStringExtra(r4)
            java.lang.String r5 = "no.nordicsemi.android.dfu.extra.EXTRA_DISABLE_NOTIFICATION"
            r9 = 0
            boolean r10 = r8.getBooleanExtra(r5, r9)
            java.lang.String r5 = "no.nordicsemi.android.dfu.extra.EXTRA_FOREGROUND_SERVICE"
            r11 = 1
            boolean r12 = r8.getBooleanExtra(r5, r11)
            java.lang.String r5 = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_PATH"
            java.lang.String r5 = r8.getStringExtra(r5)
            java.lang.String r6 = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_URI"
            android.os.Parcelable r6 = r8.getParcelableExtra(r6)
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.String r7 = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_RES_ID"
            int r7 = r8.getIntExtra(r7, r9)
            java.lang.String r13 = "no.nordicsemi.android.dfu.extra.EXTRA_INIT_FILE_PATH"
            java.lang.String r13 = r8.getStringExtra(r13)
            java.lang.String r14 = "no.nordicsemi.android.dfu.extra.EXTRA_INIT_FILE_URI"
            android.os.Parcelable r14 = r8.getParcelableExtra(r14)
            android.net.Uri r14 = (android.net.Uri) r14
            java.lang.String r15 = "no.nordicsemi.android.dfu.extra.EXTRA_INIT_FILE_RES_ID"
            int r15 = r8.getIntExtra(r15, r9)
            java.lang.String r11 = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_TYPE"
            int r11 = r8.getIntExtra(r11, r9)
            if (r5 == 0) goto L_0x0066
            if (r11 != 0) goto L_0x0066
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r11 = r5.toLowerCase(r11)
            java.lang.String r9 = "zip"
            boolean r9 = r11.endsWith(r9)
            if (r9 == 0) goto L_0x0065
            r11 = 0
            goto L_0x0066
        L_0x0065:
            r11 = 4
        L_0x0066:
            java.lang.String r9 = "no.nordicsemi.android.dfu.extra.EXTRA_MIME_TYPE"
            java.lang.String r9 = r8.getStringExtra(r9)
            r17 = r2
            java.lang.String r2 = "application/zip"
            r18 = r15
            java.lang.String r15 = "application/octet-stream"
            if (r9 == 0) goto L_0x0077
            goto L_0x007c
        L_0x0077:
            if (r11 != 0) goto L_0x007b
            r9 = r2
            goto L_0x007c
        L_0x007b:
            r9 = r15
        L_0x007c:
            if (r3 == 0) goto L_0x05e8
            if (r5 != 0) goto L_0x0086
            if (r6 != 0) goto L_0x0086
            if (r7 != 0) goto L_0x0086
            goto L_0x05e8
        L_0x0086:
            r19 = r11 & -8
            r20 = r13
            if (r19 > 0) goto L_0x05d8
            boolean r19 = r2.equals(r9)
            if (r19 != 0) goto L_0x009a
            boolean r19 = r15.equals(r9)
            if (r19 != 0) goto L_0x009a
            goto L_0x05d8
        L_0x009a:
            boolean r15 = r15.equals(r9)
            r13 = 2
            if (r15 == 0) goto L_0x00b9
            r15 = 1
            if (r11 == r15) goto L_0x00b9
            if (r11 == r13) goto L_0x00b9
            r15 = 4
            if (r11 == r15) goto L_0x00b9
            java.lang.String r2 = "Unable to determine file type"
            r1.logw(r2)
            r3 = 15
            r1.sendLogBroadcast(r3, r2)
            r2 = 4105(0x1009, float:5.752E-42)
            r1.report(r2)
            return
        L_0x00b9:
            if (r10 != 0) goto L_0x00ca
            java.lang.Class r15 = r25.getNotificationTarget()
            if (r15 == 0) goto L_0x00c2
            goto L_0x00ca
        L_0x00c2:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "getNotificationTarget() must not return null if notifications are enabled"
            r2.<init>(r3)
            throw r2
        L_0x00ca:
            if (r12 != 0) goto L_0x00d7
            int r15 = android.os.Build.VERSION.SDK_INT
            r13 = 26
            if (r15 < r13) goto L_0x00d7
            java.lang.String r13 = "Foreground service disabled. Android Oreo or newer may kill a background service few moments after user closes the application.\nConsider enabling foreground service using DfuServiceInitiator#setForeground(boolean)"
            r1.logw(r13)
        L_0x00d7:
            p691no.nordicsemi.android.dfu.UuidHelper.assignCustomUuids(r26)
            if (r12 == 0) goto L_0x00e4
            java.lang.String r13 = "Starting DFU service in foreground"
            r1.logi(r13)
            r25.startForeground()
        L_0x00e4:
            r1.mDeviceAddress = r3
            r1.mDeviceName = r4
            r1.mDisableNotification = r10
            r4 = 0
            r1.mConnectionState = r4
            r1.mError = r4
            android.content.SharedPreferences r4 = android.preference.PreferenceManager.getDefaultSharedPreferences(r25)
            java.lang.String r13 = "settings_mbr_size"
            boolean r15 = r4.contains(r13)
            r21 = r3
            r3 = 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0110
            java.lang.String r15 = java.lang.String.valueOf(r3)
            java.lang.String r4 = r4.getString(r13, r15)
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x010e }
            if (r4 >= 0) goto L_0x0119
            goto L_0x0118
        L_0x010e:
            r4 = r3
            goto L_0x0119
        L_0x0110:
            java.lang.String r4 = "no.nordicsemi.android.dfu.extra.EXTRA_MBR_SIZE"
            int r4 = r8.getIntExtra(r4, r3)
            if (r4 >= 0) goto L_0x0119
        L_0x0118:
            r4 = 0
        L_0x0119:
            java.lang.String r13 = "DFU service started"
            r15 = 1
            r1.sendLogBroadcast(r15, r13)
            java.io.InputStream r13 = r1.mFirmwareInputStream
            java.io.InputStream r15 = r1.mInitFileInputStream
            if (r13 != 0) goto L_0x0128
            r22 = 1
            goto L_0x012a
        L_0x0128:
            r22 = 0
        L_0x012a:
            java.lang.String r3 = "Opening file failed: "
            r23 = r13
            if (r22 == 0) goto L_0x019d
            java.lang.String r13 = "Opening file..."
            r24 = r15
            r15 = 1
            r1.sendLogBroadcast(r15, r13)     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            if (r6 == 0) goto L_0x013f
            java.io.InputStream r13 = r1.openInputStream((android.net.Uri) r6, (java.lang.String) r9, (int) r4, (int) r11)     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            goto L_0x014f
        L_0x013f:
            if (r5 == 0) goto L_0x0146
            java.io.InputStream r13 = r1.openInputStream((java.lang.String) r5, (java.lang.String) r9, (int) r4, (int) r11)     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            goto L_0x014f
        L_0x0146:
            if (r7 <= 0) goto L_0x014d
            java.io.InputStream r13 = r1.openInputStream((int) r7, (java.lang.String) r9, (int) r4, (int) r11)     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            goto L_0x014f
        L_0x014d:
            r13 = r23
        L_0x014f:
            if (r14 == 0) goto L_0x015a
            android.content.ContentResolver r4 = r25.getContentResolver()     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            java.io.InputStream r15 = r4.openInputStream(r14)     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            goto L_0x0173
        L_0x015a:
            if (r20 == 0) goto L_0x0164
            java.io.FileInputStream r15 = new java.io.FileInputStream     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            r4 = r20
            r15.<init>(r4)     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            goto L_0x0173
        L_0x0164:
            if (r18 <= 0) goto L_0x0171
            android.content.res.Resources r4 = r25.getResources()     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            r5 = r18
            java.io.InputStream r15 = r4.openRawResource(r5)     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            goto L_0x0173
        L_0x0171:
            r15 = r24
        L_0x0173:
            int r4 = r13.available()     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            r5 = 4
            int r4 = r4 % r5
            if (r4 != 0) goto L_0x017d
            r6 = r13
            goto L_0x01a1
        L_0x017d:
            no.nordicsemi.android.dfu.internal.exception.SizeValidationException r2 = new no.nordicsemi.android.dfu.internal.exception.SizeValidationException     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            java.lang.String r4 = "The new firmware is not word-aligned."
            r2.<init>(r4)     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            throw r2     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
        L_0x0185:
            r0 = move-exception
        L_0x0186:
            r2 = r0
            goto L_0x05d2
        L_0x0189:
            r0 = move-exception
            r2 = r0
            goto L_0x053d
        L_0x018d:
            r0 = move-exception
            r2 = r0
            goto L_0x0565
        L_0x0191:
            r0 = move-exception
            r2 = r0
            goto L_0x058d
        L_0x0195:
            r0 = move-exception
            r2 = r0
            goto L_0x05a4
        L_0x0199:
            r0 = move-exception
            r2 = r0
            goto L_0x05bb
        L_0x019d:
            r24 = r15
            r6 = r23
        L_0x01a1:
            boolean r2 = r2.equals(r9)     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            if (r2 == 0) goto L_0x021b
            r2 = r6
            no.nordicsemi.android.dfu.internal.ArchiveInputStream r2 = (p691no.nordicsemi.android.dfu.internal.ArchiveInputStream) r2     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            if (r11 != 0) goto L_0x01b1
            int r4 = r2.getContentType()     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            goto L_0x01b5
        L_0x01b1:
            int r4 = r2.setContentType(r11)     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
        L_0x01b5:
            r5 = r4 & 4
            if (r5 <= 0) goto L_0x01ca
            int r5 = r2.applicationImageSize()     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            r7 = 4
            int r5 = r5 % r7
            if (r5 != 0) goto L_0x01c2
            goto L_0x01ca
        L_0x01c2:
            no.nordicsemi.android.dfu.internal.exception.SizeValidationException r2 = new no.nordicsemi.android.dfu.internal.exception.SizeValidationException     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            java.lang.String r4 = "Application firmware is not word-aligned."
            r2.<init>(r4)     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            throw r2     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
        L_0x01ca:
            r5 = r4 & 2
            if (r5 <= 0) goto L_0x01df
            int r5 = r2.bootloaderImageSize()     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            r7 = 4
            int r5 = r5 % r7
            if (r5 != 0) goto L_0x01d7
            goto L_0x01df
        L_0x01d7:
            no.nordicsemi.android.dfu.internal.exception.SizeValidationException r2 = new no.nordicsemi.android.dfu.internal.exception.SizeValidationException     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            java.lang.String r4 = "Bootloader firmware is not word-aligned."
            r2.<init>(r4)     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            throw r2     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
        L_0x01df:
            r5 = r4 & 1
            if (r5 <= 0) goto L_0x01f4
            int r5 = r2.softDeviceImageSize()     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            r7 = 4
            int r5 = r5 % r7
            if (r5 != 0) goto L_0x01ec
            goto L_0x01f4
        L_0x01ec:
            no.nordicsemi.android.dfu.internal.exception.SizeValidationException r2 = new no.nordicsemi.android.dfu.internal.exception.SizeValidationException     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            java.lang.String r4 = "Soft Device firmware is not word-aligned."
            r2.<init>(r4)     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            throw r2     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
        L_0x01f4:
            r5 = 4
            if (r4 != r5) goto L_0x0207
            byte[] r5 = r2.getApplicationInit()     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            if (r5 == 0) goto L_0x0219
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            byte[] r2 = r2.getApplicationInit()     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            r5.<init>(r2)     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            goto L_0x0216
        L_0x0207:
            byte[] r5 = r2.getSystemInit()     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            if (r5 == 0) goto L_0x0219
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            byte[] r2 = r2.getSystemInit()     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            r5.<init>(r2)     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
        L_0x0216:
            r7 = r5
            r5 = r4
            goto L_0x021d
        L_0x0219:
            r5 = r4
            goto L_0x021c
        L_0x021b:
            r5 = r11
        L_0x021c:
            r7 = r15
        L_0x021d:
            if (r22 == 0) goto L_0x022f
            int r2 = r6.available()     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            r6.mark(r2)     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            if (r7 == 0) goto L_0x022f
            int r2 = r7.available()     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            r7.mark(r2)     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
        L_0x022f:
            r1.mFirmwareInputStream = r6     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            r1.mInitFileInputStream = r7     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            java.lang.String r2 = "Firmware file opened successfully"
            r4 = 5
            r1.sendLogBroadcast(r4, r2)     // Catch:{ SecurityException -> 0x0199, FileNotFoundException -> 0x0195, SizeValidationException -> 0x0191, IOException -> 0x018d, Exception -> 0x0189 }
            no.nordicsemi.android.dfu.DfuProgressInfo r2 = new no.nordicsemi.android.dfu.DfuProgressInfo     // Catch:{ all -> 0x0185 }
            r2.<init>(r1)     // Catch:{ all -> 0x0185 }
            r1.mProgressInfo = r2     // Catch:{ all -> 0x0185 }
            boolean r2 = r1.mAborted     // Catch:{ all -> 0x0185 }
            r9 = -7
            java.lang.String r11 = "Upload aborted"
            if (r2 == 0) goto L_0x025a
            r1.logw(r11)     // Catch:{ all -> 0x0185 }
            r2 = 15
            r1.sendLogBroadcast(r2, r11)     // Catch:{ all -> 0x0185 }
            no.nordicsemi.android.dfu.DfuProgressInfo r2 = r1.mProgressInfo     // Catch:{ all -> 0x0185 }
            r2.setProgress(r9)     // Catch:{ all -> 0x0185 }
            if (r12 == 0) goto L_0x0259
            r1.stopForeground(r10)
        L_0x0259:
            return
        L_0x025a:
            java.lang.String r2 = "Connecting to DFU target..."
            r3 = 1
            r1.sendLogBroadcast(r3, r2)     // Catch:{ all -> 0x0185 }
            no.nordicsemi.android.dfu.DfuProgressInfo r2 = r1.mProgressInfo     // Catch:{ all -> 0x0185 }
            r3 = -1
            r2.setProgress(r3)     // Catch:{ all -> 0x0185 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0185 }
            r13 = r21
            android.bluetooth.BluetoothGatt r14 = r1.connect(r13)     // Catch:{ all -> 0x0185 }
            long r21 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0185 }
            if (r14 != 0) goto L_0x028b
            r2 = r17
            r1.loge(r2)     // Catch:{ all -> 0x0185 }
            r3 = 20
            r1.sendLogBroadcast(r3, r2)     // Catch:{ all -> 0x0185 }
            r2 = 4106(0x100a, float:5.754E-42)
            r1.report(r2)     // Catch:{ all -> 0x0185 }
            if (r12 == 0) goto L_0x028a
            r1.stopForeground(r10)
        L_0x028a:
            return
        L_0x028b:
            int r15 = r1.mError     // Catch:{ all -> 0x0185 }
            r16 = 32768(0x8000, float:4.5918E-41)
            java.lang.String r4 = "no.nordicsemi.android.dfu.extra.EXTRA_RECONNECTION_ATTEMPT"
            if (r15 <= 0) goto L_0x03bb
            int r5 = r1.mError     // Catch:{ all -> 0x0185 }
            r5 = r5 & r16
            if (r5 <= 0) goto L_0x0325
            int r5 = r1.mError     // Catch:{ all -> 0x0185 }
            r6 = -32769(0xffffffffffff7fff, float:NaN)
            r5 = r5 & r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0185 }
            r6.<init>()     // Catch:{ all -> 0x0185 }
            java.lang.String r7 = "Connection error after: "
            r6.append(r7)     // Catch:{ all -> 0x0185 }
            r15 = r10
            long r9 = r21 - r2
            r6.append(r9)     // Catch:{ all -> 0x0320 }
            java.lang.String r7 = " ms"
            r6.append(r7)     // Catch:{ all -> 0x0320 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0320 }
            r1.logi(r6)     // Catch:{ all -> 0x0320 }
            r6 = 133(0x85, float:1.86E-43)
            if (r5 != r6) goto L_0x02c9
            r6 = 25000(0x61a8, double:1.23516E-319)
            long r2 = r2 + r6
            int r2 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x02c9
            r2 = 1
            goto L_0x02ca
        L_0x02c9:
            r2 = 0
        L_0x02ca:
            if (r2 == 0) goto L_0x02ed
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0320 }
            r2.<init>()     // Catch:{ all -> 0x0320 }
            java.lang.String r3 = "Device not reachable. Check if the device with address "
            r2.append(r3)     // Catch:{ all -> 0x0320 }
            r2.append(r13)     // Catch:{ all -> 0x0320 }
            java.lang.String r3 = " is in range, is advertising and is connectable"
            r2.append(r3)     // Catch:{ all -> 0x0320 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0320 }
            r1.loge(r2)     // Catch:{ all -> 0x0320 }
            java.lang.String r2 = "Error 133: Connection timeout"
            r3 = 20
            r1.sendLogBroadcast(r3, r2)     // Catch:{ all -> 0x0320 }
            goto L_0x035c
        L_0x02ed:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0320 }
            r2.<init>()     // Catch:{ all -> 0x0320 }
            java.lang.String r3 = "An error occurred while connecting to the device: "
            r2.append(r3)     // Catch:{ all -> 0x0320 }
            r2.append(r5)     // Catch:{ all -> 0x0320 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0320 }
            r1.loge(r2)     // Catch:{ all -> 0x0320 }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x0320 }
            java.lang.String r3 = "Connection failed (0x%02X): %s"
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0320 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0320 }
            r9 = 0
            r7[r9] = r6     // Catch:{ all -> 0x0320 }
            java.lang.String r5 = p641l.p642a.p643a.p647b.C9599a.m25759b(r5)     // Catch:{ all -> 0x0320 }
            r6 = 1
            r7[r6] = r5     // Catch:{ all -> 0x0320 }
            java.lang.String r2 = java.lang.String.format(r2, r3, r7)     // Catch:{ all -> 0x0320 }
            r3 = 20
            r1.sendLogBroadcast(r3, r2)     // Catch:{ all -> 0x0320 }
            goto L_0x035c
        L_0x0320:
            r0 = move-exception
            r2 = r0
            r10 = r15
            goto L_0x05d2
        L_0x0325:
            r15 = r10
            int r2 = r1.mError     // Catch:{ all -> 0x03b7 }
            r2 = r2 & -16385(0xffffffffffffbfff, float:NaN)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x03b7 }
            r3.<init>()     // Catch:{ all -> 0x03b7 }
            java.lang.String r5 = "An error occurred during discovering services:"
            r3.append(r5)     // Catch:{ all -> 0x03b7 }
            r3.append(r2)     // Catch:{ all -> 0x03b7 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x03b7 }
            r1.loge(r3)     // Catch:{ all -> 0x03b7 }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x03b7 }
            java.lang.String r5 = "Connection failed (0x%02X): %s"
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x03b7 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x03b7 }
            r9 = 0
            r7[r9] = r6     // Catch:{ all -> 0x03b7 }
            java.lang.String r2 = p641l.p642a.p643a.p647b.C9599a.m25758a(r2)     // Catch:{ all -> 0x03b7 }
            r6 = 1
            r7[r6] = r2     // Catch:{ all -> 0x03b7 }
            java.lang.String r2 = java.lang.String.format(r3, r5, r7)     // Catch:{ all -> 0x03b7 }
            r3 = 20
            r1.sendLogBroadcast(r3, r2)     // Catch:{ all -> 0x03b7 }
        L_0x035c:
            r2 = 0
            int r2 = r8.getIntExtra(r4, r2)     // Catch:{ all -> 0x03b7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x03b7 }
            r3.<init>()     // Catch:{ all -> 0x03b7 }
            java.lang.String r5 = "Attempt: "
            r3.append(r5)     // Catch:{ all -> 0x03b7 }
            int r5 = r2 + 1
            r3.append(r5)     // Catch:{ all -> 0x03b7 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x03b7 }
            r1.logi(r3)     // Catch:{ all -> 0x03b7 }
            r3 = 2
            if (r2 >= r3) goto L_0x03ab
            java.lang.String r2 = "Retrying..."
            r3 = 15
            r1.sendLogBroadcast(r3, r2)     // Catch:{ all -> 0x03b7 }
            int r2 = r1.mConnectionState     // Catch:{ all -> 0x03b7 }
            if (r2 == 0) goto L_0x0388
            r1.disconnect(r14)     // Catch:{ all -> 0x0320 }
        L_0x0388:
            r2 = 1
            r1.refreshDeviceCache(r14, r2)     // Catch:{ all -> 0x03b7 }
            r1.close(r14)     // Catch:{ all -> 0x03b7 }
            java.lang.String r2 = "Restarting the service"
            r1.logi(r2)     // Catch:{ all -> 0x03b7 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x03b7 }
            r2.<init>()     // Catch:{ all -> 0x03b7 }
            r3 = 24
            r2.fillIn(r8, r3)     // Catch:{ all -> 0x03b7 }
            r2.putExtra(r4, r5)     // Catch:{ all -> 0x03b7 }
            r1.startService(r2)     // Catch:{ all -> 0x03b7 }
            if (r12 == 0) goto L_0x03aa
            r10 = r15
            r1.stopForeground(r10)
        L_0x03aa:
            return
        L_0x03ab:
            r10 = r15
            int r2 = r1.mError     // Catch:{ all -> 0x0185 }
            r1.terminateConnection(r14, r2)     // Catch:{ all -> 0x0185 }
            if (r12 == 0) goto L_0x03b6
            r1.stopForeground(r10)
        L_0x03b6:
            return
        L_0x03b7:
            r0 = move-exception
            r10 = r15
            goto L_0x0186
        L_0x03bb:
            int r2 = r1.mConnectionState     // Catch:{ all -> 0x0185 }
            if (r2 != 0) goto L_0x03d1
            java.lang.String r2 = "Disconnected"
            r3 = 20
            r1.sendLogBroadcast(r3, r2)     // Catch:{ all -> 0x0185 }
            r3 = 4096(0x1000, float:5.74E-42)
            r1.terminateConnection(r14, r3)     // Catch:{ all -> 0x0185 }
            if (r12 == 0) goto L_0x03d0
            r1.stopForeground(r10)
        L_0x03d0:
            return
        L_0x03d1:
            r3 = 4096(0x1000, float:5.74E-42)
            boolean r2 = r1.mAborted     // Catch:{ all -> 0x0185 }
            if (r2 == 0) goto L_0x03ee
            r1.logw(r11)     // Catch:{ all -> 0x0185 }
            r2 = 15
            r1.sendLogBroadcast(r2, r11)     // Catch:{ all -> 0x0185 }
            r2 = 0
            r1.terminateConnection(r14, r2)     // Catch:{ all -> 0x0185 }
            no.nordicsemi.android.dfu.DfuProgressInfo r2 = r1.mProgressInfo     // Catch:{ all -> 0x0185 }
            r2.setProgress(r9)     // Catch:{ all -> 0x0185 }
            if (r12 == 0) goto L_0x03ed
            r1.stopForeground(r10)
        L_0x03ed:
            return
        L_0x03ee:
            java.lang.String r2 = "Services discovered"
            r13 = 5
            r1.sendLogBroadcast(r13, r2)     // Catch:{ all -> 0x0185 }
            r2 = 0
            r8.putExtra(r4, r2)     // Catch:{ all -> 0x0185 }
            r2 = 0
            no.nordicsemi.android.dfu.DfuServiceProvider r4 = new no.nordicsemi.android.dfu.DfuServiceProvider     // Catch:{ UploadAbortedException -> 0x051c, DeviceDisconnectedException -> 0x04b3, DfuException -> 0x0451 }
            r4.<init>()     // Catch:{ UploadAbortedException -> 0x051c, DeviceDisconnectedException -> 0x04b3, DfuException -> 0x0451 }
            r1.mDfuServiceImpl = r4     // Catch:{ UploadAbortedException -> 0x051c, DeviceDisconnectedException -> 0x04b3, DfuException -> 0x0451 }
            no.nordicsemi.android.dfu.DfuService r13 = r4.getServiceImpl(r8, r1, r14)     // Catch:{ UploadAbortedException -> 0x051c, DeviceDisconnectedException -> 0x04b3, DfuException -> 0x0451 }
            r1.mDfuServiceImpl = r13     // Catch:{ UploadAbortedException -> 0x044a, DeviceDisconnectedException -> 0x0444, DfuException -> 0x0440, all -> 0x043b }
            if (r13 != 0) goto L_0x0424
            java.lang.String r2 = "DFU Service not found"
            r4 = 15
            r1.sendLogBroadcast(r4, r2)     // Catch:{ UploadAbortedException -> 0x044a, DeviceDisconnectedException -> 0x041f, DfuException -> 0x0440, all -> 0x043b }
            r2 = 4102(0x1006, float:5.748E-42)
            r1.terminateConnection(r14, r2)     // Catch:{ UploadAbortedException -> 0x044a, DeviceDisconnectedException -> 0x041f, DfuException -> 0x0440, all -> 0x043b }
            if (r13 == 0) goto L_0x0419
            r13.release()     // Catch:{ all -> 0x0185 }
        L_0x0419:
            if (r12 == 0) goto L_0x041e
            r1.stopForeground(r10)
        L_0x041e:
            return
        L_0x041f:
            r0 = move-exception
            r15 = r3
            r2 = r13
            goto L_0x04b5
        L_0x0424:
            r2 = r13
            r15 = r3
            r3 = r26
            r4 = r14
            boolean r2 = r2.initialize(r3, r4, r5, r6, r7)     // Catch:{ UploadAbortedException -> 0x044a, DeviceDisconnectedException -> 0x0439, DfuException -> 0x0440, all -> 0x043b }
            if (r2 == 0) goto L_0x0432
            r13.performDfu(r8)     // Catch:{ UploadAbortedException -> 0x044a, DeviceDisconnectedException -> 0x0439, DfuException -> 0x0440, all -> 0x043b }
        L_0x0432:
            if (r13 == 0) goto L_0x0531
            r13.release()     // Catch:{ all -> 0x0185 }
            goto L_0x0531
        L_0x0439:
            r0 = move-exception
            goto L_0x0446
        L_0x043b:
            r0 = move-exception
            r3 = r0
            r2 = r13
            goto L_0x0537
        L_0x0440:
            r0 = move-exception
            r3 = r0
            r2 = r13
            goto L_0x0453
        L_0x0444:
            r0 = move-exception
            r15 = r3
        L_0x0446:
            r3 = r0
            r2 = r13
            goto L_0x04b6
        L_0x044a:
            r2 = r13
            goto L_0x051c
        L_0x044d:
            r0 = move-exception
            r3 = r0
            goto L_0x0537
        L_0x0451:
            r0 = move-exception
            r3 = r0
        L_0x0453:
            int r4 = r3.getErrorNumber()     // Catch:{ all -> 0x044d }
            r5 = r4 & r16
            if (r5 <= 0) goto L_0x047e
            r5 = -32769(0xffffffffffff7fff, float:NaN)
            r4 = r4 & r5
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ all -> 0x044d }
            java.lang.String r6 = "Error (0x%02X): %s"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x044d }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x044d }
            r9 = 0
            r7[r9] = r8     // Catch:{ all -> 0x044d }
            java.lang.String r4 = p641l.p642a.p643a.p647b.C9599a.m25759b(r4)     // Catch:{ all -> 0x044d }
            r8 = 1
            r7[r8] = r4     // Catch:{ all -> 0x044d }
            java.lang.String r4 = java.lang.String.format(r5, r6, r7)     // Catch:{ all -> 0x044d }
            r5 = 20
            r1.sendLogBroadcast(r5, r4)     // Catch:{ all -> 0x044d }
            goto L_0x049e
        L_0x047e:
            r4 = r4 & -16385(0xffffffffffffbfff, float:NaN)
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ all -> 0x044d }
            java.lang.String r6 = "Error (0x%02X): %s"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x044d }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x044d }
            r9 = 0
            r7[r9] = r8     // Catch:{ all -> 0x044d }
            java.lang.String r4 = p641l.p642a.p643a.p647b.C9599a.m25758a(r4)     // Catch:{ all -> 0x044d }
            r8 = 1
            r7[r8] = r4     // Catch:{ all -> 0x044d }
            java.lang.String r4 = java.lang.String.format(r5, r6, r7)     // Catch:{ all -> 0x044d }
            r5 = 20
            r1.sendLogBroadcast(r5, r4)     // Catch:{ all -> 0x044d }
        L_0x049e:
            java.lang.String r4 = r3.getMessage()     // Catch:{ all -> 0x044d }
            r1.loge(r4)     // Catch:{ all -> 0x044d }
            int r3 = r3.getErrorNumber()     // Catch:{ all -> 0x044d }
            r1.terminateConnection(r14, r3)     // Catch:{ all -> 0x044d }
            if (r2 == 0) goto L_0x0531
        L_0x04ae:
            r2.release()     // Catch:{ all -> 0x0185 }
            goto L_0x0531
        L_0x04b3:
            r0 = move-exception
            r15 = r3
        L_0x04b5:
            r3 = r0
        L_0x04b6:
            java.lang.String r4 = "Device has disconnected"
            r5 = 20
            r1.sendLogBroadcast(r5, r4)     // Catch:{ all -> 0x044d }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x044d }
            r1.loge(r3)     // Catch:{ all -> 0x044d }
            r1.close(r14)     // Catch:{ all -> 0x044d }
            java.lang.String r3 = "no.nordicsemi.android.dfu.extra.EXTRA_DFU_ATTEMPT"
            r4 = 0
            int r3 = r8.getIntExtra(r3, r4)     // Catch:{ all -> 0x044d }
            java.lang.String r5 = "no.nordicsemi.android.dfu.extra.EXTRA_MAX_DFU_ATTEMPTS"
            int r4 = r8.getIntExtra(r5, r4)     // Catch:{ all -> 0x044d }
            if (r3 >= r4) goto L_0x0516
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x044d }
            r5.<init>()     // Catch:{ all -> 0x044d }
            java.lang.String r6 = "Restarting the service ("
            r5.append(r6)     // Catch:{ all -> 0x044d }
            r6 = 1
            int r3 = r3 + r6
            r5.append(r3)     // Catch:{ all -> 0x044d }
            java.lang.String r6 = " /"
            r5.append(r6)     // Catch:{ all -> 0x044d }
            r5.append(r4)     // Catch:{ all -> 0x044d }
            java.lang.String r4 = ")"
            r5.append(r4)     // Catch:{ all -> 0x044d }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x044d }
            r1.logi(r4)     // Catch:{ all -> 0x044d }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ all -> 0x044d }
            r4.<init>()     // Catch:{ all -> 0x044d }
            r5 = 24
            r4.fillIn(r8, r5)     // Catch:{ all -> 0x044d }
            java.lang.String r5 = "no.nordicsemi.android.dfu.extra.EXTRA_DFU_ATTEMPT"
            r4.putExtra(r5, r3)     // Catch:{ all -> 0x044d }
            r1.startService(r4)     // Catch:{ all -> 0x044d }
            if (r2 == 0) goto L_0x0510
            r2.release()     // Catch:{ all -> 0x0185 }
        L_0x0510:
            if (r12 == 0) goto L_0x0515
            r1.stopForeground(r10)
        L_0x0515:
            return
        L_0x0516:
            r1.report(r15)     // Catch:{ all -> 0x044d }
            if (r2 == 0) goto L_0x0531
            goto L_0x04ae
        L_0x051c:
            r1.logw(r11)     // Catch:{ all -> 0x044d }
            r3 = 15
            r1.sendLogBroadcast(r3, r11)     // Catch:{ all -> 0x044d }
            r3 = 0
            r1.terminateConnection(r14, r3)     // Catch:{ all -> 0x044d }
            no.nordicsemi.android.dfu.DfuProgressInfo r3 = r1.mProgressInfo     // Catch:{ all -> 0x044d }
            r3.setProgress(r9)     // Catch:{ all -> 0x044d }
            if (r2 == 0) goto L_0x0531
            goto L_0x04ae
        L_0x0531:
            if (r12 == 0) goto L_0x0536
            r1.stopForeground(r10)
        L_0x0536:
            return
        L_0x0537:
            if (r2 == 0) goto L_0x053c
            r2.release()     // Catch:{ all -> 0x0185 }
        L_0x053c:
            throw r3     // Catch:{ all -> 0x0185 }
        L_0x053d:
            java.lang.String r4 = "An exception occurred while opening files. Did you set the firmware file?"
            r1.loge(r4, r2)     // Catch:{ all -> 0x0185 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0185 }
            r4.<init>()     // Catch:{ all -> 0x0185 }
            r4.append(r3)     // Catch:{ all -> 0x0185 }
            java.lang.String r2 = r2.getLocalizedMessage()     // Catch:{ all -> 0x0185 }
            r4.append(r2)     // Catch:{ all -> 0x0185 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0185 }
            r3 = 20
            r1.sendLogBroadcast(r3, r2)     // Catch:{ all -> 0x0185 }
            r2 = 4098(0x1002, float:5.743E-42)
            r1.report(r2)     // Catch:{ all -> 0x0185 }
            if (r12 == 0) goto L_0x0564
            r1.stopForeground(r10)
        L_0x0564:
            return
        L_0x0565:
            java.lang.String r4 = "An exception occurred while calculating file size"
            r1.loge(r4, r2)     // Catch:{ all -> 0x0185 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0185 }
            r4.<init>()     // Catch:{ all -> 0x0185 }
            r4.append(r3)     // Catch:{ all -> 0x0185 }
            java.lang.String r2 = r2.getLocalizedMessage()     // Catch:{ all -> 0x0185 }
            r4.append(r2)     // Catch:{ all -> 0x0185 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0185 }
            r3 = 20
            r1.sendLogBroadcast(r3, r2)     // Catch:{ all -> 0x0185 }
            r2 = 4098(0x1002, float:5.743E-42)
            r1.report(r2)     // Catch:{ all -> 0x0185 }
            if (r12 == 0) goto L_0x058c
            r1.stopForeground(r10)
        L_0x058c:
            return
        L_0x058d:
            java.lang.String r3 = "Firmware not word-aligned"
            r1.loge(r3, r2)     // Catch:{ all -> 0x0185 }
            java.lang.String r2 = "Opening file failed: Firmware size must be word-aligned"
            r3 = 20
            r1.sendLogBroadcast(r3, r2)     // Catch:{ all -> 0x0185 }
            r2 = 4108(0x100c, float:5.757E-42)
            r1.report(r2)     // Catch:{ all -> 0x0185 }
            if (r12 == 0) goto L_0x05a3
            r1.stopForeground(r10)
        L_0x05a3:
            return
        L_0x05a4:
            java.lang.String r3 = "An exception occurred while opening file"
            r1.loge(r3, r2)     // Catch:{ all -> 0x0185 }
            java.lang.String r2 = "Opening file failed: File not found"
            r3 = 20
            r1.sendLogBroadcast(r3, r2)     // Catch:{ all -> 0x0185 }
            r2 = 4097(0x1001, float:5.741E-42)
            r1.report(r2)     // Catch:{ all -> 0x0185 }
            if (r12 == 0) goto L_0x05ba
            r1.stopForeground(r10)
        L_0x05ba:
            return
        L_0x05bb:
            java.lang.String r3 = "A security exception occurred while opening file"
            r1.loge(r3, r2)     // Catch:{ all -> 0x0185 }
            java.lang.String r2 = "Opening file failed: Permission required"
            r3 = 20
            r1.sendLogBroadcast(r3, r2)     // Catch:{ all -> 0x0185 }
            r2 = 4097(0x1001, float:5.741E-42)
            r1.report(r2)     // Catch:{ all -> 0x0185 }
            if (r12 == 0) goto L_0x05d1
            r1.stopForeground(r10)
        L_0x05d1:
            return
        L_0x05d2:
            if (r12 == 0) goto L_0x05d7
            r1.stopForeground(r10)
        L_0x05d7:
            throw r2
        L_0x05d8:
            java.lang.String r2 = "File type or file mime-type not supported"
            r1.logw(r2)
            r3 = 15
            r1.sendLogBroadcast(r3, r2)
            r2 = 4105(0x1009, float:5.752E-42)
            r1.report(r2)
            return
        L_0x05e8:
            java.lang.String r2 = "Device Address of firmware location are empty. Hint: use DfuServiceInitiator to start DFU"
            r1.loge(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p691no.nordicsemi.android.dfu.DfuBaseService.onHandleIntent(android.content.Intent):void");
    }

    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(NOTIFICATION_ID);
        }
        stopSelf();
    }

    public void refreshDeviceCache(@NonNull BluetoothGatt bluetoothGatt, boolean z) {
        if (z || bluetoothGatt.getDevice().getBondState() == 10) {
            sendLogBroadcast(0, "gatt.refresh() (hidden)");
            try {
                boolean booleanValue = ((Boolean) bluetoothGatt.getClass().getMethod("refresh", new Class[0]).invoke(bluetoothGatt, new Object[0])).booleanValue();
                logi("Refreshing result: " + booleanValue);
            } catch (Exception e) {
                loge("An exception occurred while refreshing device", e);
                sendLogBroadcast(15, "Refreshing failed");
            }
        }
    }

    public void sendLogBroadcast(int i, String str) {
        Intent intent = new Intent(BROADCAST_LOG);
        intent.putExtra(EXTRA_LOG_MESSAGE, "[DFU] " + str);
        intent.putExtra(EXTRA_LOG_LEVEL, i);
        intent.putExtra(EXTRA_DEVICE_ADDRESS, this.mDeviceAddress);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    public void terminateConnection(@NonNull BluetoothGatt bluetoothGatt, int i) {
        if (this.mConnectionState != 0) {
            disconnect(bluetoothGatt);
        }
        refreshDeviceCache(bluetoothGatt, false);
        close(bluetoothGatt);
        waitFor(600);
        if (i != 0) {
            report(i);
        }
    }

    public void updateErrorNotification(@NonNull NotificationCompat.Builder builder) {
    }

    public void updateForegroundNotification(@NonNull NotificationCompat.Builder builder) {
    }

    public void updateProgressNotification() {
        String str;
        DfuProgressInfo dfuProgressInfo = this.mProgressInfo;
        int progress = dfuProgressInfo.getProgress();
        if (this.mLastProgress != progress) {
            this.mLastProgress = progress;
            sendProgressBroadcast(dfuProgressInfo);
            if (!this.mDisableNotification) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - this.mLastNotificationTime >= 250 || -6 == progress || -7 == progress) {
                    this.mLastNotificationTime = elapsedRealtime;
                    String str2 = this.mDeviceAddress;
                    String str3 = this.mDeviceName;
                    if (str3 == null) {
                        str3 = getString(C9843R.string.dfu_unknown_name);
                    }
                    NotificationCompat.Builder onlyAlertOnce = new NotificationCompat.Builder((Context) this, NOTIFICATION_CHANNEL_DFU).setSmallIcon(17301640).setOnlyAlertOnce(true);
                    onlyAlertOnce.setColor(-7829368);
                    switch (progress) {
                        case -7:
                            onlyAlertOnce.setOngoing(false).setContentTitle(getString(C9843R.string.dfu_status_aborted)).setSmallIcon(17301641).setContentText(getString(C9843R.string.dfu_status_aborted_msg)).setAutoCancel(true);
                            break;
                        case -6:
                            onlyAlertOnce.setOngoing(false).setContentTitle(getString(C9843R.string.dfu_status_completed)).setSmallIcon(17301641).setContentText(getString(C9843R.string.dfu_status_completed_msg)).setAutoCancel(true).setColor(-16730086);
                            break;
                        case -5:
                            onlyAlertOnce.setOngoing(true).setContentTitle(getString(C9843R.string.dfu_status_disconnecting)).setContentText(getString(C9843R.string.dfu_status_disconnecting_msg, new Object[]{str3})).setProgress(100, 0, true);
                            break;
                        case -4:
                            onlyAlertOnce.setOngoing(true).setContentTitle(getString(C9843R.string.dfu_status_validating)).setContentText(getString(C9843R.string.dfu_status_validating_msg)).setProgress(100, 0, true);
                            break;
                        case -3:
                            onlyAlertOnce.setOngoing(true).setContentTitle(getString(C9843R.string.dfu_status_switching_to_dfu)).setContentText(getString(C9843R.string.dfu_status_switching_to_dfu_msg)).setProgress(100, 0, true);
                            break;
                        case -2:
                            onlyAlertOnce.setOngoing(true).setContentTitle(getString(C9843R.string.dfu_status_starting)).setContentText(getString(C9843R.string.dfu_status_starting_msg)).setProgress(100, 0, true);
                            break;
                        case -1:
                            onlyAlertOnce.setOngoing(true).setContentTitle(getString(C9843R.string.dfu_status_connecting)).setContentText(getString(C9843R.string.dfu_status_connecting_msg, new Object[]{str3})).setProgress(100, 0, true);
                            break;
                        default:
                            if (dfuProgressInfo.getTotalParts() == 1) {
                                str = getString(C9843R.string.dfu_status_uploading);
                            } else {
                                str = getString(C9843R.string.dfu_status_uploading_part, new Object[]{Integer.valueOf(dfuProgressInfo.getCurrentPart()), Integer.valueOf(dfuProgressInfo.getTotalParts())});
                            }
                            onlyAlertOnce.setOngoing(true).setContentTitle(str).setContentText(getString(C9843R.string.dfu_status_uploading_msg, new Object[]{str3})).setProgress(100, progress, false);
                            break;
                    }
                    Intent intent = new Intent(this, getNotificationTarget());
                    intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                    intent.putExtra(EXTRA_DEVICE_ADDRESS, str2);
                    intent.putExtra(EXTRA_DEVICE_NAME, str3);
                    intent.putExtra(EXTRA_PROGRESS, progress);
                    int i = 134217728;
                    if (Build.VERSION.SDK_INT >= 23) {
                        i = 201326592;
                    }
                    onlyAlertOnce.setContentIntent(PendingIntent.getActivity(this, 0, intent, i));
                    updateProgressNotification(onlyAlertOnce, progress);
                    NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.notify(NOTIFICATION_ID, onlyAlertOnce.build());
                    }
                }
            }
        }
    }

    public void waitFor(long j) {
        synchronized (this.mLock) {
            try {
                sendLogBroadcast(0, "wait(" + j + ")");
                this.mLock.wait(j);
            } catch (InterruptedException e) {
                loge("Sleeping interrupted", e);
            }
        }
    }

    public void waitUntilDisconnected() {
        try {
            synchronized (this.mLock) {
                while (this.mConnectionState != 0 && this.mError == 0) {
                    this.mLock.wait();
                }
            }
        } catch (InterruptedException e) {
            loge("Sleeping interrupted", e);
        }
    }

    private InputStream openInputStream(@NonNull Uri uri, String str, int i, int i2) {
        InputStream inputStream;
        if (uri.toString().startsWith("file:///android_asset/")) {
            inputStream = getAssets().open(uri.getPath().substring(15));
        } else {
            inputStream = getContentResolver().openInputStream(uri);
        }
        if (MIME_TYPE_ZIP.equals(str)) {
            return new ArchiveInputStream(inputStream, i, i2);
        }
        Cursor query = getContentResolver().query(uri, new String[]{"_display_name"}, (String) null, (String[]) null, (String) null);
        if (query != null) {
            try {
                if (query.moveToNext() && query.getString(0).toLowerCase(Locale.US).endsWith("hex")) {
                    HexInputStream hexInputStream = new HexInputStream(inputStream, i);
                    if (query != null) {
                        query.close();
                    }
                    return hexInputStream;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        if (query != null) {
            query.close();
        }
        return inputStream;
        throw th;
    }

    private InputStream openInputStream(int i, String str, int i2, int i3) {
        InputStream openRawResource = getResources().openRawResource(i);
        if (MIME_TYPE_ZIP.equals(str)) {
            return new ArchiveInputStream(openRawResource, i2, i3);
        }
        openRawResource.mark(2);
        int read = openRawResource.read();
        openRawResource.reset();
        return read == 58 ? new HexInputStream(openRawResource, i2) : openRawResource;
    }

    public void updateProgressNotification(@NonNull NotificationCompat.Builder builder, int i) {
        if (i != -7 && i != -6) {
            Intent intent = new Intent(BROADCAST_ACTION);
            intent.putExtra(EXTRA_ACTION, 2);
            int i2 = 134217728;
            if (Build.VERSION.SDK_INT >= 23) {
                i2 = 201326592;
            }
            builder.addAction(C9843R.C9845drawable.ic_action_notify_cancel, getString(C9843R.string.dfu_action_abort), PendingIntent.getBroadcast(this, 1, intent, i2));
        }
    }
}
