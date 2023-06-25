package p553f.p594c.p602s.p607e.p608a;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9185c;
import p553f.p594c.C9186d;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p601r.C9218f;
import p553f.p594c.p602s.p604b.C9227b;
import p553f.p594c.p602s.p605c.C9231d;
import p553f.p594c.p602s.p605c.C9233f;
import p553f.p594c.p602s.p605c.C9234g;
import p553f.p594c.p602s.p611f.C9288a;
import p553f.p594c.p602s.p614i.C9314b;
import p553f.p594c.p602s.p614i.C9315c;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.MissingBackpressureException;
import p630io.reactivex.internal.queue.SpscArrayQueue;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p630io.reactivex.internal.util.AtomicThrowable;
import p648m.p683f.C9801a;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: f.c.s.e.a.e */
/* compiled from: FlowableFlatMap */
public final class C9246e<T, U> extends C9236a<T, U> {

    /* renamed from: m */
    public final C9218f<? super T, ? extends C9801a<? extends U>> f18039m;

    /* renamed from: n */
    public final boolean f18040n;

    /* renamed from: o */
    public final int f18041o;

    /* renamed from: p */
    public final int f18042p;

    /* renamed from: f.c.s.e.a.e$a */
    /* compiled from: FlowableFlatMap */
    public static final class C9247a<T, U> extends AtomicReference<C9803c> implements C9186d<U>, C9207b {
        public static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: e */
        public final long f18043e;

        /* renamed from: l */
        public final C9248b<T, U> f18044l;

        /* renamed from: m */
        public final int f18045m;

        /* renamed from: n */
        public final int f18046n;

        /* renamed from: o */
        public volatile boolean f18047o;

        /* renamed from: p */
        public volatile C9234g<U> f18048p;

        /* renamed from: q */
        public long f18049q;

        /* renamed from: r */
        public int f18050r;

        public C9247a(C9248b<T, U> bVar, long j) {
            this.f18043e = j;
            this.f18044l = bVar;
            int i = bVar.f18058o;
            this.f18046n = i;
            this.f18045m = i >> 2;
        }

        /* renamed from: a */
        public void mo47063a(long j) {
            if (this.f18050r != 1) {
                long j2 = this.f18049q + j;
                if (j2 >= ((long) this.f18045m)) {
                    this.f18049q = 0;
                    ((C9803c) get()).request(j2);
                    return;
                }
                this.f18049q = j2;
            }
        }

        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        public void onComplete() {
            this.f18047o = true;
            this.f18044l.mo47068f();
        }

        public void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.f18044l.mo47072j(this, th);
        }

        public void onNext(U u) {
            if (this.f18050r != 2) {
                this.f18044l.mo47074m(u, this);
            } else {
                this.f18044l.mo47068f();
            }
        }

        public void onSubscribe(C9803c cVar) {
            if (SubscriptionHelper.setOnce(this, cVar)) {
                if (cVar instanceof C9231d) {
                    C9231d dVar = (C9231d) cVar;
                    int requestFusion = dVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f18050r = requestFusion;
                        this.f18048p = dVar;
                        this.f18047o = true;
                        this.f18044l.mo47068f();
                        return;
                    } else if (requestFusion == 2) {
                        this.f18050r = requestFusion;
                        this.f18048p = dVar;
                    }
                }
                cVar.request((long) this.f18046n);
            }
        }
    }

    /* renamed from: f.c.s.e.a.e$b */
    /* compiled from: FlowableFlatMap */
    public static final class C9248b<T, U> extends AtomicInteger implements C9186d<T>, C9803c {

        /* renamed from: B */
        public static final C9247a<?, ?>[] f18051B = new C9247a[0];

        /* renamed from: C */
        public static final C9247a<?, ?>[] f18052C = new C9247a[0];
        public static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: A */
        public final int f18053A;

        /* renamed from: e */
        public final C9802b<? super U> f18054e;

        /* renamed from: l */
        public final C9218f<? super T, ? extends C9801a<? extends U>> f18055l;

        /* renamed from: m */
        public final boolean f18056m;

        /* renamed from: n */
        public final int f18057n;

        /* renamed from: o */
        public final int f18058o;

        /* renamed from: p */
        public volatile C9233f<U> f18059p;

        /* renamed from: q */
        public volatile boolean f18060q;

        /* renamed from: r */
        public final AtomicThrowable f18061r = new AtomicThrowable();

        /* renamed from: s */
        public volatile boolean f18062s;

        /* renamed from: t */
        public final AtomicReference<C9247a<?, ?>[]> f18063t = new AtomicReference<>();

        /* renamed from: u */
        public final AtomicLong f18064u = new AtomicLong();

        /* renamed from: v */
        public C9803c f18065v;

        /* renamed from: w */
        public long f18066w;

        /* renamed from: x */
        public long f18067x;

        /* renamed from: y */
        public int f18068y;

        /* renamed from: z */
        public int f18069z;

        public C9248b(C9802b<? super U> bVar, C9218f<? super T, ? extends C9801a<? extends U>> fVar, boolean z, int i, int i2) {
            this.f18054e = bVar;
            this.f18055l = fVar;
            this.f18056m = z;
            this.f18057n = i;
            this.f18058o = i2;
            this.f18053A = Math.max(1, i >> 1);
            this.f18063t.lazySet(f18051B);
        }

        /* renamed from: a */
        public boolean mo47064a(C9247a<T, U> aVar) {
            C9247a<?, ?>[] aVarArr;
            C9247a[] aVarArr2;
            do {
                aVarArr = (C9247a[]) this.f18063t.get();
                if (aVarArr == f18052C) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C9247a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f18063t.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* renamed from: b */
        public boolean mo47065b() {
            if (this.f18062s) {
                mo47066d();
                return true;
            } else if (this.f18056m || this.f18061r.get() == null) {
                return false;
            } else {
                mo47066d();
                Throwable terminate = this.f18061r.terminate();
                if (terminate != C9315c.f18266a) {
                    this.f18054e.onError(terminate);
                }
                return true;
            }
        }

        public void cancel() {
            C9233f<U> fVar;
            if (!this.f18062s) {
                this.f18062s = true;
                this.f18065v.cancel();
                mo47067e();
                if (getAndIncrement() == 0 && (fVar = this.f18059p) != null) {
                    fVar.clear();
                }
            }
        }

        /* renamed from: d */
        public void mo47066d() {
            C9233f<U> fVar = this.f18059p;
            if (fVar != null) {
                fVar.clear();
            }
        }

        /* renamed from: e */
        public void mo47067e() {
            C9247a<?, ?>[] aVarArr;
            C9247a<?, ?>[] aVarArr2 = (C9247a[]) this.f18063t.get();
            C9247a<?, ?>[] aVarArr3 = f18052C;
            if (aVarArr2 != aVarArr3 && (aVarArr = (C9247a[]) this.f18063t.getAndSet(aVarArr3)) != f18052C) {
                for (C9247a<?, ?> dispose : aVarArr) {
                    dispose.dispose();
                }
                Throwable terminate = this.f18061r.terminate();
                if (terminate != null && terminate != C9315c.f18266a) {
                    C9323a.m25169p(terminate);
                }
            }
        }

        /* renamed from: f */
        public void mo47068f() {
            if (getAndIncrement() == 0) {
                mo47069g();
            }
        }

        /* renamed from: g */
        public void mo47069g() {
            long j;
            boolean z;
            long j2;
            long j3;
            int i;
            int i2;
            long j4;
            C9802b<? super U> bVar = this.f18054e;
            int i3 = 1;
            while (!mo47065b()) {
                C9233f<U> fVar = this.f18059p;
                long j5 = this.f18064u.get();
                boolean z2 = j5 == Long.MAX_VALUE;
                long j6 = 0;
                long j7 = 0;
                if (fVar != null) {
                    while (true) {
                        long j8 = 0;
                        U u = null;
                        while (true) {
                            if (j5 == 0) {
                                break;
                            }
                            U poll = fVar.poll();
                            if (!mo47065b()) {
                                if (poll == null) {
                                    u = poll;
                                    break;
                                }
                                bVar.onNext(poll);
                                j7++;
                                j8++;
                                j5--;
                                u = poll;
                            } else {
                                return;
                            }
                        }
                        if (j8 != 0) {
                            if (z2) {
                                j5 = Long.MAX_VALUE;
                            } else {
                                j5 = this.f18064u.addAndGet(-j8);
                            }
                        }
                        if (j5 == 0 || u == null) {
                            break;
                        }
                    }
                }
                boolean z3 = this.f18060q;
                C9233f<U> fVar2 = this.f18059p;
                C9247a[] aVarArr = (C9247a[]) this.f18063t.get();
                int length = aVarArr.length;
                if (!z3 || ((fVar2 != null && !fVar2.isEmpty()) || length != 0)) {
                    int i4 = i3;
                    if (length != 0) {
                        long j9 = this.f18067x;
                        int i5 = this.f18068y;
                        if (length <= i5 || aVarArr[i5].f18043e != j9) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            for (int i6 = 0; i6 < length && aVarArr[i5].f18043e != j9; i6++) {
                                i5++;
                                if (i5 == length) {
                                    i5 = 0;
                                }
                            }
                            this.f18068y = i5;
                            this.f18067x = aVarArr[i5].f18043e;
                        }
                        int i7 = i5;
                        boolean z4 = false;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                z = z4;
                                break;
                            } else if (!mo47065b()) {
                                C9247a aVar = aVarArr[i7];
                                U u2 = null;
                                while (!mo47065b()) {
                                    C9234g<U> gVar = aVar.f18048p;
                                    if (gVar == null) {
                                        i = length;
                                    } else {
                                        i = length;
                                        U u3 = u2;
                                        long j10 = j6;
                                        while (true) {
                                            if (j == j6) {
                                                break;
                                            }
                                            try {
                                                U poll2 = gVar.poll();
                                                if (poll2 == null) {
                                                    u3 = poll2;
                                                    j6 = 0;
                                                    break;
                                                }
                                                bVar.onNext(poll2);
                                                if (!mo47065b()) {
                                                    j--;
                                                    j10++;
                                                    u3 = poll2;
                                                    j6 = 0;
                                                } else {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                Throwable th2 = th;
                                                C9211a.m24971b(th2);
                                                aVar.dispose();
                                                this.f18061r.addThrowable(th2);
                                                if (!this.f18056m) {
                                                    this.f18065v.cancel();
                                                }
                                                if (!mo47065b()) {
                                                    mo47073l(aVar);
                                                    i8++;
                                                    z4 = true;
                                                    i2 = 1;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                        if (j10 != j6) {
                                            j = !z2 ? this.f18064u.addAndGet(-j10) : Long.MAX_VALUE;
                                            aVar.mo47063a(j10);
                                            j4 = 0;
                                        } else {
                                            j4 = j6;
                                        }
                                        if (!(j == j4 || u3 == null)) {
                                            length = i;
                                            u2 = u3;
                                            j6 = 0;
                                        }
                                    }
                                    boolean z5 = aVar.f18047o;
                                    C9234g<U> gVar2 = aVar.f18048p;
                                    if (z5 && (gVar2 == null || gVar2.isEmpty())) {
                                        mo47073l(aVar);
                                        if (!mo47065b()) {
                                            j7++;
                                            z4 = true;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j == 0) {
                                        z = z4;
                                        break;
                                    }
                                    i7++;
                                    if (i7 == i) {
                                        i7 = 0;
                                    }
                                    i2 = 1;
                                    i8 += i2;
                                    length = i;
                                    j6 = 0;
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                        this.f18068y = i7;
                        this.f18067x = aVarArr[i7].f18043e;
                        j3 = j7;
                        j2 = 0;
                    } else {
                        j2 = 0;
                        j3 = j7;
                        z = false;
                    }
                    if (j3 != j2 && !this.f18062s) {
                        this.f18065v.request(j3);
                    }
                    if (z) {
                        i3 = i4;
                    } else {
                        i3 = addAndGet(-i4);
                        if (i3 == 0) {
                            return;
                        }
                    }
                } else {
                    Throwable terminate = this.f18061r.terminate();
                    if (terminate == C9315c.f18266a) {
                        return;
                    }
                    if (terminate == null) {
                        bVar.onComplete();
                        return;
                    } else {
                        bVar.onError(terminate);
                        return;
                    }
                }
            }
        }

        /* renamed from: h */
        public C9234g<U> mo47070h(C9247a<T, U> aVar) {
            C9234g<U> gVar = aVar.f18048p;
            if (gVar != null) {
                return gVar;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.f18058o);
            aVar.f18048p = spscArrayQueue;
            return spscArrayQueue;
        }

        /* renamed from: i */
        public C9234g<U> mo47071i() {
            C9233f<U> fVar = this.f18059p;
            if (fVar == null) {
                if (this.f18057n == Integer.MAX_VALUE) {
                    fVar = new C9288a<>(this.f18058o);
                } else {
                    fVar = new SpscArrayQueue<>(this.f18057n);
                }
                this.f18059p = fVar;
            }
            return fVar;
        }

        /* renamed from: j */
        public void mo47072j(C9247a<T, U> aVar, Throwable th) {
            if (this.f18061r.addThrowable(th)) {
                aVar.f18047o = true;
                if (!this.f18056m) {
                    this.f18065v.cancel();
                    for (C9247a dispose : (C9247a[]) this.f18063t.getAndSet(f18052C)) {
                        dispose.dispose();
                    }
                }
                mo47068f();
                return;
            }
            C9323a.m25169p(th);
        }

        /* renamed from: l */
        public void mo47073l(C9247a<T, U> aVar) {
            C9247a<T, U>[] aVarArr;
            C9247a<?, ?>[] aVarArr2;
            do {
                aVarArr = (C9247a[]) this.f18063t.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2] == aVar) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = f18051B;
                        } else {
                            C9247a<?, ?>[] aVarArr3 = new C9247a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                            aVarArr2 = aVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f18063t.compareAndSet(aVarArr, aVarArr2));
        }

        /* renamed from: m */
        public void mo47074m(U u, C9247a<T, U> aVar) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C9234g gVar = aVar.f18048p;
                if (gVar == null) {
                    gVar = new SpscArrayQueue(this.f18058o);
                    aVar.f18048p = gVar;
                }
                if (!gVar.offer(u)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                long j = this.f18064u.get();
                C9234g<U> gVar2 = aVar.f18048p;
                if (j == 0 || (gVar2 != null && !gVar2.isEmpty())) {
                    if (gVar2 == null) {
                        gVar2 = mo47070h(aVar);
                    }
                    if (!gVar2.offer(u)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                } else {
                    this.f18054e.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.f18064u.decrementAndGet();
                    }
                    aVar.mo47063a(1);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            mo47069g();
        }

        /* renamed from: n */
        public void mo47075n(U u) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f18064u.get();
                C9234g gVar = this.f18059p;
                if (j == 0 || (gVar != null && !gVar.isEmpty())) {
                    if (gVar == null) {
                        gVar = mo47071i();
                    }
                    if (!gVar.offer(u)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                } else {
                    this.f18054e.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.f18064u.decrementAndGet();
                    }
                    if (this.f18057n != Integer.MAX_VALUE && !this.f18062s) {
                        int i = this.f18069z + 1;
                        this.f18069z = i;
                        int i2 = this.f18053A;
                        if (i == i2) {
                            this.f18069z = 0;
                            this.f18065v.request((long) i2);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!mo47071i().offer(u)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            mo47069g();
        }

        public void onComplete() {
            if (!this.f18060q) {
                this.f18060q = true;
                mo47068f();
            }
        }

        public void onError(Throwable th) {
            if (this.f18060q) {
                C9323a.m25169p(th);
            } else if (this.f18061r.addThrowable(th)) {
                this.f18060q = true;
                mo47068f();
            } else {
                C9323a.m25169p(th);
            }
        }

        public void onNext(T t) {
            if (!this.f18060q) {
                try {
                    Object apply = this.f18055l.apply(t);
                    C9227b.m24985d(apply, "The mapper returned a null Publisher");
                    C9801a aVar = (C9801a) apply;
                    if (aVar instanceof Callable) {
                        try {
                            Object call = ((Callable) aVar).call();
                            if (call != null) {
                                mo47075n(call);
                            } else if (this.f18057n != Integer.MAX_VALUE && !this.f18062s) {
                                int i = this.f18069z + 1;
                                this.f18069z = i;
                                int i2 = this.f18053A;
                                if (i == i2) {
                                    this.f18069z = 0;
                                    this.f18065v.request((long) i2);
                                }
                            }
                        } catch (Throwable th) {
                            C9211a.m24971b(th);
                            this.f18061r.addThrowable(th);
                            mo47068f();
                        }
                    } else {
                        long j = this.f18066w;
                        this.f18066w = 1 + j;
                        C9247a aVar2 = new C9247a(this, j);
                        if (mo47064a(aVar2)) {
                            aVar.mo46975a(aVar2);
                        }
                    }
                } catch (Throwable th2) {
                    C9211a.m24971b(th2);
                    this.f18065v.cancel();
                    onError(th2);
                }
            }
        }

        public void onSubscribe(C9803c cVar) {
            if (SubscriptionHelper.validate(this.f18065v, cVar)) {
                this.f18065v = cVar;
                this.f18054e.onSubscribe(this);
                if (!this.f18062s) {
                    int i = this.f18057n;
                    if (i == Integer.MAX_VALUE) {
                        cVar.request(Long.MAX_VALUE);
                    } else {
                        cVar.request((long) i);
                    }
                }
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C9314b.m25135a(this.f18064u, j);
                mo47068f();
            }
        }
    }

    public C9246e(C9185c<T> cVar, C9218f<? super T, ? extends C9801a<? extends U>> fVar, boolean z, int i, int i2) {
        super(cVar);
        this.f18039m = fVar;
        this.f18040n = z;
        this.f18041o = i;
        this.f18042p = i2;
    }

    /* renamed from: A */
    public static <T, U> C9186d<T> m24996A(C9802b<? super U> bVar, C9218f<? super T, ? extends C9801a<? extends U>> fVar, boolean z, int i, int i2) {
        return new C9248b(bVar, fVar, z, i, i2);
    }

    /* renamed from: v */
    public void mo46993v(C9802b<? super U> bVar) {
        if (!C9269p.m25042b(this.f18010l, bVar, this.f18039m)) {
            this.f18010l.mo46992u(m24996A(bVar, this.f18039m, this.f18040n, this.f18041o, this.f18042p));
        }
    }
}
