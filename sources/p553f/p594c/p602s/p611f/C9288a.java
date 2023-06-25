package p553f.p594c.p602s.p611f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p553f.p594c.p602s.p605c.C9233f;
import p553f.p594c.p602s.p614i.C9319f;

/* renamed from: f.c.s.f.a */
/* compiled from: SpscLinkedArrayQueue */
public final class C9288a<T> implements C9233f<T> {

    /* renamed from: s */
    public static final int f18179s = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: t */
    public static final Object f18180t = new Object();

    /* renamed from: e */
    public final AtomicLong f18181e = new AtomicLong();

    /* renamed from: l */
    public int f18182l;

    /* renamed from: m */
    public long f18183m;

    /* renamed from: n */
    public final int f18184n;

    /* renamed from: o */
    public AtomicReferenceArray<Object> f18185o;

    /* renamed from: p */
    public final int f18186p;

    /* renamed from: q */
    public AtomicReferenceArray<Object> f18187q;

    /* renamed from: r */
    public final AtomicLong f18188r = new AtomicLong();

    public C9288a(int i) {
        int a = C9319f.m25151a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a + 1);
        this.f18185o = atomicReferenceArray;
        this.f18184n = i2;
        mo47111a(a);
        this.f18187q = atomicReferenceArray;
        this.f18186p = i2;
        this.f18183m = (long) (i2 - 1);
        mo47121o(0);
    }

    /* renamed from: b */
    public static int m25063b(int i) {
        return i;
    }

    /* renamed from: c */
    public static int m25064c(long j, int i) {
        int i2 = ((int) j) & i;
        m25063b(i2);
        return i2;
    }

    /* renamed from: g */
    public static <E> Object m25065g(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: m */
    public static void m25066m(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    public final void mo47111a(int i) {
        this.f18182l = Math.min(i / 4, f18179s);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: d */
    public final long mo47112d() {
        return this.f18188r.get();
    }

    /* renamed from: e */
    public final long mo47113e() {
        return this.f18181e.get();
    }

    /* renamed from: f */
    public final long mo47114f() {
        return this.f18188r.get();
    }

    /* renamed from: h */
    public final AtomicReferenceArray<Object> mo47115h(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        m25063b(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) m25065g(atomicReferenceArray, i);
        m25066m(atomicReferenceArray, i, (Object) null);
        return atomicReferenceArray2;
    }

    /* renamed from: i */
    public final long mo47116i() {
        return this.f18181e.get();
    }

    public boolean isEmpty() {
        return mo47116i() == mo47114f();
    }

    /* renamed from: j */
    public final T mo47117j(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f18187q = atomicReferenceArray;
        int c = m25064c(j, i);
        T g = m25065g(atomicReferenceArray, c);
        if (g != null) {
            m25066m(atomicReferenceArray, c, (Object) null);
            mo47119l(j + 1);
        }
        return g;
    }

    /* renamed from: k */
    public final void mo47118k(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f18185o = atomicReferenceArray2;
        this.f18183m = (j2 + j) - 1;
        m25066m(atomicReferenceArray2, i, t);
        mo47120n(atomicReferenceArray, atomicReferenceArray2);
        m25066m(atomicReferenceArray, i, f18180t);
        mo47121o(j + 1);
    }

    /* renamed from: l */
    public final void mo47119l(long j) {
        this.f18188r.lazySet(j);
    }

    /* renamed from: n */
    public final void mo47120n(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        int length = atomicReferenceArray.length() - 1;
        m25063b(length);
        m25066m(atomicReferenceArray, length, atomicReferenceArray2);
    }

    /* renamed from: o */
    public final void mo47121o(long j) {
        this.f18181e.lazySet(j);
    }

    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f18185o;
            long e = mo47113e();
            int i = this.f18184n;
            int c = m25064c(e, i);
            if (e < this.f18183m) {
                return mo47122p(atomicReferenceArray, t, e, c);
            }
            long j = ((long) this.f18182l) + e;
            if (m25065g(atomicReferenceArray, m25064c(j, i)) == null) {
                this.f18183m = j - 1;
                return mo47122p(atomicReferenceArray, t, e, c);
            } else if (m25065g(atomicReferenceArray, m25064c(1 + e, i)) == null) {
                return mo47122p(atomicReferenceArray, t, e, c);
            } else {
                mo47118k(atomicReferenceArray, e, c, t, (long) i);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    /* renamed from: p */
    public final boolean mo47122p(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m25066m(atomicReferenceArray, i, t);
        mo47121o(j + 1);
        return true;
    }

    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f18187q;
        long d = mo47112d();
        int i = this.f18186p;
        int c = m25064c(d, i);
        T g = m25065g(atomicReferenceArray, c);
        boolean z = g == f18180t;
        if (g != null && !z) {
            m25066m(atomicReferenceArray, c, (Object) null);
            mo47119l(d + 1);
            return g;
        } else if (z) {
            return mo47117j(mo47115h(atomicReferenceArray, i + 1), d, i);
        } else {
            return null;
        }
    }
}
