package com.clj.fastble.scan;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.clj.fastble.callback.BleScanPresenterImp;
import com.clj.fastble.data.BleDevice;
import com.clj.fastble.utils.BleLog;
import com.clj.fastble.utils.HexUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(18)
public abstract class BleScanPresenter implements BluetoothAdapter.LeScanCallback {
    public final List<BleDevice> mBleDeviceList = new ArrayList();
    public BleScanPresenterImp mBleScanPresenterImp;
    public String mDeviceMac;
    public String[] mDeviceNames;
    public boolean mFuzzy;
    public Handler mHandler;
    public HandlerThread mHandlerThread;
    public boolean mHandling;
    public final Handler mMainHandler = new Handler(Looper.getMainLooper());
    public boolean mNeedConnect;
    public long mScanTimeout;

    public static final class ScanHandler extends Handler {
        public final WeakReference<BleScanPresenter> mBleScanPresenter;

        public ScanHandler(Looper looper, BleScanPresenter bleScanPresenter) {
            super(looper);
            this.mBleScanPresenter = new WeakReference<>(bleScanPresenter);
        }

        public void handleMessage(Message message) {
            BleDevice bleDevice;
            BleScanPresenter bleScanPresenter = (BleScanPresenter) this.mBleScanPresenter.get();
            if (bleScanPresenter != null && message.what == 0 && (bleDevice = (BleDevice) message.obj) != null) {
                bleScanPresenter.handleResult(bleDevice);
            }
        }
    }

    private void checkDevice(BleDevice bleDevice) {
        String[] strArr;
        if (TextUtils.isEmpty(this.mDeviceMac) && ((strArr = this.mDeviceNames) == null || strArr.length < 1)) {
            correctDeviceAndNextStep(bleDevice);
        } else if (TextUtils.isEmpty(this.mDeviceMac) || this.mDeviceMac.equalsIgnoreCase(bleDevice.getMac())) {
            String[] strArr2 = this.mDeviceNames;
            if (strArr2 != null && strArr2.length > 0) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                for (String str : this.mDeviceNames) {
                    String name = bleDevice.getName();
                    if (name == null) {
                        name = "";
                    }
                    if (this.mFuzzy) {
                        if (!name.contains(str)) {
                        }
                    } else if (!name.equals(str)) {
                    }
                    atomicBoolean.set(true);
                }
                if (!atomicBoolean.get()) {
                    return;
                }
            }
            correctDeviceAndNextStep(bleDevice);
        }
    }

    private void correctDeviceAndNextStep(final BleDevice bleDevice) {
        if (this.mNeedConnect) {
            BleLog.m9698i("devices detected  ------  name:" + bleDevice.getName() + "  mac:" + bleDevice.getMac() + "  Rssi:" + bleDevice.getRssi() + "  scanRecord:" + HexUtil.formatHexString(bleDevice.getScanRecord()));
            this.mBleDeviceList.add(bleDevice);
            this.mMainHandler.post(new Runnable() {
                public void run() {
                    BleScanner.getInstance().stopLeScan();
                }
            });
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (BleDevice device : this.mBleDeviceList) {
            if (device.getDevice().equals(bleDevice.getDevice())) {
                atomicBoolean.set(true);
            }
        }
        if (!atomicBoolean.get()) {
            BleLog.m9698i("device detected  ------  name: " + bleDevice.getName() + "  mac: " + bleDevice.getMac() + "  Rssi: " + bleDevice.getRssi() + "  scanRecord: " + HexUtil.formatHexString(bleDevice.getScanRecord(), true));
            this.mBleDeviceList.add(bleDevice);
            this.mMainHandler.post(new Runnable() {
                public void run() {
                    BleScanPresenter.this.onScanning(bleDevice);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void handleResult(final BleDevice bleDevice) {
        this.mMainHandler.post(new Runnable() {
            public void run() {
                BleScanPresenter.this.onLeScan(bleDevice);
            }
        });
        checkDevice(bleDevice);
    }

    public BleScanPresenterImp getBleScanPresenterImp() {
        return this.mBleScanPresenterImp;
    }

    public boolean ismNeedConnect() {
        return this.mNeedConnect;
    }

    public final void notifyScanStarted(final boolean z) {
        this.mBleDeviceList.clear();
        removeHandlerMsg();
        if (z && this.mScanTimeout > 0) {
            this.mMainHandler.postDelayed(new Runnable() {
                public void run() {
                    BleScanner.getInstance().stopLeScan();
                }
            }, this.mScanTimeout);
        }
        this.mMainHandler.post(new Runnable() {
            public void run() {
                BleScanPresenter.this.onScanStarted(z);
            }
        });
    }

    public final void notifyScanStopped() {
        this.mHandling = false;
        this.mHandlerThread.quit();
        removeHandlerMsg();
        this.mMainHandler.post(new Runnable() {
            public void run() {
                BleScanPresenter bleScanPresenter = BleScanPresenter.this;
                bleScanPresenter.onScanFinished(bleScanPresenter.mBleDeviceList);
            }
        });
    }

    public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        if (bluetoothDevice != null && this.mHandling) {
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.what = 0;
            obtainMessage.obj = new BleDevice(bluetoothDevice, i, bArr, System.currentTimeMillis());
            this.mHandler.sendMessage(obtainMessage);
        }
    }

    public abstract void onLeScan(BleDevice bleDevice);

    public abstract void onScanFinished(List<BleDevice> list);

    public abstract void onScanStarted(boolean z);

    public abstract void onScanning(BleDevice bleDevice);

    public void prepare(String[] strArr, String str, boolean z, boolean z2, long j, BleScanPresenterImp bleScanPresenterImp) {
        this.mDeviceNames = strArr;
        this.mDeviceMac = str;
        this.mFuzzy = z;
        this.mNeedConnect = z2;
        this.mScanTimeout = j;
        this.mBleScanPresenterImp = bleScanPresenterImp;
        HandlerThread handlerThread = new HandlerThread(BleScanPresenter.class.getSimpleName());
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new ScanHandler(this.mHandlerThread.getLooper(), this);
        this.mHandling = true;
    }

    public final void removeHandlerMsg() {
        this.mMainHandler.removeCallbacksAndMessages((Object) null);
        this.mHandler.removeCallbacksAndMessages((Object) null);
    }
}
