package androidx.test.internal.util;

import android.app.Instrumentation;
import android.os.Bundle;

public class AndroidRunnerParams {
    public final Bundle bundle;
    public final boolean ignoreSuiteMethods;
    public final Instrumentation instrumentation;
    public final long perTestTimeout;
    public final boolean skipExecution;

    @Deprecated
    public AndroidRunnerParams(Instrumentation instrumentation2, Bundle bundle2, boolean z, long j, boolean z2) {
        this.instrumentation = instrumentation2;
        this.bundle = bundle2;
        this.skipExecution = z;
        this.perTestTimeout = j;
        this.ignoreSuiteMethods = z2;
    }

    public Bundle getBundle() {
        return this.bundle;
    }

    public Instrumentation getInstrumentation() {
        return this.instrumentation;
    }

    public long getPerTestTimeout() {
        return this.perTestTimeout;
    }

    public boolean isIgnoreSuiteMethods() {
        return this.ignoreSuiteMethods;
    }

    @Deprecated
    public boolean isSkipExecution() {
        return this.skipExecution;
    }

    public AndroidRunnerParams(Instrumentation instrumentation2, Bundle bundle2, long j, boolean z) {
        this.instrumentation = instrumentation2;
        this.bundle = bundle2;
        this.skipExecution = false;
        this.perTestTimeout = j;
        this.ignoreSuiteMethods = z;
    }
}
