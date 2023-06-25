package p040c.p200q.p405d;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p040c.p200q.p405d.C6999y;

/* renamed from: c.q.d.m */
/* compiled from: DoubleArrayList */
public final class C6953m extends C6891c<Double> implements C6999y.C7001b, RandomAccess, C6998x0 {

    /* renamed from: n */
    public static final C6953m f13318n;

    /* renamed from: l */
    public double[] f13319l;

    /* renamed from: m */
    public int f13320m;

    static {
        C6953m mVar = new C6953m(new double[0], 0);
        f13318n = mVar;
        mVar.mo31828m();
    }

    public C6953m() {
        this(new double[10], 0);
    }

    public boolean addAll(Collection<? extends Double> collection) {
        mo31825c();
        C6999y.m20707a(collection);
        if (!(collection instanceof C6953m)) {
            return super.addAll(collection);
        }
        C6953m mVar = (C6953m) collection;
        int i = mVar.f13320m;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13320m;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f13319l;
            if (i3 > dArr.length) {
                this.f13319l = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(mVar.f13319l, 0, this.f13319l, this.f13320m, mVar.f13320m);
            this.f13320m = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6953m)) {
            return super.equals(obj);
        }
        C6953m mVar = (C6953m) obj;
        if (this.f13320m != mVar.f13320m) {
            return false;
        }
        double[] dArr = mVar.f13319l;
        for (int i = 0; i < this.f13320m; i++) {
            if (Double.doubleToLongBits(this.f13319l[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public void add(int i, Double d) {
        mo32202l(i, d.doubleValue());
    }

    /* renamed from: g */
    public boolean add(Double d) {
        mo32201k(d.doubleValue());
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13320m; i2++) {
            i = (i * 31) + C6999y.m20712f(Double.doubleToLongBits(this.f13319l[i2]));
        }
        return i;
    }

    /* renamed from: k */
    public void mo32201k(double d) {
        mo31825c();
        int i = this.f13320m;
        double[] dArr = this.f13319l;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f13319l = dArr2;
        }
        double[] dArr3 = this.f13319l;
        int i2 = this.f13320m;
        this.f13320m = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: l */
    public final void mo32202l(int i, double d) {
        int i2;
        mo31825c();
        if (i < 0 || i > (i2 = this.f13320m)) {
            throw new IndexOutOfBoundsException(mo32210t(i));
        }
        double[] dArr = this.f13319l;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f13319l, i, dArr2, i + 1, this.f13320m - i);
            this.f13319l = dArr2;
        }
        this.f13319l[i] = d;
        this.f13320m++;
        this.modCount++;
    }

    /* renamed from: o */
    public final void mo32203o(int i) {
        if (i < 0 || i >= this.f13320m) {
            throw new IndexOutOfBoundsException(mo32210t(i));
        }
    }

    /* renamed from: p */
    public Double get(int i) {
        return Double.valueOf(mo32207s(i));
    }

    public void removeRange(int i, int i2) {
        mo31825c();
        if (i2 >= i) {
            double[] dArr = this.f13319l;
            System.arraycopy(dArr, i2, dArr, i, this.f13320m - i2);
            this.f13320m -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public double mo32207s(int i) {
        mo32203o(i);
        return this.f13319l[i];
    }

    public int size() {
        return this.f13320m;
    }

    /* renamed from: t */
    public final String mo32210t(int i) {
        return "Index:" + i + ", Size:" + this.f13320m;
    }

    /* renamed from: u */
    public C6999y.C7001b mo31773q(int i) {
        if (i >= this.f13320m) {
            return new C6953m(Arrays.copyOf(this.f13319l, i), this.f13320m);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: v */
    public Double remove(int i) {
        mo31825c();
        mo32203o(i);
        double[] dArr = this.f13319l;
        double d = dArr[i];
        int i2 = this.f13320m;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f13320m--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* renamed from: x */
    public Double set(int i, Double d) {
        return Double.valueOf(mo32214y(i, d.doubleValue()));
    }

    /* renamed from: y */
    public double mo32214y(int i, double d) {
        mo31825c();
        mo32203o(i);
        double[] dArr = this.f13319l;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    public C6953m(double[] dArr, int i) {
        this.f13319l = dArr;
        this.f13320m = i;
    }

    public boolean remove(Object obj) {
        mo31825c();
        for (int i = 0; i < this.f13320m; i++) {
            if (obj.equals(Double.valueOf(this.f13319l[i]))) {
                double[] dArr = this.f13319l;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f13320m - i) - 1);
                this.f13320m--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
