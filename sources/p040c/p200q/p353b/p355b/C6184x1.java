package p040c.p200q.p353b.p355b;

import java.util.Arrays;
import p040c.p200q.p353b.p354a.C5845j;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C6153t1;
import p040c.p200q.p353b.p355b.C6158u1;

/* renamed from: c.q.b.b.x1 */
/* compiled from: ObjectCountHashMap */
public class C6184x1<K> {

    /* renamed from: a */
    public transient Object[] f11785a;

    /* renamed from: b */
    public transient int[] f11786b;

    /* renamed from: c */
    public transient int f11787c;

    /* renamed from: d */
    public transient int f11788d;

    /* renamed from: e */
    public transient int[] f11789e;

    /* renamed from: f */
    public transient long[] f11790f;

    /* renamed from: g */
    public transient float f11791g;

    /* renamed from: h */
    public transient int f11792h;

    /* renamed from: c.q.b.b.x1$a */
    /* compiled from: ObjectCountHashMap */
    public class C6185a extends C6158u1.C6160b<K> {

        /* renamed from: e */
        public final K f11793e;

        /* renamed from: l */
        public int f11794l;

        public C6185a(int i) {
            this.f11793e = C6184x1.this.f11785a[i];
            this.f11794l = i;
        }

        /* renamed from: a */
        public K mo29977a() {
            return this.f11793e;
        }

        /* renamed from: b */
        public void mo30125b() {
            int i = this.f11794l;
            if (i == -1 || i >= C6184x1.this.mo30104C() || !C5845j.m16576a(this.f11793e, C6184x1.this.f11785a[this.f11794l])) {
                this.f11794l = C6184x1.this.mo30113m(this.f11793e);
            }
        }

        public int getCount() {
            mo30125b();
            int i = this.f11794l;
            if (i == -1) {
                return 0;
            }
            return C6184x1.this.f11786b[i];
        }
    }

    public C6184x1() {
        mo30114n(3, 1.0f);
    }

    /* renamed from: D */
    public static long m17353D(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* renamed from: b */
    public static <K> C6184x1<K> m17354b() {
        return new C6184x1<>();
    }

    /* renamed from: c */
    public static <K> C6184x1<K> m17355c(int i) {
        return new C6184x1<>(i);
    }

    /* renamed from: h */
    public static int m17356h(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: j */
    public static int m17357j(long j) {
        return (int) j;
    }

    /* renamed from: q */
    public static long[] m17358q(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    /* renamed from: r */
    public static int[] m17359r(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: A */
    public final void mo30102A(int i) {
        if (this.f11789e.length >= 1073741824) {
            this.f11792h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.f11791g)) + 1;
        int[] r = m17359r(i);
        long[] jArr = this.f11790f;
        int length = r.length - 1;
        for (int i3 = 0; i3 < this.f11787c; i3++) {
            int h = m17356h(jArr[i3]);
            int i4 = h & length;
            int i5 = r[i4];
            r[i4] = i3;
            jArr[i3] = (((long) h) << 32) | (((long) i5) & 4294967295L);
        }
        this.f11792h = i2;
        this.f11789e = r;
    }

    /* renamed from: B */
    public void mo30103B(int i, int i2) {
        C5850m.m16592m(i, this.f11787c);
        this.f11786b[i] = i2;
    }

    /* renamed from: C */
    public int mo30104C() {
        return this.f11787c;
    }

    /* renamed from: a */
    public void mo30105a() {
        this.f11788d++;
        Arrays.fill(this.f11785a, 0, this.f11787c, (Object) null);
        Arrays.fill(this.f11786b, 0, this.f11787c, 0);
        Arrays.fill(this.f11789e, -1);
        Arrays.fill(this.f11790f, -1);
        this.f11787c = 0;
    }

    /* renamed from: d */
    public void mo30106d(int i) {
        if (i > this.f11790f.length) {
            mo30123y(i);
        }
        if (i >= this.f11792h) {
            mo30102A(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    /* renamed from: e */
    public int mo30107e() {
        return this.f11787c == 0 ? -1 : 0;
    }

    /* renamed from: f */
    public int mo30108f(Object obj) {
        int m = mo30113m(obj);
        if (m == -1) {
            return 0;
        }
        return this.f11786b[m];
    }

    /* renamed from: g */
    public C6153t1.C6154a<K> mo30109g(int i) {
        C5850m.m16592m(i, this.f11787c);
        return new C6185a(i);
    }

    /* renamed from: i */
    public K mo30110i(int i) {
        C5850m.m16592m(i, this.f11787c);
        return this.f11785a[i];
    }

    /* renamed from: k */
    public int mo30111k(int i) {
        C5850m.m16592m(i, this.f11787c);
        return this.f11786b[i];
    }

    /* renamed from: l */
    public final int mo30112l() {
        return this.f11789e.length - 1;
    }

    /* renamed from: m */
    public int mo30113m(Object obj) {
        int d = C6204z0.m17453d(obj);
        int i = this.f11789e[mo30112l() & d];
        while (i != -1) {
            long j = this.f11790f[i];
            if (m17356h(j) == d && C5845j.m16576a(obj, this.f11785a[i])) {
                return i;
            }
            i = m17357j(j);
        }
        return -1;
    }

    /* renamed from: n */
    public void mo30114n(int i, float f) {
        boolean z = false;
        C5850m.m16584e(i >= 0, "Initial capacity must be non-negative");
        if (f > 0.0f) {
            z = true;
        }
        C5850m.m16584e(z, "Illegal load factor");
        int a = C6204z0.m17450a(i, (double) f);
        this.f11789e = m17359r(a);
        this.f11791g = f;
        this.f11785a = new Object[i];
        this.f11786b = new int[i];
        this.f11790f = m17358q(i);
        this.f11792h = Math.max(1, (int) (((float) a) * f));
    }

    /* renamed from: o */
    public void mo30115o(int i, K k, int i2, int i3) {
        this.f11790f[i] = (((long) i3) << 32) | 4294967295L;
        this.f11785a[i] = k;
        this.f11786b[i] = i2;
    }

    /* renamed from: p */
    public void mo30116p(int i) {
        int C = mo30104C() - 1;
        if (i < C) {
            Object[] objArr = this.f11785a;
            objArr[i] = objArr[C];
            int[] iArr = this.f11786b;
            iArr[i] = iArr[C];
            objArr[C] = null;
            iArr[C] = 0;
            long[] jArr = this.f11790f;
            long j = jArr[C];
            jArr[i] = j;
            jArr[C] = -1;
            int h = m17356h(j) & mo30112l();
            int[] iArr2 = this.f11789e;
            int i2 = iArr2[h];
            if (i2 == C) {
                iArr2[h] = i;
                return;
            }
            while (true) {
                long j2 = this.f11790f[i2];
                int j3 = m17357j(j2);
                if (j3 == C) {
                    this.f11790f[i2] = m17353D(j2, i);
                    return;
                }
                i2 = j3;
            }
        } else {
            this.f11785a[i] = null;
            this.f11786b[i] = 0;
            this.f11790f[i] = -1;
        }
    }

    /* renamed from: s */
    public int mo30117s(int i) {
        int i2 = i + 1;
        if (i2 < this.f11787c) {
            return i2;
        }
        return -1;
    }

    /* renamed from: t */
    public int mo30118t(int i, int i2) {
        return i - 1;
    }

    /* renamed from: u */
    public int mo30119u(K k, int i) {
        C6166v.m17278d(i, "count");
        long[] jArr = this.f11790f;
        Object[] objArr = this.f11785a;
        int[] iArr = this.f11786b;
        int d = C6204z0.m17453d(k);
        int l = mo30112l() & d;
        int i2 = this.f11787c;
        int[] iArr2 = this.f11789e;
        int i3 = iArr2[l];
        if (i3 == -1) {
            iArr2[l] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (m17356h(j) != d || !C5845j.m16576a(k, objArr[i3])) {
                    int j2 = m17357j(j);
                    if (j2 == -1) {
                        jArr[i3] = m17353D(j, i2);
                        break;
                    }
                    i3 = j2;
                } else {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            int i5 = i2 + 1;
            mo30124z(i5);
            mo30115o(i2, k, i, d);
            this.f11787c = i5;
            if (i2 >= this.f11792h) {
                mo30102A(this.f11789e.length * 2);
            }
            this.f11788d++;
            return 0;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* renamed from: v */
    public int mo30120v(Object obj) {
        return mo30121w(obj, C6204z0.m17453d(obj));
    }

    /* renamed from: w */
    public final int mo30121w(Object obj, int i) {
        int l = mo30112l() & i;
        int i2 = this.f11789e[l];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (m17356h(this.f11790f[i2]) != i || !C5845j.m16576a(obj, this.f11785a[i2])) {
                int j = m17357j(this.f11790f[i2]);
                if (j == -1) {
                    return 0;
                }
                int i4 = j;
                i3 = i2;
                i2 = i4;
            } else {
                int i5 = this.f11786b[i2];
                if (i3 == -1) {
                    this.f11789e[l] = m17357j(this.f11790f[i2]);
                } else {
                    long[] jArr = this.f11790f;
                    jArr[i3] = m17353D(jArr[i3], m17357j(jArr[i2]));
                }
                mo30116p(i2);
                this.f11787c--;
                this.f11788d++;
                return i5;
            }
        }
    }

    /* renamed from: x */
    public int mo30122x(int i) {
        return mo30121w(this.f11785a[i], m17356h(this.f11790f[i]));
    }

    /* renamed from: y */
    public void mo30123y(int i) {
        this.f11785a = Arrays.copyOf(this.f11785a, i);
        this.f11786b = Arrays.copyOf(this.f11786b, i);
        long[] jArr = this.f11790f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.f11790f = copyOf;
    }

    /* renamed from: z */
    public final void mo30124z(int i) {
        int length = this.f11790f.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                mo30123y(max);
            }
        }
    }

    public C6184x1(C6184x1<? extends K> x1Var) {
        mo30114n(x1Var.mo30104C(), 1.0f);
        int e = x1Var.mo30107e();
        while (e != -1) {
            mo30119u(x1Var.mo30110i(e), x1Var.mo30111k(e));
            e = x1Var.mo30117s(e);
        }
    }

    public C6184x1(int i) {
        this(i, 1.0f);
    }

    public C6184x1(int i, float f) {
        mo30114n(i, f);
    }
}
