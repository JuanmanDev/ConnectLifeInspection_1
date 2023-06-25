package p040c.p200q.p405d;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: c.q.d.z0 */
/* compiled from: ProtobufArrayList */
public final class C7014z0<E> extends C6891c<E> implements RandomAccess {

    /* renamed from: n */
    public static final C7014z0<Object> f13400n;

    /* renamed from: l */
    public E[] f13401l;

    /* renamed from: m */
    public int f13402m;

    static {
        C7014z0<Object> z0Var = new C7014z0<>(new Object[0], 0);
        f13400n = z0Var;
        z0Var.mo31828m();
    }

    public C7014z0(E[] eArr, int i) {
        this.f13401l = eArr;
        this.f13402m = i;
    }

    /* renamed from: f */
    public static <E> E[] m20730f(int i) {
        return new Object[i];
    }

    /* renamed from: g */
    public static <E> C7014z0<E> m20731g() {
        return f13400n;
    }

    public boolean add(E e) {
        mo31825c();
        int i = this.f13402m;
        E[] eArr = this.f13401l;
        if (i == eArr.length) {
            this.f13401l = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f13401l;
        int i2 = this.f13402m;
        this.f13402m = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public E get(int i) {
        mo32446k(i);
        return this.f13401l[i];
    }

    /* renamed from: k */
    public final void mo32446k(int i) {
        if (i < 0 || i >= this.f13402m) {
            throw new IndexOutOfBoundsException(mo32447l(i));
        }
    }

    /* renamed from: l */
    public final String mo32447l(int i) {
        return "Index:" + i + ", Size:" + this.f13402m;
    }

    /* renamed from: o */
    public C7014z0<E> mo31773q(int i) {
        if (i >= this.f13402m) {
            return new C7014z0<>(Arrays.copyOf(this.f13401l, i), this.f13402m);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i) {
        mo31825c();
        mo32446k(i);
        E[] eArr = this.f13401l;
        E e = eArr[i];
        int i2 = this.f13402m;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f13402m--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        mo31825c();
        mo32446k(i);
        E[] eArr = this.f13401l;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f13402m;
    }

    public void add(int i, E e) {
        int i2;
        mo31825c();
        if (i < 0 || i > (i2 = this.f13402m)) {
            throw new IndexOutOfBoundsException(mo32447l(i));
        }
        E[] eArr = this.f13401l;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] f = m20730f(((i2 * 3) / 2) + 1);
            System.arraycopy(this.f13401l, 0, f, 0, i);
            System.arraycopy(this.f13401l, i, f, i + 1, this.f13402m - i);
            this.f13401l = f;
        }
        this.f13401l[i] = e;
        this.f13402m++;
        this.modCount++;
    }
}
