package com.juconnect.connectlife.ju_ble;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import com.clj.fastble.callback.BleScanAndConnectCallback;
import com.clj.fastble.data.BleDevice;
import com.clj.fastble.exception.BleException;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J,\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0012\u0010\u0015\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016¨\u0006\u0017"}, mo47991d2 = {"com/juconnect/connectlife/ju_ble/BlueToothHelper$startDfuOta$1", "Lcom/clj/fastble/callback/BleScanAndConnectCallback;", "onConnectFail", "", "bleDevice", "Lcom/clj/fastble/data/BleDevice;", "exception", "Lcom/clj/fastble/exception/BleException;", "onConnectSuccess", "gatt", "Landroid/bluetooth/BluetoothGatt;", "status", "", "onDisConnected", "isActiveDisConnected", "", "device", "onScanFinished", "scanResult", "onScanStarted", "success", "onScanning", "onStartConnect", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BlueToothHelper.kt */
public final class BlueToothHelper$startDfuOta$1 extends BleScanAndConnectCallback {
    public final /* synthetic */ String $zipFilePath;
    public final /* synthetic */ BlueToothHelper this$0;

    public BlueToothHelper$startDfuOta$1(BlueToothHelper blueToothHelper, String str) {
        this.this$0 = blueToothHelper;
        this.$zipFilePath = str;
    }

    public void onConnectFail(@Nullable BleDevice bleDevice, @Nullable BleException bleException) {
        this.this$0.logE("connectDevice onConnectFail");
        this.this$0.logE(String.valueOf(bleException));
    }

    @SuppressLint({"MissingPermission"})
    public void onConnectSuccess(@Nullable BleDevice bleDevice, @Nullable BluetoothGatt bluetoothGatt, int i) {
        this.this$0.logI("connectDevice onConnectSuccess");
        if (bluetoothGatt != null) {
            bluetoothGatt.requestConnectionPriority(1);
        }
        if (bleDevice != null) {
            this.this$0.startOta(bleDevice, this.$zipFilePath);
        }
    }

    public void onDisConnected(boolean z, @Nullable BleDevice bleDevice, @Nullable BluetoothGatt bluetoothGatt, int i) {
        this.this$0.logE("connectDevice onDisConnected");
    }

    public void onScanFinished(@Nullable BleDevice bleDevice) {
        this.this$0.logE("connectDevice onScanFinished");
    }

    public void onScanStarted(boolean z) {
        this.this$0.logI("connectDevice onScanStarted");
    }

    public void onScanning(@Nullable BleDevice bleDevice) {
        this.this$0.logI("connectDevice onScanning");
    }

    public void onStartConnect() {
        this.this$0.logI("connectDevice onStartConnect");
    }
}
