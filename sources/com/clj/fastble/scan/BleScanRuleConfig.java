package com.clj.fastble.scan;

import java.util.UUID;

public class BleScanRuleConfig {
    public boolean mAutoConnect = false;
    public String mDeviceMac = null;
    public String[] mDeviceNames = null;
    public boolean mFuzzy = false;
    public long mScanTimeOut = 10000;
    public UUID[] mServiceUuids = null;

    public static class Builder {
        public boolean mAutoConnect = false;
        public String mDeviceMac = null;
        public String[] mDeviceNames = null;
        public boolean mFuzzy = false;
        public UUID[] mServiceUuids = null;
        public long mTimeOut = 10000;

        public void applyConfig(BleScanRuleConfig bleScanRuleConfig) {
            UUID[] unused = bleScanRuleConfig.mServiceUuids = this.mServiceUuids;
            String[] unused2 = bleScanRuleConfig.mDeviceNames = this.mDeviceNames;
            String unused3 = bleScanRuleConfig.mDeviceMac = this.mDeviceMac;
            boolean unused4 = bleScanRuleConfig.mAutoConnect = this.mAutoConnect;
            boolean unused5 = bleScanRuleConfig.mFuzzy = this.mFuzzy;
            long unused6 = bleScanRuleConfig.mScanTimeOut = this.mTimeOut;
        }

        public BleScanRuleConfig build() {
            BleScanRuleConfig bleScanRuleConfig = new BleScanRuleConfig();
            applyConfig(bleScanRuleConfig);
            return bleScanRuleConfig;
        }

        public Builder setAutoConnect(boolean z) {
            this.mAutoConnect = z;
            return this;
        }

        public Builder setDeviceMac(String str) {
            this.mDeviceMac = str;
            return this;
        }

        public Builder setDeviceName(boolean z, String... strArr) {
            this.mFuzzy = z;
            this.mDeviceNames = strArr;
            return this;
        }

        public Builder setScanTimeOut(long j) {
            this.mTimeOut = j;
            return this;
        }

        public Builder setServiceUuids(UUID[] uuidArr) {
            this.mServiceUuids = uuidArr;
            return this;
        }
    }

    public String getDeviceMac() {
        return this.mDeviceMac;
    }

    public String[] getDeviceNames() {
        return this.mDeviceNames;
    }

    public long getScanTimeOut() {
        return this.mScanTimeOut;
    }

    public UUID[] getServiceUuids() {
        return this.mServiceUuids;
    }

    public boolean isAutoConnect() {
        return this.mAutoConnect;
    }

    public boolean isFuzzy() {
        return this.mFuzzy;
    }
}
