package com.juconnect.connectlife.ju_ble;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.clj.fastble.callback.BleGattCallback;
import com.clj.fastble.data.BleDevice;
import com.clj.fastble.exception.BleException;
import com.juconnect.connectlife.ju_ble.parameters.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J,\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016¨\u0006\u0012"}, mo47991d2 = {"com/juconnect/connectlife/ju_ble/BlueToothHelper$connectDeviceAndGetInfo$1", "Lcom/clj/fastble/callback/BleGattCallback;", "onConnectFail", "", "bleDevice", "Lcom/clj/fastble/data/BleDevice;", "exception", "Lcom/clj/fastble/exception/BleException;", "onConnectSuccess", "gatt", "Landroid/bluetooth/BluetoothGatt;", "status", "", "onDisConnected", "isActiveDisConnected", "", "device", "onStartConnect", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BlueToothHelper.kt */
public final class BlueToothHelper$connectDeviceAndGetInfo$1 extends BleGattCallback {
    public final /* synthetic */ Function2<BleDevice, String, Unit> $connectCallback;
    public final /* synthetic */ BlueToothHelper this$0;

    public BlueToothHelper$connectDeviceAndGetInfo$1(BlueToothHelper blueToothHelper, Function2<? super BleDevice, ? super String, Unit> function2) {
        this.this$0 = blueToothHelper;
        this.$connectCallback = function2;
    }

    public void onConnectFail(@Nullable BleDevice bleDevice, @Nullable BleException bleException) {
        this.this$0.logE("connectDevice onConnectFail");
        this.this$0.logE(String.valueOf(bleException));
        this.$connectCallback.invoke(bleDevice, String.valueOf(bleException));
    }

    @SuppressLint({"MissingPermission"})
    public void onConnectSuccess(@Nullable BleDevice bleDevice, @Nullable BluetoothGatt bluetoothGatt, int i) {
        this.this$0.logI("connectDeviceAndGetInfo onConnectSuccess");
        if (bluetoothGatt != null) {
            BlueToothHelper blueToothHelper = this.this$0;
            Function2<BleDevice, String, Unit> function2 = this.$connectCallback;
            bluetoothGatt.requestMtu(516);
            bluetoothGatt.requestConnectionPriority(1);
            List<BluetoothGattService> services = bluetoothGatt.getServices();
            Intrinsics.checkNotNullExpressionValue(services, "it.services");
            for (BluetoothGattService bluetoothGattService : services) {
                if (Intrinsics.areEqual((Object) bluetoothGattService.getUuid().toString(), (Object) Constant.dfuInfoService)) {
                    List<BluetoothGattCharacteristic> characteristics = bluetoothGattService.getCharacteristics();
                    Intrinsics.checkNotNullExpressionValue(characteristics, "service.characteristics");
                    for (BluetoothGattCharacteristic bluetoothGattCharacteristic : characteristics) {
                        blueToothHelper.logI(Intrinsics.stringPlus("chart: ", bluetoothGattCharacteristic.getUuid()));
                        if (Intrinsics.areEqual((Object) bluetoothGattCharacteristic.getUuid().toString(), (Object) Constant.dfuVersionUuid)) {
                            Intrinsics.checkNotNull(bleDevice);
                            Intrinsics.checkNotNullExpressionValue(bluetoothGattCharacteristic, "characteristic");
                            blueToothHelper.readValue(bleDevice, bluetoothGattCharacteristic, new C4077xb89058de(function2, bleDevice));
                        }
                    }
                }
            }
        }
    }

    public void onDisConnected(boolean z, @Nullable BleDevice bleDevice, @Nullable BluetoothGatt bluetoothGatt, int i) {
        this.this$0.logE("connectDeviceAndGetInfo onDisConnected");
    }

    public void onStartConnect() {
        this.this$0.logI("connectDeviceAndGetInfo onStartConnect");
    }
}
