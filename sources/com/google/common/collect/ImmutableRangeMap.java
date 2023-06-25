package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5918d0;
import p040c.p200q.p353b.p355b.C5926d2;
import p040c.p200q.p353b.p355b.C5991h3;
import p040c.p200q.p353b.p355b.C6046m2;
import p040c.p200q.p353b.p355b.C6049n1;
import p040c.p200q.p353b.p355b.C6108q1;
import p040c.p200q.p353b.p355b.C6186x2;

public class ImmutableRangeMap<K extends Comparable<?>, V> implements C5926d2<K, V>, Serializable {
    public static final ImmutableRangeMap<Comparable<?>, Object> EMPTY = new ImmutableRangeMap<>(ImmutableList.m22152of(), ImmutableList.m22152of());
    public static final long serialVersionUID = 0;
    public final transient ImmutableList<Range<K>> ranges;
    public final transient ImmutableList<V> values;

    /* renamed from: com.google.common.collect.ImmutableRangeMap$a */
    public class C8126a extends ImmutableList<Range<K>> {

        /* renamed from: e */
        public final /* synthetic */ int f15099e;

        /* renamed from: l */
        public final /* synthetic */ int f15100l;

        /* renamed from: m */
        public final /* synthetic */ Range f15101m;

        public C8126a(int i, int i2, Range range) {
            this.f15099e = i;
            this.f15100l = i2;
            this.f15101m = range;
        }

        /* renamed from: c */
        public Range<K> get(int i) {
            C5850m.m16592m(i, this.f15099e);
            if (i == 0 || i == this.f15099e - 1) {
                return ((Range) ImmutableRangeMap.this.ranges.get(i + this.f15100l)).intersection(this.f15101m);
            }
            return (Range) ImmutableRangeMap.this.ranges.get(i + this.f15100l);
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return this.f15099e;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeMap$b */
    public class C8127b extends ImmutableRangeMap<K, V> {

        /* renamed from: e */
        public final /* synthetic */ Range f15103e;

        /* renamed from: l */
        public final /* synthetic */ ImmutableRangeMap f15104l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8127b(ImmutableRangeMap immutableRangeMap, ImmutableList immutableList, ImmutableList immutableList2, Range range, ImmutableRangeMap immutableRangeMap2) {
            super(immutableList, immutableList2);
            this.f15103e = range;
            this.f15104l = immutableRangeMap2;
        }

        public /* bridge */ /* synthetic */ Map asDescendingMapOfRanges() {
            return ImmutableRangeMap.super.asDescendingMapOfRanges();
        }

        public /* bridge */ /* synthetic */ Map asMapOfRanges() {
            return ImmutableRangeMap.super.asMapOfRanges();
        }

        public ImmutableRangeMap<K, V> subRangeMap(Range<K> range) {
            if (this.f15103e.isConnected(range)) {
                return this.f15104l.subRangeMap((Range) range.intersection(this.f15103e));
            }
            return ImmutableRangeMap.m22232of();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeMap$c */
    public static final class C8128c<K extends Comparable<?>, V> {

        /* renamed from: a */
        public final List<Map.Entry<Range<K>, V>> f15105a = C6049n1.m16979g();

        /* renamed from: a */
        public ImmutableRangeMap<K, V> mo36722a() {
            Collections.sort(this.f15105a, Range.rangeLexOrdering().mo30153f());
            ImmutableList.C8100a aVar = new ImmutableList.C8100a(this.f15105a.size());
            ImmutableList.C8100a aVar2 = new ImmutableList.C8100a(this.f15105a.size());
            for (int i = 0; i < this.f15105a.size(); i++) {
                Range range = (Range) this.f15105a.get(i).getKey();
                if (i > 0) {
                    Range range2 = (Range) this.f15105a.get(i - 1).getKey();
                    if (range.isConnected(range2) && !range.intersection(range2).isEmpty()) {
                        throw new IllegalArgumentException("Overlapping ranges: range " + range2 + " overlaps with entry " + range);
                    }
                }
                aVar.mo36637h(range);
                aVar2.mo36637h(this.f15105a.get(i).getValue());
            }
            return new ImmutableRangeMap<>(aVar.mo36639j(), aVar2.mo36639j());
        }

        /* renamed from: b */
        public C8128c<K, V> mo36723b(Range<K> range, V v) {
            C5850m.m16594o(range);
            C5850m.m16594o(v);
            C5850m.m16589j(!range.isEmpty(), "Range must not be empty, but was %s", range);
            this.f15105a.add(C6108q1.m17173i(range, v));
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeMap$d */
    public static class C8129d<K extends Comparable<?>, V> implements Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final ImmutableMap<Range<K>, V> f15106e;

        public C8129d(ImmutableMap<Range<K>, V> immutableMap) {
            this.f15106e = immutableMap;
        }

        /* renamed from: a */
        public Object mo36724a() {
            C8128c cVar = new C8128c();
            C5991h3<Map.Entry<Range<K>, V>> it = this.f15106e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                cVar.mo36723b((Range) next.getKey(), next.getValue());
            }
            return cVar.mo36722a();
        }

        public Object readResolve() {
            if (this.f15106e.isEmpty()) {
                return ImmutableRangeMap.m22232of();
            }
            return mo36724a();
        }
    }

    public ImmutableRangeMap(ImmutableList<Range<K>> immutableList, ImmutableList<V> immutableList2) {
        this.ranges = immutableList;
        this.values = immutableList2;
    }

    public static <K extends Comparable<?>, V> C8128c<K, V> builder() {
        return new C8128c<>();
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> copyOf(C5926d2<K, ? extends V> d2Var) {
        if (d2Var instanceof ImmutableRangeMap) {
            return (ImmutableRangeMap) d2Var;
        }
        Map<Range<K>, ? extends V> asMapOfRanges = d2Var.asMapOfRanges();
        ImmutableList.C8100a aVar = new ImmutableList.C8100a(asMapOfRanges.size());
        ImmutableList.C8100a aVar2 = new ImmutableList.C8100a(asMapOfRanges.size());
        for (Map.Entry next : asMapOfRanges.entrySet()) {
            aVar.mo36637h(next.getKey());
            aVar2.mo36637h(next.getValue());
        }
        return new ImmutableRangeMap<>(aVar.mo36639j(), aVar2.mo36639j());
    }

    /* renamed from: of */
    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> m22232of() {
        return EMPTY;
    }

    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5926d2) {
            return asMapOfRanges().equals(((C5926d2) obj).asMapOfRanges());
        }
        return false;
    }

    public V get(K k) {
        int a = C6186x2.m17385a(this.ranges, Range.lowerBoundFn(), C5918d0.m16692g(k), C6186x2.C6192c.ANY_PRESENT, C6186x2.C6188b.NEXT_LOWER);
        if (a != -1 && this.ranges.get(a).contains(k)) {
            return this.values.get(a);
        }
        return null;
    }

    public Map.Entry<Range<K>, V> getEntry(K k) {
        int a = C6186x2.m17385a(this.ranges, Range.lowerBoundFn(), C5918d0.m16692g(k), C6186x2.C6192c.ANY_PRESENT, C6186x2.C6188b.NEXT_LOWER);
        if (a == -1) {
            return null;
        }
        Range range = this.ranges.get(a);
        if (range.contains(k)) {
            return C6108q1.m17173i(range, this.values.get(a));
        }
        return null;
    }

    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Deprecated
    public void put(Range<K> range, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void putAll(C5926d2<K, V> d2Var) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void putCoalescing(Range<K> range, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void remove(Range<K> range) {
        throw new UnsupportedOperationException();
    }

    public Range<K> span() {
        if (!this.ranges.isEmpty()) {
            ImmutableList<Range<K>> immutableList = this.ranges;
            return Range.create(this.ranges.get(0).lowerBound, immutableList.get(immutableList.size() - 1).upperBound);
        }
        throw new NoSuchElementException();
    }

    public String toString() {
        return asMapOfRanges().toString();
    }

    public Object writeReplace() {
        return new C8129d(asMapOfRanges());
    }

    /* renamed from: of */
    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> m22233of(Range<K> range, V v) {
        return new ImmutableRangeMap<>(ImmutableList.m22153of(range), ImmutableList.m22153of(v));
    }

    public ImmutableMap<Range<K>, V> asDescendingMapOfRanges() {
        if (this.ranges.isEmpty()) {
            return ImmutableMap.m22184of();
        }
        return new ImmutableSortedMap(new C6046m2(this.ranges.reverse(), Range.rangeLexOrdering().mo29701h()), this.values.reverse());
    }

    public ImmutableMap<Range<K>, V> asMapOfRanges() {
        if (this.ranges.isEmpty()) {
            return ImmutableMap.m22184of();
        }
        return new ImmutableSortedMap(new C6046m2(this.ranges, Range.rangeLexOrdering()), this.values);
    }

    public ImmutableRangeMap<K, V> subRangeMap(Range<K> range) {
        C5850m.m16594o(range);
        if (range.isEmpty()) {
            return m22232of();
        }
        if (this.ranges.isEmpty() || range.encloses(span())) {
            return this;
        }
        int a = C6186x2.m17385a(this.ranges, Range.upperBoundFn(), range.lowerBound, C6186x2.C6192c.FIRST_AFTER, C6186x2.C6188b.NEXT_HIGHER);
        int a2 = C6186x2.m17385a(this.ranges, Range.lowerBoundFn(), range.upperBound, C6186x2.C6192c.ANY_PRESENT, C6186x2.C6188b.NEXT_HIGHER);
        if (a >= a2) {
            return m22232of();
        }
        return new C8127b(this, new C8126a(a2 - a, a, range), this.values.subList(a, a2), range, this);
    }
}
