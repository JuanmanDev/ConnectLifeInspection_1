package p040c.p200q.p353b.p355b;

import java.util.Collection;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.v0 */
/* compiled from: ForwardingSet */
public abstract class C6167v0<E> extends C6048n0<E> implements Set<E> {
    public abstract /* bridge */ /* synthetic */ Object delegate();

    public abstract /* bridge */ /* synthetic */ Collection delegate();

    public abstract Set<E> delegate();

    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean standardEquals(Object obj) {
        return C6148s2.m17248a(this, obj);
    }

    public int standardHashCode() {
        return C6148s2.m17249b(this);
    }

    public boolean standardRemoveAll(Collection<?> collection) {
        C5850m.m16594o(collection);
        return C6148s2.m17252e(this, collection);
    }
}
