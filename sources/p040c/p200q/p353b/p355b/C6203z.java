package p040c.p200q.p353b.p355b;

import java.util.Arrays;

/* renamed from: c.q.b.b.z */
/* compiled from: CompactLinkedHashMap */
public class C6203z<K, V> extends C6174x<K, V> {

    /* renamed from: t */
    public transient long[] f11818t;

    /* renamed from: u */
    public transient int f11819u;

    /* renamed from: v */
    public transient int f11820v;

    /* renamed from: w */
    public final boolean f11821w;

    public C6203z() {
        this(3);
    }

    /* renamed from: I */
    public static <K, V> C6203z<K, V> m17435I() {
        return new C6203z<>();
    }

    /* renamed from: J */
    public static <K, V> C6203z<K, V> m17436J(int i) {
        return new C6203z<>(i);
    }

    /* renamed from: D */
    public void mo30037D(int i) {
        super.mo30037D(i);
        long[] jArr = this.f11818t;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        this.f11818t = copyOf;
        if (length < i) {
            Arrays.fill(copyOf, length, i, -1);
        }
    }

    /* renamed from: K */
    public final int mo30148K(int i) {
        return (int) (this.f11818t[i] >>> 32);
    }

    /* renamed from: L */
    public final void mo30149L(int i, int i2) {
        long[] jArr = this.f11818t;
        jArr[i] = (jArr[i] & 4294967295L) | (((long) i2) << 32);
    }

    /* renamed from: M */
    public final void mo30150M(int i, int i2) {
        if (i == -2) {
            this.f11819u = i2;
        } else {
            mo30151N(i, i2);
        }
        if (i2 == -2) {
            this.f11820v = i;
        } else {
            mo30149L(i2, i);
        }
    }

    /* renamed from: N */
    public final void mo30151N(int i, int i2) {
        long[] jArr = this.f11818t;
        jArr[i] = (jArr[i] & -4294967296L) | (((long) i2) & 4294967295L);
    }

    public void clear() {
        if (!mo30067y()) {
            this.f11819u = -2;
            this.f11820v = -2;
            Arrays.fill(this.f11818t, 0, size(), -1);
            super.clear();
        }
    }

    /* renamed from: d */
    public void mo30044d(int i) {
        if (this.f11821w) {
            mo30150M(mo30148K(i), mo30057q(i));
            mo30150M(this.f11820v, i);
            mo30150M(i, -2);
            this.f11760o++;
        }
    }

    /* renamed from: e */
    public int mo30045e(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    /* renamed from: f */
    public void mo30047f() {
        super.mo30047f();
        long[] jArr = new long[this.f11758m.length];
        this.f11818t = jArr;
        Arrays.fill(jArr, -1);
    }

    /* renamed from: n */
    public int mo30055n() {
        return this.f11819u;
    }

    /* renamed from: q */
    public int mo30057q(int i) {
        return (int) this.f11818t[i];
    }

    /* renamed from: t */
    public void mo30062t(int i) {
        super.mo30062t(i);
        this.f11819u = -2;
        this.f11820v = -2;
    }

    /* renamed from: u */
    public void mo30063u(int i, K k, V v, int i2) {
        super.mo30063u(i, k, v, i2);
        mo30150M(this.f11820v, i);
        mo30150M(i, -2);
    }

    /* renamed from: x */
    public void mo30066x(int i) {
        int size = size() - 1;
        super.mo30066x(i);
        mo30150M(mo30148K(i), mo30057q(i));
        if (i < size) {
            mo30150M(mo30148K(size), i);
            mo30150M(i, mo30057q(size));
        }
        this.f11818t[size] = -1;
    }

    public C6203z(int i) {
        this(i, false);
    }

    public C6203z(int i, boolean z) {
        super(i);
        this.f11821w = z;
    }
}
