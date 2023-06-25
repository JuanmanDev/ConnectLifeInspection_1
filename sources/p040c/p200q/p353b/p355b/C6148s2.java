package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableCollection;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.s2 */
/* compiled from: Sets */
public final class C6148s2 {

    /* renamed from: c.q.b.b.s2$a */
    /* compiled from: Sets */
    public static abstract class C6149a<E> extends AbstractSet<E> {
        public boolean removeAll(Collection<?> collection) {
            return C6148s2.m17252e(this, collection);
        }

        public boolean retainAll(Collection<?> collection) {
            C5850m.m16594o(collection);
            return super.retainAll(collection);
        }
    }

    /* renamed from: c.q.b.b.s2$b */
    /* compiled from: Sets */
    public static final class C6150b<E> extends C6171w0<E> implements NavigableSet<E>, Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final NavigableSet<E> f11737e;

        /* renamed from: l */
        public final SortedSet<E> f11738l;

        /* renamed from: m */
        public transient C6150b<E> f11739m;

        public C6150b(NavigableSet<E> navigableSet) {
            C5850m.m16594o(navigableSet);
            this.f11737e = navigableSet;
            this.f11738l = Collections.unmodifiableSortedSet(navigableSet);
        }

        /* renamed from: c */
        public SortedSet<E> delegate() {
            return this.f11738l;
        }

        public E ceiling(E e) {
            return this.f11737e.ceiling(e);
        }

        public Iterator<E> descendingIterator() {
            return C6028l1.m16952x(this.f11737e.descendingIterator());
        }

        public NavigableSet<E> descendingSet() {
            C6150b<E> bVar = this.f11739m;
            if (bVar != null) {
                return bVar;
            }
            C6150b<E> bVar2 = new C6150b<>(this.f11737e.descendingSet());
            this.f11739m = bVar2;
            bVar2.f11739m = this;
            return bVar2;
        }

        public E floor(E e) {
            return this.f11737e.floor(e);
        }

        public NavigableSet<E> headSet(E e, boolean z) {
            return C6148s2.m17254g(this.f11737e.headSet(e, z));
        }

        public E higher(E e) {
            return this.f11737e.higher(e);
        }

        public E lower(E e) {
            return this.f11737e.lower(e);
        }

        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return C6148s2.m17254g(this.f11737e.subSet(e, z, e2, z2));
        }

        public NavigableSet<E> tailSet(E e, boolean z) {
            return C6148s2.m17254g(this.f11737e.tailSet(e, z));
        }
    }

    /* renamed from: a */
    public static boolean m17248a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m17249b(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* renamed from: c */
    public static <E> HashSet<E> m17250c() {
        return new HashSet<>();
    }

    /* renamed from: d */
    public static <E> HashSet<E> m17251d(int i) {
        return new HashSet<>(C6108q1.m17168d(i));
    }

    /* renamed from: e */
    public static boolean m17252e(Set<?> set, Collection<?> collection) {
        C5850m.m16594o(collection);
        if (collection instanceof C6153t1) {
            collection = ((C6153t1) collection).elementSet();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m17253f(set, collection.iterator());
        }
        return C6028l1.m16946r(set.iterator(), collection);
    }

    /* renamed from: f */
    public static boolean m17253f(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    /* renamed from: g */
    public static <E> NavigableSet<E> m17254g(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof C6150b)) ? navigableSet : new C6150b(navigableSet);
    }
}
