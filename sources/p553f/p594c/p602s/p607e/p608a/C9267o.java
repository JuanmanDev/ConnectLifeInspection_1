package p553f.p594c.p602s.p607e.p608a;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9185c;
import p553f.p594c.C9186d;
import p553f.p594c.p602s.p614i.C9314b;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: f.c.s.e.a.o */
/* compiled from: FlowableOnBackpressureLatest */
public final class C9267o<T> extends C9236a<T, T> {

    /* renamed from: f.c.s.e.a.o$a */
    /* compiled from: FlowableOnBackpressureLatest */
    public static final class C9268a<T> extends AtomicInteger implements C9186d<T>, C9803c {
        public static final long serialVersionUID = 163080509307634843L;

        /* renamed from: e */
        public final C9802b<? super T> f18131e;

        /* renamed from: l */
        public C9803c f18132l;

        /* renamed from: m */
        public volatile boolean f18133m;

        /* renamed from: n */
        public Throwable f18134n;

        /* renamed from: o */
        public volatile boolean f18135o;

        /* renamed from: p */
        public final AtomicLong f18136p = new AtomicLong();

        /* renamed from: q */
        public final AtomicReference<T> f18137q = new AtomicReference<>();

        public C9268a(C9802b<? super T> bVar) {
            this.f18131e = bVar;
        }

        /* renamed from: a */
        public boolean mo47094a(boolean z, boolean z2, C9802b<?> bVar, AtomicReference<T> atomicReference) {
            if (this.f18135o) {
                atomicReference.lazySet((Object) null);
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.f18134n;
                if (th != null) {
                    atomicReference.lazySet((Object) null);
                    bVar.onError(th);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    bVar.onComplete();
                    return true;
                }
            }
        }

        /* renamed from: b */
        public void mo47095b() {
            boolean z;
            if (getAndIncrement() == 0) {
                C9802b<? super T> bVar = this.f18131e;
                AtomicLong atomicLong = this.f18136p;
                AtomicReference<T> atomicReference = this.f18137q;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z2 = this.f18133m;
                        T andSet = atomicReference.getAndSet((Object) null);
                        boolean z3 = andSet == null;
                        if (!mo47094a(z2, z3, bVar, atomicReference)) {
                            if (z3) {
                                break;
                            }
                            bVar.onNext(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.f18133m;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (mo47094a(z4, z, bVar, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        C9314b.m25137c(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        public void cancel() {
            if (!this.f18135o) {
                this.f18135o = true;
                this.f18132l.cancel();
                if (getAndIncrement() == 0) {
                    this.f18137q.lazySet((Object) null);
                }
            }
        }

        public void onComplete() {
            this.f18133m = true;
            mo47095b();
        }

        public void onError(Throwable th) {
            this.f18134n = th;
            this.f18133m = true;
            mo47095b();
        }

        public void onNext(T t) {
            this.f18137q.lazySet(t);
            mo47095b();
        }

        public void onSubscribe(C9803c cVar) {
            if (SubscriptionHelper.validate(this.f18132l, cVar)) {
                this.f18132l = cVar;
                this.f18131e.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C9314b.m25135a(this.f18136p, j);
                mo47095b();
            }
        }
    }

    public C9267o(C9185c<T> cVar) {
        super(cVar);
    }

    /* renamed from: v */
    public void mo46993v(C9802b<? super T> bVar) {
        this.f18010l.mo46992u(new C9268a(bVar));
    }
}
