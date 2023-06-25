package com.juconnect.connectlife.ju_ble;

import android.app.Application;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.net.Uri;
import com.clj.fastble.BleManager;
import com.clj.fastble.callback.BleGattCallback;
import com.clj.fastble.data.BleDevice;
import com.clj.fastble.scan.BleScanRuleConfig;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p691no.nordicsemi.android.dfu.DfuServiceController;
import p691no.nordicsemi.android.dfu.DfuServiceInitiator;
import p691no.nordicsemi.android.dfu.DfuServiceListenerHelper;

@Metadata(mo47990d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0001\u0006\u0018\u0000 ?2\u00020\u0001:\u0002?@B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00120\u0015J*\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u001a\u0010\u0014\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u0018J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0002J\u0006\u0010\u001c\u001a\u00020\u0012J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0016J\u0014\u0010\u001f\u001a\u00020\u00122\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!J\u0016\u0010#\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010(\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020)J\u000e\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\tJ\u000e\u0010,\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\tJ9\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u0002002!\u00101\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u00120\u0015J\u0016\u00105\u001a\u00020\u00122\u0006\u00106\u001a\u00020\t2\u0006\u0010$\u001a\u00020%J\u0006\u00107\u001a\u00020\u0012J\u000e\u00108\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u00109\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tJ\u0018\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\tH\u0002J\u0006\u0010<\u001a\u00020\u0012J\u0016\u0010=\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%J \u0010>\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u00106\u001a\u00020\t2\u0006\u0010$\u001a\u00020%H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/BlueToothHelper;", "", "()V", "context", "Landroid/content/Context;", "dfuProgressListener", "com/juconnect/connectlife/ju_ble/BlueToothHelper$dfuProgressListener$1", "Lcom/juconnect/connectlife/ju_ble/BlueToothHelper$dfuProgressListener$1;", "lastMac", "", "lastZipPath", "onDfuResultListener", "Lcom/juconnect/connectlife/ju_ble/OnDfuResultListener;", "serviceController", "Lno/nordicsemi/android/dfu/DfuServiceController;", "serviceUUID", "uuid", "connectDevice", "", "mac", "connectCallback", "Lkotlin/Function1;", "Lcom/clj/fastble/data/BleDevice;", "connectDeviceAndGetInfo", "Lkotlin/Function2;", "dfuError", "error", "dfuFinish", "disAllConnectBle", "disConnectBle", "bleDevice", "findService", "paramList", "", "Landroid/bluetooth/BluetoothGattService;", "indicate", "zipFilePath", "Landroid/net/Uri;", "initBlueUUID", "UUID", "initContext", "Landroid/app/Application;", "logE", "text", "logI", "readValue", "device", "characteristic", "Landroid/bluetooth/BluetoothGattCharacteristic;", "callback", "Lkotlin/ParameterName;", "name", "value", "scanDfu", "dfuName", "searchBlueToothList", "setListener", "startDfuOta", "startOta", "last", "stopDfuUpdate", "writeDfu", "writeDfuName", "Companion", "SingletonHolder", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BlueToothHelper.kt */
public final class BlueToothHelper {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String TAG;
    @NotNull
    public static final BlueToothHelper instances = SingletonHolder.INSTANCE.getHolder();
    @Nullable
    public Context context;
    @NotNull
    public final BlueToothHelper$dfuProgressListener$1 dfuProgressListener;
    @NotNull
    public String lastMac;
    @NotNull
    public String lastZipPath;
    @Nullable
    public OnDfuResultListener onDfuResultListener;
    @Nullable
    public DfuServiceController serviceController;
    @Nullable
    public String serviceUUID;
    @Nullable
    public String uuid;

    @Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/BlueToothHelper$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "instances", "Lcom/juconnect/connectlife/ju_ble/BlueToothHelper;", "getInstances", "()Lcom/juconnect/connectlife/ju_ble/BlueToothHelper;", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: BlueToothHelper.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BlueToothHelper getInstances() {
            return BlueToothHelper.instances;
        }

        @NotNull
        public final String getTAG() {
            return BlueToothHelper.TAG;
        }
    }

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/BlueToothHelper$SingletonHolder;", "", "()V", "holder", "Lcom/juconnect/connectlife/ju_ble/BlueToothHelper;", "getHolder", "()Lcom/juconnect/connectlife/ju_ble/BlueToothHelper;", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: BlueToothHelper.kt */
    public static final class SingletonHolder {
        @NotNull
        public static final SingletonHolder INSTANCE = new SingletonHolder();
        @NotNull
        public static final BlueToothHelper holder = new BlueToothHelper((DefaultConstructorMarker) null);

        @NotNull
        public final BlueToothHelper getHolder() {
            return holder;
        }
    }

    static {
        String simpleName = BlueToothHelper.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "BlueToothHelper::class.java.simpleName");
        TAG = simpleName;
    }

    public BlueToothHelper() {
        this.dfuProgressListener = new BlueToothHelper$dfuProgressListener$1(this);
        this.lastMac = "";
        this.lastZipPath = "";
    }

    public /* synthetic */ BlueToothHelper(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* access modifiers changed from: private */
    public final void dfuError(String str) {
        Context context2 = this.context;
        Intrinsics.checkNotNull(context2);
        DfuServiceListenerHelper.unregisterProgressListener(context2, this.dfuProgressListener);
        OnDfuResultListener onDfuResultListener2 = this.onDfuResultListener;
        if (onDfuResultListener2 != null) {
            onDfuResultListener2.onError(str);
        }
    }

    /* access modifiers changed from: private */
    public final void dfuFinish() {
        Context context2 = this.context;
        Intrinsics.checkNotNull(context2);
        DfuServiceListenerHelper.unregisterProgressListener(context2, this.dfuProgressListener);
        this.lastMac = "";
        this.lastZipPath = "";
        OnDfuResultListener onDfuResultListener2 = this.onDfuResultListener;
        if (onDfuResultListener2 != null) {
            onDfuResultListener2.onSuccess();
        }
    }

    /* access modifiers changed from: private */
    public final void startOta(BleDevice bleDevice, String str) {
        Thread.sleep(500);
        DfuServiceInitiator zip = new DfuServiceInitiator(bleDevice.getMac()).setDeviceName(bleDevice.getName()).setKeepBond(false).setDisableNotification(true).setUnsafeExperimentalButtonlessServiceInSecureDfuEnabled(true).setZip(str);
        Context context2 = this.context;
        Intrinsics.checkNotNull(context2);
        DfuServiceInitiator.createDfuNotificationChannel(context2);
        Context context3 = this.context;
        if (context3 != null) {
            this.serviceController = zip.start(context3, DfuService.class);
        }
    }

    private final void writeDfuName(BleDevice bleDevice, String str, Uri uri) {
        BleManager instance = BleManager.getInstance();
        String str2 = this.serviceUUID;
        String str3 = this.uuid;
        byte[] bArr = {2, (byte) str.length()};
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        instance.write(bleDevice, str2, str3, ArraysKt___ArraysJvmKt.plus(bArr, bytes), new BlueToothHelper$writeDfuName$1(this, bleDevice, uri));
    }

    public final void connectDevice(@NotNull String str, @NotNull Function1<? super BleDevice, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "mac");
        Intrinsics.checkNotNullParameter(function1, "connectCallback");
        Thread.sleep(500);
        BleManager.getInstance().connect(str, (BleGattCallback) new BlueToothHelper$connectDevice$1(this, function1));
    }

    public final void connectDeviceAndGetInfo(@NotNull String str, @NotNull Function2<? super BleDevice, ? super String, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "mac");
        Intrinsics.checkNotNullParameter(function2, "connectCallback");
        Thread.sleep(500);
        BleManager.getInstance().connect(str, (BleGattCallback) new BlueToothHelper$connectDeviceAndGetInfo$1(this, function2));
    }

    public final void disAllConnectBle() {
        this.lastMac = "";
        this.lastZipPath = "";
        BleManager.getInstance().disconnectAllDevice();
    }

    public final void disConnectBle(@NotNull BleDevice bleDevice) {
        Intrinsics.checkNotNullParameter(bleDevice, "bleDevice");
        this.lastMac = "";
        this.lastZipPath = "";
        BleManager.getInstance().disconnect(bleDevice);
    }

    public final void findService(@NotNull List<? extends BluetoothGattService> list) {
        Intrinsics.checkNotNullParameter(list, "paramList");
        for (BluetoothGattService bluetoothGattService : list) {
            logI(Intrinsics.stringPlus("找到对应的蓝牙服务: ", bluetoothGattService));
            List<BluetoothGattCharacteristic> characteristics = bluetoothGattService.getCharacteristics();
            Intrinsics.checkNotNullExpressionValue(characteristics, "localList");
            for (BluetoothGattCharacteristic bluetoothGattCharacteristic : characteristics) {
                logI(Intrinsics.stringPlus("找到对应可读写特征: ", bluetoothGattCharacteristic));
                List<BluetoothGattDescriptor> descriptors = bluetoothGattCharacteristic.getDescriptors();
                Intrinsics.checkNotNullExpressionValue(descriptors, "localDesList");
                for (BluetoothGattDescriptor stringPlus : descriptors) {
                    logI(Intrinsics.stringPlus("找到对应的descriptor: ", stringPlus));
                }
            }
        }
    }

    public final void indicate(@NotNull BleDevice bleDevice, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(bleDevice, "bleDevice");
        Intrinsics.checkNotNullParameter(uri, "zipFilePath");
        BleManager.getInstance().indicate(bleDevice, this.serviceUUID, this.uuid, new BlueToothHelper$indicate$1(this, bleDevice, uri));
    }

    @NotNull
    public final BlueToothHelper initBlueUUID(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "UUID");
        Intrinsics.checkNotNullParameter(str2, "serviceUUID");
        this.uuid = str;
        this.serviceUUID = str2;
        return instances;
    }

    public final void initContext(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "context");
        this.context = application;
        BleManager.getInstance().init(application);
    }

    public final void logE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "text");
    }

    public final void logI(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "text");
    }

    public final void readValue(@NotNull BleDevice bleDevice, @NotNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(bleDevice, EventBusConstKt.DEVICE);
        Intrinsics.checkNotNullParameter(bluetoothGattCharacteristic, "characteristic");
        Intrinsics.checkNotNullParameter(function1, "callback");
        BleManager.getInstance().read(bleDevice, bluetoothGattCharacteristic.getService().getUuid().toString(), bluetoothGattCharacteristic.getUuid().toString(), new BlueToothHelper$readValue$1(this, function1));
    }

    public final void scanDfu(@NotNull String str, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(str, "dfuName");
        Intrinsics.checkNotNullParameter(uri, "zipFilePath");
        BleManager.getInstance().disconnectAllDevice();
        BleManager.getInstance().initScanRule(new BleScanRuleConfig.Builder().setDeviceName(true, str).build());
        BleManager.getInstance().scanAndConnect(new BlueToothHelper$scanDfu$1(this, uri));
    }

    public final void searchBlueToothList() {
        BleManager.getInstance().initScanRule(new BleScanRuleConfig.Builder().setScanTimeOut(5000).build());
        BleManager.getInstance().scan(new BlueToothHelper$searchBlueToothList$1(this));
    }

    @NotNull
    public final BlueToothHelper setListener(@NotNull OnDfuResultListener onDfuResultListener2) {
        Intrinsics.checkNotNullParameter(onDfuResultListener2, "onDfuResultListener");
        this.onDfuResultListener = onDfuResultListener2;
        return instances;
    }

    public final void startDfuOta(@NotNull String str, @NotNull String str2) {
        T t;
        Intrinsics.checkNotNullParameter(str, "mac");
        Intrinsics.checkNotNullParameter(str2, "zipFilePath");
        this.lastMac = str;
        this.lastZipPath = str2;
        Context context2 = this.context;
        Intrinsics.checkNotNull(context2);
        DfuServiceListenerHelper.registerProgressListener(context2, this.dfuProgressListener);
        if (BleManager.getInstance().isConnected(str)) {
            List<BleDevice> allConnectedDevice = BleManager.getInstance().getAllConnectedDevice();
            Intrinsics.checkNotNullExpressionValue(allConnectedDevice, "getInstance().allConnectedDevice");
            Iterator<T> it = allConnectedDevice.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Intrinsics.areEqual((Object) ((BleDevice) t).getMac(), (Object) str)) {
                    break;
                }
            }
            BleDevice bleDevice = (BleDevice) t;
            if (bleDevice != null) {
                startOta(bleDevice, str2);
                return;
            }
            return;
        }
        Thread.sleep(500);
        BleManager.getInstance().connect(str, (BleGattCallback) new BlueToothHelper$startDfuOta$1(this, str2));
    }

    public final void stopDfuUpdate() {
        this.lastMac = "";
        this.lastZipPath = "";
        DfuServiceController dfuServiceController = this.serviceController;
        if (dfuServiceController != null) {
            dfuServiceController.abort();
        }
    }

    public final void writeDfu(@NotNull BleDevice bleDevice, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(bleDevice, "bleDevice");
        Intrinsics.checkNotNullParameter(uri, "zipFilePath");
        BleDevice bleDevice2 = bleDevice;
        BleManager.getInstance().write(bleDevice2, this.serviceUUID, this.uuid, new byte[]{1}, new BlueToothHelper$writeDfu$1(this, bleDevice, uri));
    }
}
