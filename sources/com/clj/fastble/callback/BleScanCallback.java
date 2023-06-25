package com.clj.fastble.callback;

import com.clj.fastble.data.BleDevice;
import java.util.List;

public abstract class BleScanCallback implements BleScanPresenterImp {
    public void onLeScan(BleDevice bleDevice) {
    }

    public abstract void onScanFinished(List<BleDevice> list);

    public abstract /* synthetic */ void onScanStarted(boolean z);

    public abstract /* synthetic */ void onScanning(BleDevice bleDevice);
}
