package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5991h3;
import p040c.p200q.p353b.p355b.C6025k2;
import p040c.p200q.p353b.p355b.C6148s2;
import p040c.p200q.p353b.p355b.C6155t2;
import p040c.p200q.p353b.p355b.C6166v;
import p040c.p200q.p353b.p355b.C6172w1;
import p040c.p200q.p353b.p355b.C6204z0;

public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    public static final int CUTOFF = 751619276;
    public static final double DESIRED_LOAD_FACTOR = 0.7d;
    public static final int MAX_TABLE_SIZE = 1073741824;
    public transient ImmutableList<E> asList;

    /* renamed from: com.google.common.collect.ImmutableSet$a */
    public static class C8138a<E> extends ImmutableCollection.C8098a<E> {

        /* renamed from: d */
        public Object[] f15128d;

        /* renamed from: e */
        public int f15129e;

        public C8138a() {
            super(4);
        }

        /* renamed from: h */
        public C8138a<E> mo36621a(E e) {
            C5850m.m16594o(e);
            if (this.f15128d == null || ImmutableSet.chooseTableSize(this.f15056b) > this.f15128d.length) {
                this.f15128d = null;
                super.mo36619f(e);
                return this;
            }
            mo36757k(e);
            return this;
        }

        /* renamed from: i */
        public C8138a<E> mo36755i(E... eArr) {
            if (this.f15128d != null) {
                for (E h : eArr) {
                    mo36621a(h);
                }
            } else {
                super.mo36618b(eArr);
            }
            return this;
        }

        /* renamed from: j */
        public C8138a<E> mo36756j(Iterator<? extends E> it) {
            C5850m.m16594o(it);
            while (it.hasNext()) {
                mo36621a(it.next());
            }
            return this;
        }

        /* renamed from: k */
        public final void mo36757k(E e) {
            int length = this.f15128d.length - 1;
            int hashCode = e.hashCode();
            int c = C6204z0.m17452c(hashCode);
            while (true) {
                int i = c & length;
                Object[] objArr = this.f15128d;
                Object obj = objArr[i];
                if (obj == null) {
                    objArr[i] = e;
                    this.f15129e += hashCode;
                    super.mo36619f(e);
                    return;
                } else if (!obj.equals(e)) {
                    c = i + 1;
                } else {
                    return;
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.common.collect.ImmutableSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: c.q.b.b.k2} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: c.q.b.b.k2} */
        /* JADX WARNING: type inference failed for: r0v5, types: [com.google.common.collect.ImmutableSet<E>] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.common.collect.ImmutableSet<E> mo36758l() {
            /*
                r8 = this;
                int r0 = r8.f15056b
                if (r0 == 0) goto L_0x0059
                r1 = 1
                if (r0 == r1) goto L_0x004f
                java.lang.Object[] r2 = r8.f15128d
                if (r2 == 0) goto L_0x003b
                int r0 = com.google.common.collect.ImmutableSet.chooseTableSize(r0)
                java.lang.Object[] r2 = r8.f15128d
                int r2 = r2.length
                if (r0 != r2) goto L_0x003b
                int r0 = r8.f15056b
                java.lang.Object[] r2 = r8.f15055a
                int r2 = r2.length
                boolean r0 = com.google.common.collect.ImmutableSet.shouldTrim(r0, r2)
                if (r0 == 0) goto L_0x0028
                java.lang.Object[] r0 = r8.f15055a
                int r2 = r8.f15056b
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
                goto L_0x002a
            L_0x0028:
                java.lang.Object[] r0 = r8.f15055a
            L_0x002a:
                r3 = r0
                c.q.b.b.k2 r0 = new c.q.b.b.k2
                int r4 = r8.f15129e
                java.lang.Object[] r5 = r8.f15128d
                int r2 = r5.length
                int r6 = r2 + -1
                int r7 = r8.f15056b
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0049
            L_0x003b:
                int r0 = r8.f15056b
                java.lang.Object[] r2 = r8.f15055a
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.construct(r0, r2)
                int r2 = r0.size()
                r8.f15056b = r2
            L_0x0049:
                r8.f15057c = r1
                r1 = 0
                r8.f15128d = r1
                return r0
            L_0x004f:
                java.lang.Object[] r0 = r8.f15055a
                r1 = 0
                r0 = r0[r1]
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.m22255of(r0)
                return r0
            L_0x0059:
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.m22254of()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSet.C8138a.mo36758l():com.google.common.collect.ImmutableSet");
        }

        public C8138a(int i) {
            super(i);
            this.f15128d = new Object[ImmutableSet.chooseTableSize(i)];
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSet$b */
    public static class C8139b implements Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final Object[] f15130e;

        public C8139b(Object[] objArr) {
            this.f15130e = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.copyOf((E[]) this.f15130e);
        }
    }

    public static <E> C8138a<E> builder() {
        return new C8138a<>();
    }

    public static <E> C8138a<E> builderWithExpectedSize(int i) {
        C6166v.m17276b(i, "expectedSize");
        return new C8138a<>(i);
    }

    public static int chooseTableSize(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        C5850m.m16584e(z, "collection too large");
        return 1073741824;
    }

    public static <E> ImmutableSet<E> construct(int i, Object... objArr) {
        if (i == 0) {
            return m22254of();
        }
        if (i == 1) {
            return m22255of(objArr[0]);
        }
        int chooseTableSize = chooseTableSize(i);
        Object[] objArr2 = new Object[chooseTableSize];
        int i2 = chooseTableSize - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            C6172w1.m17290a(obj, i5);
            int hashCode = obj.hashCode();
            int c = C6204z0.m17452c(hashCode);
            while (true) {
                int i6 = c & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += hashCode;
                    i4++;
                    break;
                } else if (obj2.equals(obj)) {
                    break;
                } else {
                    c++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new C6155t2(objArr[0], i3);
        }
        if (chooseTableSize(i4) < chooseTableSize / 2) {
            return construct(i4, objArr);
        }
        if (shouldTrim(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C6025k2(objArr, i3, objArr2, i2, i4);
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m22254of() {
        return C6025k2.f11592p;
    }

    public static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> createAsList = createAsList();
        this.asList = createAsList;
        return createAsList;
    }

    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(toArray());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableSet) || !isHashCodeFast() || !((ImmutableSet) obj).isHashCodeFast() || hashCode() == obj.hashCode()) {
            return C6148s2.m17248a(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return C6148s2.m17249b(this);
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract C5991h3<E> iterator();

    public Object writeReplace() {
        return new C8139b(toArray());
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m22255of(E e) {
        return new C6155t2(e);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m22256of(E e, E e2) {
        return construct(2, e, e2);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m22257of(E e, E e2, E e3) {
        return construct(3, e, e2, e3);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m22258of(E e, E e2, E e3, E e4) {
        return construct(4, e, e2, e3, e4);
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m22259of(E e, E e2, E e3, E e4, E e5) {
        return construct(5, e, e2, e3, e4, e5);
    }

    @SafeVarargs
    /* renamed from: of */
    public static <E> ImmutableSet<E> m22260of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        C5850m.m16584e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return construct(length, objArr);
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m22254of();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m22255of(next);
        }
        C8138a aVar = new C8138a();
        aVar.mo36621a(next);
        aVar.mo36756j(it);
        return aVar.mo36758l();
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m22254of();
        }
        if (length != 1) {
            return construct(eArr.length, (Object[]) eArr.clone());
        }
        return m22255of(eArr[0]);
    }
}
