package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.g.y */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4912y extends C4808u implements RandomAccess, C4679p1, C4759s2 {

    /* renamed from: n */
    public static final C4912y f9737n;

    /* renamed from: l */
    public boolean[] f9738l;

    /* renamed from: m */
    public int f9739m;

    static {
        C4912y yVar = new C4912y(new boolean[0], 0);
        f9737n = yVar;
        yVar.mo26496a();
    }

    public C4912y() {
        this(new boolean[10], 0);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo26681c();
        if (i < 0 || i > (i2 = this.f9739m)) {
            throw new IndexOutOfBoundsException(mo26847g(i));
        }
        boolean[] zArr = this.f9738l;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f9738l, i, zArr2, i + 1, this.f9739m - i);
            this.f9738l = zArr2;
        }
        this.f9738l[i] = booleanValue;
        this.f9739m++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo26681c();
        C4706q1.m12868e(collection);
        if (!(collection instanceof C4912y)) {
            return super.addAll(collection);
        }
        C4912y yVar = (C4912y) collection;
        int i = yVar.f9739m;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9739m;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f9738l;
            if (i3 > zArr.length) {
                this.f9738l = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(yVar.f9738l, 0, this.f9738l, this.f9739m, yVar.f9739m);
            this.f9739m = i3;
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
        if (!(obj instanceof C4912y)) {
            return super.equals(obj);
        }
        C4912y yVar = (C4912y) obj;
        if (this.f9739m != yVar.f9739m) {
            return false;
        }
        boolean[] zArr = yVar.f9738l;
        for (int i = 0; i < this.f9739m; i++) {
            if (this.f9738l[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo26846f(boolean z) {
        mo26681c();
        int i = this.f9739m;
        boolean[] zArr = this.f9738l;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f9738l = zArr2;
        }
        boolean[] zArr3 = this.f9738l;
        int i2 = this.f9739m;
        this.f9739m = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: g */
    public final String mo26847g(int i) {
        int i2 = this.f9739m;
        return "Index:" + i + ", Size:" + i2;
    }

    public final /* synthetic */ Object get(int i) {
        mo26850k(i);
        return Boolean.valueOf(this.f9738l[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9739m; i2++) {
            i = (i * 31) + C4706q1.m12864a(this.f9738l[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4679p1 mo25771i(int i) {
        if (i >= this.f9739m) {
            return new C4912y(Arrays.copyOf(this.f9738l, i), this.f9739m);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f9739m;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f9738l[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo26850k(int i) {
        if (i < 0 || i >= this.f9739m) {
            throw new IndexOutOfBoundsException(mo26847g(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo26681c();
        mo26850k(i);
        boolean[] zArr = this.f9738l;
        boolean z = zArr[i];
        int i2 = this.f9739m;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f9739m--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i, int i2) {
        mo26681c();
        if (i2 >= i) {
            boolean[] zArr = this.f9738l;
            System.arraycopy(zArr, i2, zArr, i, this.f9739m - i2);
            this.f9739m -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo26681c();
        mo26850k(i);
        boolean[] zArr = this.f9738l;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f9739m;
    }

    public C4912y(boolean[] zArr, int i) {
        this.f9738l = zArr;
        this.f9739m = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo26846f(((Boolean) obj).booleanValue());
        return true;
    }
}
