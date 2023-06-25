package p040c.p200q.p353b.p355b;

import java.util.Arrays;

/* renamed from: c.q.b.b.y1 */
/* compiled from: ObjectCountLinkedHashMap */
public class C6201y1<K> extends C6184x1<K> {

    /* renamed from: i */
    public transient long[] f11815i;

    /* renamed from: j */
    public transient int f11816j;

    /* renamed from: k */
    public transient int f11817k;

    public C6201y1(int i) {
        this(i, 1.0f);
    }

    /* renamed from: E */
    public final int mo30143E(int i) {
        return (int) (this.f11815i[i] >>> 32);
    }

    /* renamed from: F */
    public final int mo30144F(int i) {
        return (int) this.f11815i[i];
    }

    /* renamed from: G */
    public final void mo30145G(int i, int i2) {
        long[] jArr = this.f11815i;
        jArr[i] = (jArr[i] & 4294967295L) | (((long) i2) << 32);
    }

    /* renamed from: H */
    public final void mo30146H(int i, int i2) {
        if (i == -2) {
            this.f11816j = i2;
        } else {
            mo30147I(i, i2);
        }
        if (i2 == -2) {
            this.f11817k = i;
        } else {
            mo30145G(i2, i);
        }
    }

    /* renamed from: I */
    public final void mo30147I(int i, int i2) {
        long[] jArr = this.f11815i;
        jArr[i] = (jArr[i] & -4294967296L) | (((long) i2) & 4294967295L);
    }

    /* renamed from: a */
    public void mo30105a() {
        super.mo30105a();
        this.f11816j = -2;
        this.f11817k = -2;
    }

    /* renamed from: e */
    public int mo30107e() {
        int i = this.f11816j;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    /* renamed from: n */
    public void mo30114n(int i, float f) {
        super.mo30114n(i, f);
        this.f11816j = -2;
        this.f11817k = -2;
        long[] jArr = new long[i];
        this.f11815i = jArr;
        Arrays.fill(jArr, -1);
    }

    /* renamed from: o */
    public void mo30115o(int i, K k, int i2, int i3) {
        super.mo30115o(i, k, i2, i3);
        mo30146H(this.f11817k, i);
        mo30146H(i, -2);
    }

    /* renamed from: p */
    public void mo30116p(int i) {
        int C = mo30104C() - 1;
        mo30146H(mo30143E(i), mo30144F(i));
        if (i < C) {
            mo30146H(mo30143E(C), i);
            mo30146H(i, mo30144F(C));
        }
        super.mo30116p(i);
    }

    /* renamed from: s */
    public int mo30117s(int i) {
        int F = mo30144F(i);
        if (F == -2) {
            return -1;
        }
        return F;
    }

    /* renamed from: t */
    public int mo30118t(int i, int i2) {
        return i == mo30104C() ? i2 : i;
    }

    /* renamed from: y */
    public void mo30123y(int i) {
        super.mo30123y(i);
        long[] jArr = this.f11815i;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        this.f11815i = copyOf;
        Arrays.fill(copyOf, length, i, -1);
    }

    public C6201y1(int i, float f) {
        super(i, f);
    }
}
