package p692o.p693v.p694a;

import p553f.p594c.C9190h;
import p553f.p594c.C9193j;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.CompositeException;
import p692o.C9909p;

/* renamed from: o.v.a.e */
/* compiled from: ResultObservable */
public final class C9927e<T> extends C9190h<C9926d<T>> {

    /* renamed from: e */
    public final C9190h<C9909p<T>> f19294e;

    /* renamed from: o.v.a.e$a */
    /* compiled from: ResultObservable */
    public static class C9928a<R> implements C9193j<C9909p<R>> {

        /* renamed from: e */
        public final C9193j<? super C9926d<R>> f19295e;

        public C9928a(C9193j<? super C9926d<R>> jVar) {
            this.f19295e = jVar;
        }

        /* renamed from: a */
        public void onNext(C9909p<R> pVar) {
            this.f19295e.onNext(C9926d.m26608b(pVar));
        }

        public void onComplete() {
            this.f19295e.onComplete();
        }

        public void onError(Throwable th) {
            try {
                this.f19295e.onNext(C9926d.m26607a(th));
                this.f19295e.onComplete();
            } catch (Throwable th2) {
                C9211a.m24971b(th2);
                C9323a.m25169p(new CompositeException(th, th2));
            }
        }

        public void onSubscribe(C9207b bVar) {
            this.f19295e.onSubscribe(bVar);
        }
    }

    public C9927e(C9190h<C9909p<T>> hVar) {
        this.f19294e = hVar;
    }

    /* renamed from: e */
    public void mo47006e(C9193j<? super C9926d<T>> jVar) {
        this.f19294e.mo47002a(new C9928a(jVar));
    }
}
