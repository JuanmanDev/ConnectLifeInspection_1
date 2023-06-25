package p553f.p594c.p602s.p607e.p608a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9185c;
import p553f.p594c.C9194k;
import p553f.p594c.p598o.C9207b;
import p630io.reactivex.exceptions.MissingBackpressureException;
import p630io.reactivex.internal.disposables.DisposableHelper;
import p630io.reactivex.internal.disposables.EmptyDisposable;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: f.c.s.e.a.r */
/* compiled from: FlowableTimer */
public final class C9274r extends C9185c<Long> {

    /* renamed from: l */
    public final C9194k f18150l;

    /* renamed from: m */
    public final long f18151m;

    /* renamed from: n */
    public final TimeUnit f18152n;

    /* renamed from: f.c.s.e.a.r$a */
    /* compiled from: FlowableTimer */
    public static final class C9275a extends AtomicReference<C9207b> implements C9803c, Runnable {
        public static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: e */
        public final C9802b<? super Long> f18153e;

        /* renamed from: l */
        public volatile boolean f18154l;

        public C9275a(C9802b<? super Long> bVar) {
            this.f18153e = bVar;
        }

        /* renamed from: a */
        public void mo47099a(C9207b bVar) {
            DisposableHelper.trySet(this, bVar);
        }

        public void cancel() {
            DisposableHelper.dispose(this);
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                this.f18154l = true;
            }
        }

        public void run() {
            if (get() == DisposableHelper.DISPOSED) {
                return;
            }
            if (this.f18154l) {
                this.f18153e.onNext(0L);
                lazySet(EmptyDisposable.INSTANCE);
                this.f18153e.onComplete();
                return;
            }
            lazySet(EmptyDisposable.INSTANCE);
            this.f18153e.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
        }
    }

    public C9274r(long j, TimeUnit timeUnit, C9194k kVar) {
        this.f18151m = j;
        this.f18152n = timeUnit;
        this.f18150l = kVar;
    }

    /* renamed from: v */
    public void mo46993v(C9802b<? super Long> bVar) {
        C9275a aVar = new C9275a(bVar);
        bVar.onSubscribe(aVar);
        aVar.mo47099a(this.f18150l.mo47015c(aVar, this.f18151m, this.f18152n));
    }
}
