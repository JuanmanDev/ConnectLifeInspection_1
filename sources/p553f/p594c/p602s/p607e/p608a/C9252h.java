package p553f.p594c.p602s.p607e.p608a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.p602s.p611f.C9288a;
import p553f.p594c.p602s.p614i.C9314b;
import p630io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupBySubscriber;
import p630io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p630io.reactivex.internal.subscriptions.EmptySubscription;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p648m.p683f.C9801a;
import p648m.p683f.C9802b;

/* renamed from: f.c.s.e.a.h */
/* compiled from: FlowableGroupBy */
public final class C9252h<T, K> extends BasicIntQueueSubscription<T> implements C9801a<T> {
    public static final long serialVersionUID = -3852313036005250360L;

    /* renamed from: e */
    public final K f18074e;

    /* renamed from: l */
    public final C9288a<T> f18075l;

    /* renamed from: m */
    public final FlowableGroupBy$GroupBySubscriber<?, K, T> f18076m;

    /* renamed from: n */
    public final boolean f18077n;

    /* renamed from: o */
    public final AtomicLong f18078o = new AtomicLong();

    /* renamed from: p */
    public volatile boolean f18079p;

    /* renamed from: q */
    public Throwable f18080q;

    /* renamed from: r */
    public final AtomicBoolean f18081r = new AtomicBoolean();

    /* renamed from: s */
    public final AtomicReference<C9802b<? super T>> f18082s = new AtomicReference<>();

    /* renamed from: t */
    public final AtomicBoolean f18083t = new AtomicBoolean();

    /* renamed from: u */
    public boolean f18084u;

    /* renamed from: v */
    public int f18085v;

    public C9252h(int i, FlowableGroupBy$GroupBySubscriber<?, K, T> flowableGroupBy$GroupBySubscriber, K k, boolean z) {
        this.f18075l = new C9288a<>(i);
        this.f18076m = flowableGroupBy$GroupBySubscriber;
        this.f18074e = k;
        this.f18077n = z;
    }

    /* renamed from: a */
    public void mo46975a(C9802b<? super T> bVar) {
        if (this.f18083t.compareAndSet(false, true)) {
            bVar.onSubscribe(this);
            this.f18082s.lazySet(bVar);
            drain();
            return;
        }
        EmptySubscription.error(new IllegalStateException("Only one Subscriber allowed!"), bVar);
    }

    /* renamed from: b */
    public boolean mo47079b(boolean z, boolean z2, C9802b<? super T> bVar, boolean z3) {
        if (this.f18081r.get()) {
            this.f18075l.clear();
            return true;
        } else if (!z) {
            return false;
        } else {
            if (!z3) {
                Throwable th = this.f18080q;
                if (th != null) {
                    this.f18075l.clear();
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
                Throwable th2 = this.f18080q;
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
        if (this.f18081r.compareAndSet(false, true)) {
            this.f18076m.cancel(this.f18074e);
        }
    }

    public void clear() {
        this.f18075l.clear();
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            if (this.f18084u) {
                drainFused();
            } else {
                drainNormal();
            }
        }
    }

    public void drainFused() {
        Throwable th;
        C9288a<T> aVar = this.f18075l;
        C9802b bVar = this.f18082s.get();
        int i = 1;
        while (true) {
            if (bVar != null) {
                if (this.f18081r.get()) {
                    aVar.clear();
                    return;
                }
                boolean z = this.f18079p;
                if (!z || this.f18077n || (th = this.f18080q) == null) {
                    bVar.onNext(null);
                    if (z) {
                        Throwable th2 = this.f18080q;
                        if (th2 != null) {
                            bVar.onError(th2);
                            return;
                        } else {
                            bVar.onComplete();
                            return;
                        }
                    }
                } else {
                    aVar.clear();
                    bVar.onError(th);
                    return;
                }
            }
            i = addAndGet(-i);
            if (i != 0) {
                if (bVar == null) {
                    bVar = this.f18082s.get();
                }
            } else {
                return;
            }
        }
    }

    public void drainNormal() {
        int i;
        C9288a<T> aVar = this.f18075l;
        boolean z = this.f18077n;
        C9802b bVar = this.f18082s.get();
        int i2 = 1;
        while (true) {
            if (bVar != null) {
                long j = this.f18078o.get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.f18079p;
                    T poll = aVar.poll();
                    boolean z3 = poll == null;
                    if (!mo47079b(z2, z3, bVar, z)) {
                        if (z3) {
                            break;
                        }
                        bVar.onNext(poll);
                        j2++;
                    } else {
                        return;
                    }
                }
                if (i == 0 && mo47079b(this.f18079p, aVar.isEmpty(), bVar, z)) {
                    return;
                }
                if (j2 != 0) {
                    if (j != Long.MAX_VALUE) {
                        this.f18078o.addAndGet(-j2);
                    }
                    this.f18076m.upstream.request(j2);
                }
            }
            i2 = addAndGet(-i2);
            if (i2 != 0) {
                if (bVar == null) {
                    bVar = this.f18082s.get();
                }
            } else {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return this.f18075l.isEmpty();
    }

    public void onComplete() {
        this.f18079p = true;
        drain();
    }

    public void onError(Throwable th) {
        this.f18080q = th;
        this.f18079p = true;
        drain();
    }

    public void onNext(T t) {
        this.f18075l.offer(t);
        drain();
    }

    public T poll() {
        T poll = this.f18075l.poll();
        if (poll != null) {
            this.f18085v++;
            return poll;
        }
        int i = this.f18085v;
        if (i == 0) {
            return null;
        }
        this.f18085v = 0;
        this.f18076m.upstream.request((long) i);
        return null;
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C9314b.m25135a(this.f18078o, j);
            drain();
        }
    }

    public int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.f18084u = true;
        return 2;
    }
}
