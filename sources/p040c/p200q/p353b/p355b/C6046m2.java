package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.m2 */
/* compiled from: RegularImmutableSortedSet */
public final class C6046m2<E> extends ImmutableSortedSet<E> {

    /* renamed from: l */
    public static final C6046m2<Comparable> f11630l = new C6046m2<>(ImmutableList.m22152of(), C6205z1.m17455e());

    /* renamed from: e */
    public final transient ImmutableList<E> f11631e;

    public C6046m2(ImmutableList<E> immutableList, Comparator<? super E> comparator) {
        super(comparator);
        this.f11631e = immutableList;
    }

    public ImmutableList<E> asList() {
        return this.f11631e;
    }

    /* renamed from: c */
    public C6046m2<E> mo29637c(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new C6046m2<>(this.f11631e.subList(i, i2), this.comparator);
        }
        return ImmutableSortedSet.emptySet(this.comparator);
    }

    public E ceiling(E e) {
        int g = mo29640g(e, true);
        if (g == size()) {
            return null;
        }
        return this.f11631e.get(g);
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return mo29641l(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof C6153t1) {
            collection = ((C6153t1) collection).elementSet();
        }
        if (!C6173w2.m17299b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C5991h3 it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int unsafeCompare = unsafeCompare(next2, next);
                if (unsafeCompare < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (unsafeCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (unsafeCompare > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        return this.f11631e.copyIntoArray(objArr, i);
    }

    public ImmutableSortedSet<E> createDescendingSet() {
        Comparator<? super E> reverseOrder = Collections.reverseOrder(this.comparator);
        if (isEmpty()) {
            return ImmutableSortedSet.emptySet(reverseOrder);
        }
        return new C6046m2(this.f11631e.reverse(), reverseOrder);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Set r6 = (java.util.Set) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L_0x0017
            return r2
        L_0x0017:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x001e
            return r0
        L_0x001e:
            java.util.Comparator<? super E> r1 = r5.comparator
            boolean r1 = p040c.p200q.p353b.p355b.C6173w2.m17299b(r1, r6)
            if (r1 == 0) goto L_0x0047
            java.util.Iterator r6 = r6.iterator()
            c.q.b.b.h3 r1 = r5.iterator()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
        L_0x002e:
            boolean r3 = r1.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r1.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            java.lang.Object r4 = r6.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r4 == 0) goto L_0x0044
            int r3 = r5.unsafeCompare(r3, r4)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r3 == 0) goto L_0x002e
        L_0x0044:
            return r2
        L_0x0045:
            return r0
        L_0x0046:
            return r2
        L_0x0047:
            boolean r6 = r5.containsAll(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p353b.p355b.C6046m2.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public int mo29639f(E e, boolean z) {
        ImmutableList<E> immutableList = this.f11631e;
        C5850m.m16594o(e);
        int binarySearch = Collections.binarySearch(immutableList, e, comparator());
        if (binarySearch >= 0) {
            return z ? binarySearch + 1 : binarySearch;
        }
        return ~binarySearch;
    }

    public E first() {
        if (!isEmpty()) {
            return this.f11631e.get(0);
        }
        throw new NoSuchElementException();
    }

    public E floor(E e) {
        int f = mo29639f(e, true) - 1;
        if (f == -1) {
            return null;
        }
        return this.f11631e.get(f);
    }

    /* renamed from: g */
    public int mo29640g(E e, boolean z) {
        ImmutableList<E> immutableList = this.f11631e;
        C5850m.m16594o(e);
        int binarySearch = Collections.binarySearch(immutableList, e, comparator());
        if (binarySearch >= 0) {
            return z ? binarySearch : binarySearch + 1;
        }
        return ~binarySearch;
    }

    public ImmutableSortedSet<E> headSetImpl(E e, boolean z) {
        return mo29637c(0, mo29639f(e, z));
    }

    public E higher(E e) {
        int g = mo29640g(e, false);
        if (g == size()) {
            return null;
        }
        return this.f11631e.get(g);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int binarySearch = Collections.binarySearch(this.f11631e, obj, mo29642o());
            if (binarySearch >= 0) {
                return binarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public Object[] internalArray() {
        return this.f11631e.internalArray();
    }

    public int internalArrayEnd() {
        return this.f11631e.internalArrayEnd();
    }

    public int internalArrayStart() {
        return this.f11631e.internalArrayStart();
    }

    public boolean isPartialView() {
        return this.f11631e.isPartialView();
    }

    /* renamed from: l */
    public final int mo29641l(Object obj) {
        return Collections.binarySearch(this.f11631e, obj, mo29642o());
    }

    public E last() {
        if (!isEmpty()) {
            return this.f11631e.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    public E lower(E e) {
        int f = mo29639f(e, false) - 1;
        if (f == -1) {
            return null;
        }
        return this.f11631e.get(f);
    }

    /* renamed from: o */
    public Comparator<Object> mo29642o() {
        return this.comparator;
    }

    public int size() {
        return this.f11631e.size();
    }

    public ImmutableSortedSet<E> subSetImpl(E e, boolean z, E e2, boolean z2) {
        return tailSetImpl(e, z).headSetImpl(e2, z2);
    }

    public ImmutableSortedSet<E> tailSetImpl(E e, boolean z) {
        return mo29637c(mo29640g(e, z), size());
    }

    public C5991h3<E> descendingIterator() {
        return this.f11631e.reverse().iterator();
    }

    public C5991h3<E> iterator() {
        return this.f11631e.iterator();
    }
}
