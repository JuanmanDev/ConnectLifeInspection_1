package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import p040c.p200q.p353b.p354a.C5838g;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p354a.C5851n;
import p040c.p200q.p353b.p355b.C5889c0;
import p040c.p200q.p353b.p355b.C5894c2;
import p040c.p200q.p353b.p355b.C5918d0;
import p040c.p200q.p353b.p355b.C5995i0;
import p040c.p200q.p353b.p355b.C6020k1;
import p040c.p200q.p353b.p355b.C6205z1;

public final class Range<C extends Comparable> extends C5894c2 implements C5851n<C>, Serializable {
    public static final Range<Comparable> ALL = new Range<>(C5918d0.m16691e(), C5918d0.m16689c());
    public static final long serialVersionUID = 0;
    public final C5918d0<C> lowerBound;
    public final C5918d0<C> upperBound;

    /* renamed from: com.google.common.collect.Range$a */
    public static /* synthetic */ class C8173a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15214a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.collect.BoundType[] r0 = com.google.common.collect.BoundType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15214a = r0
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15214a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Range.C8173a.<clinit>():void");
        }
    }

    /* renamed from: com.google.common.collect.Range$b */
    public static class C8174b implements C5838g<Range, C5918d0> {

        /* renamed from: e */
        public static final C8174b f15215e = new C8174b();

        /* renamed from: a */
        public C5918d0 apply(Range range) {
            return range.lowerBound;
        }
    }

    /* renamed from: com.google.common.collect.Range$c */
    public static class C8175c extends C6205z1<Range<?>> implements Serializable {

        /* renamed from: e */
        public static final C6205z1<Range<?>> f15216e = new C8175c();
        public static final long serialVersionUID = 0;

        /* renamed from: i */
        public int compare(Range<?> range, Range<?> range2) {
            return C5889c0.m16656f().mo29072d(range.lowerBound, range2.lowerBound).mo29072d(range.upperBound, range2.upperBound).mo29073e();
        }
    }

    /* renamed from: com.google.common.collect.Range$d */
    public static class C8176d implements C5838g<Range, C5918d0> {

        /* renamed from: e */
        public static final C8176d f15217e = new C8176d();

        /* renamed from: a */
        public C5918d0 apply(Range range) {
            return range.upperBound;
        }
    }

    public Range(C5918d0<C> d0Var, C5918d0<C> d0Var2) {
        C5850m.m16594o(d0Var);
        this.lowerBound = d0Var;
        C5850m.m16594o(d0Var2);
        this.upperBound = d0Var2;
        if (d0Var.compareTo(d0Var2) > 0 || d0Var == C5918d0.m16689c() || d0Var2 == C5918d0.m16691e()) {
            throw new IllegalArgumentException("Invalid range: " + toString(d0Var, d0Var2));
        }
    }

    public static <C extends Comparable<?>> Range<C> all() {
        return ALL;
    }

    public static <C extends Comparable<?>> Range<C> atLeast(C c) {
        return create(C5918d0.m16692g(c), C5918d0.m16689c());
    }

    public static <C extends Comparable<?>> Range<C> atMost(C c) {
        return create(C5918d0.m16691e(), C5918d0.m16690d(c));
    }

    public static <T> SortedSet<T> cast(Iterable<T> iterable) {
        return (SortedSet) iterable;
    }

    public static <C extends Comparable<?>> Range<C> closed(C c, C c2) {
        return create(C5918d0.m16692g(c), C5918d0.m16690d(c2));
    }

    public static <C extends Comparable<?>> Range<C> closedOpen(C c, C c2) {
        return create(C5918d0.m16692g(c), C5918d0.m16692g(c2));
    }

    public static int compareOrThrow(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static <C extends Comparable<?>> Range<C> create(C5918d0<C> d0Var, C5918d0<C> d0Var2) {
        return new Range<>(d0Var, d0Var2);
    }

    public static <C extends Comparable<?>> Range<C> downTo(C c, BoundType boundType) {
        int i = C8173a.f15214a[boundType.ordinal()];
        if (i == 1) {
            return greaterThan(c);
        }
        if (i == 2) {
            return atLeast(c);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> Range<C> encloseAll(Iterable<C> iterable) {
        C5850m.m16594o(iterable);
        if (iterable instanceof SortedSet) {
            SortedSet<C> cast = cast(iterable);
            Comparator<? super C> comparator = cast.comparator();
            if (C6205z1.m17455e().equals(comparator) || comparator == null) {
                return closed((Comparable) cast.first(), (Comparable) cast.last());
            }
        }
        Iterator<C> it = iterable.iterator();
        C next = it.next();
        C5850m.m16594o(next);
        Comparable comparable = (Comparable) next;
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            C next2 = it.next();
            C5850m.m16594o(next2);
            Comparable comparable3 = (Comparable) next2;
            comparable = (Comparable) C6205z1.m17455e().mo29700d(comparable, comparable3);
            comparable2 = (Comparable) C6205z1.m17455e().mo29699c(comparable2, comparable3);
        }
        return closed(comparable, comparable2);
    }

    public static <C extends Comparable<?>> Range<C> greaterThan(C c) {
        return create(C5918d0.m16690d(c), C5918d0.m16689c());
    }

    public static <C extends Comparable<?>> Range<C> lessThan(C c) {
        return create(C5918d0.m16691e(), C5918d0.m16692g(c));
    }

    public static <C extends Comparable<?>> C5838g<Range<C>, C5918d0<C>> lowerBoundFn() {
        return C8174b.f15215e;
    }

    public static <C extends Comparable<?>> Range<C> open(C c, C c2) {
        return create(C5918d0.m16690d(c), C5918d0.m16692g(c2));
    }

    public static <C extends Comparable<?>> Range<C> openClosed(C c, C c2) {
        return create(C5918d0.m16690d(c), C5918d0.m16690d(c2));
    }

    public static <C extends Comparable<?>> Range<C> range(C c, BoundType boundType, C c2, BoundType boundType2) {
        C5850m.m16594o(boundType);
        C5850m.m16594o(boundType2);
        return create(boundType == BoundType.OPEN ? C5918d0.m16690d(c) : C5918d0.m16692g(c), boundType2 == BoundType.OPEN ? C5918d0.m16692g(c2) : C5918d0.m16690d(c2));
    }

    public static <C extends Comparable<?>> C6205z1<Range<C>> rangeLexOrdering() {
        return C8175c.f15216e;
    }

    public static <C extends Comparable<?>> Range<C> singleton(C c) {
        return closed(c, c);
    }

    public static <C extends Comparable<?>> Range<C> upTo(C c, BoundType boundType) {
        int i = C8173a.f15214a[boundType.ordinal()];
        if (i == 1) {
            return lessThan(c);
        }
        if (i == 2) {
            return atMost(c);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> C5838g<Range<C>, C5918d0<C>> upperBoundFn() {
        return C8176d.f15217e;
    }

    public Range<C> canonical(C5995i0<C> i0Var) {
        C5850m.m16594o(i0Var);
        C5918d0<C> h = this.lowerBound.mo29175h(i0Var);
        C5918d0<C> h2 = this.upperBound.mo29175h(i0Var);
        return (h == this.lowerBound && h2 == this.upperBound) ? this : create(h, h2);
    }

    public boolean contains(C c) {
        C5850m.m16594o(c);
        return this.lowerBound.mo29182q(c) && !this.upperBound.mo29182q(c);
    }

    public boolean containsAll(Iterable<? extends C> iterable) {
        if (C6020k1.m16922i(iterable)) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet<? extends C> cast = cast(iterable);
            Comparator<? super Object> comparator = cast.comparator();
            if (C6205z1.m17455e().equals(comparator) || comparator == null) {
                if (!contains((Comparable) cast.first()) || !contains((Comparable) cast.last())) {
                    return false;
                }
                return true;
            }
        }
        Iterator<? extends C> it = iterable.iterator();
        while (it.hasNext()) {
            if (!contains((Comparable) it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean encloses(Range<C> range) {
        return this.lowerBound.compareTo(range.lowerBound) <= 0 && this.upperBound.compareTo(range.upperBound) >= 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        if (!this.lowerBound.equals(range.lowerBound) || !this.upperBound.equals(range.upperBound)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.common.collect.Range<C>, code=com.google.common.collect.Range, for r3v0, types: [com.google.common.collect.Range, com.google.common.collect.Range<C>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.common.collect.Range<C> gap(com.google.common.collect.Range r3) {
        /*
            r2 = this;
            c.q.b.b.d0<C> r0 = r2.lowerBound
            c.q.b.b.d0<C> r1 = r3.lowerBound
            int r0 = r0.compareTo(r1)
            if (r0 >= 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            if (r0 == 0) goto L_0x0011
            r1 = r2
            goto L_0x0012
        L_0x0011:
            r1 = r3
        L_0x0012:
            if (r0 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r3 = r2
        L_0x0016:
            c.q.b.b.d0<C> r0 = r1.upperBound
            c.q.b.b.d0<C> r3 = r3.lowerBound
            com.google.common.collect.Range r3 = create(r0, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Range.gap(com.google.common.collect.Range):com.google.common.collect.Range");
    }

    public boolean hasLowerBound() {
        return this.lowerBound != C5918d0.m16691e();
    }

    public boolean hasUpperBound() {
        return this.upperBound != C5918d0.m16689c();
    }

    public int hashCode() {
        return (this.lowerBound.hashCode() * 31) + this.upperBound.hashCode();
    }

    public Range<C> intersection(Range<C> range) {
        int i = this.lowerBound.compareTo(range.lowerBound);
        int i2 = this.upperBound.compareTo(range.upperBound);
        if (i >= 0 && i2 <= 0) {
            return this;
        }
        if (i <= 0 && i2 >= 0) {
            return range;
        }
        return create(i >= 0 ? this.lowerBound : range.lowerBound, i2 <= 0 ? this.upperBound : range.upperBound);
    }

    public boolean isConnected(Range<C> range) {
        return this.lowerBound.compareTo(range.upperBound) <= 0 && range.lowerBound.compareTo(this.upperBound) <= 0;
    }

    public boolean isEmpty() {
        return this.lowerBound.equals(this.upperBound);
    }

    public BoundType lowerBoundType() {
        return this.lowerBound.mo29184t();
    }

    public C lowerEndpoint() {
        return this.lowerBound.mo29180n();
    }

    public Object readResolve() {
        return equals(ALL) ? all() : this;
    }

    public Range<C> span(Range<C> range) {
        int i = this.lowerBound.compareTo(range.lowerBound);
        int i2 = this.upperBound.compareTo(range.upperBound);
        if (i <= 0 && i2 >= 0) {
            return this;
        }
        if (i >= 0 && i2 <= 0) {
            return range;
        }
        return create(i <= 0 ? this.lowerBound : range.lowerBound, i2 >= 0 ? this.upperBound : range.upperBound);
    }

    public String toString() {
        return toString(this.lowerBound, this.upperBound);
    }

    public BoundType upperBoundType() {
        return this.upperBound.mo29185u();
    }

    public C upperEndpoint() {
        return this.upperBound.mo29180n();
    }

    public static String toString(C5918d0<?> d0Var, C5918d0<?> d0Var2) {
        StringBuilder sb = new StringBuilder(16);
        d0Var.mo29178j(sb);
        sb.append("..");
        d0Var2.mo29179m(sb);
        return sb.toString();
    }

    @Deprecated
    public boolean apply(C c) {
        return contains(c);
    }
}
