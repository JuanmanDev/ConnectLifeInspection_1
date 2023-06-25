package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import p040c.p200q.p353b.p354a.C5841i;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5877a2;
import p040c.p200q.p353b.p355b.C5886c;
import p040c.p200q.p353b.p355b.C5918d0;
import p040c.p200q.p353b.p355b.C5962e2;
import p040c.p200q.p353b.p355b.C6006j;
import p040c.p200q.p353b.p355b.C6018k;
import p040c.p200q.p353b.p355b.C6028l1;
import p040c.p200q.p353b.p355b.C6048n0;
import p040c.p200q.p353b.p355b.C6108q1;
import p040c.p200q.p353b.p355b.C6148s2;
import p040c.p200q.p353b.p355b.C6205z1;

public class TreeRangeSet<C extends Comparable<?>> extends C6018k<C> implements Serializable {
    public transient Set<Range<C>> asDescendingSetOfRanges;
    public transient Set<Range<C>> asRanges;
    public transient C5962e2<C> complement;
    public final NavigableMap<C5918d0<C>, Range<C>> rangesByLowerBound;

    /* renamed from: com.google.common.collect.TreeRangeSet$b */
    public final class C8191b extends C6048n0<Range<C>> implements Set<Range<C>> {

        /* renamed from: e */
        public final Collection<Range<C>> f15248e;

        public C8191b(TreeRangeSet treeRangeSet, Collection<Range<C>> collection) {
            this.f15248e = collection;
        }

        public boolean equals(Object obj) {
            return C6148s2.m17248a(this, obj);
        }

        public int hashCode() {
            return C6148s2.m17249b(this);
        }

        public Collection<Range<C>> delegate() {
            return this.f15248e;
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeSet$c */
    public final class C8192c extends TreeRangeSet<C> {
        public C8192c() {
            super(new C8193d(TreeRangeSet.this.rangesByLowerBound));
        }

        public void add(Range<C> range) {
            TreeRangeSet.this.remove(range);
        }

        public C5962e2<C> complement() {
            return TreeRangeSet.this;
        }

        public boolean contains(C c) {
            return !TreeRangeSet.this.contains(c);
        }

        public void remove(Range<C> range) {
            TreeRangeSet.this.add(range);
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeSet$d */
    public static final class C8193d<C extends Comparable<?>> extends C6006j<C5918d0<C>, Range<C>> {

        /* renamed from: e */
        public final NavigableMap<C5918d0<C>, Range<C>> f15250e;

        /* renamed from: l */
        public final NavigableMap<C5918d0<C>, Range<C>> f15251l;

        /* renamed from: m */
        public final Range<C5918d0<C>> f15252m;

        /* renamed from: com.google.common.collect.TreeRangeSet$d$a */
        public class C8194a extends C5886c<Map.Entry<C5918d0<C>, Range<C>>> {

            /* renamed from: m */
            public C5918d0<C> f15253m = this.f15254n;

            /* renamed from: n */
            public final /* synthetic */ C5918d0 f15254n;

            /* renamed from: o */
            public final /* synthetic */ C5877a2 f15255o;

            public C8194a(C5918d0 d0Var, C5877a2 a2Var) {
                this.f15254n = d0Var;
                this.f15255o = a2Var;
            }

            /* renamed from: d */
            public Map.Entry<C5918d0<C>, Range<C>> mo29067a() {
                Range<C> range;
                if (C8193d.this.f15252m.upperBound.mo29182q(this.f15253m) || this.f15253m == C5918d0.m16689c()) {
                    return (Map.Entry) mo29068b();
                }
                if (this.f15255o.hasNext()) {
                    Range range2 = (Range) this.f15255o.next();
                    range = Range.create(this.f15253m, range2.lowerBound);
                    this.f15253m = range2.upperBound;
                } else {
                    range = Range.create(this.f15253m, C5918d0.m16689c());
                    this.f15253m = C5918d0.m16689c();
                }
                return C6108q1.m17173i(range.lowerBound, range);
            }
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$d$b */
        public class C8195b extends C5886c<Map.Entry<C5918d0<C>, Range<C>>> {

            /* renamed from: m */
            public C5918d0<C> f15257m = this.f15258n;

            /* renamed from: n */
            public final /* synthetic */ C5918d0 f15258n;

            /* renamed from: o */
            public final /* synthetic */ C5877a2 f15259o;

            public C8195b(C5918d0 d0Var, C5877a2 a2Var) {
                this.f15258n = d0Var;
                this.f15259o = a2Var;
            }

            /* renamed from: d */
            public Map.Entry<C5918d0<C>, Range<C>> mo29067a() {
                if (this.f15257m == C5918d0.m16691e()) {
                    return (Map.Entry) mo29068b();
                }
                if (this.f15259o.hasNext()) {
                    Range range = (Range) this.f15259o.next();
                    Range<C> create = Range.create(range.upperBound, this.f15257m);
                    this.f15257m = range.lowerBound;
                    if (C8193d.this.f15252m.lowerBound.mo29182q(create.lowerBound)) {
                        return C6108q1.m17173i(create.lowerBound, create);
                    }
                } else if (C8193d.this.f15252m.lowerBound.mo29182q(C5918d0.m16691e())) {
                    Range<C> create2 = Range.create(C5918d0.m16691e(), this.f15257m);
                    this.f15257m = C5918d0.m16691e();
                    return C6108q1.m17173i(C5918d0.m16691e(), create2);
                }
                return (Map.Entry) mo29068b();
            }
        }

        public C8193d(NavigableMap<C5918d0<C>, Range<C>> navigableMap) {
            this(navigableMap, Range.all());
        }

        /* renamed from: a */
        public Iterator<Map.Entry<C5918d0<C>, Range<C>>> mo29135a() {
            Collection collection;
            C5918d0<C> d0Var;
            if (this.f15252m.hasLowerBound()) {
                collection = this.f15251l.tailMap(this.f15252m.lowerEndpoint(), this.f15252m.lowerBoundType() == BoundType.CLOSED).values();
            } else {
                collection = this.f15251l.values();
            }
            C5877a2 p = C6028l1.m16944p(collection.iterator());
            if (this.f15252m.contains(C5918d0.m16691e()) && (!p.hasNext() || ((Range) p.peek()).lowerBound != C5918d0.m16691e())) {
                d0Var = C5918d0.m16691e();
            } else if (!p.hasNext()) {
                return C6028l1.m16936h();
            } else {
                d0Var = ((Range) p.next()).upperBound;
            }
            return new C8194a(d0Var, p);
        }

        /* renamed from: b */
        public Iterator<Map.Entry<C5918d0<C>, Range<C>>> mo29555b() {
            C5918d0 d0Var;
            C5918d0<C> d0Var2;
            if (this.f15252m.hasUpperBound()) {
                d0Var = this.f15252m.upperEndpoint();
            } else {
                d0Var = C5918d0.m16689c();
            }
            C5877a2 p = C6028l1.m16944p(this.f15251l.headMap(d0Var, this.f15252m.hasUpperBound() && this.f15252m.upperBoundType() == BoundType.CLOSED).descendingMap().values().iterator());
            if (p.hasNext()) {
                if (((Range) p.peek()).upperBound == C5918d0.m16689c()) {
                    d0Var2 = ((Range) p.next()).lowerBound;
                } else {
                    d0Var2 = this.f15250e.higherKey(((Range) p.peek()).upperBound);
                }
            } else if (!this.f15252m.contains(C5918d0.m16691e()) || this.f15250e.containsKey(C5918d0.m16691e())) {
                return C6028l1.m16936h();
            } else {
                d0Var2 = this.f15250e.higherKey(C5918d0.m16691e());
            }
            return new C8195b((C5918d0) C5841i.m16566a(d0Var2, C5918d0.m16689c()), p);
        }

        public Comparator<? super C5918d0<C>> comparator() {
            return C6205z1.m17455e();
        }

        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        /* renamed from: d */
        public Range<C> get(Object obj) {
            if (obj instanceof C5918d0) {
                try {
                    C5918d0 d0Var = (C5918d0) obj;
                    Map.Entry firstEntry = tailMap(d0Var, true).firstEntry();
                    if (firstEntry != null && ((C5918d0) firstEntry.getKey()).equals(d0Var)) {
                        return (Range) firstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        /* renamed from: e */
        public NavigableMap<C5918d0<C>, Range<C>> headMap(C5918d0<C> d0Var, boolean z) {
            return mo36981g(Range.upTo(d0Var, BoundType.forBoolean(z)));
        }

        /* renamed from: f */
        public NavigableMap<C5918d0<C>, Range<C>> subMap(C5918d0<C> d0Var, boolean z, C5918d0<C> d0Var2, boolean z2) {
            return mo36981g(Range.range(d0Var, BoundType.forBoolean(z), d0Var2, BoundType.forBoolean(z2)));
        }

        /* renamed from: g */
        public final NavigableMap<C5918d0<C>, Range<C>> mo36981g(Range<C5918d0<C>> range) {
            if (!this.f15252m.isConnected(range)) {
                return ImmutableSortedMap.m22280of();
            }
            return new C8193d(this.f15250e, range.intersection(this.f15252m));
        }

        /* renamed from: h */
        public NavigableMap<C5918d0<C>, Range<C>> tailMap(C5918d0<C> d0Var, boolean z) {
            return mo36981g(Range.downTo(d0Var, BoundType.forBoolean(z)));
        }

        public int size() {
            return C6028l1.m16949u(mo29135a());
        }

        public C8193d(NavigableMap<C5918d0<C>, Range<C>> navigableMap, Range<C5918d0<C>> range) {
            this.f15250e = navigableMap;
            this.f15251l = new C8196e(navigableMap);
            this.f15252m = range;
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeSet$f */
    public final class C8199f extends TreeRangeSet<C> {

        /* renamed from: e */
        public final Range<C> f15267e;

        public C8199f(Range<C> range) {
            super(new C8200g(Range.all(), range, TreeRangeSet.this.rangesByLowerBound));
            this.f15267e = range;
        }

        public void add(Range<C> range) {
            C5850m.m16590k(this.f15267e.encloses(range), "Cannot add range %s to subRangeSet(%s)", range, this.f15267e);
            TreeRangeSet.super.add(range);
        }

        public void clear() {
            TreeRangeSet.this.remove(this.f15267e);
        }

        public boolean contains(C c) {
            return this.f15267e.contains(c) && TreeRangeSet.this.contains(c);
        }

        public boolean encloses(Range<C> range) {
            Range access$600;
            if (this.f15267e.isEmpty() || !this.f15267e.encloses(range) || (access$600 = TreeRangeSet.this.rangeEnclosing(range)) == null || access$600.intersection(this.f15267e).isEmpty()) {
                return false;
            }
            return true;
        }

        public Range<C> rangeContaining(C c) {
            Range rangeContaining;
            if (this.f15267e.contains(c) && (rangeContaining = TreeRangeSet.this.rangeContaining(c)) != null) {
                return rangeContaining.intersection(this.f15267e);
            }
            return null;
        }

        public void remove(Range<C> range) {
            if (range.isConnected(this.f15267e)) {
                TreeRangeSet.this.remove(range.intersection(this.f15267e));
            }
        }

        public C5962e2<C> subRangeSet(Range<C> range) {
            if (range.encloses(this.f15267e)) {
                return this;
            }
            if (range.isConnected(this.f15267e)) {
                return new C8199f(this.f15267e.intersection(range));
            }
            return ImmutableRangeSet.m22238of();
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeSet$g */
    public static final class C8200g<C extends Comparable<?>> extends C6006j<C5918d0<C>, Range<C>> {

        /* renamed from: e */
        public final Range<C5918d0<C>> f15269e;

        /* renamed from: l */
        public final Range<C> f15270l;

        /* renamed from: m */
        public final NavigableMap<C5918d0<C>, Range<C>> f15271m;

        /* renamed from: n */
        public final NavigableMap<C5918d0<C>, Range<C>> f15272n;

        /* renamed from: com.google.common.collect.TreeRangeSet$g$a */
        public class C8201a extends C5886c<Map.Entry<C5918d0<C>, Range<C>>> {

            /* renamed from: m */
            public final /* synthetic */ Iterator f15273m;

            /* renamed from: n */
            public final /* synthetic */ C5918d0 f15274n;

            public C8201a(Iterator it, C5918d0 d0Var) {
                this.f15273m = it;
                this.f15274n = d0Var;
            }

            /* renamed from: d */
            public Map.Entry<C5918d0<C>, Range<C>> mo29067a() {
                if (!this.f15273m.hasNext()) {
                    return (Map.Entry) mo29068b();
                }
                Range range = (Range) this.f15273m.next();
                if (this.f15274n.mo29182q(range.lowerBound)) {
                    return (Map.Entry) mo29068b();
                }
                Range intersection = range.intersection(C8200g.this.f15270l);
                return C6108q1.m17173i(intersection.lowerBound, intersection);
            }
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$g$b */
        public class C8202b extends C5886c<Map.Entry<C5918d0<C>, Range<C>>> {

            /* renamed from: m */
            public final /* synthetic */ Iterator f15276m;

            public C8202b(Iterator it) {
                this.f15276m = it;
            }

            /* renamed from: d */
            public Map.Entry<C5918d0<C>, Range<C>> mo29067a() {
                if (!this.f15276m.hasNext()) {
                    return (Map.Entry) mo29068b();
                }
                Range range = (Range) this.f15276m.next();
                if (C8200g.this.f15270l.lowerBound.compareTo(range.upperBound) >= 0) {
                    return (Map.Entry) mo29068b();
                }
                Range intersection = range.intersection(C8200g.this.f15270l);
                if (C8200g.this.f15269e.contains(intersection.lowerBound)) {
                    return C6108q1.m17173i(intersection.lowerBound, intersection);
                }
                return (Map.Entry) mo29068b();
            }
        }

        /* renamed from: a */
        public Iterator<Map.Entry<C5918d0<C>, Range<C>>> mo29135a() {
            Iterator it;
            if (this.f15270l.isEmpty()) {
                return C6028l1.m16936h();
            }
            if (this.f15269e.upperBound.mo29182q(this.f15270l.lowerBound)) {
                return C6028l1.m16936h();
            }
            boolean z = false;
            if (this.f15269e.lowerBound.mo29182q(this.f15270l.lowerBound)) {
                it = this.f15272n.tailMap(this.f15270l.lowerBound, false).values().iterator();
            } else {
                NavigableMap<C5918d0<C>, Range<C>> navigableMap = this.f15271m;
                C n = this.f15269e.lowerBound.mo29180n();
                if (this.f15269e.lowerBoundType() == BoundType.CLOSED) {
                    z = true;
                }
                it = navigableMap.tailMap(n, z).values().iterator();
            }
            return new C8201a(it, (C5918d0) C6205z1.m17455e().mo29700d(this.f15269e.upperBound, C5918d0.m16692g(this.f15270l.upperBound)));
        }

        /* renamed from: b */
        public Iterator<Map.Entry<C5918d0<C>, Range<C>>> mo29555b() {
            if (this.f15270l.isEmpty()) {
                return C6028l1.m16936h();
            }
            C5918d0 d0Var = (C5918d0) C6205z1.m17455e().mo29700d(this.f15269e.upperBound, C5918d0.m16692g(this.f15270l.upperBound));
            return new C8202b(this.f15271m.headMap(d0Var.mo29180n(), d0Var.mo29185u() == BoundType.CLOSED).descendingMap().values().iterator());
        }

        public Comparator<? super C5918d0<C>> comparator() {
            return C6205z1.m17455e();
        }

        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        /* renamed from: e */
        public Range<C> get(Object obj) {
            if (obj instanceof C5918d0) {
                try {
                    C5918d0 d0Var = (C5918d0) obj;
                    if (this.f15269e.contains(d0Var) && d0Var.compareTo(this.f15270l.lowerBound) >= 0) {
                        if (d0Var.compareTo(this.f15270l.upperBound) < 0) {
                            if (d0Var.equals(this.f15270l.lowerBound)) {
                                Range range = (Range) C6108q1.m17163D(this.f15271m.floorEntry(d0Var));
                                if (range != null && range.upperBound.compareTo(this.f15270l.lowerBound) > 0) {
                                    return range.intersection(this.f15270l);
                                }
                            } else {
                                Range range2 = (Range) this.f15271m.get(d0Var);
                                if (range2 != null) {
                                    return range2.intersection(this.f15270l);
                                }
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        /* renamed from: f */
        public NavigableMap<C5918d0<C>, Range<C>> headMap(C5918d0<C> d0Var, boolean z) {
            return mo37011h(Range.upTo(d0Var, BoundType.forBoolean(z)));
        }

        /* renamed from: g */
        public NavigableMap<C5918d0<C>, Range<C>> subMap(C5918d0<C> d0Var, boolean z, C5918d0<C> d0Var2, boolean z2) {
            return mo37011h(Range.range(d0Var, BoundType.forBoolean(z), d0Var2, BoundType.forBoolean(z2)));
        }

        /* renamed from: h */
        public final NavigableMap<C5918d0<C>, Range<C>> mo37011h(Range<C5918d0<C>> range) {
            if (!range.isConnected(this.f15269e)) {
                return ImmutableSortedMap.m22280of();
            }
            return new C8200g(this.f15269e.intersection(range), this.f15270l, this.f15271m);
        }

        /* renamed from: i */
        public NavigableMap<C5918d0<C>, Range<C>> tailMap(C5918d0<C> d0Var, boolean z) {
            return mo37011h(Range.downTo(d0Var, BoundType.forBoolean(z)));
        }

        public int size() {
            return C6028l1.m16949u(mo29135a());
        }

        public C8200g(Range<C5918d0<C>> range, Range<C> range2, NavigableMap<C5918d0<C>, Range<C>> navigableMap) {
            C5850m.m16594o(range);
            this.f15269e = range;
            C5850m.m16594o(range2);
            this.f15270l = range2;
            C5850m.m16594o(navigableMap);
            this.f15271m = navigableMap;
            this.f15272n = new C8196e(navigableMap);
        }
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create() {
        return new TreeRangeSet<>(new TreeMap());
    }

    /* access modifiers changed from: private */
    public Range<C> rangeEnclosing(Range<C> range) {
        C5850m.m16594o(range);
        Map.Entry<C5918d0<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        if (floorEntry == null || !floorEntry.getValue().encloses(range)) {
            return null;
        }
        return floorEntry.getValue();
    }

    private void replaceRangeWithSameLowerBound(Range<C> range) {
        if (range.isEmpty()) {
            this.rangesByLowerBound.remove(range.lowerBound);
        } else {
            this.rangesByLowerBound.put(range.lowerBound, range);
        }
    }

    public void add(Range<C> range) {
        C5850m.m16594o(range);
        if (!range.isEmpty()) {
            C5918d0<C> d0Var = range.lowerBound;
            C5918d0<C> d0Var2 = range.upperBound;
            Map.Entry<K, V> lowerEntry = this.rangesByLowerBound.lowerEntry(d0Var);
            if (lowerEntry != null) {
                Range range2 = (Range) lowerEntry.getValue();
                if (range2.upperBound.compareTo(d0Var) >= 0) {
                    if (range2.upperBound.compareTo(d0Var2) >= 0) {
                        d0Var2 = range2.upperBound;
                    }
                    d0Var = range2.lowerBound;
                }
            }
            Map.Entry<K, V> floorEntry = this.rangesByLowerBound.floorEntry(d0Var2);
            if (floorEntry != null) {
                Range range3 = (Range) floorEntry.getValue();
                if (range3.upperBound.compareTo(d0Var2) >= 0) {
                    d0Var2 = range3.upperBound;
                }
            }
            this.rangesByLowerBound.subMap(d0Var, d0Var2).clear();
            replaceRangeWithSameLowerBound(Range.create(d0Var, d0Var2));
        }
    }

    public /* bridge */ /* synthetic */ void addAll(C5962e2 e2Var) {
        super.addAll(e2Var);
    }

    public Set<Range<C>> asDescendingSetOfRanges() {
        Set<Range<C>> set = this.asDescendingSetOfRanges;
        if (set != null) {
            return set;
        }
        C8191b bVar = new C8191b(this, this.rangesByLowerBound.descendingMap().values());
        this.asDescendingSetOfRanges = bVar;
        return bVar;
    }

    public Set<Range<C>> asRanges() {
        Set<Range<C>> set = this.asRanges;
        if (set != null) {
            return set;
        }
        C8191b bVar = new C8191b(this, this.rangesByLowerBound.values());
        this.asRanges = bVar;
        return bVar;
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public C5962e2<C> complement() {
        C5962e2<C> e2Var = this.complement;
        if (e2Var != null) {
            return e2Var;
        }
        C8192c cVar = new C8192c();
        this.complement = cVar;
        return cVar;
    }

    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    public boolean encloses(Range<C> range) {
        C5850m.m16594o(range);
        Map.Entry<C5918d0<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        return floorEntry != null && floorEntry.getValue().encloses(range);
    }

    public /* bridge */ /* synthetic */ boolean enclosesAll(C5962e2 e2Var) {
        return super.enclosesAll(e2Var);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean intersects(Range<C> range) {
        C5850m.m16594o(range);
        Map.Entry<C5918d0<C>, Range<C>> ceilingEntry = this.rangesByLowerBound.ceilingEntry(range.lowerBound);
        if (ceilingEntry != null && ceilingEntry.getValue().isConnected(range) && !ceilingEntry.getValue().intersection(range).isEmpty()) {
            return true;
        }
        Map.Entry<C5918d0<C>, Range<C>> lowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        if (lowerEntry == null || !lowerEntry.getValue().isConnected(range) || lowerEntry.getValue().intersection(range).isEmpty()) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public Range<C> rangeContaining(C c) {
        C5850m.m16594o(c);
        Map.Entry<C5918d0<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(C5918d0.m16692g(c));
        if (floorEntry == null || !floorEntry.getValue().contains(c)) {
            return null;
        }
        return floorEntry.getValue();
    }

    public void remove(Range<C> range) {
        C5850m.m16594o(range);
        if (!range.isEmpty()) {
            Map.Entry<C5918d0<C>, Range<C>> lowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
            if (lowerEntry != null) {
                Range value = lowerEntry.getValue();
                if (value.upperBound.compareTo(range.lowerBound) >= 0) {
                    if (range.hasUpperBound() && value.upperBound.compareTo(range.upperBound) >= 0) {
                        replaceRangeWithSameLowerBound(Range.create(range.upperBound, value.upperBound));
                    }
                    replaceRangeWithSameLowerBound(Range.create(value.lowerBound, range.lowerBound));
                }
            }
            Map.Entry<C5918d0<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(range.upperBound);
            if (floorEntry != null) {
                Range value2 = floorEntry.getValue();
                if (range.hasUpperBound() && value2.upperBound.compareTo(range.upperBound) >= 0) {
                    replaceRangeWithSameLowerBound(Range.create(range.upperBound, value2.upperBound));
                }
            }
            this.rangesByLowerBound.subMap(range.lowerBound, range.upperBound).clear();
        }
    }

    public /* bridge */ /* synthetic */ void removeAll(C5962e2 e2Var) {
        super.removeAll(e2Var);
    }

    public Range<C> span() {
        Map.Entry<C5918d0<C>, Range<C>> firstEntry = this.rangesByLowerBound.firstEntry();
        Map.Entry<C5918d0<C>, Range<C>> lastEntry = this.rangesByLowerBound.lastEntry();
        if (firstEntry != null) {
            return Range.create(firstEntry.getValue().lowerBound, lastEntry.getValue().upperBound);
        }
        throw new NoSuchElementException();
    }

    public C5962e2<C> subRangeSet(Range<C> range) {
        return range.equals(Range.all()) ? this : new C8199f(range);
    }

    public TreeRangeSet(NavigableMap<C5918d0<C>, Range<C>> navigableMap) {
        this.rangesByLowerBound = navigableMap;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(C5962e2<C> e2Var) {
        TreeRangeSet<C> create = create();
        create.addAll((C5962e2) e2Var);
        return create;
    }

    public /* bridge */ /* synthetic */ void addAll(Iterable iterable) {
        super.addAll(iterable);
    }

    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    public /* bridge */ /* synthetic */ void removeAll(Iterable iterable) {
        super.removeAll(iterable);
    }

    /* renamed from: com.google.common.collect.TreeRangeSet$e */
    public static final class C8196e<C extends Comparable<?>> extends C6006j<C5918d0<C>, Range<C>> {

        /* renamed from: e */
        public final NavigableMap<C5918d0<C>, Range<C>> f15261e;

        /* renamed from: l */
        public final Range<C5918d0<C>> f15262l;

        /* renamed from: com.google.common.collect.TreeRangeSet$e$a */
        public class C8197a extends C5886c<Map.Entry<C5918d0<C>, Range<C>>> {

            /* renamed from: m */
            public final /* synthetic */ Iterator f15263m;

            public C8197a(Iterator it) {
                this.f15263m = it;
            }

            /* renamed from: d */
            public Map.Entry<C5918d0<C>, Range<C>> mo29067a() {
                if (!this.f15263m.hasNext()) {
                    return (Map.Entry) mo29068b();
                }
                Range range = (Range) this.f15263m.next();
                if (C8196e.this.f15262l.upperBound.mo29182q(range.upperBound)) {
                    return (Map.Entry) mo29068b();
                }
                return C6108q1.m17173i(range.upperBound, range);
            }
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$e$b */
        public class C8198b extends C5886c<Map.Entry<C5918d0<C>, Range<C>>> {

            /* renamed from: m */
            public final /* synthetic */ C5877a2 f15265m;

            public C8198b(C5877a2 a2Var) {
                this.f15265m = a2Var;
            }

            /* renamed from: d */
            public Map.Entry<C5918d0<C>, Range<C>> mo29067a() {
                if (!this.f15265m.hasNext()) {
                    return (Map.Entry) mo29068b();
                }
                Range range = (Range) this.f15265m.next();
                if (C8196e.this.f15262l.lowerBound.mo29182q(range.upperBound)) {
                    return C6108q1.m17173i(range.upperBound, range);
                }
                return (Map.Entry) mo29068b();
            }
        }

        public C8196e(NavigableMap<C5918d0<C>, Range<C>> navigableMap) {
            this.f15261e = navigableMap;
            this.f15262l = Range.all();
        }

        /* renamed from: a */
        public Iterator<Map.Entry<C5918d0<C>, Range<C>>> mo29135a() {
            Iterator it;
            if (!this.f15262l.hasLowerBound()) {
                it = this.f15261e.values().iterator();
            } else {
                Map.Entry<C5918d0<C>, Range<C>> lowerEntry = this.f15261e.lowerEntry(this.f15262l.lowerEndpoint());
                if (lowerEntry == null) {
                    it = this.f15261e.values().iterator();
                } else if (this.f15262l.lowerBound.mo29182q(lowerEntry.getValue().upperBound)) {
                    it = this.f15261e.tailMap(lowerEntry.getKey(), true).values().iterator();
                } else {
                    it = this.f15261e.tailMap(this.f15262l.lowerEndpoint(), true).values().iterator();
                }
            }
            return new C8197a(it);
        }

        /* renamed from: b */
        public Iterator<Map.Entry<C5918d0<C>, Range<C>>> mo29555b() {
            Collection collection;
            if (this.f15262l.hasUpperBound()) {
                collection = this.f15261e.headMap(this.f15262l.upperEndpoint(), false).descendingMap().values();
            } else {
                collection = this.f15261e.descendingMap().values();
            }
            C5877a2 p = C6028l1.m16944p(collection.iterator());
            if (p.hasNext() && this.f15262l.upperBound.mo29182q(((Range) p.peek()).upperBound)) {
                p.next();
            }
            return new C8198b(p);
        }

        public Comparator<? super C5918d0<C>> comparator() {
            return C6205z1.m17455e();
        }

        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        /* renamed from: d */
        public Range<C> get(Object obj) {
            Map.Entry<C5918d0<C>, Range<C>> lowerEntry;
            if (obj instanceof C5918d0) {
                try {
                    C5918d0 d0Var = (C5918d0) obj;
                    if (this.f15262l.contains(d0Var) && (lowerEntry = this.f15261e.lowerEntry(d0Var)) != null && lowerEntry.getValue().upperBound.equals(d0Var)) {
                        return lowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        /* renamed from: e */
        public NavigableMap<C5918d0<C>, Range<C>> headMap(C5918d0<C> d0Var, boolean z) {
            return mo36995g(Range.upTo(d0Var, BoundType.forBoolean(z)));
        }

        /* renamed from: f */
        public NavigableMap<C5918d0<C>, Range<C>> subMap(C5918d0<C> d0Var, boolean z, C5918d0<C> d0Var2, boolean z2) {
            return mo36995g(Range.range(d0Var, BoundType.forBoolean(z), d0Var2, BoundType.forBoolean(z2)));
        }

        /* renamed from: g */
        public final NavigableMap<C5918d0<C>, Range<C>> mo36995g(Range<C5918d0<C>> range) {
            if (range.isConnected(this.f15262l)) {
                return new C8196e(this.f15261e, range.intersection(this.f15262l));
            }
            return ImmutableSortedMap.m22280of();
        }

        /* renamed from: h */
        public NavigableMap<C5918d0<C>, Range<C>> tailMap(C5918d0<C> d0Var, boolean z) {
            return mo36995g(Range.downTo(d0Var, BoundType.forBoolean(z)));
        }

        public boolean isEmpty() {
            if (this.f15262l.equals(Range.all())) {
                return this.f15261e.isEmpty();
            }
            return !mo29135a().hasNext();
        }

        public int size() {
            if (this.f15262l.equals(Range.all())) {
                return this.f15261e.size();
            }
            return C6028l1.m16949u(mo29135a());
        }

        public C8196e(NavigableMap<C5918d0<C>, Range<C>> navigableMap, Range<C5918d0<C>> range) {
            this.f15261e = navigableMap;
            this.f15262l = range;
        }
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(Iterable<Range<C>> iterable) {
        TreeRangeSet<C> create = create();
        create.addAll((Iterable) iterable);
        return create;
    }
}
