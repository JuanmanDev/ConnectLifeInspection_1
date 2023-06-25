package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.i.k9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5144k9 extends C5062f7 implements RandomAccess, C5339x8, C5001ba {

    /* renamed from: n */
    public static final C5144k9 f9977n;

    /* renamed from: l */
    public long[] f9978l;

    /* renamed from: m */
    public int f9979m;

    static {
        C5144k9 k9Var = new C5144k9(new long[0], 0);
        f9977n = k9Var;
        k9Var.mo27229a();
    }

    public C5144k9() {
        this(new long[10], 0);
    }

    /* renamed from: f */
    public static C5144k9 m14406f() {
        return f9977n;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo27231c();
        if (i < 0 || i > (i2 = this.f9979m)) {
            throw new IndexOutOfBoundsException(mo27367k(i));
        }
        long[] jArr = this.f9978l;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f9978l, i, jArr2, i + 1, this.f9979m - i);
            this.f9978l = jArr2;
        }
        this.f9978l[i] = longValue;
        this.f9979m++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo27231c();
        C5369z8.m15425e(collection);
        if (!(collection instanceof C5144k9)) {
            return super.addAll(collection);
        }
        C5144k9 k9Var = (C5144k9) collection;
        int i = k9Var.f9979m;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9979m;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f9978l;
            if (i3 > jArr.length) {
                this.f9978l = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(k9Var.f9978l, 0, this.f9978l, this.f9979m, k9Var.f9979m);
            this.f9979m = i3;
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
        if (!(obj instanceof C5144k9)) {
            return super.equals(obj);
        }
        C5144k9 k9Var = (C5144k9) obj;
        if (this.f9979m != k9Var.f9979m) {
            return false;
        }
        long[] jArr = k9Var.f9978l;
        for (int i = 0; i < this.f9979m; i++) {
            if (this.f9978l[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void mo27363g(long j) {
        mo27231c();
        int i = this.f9979m;
        long[] jArr = this.f9978l;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f9978l = jArr2;
        }
        long[] jArr3 = this.f9978l;
        int i2 = this.f9979m;
        this.f9979m = i2 + 1;
        jArr3[i2] = j;
    }

    public final /* synthetic */ Object get(int i) {
        mo27368l(i);
        return Long.valueOf(this.f9978l[i]);
    }

    /* renamed from: h */
    public final long mo27365h(int i) {
        mo27368l(i);
        return this.f9978l[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9979m; i2++) {
            i = (i * 31) + C5369z8.m15423c(this.f9978l[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f9979m;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f9978l[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final String mo27367k(int i) {
        int i2 = this.f9979m;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: l */
    public final void mo27368l(int i) {
        if (i < 0 || i >= this.f9979m) {
            throw new IndexOutOfBoundsException(mo27367k(i));
        }
    }

    /* renamed from: n */
    public final C5339x8 mo27013i(int i) {
        if (i >= this.f9979m) {
            return new C5144k9(Arrays.copyOf(this.f9978l, i), this.f9979m);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo27231c();
        mo27368l(i);
        long[] jArr = this.f9978l;
        long j = jArr[i];
        int i2 = this.f9979m;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f9979m--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        mo27231c();
        if (i2 >= i) {
            long[] jArr = this.f9978l;
            System.arraycopy(jArr, i2, jArr, i, this.f9979m - i2);
            this.f9979m -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo27231c();
        mo27368l(i);
        long[] jArr = this.f9978l;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f9979m;
    }

    public C5144k9(long[] jArr, int i) {
        this.f9978l = jArr;
        this.f9979m = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo27363g(((Long) obj).longValue());
        return true;
    }
}
