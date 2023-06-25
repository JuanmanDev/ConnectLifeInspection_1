package androidx.camera.core.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p040c.p200q.p353b.p360g.p361a.C6316e;

public abstract class ImmediateFuture<V> implements C6316e<V> {
    public static final String TAG = "ImmediateFuture";

    public static class ImmediateFailedFuture<V> extends ImmediateFuture<V> {
        @NonNull
        public final Throwable mCause;

        public ImmediateFailedFuture(@NonNull Throwable th) {
            this.mCause = th;
        }

        @Nullable
        public V get() {
            throw new ExecutionException(this.mCause);
        }

        @NonNull
        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.mCause + "]]";
        }
    }

    public static final class ImmediateFailedScheduledFuture<V> extends ImmediateFailedFuture<V> implements ScheduledFuture<V> {
        public ImmediateFailedScheduledFuture(@NonNull Throwable th) {
            super(th);
        }

        public int compareTo(@NonNull Delayed delayed) {
            return -1;
        }

        public long getDelay(@NonNull TimeUnit timeUnit) {
            return 0;
        }
    }

    public static final class ImmediateSuccessfulFuture<V> extends ImmediateFuture<V> {
        public static final ImmediateFuture<Object> NULL_FUTURE = new ImmediateSuccessfulFuture((Object) null);
        @Nullable
        public final V mValue;

        public ImmediateSuccessfulFuture(@Nullable V v) {
            this.mValue = v;
        }

        @Nullable
        public V get() {
            return this.mValue;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.mValue + "]]";
        }
    }

    public static <V> C6316e<V> nullFuture() {
        return ImmediateSuccessfulFuture.NULL_FUTURE;
    }

    public void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException unused) {
            "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor;
        }
    }

    public boolean cancel(boolean z) {
        return false;
    }

    @Nullable
    public abstract V get();

    @Nullable
    public V get(long j, @NonNull TimeUnit timeUnit) {
        Preconditions.checkNotNull(timeUnit);
        return get();
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }
}
