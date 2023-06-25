package p040c.p200q.p353b.p355b;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* renamed from: c.q.b.b.w0 */
/* compiled from: ForwardingSortedSet */
public abstract class C6171w0<E> extends C6167v0<E> implements SortedSet<E> {
    /* renamed from: c */
    public abstract SortedSet<E> mo29979c();

    public Comparator<? super E> comparator() {
        return mo29979c().comparator();
    }

    /* renamed from: f */
    public final int mo30029f(Object obj, Object obj2) {
        Comparator comparator = comparator();
        if (comparator == null) {
            return ((Comparable) obj).compareTo(obj2);
        }
        return comparator.compare(obj, obj2);
    }

    public E first() {
        return mo29979c().first();
    }

    public SortedSet<E> headSet(E e) {
        return mo29979c().headSet(e);
    }

    public E last() {
        return mo29979c().last();
    }

    public boolean standardContains(Object obj) {
        try {
            if (mo30029f(tailSet(obj).first(), obj) == 0) {
                return true;
            }
            return false;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
            return false;
        }
    }

    public boolean standardRemove(Object obj) {
        try {
            Iterator it = tailSet(obj).iterator();
            if (it.hasNext() && mo30029f(it.next(), obj) == 0) {
                it.remove();
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public SortedSet<E> subSet(E e, E e2) {
        return mo29979c().subSet(e, e2);
    }

    public SortedSet<E> tailSet(E e) {
        return mo29979c().tailSet(e);
    }
}
