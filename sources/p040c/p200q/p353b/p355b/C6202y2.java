package p040c.p200q.p353b.p355b;

import com.google.common.collect.BoundType;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import p040c.p200q.p353b.p355b.C6153t1;

/* renamed from: c.q.b.b.y2 */
/* compiled from: SortedMultiset */
public interface C6202y2<E> extends Object<E>, C6169v2<E> {
    Comparator<? super E> comparator();

    C6202y2<E> descendingMultiset();

    NavigableSet<E> elementSet();

    Set<C6153t1.C6154a<E>> entrySet();

    C6153t1.C6154a<E> firstEntry();

    C6202y2<E> headMultiset(E e, BoundType boundType);

    C6153t1.C6154a<E> lastEntry();

    C6153t1.C6154a<E> pollFirstEntry();

    C6153t1.C6154a<E> pollLastEntry();

    C6202y2<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2);

    C6202y2<E> tailMultiset(E e, BoundType boundType);
}
