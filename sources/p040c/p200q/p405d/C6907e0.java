package p040c.p200q.p405d;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p040c.p200q.p405d.C6999y;

/* renamed from: c.q.d.e0 */
/* compiled from: LongArrayList */
public final class C6907e0 extends C6891c<Long> implements C6999y.C7007h, RandomAccess, C6998x0 {

    /* renamed from: n */
    public static final C6907e0 f13214n;

    /* renamed from: l */
    public long[] f13215l;

    /* renamed from: m */
    public int f13216m;

    static {
        C6907e0 e0Var = new C6907e0(new long[0], 0);
        f13214n = e0Var;
        e0Var.mo31828m();
    }

    public C6907e0() {
        this(new long[10], 0);
    }

    public boolean addAll(Collection<? extends Long> collection) {
        mo31825c();
        C6999y.m20707a(collection);
        if (!(collection instanceof C6907e0)) {
            return super.addAll(collection);
        }
        C6907e0 e0Var = (C6907e0) collection;
        int i = e0Var.f13216m;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13216m;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f13215l;
            if (i3 > jArr.length) {
                this.f13215l = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(e0Var.f13215l, 0, this.f13215l, this.f13216m, e0Var.f13216m);
            this.f13216m = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6907e0)) {
            return super.equals(obj);
        }
        C6907e0 e0Var = (C6907e0) obj;
        if (this.f13216m != e0Var.f13216m) {
            return false;
        }
        long[] jArr = e0Var.f13215l;
        for (int i = 0; i < this.f13216m; i++) {
            if (this.f13215l[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public void add(int i, Long l) {
        mo31896k(i, l.longValue());
    }

    /* renamed from: g */
    public boolean add(Long l) {
        mo31897l(l.longValue());
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13216m; i2++) {
            i = (i * 31) + C6999y.m20712f(this.f13215l[i2]);
        }
        return i;
    }

    /* renamed from: k */
    public final void mo31896k(int i, long j) {
        int i2;
        mo31825c();
        if (i < 0 || i > (i2 = this.f13216m)) {
            throw new IndexOutOfBoundsException(mo31905t(i));
        }
        long[] jArr = this.f13215l;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f13215l, i, jArr2, i + 1, this.f13216m - i);
            this.f13215l = jArr2;
        }
        this.f13215l[i] = j;
        this.f13216m++;
        this.modCount++;
    }

    /* renamed from: l */
    public void mo31897l(long j) {
        mo31825c();
        int i = this.f13216m;
        long[] jArr = this.f13215l;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f13215l = jArr2;
        }
        long[] jArr3 = this.f13215l;
        int i2 = this.f13216m;
        this.f13216m = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: o */
    public final void mo31898o(int i) {
        if (i < 0 || i >= this.f13216m) {
            throw new IndexOutOfBoundsException(mo31905t(i));
        }
    }

    /* renamed from: p */
    public Long get(int i) {
        return Long.valueOf(mo31902s(i));
    }

    public void removeRange(int i, int i2) {
        mo31825c();
        if (i2 >= i) {
            long[] jArr = this.f13215l;
            System.arraycopy(jArr, i2, jArr, i, this.f13216m - i2);
            this.f13216m -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public long mo31902s(int i) {
        mo31898o(i);
        return this.f13215l[i];
    }

    public int size() {
        return this.f13216m;
    }

    /* renamed from: t */
    public final String mo31905t(int i) {
        return "Index:" + i + ", Size:" + this.f13216m;
    }

    /* renamed from: u */
    public C6999y.C7007h mo31773q(int i) {
        if (i >= this.f13216m) {
            return new C6907e0(Arrays.copyOf(this.f13215l, i), this.f13216m);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: v */
    public Long remove(int i) {
        mo31825c();
        mo31898o(i);
        long[] jArr = this.f13215l;
        long j = jArr[i];
        int i2 = this.f13216m;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f13216m--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* renamed from: x */
    public Long set(int i, Long l) {
        return Long.valueOf(mo31909y(i, l.longValue()));
    }

    /* renamed from: y */
    public long mo31909y(int i, long j) {
        mo31825c();
        mo31898o(i);
        long[] jArr = this.f13215l;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    public C6907e0(long[] jArr, int i) {
        this.f13215l = jArr;
        this.f13216m = i;
    }

    public boolean remove(Object obj) {
        mo31825c();
        for (int i = 0; i < this.f13216m; i++) {
            if (obj.equals(Long.valueOf(this.f13215l[i]))) {
                long[] jArr = this.f13215l;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f13216m - i) - 1);
                this.f13216m--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
