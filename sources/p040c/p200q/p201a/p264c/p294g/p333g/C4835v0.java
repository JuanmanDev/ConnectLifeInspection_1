package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.g.v0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4835v0 extends C4808u implements RandomAccess, C4679p1, C4759s2 {

    /* renamed from: n */
    public static final C4835v0 f9691n;

    /* renamed from: l */
    public double[] f9692l;

    /* renamed from: m */
    public int f9693m;

    static {
        C4835v0 v0Var = new C4835v0(new double[0], 0);
        f9691n = v0Var;
        v0Var.mo26496a();
    }

    public C4835v0() {
        this(new double[10], 0);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo26681c();
        if (i < 0 || i > (i2 = this.f9693m)) {
            throw new IndexOutOfBoundsException(mo26754g(i));
        }
        double[] dArr = this.f9692l;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f9692l, i, dArr2, i + 1, this.f9693m - i);
            this.f9692l = dArr2;
        }
        this.f9692l[i] = doubleValue;
        this.f9693m++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo26681c();
        C4706q1.m12868e(collection);
        if (!(collection instanceof C4835v0)) {
            return super.addAll(collection);
        }
        C4835v0 v0Var = (C4835v0) collection;
        int i = v0Var.f9693m;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9693m;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f9692l;
            if (i3 > dArr.length) {
                this.f9692l = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(v0Var.f9692l, 0, this.f9692l, this.f9693m, v0Var.f9693m);
            this.f9693m = i3;
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
        if (!(obj instanceof C4835v0)) {
            return super.equals(obj);
        }
        C4835v0 v0Var = (C4835v0) obj;
        if (this.f9693m != v0Var.f9693m) {
            return false;
        }
        double[] dArr = v0Var.f9692l;
        for (int i = 0; i < this.f9693m; i++) {
            if (Double.doubleToLongBits(this.f9692l[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo26753f(double d) {
        mo26681c();
        int i = this.f9693m;
        double[] dArr = this.f9692l;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f9692l = dArr2;
        }
        double[] dArr3 = this.f9692l;
        int i2 = this.f9693m;
        this.f9693m = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: g */
    public final String mo26754g(int i) {
        int i2 = this.f9693m;
        return "Index:" + i + ", Size:" + i2;
    }

    public final /* synthetic */ Object get(int i) {
        mo26757k(i);
        return Double.valueOf(this.f9692l[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9693m; i2++) {
            i = (i * 31) + C4706q1.m12866c(Double.doubleToLongBits(this.f9692l[i2]));
        }
        return i;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4679p1 mo25771i(int i) {
        if (i >= this.f9693m) {
            return new C4835v0(Arrays.copyOf(this.f9692l, i), this.f9693m);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f9693m;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f9692l[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo26757k(int i) {
        if (i < 0 || i >= this.f9693m) {
            throw new IndexOutOfBoundsException(mo26754g(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo26681c();
        mo26757k(i);
        double[] dArr = this.f9692l;
        double d = dArr[i];
        int i2 = this.f9693m;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f9693m--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i, int i2) {
        mo26681c();
        if (i2 >= i) {
            double[] dArr = this.f9692l;
            System.arraycopy(dArr, i2, dArr, i, this.f9693m - i2);
            this.f9693m -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo26681c();
        mo26757k(i);
        double[] dArr = this.f9692l;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f9693m;
    }

    public C4835v0(double[] dArr, int i) {
        this.f9692l = dArr;
        this.f9693m = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo26753f(((Double) obj).doubleValue());
        return true;
    }
}
