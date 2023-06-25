package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.i.da */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5033da extends C5062f7 implements RandomAccess {

    /* renamed from: n */
    public static final C5033da f9861n;

    /* renamed from: l */
    public Object[] f9862l;

    /* renamed from: m */
    public int f9863m;

    static {
        C5033da daVar = new C5033da(new Object[0], 0);
        f9861n = daVar;
        daVar.mo27229a();
    }

    public C5033da(Object[] objArr, int i) {
        this.f9862l = objArr;
        this.f9863m = i;
    }

    /* renamed from: f */
    public static C5033da m13980f() {
        return f9861n;
    }

    public final void add(int i, Object obj) {
        int i2;
        mo27231c();
        if (i < 0 || i > (i2 = this.f9863m)) {
            throw new IndexOutOfBoundsException(mo27165g(i));
        }
        Object[] objArr = this.f9862l;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f9862l, i, objArr2, i + 1, this.f9863m - i);
            this.f9862l = objArr2;
        }
        this.f9862l[i] = obj;
        this.f9863m++;
        this.modCount++;
    }

    /* renamed from: g */
    public final String mo27165g(int i) {
        int i2 = this.f9863m;
        return "Index:" + i + ", Size:" + i2;
    }

    public final Object get(int i) {
        mo27167k(i);
        return this.f9862l[i];
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C5354y8 mo27013i(int i) {
        if (i >= this.f9863m) {
            return new C5033da(Arrays.copyOf(this.f9862l, i), this.f9863m);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: k */
    public final void mo27167k(int i) {
        if (i < 0 || i >= this.f9863m) {
            throw new IndexOutOfBoundsException(mo27165g(i));
        }
    }

    public final Object remove(int i) {
        mo27231c();
        mo27167k(i);
        Object[] objArr = this.f9862l;
        Object obj = objArr[i];
        int i2 = this.f9863m;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f9863m--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        mo27231c();
        mo27167k(i);
        Object[] objArr = this.f9862l;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f9863m;
    }

    public final boolean add(Object obj) {
        mo27231c();
        int i = this.f9863m;
        Object[] objArr = this.f9862l;
        if (i == objArr.length) {
            this.f9862l = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f9862l;
        int i2 = this.f9863m;
        this.f9863m = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
