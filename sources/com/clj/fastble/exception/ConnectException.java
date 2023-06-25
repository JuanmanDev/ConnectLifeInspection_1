package com.clj.fastble.exception;

import android.bluetooth.BluetoothGatt;

public class ConnectException extends BleException {
    public BluetoothGatt bluetoothGatt;
    public int gattStatus;

    public ConnectException(BluetoothGatt bluetoothGatt2, int i) {
        super(101, "Gatt Exception Occurred! ");
        this.bluetoothGatt = bluetoothGatt2;
        this.gattStatus = i;
    }

    public BluetoothGatt getBluetoothGatt() {
        return this.bluetoothGatt;
    }

    public int getGattStatus() {
        return this.gattStatus;
    }

    public ConnectException setBluetoothGatt(BluetoothGatt bluetoothGatt2) {
        this.bluetoothGatt = bluetoothGatt2;
        return this;
    }

    public ConnectException setGattStatus(int i) {
        this.gattStatus = i;
        return this;
    }

    public String toString() {
        return "ConnectException{gattStatus=" + this.gattStatus + ", bluetoothGatt=" + this.bluetoothGatt + "} " + super.toString();
    }
}
