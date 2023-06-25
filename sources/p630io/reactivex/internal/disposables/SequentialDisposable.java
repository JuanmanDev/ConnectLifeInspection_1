package p630io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.p598o.C9207b;

/* renamed from: io.reactivex.internal.disposables.SequentialDisposable */
public final class SequentialDisposable extends AtomicReference<C9207b> implements C9207b {
    public static final long serialVersionUID = -754898800686245608L;

    public SequentialDisposable() {
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((C9207b) get());
    }

    public boolean replace(C9207b bVar) {
        return DisposableHelper.replace(this, bVar);
    }

    public boolean update(C9207b bVar) {
        return DisposableHelper.set(this, bVar);
    }

    public SequentialDisposable(C9207b bVar) {
        lazySet(bVar);
    }
}
