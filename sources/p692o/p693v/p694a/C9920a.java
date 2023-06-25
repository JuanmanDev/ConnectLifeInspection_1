package p692o.p693v.p694a;

import p553f.p594c.C9190h;
import p553f.p594c.C9193j;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.CompositeException;
import p692o.C9909p;
import retrofit2.adapter.rxjava2.HttpException;

/* renamed from: o.v.a.a */
/* compiled from: BodyObservable */
public final class C9920a<T> extends C9190h<T> {

    /* renamed from: e */
    public final C9190h<C9909p<T>> f19283e;

    /* renamed from: o.v.a.a$a */
    /* compiled from: BodyObservable */
    public static class C9921a<R> implements C9193j<C9909p<R>> {

        /* renamed from: e */
        public final C9193j<? super R> f19284e;

        /* renamed from: l */
        public boolean f19285l;

        public C9921a(C9193j<? super R> jVar) {
            this.f19284e = jVar;
        }

        /* renamed from: a */
        public void onNext(C9909p<R> pVar) {
            if (pVar.mo51319d()) {
                this.f19284e.onNext(pVar.mo51317a());
                return;
            }
            this.f19285l = true;
            HttpException httpException = new HttpException(pVar);
            try {
                this.f19284e.onError(httpException);
            } catch (Throwable th) {
                C9211a.m24971b(th);
                C9323a.m25169p(new CompositeException(httpException, th));
            }
        }

        public void onComplete() {
            if (!this.f19285l) {
                this.f19284e.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f19285l) {
                this.f19284e.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            C9323a.m25169p(assertionError);
        }

        public void onSubscribe(C9207b bVar) {
            this.f19284e.onSubscribe(bVar);
        }
    }

    public C9920a(C9190h<C9909p<T>> hVar) {
        this.f19283e = hVar;
    }

    /* renamed from: e */
    public void mo47006e(C9193j<? super T> jVar) {
        this.f19283e.mo47002a(new C9921a(jVar));
    }
}
