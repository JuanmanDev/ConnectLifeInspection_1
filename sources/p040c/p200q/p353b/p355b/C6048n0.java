package p040c.p200q.p353b.p355b;

import java.util.Collection;
import java.util.Iterator;
import p040c.p200q.p353b.p354a.C5845j;

/* renamed from: c.q.b.b.n0 */
/* compiled from: ForwardingCollection */
public abstract class C6048n0<E> extends C6152t0 implements Collection<E> {
    public boolean add(E e) {
        return delegate().add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return delegate().addAll(collection);
    }

    public void clear() {
        delegate().clear();
    }

    public boolean contains(Object obj) {
        return delegate().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return delegate().containsAll(collection);
    }

    public abstract /* bridge */ /* synthetic */ Object delegate();

    public abstract Collection<E> delegate();

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Iterator<E> iterator() {
        return delegate().iterator();
    }

    public boolean remove(Object obj) {
        return delegate().remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return delegate().removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return delegate().retainAll(collection);
    }

    public int size() {
        return delegate().size();
    }

    public boolean standardAddAll(Collection<? extends E> collection) {
        return C6028l1.m16929a(this, collection.iterator());
    }

    public void standardClear() {
        C6028l1.m16932d(iterator());
    }

    public boolean standardContains(Object obj) {
        return C6028l1.m16934f(iterator(), obj);
    }

    public boolean standardContainsAll(Collection<?> collection) {
        return C6170w.m17283b(this, collection);
    }

    public boolean standardIsEmpty() {
        return !iterator().hasNext();
    }

    public boolean standardRemove(Object obj) {
        Iterator it = iterator();
        while (it.hasNext()) {
            if (C5845j.m16576a(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean standardRemoveAll(Collection<?> collection) {
        return C6028l1.m16946r(iterator(), collection);
    }

    public boolean standardRetainAll(Collection<?> collection) {
        return C6028l1.m16947s(iterator(), collection);
    }

    public Object[] standardToArray() {
        return toArray(new Object[size()]);
    }

    public String standardToString() {
        return C6170w.m17287f(this);
    }

    public Object[] toArray() {
        return delegate().toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return delegate().toArray(tArr);
    }

    public <T> T[] standardToArray(T[] tArr) {
        return C6172w1.m17296g(this, tArr);
    }
}
