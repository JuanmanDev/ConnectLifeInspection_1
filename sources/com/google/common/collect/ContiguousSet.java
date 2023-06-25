package com.google.common.collect;

import com.google.common.collect.ImmutableSortedSet;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5972f2;
import p040c.p200q.p353b.p355b.C5979g0;
import p040c.p200q.p353b.p355b.C5995i0;
import p040c.p200q.p353b.p355b.C6009j0;
import p040c.p200q.p353b.p355b.C6205z1;

public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    public final C5995i0<C> domain;

    public ContiguousSet(C5995i0<C> i0Var) {
        super(C6205z1.m17455e());
        this.domain = i0Var;
    }

    @Deprecated
    public static <E> ImmutableSortedSet.C8150a<E> builder() {
        throw new UnsupportedOperationException();
    }

    public static ContiguousSet<Integer> closed(int i, int i2) {
        return create(Range.closed(Integer.valueOf(i), Integer.valueOf(i2)), C5995i0.m16861b());
    }

    public static ContiguousSet<Integer> closedOpen(int i, int i2) {
        return create(Range.closedOpen(Integer.valueOf(i), Integer.valueOf(i2)), C5995i0.m16861b());
    }

    public static <C extends Comparable> ContiguousSet<C> create(Range<C> range, C5995i0<C> i0Var) {
        C5850m.m16594o(range);
        C5850m.m16594o(i0Var);
        try {
            Range<C> intersection = !range.hasLowerBound() ? range.intersection(Range.atLeast(i0Var.mo29526e())) : range;
            if (!range.hasUpperBound()) {
                intersection = intersection.intersection(Range.atMost(i0Var.mo29525d()));
            }
            return intersection.isEmpty() || Range.compareOrThrow(range.lowerBound.mo29183r(i0Var), range.upperBound.mo29181o(i0Var)) > 0 ? new C6009j0(i0Var) : new C5972f2(intersection, i0Var);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public ImmutableSortedSet<C> createDescendingSet() {
        return new C5979g0(this);
    }

    public abstract ContiguousSet<C> headSetImpl(C c, boolean z);

    public abstract ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet);

    public abstract Range<C> range();

    public abstract Range<C> range(BoundType boundType, BoundType boundType2);

    public abstract ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2);

    public abstract ContiguousSet<C> tailSetImpl(C c, boolean z);

    public String toString() {
        return range().toString();
    }

    public static ContiguousSet<Long> closed(long j, long j2) {
        return create(Range.closed(Long.valueOf(j), Long.valueOf(j2)), C5995i0.m16862c());
    }

    public static ContiguousSet<Long> closedOpen(long j, long j2) {
        return create(Range.closedOpen(Long.valueOf(j), Long.valueOf(j2)), C5995i0.m16862c());
    }

    public ContiguousSet<C> headSet(C c) {
        C5850m.m16594o(c);
        return headSetImpl((Comparable) c, false);
    }

    public ContiguousSet<C> subSet(C c, C c2) {
        C5850m.m16594o(c);
        C5850m.m16594o(c2);
        C5850m.m16583d(comparator().compare(c, c2) <= 0);
        return subSetImpl(c, true, c2, false);
    }

    public ContiguousSet<C> tailSet(C c) {
        C5850m.m16594o(c);
        return tailSetImpl((Comparable) c, true);
    }

    public ContiguousSet<C> headSet(C c, boolean z) {
        C5850m.m16594o(c);
        return headSetImpl((Comparable) c, z);
    }

    public ContiguousSet<C> tailSet(C c, boolean z) {
        C5850m.m16594o(c);
        return tailSetImpl((Comparable) c, z);
    }

    public ContiguousSet<C> subSet(C c, boolean z, C c2, boolean z2) {
        C5850m.m16594o(c);
        C5850m.m16594o(c2);
        C5850m.m16583d(comparator().compare(c, c2) <= 0);
        return subSetImpl(c, z, c2, z2);
    }
}
