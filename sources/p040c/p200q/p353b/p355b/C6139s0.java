package p040c.p200q.p353b.p355b;

import java.util.Collection;
import java.util.Set;
import p040c.p200q.p353b.p355b.C6153t1;

/* renamed from: c.q.b.b.s0 */
/* compiled from: ForwardingMultiset */
public abstract class C6139s0<E> extends C6048n0<E> implements C6153t1<E> {
    public int add(E e, int i) {
        return mo29489c().add(e, i);
    }

    /* renamed from: c */
    public abstract C6153t1<E> mo29489c();

    public int count(Object obj) {
        return mo29489c().count(obj);
    }

    public abstract Set<C6153t1.C6154a<E>> entrySet();

    public boolean equals(Object obj) {
        return obj == this || mo29489c().equals(obj);
    }

    public int hashCode() {
        return mo29489c().hashCode();
    }

    public int remove(Object obj, int i) {
        return mo29489c().remove(obj, i);
    }

    public int setCount(E e, int i) {
        return mo29489c().setCount(e, i);
    }

    public boolean standardAddAll(Collection<? extends E> collection) {
        return C6158u1.m17259c(this, collection);
    }

    public void standardClear() {
        C6028l1.m16932d(entrySet().iterator());
    }

    public boolean standardContains(Object obj) {
        return count(obj) > 0;
    }

    public boolean standardRemove(Object obj) {
        return remove(obj, 1) > 0;
    }

    public boolean standardRemoveAll(Collection<?> collection) {
        return C6158u1.m17266j(this, collection);
    }

    public boolean standardRetainAll(Collection<?> collection) {
        return C6158u1.m17267k(this, collection);
    }

    public String standardToString() {
        return entrySet().toString();
    }

    public boolean setCount(E e, int i, int i2) {
        return mo29489c().setCount(e, i, i2);
    }
}
