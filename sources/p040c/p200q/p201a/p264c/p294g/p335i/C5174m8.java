package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.i.m8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5174m8 extends C5062f7 implements RandomAccess, C5354y8, C5001ba {

    /* renamed from: n */
    public static final C5174m8 f9998n;

    /* renamed from: l */
    public float[] f9999l;

    /* renamed from: m */
    public int f10000m;

    static {
        C5174m8 m8Var = new C5174m8(new float[0], 0);
        f9998n = m8Var;
        m8Var.mo27229a();
    }

    public C5174m8() {
        this(new float[10], 0);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo27231c();
        if (i < 0 || i > (i2 = this.f10000m)) {
            throw new IndexOutOfBoundsException(mo27431g(i));
        }
        float[] fArr = this.f9999l;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f9999l, i, fArr2, i + 1, this.f10000m - i);
            this.f9999l = fArr2;
        }
        this.f9999l[i] = floatValue;
        this.f10000m++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo27231c();
        C5369z8.m15425e(collection);
        if (!(collection instanceof C5174m8)) {
            return super.addAll(collection);
        }
        C5174m8 m8Var = (C5174m8) collection;
        int i = m8Var.f10000m;
        if (i == 0) {
            return false;
        }
        int i2 = this.f10000m;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f9999l;
            if (i3 > fArr.length) {
                this.f9999l = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(m8Var.f9999l, 0, this.f9999l, this.f10000m, m8Var.f10000m);
            this.f10000m = i3;
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
        if (!(obj instanceof C5174m8)) {
            return super.equals(obj);
        }
        C5174m8 m8Var = (C5174m8) obj;
        if (this.f10000m != m8Var.f10000m) {
            return false;
        }
        float[] fArr = m8Var.f9999l;
        for (int i = 0; i < this.f10000m; i++) {
            if (Float.floatToIntBits(this.f9999l[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo27430f(float f) {
        mo27231c();
        int i = this.f10000m;
        float[] fArr = this.f9999l;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f9999l = fArr2;
        }
        float[] fArr3 = this.f9999l;
        int i2 = this.f10000m;
        this.f10000m = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: g */
    public final String mo27431g(int i) {
        int i2 = this.f10000m;
        return "Index:" + i + ", Size:" + i2;
    }

    public final /* synthetic */ Object get(int i) {
        mo27434k(i);
        return Float.valueOf(this.f9999l[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f10000m; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f9999l[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C5354y8 mo27013i(int i) {
        if (i >= this.f10000m) {
            return new C5174m8(Arrays.copyOf(this.f9999l, i), this.f10000m);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f10000m;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f9999l[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo27434k(int i) {
        if (i < 0 || i >= this.f10000m) {
            throw new IndexOutOfBoundsException(mo27431g(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo27231c();
        mo27434k(i);
        float[] fArr = this.f9999l;
        float f = fArr[i];
        int i2 = this.f10000m;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f10000m--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i, int i2) {
        mo27231c();
        if (i2 >= i) {
            float[] fArr = this.f9999l;
            System.arraycopy(fArr, i2, fArr, i, this.f10000m - i2);
            this.f10000m -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo27231c();
        mo27434k(i);
        float[] fArr = this.f9999l;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f10000m;
    }

    public C5174m8(float[] fArr, int i) {
        this.f9999l = fArr;
        this.f10000m = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo27430f(((Float) obj).floatValue());
        return true;
    }
}
