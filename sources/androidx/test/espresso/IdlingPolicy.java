package androidx.test.espresso;

import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class IdlingPolicy {
    public static final String TAG = "IdlingPolicy";
    public final ResponseAction errorHandler;
    public final long idleTimeout;
    public final TimeUnit unit;

    /* renamed from: androidx.test.espresso.IdlingPolicy$1 */
    public static /* synthetic */ class C09531 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$test$espresso$IdlingPolicy$ResponseAction;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.test.espresso.IdlingPolicy$ResponseAction[] r0 = androidx.test.espresso.IdlingPolicy.ResponseAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$test$espresso$IdlingPolicy$ResponseAction = r0
                androidx.test.espresso.IdlingPolicy$ResponseAction r1 = androidx.test.espresso.IdlingPolicy.ResponseAction.THROW_APP_NOT_IDLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$test$espresso$IdlingPolicy$ResponseAction     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.test.espresso.IdlingPolicy$ResponseAction r1 = androidx.test.espresso.IdlingPolicy.ResponseAction.THROW_IDLE_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$test$espresso$IdlingPolicy$ResponseAction     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.test.espresso.IdlingPolicy$ResponseAction r1 = androidx.test.espresso.IdlingPolicy.ResponseAction.LOG_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.IdlingPolicy.C09531.<clinit>():void");
        }
    }

    public static class Builder {
        public ResponseAction errorHandler;
        public long idleTimeout;
        public TimeUnit unit;

        public /* synthetic */ Builder(IdlingPolicy idlingPolicy, C09531 r2) {
            this(idlingPolicy);
        }

        public IdlingPolicy build() {
            return new IdlingPolicy(this, (C09531) null);
        }

        public Builder logWarning() {
            this.errorHandler = ResponseAction.LOG_ERROR;
            return this;
        }

        public Builder throwAppNotIdleException() {
            this.errorHandler = ResponseAction.THROW_APP_NOT_IDLE;
            return this;
        }

        public Builder throwIdlingResourceTimeoutException() {
            this.errorHandler = ResponseAction.THROW_IDLE_TIMEOUT;
            return this;
        }

        public Builder withIdlingTimeout(long j) {
            this.idleTimeout = j;
            return this;
        }

        public Builder withIdlingTimeoutUnit(TimeUnit timeUnit) {
            this.unit = timeUnit;
            return this;
        }

        public Builder() {
            this.idleTimeout = -1;
            this.unit = null;
            this.errorHandler = null;
        }

        public Builder(IdlingPolicy idlingPolicy) {
            this.idleTimeout = -1;
            this.unit = null;
            this.errorHandler = null;
            this.idleTimeout = idlingPolicy.idleTimeout;
            this.unit = idlingPolicy.unit;
            this.errorHandler = idlingPolicy.errorHandler;
        }
    }

    public enum ResponseAction {
        THROW_APP_NOT_IDLE,
        THROW_IDLE_TIMEOUT,
        LOG_ERROR
    }

    public /* synthetic */ IdlingPolicy(Builder builder, C09531 r2) {
        this(builder);
    }

    public long getIdleTimeout() {
        return this.idleTimeout;
    }

    public TimeUnit getIdleTimeoutUnit() {
        return this.unit;
    }

    public void handleTimeout(List<String> list, String str) {
        int i = C09531.$SwitchMap$androidx$test$espresso$IdlingPolicy$ResponseAction[this.errorHandler.ordinal()];
        if (i == 1) {
            throw AppNotIdleException.create(list, str);
        } else if (i == 2) {
            throw new IdlingResourceTimeoutException(list);
        } else if (i == 3) {
            String valueOf = String.valueOf(list);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("These resources are not idle: ");
            sb.append(valueOf);
            sb.toString();
        } else {
            String valueOf2 = String.valueOf(list);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("should never reach here.");
            sb2.append(valueOf2);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public Builder toBuilder() {
        return new Builder(this, (C09531) null);
    }

    public IdlingPolicy(Builder builder) {
        Preconditions.checkArgument(builder.idleTimeout > 0);
        this.idleTimeout = builder.idleTimeout;
        this.unit = (TimeUnit) Preconditions.checkNotNull(builder.unit);
        this.errorHandler = (ResponseAction) Preconditions.checkNotNull(builder.errorHandler);
    }
}
