package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.i.j7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5126j7 extends C5062f7 implements RandomAccess, C5354y8, C5001ba {

    /* renamed from: n */
    public static final C5126j7 f9960n;

    /* renamed from: l */
    public boolean[] f9961l;

    /* renamed from: m */
    public int f9962m;

    static {
        C5126j7 j7Var = new C5126j7(new boolean[0], 0);
        f9960n = j7Var;
        j7Var.mo27229a();
    }

    public C5126j7() {
        this(new boolean[10], 0);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo27231c();
        if (i < 0 || i > (i2 = this.f9962m)) {
            throw new IndexOutOfBoundsException(mo27345g(i));
        }
        boolean[] zArr = this.f9961l;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f9961l, i, zArr2, i + 1, this.f9962m - i);
            this.f9961l = zArr2;
        }
        this.f9961l[i] = booleanValue;
        this.f9962m++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo27231c();
        C5369z8.m15425e(collection);
        if (!(collection instanceof C5126j7)) {
            return super.addAll(collection);
        }
        C5126j7 j7Var = (C5126j7) collection;
        int i = j7Var.f9962m;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9962m;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f9961l;
            if (i3 > zArr.length) {
                this.f9961l = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(j7Var.f9961l, 0, this.f9961l, this.f9962m, j7Var.f9962m);
            this.f9962m = i3;
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
        if (!(obj instanceof C5126j7)) {
            return super.equals(obj);
        }
        C5126j7 j7Var = (C5126j7) obj;
        if (this.f9962m != j7Var.f9962m) {
            return false;
        }
        boolean[] zArr = j7Var.f9961l;
        for (int i = 0; i < this.f9962m; i++) {
            if (this.f9961l[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo27344f(boolean z) {
        mo27231c();
        int i = this.f9962m;
        boolean[] zArr = this.f9961l;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f9961l = zArr2;
        }
        boolean[] zArr3 = this.f9961l;
        int i2 = this.f9962m;
        this.f9962m = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: g */
    public final String mo27345g(int i) {
        int i2 = this.f9962m;
        return "Index:" + i + ", Size:" + i2;
    }

    public final /* synthetic */ Object get(int i) {
        mo27348k(i);
        return Boolean.valueOf(this.f9961l[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9962m; i2++) {
            i = (i * 31) + C5369z8.m15421a(this.f9961l[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C5354y8 mo27013i(int i) {
        if (i >= this.f9962m) {
            return new C5126j7(Arrays.copyOf(this.f9961l, i), this.f9962m);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f9962m;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f9961l[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo27348k(int i) {
        if (i < 0 || i >= this.f9962m) {
            throw new IndexOutOfBoundsException(mo27345g(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo27231c();
        mo27348k(i);
        boolean[] zArr = this.f9961l;
        boolean z = zArr[i];
        int i2 = this.f9962m;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f9962m--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i, int i2) {
        mo27231c();
        if (i2 >= i) {
            boolean[] zArr = this.f9961l;
            System.arraycopy(zArr, i2, zArr, i, this.f9962m - i2);
            this.f9962m -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo27231c();
        mo27348k(i);
        boolean[] zArr = this.f9961l;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f9962m;
    }

    public C5126j7(boolean[] zArr, int i) {
        this.f9961l = zArr;
        this.f9962m = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo27344f(((Boolean) obj).booleanValue());
        return true;
    }
}
