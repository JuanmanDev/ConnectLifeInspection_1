package androidx.camera.core.impl.utils.futures;

import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p040c.p200q.p353b.p360g.p361a.C6316e;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ForwardingFluentFuture<V> extends FluentFuture<V> {
    public final C6316e<V> mDelegate;

    public ForwardingFluentFuture(C6316e<V> eVar) {
        this.mDelegate = (C6316e) Preconditions.checkNotNull(eVar);
    }

    public void addListener(Runnable runnable, Executor executor) {
        this.mDelegate.addListener(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return this.mDelegate.cancel(z);
    }

    public V get() {
        return this.mDelegate.get();
    }

    public boolean isCancelled() {
        return this.mDelegate.isCancelled();
    }

    public boolean isDone() {
        return this.mDelegate.isDone();
    }

    public V get(long j, TimeUnit timeUnit) {
        return this.mDelegate.get(j, timeUnit);
    }
}
