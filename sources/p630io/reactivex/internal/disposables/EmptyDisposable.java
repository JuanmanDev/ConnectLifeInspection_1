package p630io.reactivex.internal.disposables;

import p553f.p594c.C9184b;
import p553f.p594c.C9188f;
import p553f.p594c.C9193j;
import p553f.p594c.C9198m;
import p553f.p594c.p602s.p605c.C9229b;

/* renamed from: io.reactivex.internal.disposables.EmptyDisposable */
public enum EmptyDisposable implements C9229b<Object> {
    INSTANCE,
    NEVER;

    public static void complete(C9193j<?> jVar) {
        jVar.onSubscribe(INSTANCE);
        jVar.onComplete();
    }

    public static void error(Throwable th, C9193j<?> jVar) {
        jVar.onSubscribe(INSTANCE);
        jVar.onError(th);
    }

    public void clear() {
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return this == INSTANCE;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() {
        return null;
    }

    public int requestFusion(int i) {
        return i & 2;
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(C9188f<?> fVar) {
        fVar.onSubscribe(INSTANCE);
        fVar.onComplete();
    }

    public static void error(Throwable th, C9184b bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onError(th);
    }

    public static void complete(C9184b bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onComplete();
    }

    public static void error(Throwable th, C9198m<?> mVar) {
        mVar.onSubscribe(INSTANCE);
        mVar.onError(th);
    }

    public static void error(Throwable th, C9188f<?> fVar) {
        fVar.onSubscribe(INSTANCE);
        fVar.onError(th);
    }
}
