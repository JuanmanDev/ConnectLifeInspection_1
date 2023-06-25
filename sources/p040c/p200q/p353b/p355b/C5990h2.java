package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableList;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.h2 */
/* compiled from: RegularImmutableList */
public class C5990h2<E> extends ImmutableList<E> {

    /* renamed from: m */
    public static final ImmutableList<Object> f11551m = new C5990h2(new Object[0], 0);

    /* renamed from: e */
    public final transient Object[] f11552e;

    /* renamed from: l */
    public final transient int f11553l;

    public C5990h2(Object[] objArr, int i) {
        this.f11552e = objArr;
        this.f11553l = i;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.f11552e, 0, objArr, i, this.f11553l);
        return i + this.f11553l;
    }

    public E get(int i) {
        C5850m.m16592m(i, this.f11553l);
        return this.f11552e[i];
    }

    public Object[] internalArray() {
        return this.f11552e;
    }

    public int internalArrayEnd() {
        return this.f11553l;
    }

    public int internalArrayStart() {
        return 0;
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.f11553l;
    }
}
