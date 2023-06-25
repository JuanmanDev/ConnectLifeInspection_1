package p553f.p594c.p602s.p607e.p608a;

import p553f.p594c.C9185c;
import p553f.p594c.p602s.p605c.C9232e;
import p630io.reactivex.internal.subscriptions.ScalarSubscription;
import p648m.p683f.C9802b;

/* renamed from: f.c.s.e.a.i */
/* compiled from: FlowableJust */
public final class C9253i<T> extends C9185c<T> implements C9232e<T> {

    /* renamed from: l */
    public final T f18086l;

    public C9253i(T t) {
        this.f18086l = t;
    }

    public T call() {
        return this.f18086l;
    }

    /* renamed from: v */
    public void mo46993v(C9802b<? super T> bVar) {
        bVar.onSubscribe(new ScalarSubscription(bVar, this.f18086l));
    }
}
