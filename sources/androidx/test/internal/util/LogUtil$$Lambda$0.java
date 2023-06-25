package androidx.test.internal.util;

import androidx.test.internal.util.LogUtil;

public final /* synthetic */ class LogUtil$$Lambda$0 implements LogUtil.Supplier {
    public final String arg$1;

    public LogUtil$$Lambda$0(String str) {
        this.arg$1 = str;
    }

    public Object get() {
        return LogUtil.lambda$logDebug$0$LogUtil(this.arg$1);
    }
}
