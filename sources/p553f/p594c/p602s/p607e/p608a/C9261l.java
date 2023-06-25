package p553f.p594c.p602s.p607e.p608a;

import java.util.concurrent.atomic.AtomicLong;
import p553f.p594c.C9185c;
import p553f.p594c.C9186d;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p601r.C9213a;
import p553f.p594c.p602s.p605c.C9233f;
import p553f.p594c.p602s.p611f.C9288a;
import p553f.p594c.p602s.p614i.C9314b;
import p630io.reactivex.exceptions.MissingBackpressureException;
import p630io.reactivex.internal.queue.SpscArrayQueue;
import p630io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: f.c.s.e.a.l */
/* compiled from: FlowableOnBackpressureBuffer */
public final class C9261l<T> extends C9236a<T, T> {

    /* renamed from: m */
    public final int f18109m;

    /* renamed from: n */
    public final boolean f18110n;

    /* renamed from: o */
    public final boolean f18111o;

    /* renamed from: p */
    public final C9213a f18112p;

    /* renamed from: f.c.s.e.a.l$a */
    /* compiled from: FlowableOnBackpressureBuffer */
    public static final class C9262a<T> extends BasicIntQueueSubscription<T> implements C9186d<T> {
        public static final long serialVersionUID = -2514538129242366402L;

        /* renamed from: e */
        public final C9802b<? super T> f18113e;

        /* renamed from: l */
        public final C9233f<T> f18114l;

        /* renamed from: m */
        public final boolean f18115m;

        /* renamed from: n */
        public final C9213a f18116n;

        /* renamed from: o */
        public C9803c f18117o;

        /* renamed from: p */
        public volatile boolean f18118p;

        /* renamed from: q */
        public volatile boolean f18119q;

        /* renamed from: r */
        public Throwable f18120r;

        /* renamed from: s */
        public final AtomicLong f18121s = new AtomicLong();

        /* renamed from: t */
        public boolean f18122t;

        public C9262a(C9802b<? super T> bVar, int i, boolean z, boolean z2, C9213a aVar) {
            C9233f<T> fVar;
            this.f18113e = bVar;
            this.f18116n = aVar;
            this.f18115m = z2;
            if (z) {
                fVar = new C9288a<>(i);
            } else {
                fVar = new SpscArrayQueue<>(i);
            }
            this.f18114l = fVar;
        }

        /* renamed from: b */
        public boolean mo47092b(boolean z, boolean z2, C9802b<? super T> bVar) {
            if (this.f18118p) {
                this.f18114l.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.f18115m) {
                    Throwable th = this.f18120r;
                    if (th != null) {
                        this.f18114l.clear();
                        bVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        bVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.f18120r;
                    if (th2 != null) {
                        bVar.onError(th2);
                    } else {
                        bVar.onComplete();
                    }
                    return true;
                }
            }
        }

        public void cancel() {
            if (!this.f18118p) {
                this.f18118p = true;
                this.f18117o.cancel();
                if (getAndIncrement() == 0) {
                    this.f18114l.clear();
                }
            }
        }

        public void clear() {
            this.f18114l.clear();
        }

        public void drain() {
            int i;
            if (getAndIncrement() == 0) {
                C9233f<T> fVar = this.f18114l;
                C9802b<? super T> bVar = this.f18113e;
                int i2 = 1;
                while (!mo47092b(this.f18119q, fVar.isEmpty(), bVar)) {
                    long j = this.f18121s.get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        }
                        boolean z = this.f18119q;
                        T poll = fVar.poll();
                        boolean z2 = poll == null;
                        if (!mo47092b(z, z2, bVar)) {
                            if (z2) {
                                break;
                            }
                            bVar.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (i != 0 || !mo47092b(this.f18119q, fVar.isEmpty(), bVar)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.f18121s.addAndGet(-j2);
                        }
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public boolean isEmpty() {
            return this.f18114l.isEmpty();
        }

        public void onComplete() {
            this.f18119q = true;
            if (this.f18122t) {
                this.f18113e.onComplete();
            } else {
                drain();
            }
        }

        public void onError(Throwable th) {
            this.f18120r = th;
            this.f18119q = true;
            if (this.f18122t) {
                this.f18113e.onError(th);
            } else {
                drain();
            }
        }

        public void onNext(T t) {
            if (!this.f18114l.offer(t)) {
                this.f18117o.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.f18116n.run();
                } catch (Throwable th) {
                    C9211a.m24971b(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
            } else if (this.f18122t) {
                this.f18113e.onNext(null);
            } else {
                drain();
            }
        }

        public void onSubscribe(C9803c cVar) {
            if (SubscriptionHelper.validate(this.f18117o, cVar)) {
                this.f18117o = cVar;
                this.f18113e.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public T poll() {
            return this.f18114l.poll();
        }

        public void request(long j) {
            if (!this.f18122t && SubscriptionHelper.validate(j)) {
                C9314b.m25135a(this.f18121s, j);
                drain();
            }
        }

        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f18122t = true;
            return 2;
        }
    }

    public C9261l(C9185c<T> cVar, int i, boolean z, boolean z2, C9213a aVar) {
        super(cVar);
        this.f18109m = i;
        this.f18110n = z;
        this.f18111o = z2;
        this.f18112p = aVar;
    }

    /* renamed from: v */
    public void mo46993v(C9802b<? super T> bVar) {
        this.f18010l.mo46992u(new C9262a(bVar, this.f18109m, this.f18110n, this.f18111o, this.f18112p));
    }
}
