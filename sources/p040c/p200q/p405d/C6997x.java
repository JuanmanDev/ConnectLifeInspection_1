package p040c.p200q.p405d;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p040c.p200q.p405d.C6999y;

/* renamed from: c.q.d.x */
/* compiled from: IntArrayList */
public final class C6997x extends C6891c<Integer> implements C6999y.C7006g, RandomAccess, C6998x0 {

    /* renamed from: n */
    public static final C6997x f13389n;

    /* renamed from: l */
    public int[] f13390l;

    /* renamed from: m */
    public int f13391m;

    static {
        C6997x xVar = new C6997x(new int[0], 0);
        f13389n = xVar;
        xVar.mo31828m();
    }

    public C6997x() {
        this(new int[10], 0);
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        mo31825c();
        C6999y.m20707a(collection);
        if (!(collection instanceof C6997x)) {
            return super.addAll(collection);
        }
        C6997x xVar = (C6997x) collection;
        int i = xVar.f13391m;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13391m;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f13390l;
            if (i3 > iArr.length) {
                this.f13390l = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(xVar.f13390l, 0, this.f13390l, this.f13391m, xVar.f13391m);
            this.f13391m = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6997x)) {
            return super.equals(obj);
        }
        C6997x xVar = (C6997x) obj;
        if (this.f13391m != xVar.f13391m) {
            return false;
        }
        int[] iArr = xVar.f13390l;
        for (int i = 0; i < this.f13391m; i++) {
            if (this.f13390l[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public void add(int i, Integer num) {
        mo32414l(i, num.intValue());
    }

    /* renamed from: g */
    public boolean add(Integer num) {
        mo32413k(num.intValue());
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13391m; i2++) {
            i = (i * 31) + this.f13390l[i2];
        }
        return i;
    }

    /* renamed from: k */
    public void mo32413k(int i) {
        mo31825c();
        int i2 = this.f13391m;
        int[] iArr = this.f13390l;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f13390l = iArr2;
        }
        int[] iArr3 = this.f13390l;
        int i3 = this.f13391m;
        this.f13391m = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: l */
    public final void mo32414l(int i, int i2) {
        int i3;
        mo31825c();
        if (i < 0 || i > (i3 = this.f13391m)) {
            throw new IndexOutOfBoundsException(mo32422t(i));
        }
        int[] iArr = this.f13390l;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f13390l, i, iArr2, i + 1, this.f13391m - i);
            this.f13390l = iArr2;
        }
        this.f13390l[i] = i2;
        this.f13391m++;
        this.modCount++;
    }

    /* renamed from: o */
    public final void mo32415o(int i) {
        if (i < 0 || i >= this.f13391m) {
            throw new IndexOutOfBoundsException(mo32422t(i));
        }
    }

    /* renamed from: p */
    public Integer get(int i) {
        return Integer.valueOf(mo32419s(i));
    }

    public void removeRange(int i, int i2) {
        mo31825c();
        if (i2 >= i) {
            int[] iArr = this.f13390l;
            System.arraycopy(iArr, i2, iArr, i, this.f13391m - i2);
            this.f13391m -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public int mo32419s(int i) {
        mo32415o(i);
        return this.f13390l[i];
    }

    public int size() {
        return this.f13391m;
    }

    /* renamed from: t */
    public final String mo32422t(int i) {
        return "Index:" + i + ", Size:" + this.f13391m;
    }

    /* renamed from: u */
    public C6999y.C7006g mo31773q(int i) {
        if (i >= this.f13391m) {
            return new C6997x(Arrays.copyOf(this.f13390l, i), this.f13391m);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: v */
    public Integer remove(int i) {
        mo31825c();
        mo32415o(i);
        int[] iArr = this.f13390l;
        int i2 = iArr[i];
        int i3 = this.f13391m;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f13391m--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* renamed from: x */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(mo32426y(i, num.intValue()));
    }

    /* renamed from: y */
    public int mo32426y(int i, int i2) {
        mo31825c();
        mo32415o(i);
        int[] iArr = this.f13390l;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public C6997x(int[] iArr, int i) {
        this.f13390l = iArr;
        this.f13391m = i;
    }

    public boolean remove(Object obj) {
        mo31825c();
        for (int i = 0; i < this.f13391m; i++) {
            if (obj.equals(Integer.valueOf(this.f13390l[i]))) {
                int[] iArr = this.f13390l;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f13391m - i) - 1);
                this.f13391m--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
