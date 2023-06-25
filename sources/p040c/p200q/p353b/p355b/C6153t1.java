package p040c.p200q.p353b.p355b;

import java.util.Collection;
import java.util.Set;

/* renamed from: c.q.b.b.t1 */
/* compiled from: Multiset */
public interface C6153t1<E> extends Collection<E> {

    /* renamed from: c.q.b.b.t1$a */
    /* compiled from: Multiset */
    public interface C6154a<E> {
        /* renamed from: a */
        E mo29977a();

        int getCount();

        String toString();
    }

    int add(E e, int i);

    boolean contains(Object obj);

    boolean containsAll(Collection<?> collection);

    int count(Object obj);

    Set<E> elementSet();

    Set<C6154a<E>> entrySet();

    boolean equals(Object obj);

    int hashCode();

    int remove(Object obj, int i);

    boolean remove(Object obj);

    int setCount(E e, int i);

    boolean setCount(E e, int i, int i2);

    int size();
}
