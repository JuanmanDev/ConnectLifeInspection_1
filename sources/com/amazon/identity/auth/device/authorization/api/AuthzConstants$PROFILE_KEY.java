package com.amazon.identity.auth.device.authorization.api;

public enum AuthzConstants$PROFILE_KEY {
    NAME("name"),
    EMAIL("email"),
    USER_ID("user_id"),
    POSTAL_CODE("postal_code");
    
    public final String val;

    /* access modifiers changed from: public */
    AuthzConstants$PROFILE_KEY(String str) {
        this.val = str;
    }
}
