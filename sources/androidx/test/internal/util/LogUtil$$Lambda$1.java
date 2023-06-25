package androidx.test.internal.util;

import androidx.test.internal.util.LogUtil;

public final /* synthetic */ class LogUtil$$Lambda$1 implements LogUtil.Supplier {
    public final String arg$1;

    public LogUtil$$Lambda$1(String str) {
        this.arg$1 = str;
    }

    public Object get() {
        return LogUtil.lambda$logDebugWithProcess$1$LogUtil(this.arg$1);
    }
}
