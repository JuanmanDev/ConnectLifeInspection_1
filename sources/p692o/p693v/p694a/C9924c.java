package p692o.p693v.p694a;

import p553f.p594c.C9190h;
import p553f.p594c.C9193j;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.CompositeException;
import p692o.C9855b;
import p692o.C9909p;

/* renamed from: o.v.a.c */
/* compiled from: CallExecuteObservable */
public final class C9924c<T> extends C9190h<C9909p<T>> {

    /* renamed from: e */
    public final C9855b<T> f19291e;

    /* renamed from: o.v.a.c$a */
    /* compiled from: CallExecuteObservable */
    public static final class C9925a implements C9207b {

        /* renamed from: e */
        public final C9855b<?> f19292e;

        /* renamed from: l */
        public volatile boolean f19293l;

        public C9925a(C9855b<?> bVar) {
            this.f19292e = bVar;
        }

        /* renamed from: a */
        public boolean mo51361a() {
            return this.f19293l;
        }

        public void dispose() {
            this.f19293l = true;
            this.f19292e.cancel();
        }
    }

    public C9924c(C9855b<T> bVar) {
        this.f19291e = bVar;
    }

    /* renamed from: e */
    public void mo47006e(C9193j<? super C9909p<T>> jVar) {
        boolean z;
        C9855b<T> clone = this.f19291e.clone();
        C9925a aVar = new C9925a(clone);
        jVar.onSubscribe(aVar);
        if (!aVar.mo51361a()) {
            try {
                C9909p<T> execute = clone.execute();
                if (!aVar.mo51361a()) {
                    jVar.onNext(execute);
                }
                if (!aVar.mo51361a()) {
                    try {
                        jVar.onComplete();
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
                C9211a.m24971b(th);
                if (z) {
                    C9323a.m25169p(th);
                } else if (!aVar.mo51361a()) {
                    try {
                        jVar.onError(th);
                    } catch (Throwable th3) {
                        C9211a.m24971b(th3);
                        C9323a.m25169p(new CompositeException(th, th3));
                    }
                }
            }
        }
    }
}
