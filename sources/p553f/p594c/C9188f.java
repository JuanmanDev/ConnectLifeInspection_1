package p553f.p594c;

import p553f.p594c.p598o.C9207b;

/* renamed from: f.c.f */
/* compiled from: MaybeObserver */
public interface C9188f<T> {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(C9207b bVar);

    void onSuccess(T t);
}
