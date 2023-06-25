package androidx.test.espresso.core.internal.deps.guava.util.concurrent;

import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.util.concurrent.AbstractFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class ImmediateFuture<V> implements ListenableFuture<V> {
    public static final Logger log = Logger.getLogger(ImmediateFuture.class.getName());

    public static final class ImmediateFailedFuture<V> extends AbstractFuture.TrustedFuture<V> {
        public ImmediateFailedFuture(Throwable th) {
            setException(th);
        }
    }

    public static class ImmediateSuccessfulFuture<V> extends ImmediateFuture<V> {
        public static final ImmediateSuccessfulFuture<Object> NULL = new ImmediateSuccessfulFuture<>((Object) null);
        public final V value;

        public ImmediateSuccessfulFuture(V v) {
            this.value = v;
        }

        public V get() {
            return this.value;
        }

        public String toString() {
            String obj = super.toString();
            String valueOf = String.valueOf(this.value);
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 27 + String.valueOf(valueOf).length());
            sb.append(obj);
            sb.append("[status=SUCCESS, result=[");
            sb.append(valueOf);
            sb.append("]]");
            return sb.toString();
        }
    }

    public void addListener(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = log;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "androidx.test.espresso.core.internal.deps.guava.util.concurrent.ImmediateFuture", "addListener", sb.toString(), e);
        }
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public abstract V get();

    public V get(long j, TimeUnit timeUnit) {
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
