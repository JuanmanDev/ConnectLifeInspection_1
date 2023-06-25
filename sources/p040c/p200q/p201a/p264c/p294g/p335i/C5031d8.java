package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.i.d8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5031d8 extends C5062f7 implements RandomAccess, C5354y8, C5001ba {

    /* renamed from: n */
    public static final C5031d8 f9858n;

    /* renamed from: l */
    public double[] f9859l;

    /* renamed from: m */
    public int f9860m;

    static {
        C5031d8 d8Var = new C5031d8(new double[0], 0);
        f9858n = d8Var;
        d8Var.mo27229a();
    }

    public C5031d8() {
        this(new double[10], 0);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo27231c();
        if (i < 0 || i > (i2 = this.f9860m)) {
            throw new IndexOutOfBoundsException(mo27156g(i));
        }
        double[] dArr = this.f9859l;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f9859l, i, dArr2, i + 1, this.f9860m - i);
            this.f9859l = dArr2;
        }
        this.f9859l[i] = doubleValue;
        this.f9860m++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo27231c();
        C5369z8.m15425e(collection);
        if (!(collection instanceof C5031d8)) {
            return super.addAll(collection);
        }
        C5031d8 d8Var = (C5031d8) collection;
        int i = d8Var.f9860m;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9860m;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f9859l;
            if (i3 > dArr.length) {
                this.f9859l = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(d8Var.f9859l, 0, this.f9859l, this.f9860m, d8Var.f9860m);
            this.f9860m = i3;
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
        if (!(obj instanceof C5031d8)) {
            return super.equals(obj);
        }
        C5031d8 d8Var = (C5031d8) obj;
        if (this.f9860m != d8Var.f9860m) {
            return false;
        }
        double[] dArr = d8Var.f9859l;
        for (int i = 0; i < this.f9860m; i++) {
            if (Double.doubleToLongBits(this.f9859l[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo27155f(double d) {
        mo27231c();
        int i = this.f9860m;
        double[] dArr = this.f9859l;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f9859l = dArr2;
        }
        double[] dArr3 = this.f9859l;
        int i2 = this.f9860m;
        this.f9860m = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: g */
    public final String mo27156g(int i) {
        int i2 = this.f9860m;
        return "Index:" + i + ", Size:" + i2;
    }

    public final /* synthetic */ Object get(int i) {
        mo27160k(i);
        return Double.valueOf(this.f9859l[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9860m; i2++) {
            i = (i * 31) + C5369z8.m15423c(Double.doubleToLongBits(this.f9859l[i2]));
        }
        return i;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C5354y8 mo27013i(int i) {
        if (i >= this.f9860m) {
            return new C5031d8(Arrays.copyOf(this.f9859l, i), this.f9860m);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f9860m;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f9859l[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo27160k(int i) {
        if (i < 0 || i >= this.f9860m) {
            throw new IndexOutOfBoundsException(mo27156g(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo27231c();
        mo27160k(i);
        double[] dArr = this.f9859l;
        double d = dArr[i];
        int i2 = this.f9860m;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f9860m--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i, int i2) {
        mo27231c();
        if (i2 >= i) {
            double[] dArr = this.f9859l;
            System.arraycopy(dArr, i2, dArr, i, this.f9860m - i2);
            this.f9860m -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo27231c();
        mo27160k(i);
        double[] dArr = this.f9859l;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f9860m;
    }

    public C5031d8(double[] dArr, int i) {
        this.f9859l = dArr;
        this.f9860m = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo27155f(((Double) obj).doubleValue());
        return true;
    }
}
