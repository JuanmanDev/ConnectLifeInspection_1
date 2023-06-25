package p691no.nordicsemi.android.dfu.internal.scanner;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p641l.p642a.p643a.p644a.p645a.p646a.C9597a;
import p691no.nordicsemi.android.dfu.DfuDeviceSelector;

@SuppressLint({"MissingPermission"})
/* renamed from: no.nordicsemi.android.dfu.internal.scanner.BootloaderScannerJB */
public class BootloaderScannerJB implements BootloaderScanner, BluetoothAdapter.LeScanCallback {
    public String mBootloaderAddress;
    public final String mDeviceAddress;
    public final String mDeviceAddressIncremented;
    public boolean mFound;
    public final Object mLock = new Object();
    public DfuDeviceSelector mSelector;

    public BootloaderScannerJB(String str, String str2) {
        this.mDeviceAddress = str;
        this.mDeviceAddressIncremented = str2;
    }

    /* renamed from: a */
    public /* synthetic */ void mo51237a(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
        if (!this.mFound) {
            this.mBootloaderAddress = null;
            this.mFound = true;
            synchronized (this.mLock) {
                this.mLock.notifyAll();
            }
        }
    }

    public void onLeScan(@NonNull BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        String address = bluetoothDevice.getAddress();
        if (!this.mFound) {
            if (this.mSelector.matches(bluetoothDevice, i, bArr, this.mDeviceAddress, this.mDeviceAddressIncremented)) {
                this.mBootloaderAddress = address;
                this.mFound = true;
                synchronized (this.mLock) {
                    this.mLock.notifyAll();
                }
            }
        }
    }

    @Nullable
    public String searchUsing(@NonNull DfuDeviceSelector dfuDeviceSelector, long j) {
        this.mSelector = dfuDeviceSelector;
        this.mBootloaderAddress = null;
        this.mFound = false;
        new Thread(new C9597a(this, j), "Scanner timer").start();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || defaultAdapter.getState() != 12) {
            return null;
        }
        defaultAdapter.startLeScan(this);
        try {
            synchronized (this.mLock) {
                while (!this.mFound) {
                    this.mLock.wait();
                }
            }
        } catch (InterruptedException unused) {
        }
        defaultAdapter.stopLeScan(this);
        return this.mBootloaderAddress;
    }
}
