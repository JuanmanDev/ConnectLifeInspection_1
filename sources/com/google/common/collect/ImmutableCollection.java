package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5882b2;
import p040c.p200q.p353b.p355b.C5991h3;
import p040c.p200q.p353b.p355b.C6166v;
import p040c.p200q.p353b.p355b.C6172w1;

public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] EMPTY_ARRAY = new Object[0];

    /* renamed from: com.google.common.collect.ImmutableCollection$a */
    public static abstract class C8098a<E> extends C8099b<E> {

        /* renamed from: a */
        public Object[] f15055a;

        /* renamed from: b */
        public int f15056b = 0;

        /* renamed from: c */
        public boolean f15057c;

        public C8098a(int i) {
            C6166v.m17276b(i, "initialCapacity");
            this.f15055a = new Object[i];
        }

        /* renamed from: b */
        public C8099b<E> mo36618b(E... eArr) {
            C6172w1.m17291b(eArr);
            mo36620g(this.f15056b + eArr.length);
            System.arraycopy(eArr, 0, this.f15055a, this.f15056b, eArr.length);
            this.f15056b += eArr.length;
            return this;
        }

        /* renamed from: f */
        public C8098a<E> mo36619f(E e) {
            C5850m.m16594o(e);
            mo36620g(this.f15056b + 1);
            Object[] objArr = this.f15055a;
            int i = this.f15056b;
            this.f15056b = i + 1;
            objArr[i] = e;
            return this;
        }

        /* renamed from: g */
        public final void mo36620g(int i) {
            Object[] objArr = this.f15055a;
            if (objArr.length < i) {
                this.f15055a = Arrays.copyOf(objArr, C8099b.m22147e(objArr.length, i));
                this.f15057c = false;
            } else if (this.f15057c) {
                this.f15055a = (Object[]) objArr.clone();
                this.f15057c = false;
            }
        }
    }

    /* renamed from: com.google.common.collect.ImmutableCollection$b */
    public static abstract class C8099b<E> {
        /* renamed from: e */
        public static int m22147e(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        /* renamed from: a */
        public abstract C8099b<E> mo36621a(E e);

        /* renamed from: b */
        public C8099b<E> mo36618b(E... eArr) {
            for (E a : eArr) {
                mo36621a(a);
            }
            return this;
        }

        /* renamed from: c */
        public C8099b<E> mo36622c(Iterable<? extends E> iterable) {
            for (Object a : iterable) {
                mo36621a(a);
            }
            return this;
        }

        /* renamed from: d */
        public C8099b<E> mo36623d(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo36621a(it.next());
            }
            return this;
        }
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> asList() {
        return isEmpty() ? ImmutableList.m22152of() : ImmutableList.asImmutableList(toArray());
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    public int copyIntoArray(Object[] objArr, int i) {
        C5991h3 it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    public Object[] internalArray() {
        return null;
    }

    public int internalArrayEnd() {
        throw new UnsupportedOperationException();
    }

    public int internalArrayStart() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean isPartialView();

    public abstract C5991h3<E> iterator();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(EMPTY_ARRAY);
    }

    public Object writeReplace() {
        return new ImmutableList.C8103d(toArray());
    }

    public final <T> T[] toArray(T[] tArr) {
        C5850m.m16594o(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] internalArray = internalArray();
            if (internalArray != null) {
                return C5882b2.m16639a(internalArray, internalArrayStart(), internalArrayEnd(), tArr);
            }
            tArr = C6172w1.m17294e(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        copyIntoArray(tArr, 0);
        return tArr;
    }
}
