package com.amazon.identity.auth.device.endpoint;

import java.io.IOException;
import p040c.p048b.p049a.p050a.p051a.p060m.C1431f;

public class BackoffException extends IOException {
    public final C1431f mBackoffInfo;
    public final String mErrorMsg;

    public BackoffException(String str, C1431f fVar) {
        super(str);
        this.mErrorMsg = str;
        this.mBackoffInfo = fVar;
    }

    public C1431f getBackoffInfo() {
        return this.mBackoffInfo;
    }

    public String getErrorMsg() {
        return this.mErrorMsg;
    }
}
