package p040c.p200q.p405d;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p040c.p200q.p405d.C6999y;

/* renamed from: c.q.d.v */
/* compiled from: FloatArrayList */
public final class C6993v extends C6891c<Float> implements C6999y.C7005f, RandomAccess, C6998x0 {

    /* renamed from: n */
    public static final C6993v f13385n;

    /* renamed from: l */
    public float[] f13386l;

    /* renamed from: m */
    public int f13387m;

    static {
        C6993v vVar = new C6993v(new float[0], 0);
        f13385n = vVar;
        vVar.mo31828m();
    }

    public C6993v() {
        this(new float[10], 0);
    }

    public boolean addAll(Collection<? extends Float> collection) {
        mo31825c();
        C6999y.m20707a(collection);
        if (!(collection instanceof C6993v)) {
            return super.addAll(collection);
        }
        C6993v vVar = (C6993v) collection;
        int i = vVar.f13387m;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13387m;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f13386l;
            if (i3 > fArr.length) {
                this.f13386l = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(vVar.f13386l, 0, this.f13386l, this.f13387m, vVar.f13387m);
            this.f13387m = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6993v)) {
            return super.equals(obj);
        }
        C6993v vVar = (C6993v) obj;
        if (this.f13387m != vVar.f13387m) {
            return false;
        }
        float[] fArr = vVar.f13386l;
        for (int i = 0; i < this.f13387m; i++) {
            if (Float.floatToIntBits(this.f13386l[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public void add(int i, Float f) {
        mo32393l(i, f.floatValue());
    }

    /* renamed from: g */
    public boolean add(Float f) {
        mo32392k(f.floatValue());
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13387m; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f13386l[i2]);
        }
        return i;
    }

    /* renamed from: k */
    public void mo32392k(float f) {
        mo31825c();
        int i = this.f13387m;
        float[] fArr = this.f13386l;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f13386l = fArr2;
        }
        float[] fArr3 = this.f13386l;
        int i2 = this.f13387m;
        this.f13387m = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: l */
    public final void mo32393l(int i, float f) {
        int i2;
        mo31825c();
        if (i < 0 || i > (i2 = this.f13387m)) {
            throw new IndexOutOfBoundsException(mo32401t(i));
        }
        float[] fArr = this.f13386l;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f13386l, i, fArr2, i + 1, this.f13387m - i);
            this.f13386l = fArr2;
        }
        this.f13386l[i] = f;
        this.f13387m++;
        this.modCount++;
    }

    /* renamed from: o */
    public final void mo32394o(int i) {
        if (i < 0 || i >= this.f13387m) {
            throw new IndexOutOfBoundsException(mo32401t(i));
        }
    }

    /* renamed from: p */
    public Float get(int i) {
        return Float.valueOf(mo32398s(i));
    }

    public void removeRange(int i, int i2) {
        mo31825c();
        if (i2 >= i) {
            float[] fArr = this.f13386l;
            System.arraycopy(fArr, i2, fArr, i, this.f13387m - i2);
            this.f13387m -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public float mo32398s(int i) {
        mo32394o(i);
        return this.f13386l[i];
    }

    public int size() {
        return this.f13387m;
    }

    /* renamed from: t */
    public final String mo32401t(int i) {
        return "Index:" + i + ", Size:" + this.f13387m;
    }

    /* renamed from: u */
    public C6999y.C7005f mo31773q(int i) {
        if (i >= this.f13387m) {
            return new C6993v(Arrays.copyOf(this.f13386l, i), this.f13387m);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: v */
    public Float remove(int i) {
        mo31825c();
        mo32394o(i);
        float[] fArr = this.f13386l;
        float f = fArr[i];
        int i2 = this.f13387m;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f13387m--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* renamed from: x */
    public Float set(int i, Float f) {
        return Float.valueOf(mo32405y(i, f.floatValue()));
    }

    /* renamed from: y */
    public float mo32405y(int i, float f) {
        mo31825c();
        mo32394o(i);
        float[] fArr = this.f13386l;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    public C6993v(float[] fArr, int i) {
        this.f13386l = fArr;
        this.f13387m = i;
    }

    public boolean remove(Object obj) {
        mo31825c();
        for (int i = 0; i < this.f13387m; i++) {
            if (obj.equals(Float.valueOf(this.f13386l[i]))) {
                float[] fArr = this.f13386l;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f13387m - i) - 1);
                this.f13387m--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
