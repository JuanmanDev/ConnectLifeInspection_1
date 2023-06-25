package p553f.p594c.p602s.p607e.p610c;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9192i;
import p553f.p594c.C9193j;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p602s.p611f.C9288a;
import p630io.reactivex.internal.disposables.EmptyDisposable;
import p630io.reactivex.internal.operators.observable.ObservableGroupBy$GroupByObserver;

/* renamed from: f.c.s.e.c.c */
/* compiled from: ObservableGroupBy */
public final class C9280c<T, K> extends AtomicInteger implements C9207b, C9192i<T> {
    public static final long serialVersionUID = -3852313036005250360L;

    /* renamed from: e */
    public final K f18159e;

    /* renamed from: l */
    public final C9288a<T> f18160l;

    /* renamed from: m */
    public final ObservableGroupBy$GroupByObserver<?, K, T> f18161m;

    /* renamed from: n */
    public final boolean f18162n;

    /* renamed from: o */
    public volatile boolean f18163o;

    /* renamed from: p */
    public Throwable f18164p;

    /* renamed from: q */
    public final AtomicBoolean f18165q = new AtomicBoolean();

    /* renamed from: r */
    public final AtomicBoolean f18166r = new AtomicBoolean();

    /* renamed from: s */
    public final AtomicReference<C9193j<? super T>> f18167s = new AtomicReference<>();

    public C9280c(int i, ObservableGroupBy$GroupByObserver<?, K, T> observableGroupBy$GroupByObserver, K k, boolean z) {
        this.f18160l = new C9288a<>(i);
        this.f18161m = observableGroupBy$GroupByObserver;
        this.f18159e = k;
        this.f18162n = z;
    }

    /* renamed from: a */
    public void mo47002a(C9193j<? super T> jVar) {
        if (this.f18166r.compareAndSet(false, true)) {
            jVar.onSubscribe(this);
            this.f18167s.lazySet(jVar);
            if (this.f18165q.get()) {
                this.f18167s.lazySet((Object) null);
            } else {
                mo47105c();
            }
        } else {
            EmptyDisposable.error((Throwable) new IllegalStateException("Only one Observer allowed!"), (C9193j<?>) jVar);
        }
    }

    /* renamed from: b */
    public boolean mo47104b(boolean z, boolean z2, C9193j<? super T> jVar, boolean z3) {
        if (this.f18165q.get()) {
            this.f18160l.clear();
            this.f18161m.cancel(this.f18159e);
            this.f18167s.lazySet((Object) null);
            return true;
        } else if (!z) {
            return false;
        } else {
            if (!z3) {
                Throwable th = this.f18164p;
                if (th != null) {
                    this.f18160l.clear();
                    this.f18167s.lazySet((Object) null);
                    jVar.onError(th);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    this.f18167s.lazySet((Object) null);
                    jVar.onComplete();
                    return true;
                }
            } else if (!z2) {
                return false;
            } else {
                Throwable th2 = this.f18164p;
                this.f18167s.lazySet((Object) null);
                if (th2 != null) {
                    jVar.onError(th2);
                } else {
                    jVar.onComplete();
                }
                return true;
            }
        }
    }

    /* renamed from: c */
    public void mo47105c() {
        if (getAndIncrement() == 0) {
            C9288a<T> aVar = this.f18160l;
            boolean z = this.f18162n;
            C9193j jVar = this.f18167s.get();
            int i = 1;
            while (true) {
                if (jVar != null) {
                    while (true) {
                        boolean z2 = this.f18163o;
                        T poll = aVar.poll();
                        boolean z3 = poll == null;
                        if (!mo47104b(z2, z3, jVar, z)) {
                            if (z3) {
                                break;
                            }
                            jVar.onNext(poll);
                        } else {
                            return;
                        }
                    }
                }
                i = addAndGet(-i);
                if (i != 0) {
                    if (jVar == null) {
                        jVar = this.f18167s.get();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public void mo47106d() {
        this.f18163o = true;
        mo47105c();
    }

    public void dispose() {
        if (this.f18165q.compareAndSet(false, true) && getAndIncrement() == 0) {
            this.f18167s.lazySet((Object) null);
            this.f18161m.cancel(this.f18159e);
        }
    }

    /* renamed from: e */
    public void mo47107e(Throwable th) {
        this.f18164p = th;
        this.f18163o = true;
        mo47105c();
    }

    /* renamed from: f */
    public void mo47108f(T t) {
        this.f18160l.offer(t);
        mo47105c();
    }
}
