package p691no.nordicsemi.android.dfu.internal.scanner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p641l.p642a.p643a.p644a.p645a.p646a.C9598b;
import p691no.nordicsemi.android.dfu.DfuDeviceSelector;

@SuppressLint({"MissingPermission"})
@TargetApi(21)
/* renamed from: no.nordicsemi.android.dfu.internal.scanner.BootloaderScannerLollipop */
public class BootloaderScannerLollipop extends ScanCallback implements BootloaderScanner {
    public String mBootloaderAddress;
    public final String mDeviceAddress;
    public final String mDeviceAddressIncremented;
    public boolean mFound;
    public final Object mLock = new Object();
    public DfuDeviceSelector mSelector;

    public BootloaderScannerLollipop(String str, String str2) {
        this.mDeviceAddress = str;
        this.mDeviceAddressIncremented = str2;
    }

    /* renamed from: a */
    public /* synthetic */ void mo51239a(long j) {
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

    public void onScanResult(int i, ScanResult scanResult) {
        String address = scanResult.getDevice().getAddress();
        if (!this.mFound && this.mSelector.matches(scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes(), this.mDeviceAddress, this.mDeviceAddressIncremented)) {
            this.mBootloaderAddress = address;
            this.mFound = true;
            synchronized (this.mLock) {
                this.mLock.notifyAll();
            }
        }
    }

    @Nullable
    public String searchUsing(@NonNull DfuDeviceSelector dfuDeviceSelector, long j) {
        BluetoothLeScanner bluetoothLeScanner;
        this.mSelector = dfuDeviceSelector;
        this.mBootloaderAddress = null;
        this.mFound = false;
        new Thread(new C9598b(this, j), "Scanner timer").start();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || defaultAdapter.getState() != 12 || (bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner()) == null) {
            return null;
        }
        ScanSettings build = new ScanSettings.Builder().setScanMode(2).build();
        if (!defaultAdapter.isOffloadedFilteringSupported() || Build.VERSION.SDK_INT < 27) {
            bluetoothLeScanner.startScan((List) null, build, this);
        } else {
            bluetoothLeScanner.startScan(new ArrayList(), build, this);
        }
        try {
            synchronized (this.mLock) {
                while (!this.mFound) {
                    this.mLock.wait();
                }
            }
        } catch (InterruptedException unused) {
        }
        bluetoothLeScanner.stopScan(this);
        return this.mBootloaderAddress;
    }
}
