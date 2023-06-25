package androidx.camera.core.impl.utils.futures;

import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.futures.AbstractFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p040c.p200q.p353b.p360g.p361a.C6316e;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Deprecated
public abstract class FluentFuture<V> extends AbstractFuture<V> {

    public static abstract class TrustedFuture<V> extends FluentFuture<V> implements AbstractFuture.Trusted<V> {
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        public final V get() {
            return super.get();
        }

        public final boolean isCancelled() {
            return super.isCancelled();
        }

        public final boolean isDone() {
            return super.isDone();
        }

        public final V get(long j, TimeUnit timeUnit) {
            return super.get(j, timeUnit);
        }
    }

    public static <V> FluentFuture<V> from(C6316e<V> eVar) {
        return eVar instanceof FluentFuture ? (FluentFuture) eVar : new ForwardingFluentFuture(eVar);
    }

    public final void addCallback(FutureCallback<? super V> futureCallback, Executor executor) {
        Futures.addCallback(this, futureCallback, executor);
    }

    public final <T> FluentFuture<T> transform(Function<? super V, T> function, Executor executor) {
        return (FluentFuture) Futures.transform(this, function, executor);
    }

    public final <T> FluentFuture<T> transformAsync(AsyncFunction<? super V, T> asyncFunction, Executor executor) {
        return (FluentFuture) Futures.transformAsync(this, asyncFunction, executor);
    }
}
