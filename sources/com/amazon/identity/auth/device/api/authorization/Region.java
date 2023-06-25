package com.amazon.identity.auth.device.api.authorization;

public enum Region {
    AUTO("AUTO"),
    NA("NA"),
    EU("EU"),
    FE("FE");
    
    public String stringValue;

    /* access modifiers changed from: public */
    Region(String str) {
        this.stringValue = str;
    }

    public String getStringValue() {
        return this.stringValue;
    }
}
