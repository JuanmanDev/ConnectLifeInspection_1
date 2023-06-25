package androidx.camera.core.impl.utils.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FluentFuture;
import androidx.core.util.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p040c.p200q.p353b.p360g.p361a.C6316e;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class AbstractTransformFuture<I, O, F, T> extends FluentFuture.TrustedFuture<O> implements Runnable {
    @Nullable
    public F mFunction;
    @Nullable
    public C6316e<? extends I> mInputFuture;

    public static final class AsyncTransformFuture<I, O> extends AbstractTransformFuture<I, O, AsyncFunction<? super I, ? extends O>, C6316e<? extends O>> {
        public AsyncTransformFuture(C6316e<? extends I> eVar, AsyncFunction<? super I, ? extends O> asyncFunction) {
            super(eVar, asyncFunction);
        }

        public C6316e<? extends O> doTransform(AsyncFunction<? super I, ? extends O> asyncFunction, @Nullable I i) {
            C6316e<? extends O> apply = asyncFunction.apply(i);
            Preconditions.checkNotNull(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? " + asyncFunction);
            return apply;
        }

        public void setResult(C6316e<? extends O> eVar) {
            setFuture(eVar);
        }
    }

    public static final class TransformFuture<I, O> extends AbstractTransformFuture<I, O, Function<? super I, ? extends O>, O> {
        public TransformFuture(C6316e<? extends I> eVar, Function<? super I, ? extends O> function) {
            super(eVar, function);
        }

        public void setResult(@Nullable O o) {
            set(o);
        }

        @Nullable
        public O doTransform(Function<? super I, ? extends O> function, @Nullable I i) {
            return function.apply(i);
        }
    }

    public AbstractTransformFuture(C6316e<? extends I> eVar, F f) {
        this.mInputFuture = (C6316e) Preconditions.checkNotNull(eVar);
        this.mFunction = Preconditions.checkNotNull(f);
    }

    public static <I, O> C6316e<O> create(C6316e<I> eVar, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
        Preconditions.checkNotNull(executor);
        AsyncTransformFuture asyncTransformFuture = new AsyncTransformFuture(eVar, asyncFunction);
        eVar.addListener(asyncTransformFuture, rejectionPropagatingExecutor(executor, asyncTransformFuture));
        return asyncTransformFuture;
    }

    public static Executor rejectionPropagatingExecutor(final Executor executor, final AbstractFuture<?> abstractFuture) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(abstractFuture);
        if (executor == CameraXExecutors.directExecutor()) {
            return executor;
        }
        return new Executor() {
            public boolean mThrownFromDelegate = true;

            public void execute(final Runnable runnable) {
                try {
                    executor.execute(new Runnable() {
                        public void run() {
                            C04661.this.mThrownFromDelegate = false;
                            runnable.run();
                        }
                    });
                } catch (RejectedExecutionException e) {
                    if (this.mThrownFromDelegate) {
                        abstractFuture.setException(e);
                    }
                }
            }
        };
    }

    public final void afterDone() {
        maybePropagateCancellationTo(this.mInputFuture);
        this.mInputFuture = null;
        this.mFunction = null;
    }

    @Nullable
    public abstract T doTransform(F f, @Nullable I i);

    public String pendingToString() {
        String str;
        C6316e<? extends I> eVar = this.mInputFuture;
        F f = this.mFunction;
        String pendingToString = super.pendingToString();
        if (eVar != null) {
            str = "mInputFuture=[" + eVar + "], ";
        } else {
            str = "";
        }
        if (f != null) {
            return str + "mFunction=[" + f + "]";
        } else if (pendingToString == null) {
            return null;
        } else {
            return str + pendingToString;
        }
    }

    public final void run() {
        C6316e<? extends I> eVar = this.mInputFuture;
        F f = this.mFunction;
        boolean z = true;
        boolean isCancelled = isCancelled() | (eVar == null);
        if (f != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.mInputFuture = null;
            if (eVar.isCancelled()) {
                setFuture(eVar);
                return;
            }
            try {
                try {
                    Object doTransform = doTransform(f, Futures.getDone(eVar));
                    this.mFunction = null;
                    setResult(doTransform);
                } catch (Throwable th) {
                    this.mFunction = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                setException(e.getCause());
            } catch (RuntimeException e2) {
                setException(e2);
            } catch (Error e3) {
                setException(e3);
            }
        }
    }

    public abstract void setResult(@Nullable T t);

    public static <I, O> C6316e<O> create(C6316e<I> eVar, Function<? super I, ? extends O> function, Executor executor) {
        Preconditions.checkNotNull(function);
        TransformFuture transformFuture = new TransformFuture(eVar, function);
        eVar.addListener(transformFuture, rejectionPropagatingExecutor(executor, transformFuture));
        return transformFuture;
    }
}
