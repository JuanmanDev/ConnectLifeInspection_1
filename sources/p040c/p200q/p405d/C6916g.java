package p040c.p200q.p405d;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p040c.p200q.p405d.C6999y;

/* renamed from: c.q.d.g */
/* compiled from: BooleanArrayList */
public final class C6916g extends C6891c<Boolean> implements C6999y.C7000a, RandomAccess, C6998x0 {

    /* renamed from: n */
    public static final C6916g f13231n;

    /* renamed from: l */
    public boolean[] f13232l;

    /* renamed from: m */
    public int f13233m;

    static {
        C6916g gVar = new C6916g(new boolean[0], 0);
        f13231n = gVar;
        gVar.mo31828m();
    }

    public C6916g() {
        this(new boolean[10], 0);
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        mo31825c();
        C6999y.m20707a(collection);
        if (!(collection instanceof C6916g)) {
            return super.addAll(collection);
        }
        C6916g gVar = (C6916g) collection;
        int i = gVar.f13233m;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13233m;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f13232l;
            if (i3 > zArr.length) {
                this.f13232l = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(gVar.f13232l, 0, this.f13232l, this.f13233m, gVar.f13233m);
            this.f13233m = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6916g)) {
            return super.equals(obj);
        }
        C6916g gVar = (C6916g) obj;
        if (this.f13233m != gVar.f13233m) {
            return false;
        }
        boolean[] zArr = gVar.f13232l;
        for (int i = 0; i < this.f13233m; i++) {
            if (this.f13232l[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public void add(int i, Boolean bool) {
        mo31940k(i, bool.booleanValue());
    }

    /* renamed from: g */
    public boolean add(Boolean bool) {
        mo31941l(bool.booleanValue());
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13233m; i2++) {
            i = (i * 31) + C6999y.m20709c(this.f13232l[i2]);
        }
        return i;
    }

    /* renamed from: k */
    public final void mo31940k(int i, boolean z) {
        int i2;
        mo31825c();
        if (i < 0 || i > (i2 = this.f13233m)) {
            throw new IndexOutOfBoundsException(mo31949t(i));
        }
        boolean[] zArr = this.f13232l;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f13232l, i, zArr2, i + 1, this.f13233m - i);
            this.f13232l = zArr2;
        }
        this.f13232l[i] = z;
        this.f13233m++;
        this.modCount++;
    }

    /* renamed from: l */
    public void mo31941l(boolean z) {
        mo31825c();
        int i = this.f13233m;
        boolean[] zArr = this.f13232l;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f13232l = zArr2;
        }
        boolean[] zArr3 = this.f13232l;
        int i2 = this.f13233m;
        this.f13233m = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: o */
    public final void mo31942o(int i) {
        if (i < 0 || i >= this.f13233m) {
            throw new IndexOutOfBoundsException(mo31949t(i));
        }
    }

    /* renamed from: p */
    public Boolean get(int i) {
        return Boolean.valueOf(mo31946s(i));
    }

    public void removeRange(int i, int i2) {
        mo31825c();
        if (i2 >= i) {
            boolean[] zArr = this.f13232l;
            System.arraycopy(zArr, i2, zArr, i, this.f13233m - i2);
            this.f13233m -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public boolean mo31946s(int i) {
        mo31942o(i);
        return this.f13232l[i];
    }

    public int size() {
        return this.f13233m;
    }

    /* renamed from: t */
    public final String mo31949t(int i) {
        return "Index:" + i + ", Size:" + this.f13233m;
    }

    /* renamed from: u */
    public C6999y.C7000a mo31773q(int i) {
        if (i >= this.f13233m) {
            return new C6916g(Arrays.copyOf(this.f13232l, i), this.f13233m);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: v */
    public Boolean remove(int i) {
        mo31825c();
        mo31942o(i);
        boolean[] zArr = this.f13232l;
        boolean z = zArr[i];
        int i2 = this.f13233m;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f13233m--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* renamed from: x */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(mo31953y(i, bool.booleanValue()));
    }

    /* renamed from: y */
    public boolean mo31953y(int i, boolean z) {
        mo31825c();
        mo31942o(i);
        boolean[] zArr = this.f13232l;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    public C6916g(boolean[] zArr, int i) {
        this.f13232l = zArr;
        this.f13233m = i;
    }

    public boolean remove(Object obj) {
        mo31825c();
        for (int i = 0; i < this.f13233m; i++) {
            if (obj.equals(Boolean.valueOf(this.f13232l[i]))) {
                boolean[] zArr = this.f13232l;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f13233m - i) - 1);
                this.f13233m--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
