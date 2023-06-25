package p553f.p594c.p602s.p607e.p608a;

import p553f.p594c.p600q.C9212a;
import p630io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupBySubscriber;
import p648m.p683f.C9802b;

/* renamed from: f.c.s.e.a.g */
/* compiled from: FlowableGroupBy */
public final class C9251g<K, T> extends C9212a<K, T> {

    /* renamed from: m */
    public final C9252h<T, K> f18073m;

    public C9251g(K k, C9252h<T, K> hVar) {
        super(k);
        this.f18073m = hVar;
    }

    /* renamed from: A */
    public static <T, K> C9251g<K, T> m25012A(K k, int i, FlowableGroupBy$GroupBySubscriber<?, K, T> flowableGroupBy$GroupBySubscriber, boolean z) {
        return new C9251g<>(k, new C9252h(i, flowableGroupBy$GroupBySubscriber, k, z));
    }

    /* renamed from: B */
    public void mo47076B() {
        this.f18073m.onComplete();
    }

    /* renamed from: C */
    public void mo47077C(Throwable th) {
        this.f18073m.onError(th);
    }

    /* renamed from: D */
    public void mo47078D(T t) {
        this.f18073m.onNext(t);
    }

    /* renamed from: v */
    public void mo46993v(C9802b<? super T> bVar) {
        this.f18073m.mo46975a(bVar);
    }
}
