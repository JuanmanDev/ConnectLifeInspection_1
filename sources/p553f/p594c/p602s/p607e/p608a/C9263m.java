package p553f.p594c.p602s.p607e.p608a;

import java.util.concurrent.atomic.AtomicLong;
import p553f.p594c.C9185c;
import p553f.p594c.C9186d;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p601r.C9217e;
import p553f.p594c.p602s.p614i.C9314b;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: f.c.s.e.a.m */
/* compiled from: FlowableOnBackpressureDrop */
public final class C9263m<T> extends C9236a<T, T> implements C9217e<T> {

    /* renamed from: m */
    public final C9217e<? super T> f18123m = this;

    /* renamed from: f.c.s.e.a.m$a */
    /* compiled from: FlowableOnBackpressureDrop */
    public static final class C9264a<T> extends AtomicLong implements C9186d<T>, C9803c {
        public static final long serialVersionUID = -6246093802440953054L;

        /* renamed from: e */
        public final C9802b<? super T> f18124e;

        /* renamed from: l */
        public final C9217e<? super T> f18125l;

        /* renamed from: m */
        public C9803c f18126m;

        /* renamed from: n */
        public boolean f18127n;

        public C9264a(C9802b<? super T> bVar, C9217e<? super T> eVar) {
            this.f18124e = bVar;
            this.f18125l = eVar;
        }

        public void cancel() {
            this.f18126m.cancel();
        }

        public void onComplete() {
            if (!this.f18127n) {
                this.f18127n = true;
                this.f18124e.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f18127n) {
                C9323a.m25169p(th);
                return;
            }
            this.f18127n = true;
            this.f18124e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f18127n) {
                if (get() != 0) {
                    this.f18124e.onNext(t);
                    C9314b.m25137c(this, 1);
                    return;
                }
                try {
                    this.f18125l.accept(t);
                } catch (Throwable th) {
                    C9211a.m24971b(th);
                    cancel();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C9803c cVar) {
            if (SubscriptionHelper.validate(this.f18126m, cVar)) {
                this.f18126m = cVar;
                this.f18124e.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C9314b.m25135a(this, j);
            }
        }
    }

    public C9263m(C9185c<T> cVar) {
        super(cVar);
    }

    public void accept(T t) {
    }

    /* renamed from: v */
    public void mo46993v(C9802b<? super T> bVar) {
        this.f18010l.mo46992u(new C9264a(bVar, this.f18123m));
    }
}
