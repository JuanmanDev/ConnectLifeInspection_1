package p553f.p594c.p602s.p607e.p608a;

import java.util.concurrent.atomic.AtomicLong;
import p553f.p594c.C9185c;
import p553f.p594c.C9186d;
import p553f.p594c.p602s.p614i.C9314b;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.MissingBackpressureException;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: f.c.s.e.a.n */
/* compiled from: FlowableOnBackpressureError */
public final class C9265n<T> extends C9236a<T, T> {

    /* renamed from: f.c.s.e.a.n$a */
    /* compiled from: FlowableOnBackpressureError */
    public static final class C9266a<T> extends AtomicLong implements C9186d<T>, C9803c {
        public static final long serialVersionUID = -3176480756392482682L;

        /* renamed from: e */
        public final C9802b<? super T> f18128e;

        /* renamed from: l */
        public C9803c f18129l;

        /* renamed from: m */
        public boolean f18130m;

        public C9266a(C9802b<? super T> bVar) {
            this.f18128e = bVar;
        }

        public void cancel() {
            this.f18129l.cancel();
        }

        public void onComplete() {
            if (!this.f18130m) {
                this.f18130m = true;
                this.f18128e.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f18130m) {
                C9323a.m25169p(th);
                return;
            }
            this.f18130m = true;
            this.f18128e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f18130m) {
                if (get() != 0) {
                    this.f18128e.onNext(t);
                    C9314b.m25137c(this, 1);
                    return;
                }
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        public void onSubscribe(C9803c cVar) {
            if (SubscriptionHelper.validate(this.f18129l, cVar)) {
                this.f18129l = cVar;
                this.f18128e.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C9314b.m25135a(this, j);
            }
        }
    }

    public C9265n(C9185c<T> cVar) {
        super(cVar);
    }

    /* renamed from: v */
    public void mo46993v(C9802b<? super T> bVar) {
        this.f18010l.mo46992u(new C9266a(bVar));
    }
}
