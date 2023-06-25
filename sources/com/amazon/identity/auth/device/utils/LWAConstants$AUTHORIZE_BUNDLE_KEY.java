package com.amazon.identity.auth.device.utils;

public enum LWAConstants$AUTHORIZE_BUNDLE_KEY {
    REGION("com.amazon.identity.auth.device.authorization.region"),
    RETURN_ACCESS_TOKEN("com.amazon.identity.auth.device.authorization.returnAccessToken"),
    STAGE("com.amazon.identity.auth.device.authorization.stage"),
    SHOW_PROGRESS("com.amazon.identity.auth.device.authorizationshowProgress");
    
    public final String val;

    /* access modifiers changed from: public */
    LWAConstants$AUTHORIZE_BUNDLE_KEY(String str) {
        this.val = str;
    }
}
