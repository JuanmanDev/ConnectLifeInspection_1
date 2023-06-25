package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.i.u8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5294u8 extends C5062f7 implements RandomAccess, C5324w8, C5001ba {

    /* renamed from: n */
    public static final C5294u8 f10170n;

    /* renamed from: l */
    public int[] f10171l;

    /* renamed from: m */
    public int f10172m;

    static {
        C5294u8 u8Var = new C5294u8(new int[0], 0);
        f10170n = u8Var;
        u8Var.mo27229a();
    }

    public C5294u8() {
        this(new int[10], 0);
    }

    /* renamed from: g */
    public static C5294u8 m15026g() {
        return f10170n;
    }

    /* renamed from: J */
    public final C5324w8 mo27013i(int i) {
        if (i >= this.f10172m) {
            return new C5294u8(Arrays.copyOf(this.f10171l, i), this.f10172m);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo27231c();
        if (i < 0 || i > (i2 = this.f10172m)) {
            throw new IndexOutOfBoundsException(mo27781l(i));
        }
        int[] iArr = this.f10171l;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f10171l, i, iArr2, i + 1, this.f10172m - i);
            this.f10171l = iArr2;
        }
        this.f10171l[i] = intValue;
        this.f10172m++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo27231c();
        C5369z8.m15425e(collection);
        if (!(collection instanceof C5294u8)) {
            return super.addAll(collection);
        }
        C5294u8 u8Var = (C5294u8) collection;
        int i = u8Var.f10172m;
        if (i == 0) {
            return false;
        }
        int i2 = this.f10172m;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f10171l;
            if (i3 > iArr.length) {
                this.f10171l = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(u8Var.f10171l, 0, this.f10171l, this.f10172m, u8Var.f10172m);
            this.f10172m = i3;
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
        if (!(obj instanceof C5294u8)) {
            return super.equals(obj);
        }
        C5294u8 u8Var = (C5294u8) obj;
        if (this.f10172m != u8Var.f10172m) {
            return false;
        }
        int[] iArr = u8Var.f10171l;
        for (int i = 0; i < this.f10172m; i++) {
            if (this.f10171l[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo27777f(int i) {
        mo27782o(i);
        return this.f10171l[i];
    }

    public final /* synthetic */ Object get(int i) {
        mo27782o(i);
        return Integer.valueOf(this.f10171l[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f10172m; i2++) {
            i = (i * 31) + this.f10171l[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f10172m;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f10171l[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo27780k(int i) {
        mo27231c();
        int i2 = this.f10172m;
        int[] iArr = this.f10171l;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f10171l = iArr2;
        }
        int[] iArr3 = this.f10171l;
        int i3 = this.f10172m;
        this.f10172m = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: l */
    public final String mo27781l(int i) {
        int i2 = this.f10172m;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: o */
    public final void mo27782o(int i) {
        if (i < 0 || i >= this.f10172m) {
            throw new IndexOutOfBoundsException(mo27781l(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo27231c();
        mo27782o(i);
        int[] iArr = this.f10171l;
        int i2 = iArr[i];
        int i3 = this.f10172m;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f10172m--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        mo27231c();
        if (i2 >= i) {
            int[] iArr = this.f10171l;
            System.arraycopy(iArr, i2, iArr, i, this.f10172m - i2);
            this.f10172m -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo27231c();
        mo27782o(i);
        int[] iArr = this.f10171l;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f10172m;
    }

    public C5294u8(int[] iArr, int i) {
        this.f10171l = iArr;
        this.f10172m = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo27780k(((Integer) obj).intValue());
        return true;
    }
}
