package p553f.p594c.p602s.p607e.p608a;

import java.util.concurrent.TimeUnit;
import p553f.p594c.C9185c;
import p553f.p594c.C9186d;
import p553f.p594c.C9194k;
import p553f.p594c.p619x.C9333a;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: f.c.s.e.a.b */
/* compiled from: FlowableDelay */
public final class C9237b<T> extends C9236a<T, T> {

    /* renamed from: m */
    public final long f18011m;

    /* renamed from: n */
    public final TimeUnit f18012n;

    /* renamed from: o */
    public final C9194k f18013o;

    /* renamed from: p */
    public final boolean f18014p;

    /* renamed from: f.c.s.e.a.b$a */
    /* compiled from: FlowableDelay */
    public static final class C9238a<T> implements C9186d<T>, C9803c {

        /* renamed from: e */
        public final C9802b<? super T> f18015e;

        /* renamed from: l */
        public final long f18016l;

        /* renamed from: m */
        public final TimeUnit f18017m;

        /* renamed from: n */
        public final C9194k.C9196b f18018n;

        /* renamed from: o */
        public final boolean f18019o;

        /* renamed from: p */
        public C9803c f18020p;

        /* renamed from: f.c.s.e.a.b$a$a */
        /* compiled from: FlowableDelay */
        public final class C9239a implements Runnable {
            public C9239a() {
            }

            public void run() {
                try {
                    C9238a.this.f18015e.onComplete();
                } finally {
                    C9238a.this.f18018n.dispose();
                }
            }
        }

        /* renamed from: f.c.s.e.a.b$a$b */
        /* compiled from: FlowableDelay */
        public final class C9240b implements Runnable {

            /* renamed from: e */
            public final Throwable f18022e;

            public C9240b(Throwable th) {
                this.f18022e = th;
            }

            public void run() {
                try {
                    C9238a.this.f18015e.onError(this.f18022e);
                } finally {
                    C9238a.this.f18018n.dispose();
                }
            }
        }

        /* renamed from: f.c.s.e.a.b$a$c */
        /* compiled from: FlowableDelay */
        public final class C9241c implements Runnable {

            /* renamed from: e */
            public final T f18024e;

            public C9241c(T t) {
                this.f18024e = t;
            }

            public void run() {
                C9238a.this.f18015e.onNext(this.f18024e);
            }
        }

        public C9238a(C9802b<? super T> bVar, long j, TimeUnit timeUnit, C9194k.C9196b bVar2, boolean z) {
            this.f18015e = bVar;
            this.f18016l = j;
            this.f18017m = timeUnit;
            this.f18018n = bVar2;
            this.f18019o = z;
        }

        public void cancel() {
            this.f18020p.cancel();
            this.f18018n.dispose();
        }

        public void onComplete() {
            this.f18018n.mo47020c(new C9239a(), this.f18016l, this.f18017m);
        }

        public void onError(Throwable th) {
            this.f18018n.mo47020c(new C9240b(th), this.f18019o ? this.f18016l : 0, this.f18017m);
        }

        public void onNext(T t) {
            this.f18018n.mo47020c(new C9241c(t), this.f18016l, this.f18017m);
        }

        public void onSubscribe(C9803c cVar) {
            if (SubscriptionHelper.validate(this.f18020p, cVar)) {
                this.f18020p = cVar;
                this.f18015e.onSubscribe(this);
            }
        }

        public void request(long j) {
            this.f18020p.request(j);
        }
    }

    public C9237b(C9185c<T> cVar, long j, TimeUnit timeUnit, C9194k kVar, boolean z) {
        super(cVar);
        this.f18011m = j;
        this.f18012n = timeUnit;
        this.f18013o = kVar;
        this.f18014p = z;
    }

    /* renamed from: v */
    public void mo46993v(C9802b<? super T> bVar) {
        C9333a aVar;
        if (this.f18014p) {
            aVar = bVar;
        } else {
            aVar = new C9333a(bVar);
        }
        this.f18010l.mo46992u(new C9238a(aVar, this.f18011m, this.f18012n, this.f18013o.mo47013a(), this.f18014p));
    }
}
