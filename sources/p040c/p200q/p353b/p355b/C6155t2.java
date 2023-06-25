package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.t2 */
/* compiled from: SingletonImmutableSet */
public final class C6155t2<E> extends ImmutableSet<E> {

    /* renamed from: e */
    public final transient E f11740e;

    /* renamed from: l */
    public transient int f11741l;

    public C6155t2(E e) {
        C5850m.m16594o(e);
        this.f11740e = e;
    }

    public boolean contains(Object obj) {
        return this.f11740e.equals(obj);
    }

    public int copyIntoArray(Object[] objArr, int i) {
        objArr[i] = this.f11740e;
        return i + 1;
    }

    public ImmutableList<E> createAsList() {
        return ImmutableList.m22153of(this.f11740e);
    }

    public final int hashCode() {
        int i = this.f11741l;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f11740e.hashCode();
        this.f11741l = hashCode;
        return hashCode;
    }

    public boolean isHashCodeFast() {
        return this.f11741l != 0;
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return 1;
    }

    public String toString() {
        return '[' + this.f11740e.toString() + ']';
    }

    public C5991h3<E> iterator() {
        return C6028l1.m16948t(this.f11740e);
    }

    public C6155t2(E e, int i) {
        this.f11740e = e;
        this.f11741l = i;
    }
}
