package p040c.p200q.p353b.p355b;

import java.io.Serializable;
import java.util.Comparator;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.b0 */
/* compiled from: ComparatorOrdering */
public final class C5880b0<T> extends C6205z1<T> implements Serializable {
    public static final long serialVersionUID = 0;

    /* renamed from: e */
    public final Comparator<T> f11407e;

    public C5880b0(Comparator<T> comparator) {
        C5850m.m16594o(comparator);
        this.f11407e = comparator;
    }

    public int compare(T t, T t2) {
        return this.f11407e.compare(t, t2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5880b0) {
            return this.f11407e.equals(((C5880b0) obj).f11407e);
        }
        return false;
    }

    public int hashCode() {
        return this.f11407e.hashCode();
    }

    public String toString() {
        return this.f11407e.toString();
    }
}
