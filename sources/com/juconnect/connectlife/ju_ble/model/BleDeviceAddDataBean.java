package com.juconnect.connectlife.ju_ble.model;

import java.util.HashMap;

public class BleDeviceAddDataBean {
    public static HashMap<String, BleDeviceItem> bleMap = new HashMap<>();

    public static class BleDeviceItem {
        public int deviceIcon;
        public int deviceName;
        public int hType = -1;

        public BleDeviceItem(int i, int i2, int i3) {
            this.deviceName = i;
            this.deviceIcon = i2;
            this.hType = i3;
        }

        public int getDeviceIcon() {
            return this.deviceIcon;
        }

        public int getDeviceName() {
            return this.deviceName;
        }

        public int gethType() {
            return this.hType;
        }

        public BleDeviceItem(int i, int i2) {
            this.deviceName = i;
            this.deviceIcon = i2;
        }
    }
}
