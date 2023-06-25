package androidx.test.espresso.core.internal.deps.guava.util.concurrent;

import androidx.test.espresso.core.internal.deps.guava.collect.ForwardingObject;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class ForwardingFuture<V> extends ForwardingObject implements Future<V> {
    public boolean cancel(boolean z) {
        return delegate().cancel(z);
    }

    public abstract Future<? extends V> delegate();

    public V get() {
        return delegate().get();
    }

    public boolean isCancelled() {
        return delegate().isCancelled();
    }

    public boolean isDone() {
        return delegate().isDone();
    }

    public V get(long j, TimeUnit timeUnit) {
        return delegate().get(j, timeUnit);
    }
}
