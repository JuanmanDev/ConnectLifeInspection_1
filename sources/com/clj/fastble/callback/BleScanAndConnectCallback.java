package com.clj.fastble.callback;

import com.clj.fastble.data.BleDevice;

public abstract class BleScanAndConnectCallback extends BleGattCallback implements BleScanPresenterImp {
    public void onLeScan(BleDevice bleDevice) {
    }

    public abstract void onScanFinished(BleDevice bleDevice);

    public abstract /* synthetic */ void onScanStarted(boolean z);

    public abstract /* synthetic */ void onScanning(BleDevice bleDevice);
}
