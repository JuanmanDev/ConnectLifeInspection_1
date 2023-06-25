package com.clj.fastble.data;

public enum BleScanState {
    STATE_IDLE(-1),
    STATE_SCANNING(1);
    
    public int code;

    /* access modifiers changed from: public */
    BleScanState(int i) {
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }
}
