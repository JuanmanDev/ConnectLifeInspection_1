package com.juconnect.connectlife.ju_ble;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.clj.fastble.callback.BleGattCallback;
import com.clj.fastble.data.BleDevice;
import com.clj.fastble.exception.BleException;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.juconnect.connectlife.ju_ble.BleDeviceManager;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J,\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016¨\u0006\u0012"}, mo47991d2 = {"com/juconnect/connectlife/ju_ble/BleDeviceManager$connectDevice$1", "Lcom/clj/fastble/callback/BleGattCallback;", "onConnectFail", "", "bleDevice", "Lcom/clj/fastble/data/BleDevice;", "exception", "Lcom/clj/fastble/exception/BleException;", "onConnectSuccess", "gatt", "Landroid/bluetooth/BluetoothGatt;", "status", "", "onDisConnected", "isActiveDisConnected", "", "device", "onStartConnect", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BleDeviceManager.kt */
public final class BleDeviceManager$connectDevice$1 extends BleGattCallback {
    public final /* synthetic */ BluetoothDevice $device;

    public BleDeviceManager$connectDevice$1(BluetoothDevice bluetoothDevice) {
        this.$device = bluetoothDevice;
    }

    public void onConnectFail(@Nullable BleDevice bleDevice, @Nullable BleException bleException) {
        BleDeviceManager.INSTANCE.getTAG();
        "蓝牙连接失败: mac = " + this.$device.getAddress() + ",\n exception = " + bleException;
        BleDeviceManager.BleDeviceConnectCallBack mBleCallback = BleDeviceManager.INSTANCE.getMBleCallback();
        if (mBleCallback != null) {
            mBleCallback.errorCallback("connBleDeviceCallback", "1", Integer.parseInt("2201"), String.valueOf(bleException), "");
        }
    }

    @SuppressLint({"MissingPermission"})
    public void onConnectSuccess(@Nullable BleDevice bleDevice, @Nullable BluetoothGatt bluetoothGatt, int i) {
        BleDeviceManager.INSTANCE.getTAG();
        Intrinsics.stringPlus("蓝牙连接成功: mac = ", this.$device.getAddress());
        Intrinsics.checkNotNull(bluetoothGatt);
        bluetoothGatt.requestMtu(200);
        BleDeviceManager.INSTANCE.setConnect(false);
        for (BluetoothGattService next : bluetoothGatt.getServices()) {
            BleDeviceManager.INSTANCE.getTAG();
            BleDeviceManager.INSTANCE.getTAG();
            Intrinsics.stringPlus("service.uuid = ", next.getUuid());
            if (Intrinsics.areEqual((Object) next.getUuid(), (Object) UUID.fromString(BleDeviceManager.INSTANCE.getUuid_service()))) {
                for (BluetoothGattCharacteristic next2 : next.getCharacteristics()) {
                    if (next2 != null && Intrinsics.areEqual((Object) next2.getUuid(), (Object) UUID.fromString(BleDeviceManager.INSTANCE.getUuid_characteristic()))) {
                        BleDeviceManager.INSTANCE.getTAG();
                        BleDeviceManager.INSTANCE.setConnect(true);
                    }
                }
            }
        }
        if (BleDeviceManager.INSTANCE.isConnect()) {
            BleDeviceManager.INSTANCE.setMBleDevice(bleDevice);
            if (BleDeviceManager.INSTANCE.getMBleCallback() != null) {
                BleDeviceManager.BleDeviceConnectCallBack mBleCallback = BleDeviceManager.INSTANCE.getMBleCallback();
                Intrinsics.checkNotNull(mBleCallback);
                mBleCallback.onConnectSuccess();
                return;
            }
            return;
        }
        BleDeviceManager.BleDeviceConnectCallBack mBleCallback2 = BleDeviceManager.INSTANCE.getMBleCallback();
        if (mBleCallback2 != null) {
            mBleCallback2.errorCallback("connBleDeviceCallback", "1", EventBusConstKt.NOT_MORE, "设备中未找到与之相对应的UUID", "");
        }
    }

    public void onDisConnected(boolean z, @Nullable BleDevice bleDevice, @Nullable BluetoothGatt bluetoothGatt, int i) {
        BleDeviceManager.INSTANCE.getTAG();
        BleDeviceManager.INSTANCE.setConnect(false);
        BleDeviceManager.INSTANCE.setMBleDevice((BleDevice) null);
    }

    public void onStartConnect() {
        BleDeviceManager.INSTANCE.getTAG();
        Intrinsics.stringPlus("开始连接蓝牙: mac = ", this.$device.getAddress());
    }
}
