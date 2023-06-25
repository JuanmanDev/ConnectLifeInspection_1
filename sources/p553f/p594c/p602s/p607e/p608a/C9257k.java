package p553f.p594c.p602s.p607e.p608a;

import java.util.concurrent.atomic.AtomicLong;
import p553f.p594c.C9185c;
import p553f.p594c.C9186d;
import p553f.p594c.C9194k;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p602s.p605c.C9228a;
import p553f.p594c.p602s.p605c.C9231d;
import p553f.p594c.p602s.p605c.C9234g;
import p553f.p594c.p602s.p614i.C9314b;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.MissingBackpressureException;
import p630io.reactivex.internal.queue.SpscArrayQueue;
import p630io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: f.c.s.e.a.k */
/* compiled from: FlowableObserveOn */
public final class C9257k<T> extends C9236a<T, T> {

    /* renamed from: m */
    public final C9194k f18090m;

    /* renamed from: n */
    public final boolean f18091n;

    /* renamed from: o */
    public final int f18092o;

    /* renamed from: f.c.s.e.a.k$a */
    /* compiled from: FlowableObserveOn */
    public static abstract class C9258a<T> extends BasicIntQueueSubscription<T> implements C9186d<T>, Runnable {
        public static final long serialVersionUID = -8241002408341274697L;

        /* renamed from: e */
        public final C9194k.C9196b f18093e;

        /* renamed from: l */
        public final boolean f18094l;

        /* renamed from: m */
        public final int f18095m;

        /* renamed from: n */
        public final int f18096n;

        /* renamed from: o */
        public final AtomicLong f18097o = new AtomicLong();

        /* renamed from: p */
        public C9803c f18098p;

        /* renamed from: q */
        public C9234g<T> f18099q;

        /* renamed from: r */
        public volatile boolean f18100r;

        /* renamed from: s */
        public volatile boolean f18101s;

        /* renamed from: t */
        public Throwable f18102t;

        /* renamed from: u */
        public int f18103u;

        /* renamed from: v */
        public long f18104v;

        /* renamed from: w */
        public boolean f18105w;

        public C9258a(C9194k.C9196b bVar, boolean z, int i) {
            this.f18093e = bVar;
            this.f18094l = z;
            this.f18095m = i;
            this.f18096n = i - (i >> 2);
        }

        /* renamed from: b */
        public final boolean mo47086b(boolean z, boolean z2, C9802b<?> bVar) {
            if (this.f18100r) {
                clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.f18094l) {
                    Throwable th = this.f18102t;
                    if (th != null) {
                        this.f18100r = true;
                        clear();
                        bVar.onError(th);
                        this.f18093e.dispose();
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.f18100r = true;
                        bVar.onComplete();
                        this.f18093e.dispose();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    this.f18100r = true;
                    Throwable th2 = this.f18102t;
                    if (th2 != null) {
                        bVar.onError(th2);
                    } else {
                        bVar.onComplete();
                    }
                    this.f18093e.dispose();
                    return true;
                }
            }
        }

        public final void cancel() {
            if (!this.f18100r) {
                this.f18100r = true;
                this.f18098p.cancel();
                this.f18093e.dispose();
                if (getAndIncrement() == 0) {
                    this.f18099q.clear();
                }
            }
        }

        public final void clear() {
            this.f18099q.clear();
        }

        /* renamed from: d */
        public abstract void mo47087d();

        /* renamed from: e */
        public abstract void mo47088e();

        /* renamed from: f */
        public abstract void mo47089f();

        /* renamed from: g */
        public final void mo47090g() {
            if (getAndIncrement() == 0) {
                this.f18093e.mo47019b(this);
            }
        }

        public final boolean isEmpty() {
            return this.f18099q.isEmpty();
        }

        public final void onComplete() {
            if (!this.f18101s) {
                this.f18101s = true;
                mo47090g();
            }
        }

        public final void onError(Throwable th) {
            if (this.f18101s) {
                C9323a.m25169p(th);
                return;
            }
            this.f18102t = th;
            this.f18101s = true;
            mo47090g();
        }

        public final void onNext(T t) {
            if (!this.f18101s) {
                if (this.f18103u == 2) {
                    mo47090g();
                    return;
                }
                if (!this.f18099q.offer(t)) {
                    this.f18098p.cancel();
                    this.f18102t = new MissingBackpressureException("Queue is full?!");
                    this.f18101s = true;
                }
                mo47090g();
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C9314b.m25135a(this.f18097o, j);
                mo47090g();
            }
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f18105w = true;
            return 2;
        }

        public final void run() {
            if (this.f18105w) {
                mo47088e();
            } else if (this.f18103u == 1) {
                mo47089f();
            } else {
                mo47087d();
            }
        }
    }

    /* renamed from: f.c.s.e.a.k$b */
    /* compiled from: FlowableObserveOn */
    public static final class C9259b<T> extends C9258a<T> {
        public static final long serialVersionUID = 644624475404284533L;

        /* renamed from: x */
        public final C9228a<? super T> f18106x;

        /* renamed from: y */
        public long f18107y;

        public C9259b(C9228a<? super T> aVar, C9194k.C9196b bVar, boolean z, int i) {
            super(bVar, z, i);
            this.f18106x = aVar;
        }

        /* renamed from: d */
        public void mo47087d() {
            int i;
            C9228a<? super T> aVar = this.f18106x;
            C9234g<T> gVar = this.f18099q;
            long j = this.f18104v;
            long j2 = this.f18107y;
            int i2 = 1;
            while (true) {
                long j3 = this.f18097o.get();
                while (true) {
                    i = (j > j3 ? 1 : (j == j3 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.f18101s;
                    try {
                        T poll = gVar.poll();
                        boolean z2 = poll == null;
                        if (!mo47086b(z, z2, aVar)) {
                            if (z2) {
                                break;
                            }
                            if (aVar.mo47047c(poll)) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.f18096n)) {
                                this.f18098p.request(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C9211a.m24971b(th);
                        this.f18100r = true;
                        this.f18098p.cancel();
                        gVar.clear();
                        aVar.onError(th);
                        this.f18093e.dispose();
                        return;
                    }
                }
                if (i != 0 || !mo47086b(this.f18101s, gVar.isEmpty(), aVar)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.f18104v = j;
                        this.f18107y = j2;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: e */
        public void mo47088e() {
            int i = 1;
            while (!this.f18100r) {
                boolean z = this.f18101s;
                this.f18106x.onNext(null);
                if (z) {
                    this.f18100r = true;
                    Throwable th = this.f18102t;
                    if (th != null) {
                        this.f18106x.onError(th);
                    } else {
                        this.f18106x.onComplete();
                    }
                    this.f18093e.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* renamed from: f */
        public void mo47089f() {
            C9228a<? super T> aVar = this.f18106x;
            C9234g<T> gVar = this.f18099q;
            long j = this.f18104v;
            int i = 1;
            while (true) {
                long j2 = this.f18097o.get();
                while (j != j2) {
                    try {
                        T poll = gVar.poll();
                        if (!this.f18100r) {
                            if (poll == null) {
                                this.f18100r = true;
                                aVar.onComplete();
                                this.f18093e.dispose();
                                return;
                            } else if (aVar.mo47047c(poll)) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C9211a.m24971b(th);
                        this.f18100r = true;
                        this.f18098p.cancel();
                        aVar.onError(th);
                        this.f18093e.dispose();
                        return;
                    }
                }
                if (!this.f18100r) {
                    if (gVar.isEmpty()) {
                        this.f18100r = true;
                        aVar.onComplete();
                        this.f18093e.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.f18104v = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        public void onSubscribe(C9803c cVar) {
            if (SubscriptionHelper.validate(this.f18098p, cVar)) {
                this.f18098p = cVar;
                if (cVar instanceof C9231d) {
                    C9231d dVar = (C9231d) cVar;
                    int requestFusion = dVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f18103u = 1;
                        this.f18099q = dVar;
                        this.f18101s = true;
                        this.f18106x.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.f18103u = 2;
                        this.f18099q = dVar;
                        this.f18106x.onSubscribe(this);
                        cVar.request((long) this.f18095m);
                        return;
                    }
                }
                this.f18099q = new SpscArrayQueue(this.f18095m);
                this.f18106x.onSubscribe(this);
                cVar.request((long) this.f18095m);
            }
        }

        public T poll() {
            T poll = this.f18099q.poll();
            if (!(poll == null || this.f18103u == 1)) {
                long j = this.f18107y + 1;
                if (j == ((long) this.f18096n)) {
                    this.f18107y = 0;
                    this.f18098p.request(j);
                } else {
                    this.f18107y = j;
                }
            }
            return poll;
        }
    }

    /* renamed from: f.c.s.e.a.k$c */
    /* compiled from: FlowableObserveOn */
    public static final class C9260c<T> extends C9258a<T> implements C9186d<T> {
        public static final long serialVersionUID = -4547113800637756442L;

        /* renamed from: x */
        public final C9802b<? super T> f18108x;

        public C9260c(C9802b<? super T> bVar, C9194k.C9196b bVar2, boolean z, int i) {
            super(bVar2, z, i);
            this.f18108x = bVar;
        }

        /* renamed from: d */
        public void mo47087d() {
            int i;
            C9802b<? super T> bVar = this.f18108x;
            C9234g<T> gVar = this.f18099q;
            long j = this.f18104v;
            int i2 = 1;
            while (true) {
                long j2 = this.f18097o.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.f18101s;
                    try {
                        T poll = gVar.poll();
                        boolean z2 = poll == null;
                        if (!mo47086b(z, z2, bVar)) {
                            if (z2) {
                                break;
                            }
                            bVar.onNext(poll);
                            j++;
                            if (j == ((long) this.f18096n)) {
                                if (j2 != Long.MAX_VALUE) {
                                    j2 = this.f18097o.addAndGet(-j);
                                }
                                this.f18098p.request(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C9211a.m24971b(th);
                        this.f18100r = true;
                        this.f18098p.cancel();
                        gVar.clear();
                        bVar.onError(th);
                        this.f18093e.dispose();
                        return;
                    }
                }
                if (i != 0 || !mo47086b(this.f18101s, gVar.isEmpty(), bVar)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.f18104v = j;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: e */
        public void mo47088e() {
            int i = 1;
            while (!this.f18100r) {
                boolean z = this.f18101s;
                this.f18108x.onNext(null);
                if (z) {
                    this.f18100r = true;
                    Throwable th = this.f18102t;
                    if (th != null) {
                        this.f18108x.onError(th);
                    } else {
                        this.f18108x.onComplete();
                    }
                    this.f18093e.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* renamed from: f */
        public void mo47089f() {
            C9802b<? super T> bVar = this.f18108x;
            C9234g<T> gVar = this.f18099q;
            long j = this.f18104v;
            int i = 1;
            while (true) {
                long j2 = this.f18097o.get();
                while (j != j2) {
                    try {
                        T poll = gVar.poll();
                        if (!this.f18100r) {
                            if (poll == null) {
                                this.f18100r = true;
                                bVar.onComplete();
                                this.f18093e.dispose();
                                return;
                            }
                            bVar.onNext(poll);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C9211a.m24971b(th);
                        this.f18100r = true;
                        this.f18098p.cancel();
                        bVar.onError(th);
                        this.f18093e.dispose();
                        return;
                    }
                }
                if (!this.f18100r) {
                    if (gVar.isEmpty()) {
                        this.f18100r = true;
                        bVar.onComplete();
                        this.f18093e.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.f18104v = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        public void onSubscribe(C9803c cVar) {
            if (SubscriptionHelper.validate(this.f18098p, cVar)) {
                this.f18098p = cVar;
                if (cVar instanceof C9231d) {
                    C9231d dVar = (C9231d) cVar;
                    int requestFusion = dVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f18103u = 1;
                        this.f18099q = dVar;
                        this.f18101s = true;
                        this.f18108x.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.f18103u = 2;
                        this.f18099q = dVar;
                        this.f18108x.onSubscribe(this);
                        cVar.request((long) this.f18095m);
                        return;
                    }
                }
                this.f18099q = new SpscArrayQueue(this.f18095m);
                this.f18108x.onSubscribe(this);
                cVar.request((long) this.f18095m);
            }
        }

        public T poll() {
            T poll = this.f18099q.poll();
            if (!(poll == null || this.f18103u == 1)) {
                long j = this.f18104v + 1;
                if (j == ((long) this.f18096n)) {
                    this.f18104v = 0;
                    this.f18098p.request(j);
                } else {
                    this.f18104v = j;
                }
            }
            return poll;
        }
    }

    public C9257k(C9185c<T> cVar, C9194k kVar, boolean z, int i) {
        super(cVar);
        this.f18090m = kVar;
        this.f18091n = z;
        this.f18092o = i;
    }

    /* renamed from: v */
    public void mo46993v(C9802b<? super T> bVar) {
        C9194k.C9196b a = this.f18090m.mo47013a();
        if (bVar instanceof C9228a) {
            this.f18010l.mo46992u(new C9259b((C9228a) bVar, a, this.f18091n, this.f18092o));
        } else {
            this.f18010l.mo46992u(new C9260c(bVar, a, this.f18091n, this.f18092o));
        }
    }
}
