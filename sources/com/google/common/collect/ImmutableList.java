package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5879b;
import p040c.p200q.p353b.p355b.C5990h2;
import p040c.p200q.p353b.p355b.C5991h3;
import p040c.p200q.p353b.p355b.C6005i3;
import p040c.p200q.p353b.p355b.C6020k1;
import p040c.p200q.p353b.p355b.C6049n1;
import p040c.p200q.p353b.p355b.C6166v;
import p040c.p200q.p353b.p355b.C6172w1;

public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    public static final C6005i3<Object> EMPTY_ITR = new C8101b(C5990h2.f11551m, 0);

    /* renamed from: com.google.common.collect.ImmutableList$a */
    public static final class C8100a<E> extends ImmutableCollection.C8098a<E> {
        public C8100a() {
            this(4);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ ImmutableCollection.C8099b mo36621a(Object obj) {
            mo36637h(obj);
            return this;
        }

        /* renamed from: h */
        public C8100a<E> mo36637h(E e) {
            super.mo36619f(e);
            return this;
        }

        /* renamed from: i */
        public C8100a<E> mo36638i(Iterator<? extends E> it) {
            super.mo36623d(it);
            return this;
        }

        /* renamed from: j */
        public ImmutableList<E> mo36639j() {
            this.f15057c = true;
            return ImmutableList.asImmutableList(this.f15055a, this.f15056b);
        }

        public C8100a(int i) {
            super(i);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableList$b */
    public static class C8101b<E> extends C5879b<E> {

        /* renamed from: m */
        public final ImmutableList<E> f15058m;

        public C8101b(ImmutableList<E> immutableList, int i) {
            super(immutableList.size(), i);
            this.f15058m = immutableList;
        }

        /* renamed from: a */
        public E mo29041a(int i) {
            return this.f15058m.get(i);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableList$c */
    public static class C8102c<E> extends ImmutableList<E> {

        /* renamed from: e */
        public final transient ImmutableList<E> f15059e;

        public C8102c(ImmutableList<E> immutableList) {
            this.f15059e = immutableList;
        }

        /* renamed from: c */
        public final int mo36640c(int i) {
            return (size() - 1) - i;
        }

        public boolean contains(Object obj) {
            return this.f15059e.contains(obj);
        }

        /* renamed from: f */
        public final int mo36641f(int i) {
            return size() - i;
        }

        public E get(int i) {
            C5850m.m16592m(i, size());
            return this.f15059e.get(mo36640c(i));
        }

        public int indexOf(Object obj) {
            int lastIndexOf = this.f15059e.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return mo36640c(lastIndexOf);
            }
            return -1;
        }

        public boolean isPartialView() {
            return this.f15059e.isPartialView();
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.iterator();
        }

        public int lastIndexOf(Object obj) {
            int indexOf = this.f15059e.indexOf(obj);
            if (indexOf >= 0) {
                return mo36640c(indexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }

        public ImmutableList<E> reverse() {
            return this.f15059e;
        }

        public int size() {
            return this.f15059e.size();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return ImmutableList.super.listIterator(i);
        }

        public ImmutableList<E> subList(int i, int i2) {
            C5850m.m16599t(i, i2, size());
            return this.f15059e.subList(mo36641f(i2), mo36641f(i)).reverse();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableList$d */
    public static class C8103d implements Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final Object[] f15060e;

        public C8103d(Object[] objArr) {
            this.f15060e = objArr;
        }

        public Object readResolve() {
            return ImmutableList.copyOf((E[]) this.f15060e);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableList$e */
    public class C8104e extends ImmutableList<E> {

        /* renamed from: e */
        public final transient int f15061e;

        /* renamed from: l */
        public final transient int f15062l;

        public C8104e(int i, int i2) {
            this.f15061e = i;
            this.f15062l = i2;
        }

        public E get(int i) {
            C5850m.m16592m(i, this.f15062l);
            return ImmutableList.this.get(i + this.f15061e);
        }

        public Object[] internalArray() {
            return ImmutableList.this.internalArray();
        }

        public int internalArrayEnd() {
            return ImmutableList.this.internalArrayStart() + this.f15061e + this.f15062l;
        }

        public int internalArrayStart() {
            return ImmutableList.this.internalArrayStart() + this.f15061e;
        }

        public boolean isPartialView() {
            return true;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.iterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }

        public int size() {
            return this.f15062l;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return ImmutableList.super.listIterator(i);
        }

        public ImmutableList<E> subList(int i, int i2) {
            C5850m.m16599t(i, i2, this.f15062l);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.f15061e;
            return immutableList.subList(i + i3, i2 + i3);
        }
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    public static <E> C8100a<E> builder() {
        return new C8100a<>();
    }

    public static <E> C8100a<E> builderWithExpectedSize(int i) {
        C6166v.m17276b(i, "expectedSize");
        return new C8100a<>(i);
    }

    public static <E> ImmutableList<E> construct(Object... objArr) {
        C6172w1.m17291b(objArr);
        return asImmutableList(objArr);
    }

    public static <E> ImmutableList<E> copyOf(Iterable<? extends E> iterable) {
        C5850m.m16594o(iterable);
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m22152of() {
        return C5990h2.f11551m;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<? super E>> ImmutableList<E> sortedCopyOf(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) C6020k1.m16925l(iterable, new Comparable[0]);
        C6172w1.m17291b(comparableArr);
        Arrays.sort(comparableArr);
        return asImmutableList(comparableArr);
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final ImmutableList<E> asList() {
        return this;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean equals(Object obj) {
        return C6049n1.m16974b(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C6049n1.m16975c(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C6049n1.m16977e(this, obj);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> reverse() {
        return size() <= 1 ? this : new C8102c(this);
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> subListUnchecked(int i, int i2) {
        return new C8104e(i, i2 - i);
    }

    public Object writeReplace() {
        return new C8103d(toArray());
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] objArr, int i) {
        if (i == 0) {
            return m22152of();
        }
        return new C5990h2(objArr, i);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m22153of(E e) {
        return construct(e);
    }

    public C5991h3<E> iterator() {
        return listIterator();
    }

    public ImmutableList<E> subList(int i, int i2) {
        C5850m.m16599t(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m22152of();
        }
        return subListUnchecked(i, i2);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m22154of(E e, E e2) {
        return construct(e, e2);
    }

    public C6005i3<E> listIterator() {
        return listIterator(0);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m22155of(E e, E e2, E e3) {
        return construct(e, e2, e3);
    }

    public C6005i3<E> listIterator(int i) {
        C5850m.m16597r(i, size());
        if (isEmpty()) {
            return EMPTY_ITR;
        }
        return new C8101b(this, i);
    }

    public static <E> ImmutableList<E> copyOf(Collection<? extends E> collection) {
        if (!(collection instanceof ImmutableCollection)) {
            return construct(collection.toArray());
        }
        ImmutableList<E> asList = ((ImmutableCollection) collection).asList();
        return asList.isPartialView() ? asImmutableList(asList.toArray()) : asList;
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m22156of(E e, E e2, E e3, E e4) {
        return construct(e, e2, e3, e4);
    }

    public static <E> ImmutableList<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        C5850m.m16594o(comparator);
        Object[] k = C6020k1.m16924k(iterable);
        C6172w1.m17291b(k);
        Arrays.sort(k, comparator);
        return asImmutableList(k);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m22157of(E e, E e2, E e3, E e4, E e5) {
        return construct(e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m22158of(E e, E e2, E e3, E e4, E e5, E e6) {
        return construct(e, e2, e3, e4, e5, e6);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m22159of(E e, E e2, E e3, E e4, E e5, E e6, E e7) {
        return construct(e, e2, e3, e4, e5, e6, e7);
    }

    public static <E> ImmutableList<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m22152of();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m22153of(next);
        }
        C8100a aVar = new C8100a();
        aVar.mo36637h(next);
        aVar.mo36638i(it);
        return aVar.mo36639j();
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m22160of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m22161of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8, e9);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m22162of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m22163of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }

    @SafeVarargs
    /* renamed from: of */
    public static <E> ImmutableList<E> m22164of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        E[] eArr2 = eArr;
        C5850m.m16584e(eArr2.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[(eArr2.length + 12)];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        System.arraycopy(eArr2, 0, objArr, 12, eArr2.length);
        return construct(objArr);
    }

    public static <E> ImmutableList<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return m22152of();
        }
        return construct((Object[]) eArr.clone());
    }
}
