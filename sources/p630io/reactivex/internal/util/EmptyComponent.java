package p630io.reactivex.internal.util;

import p553f.p594c.C9184b;
import p553f.p594c.C9186d;
import p553f.p594c.C9188f;
import p553f.p594c.C9193j;
import p553f.p594c.C9198m;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p617v.C9323a;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: io.reactivex.internal.util.EmptyComponent */
public enum EmptyComponent implements C9186d<Object>, C9193j<Object>, C9188f<Object>, C9198m<Object>, C9184b, C9803c, C9207b {
    INSTANCE;

    public static <T> C9193j<T> asObserver() {
        return INSTANCE;
    }

    public static <T> C9802b<T> asSubscriber() {
        return INSTANCE;
    }

    public void cancel() {
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }

    public void onComplete() {
    }

    public void onError(Throwable th) {
        C9323a.m25169p(th);
    }

    public void onNext(Object obj) {
    }

    public void onSubscribe(C9207b bVar) {
        bVar.dispose();
    }

    public void onSuccess(Object obj) {
    }

    public void request(long j) {
    }

    public void onSubscribe(C9803c cVar) {
        cVar.cancel();
    }
}
