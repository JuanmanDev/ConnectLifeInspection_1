package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.g.u2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4811u2 extends C4808u implements RandomAccess {

    /* renamed from: n */
    public static final C4811u2 f9653n;

    /* renamed from: l */
    public Object[] f9654l;

    /* renamed from: m */
    public int f9655m;

    static {
        C4811u2 u2Var = new C4811u2(new Object[0], 0);
        f9653n = u2Var;
        u2Var.mo26496a();
    }

    public C4811u2(Object[] objArr, int i) {
        this.f9654l = objArr;
        this.f9655m = i;
    }

    /* renamed from: f */
    public static C4811u2 m13217f() {
        return f9653n;
    }

    public final void add(int i, Object obj) {
        int i2;
        mo26681c();
        if (i < 0 || i > (i2 = this.f9655m)) {
            throw new IndexOutOfBoundsException(mo26722g(i));
        }
        Object[] objArr = this.f9654l;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f9654l, i, objArr2, i + 1, this.f9655m - i);
            this.f9654l = objArr2;
        }
        this.f9654l[i] = obj;
        this.f9655m++;
        this.modCount++;
    }

    /* renamed from: g */
    public final String mo26722g(int i) {
        int i2 = this.f9655m;
        return "Index:" + i + ", Size:" + i2;
    }

    public final Object get(int i) {
        mo26724k(i);
        return this.f9654l[i];
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4679p1 mo25771i(int i) {
        if (i >= this.f9655m) {
            return new C4811u2(Arrays.copyOf(this.f9654l, i), this.f9655m);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: k */
    public final void mo26724k(int i) {
        if (i < 0 || i >= this.f9655m) {
            throw new IndexOutOfBoundsException(mo26722g(i));
        }
    }

    public final Object remove(int i) {
        mo26681c();
        mo26724k(i);
        Object[] objArr = this.f9654l;
        Object obj = objArr[i];
        int i2 = this.f9655m;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f9655m--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        mo26681c();
        mo26724k(i);
        Object[] objArr = this.f9654l;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f9655m;
    }

    public final boolean add(Object obj) {
        mo26681c();
        int i = this.f9655m;
        Object[] objArr = this.f9654l;
        if (i == objArr.length) {
            this.f9654l = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f9654l;
        int i2 = this.f9655m;
        this.f9655m = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
