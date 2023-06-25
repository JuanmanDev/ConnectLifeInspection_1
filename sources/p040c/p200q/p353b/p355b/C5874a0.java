package p040c.p200q.p353b.p355b;

import java.util.Arrays;

/* renamed from: c.q.b.b.a0 */
/* compiled from: CompactLinkedHashSet */
public class C5874a0<E> extends C6198y<E> {

    /* renamed from: p */
    public transient int[] f11395p;

    /* renamed from: q */
    public transient int[] f11396q;

    /* renamed from: r */
    public transient int f11397r;

    /* renamed from: s */
    public transient int f11398s;

    public C5874a0() {
    }

    /* renamed from: R */
    public static <E> C5874a0<E> m16624R(int i) {
        return new C5874a0<>(i);
    }

    /* renamed from: A */
    public void mo29011A(int i) {
        super.mo29011A(i);
        this.f11397r = -2;
        this.f11398s = -2;
    }

    /* renamed from: B */
    public void mo29012B(int i, E e, int i2) {
        super.mo29012B(i, e, i2);
        mo29017U(this.f11398s, i);
        mo29017U(i, -2);
    }

    /* renamed from: D */
    public void mo29013D(int i) {
        int size = size() - 1;
        super.mo29013D(i);
        mo29017U(mo29015S(i), mo29025y(i));
        if (i < size) {
            mo29017U(mo29015S(size), i);
            mo29017U(i, mo29025y(size));
        }
        this.f11395p[size] = -1;
        this.f11396q[size] = -1;
    }

    /* renamed from: L */
    public void mo29014L(int i) {
        super.mo29014L(i);
        int[] iArr = this.f11395p;
        int length = iArr.length;
        this.f11395p = Arrays.copyOf(iArr, i);
        this.f11396q = Arrays.copyOf(this.f11396q, i);
        if (length < i) {
            Arrays.fill(this.f11395p, length, i, -1);
            Arrays.fill(this.f11396q, length, i, -1);
        }
    }

    /* renamed from: S */
    public final int mo29015S(int i) {
        return this.f11395p[i];
    }

    /* renamed from: T */
    public final void mo29016T(int i, int i2) {
        this.f11395p[i] = i2;
    }

    /* renamed from: U */
    public final void mo29017U(int i, int i2) {
        if (i == -2) {
            this.f11397r = i2;
        } else {
            mo29018V(i, i2);
        }
        if (i2 == -2) {
            this.f11398s = i;
        } else {
            mo29016T(i2, i);
        }
    }

    /* renamed from: V */
    public final void mo29018V(int i, int i2) {
        this.f11396q[i] = i2;
    }

    public void clear() {
        if (!mo30128E()) {
            this.f11397r = -2;
            this.f11398s = -2;
            Arrays.fill(this.f11395p, 0, size(), -1);
            Arrays.fill(this.f11396q, 0, size(), -1);
            super.clear();
        }
    }

    /* renamed from: l */
    public int mo29020l(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    /* renamed from: o */
    public void mo29021o() {
        super.mo29021o();
        int length = this.f11808m.length;
        int[] iArr = new int[length];
        this.f11395p = iArr;
        this.f11396q = new int[length];
        Arrays.fill(iArr, -1);
        Arrays.fill(this.f11396q, -1);
    }

    /* renamed from: t */
    public int mo29022t() {
        return this.f11397r;
    }

    public Object[] toArray() {
        return C6172w1.m17295f(this);
    }

    /* renamed from: y */
    public int mo29025y(int i) {
        return this.f11396q[i];
    }

    public C5874a0(int i) {
        super(i);
    }

    public <T> T[] toArray(T[] tArr) {
        return C6172w1.m17296g(this, tArr);
    }
}
