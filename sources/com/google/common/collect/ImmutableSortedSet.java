package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5991h3;
import p040c.p200q.p353b.p355b.C5999i1;
import p040c.p200q.p353b.p355b.C6020k1;
import p040c.p200q.p353b.p355b.C6028l1;
import p040c.p200q.p353b.p355b.C6046m2;
import p040c.p200q.p353b.p355b.C6169v2;
import p040c.p200q.p353b.p355b.C6172w1;
import p040c.p200q.p353b.p355b.C6173w2;
import p040c.p200q.p353b.p355b.C6205z1;

public abstract class ImmutableSortedSet<E> extends C5999i1<E> implements NavigableSet<E>, C6169v2<E> {
    public final transient Comparator<? super E> comparator;
    public transient ImmutableSortedSet<E> descendingSet;

    /* renamed from: com.google.common.collect.ImmutableSortedSet$a */
    public static final class C8150a<E> extends ImmutableSet.C8138a<E> {

        /* renamed from: f */
        public final Comparator<? super E> f15148f;

        public C8150a(Comparator<? super E> comparator) {
            C5850m.m16594o(comparator);
            this.f15148f = comparator;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ ImmutableCollection.C8099b mo36621a(Object obj) {
            mo36814m(obj);
            return this;
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ ImmutableSet.C8138a mo36754h(Object obj) {
            mo36814m(obj);
            return this;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ ImmutableSet.C8138a mo36756j(Iterator it) {
            mo36816o(it);
            return this;
        }

        /* renamed from: m */
        public C8150a<E> mo36814m(E e) {
            super.mo36621a(e);
            return this;
        }

        /* renamed from: n */
        public C8150a<E> mo36815n(E... eArr) {
            super.mo36755i(eArr);
            return this;
        }

        /* renamed from: o */
        public C8150a<E> mo36816o(Iterator<? extends E> it) {
            super.mo36756j(it);
            return this;
        }

        /* renamed from: p */
        public ImmutableSortedSet<E> mo36758l() {
            ImmutableSortedSet<E> construct = ImmutableSortedSet.construct(this.f15148f, this.f15056b, this.f15055a);
            this.f15056b = construct.size();
            this.f15057c = true;
            return construct;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSortedSet$b */
    public static class C8151b<E> implements Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final Comparator<? super E> f15149e;

        /* renamed from: l */
        public final Object[] f15150l;

        public C8151b(Comparator<? super E> comparator, Object[] objArr) {
            this.f15149e = comparator;
            this.f15150l = objArr;
        }

        public Object readResolve() {
            C8150a aVar = new C8150a(this.f15149e);
            aVar.mo36815n(this.f15150l);
            return aVar.mo36758l();
        }
    }

    public ImmutableSortedSet(Comparator<? super E> comparator2) {
        this.comparator = comparator2;
    }

    public static <E> ImmutableSortedSet<E> construct(Comparator<? super E> comparator2, int i, E... eArr) {
        if (i == 0) {
            return emptySet(comparator2);
        }
        C6172w1.m17292c(eArr, i);
        Arrays.sort(eArr, 0, i, comparator2);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            E e = eArr[i3];
            if (comparator2.compare(e, eArr[i2 - 1]) != 0) {
                eArr[i2] = e;
                i2++;
            }
        }
        Arrays.fill(eArr, i2, i, (Object) null);
        if (i2 < eArr.length / 2) {
            eArr = Arrays.copyOf(eArr, i2);
        }
        return new C6046m2(ImmutableList.asImmutableList(eArr, i2), comparator2);
    }

    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> copyOf(E[] eArr) {
        return construct(C6205z1.m17455e(), eArr.length, (Object[]) eArr.clone());
    }

    public static <E> ImmutableSortedSet<E> copyOfSorted(SortedSet<E> sortedSet) {
        Comparator<? super E> a = C6173w2.m17298a(sortedSet);
        ImmutableList<E> copyOf = ImmutableList.copyOf(sortedSet);
        if (copyOf.isEmpty()) {
            return emptySet(a);
        }
        return new C6046m2(copyOf, a);
    }

    public static <E> C6046m2<E> emptySet(Comparator<? super E> comparator2) {
        if (C6205z1.m17455e().equals(comparator2)) {
            return C6046m2.f11630l;
        }
        return new C6046m2<>(ImmutableList.m22152of(), comparator2);
    }

    public static <E extends Comparable<?>> C8150a<E> naturalOrder() {
        return new C8150a<>(C6205z1.m17455e());
    }

    /* renamed from: of */
    public static <E> ImmutableSortedSet<E> m22324of() {
        return C6046m2.f11630l;
    }

    public static <E> C8150a<E> orderedBy(Comparator<E> comparator2) {
        return new C8150a<>(comparator2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<?>> C8150a<E> reverseOrder() {
        return new C8150a<>(Collections.reverseOrder());
    }

    public E ceiling(E e) {
        return C6020k1.m16918e(tailSet(e, true), null);
    }

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    public abstract ImmutableSortedSet<E> createDescendingSet();

    public abstract C5991h3<E> descendingIterator();

    public E first() {
        return iterator().next();
    }

    public E floor(E e) {
        return C6028l1.m16941m(headSet(e, true).descendingIterator(), null);
    }

    public abstract ImmutableSortedSet<E> headSetImpl(E e, boolean z);

    public E higher(E e) {
        return C6020k1.m16918e(tailSet(e, false), null);
    }

    public abstract int indexOf(Object obj);

    public abstract C5991h3<E> iterator();

    public E last() {
        return descendingIterator().next();
    }

    public E lower(E e) {
        return C6028l1.m16941m(headSet(e, false).descendingIterator(), null);
    }

    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableSortedSet<E> subSetImpl(E e, boolean z, E e2, boolean z2);

    public abstract ImmutableSortedSet<E> tailSetImpl(E e, boolean z);

    public int unsafeCompare(Object obj, Object obj2) {
        return unsafeCompare(this.comparator, obj, obj2);
    }

    public Object writeReplace() {
        return new C8151b(this.comparator, toArray());
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(C6205z1.m17455e(), iterable);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m22325of(E e) {
        return new C6046m2(ImmutableList.m22153of(e), C6205z1.m17455e());
    }

    public static int unsafeCompare(Comparator<?> comparator2, Object obj, Object obj2) {
        return comparator2.compare(obj, obj2);
    }

    public ImmutableSortedSet<E> descendingSet() {
        ImmutableSortedSet<E> immutableSortedSet = this.descendingSet;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet<E> createDescendingSet = createDescendingSet();
        this.descendingSet = createDescendingSet;
        createDescendingSet.descendingSet = this;
        return createDescendingSet;
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m22326of(E e, E e2) {
        return construct(C6205z1.m17455e(), 2, e, e2);
    }

    public ImmutableSortedSet<E> headSet(E e) {
        return headSet(e, false);
    }

    public ImmutableSortedSet<E> subSet(E e, E e2) {
        return subSet(e, true, e2, false);
    }

    public ImmutableSortedSet<E> tailSet(E e) {
        return tailSet(e, true);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Collection<? extends E> collection) {
        return copyOf(C6205z1.m17455e(), collection);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m22327of(E e, E e2, E e3) {
        return construct(C6205z1.m17455e(), 3, e, e2, e3);
    }

    public ImmutableSortedSet<E> headSet(E e, boolean z) {
        C5850m.m16594o(e);
        return headSetImpl(e, z);
    }

    public ImmutableSortedSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        C5850m.m16594o(e);
        C5850m.m16594o(e2);
        C5850m.m16583d(this.comparator.compare(e, e2) <= 0);
        return subSetImpl(e, z, e2, z2);
    }

    public ImmutableSortedSet<E> tailSet(E e, boolean z) {
        C5850m.m16594o(e);
        return tailSetImpl(e, z);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m22328of(E e, E e2, E e3, E e4) {
        return construct(C6205z1.m17455e(), 4, e, e2, e3, e4);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterator<? extends E> it) {
        return copyOf(C6205z1.m17455e(), it);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m22329of(E e, E e2, E e3, E e4, E e5) {
        return construct(C6205z1.m17455e(), 5, e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m22330of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        int length = eArr.length + 6;
        Comparable[] comparableArr = new Comparable[length];
        comparableArr[0] = e;
        comparableArr[1] = e2;
        comparableArr[2] = e3;
        comparableArr[3] = e4;
        comparableArr[4] = e5;
        comparableArr[5] = e6;
        System.arraycopy(eArr, 0, comparableArr, 6, eArr.length);
        return construct(C6205z1.m17455e(), length, comparableArr);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator2, Iterator<? extends E> it) {
        C8150a aVar = new C8150a(comparator2);
        aVar.mo36816o(it);
        return aVar.mo36758l();
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator2, Iterable<? extends E> iterable) {
        C5850m.m16594o(comparator2);
        if (C6173w2.m17299b(comparator2, iterable) && (iterable instanceof ImmutableSortedSet)) {
            ImmutableSortedSet<E> immutableSortedSet = (ImmutableSortedSet) iterable;
            if (!immutableSortedSet.isPartialView()) {
                return immutableSortedSet;
            }
        }
        Object[] k = C6020k1.m16924k(iterable);
        return construct(comparator2, k.length, k);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator2, Collection<? extends E> collection) {
        return copyOf(comparator2, collection);
    }
}
