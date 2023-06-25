package p692o.p693v.p694a;

import p553f.p594c.C9190h;
import p553f.p594c.C9193j;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.CompositeException;
import p692o.C9855b;
import p692o.C9858d;
import p692o.C9909p;

/* renamed from: o.v.a.b */
/* compiled from: CallEnqueueObservable */
public final class C9922b<T> extends C9190h<C9909p<T>> {

    /* renamed from: e */
    public final C9855b<T> f19286e;

    /* renamed from: o.v.a.b$a */
    /* compiled from: CallEnqueueObservable */
    public static final class C9923a<T> implements C9207b, C9858d<T> {

        /* renamed from: e */
        public final C9855b<?> f19287e;

        /* renamed from: l */
        public final C9193j<? super C9909p<T>> f19288l;

        /* renamed from: m */
        public volatile boolean f19289m;

        /* renamed from: n */
        public boolean f19290n = false;

        public C9923a(C9855b<?> bVar, C9193j<? super C9909p<T>> jVar) {
            this.f19287e = bVar;
            this.f19288l = jVar;
        }

        /* renamed from: a */
        public boolean mo51360a() {
            return this.f19289m;
        }

        public void dispose() {
            this.f19289m = true;
            this.f19287e.cancel();
        }

        public void onFailure(C9855b<T> bVar, Throwable th) {
            if (!bVar.isCanceled()) {
                try {
                    this.f19288l.onError(th);
                } catch (Throwable th2) {
                    C9211a.m24971b(th2);
                    C9323a.m25169p(new CompositeException(th, th2));
                }
            }
        }

        public void onResponse(C9855b<T> bVar, C9909p<T> pVar) {
            if (!this.f19289m) {
                try {
                    this.f19288l.onNext(pVar);
                    if (!this.f19289m) {
                        this.f19290n = true;
                        this.f19288l.onComplete();
                    }
                } catch (Throwable th) {
                    C9211a.m24971b(th);
                    C9323a.m25169p(new CompositeException(th, th));
                }
            }
        }
    }

    public C9922b(C9855b<T> bVar) {
        this.f19286e = bVar;
    }

    /* renamed from: e */
    public void mo47006e(C9193j<? super C9909p<T>> jVar) {
        C9855b<T> clone = this.f19286e.clone();
        C9923a aVar = new C9923a(clone, jVar);
        jVar.onSubscribe(aVar);
        if (!aVar.mo51360a()) {
            clone.mo51255x(aVar);
        }
    }
}
