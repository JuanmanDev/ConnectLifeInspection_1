package p553f.p594c.p602s.p607e.p608a;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9185c;
import p553f.p594c.C9186d;
import p553f.p594c.C9194k;
import p553f.p594c.p602s.p614i.C9314b;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p648m.p683f.C9801a;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: f.c.s.e.a.q */
/* compiled from: FlowableSubscribeOn */
public final class C9271q<T> extends C9236a<T, T> {

    /* renamed from: m */
    public final C9194k f18140m;

    /* renamed from: n */
    public final boolean f18141n;

    /* renamed from: f.c.s.e.a.q$a */
    /* compiled from: FlowableSubscribeOn */
    public static final class C9272a<T> extends AtomicReference<Thread> implements C9186d<T>, C9803c, Runnable {
        public static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: e */
        public final C9802b<? super T> f18142e;

        /* renamed from: l */
        public final C9194k.C9196b f18143l;

        /* renamed from: m */
        public final AtomicReference<C9803c> f18144m = new AtomicReference<>();

        /* renamed from: n */
        public final AtomicLong f18145n = new AtomicLong();

        /* renamed from: o */
        public final boolean f18146o;

        /* renamed from: p */
        public C9801a<T> f18147p;

        /* renamed from: f.c.s.e.a.q$a$a */
        /* compiled from: FlowableSubscribeOn */
        public static final class C9273a implements Runnable {

            /* renamed from: e */
            public final C9803c f18148e;

            /* renamed from: l */
            public final long f18149l;

            public C9273a(C9803c cVar, long j) {
                this.f18148e = cVar;
                this.f18149l = j;
            }

            public void run() {
                this.f18148e.request(this.f18149l);
            }
        }

        public C9272a(C9802b<? super T> bVar, C9194k.C9196b bVar2, C9801a<T> aVar, boolean z) {
            this.f18142e = bVar;
            this.f18143l = bVar2;
            this.f18147p = aVar;
            this.f18146o = !z;
        }

        /* renamed from: a */
        public void mo47096a(long j, C9803c cVar) {
            if (this.f18146o || Thread.currentThread() == get()) {
                cVar.request(j);
            } else {
                this.f18143l.mo47019b(new C9273a(cVar, j));
            }
        }

        public void cancel() {
            SubscriptionHelper.cancel(this.f18144m);
            this.f18143l.dispose();
        }

        public void onComplete() {
            this.f18142e.onComplete();
            this.f18143l.dispose();
        }

        public void onError(Throwable th) {
            this.f18142e.onError(th);
            this.f18143l.dispose();
        }

        public void onNext(T t) {
            this.f18142e.onNext(t);
        }

        public void onSubscribe(C9803c cVar) {
            if (SubscriptionHelper.setOnce(this.f18144m, cVar)) {
                long andSet = this.f18145n.getAndSet(0);
                if (andSet != 0) {
                    mo47096a(andSet, cVar);
                }
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C9803c cVar = this.f18144m.get();
                if (cVar != null) {
                    mo47096a(j, cVar);
                    return;
                }
                C9314b.m25135a(this.f18145n, j);
                C9803c cVar2 = this.f18144m.get();
                if (cVar2 != null) {
                    long andSet = this.f18145n.getAndSet(0);
                    if (andSet != 0) {
                        mo47096a(andSet, cVar2);
                    }
                }
            }
        }

        public void run() {
            lazySet(Thread.currentThread());
            C9801a<T> aVar = this.f18147p;
            this.f18147p = null;
            aVar.mo46975a(this);
        }
    }

    public C9271q(C9185c<T> cVar, C9194k kVar, boolean z) {
        super(cVar);
        this.f18140m = kVar;
        this.f18141n = z;
    }

    /* renamed from: v */
    public void mo46993v(C9802b<? super T> bVar) {
        C9194k.C9196b a = this.f18140m.mo47013a();
        C9272a aVar = new C9272a(bVar, a, this.f18010l, this.f18141n);
        bVar.onSubscribe(aVar);
        a.mo47019b(aVar);
    }
}
