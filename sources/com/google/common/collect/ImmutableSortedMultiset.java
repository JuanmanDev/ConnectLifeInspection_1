package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultiset;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5970f0;
import p040c.p200q.p353b.p355b.C5989h1;
import p040c.p200q.p353b.p355b.C6039l2;
import p040c.p200q.p353b.p355b.C6046m2;
import p040c.p200q.p353b.p355b.C6049n1;
import p040c.p200q.p353b.p355b.C6153t1;
import p040c.p200q.p353b.p355b.C6166v;
import p040c.p200q.p353b.p355b.C6202y2;
import p040c.p200q.p353b.p355b.C6205z1;
import p040c.p200q.p353b.p357d.C6236c;

public abstract class ImmutableSortedMultiset<E> extends C5989h1<E> implements C6202y2<E> {
    public transient ImmutableSortedMultiset<E> descendingMultiset;

    /* renamed from: com.google.common.collect.ImmutableSortedMultiset$a */
    public static class C8148a<E> extends ImmutableMultiset.C8123b<E> {

        /* renamed from: d */
        public final Comparator<? super E> f15140d;

        /* renamed from: e */
        public E[] f15141e = new Object[4];

        /* renamed from: f */
        public int[] f15142f = new int[4];

        /* renamed from: g */
        public int f15143g;

        /* renamed from: h */
        public boolean f15144h;

        public C8148a(Comparator<? super E> comparator) {
            super(true);
            C5850m.m16594o(comparator);
            this.f15140d = comparator;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ ImmutableCollection.C8099b mo36621a(Object obj) {
            mo36801m(obj);
            return this;
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ ImmutableMultiset.C8123b mo36696f(Object obj) {
            mo36801m(obj);
            return this;
        }

        /* renamed from: g */
        public /* bridge */ /* synthetic */ ImmutableMultiset.C8123b mo36697g(Object[] objArr) {
            mo36802n(objArr);
            return this;
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ ImmutableMultiset.C8123b mo36698h(Iterable iterable) {
            mo36803o(iterable);
            return this;
        }

        /* renamed from: i */
        public /* bridge */ /* synthetic */ ImmutableMultiset.C8123b mo36699i(Iterator it) {
            mo36804p(it);
            return this;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ ImmutableMultiset.C8123b mo36700j(Object obj, int i) {
            mo36805q(obj, i);
            return this;
        }

        /* renamed from: m */
        public C8148a<E> mo36801m(E e) {
            mo36805q(e, 1);
            return this;
        }

        /* renamed from: n */
        public C8148a<E> mo36802n(E... eArr) {
            for (E m : eArr) {
                mo36801m(m);
            }
            return this;
        }

        /* renamed from: o */
        public C8148a<E> mo36803o(Iterable<? extends E> iterable) {
            if (iterable instanceof C6153t1) {
                for (C6153t1.C6154a aVar : ((C6153t1) iterable).entrySet()) {
                    mo36805q(aVar.mo29977a(), aVar.getCount());
                }
            } else {
                for (Object m : iterable) {
                    mo36801m(m);
                }
            }
            return this;
        }

        /* renamed from: p */
        public C8148a<E> mo36804p(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo36801m(it.next());
            }
            return this;
        }

        /* renamed from: q */
        public C8148a<E> mo36805q(E e, int i) {
            C5850m.m16594o(e);
            C6166v.m17276b(i, "occurrences");
            if (i == 0) {
                return this;
            }
            mo36809u();
            E[] eArr = this.f15141e;
            int i2 = this.f15143g;
            eArr[i2] = e;
            this.f15142f[i2] = i;
            this.f15143g = i2 + 1;
            return this;
        }

        /* renamed from: r */
        public ImmutableSortedMultiset<E> mo36701k() {
            mo36808t();
            int i = this.f15143g;
            if (i == 0) {
                return ImmutableSortedMultiset.emptyMultiset(this.f15140d);
            }
            C6046m2 m2Var = (C6046m2) ImmutableSortedSet.construct(this.f15140d, i, this.f15141e);
            long[] jArr = new long[(this.f15143g + 1)];
            int i2 = 0;
            while (i2 < this.f15143g) {
                int i3 = i2 + 1;
                jArr[i3] = jArr[i2] + ((long) this.f15142f[i2]);
                i2 = i3;
            }
            this.f15144h = true;
            return new C6039l2(m2Var, jArr, 0, this.f15143g);
        }

        /* renamed from: s */
        public final void mo36807s(boolean z) {
            int i = this.f15143g;
            if (i != 0) {
                E[] copyOf = Arrays.copyOf(this.f15141e, i);
                Arrays.sort(copyOf, this.f15140d);
                int i2 = 1;
                for (int i3 = 1; i3 < copyOf.length; i3++) {
                    if (this.f15140d.compare(copyOf[i2 - 1], copyOf[i3]) < 0) {
                        copyOf[i2] = copyOf[i3];
                        i2++;
                    }
                }
                Arrays.fill(copyOf, i2, this.f15143g, (Object) null);
                if (z) {
                    int i4 = i2 * 4;
                    int i5 = this.f15143g;
                    if (i4 > i5 * 3) {
                        copyOf = Arrays.copyOf(copyOf, C6236c.m17537b(i5, (i5 / 2) + 1));
                    }
                }
                int[] iArr = new int[copyOf.length];
                for (int i6 = 0; i6 < this.f15143g; i6++) {
                    int binarySearch = Arrays.binarySearch(copyOf, 0, i2, this.f15141e[i6], this.f15140d);
                    int[] iArr2 = this.f15142f;
                    if (iArr2[i6] >= 0) {
                        iArr[binarySearch] = iArr[binarySearch] + iArr2[i6];
                    } else {
                        iArr[binarySearch] = ~iArr2[i6];
                    }
                }
                this.f15141e = copyOf;
                this.f15142f = iArr;
                this.f15143g = i2;
            }
        }

        /* renamed from: t */
        public final void mo36808t() {
            mo36807s(false);
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.f15143g;
                if (i < i3) {
                    int[] iArr = this.f15142f;
                    if (iArr[i] > 0) {
                        E[] eArr = this.f15141e;
                        eArr[i2] = eArr[i];
                        iArr[i2] = iArr[i];
                        i2++;
                    }
                    i++;
                } else {
                    Arrays.fill(this.f15141e, i2, i3, (Object) null);
                    Arrays.fill(this.f15142f, i2, this.f15143g, 0);
                    this.f15143g = i2;
                    return;
                }
            }
        }

        /* renamed from: u */
        public final void mo36809u() {
            int i = this.f15143g;
            E[] eArr = this.f15141e;
            if (i == eArr.length) {
                mo36807s(true);
            } else if (this.f15144h) {
                this.f15141e = Arrays.copyOf(eArr, eArr.length);
            }
            this.f15144h = false;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSortedMultiset$b */
    public static final class C8149b<E> implements Serializable {

        /* renamed from: e */
        public final Comparator<? super E> f15145e;

        /* renamed from: l */
        public final E[] f15146l;

        /* renamed from: m */
        public final int[] f15147m;

        public C8149b(C6202y2<E> y2Var) {
            this.f15145e = y2Var.comparator();
            int size = y2Var.entrySet().size();
            this.f15146l = new Object[size];
            this.f15147m = new int[size];
            int i = 0;
            for (C6153t1.C6154a next : y2Var.entrySet()) {
                this.f15146l[i] = next.mo29977a();
                this.f15147m[i] = next.getCount();
                i++;
            }
        }

        public Object readResolve() {
            int length = this.f15146l.length;
            C8148a aVar = new C8148a(this.f15145e);
            for (int i = 0; i < length; i++) {
                aVar.mo36805q(this.f15146l[i], this.f15147m[i]);
            }
            return aVar.mo36701k();
        }
    }

    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> copyOf(E[] eArr) {
        return copyOf(C6205z1.m17455e(), Arrays.asList(eArr));
    }

    public static <E> ImmutableSortedMultiset<E> copyOfSorted(C6202y2<E> y2Var) {
        return copyOfSortedEntries(y2Var.comparator(), C6049n1.m16980h(y2Var.entrySet()));
    }

    public static <E> ImmutableSortedMultiset<E> copyOfSortedEntries(Comparator<? super E> comparator, Collection<C6153t1.C6154a<E>> collection) {
        if (collection.isEmpty()) {
            return emptyMultiset(comparator);
        }
        ImmutableList.C8100a aVar = new ImmutableList.C8100a(collection.size());
        long[] jArr = new long[(collection.size() + 1)];
        int i = 0;
        for (C6153t1.C6154a next : collection) {
            aVar.mo36637h(next.mo29977a());
            int i2 = i + 1;
            jArr[i2] = jArr[i] + ((long) next.getCount());
            i = i2;
        }
        return new C6039l2(new C6046m2(aVar.mo36639j(), comparator), jArr, 0, collection.size());
    }

    public static <E> ImmutableSortedMultiset<E> emptyMultiset(Comparator<? super E> comparator) {
        if (C6205z1.m17455e().equals(comparator)) {
            return C6039l2.f11621p;
        }
        return new C6039l2(comparator);
    }

    public static <E extends Comparable<?>> C8148a<E> naturalOrder() {
        return new C8148a<>(C6205z1.m17455e());
    }

    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m22301of() {
        return C6039l2.f11621p;
    }

    public static <E> C8148a<E> orderedBy(Comparator<E> comparator) {
        return new C8148a<>(comparator);
    }

    public static <E extends Comparable<?>> C8148a<E> reverseOrder() {
        return new C8148a<>(C6205z1.m17455e().mo29701h());
    }

    public final Comparator<? super E> comparator() {
        return elementSet().comparator();
    }

    public abstract /* synthetic */ int count(Object obj);

    public abstract ImmutableSortedSet<E> elementSet();

    public abstract /* synthetic */ C6153t1.C6154a<E> firstEntry();

    public abstract ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType);

    public abstract /* synthetic */ C6153t1.C6154a<E> lastEntry();

    @Deprecated
    public final C6153t1.C6154a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final C6153t1.C6154a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType);

    public Object writeReplace() {
        return new C8149b(this);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(C6205z1.m17455e(), iterable);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> m22302of(E e) {
        return new C6039l2((C6046m2) ImmutableSortedSet.m22325of(e), new long[]{0, 1}, 0, 1);
    }

    public ImmutableSortedMultiset<E> descendingMultiset() {
        ImmutableSortedMultiset<E> immutableSortedMultiset = this.descendingMultiset;
        if (immutableSortedMultiset == null) {
            immutableSortedMultiset = isEmpty() ? emptyMultiset(C6205z1.m17454a(comparator()).mo29701h()) : new C5970f0<>(this);
            this.descendingMultiset = immutableSortedMultiset;
        }
        return immutableSortedMultiset;
    }

    public ImmutableSortedMultiset<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        C5850m.m16590k(comparator().compare(e, e2) <= 0, "Expected lowerBound <= upperBound but %s > %s", e, e2);
        return tailMultiset((Object) e, boundType).headMultiset((Object) e2, boundType2);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterator<? extends E> it) {
        return copyOf(C6205z1.m17455e(), it);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> m22303of(E e, E e2) {
        return copyOf(C6205z1.m17455e(), Arrays.asList(new Comparable[]{e, e2}));
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        C5850m.m16594o(comparator);
        C8148a aVar = new C8148a(comparator);
        aVar.mo36804p(it);
        return aVar.mo36701k();
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> m22304of(E e, E e2, E e3) {
        return copyOf(C6205z1.m17455e(), Arrays.asList(new Comparable[]{e, e2, e3}));
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> m22305of(E e, E e2, E e3, E e4) {
        return copyOf(C6205z1.m17455e(), Arrays.asList(new Comparable[]{e, e2, e3, e4}));
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableSortedMultiset) {
            ImmutableSortedMultiset<E> immutableSortedMultiset = (ImmutableSortedMultiset) iterable;
            if (comparator.equals(immutableSortedMultiset.comparator())) {
                return immutableSortedMultiset.isPartialView() ? copyOfSortedEntries(comparator, immutableSortedMultiset.entrySet().asList()) : immutableSortedMultiset;
            }
        }
        C8148a aVar = new C8148a(comparator);
        aVar.mo36803o(iterable);
        return aVar.mo36701k();
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> m22306of(E e, E e2, E e3, E e4, E e5) {
        return copyOf(C6205z1.m17455e(), Arrays.asList(new Comparable[]{e, e2, e3, e4, e5}));
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> m22307of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        ArrayList j = C6049n1.m16982j(eArr.length + 6);
        Collections.addAll(j, new Comparable[]{e, e2, e3, e4, e5, e6});
        Collections.addAll(j, eArr);
        return copyOf(C6205z1.m17455e(), j);
    }
}
