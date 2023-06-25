package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableSortedSet;

/* renamed from: c.q.b.b.g0 */
/* compiled from: DescendingImmutableSortedSet */
public final class C5979g0<E> extends ImmutableSortedSet<E> {

    /* renamed from: e */
    public final ImmutableSortedSet<E> f11538e;

    public C5979g0(ImmutableSortedSet<E> immutableSortedSet) {
        super(C6205z1.m17454a(immutableSortedSet.comparator()).mo29701h());
        this.f11538e = immutableSortedSet;
    }

    public E ceiling(E e) {
        return this.f11538e.floor(e);
    }

    public boolean contains(Object obj) {
        return this.f11538e.contains(obj);
    }

    public ImmutableSortedSet<E> createDescendingSet() {
        throw new AssertionError("should never be called");
    }

    public E floor(E e) {
        return this.f11538e.ceiling(e);
    }

    public ImmutableSortedSet<E> headSetImpl(E e, boolean z) {
        return this.f11538e.tailSet(e, z).descendingSet();
    }

    public E higher(E e) {
        return this.f11538e.lower(e);
    }

    public int indexOf(Object obj) {
        int indexOf = this.f11538e.indexOf(obj);
        if (indexOf == -1) {
            return indexOf;
        }
        return (size() - 1) - indexOf;
    }

    public boolean isPartialView() {
        return this.f11538e.isPartialView();
    }

    public E lower(E e) {
        return this.f11538e.higher(e);
    }

    public int size() {
        return this.f11538e.size();
    }

    public ImmutableSortedSet<E> subSetImpl(E e, boolean z, E e2, boolean z2) {
        return this.f11538e.subSet(e2, z2, e, z).descendingSet();
    }

    public ImmutableSortedSet<E> tailSetImpl(E e, boolean z) {
        return this.f11538e.headSet(e, z).descendingSet();
    }

    public C5991h3<E> descendingIterator() {
        return this.f11538e.iterator();
    }

    public ImmutableSortedSet<E> descendingSet() {
        return this.f11538e;
    }

    public C5991h3<E> iterator() {
        return this.f11538e.descendingIterator();
    }
}
