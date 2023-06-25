package com.clj.fastble.data;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;

public class BleDevice implements Parcelable {
    public static final Parcelable.Creator<BleDevice> CREATOR = new Parcelable.Creator<BleDevice>() {
        public BleDevice createFromParcel(Parcel parcel) {
            return new BleDevice(parcel);
        }

        public BleDevice[] newArray(int i) {
            return new BleDevice[i];
        }
    };
    public BluetoothDevice mDevice;
    public int mRssi;
    public byte[] mScanRecord;
    public long mTimestampNanos;

    public BleDevice(BluetoothDevice bluetoothDevice) {
        this.mDevice = bluetoothDevice;
    }

    public int describeContents() {
        return 0;
    }

    public BluetoothDevice getDevice() {
        return this.mDevice;
    }

    public String getKey() {
        if (this.mDevice == null) {
            return "";
        }
        return this.mDevice.getName() + this.mDevice.getAddress();
    }

    public String getMac() {
        BluetoothDevice bluetoothDevice = this.mDevice;
        if (bluetoothDevice != null) {
            return bluetoothDevice.getAddress();
        }
        return null;
    }

    public String getName() {
        BluetoothDevice bluetoothDevice = this.mDevice;
        if (bluetoothDevice != null) {
            return bluetoothDevice.getName();
        }
        return null;
    }

    public int getRssi() {
        return this.mRssi;
    }

    public byte[] getScanRecord() {
        return this.mScanRecord;
    }

    public long getTimestampNanos() {
        return this.mTimestampNanos;
    }

    public void setDevice(BluetoothDevice bluetoothDevice) {
        this.mDevice = bluetoothDevice;
    }

    public void setRssi(int i) {
        this.mRssi = i;
    }

    public void setScanRecord(byte[] bArr) {
        this.mScanRecord = bArr;
    }

    public void setTimestampNanos(long j) {
        this.mTimestampNanos = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mDevice, i);
        parcel.writeByteArray(this.mScanRecord);
        parcel.writeInt(this.mRssi);
        parcel.writeLong(this.mTimestampNanos);
    }

    public BleDevice(BluetoothDevice bluetoothDevice, int i, byte[] bArr, long j) {
        this.mDevice = bluetoothDevice;
        this.mScanRecord = bArr;
        this.mRssi = i;
        this.mTimestampNanos = j;
    }

    public BleDevice(Parcel parcel) {
        this.mDevice = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.mScanRecord = parcel.createByteArray();
        this.mRssi = parcel.readInt();
        this.mTimestampNanos = parcel.readLong();
    }
}
