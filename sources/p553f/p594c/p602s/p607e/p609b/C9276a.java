package p553f.p594c.p602s.p607e.p609b;

import p553f.p594c.C9185c;
import p553f.p594c.C9188f;
import p553f.p594c.C9189g;
import p553f.p594c.p598o.C9207b;
import p630io.reactivex.internal.disposables.DisposableHelper;
import p630io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p648m.p683f.C9802b;

/* renamed from: f.c.s.e.b.a */
/* compiled from: MaybeToFlowable */
public final class C9276a<T> extends C9185c<T> {

    /* renamed from: l */
    public final C9189g<T> f18155l;

    /* renamed from: f.c.s.e.b.a$a */
    /* compiled from: MaybeToFlowable */
    public static final class C9277a<T> extends DeferredScalarSubscription<T> implements C9188f<T> {
        public static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: e */
        public C9207b f18156e;

        public C9277a(C9802b<? super T> bVar) {
            super(bVar);
        }

        public void cancel() {
            super.cancel();
            this.f18156e.dispose();
        }

        public void onComplete() {
            this.downstream.onComplete();
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onSubscribe(C9207b bVar) {
            if (DisposableHelper.validate(this.f18156e, bVar)) {
                this.f18156e = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            complete(t);
        }
    }

    public C9276a(C9189g<T> gVar) {
        this.f18155l = gVar;
    }

    /* renamed from: v */
    public void mo46993v(C9802b<? super T> bVar) {
        this.f18155l.mo46996a(new C9277a(bVar));
    }
}
