package p553f.p594c.p602s.p607e.p610c;

import p553f.p594c.C9193j;
import p553f.p594c.p615t.C9321a;
import p630io.reactivex.internal.operators.observable.ObservableGroupBy$GroupByObserver;

/* renamed from: f.c.s.e.c.b */
/* compiled from: ObservableGroupBy */
public final class C9279b<K, T> extends C9321a<K, T> {

    /* renamed from: l */
    public final C9280c<T, K> f18158l;

    public C9279b(K k, C9280c<T, K> cVar) {
        super(k);
        this.f18158l = cVar;
    }

    /* renamed from: h */
    public static <T, K> C9279b<K, T> m25049h(K k, int i, ObservableGroupBy$GroupByObserver<?, K, T> observableGroupBy$GroupByObserver, boolean z) {
        return new C9279b<>(k, new C9280c(i, observableGroupBy$GroupByObserver, k, z));
    }

    /* renamed from: e */
    public void mo47006e(C9193j<? super T> jVar) {
        this.f18158l.mo47002a(jVar);
    }

    /* renamed from: i */
    public void mo47101i() {
        this.f18158l.mo47106d();
    }

    /* renamed from: j */
    public void mo47102j(Throwable th) {
        this.f18158l.mo47107e(th);
    }

    /* renamed from: k */
    public void mo47103k(T t) {
        this.f18158l.mo47108f(t);
    }
}
