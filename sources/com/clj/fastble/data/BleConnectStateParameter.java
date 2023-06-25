package com.clj.fastble.data;

public class BleConnectStateParameter {
    public boolean isActive;
    public int status;

    public BleConnectStateParameter(int i) {
        this.status = i;
    }

    public int getStatus() {
        return this.status;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public void setActive(boolean z) {
        this.isActive = z;
    }

    public void setStatus(int i) {
        this.status = i;
    }
}
