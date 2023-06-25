package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.g.a2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4275a2 extends C4808u implements RandomAccess, C4679p1, C4759s2 {

    /* renamed from: n */
    public static final C4275a2 f9110n;

    /* renamed from: l */
    public long[] f9111l;

    /* renamed from: m */
    public int f9112m;

    static {
        C4275a2 a2Var = new C4275a2(new long[0], 0);
        f9110n = a2Var;
        a2Var.mo26496a();
    }

    public C4275a2() {
        this(new long[10], 0);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo26681c();
        if (i < 0 || i > (i2 = this.f9112m)) {
            throw new IndexOutOfBoundsException(mo25773k(i));
        }
        long[] jArr = this.f9111l;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f9111l, i, jArr2, i + 1, this.f9112m - i);
            this.f9111l = jArr2;
        }
        this.f9111l[i] = longValue;
        this.f9112m++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo26681c();
        C4706q1.m12868e(collection);
        if (!(collection instanceof C4275a2)) {
            return super.addAll(collection);
        }
        C4275a2 a2Var = (C4275a2) collection;
        int i = a2Var.f9112m;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9112m;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f9111l;
            if (i3 > jArr.length) {
                this.f9111l = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(a2Var.f9111l, 0, this.f9111l, this.f9112m, a2Var.f9112m);
            this.f9112m = i3;
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
        if (!(obj instanceof C4275a2)) {
            return super.equals(obj);
        }
        C4275a2 a2Var = (C4275a2) obj;
        if (this.f9112m != a2Var.f9112m) {
            return false;
        }
        long[] jArr = a2Var.f9111l;
        for (int i = 0; i < this.f9112m; i++) {
            if (this.f9111l[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final long mo25767f(int i) {
        mo25774l(i);
        return this.f9111l[i];
    }

    /* renamed from: g */
    public final void mo25768g(long j) {
        mo26681c();
        int i = this.f9112m;
        long[] jArr = this.f9111l;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f9111l = jArr2;
        }
        long[] jArr3 = this.f9111l;
        int i2 = this.f9112m;
        this.f9112m = i2 + 1;
        jArr3[i2] = j;
    }

    public final /* synthetic */ Object get(int i) {
        mo25774l(i);
        return Long.valueOf(this.f9111l[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9112m; i2++) {
            i = (i * 31) + C4706q1.m12866c(this.f9111l[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4679p1 mo25771i(int i) {
        if (i >= this.f9112m) {
            return new C4275a2(Arrays.copyOf(this.f9111l, i), this.f9112m);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f9112m;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f9111l[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final String mo25773k(int i) {
        int i2 = this.f9112m;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: l */
    public final void mo25774l(int i) {
        if (i < 0 || i >= this.f9112m) {
            throw new IndexOutOfBoundsException(mo25773k(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo26681c();
        mo25774l(i);
        long[] jArr = this.f9111l;
        long j = jArr[i];
        int i2 = this.f9112m;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f9112m--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        mo26681c();
        if (i2 >= i) {
            long[] jArr = this.f9111l;
            System.arraycopy(jArr, i2, jArr, i, this.f9112m - i2);
            this.f9112m -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo26681c();
        mo25774l(i);
        long[] jArr = this.f9111l;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f9112m;
    }

    public C4275a2(long[] jArr, int i) {
        this.f9111l = jArr;
        this.f9112m = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo25768g(((Long) obj).longValue());
        return true;
    }
}
