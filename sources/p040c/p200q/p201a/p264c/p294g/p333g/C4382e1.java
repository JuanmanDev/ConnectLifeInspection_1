package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.g.e1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4382e1 extends C4808u implements RandomAccess, C4679p1, C4759s2 {

    /* renamed from: n */
    public static final C4382e1 f9183n;

    /* renamed from: l */
    public float[] f9184l;

    /* renamed from: m */
    public int f9185m;

    static {
        C4382e1 e1Var = new C4382e1(new float[0], 0);
        f9183n = e1Var;
        e1Var.mo26496a();
    }

    public C4382e1() {
        this(new float[10], 0);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo26681c();
        if (i < 0 || i > (i2 = this.f9185m)) {
            throw new IndexOutOfBoundsException(mo25924g(i));
        }
        float[] fArr = this.f9184l;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f9184l, i, fArr2, i + 1, this.f9185m - i);
            this.f9184l = fArr2;
        }
        this.f9184l[i] = floatValue;
        this.f9185m++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo26681c();
        C4706q1.m12868e(collection);
        if (!(collection instanceof C4382e1)) {
            return super.addAll(collection);
        }
        C4382e1 e1Var = (C4382e1) collection;
        int i = e1Var.f9185m;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9185m;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f9184l;
            if (i3 > fArr.length) {
                this.f9184l = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(e1Var.f9184l, 0, this.f9184l, this.f9185m, e1Var.f9185m);
            this.f9185m = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4382e1)) {
            return super.equals(obj);
        }
        C4382e1 e1Var = (C4382e1) obj;
        if (this.f9185m != e1Var.f9185m) {
            return false;
        }
        float[] fArr = e1Var.f9184l;
        for (int i = 0; i < this.f9185m; i++) {
            if (Float.floatToIntBits(this.f9184l[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo25923f(float f) {
        mo26681c();
        int i = this.f9185m;
        float[] fArr = this.f9184l;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f9184l = fArr2;
        }
        float[] fArr3 = this.f9184l;
        int i2 = this.f9185m;
        this.f9185m = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: g */
    public final String mo25924g(int i) {
        int i2 = this.f9185m;
        return "Index:" + i + ", Size:" + i2;
    }

    public final /* synthetic */ Object get(int i) {
        mo25927k(i);
        return Float.valueOf(this.f9184l[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9185m; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f9184l[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4679p1 mo25771i(int i) {
        if (i >= this.f9185m) {
            return new C4382e1(Arrays.copyOf(this.f9184l, i), this.f9185m);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f9185m;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f9184l[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo25927k(int i) {
        if (i < 0 || i >= this.f9185m) {
            throw new IndexOutOfBoundsException(mo25924g(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo26681c();
        mo25927k(i);
        float[] fArr = this.f9184l;
        float f = fArr[i];
        int i2 = this.f9185m;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f9185m--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i, int i2) {
        mo26681c();
        if (i2 >= i) {
            float[] fArr = this.f9184l;
            System.arraycopy(fArr, i2, fArr, i, this.f9185m - i2);
            this.f9185m -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo26681c();
        mo25927k(i);
        float[] fArr = this.f9184l;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f9185m;
    }

    public C4382e1(float[] fArr, int i) {
        this.f9184l = fArr;
        this.f9185m = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo25923f(((Float) obj).floatValue());
        return true;
    }
}
