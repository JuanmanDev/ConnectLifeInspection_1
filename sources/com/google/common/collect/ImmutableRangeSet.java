package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5877a2;
import p040c.p200q.p353b.p355b.C5886c;
import p040c.p200q.p353b.p355b.C5918d0;
import p040c.p200q.p353b.p355b.C5962e2;
import p040c.p200q.p353b.p355b.C5979g0;
import p040c.p200q.p353b.p355b.C5991h3;
import p040c.p200q.p353b.p355b.C5995i0;
import p040c.p200q.p353b.p355b.C6018k;
import p040c.p200q.p353b.p355b.C6020k1;
import p040c.p200q.p353b.p355b.C6028l1;
import p040c.p200q.p353b.p355b.C6046m2;
import p040c.p200q.p353b.p355b.C6049n1;
import p040c.p200q.p353b.p355b.C6186x2;
import p040c.p200q.p353b.p355b.C6205z1;
import p040c.p200q.p353b.p358e.C6250c;

public final class ImmutableRangeSet<C extends Comparable> extends C6018k<C> implements Serializable {
    public static final ImmutableRangeSet<Comparable<?>> ALL = new ImmutableRangeSet<>(ImmutableList.m22153of(Range.all()));
    public static final ImmutableRangeSet<Comparable<?>> EMPTY = new ImmutableRangeSet<>(ImmutableList.m22152of());
    public transient ImmutableRangeSet<C> complement;
    public final transient ImmutableList<Range<C>> ranges;

    /* renamed from: com.google.common.collect.ImmutableRangeSet$a */
    public class C8130a extends ImmutableList<Range<C>> {

        /* renamed from: e */
        public final /* synthetic */ int f15107e;

        /* renamed from: l */
        public final /* synthetic */ int f15108l;

        /* renamed from: m */
        public final /* synthetic */ Range f15109m;

        public C8130a(int i, int i2, Range range) {
            this.f15107e = i;
            this.f15108l = i2;
            this.f15109m = range;
        }

        /* renamed from: c */
        public Range<C> get(int i) {
            C5850m.m16592m(i, this.f15107e);
            if (i == 0 || i == this.f15107e - 1) {
                return ((Range) ImmutableRangeSet.this.ranges.get(i + this.f15108l)).intersection(this.f15109m);
            }
            return (Range) ImmutableRangeSet.this.ranges.get(i + this.f15108l);
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return this.f15107e;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeSet$b */
    public final class C8131b extends ImmutableSortedSet<C> {

        /* renamed from: e */
        public final C5995i0<C> f15111e;

        /* renamed from: l */
        public transient Integer f15112l;

        /* renamed from: com.google.common.collect.ImmutableRangeSet$b$a */
        public class C8132a extends C5886c<C> {

            /* renamed from: m */
            public final Iterator<Range<C>> f15114m = ImmutableRangeSet.this.ranges.iterator();

            /* renamed from: n */
            public Iterator<C> f15115n = C6028l1.m16936h();

            public C8132a() {
            }

            /* renamed from: d */
            public C mo29067a() {
                while (!this.f15115n.hasNext()) {
                    if (!this.f15114m.hasNext()) {
                        return (Comparable) mo29068b();
                    }
                    this.f15115n = ContiguousSet.create(this.f15114m.next(), C8131b.this.f15111e).iterator();
                }
                return (Comparable) this.f15115n.next();
            }
        }

        /* renamed from: com.google.common.collect.ImmutableRangeSet$b$b */
        public class C8133b extends C5886c<C> {

            /* renamed from: m */
            public final Iterator<Range<C>> f15117m = ImmutableRangeSet.this.ranges.reverse().iterator();

            /* renamed from: n */
            public Iterator<C> f15118n = C6028l1.m16936h();

            public C8133b() {
            }

            /* renamed from: d */
            public C mo29067a() {
                while (!this.f15118n.hasNext()) {
                    if (!this.f15117m.hasNext()) {
                        return (Comparable) mo29068b();
                    }
                    this.f15118n = ContiguousSet.create(this.f15117m.next(), C8131b.this.f15111e).descendingIterator();
                }
                return (Comparable) this.f15118n.next();
            }
        }

        public C8131b(C5995i0<C> i0Var) {
            super(C6205z1.m17455e());
            this.f15111e = i0Var;
        }

        public boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return ImmutableRangeSet.this.contains((Comparable) obj);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        public ImmutableSortedSet<C> createDescendingSet() {
            return new C5979g0(this);
        }

        /* renamed from: f */
        public ImmutableSortedSet<C> headSetImpl(C c, boolean z) {
            return mo36739g(Range.upTo(c, BoundType.forBoolean(z)));
        }

        /* renamed from: g */
        public ImmutableSortedSet<C> mo36739g(Range<C> range) {
            return ImmutableRangeSet.this.subRangeSet((Range) range).asSet(this.f15111e);
        }

        public int indexOf(Object obj) {
            if (!contains(obj)) {
                return -1;
            }
            Comparable comparable = (Comparable) obj;
            long j = 0;
            C5991h3 it = ImmutableRangeSet.this.ranges.iterator();
            while (it.hasNext()) {
                Range range = (Range) it.next();
                if (range.contains(comparable)) {
                    return C6250c.m17574h(j + ((long) ContiguousSet.create(range, this.f15111e).indexOf(comparable)));
                }
                j += (long) ContiguousSet.create(range, this.f15111e).size();
            }
            throw new AssertionError("impossible");
        }

        public boolean isPartialView() {
            return ImmutableRangeSet.this.ranges.isPartialView();
        }

        /* renamed from: l */
        public ImmutableSortedSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
            if (z || z2 || Range.compareOrThrow(c, c2) != 0) {
                return mo36739g(Range.range(c, BoundType.forBoolean(z), c2, BoundType.forBoolean(z2)));
            }
            return ImmutableSortedSet.m22324of();
        }

        /* renamed from: o */
        public ImmutableSortedSet<C> tailSetImpl(C c, boolean z) {
            return mo36739g(Range.downTo(c, BoundType.forBoolean(z)));
        }

        public int size() {
            Integer num = this.f15112l;
            if (num == null) {
                long j = 0;
                C5991h3 it = ImmutableRangeSet.this.ranges.iterator();
                while (it.hasNext()) {
                    j += (long) ContiguousSet.create((Range) it.next(), this.f15111e).size();
                    if (j >= 2147483647L) {
                        break;
                    }
                }
                num = Integer.valueOf(C6250c.m17574h(j));
                this.f15112l = num;
            }
            return num.intValue();
        }

        public String toString() {
            return ImmutableRangeSet.this.ranges.toString();
        }

        public Object writeReplace() {
            return new C8134c(ImmutableRangeSet.this.ranges, this.f15111e);
        }

        public C5991h3<C> descendingIterator() {
            return new C8133b();
        }

        public C5991h3<C> iterator() {
            return new C8132a();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeSet$c */
    public static class C8134c<C extends Comparable> implements Serializable {

        /* renamed from: e */
        public final ImmutableList<Range<C>> f15120e;

        /* renamed from: l */
        public final C5995i0<C> f15121l;

        public C8134c(ImmutableList<Range<C>> immutableList, C5995i0<C> i0Var) {
            this.f15120e = immutableList;
            this.f15121l = i0Var;
        }

        public Object readResolve() {
            return new ImmutableRangeSet(this.f15120e).asSet(this.f15121l);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeSet$d */
    public static class C8135d<C extends Comparable<?>> {

        /* renamed from: a */
        public final List<Range<C>> f15122a = C6049n1.m16979g();

        /* renamed from: a */
        public C8135d<C> mo36747a(Range<C> range) {
            C5850m.m16589j(!range.isEmpty(), "range must not be empty, but was %s", range);
            this.f15122a.add(range);
            return this;
        }

        /* renamed from: b */
        public C8135d<C> mo36748b(Iterable<Range<C>> iterable) {
            for (Range<C> a : iterable) {
                mo36747a(a);
            }
            return this;
        }

        /* renamed from: c */
        public ImmutableRangeSet<C> mo36749c() {
            ImmutableList.C8100a aVar = new ImmutableList.C8100a(this.f15122a.size());
            Collections.sort(this.f15122a, Range.rangeLexOrdering());
            C5877a2<T> p = C6028l1.m16944p(this.f15122a.iterator());
            while (p.hasNext()) {
                Range range = (Range) p.next();
                while (p.hasNext()) {
                    Range range2 = (Range) p.peek();
                    if (!range.isConnected(range2)) {
                        break;
                    }
                    C5850m.m16590k(range.intersection(range2).isEmpty(), "Overlapping ranges not permitted but found %s overlapping %s", range, range2);
                    range = range.span((Range) p.next());
                }
                aVar.mo36637h(range);
            }
            ImmutableList j = aVar.mo36639j();
            if (j.isEmpty()) {
                return ImmutableRangeSet.m22238of();
            }
            if (j.size() != 1 || !((Range) C6020k1.m16921h(j)).equals(Range.all())) {
                return new ImmutableRangeSet<>(j);
            }
            return ImmutableRangeSet.all();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeSet$e */
    public final class C8136e extends ImmutableList<Range<C>> {

        /* renamed from: e */
        public final boolean f15123e;

        /* renamed from: l */
        public final boolean f15124l;

        /* renamed from: m */
        public final int f15125m;

        public C8136e() {
            this.f15123e = ((Range) ImmutableRangeSet.this.ranges.get(0)).hasLowerBound();
            this.f15124l = ((Range) C6020k1.m16919f(ImmutableRangeSet.this.ranges)).hasUpperBound();
            int size = ImmutableRangeSet.this.ranges.size() - 1;
            size = this.f15123e ? size + 1 : size;
            this.f15125m = this.f15124l ? size + 1 : size;
        }

        /* renamed from: c */
        public Range<C> get(int i) {
            C5918d0<C> d0Var;
            C5918d0<C> d0Var2;
            C5850m.m16592m(i, this.f15125m);
            if (this.f15123e) {
                d0Var = i == 0 ? C5918d0.m16691e() : ((Range) ImmutableRangeSet.this.ranges.get(i - 1)).upperBound;
            } else {
                d0Var = ((Range) ImmutableRangeSet.this.ranges.get(i)).upperBound;
            }
            if (!this.f15124l || i != this.f15125m - 1) {
                d0Var2 = ((Range) ImmutableRangeSet.this.ranges.get(i + (this.f15123e ^ true ? 1 : 0))).lowerBound;
            } else {
                d0Var2 = C5918d0.m16689c();
            }
            return Range.create(d0Var, d0Var2);
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return this.f15125m;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeSet$f */
    public static final class C8137f<C extends Comparable> implements Serializable {

        /* renamed from: e */
        public final ImmutableList<Range<C>> f15127e;

        public C8137f(ImmutableList<Range<C>> immutableList) {
            this.f15127e = immutableList;
        }

        public Object readResolve() {
            if (this.f15127e.isEmpty()) {
                return ImmutableRangeSet.m22238of();
            }
            if (this.f15127e.equals(ImmutableList.m22153of(Range.all()))) {
                return ImmutableRangeSet.all();
            }
            return new ImmutableRangeSet(this.f15127e);
        }
    }

    public ImmutableRangeSet(ImmutableList<Range<C>> immutableList) {
        this.ranges = immutableList;
    }

    public static <C extends Comparable> ImmutableRangeSet<C> all() {
        return ALL;
    }

    public static <C extends Comparable<?>> C8135d<C> builder() {
        return new C8135d<>();
    }

    public static <C extends Comparable> ImmutableRangeSet<C> copyOf(C5962e2<C> e2Var) {
        C5850m.m16594o(e2Var);
        if (e2Var.isEmpty()) {
            return m22238of();
        }
        if (e2Var.encloses(Range.all())) {
            return all();
        }
        if (e2Var instanceof ImmutableRangeSet) {
            ImmutableRangeSet<C> immutableRangeSet = (ImmutableRangeSet) e2Var;
            if (!immutableRangeSet.isPartialView()) {
                return immutableRangeSet;
            }
        }
        return new ImmutableRangeSet<>(ImmutableList.copyOf(e2Var.asRanges()));
    }

    private ImmutableList<Range<C>> intersectRanges(Range<C> range) {
        int i;
        if (this.ranges.isEmpty() || range.isEmpty()) {
            return ImmutableList.m22152of();
        }
        if (range.encloses(span())) {
            return this.ranges;
        }
        int a = range.hasLowerBound() ? C6186x2.m17385a(this.ranges, Range.upperBoundFn(), range.lowerBound, C6186x2.C6192c.FIRST_AFTER, C6186x2.C6188b.NEXT_HIGHER) : 0;
        if (range.hasUpperBound()) {
            i = C6186x2.m17385a(this.ranges, Range.lowerBoundFn(), range.upperBound, C6186x2.C6192c.FIRST_PRESENT, C6186x2.C6188b.NEXT_HIGHER);
        } else {
            i = this.ranges.size();
        }
        int i2 = i - a;
        if (i2 == 0) {
            return ImmutableList.m22152of();
        }
        return new C8130a(i2, a, range);
    }

    /* renamed from: of */
    public static <C extends Comparable> ImmutableRangeSet<C> m22238of() {
        return EMPTY;
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> unionOf(Iterable<Range<C>> iterable) {
        return copyOf(TreeRangeSet.create(iterable));
    }

    @Deprecated
    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void addAll(C5962e2<C> e2Var) {
        throw new UnsupportedOperationException();
    }

    public ImmutableSortedSet<C> asSet(C5995i0<C> i0Var) {
        C5850m.m16594o(i0Var);
        if (isEmpty()) {
            return ImmutableSortedSet.m22324of();
        }
        Range<C> canonical = span().canonical(i0Var);
        if (canonical.hasLowerBound()) {
            if (!canonical.hasUpperBound()) {
                try {
                    i0Var.mo29525d();
                } catch (NoSuchElementException unused) {
                    throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
                }
            }
            return new C8131b(i0Var);
        }
        throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    public ImmutableRangeSet<C> difference(C5962e2<C> e2Var) {
        TreeRangeSet create = TreeRangeSet.create(this);
        create.removeAll(e2Var);
        return copyOf(create);
    }

    public boolean encloses(Range<C> range) {
        int b = C6186x2.m17386b(this.ranges, Range.lowerBoundFn(), range.lowerBound, C6205z1.m17455e(), C6186x2.C6192c.ANY_PRESENT, C6186x2.C6188b.NEXT_LOWER);
        return b != -1 && this.ranges.get(b).encloses(range);
    }

    public /* bridge */ /* synthetic */ boolean enclosesAll(C5962e2 e2Var) {
        return super.enclosesAll(e2Var);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public ImmutableRangeSet<C> intersection(C5962e2<C> e2Var) {
        TreeRangeSet create = TreeRangeSet.create(this);
        create.removeAll(e2Var.complement());
        return copyOf(create);
    }

    public boolean intersects(Range<C> range) {
        int b = C6186x2.m17386b(this.ranges, Range.lowerBoundFn(), range.lowerBound, C6205z1.m17455e(), C6186x2.C6192c.ANY_PRESENT, C6186x2.C6188b.NEXT_HIGHER);
        if (b < this.ranges.size() && this.ranges.get(b).isConnected(range) && !this.ranges.get(b).intersection(range).isEmpty()) {
            return true;
        }
        if (b > 0) {
            int i = b - 1;
            if (!this.ranges.get(i).isConnected(range) || this.ranges.get(i).intersection(range).isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return this.ranges.isEmpty();
    }

    public boolean isPartialView() {
        return this.ranges.isPartialView();
    }

    public Range<C> rangeContaining(C c) {
        int b = C6186x2.m17386b(this.ranges, Range.lowerBoundFn(), C5918d0.m16692g(c), C6205z1.m17455e(), C6186x2.C6192c.ANY_PRESENT, C6186x2.C6188b.NEXT_LOWER);
        if (b == -1) {
            return null;
        }
        Range<C> range = this.ranges.get(b);
        if (range.contains(c)) {
            return range;
        }
        return null;
    }

    @Deprecated
    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void removeAll(C5962e2<C> e2Var) {
        throw new UnsupportedOperationException();
    }

    public Range<C> span() {
        if (!this.ranges.isEmpty()) {
            C5918d0<C> d0Var = this.ranges.get(0).lowerBound;
            ImmutableList<Range<C>> immutableList = this.ranges;
            return Range.create(d0Var, immutableList.get(immutableList.size() - 1).upperBound);
        }
        throw new NoSuchElementException();
    }

    public ImmutableRangeSet<C> union(C5962e2<C> e2Var) {
        return unionOf(C6020k1.m16916c(asRanges(), e2Var.asRanges()));
    }

    public Object writeReplace() {
        return new C8137f(this.ranges);
    }

    /* renamed from: of */
    public static <C extends Comparable> ImmutableRangeSet<C> m22239of(Range<C> range) {
        C5850m.m16594o(range);
        if (range.isEmpty()) {
            return m22238of();
        }
        if (range.equals(Range.all())) {
            return all();
        }
        return new ImmutableRangeSet<>(ImmutableList.m22153of(range));
    }

    @Deprecated
    public void addAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    public ImmutableSet<Range<C>> asDescendingSetOfRanges() {
        if (this.ranges.isEmpty()) {
            return ImmutableSet.m22254of();
        }
        return new C6046m2(this.ranges.reverse(), Range.rangeLexOrdering().mo29701h());
    }

    public ImmutableSet<Range<C>> asRanges() {
        if (this.ranges.isEmpty()) {
            return ImmutableSet.m22254of();
        }
        return new C6046m2(this.ranges, Range.rangeLexOrdering());
    }

    public ImmutableRangeSet<C> complement() {
        ImmutableRangeSet<C> immutableRangeSet = this.complement;
        if (immutableRangeSet != null) {
            return immutableRangeSet;
        }
        if (this.ranges.isEmpty()) {
            ImmutableRangeSet<C> all = all();
            this.complement = all;
            return all;
        } else if (this.ranges.size() != 1 || !this.ranges.get(0).equals(Range.all())) {
            ImmutableRangeSet<C> immutableRangeSet2 = new ImmutableRangeSet<>(new C8136e(), this);
            this.complement = immutableRangeSet2;
            return immutableRangeSet2;
        } else {
            ImmutableRangeSet<C> of = m22238of();
            this.complement = of;
            return of;
        }
    }

    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Deprecated
    public void removeAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    public ImmutableRangeSet<C> subRangeSet(Range<C> range) {
        if (!isEmpty()) {
            Range span = span();
            if (range.encloses(span)) {
                return this;
            }
            if (range.isConnected(span)) {
                return new ImmutableRangeSet<>(intersectRanges(range));
            }
        }
        return m22238of();
    }

    public ImmutableRangeSet(ImmutableList<Range<C>> immutableList, ImmutableRangeSet<C> immutableRangeSet) {
        this.ranges = immutableList;
        this.complement = immutableRangeSet;
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> copyOf(Iterable<Range<C>> iterable) {
        C8135d dVar = new C8135d();
        dVar.mo36748b(iterable);
        return dVar.mo36749c();
    }
}
