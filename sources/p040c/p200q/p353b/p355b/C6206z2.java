package p040c.p200q.p353b.p355b;

import com.google.common.collect.BoundType;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import p040c.p200q.p353b.p355b.C6153t1;
import p040c.p200q.p353b.p355b.C6158u1;

/* renamed from: c.q.b.b.z2 */
/* compiled from: SortedMultisets */
public final class C6206z2 {

    /* renamed from: c.q.b.b.z2$a */
    /* compiled from: SortedMultisets */
    public static class C6207a<E> extends C6158u1.C6161c<E> implements SortedSet<E> {

        /* renamed from: e */
        public final C6202y2<E> f11822e;

        public C6207a(C6202y2<E> y2Var) {
            this.f11822e = y2Var;
        }

        public Comparator<? super E> comparator() {
            return mo29521k().comparator();
        }

        public E first() {
            return C6206z2.m17465d(mo29521k().firstEntry());
        }

        public SortedSet<E> headSet(E e) {
            return mo29521k().headMultiset(e, BoundType.OPEN).elementSet();
        }

        public Iterator<E> iterator() {
            return C6158u1.m17261e(mo29521k().entrySet().iterator());
        }

        public E last() {
            return C6206z2.m17465d(mo29521k().lastEntry());
        }

        /* renamed from: o */
        public final C6202y2<E> mo29521k() {
            return this.f11822e;
        }

        public SortedSet<E> subSet(E e, E e2) {
            return mo29521k().subMultiset(e, BoundType.CLOSED, e2, BoundType.OPEN).elementSet();
        }

        public SortedSet<E> tailSet(E e) {
            return mo29521k().tailMultiset(e, BoundType.CLOSED).elementSet();
        }
    }

    /* renamed from: c.q.b.b.z2$b */
    /* compiled from: SortedMultisets */
    public static class C6208b<E> extends C6207a<E> implements NavigableSet<E> {
        public C6208b(C6202y2<E> y2Var) {
            super(y2Var);
        }

        public E ceiling(E e) {
            return C6206z2.m17464c(mo29521k().tailMultiset(e, BoundType.CLOSED).firstEntry());
        }

        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet<E> descendingSet() {
            return new C6208b(mo29521k().descendingMultiset());
        }

        public E floor(E e) {
            return C6206z2.m17464c(mo29521k().headMultiset(e, BoundType.CLOSED).lastEntry());
        }

        public NavigableSet<E> headSet(E e, boolean z) {
            return new C6208b(mo29521k().headMultiset(e, BoundType.forBoolean(z)));
        }

        public E higher(E e) {
            return C6206z2.m17464c(mo29521k().tailMultiset(e, BoundType.OPEN).firstEntry());
        }

        public E lower(E e) {
            return C6206z2.m17464c(mo29521k().headMultiset(e, BoundType.OPEN).lastEntry());
        }

        public E pollFirst() {
            return C6206z2.m17464c(mo29521k().pollFirstEntry());
        }

        public E pollLast() {
            return C6206z2.m17464c(mo29521k().pollLastEntry());
        }

        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return new C6208b(mo29521k().subMultiset(e, BoundType.forBoolean(z), e2, BoundType.forBoolean(z2)));
        }

        public NavigableSet<E> tailSet(E e, boolean z) {
            return new C6208b(mo29521k().tailMultiset(e, BoundType.forBoolean(z)));
        }
    }

    /* renamed from: c */
    public static <E> E m17464c(C6153t1.C6154a<E> aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.mo29977a();
    }

    /* renamed from: d */
    public static <E> E m17465d(C6153t1.C6154a<E> aVar) {
        if (aVar != null) {
            return aVar.mo29977a();
        }
        throw new NoSuchElementException();
    }
}
