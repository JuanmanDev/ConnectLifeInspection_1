package androidx.test.espresso;

import androidx.test.espresso.IdlingPolicy;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import java.util.concurrent.TimeUnit;

public final class IdlingPolicies {
    public static volatile IdlingPolicy dynamicIdlingResourceErrorPolicy = new IdlingPolicy.Builder().withIdlingTimeout(26).withIdlingTimeoutUnit(TimeUnit.SECONDS).throwIdlingResourceTimeoutException().build();
    public static volatile IdlingPolicy dynamicIdlingResourceWarningPolicy = new IdlingPolicy.Builder().withIdlingTimeout(5).withIdlingTimeoutUnit(TimeUnit.SECONDS).logWarning().build();
    public static volatile IdlingPolicy masterIdlingPolicy = new IdlingPolicy.Builder().withIdlingTimeout(60).withIdlingTimeoutUnit(TimeUnit.SECONDS).throwAppNotIdleException().build();

    public static IdlingPolicy getDynamicIdlingResourceErrorPolicy() {
        return dynamicIdlingResourceErrorPolicy;
    }

    public static IdlingPolicy getDynamicIdlingResourceWarningPolicy() {
        return dynamicIdlingResourceWarningPolicy;
    }

    public static IdlingPolicy getMasterIdlingPolicy() {
        return masterIdlingPolicy;
    }

    public static void setIdlingResourceTimeout(long j, TimeUnit timeUnit) {
        Preconditions.checkArgument(j > 0);
        Preconditions.checkNotNull(timeUnit);
        dynamicIdlingResourceErrorPolicy = dynamicIdlingResourceErrorPolicy.toBuilder().withIdlingTimeout(j).withIdlingTimeoutUnit(timeUnit).build();
    }

    public static void setMasterPolicyTimeout(long j, TimeUnit timeUnit) {
        Preconditions.checkArgument(j > 0);
        Preconditions.checkNotNull(timeUnit);
        masterIdlingPolicy = masterIdlingPolicy.toBuilder().withIdlingTimeout(j).withIdlingTimeoutUnit(timeUnit).build();
    }

    public static void setMasterPolicyTimeoutWhenDebuggerAttached(boolean z) {
        masterIdlingPolicy = masterIdlingPolicy.toBuilder().build();
    }
}
