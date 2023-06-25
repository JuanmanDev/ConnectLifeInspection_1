package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.g.l1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4571l1 extends C4808u implements RandomAccess, C4679p1, C4759s2 {

    /* renamed from: n */
    public static final C4571l1 f9368n;

    /* renamed from: l */
    public int[] f9369l;

    /* renamed from: m */
    public int f9370m;

    static {
        C4571l1 l1Var = new C4571l1(new int[0], 0);
        f9368n = l1Var;
        l1Var.mo26496a();
    }

    public C4571l1() {
        this(new int[10], 0);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo26681c();
        if (i < 0 || i > (i2 = this.f9370m)) {
            throw new IndexOutOfBoundsException(mo26226k(i));
        }
        int[] iArr = this.f9369l;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f9369l, i, iArr2, i + 1, this.f9370m - i);
            this.f9369l = iArr2;
        }
        this.f9369l[i] = intValue;
        this.f9370m++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo26681c();
        C4706q1.m12868e(collection);
        if (!(collection instanceof C4571l1)) {
            return super.addAll(collection);
        }
        C4571l1 l1Var = (C4571l1) collection;
        int i = l1Var.f9370m;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9370m;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f9369l;
            if (i3 > iArr.length) {
                this.f9369l = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(l1Var.f9369l, 0, this.f9369l, this.f9370m, l1Var.f9370m);
            this.f9370m = i3;
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
        if (!(obj instanceof C4571l1)) {
            return super.equals(obj);
        }
        C4571l1 l1Var = (C4571l1) obj;
        if (this.f9370m != l1Var.f9370m) {
            return false;
        }
        int[] iArr = l1Var.f9369l;
        for (int i = 0; i < this.f9370m; i++) {
            if (this.f9369l[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo26222f(int i) {
        mo26227l(i);
        return this.f9369l[i];
    }

    /* renamed from: g */
    public final void mo26223g(int i) {
        mo26681c();
        int i2 = this.f9370m;
        int[] iArr = this.f9369l;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f9369l = iArr2;
        }
        int[] iArr3 = this.f9369l;
        int i3 = this.f9370m;
        this.f9370m = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* synthetic */ Object get(int i) {
        mo26227l(i);
        return Integer.valueOf(this.f9369l[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9370m; i2++) {
            i = (i * 31) + this.f9369l[i2];
        }
        return i;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4679p1 mo25771i(int i) {
        if (i >= this.f9370m) {
            return new C4571l1(Arrays.copyOf(this.f9369l, i), this.f9370m);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f9370m;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f9369l[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final String mo26226k(int i) {
        int i2 = this.f9370m;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: l */
    public final void mo26227l(int i) {
        if (i < 0 || i >= this.f9370m) {
            throw new IndexOutOfBoundsException(mo26226k(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo26681c();
        mo26227l(i);
        int[] iArr = this.f9369l;
        int i2 = iArr[i];
        int i3 = this.f9370m;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f9370m--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        mo26681c();
        if (i2 >= i) {
            int[] iArr = this.f9369l;
            System.arraycopy(iArr, i2, iArr, i, this.f9370m - i2);
            this.f9370m -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo26681c();
        mo26227l(i);
        int[] iArr = this.f9369l;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f9370m;
    }

    public C4571l1(int[] iArr, int i) {
        this.f9369l = iArr;
        this.f9370m = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo26223g(((Integer) obj).intValue());
        return true;
    }
}
