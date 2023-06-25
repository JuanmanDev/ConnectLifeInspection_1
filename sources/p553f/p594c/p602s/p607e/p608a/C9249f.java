package p553f.p594c.p602s.p607e.p608a;

import p553f.p594c.C9185c;
import p553f.p594c.C9190h;
import p553f.p594c.C9193j;
import p553f.p594c.p598o.C9207b;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: f.c.s.e.a.f */
/* compiled from: FlowableFromObservable */
public final class C9249f<T> extends C9185c<T> {

    /* renamed from: l */
    public final C9190h<T> f18070l;

    /* renamed from: f.c.s.e.a.f$a */
    /* compiled from: FlowableFromObservable */
    public static final class C9250a<T> implements C9193j<T>, C9803c {

        /* renamed from: e */
        public final C9802b<? super T> f18071e;

        /* renamed from: l */
        public C9207b f18072l;

        public C9250a(C9802b<? super T> bVar) {
            this.f18071e = bVar;
        }

        public void cancel() {
            this.f18072l.dispose();
        }

        public void onComplete() {
            this.f18071e.onComplete();
        }

        public void onError(Throwable th) {
            this.f18071e.onError(th);
        }

        public void onNext(T t) {
            this.f18071e.onNext(t);
        }

        public void onSubscribe(C9207b bVar) {
            this.f18072l = bVar;
            this.f18071e.onSubscribe(this);
        }

        public void request(long j) {
        }
    }

    public C9249f(C9190h<T> hVar) {
        this.f18070l = hVar;
    }

    /* renamed from: v */
    public void mo46993v(C9802b<? super T> bVar) {
        this.f18070l.mo47002a(new C9250a(bVar));
    }
}
