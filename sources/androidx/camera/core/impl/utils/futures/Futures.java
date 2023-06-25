package androidx.camera.core.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.futures.CollectionFuture;
import androidx.camera.core.impl.utils.futures.ImmediateFuture;
import androidx.core.util.Preconditions;
import androidx.test.internal.runner.RunnerArgs;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import p040c.p200q.p353b.p360g.p361a.C6316e;

public final class Futures {

    public static final class CallbackListener<V> implements Runnable {
        public final FutureCallback<? super V> mCallback;
        public final Future<V> mFuture;

        public CallbackListener(Future<V> future, FutureCallback<? super V> futureCallback) {
            this.mFuture = future;
            this.mCallback = futureCallback;
        }

        public void run() {
            try {
                this.mCallback.onSuccess(Futures.getDone(this.mFuture));
            } catch (ExecutionException e) {
                this.mCallback.onFailure(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.mCallback.onFailure(e2);
            }
        }

        public String toString() {
            return CallbackListener.class.getSimpleName() + RunnerArgs.CLASS_SEPARATOR + this.mCallback;
        }
    }

    public static <V> void addCallback(@NonNull C6316e<V> eVar, @NonNull FutureCallback<? super V> futureCallback, @NonNull Executor executor) {
        Preconditions.checkNotNull(futureCallback);
        eVar.addListener(new CallbackListener(eVar, futureCallback), executor);
    }

    @NonNull
    public static <V> C6316e<List<V>> allAsList(@NonNull Collection<? extends C6316e<? extends V>> collection) {
        return new CollectionFuture.ListFuture(collection, true);
    }

    @Nullable
    public static <V> V getDone(@NonNull Future<V> future) {
        boolean isDone = future.isDone();
        Preconditions.checkState(isDone, "Future was expected to be done, " + future);
        return getUninterruptibly(future);
    }

    @Nullable
    public static <V> V getUninterruptibly(@NonNull Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    @NonNull
    public static <V> C6316e<V> immediateFailedFuture(@NonNull Throwable th) {
        return new ImmediateFuture.ImmediateFailedFuture(th);
    }

    @NonNull
    public static <V> ScheduledFuture<V> immediateFailedScheduledFuture(@NonNull Throwable th) {
        return new ImmediateFuture.ImmediateFailedScheduledFuture(th);
    }

    @NonNull
    public static <V> C6316e<V> immediateFuture(@Nullable V v) {
        if (v == null) {
            return ImmediateFuture.nullFuture();
        }
        return new ImmediateFuture.ImmediateSuccessfulFuture(v);
    }

    @NonNull
    public static <V> C6316e<List<V>> successfulAsList(@NonNull Collection<? extends C6316e<? extends V>> collection) {
        return new CollectionFuture.ListFuture(collection, false);
    }

    @NonNull
    public static <I, O> C6316e<O> transform(@NonNull C6316e<I> eVar, @NonNull Function<? super I, ? extends O> function, @NonNull Executor executor) {
        return AbstractTransformFuture.create(eVar, function, executor);
    }

    @NonNull
    public static <I, O> C6316e<O> transformAsync(@NonNull C6316e<I> eVar, @NonNull AsyncFunction<? super I, ? extends O> asyncFunction, @NonNull Executor executor) {
        return AbstractTransformFuture.create(eVar, asyncFunction, executor);
    }
}
