package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5992i;
import p040c.p200q.p353b.p355b.C6020k1;
import p040c.p200q.p353b.p355b.C6131q2;
import p040c.p200q.p353b.p355b.C6153t1;
import p040c.p200q.p353b.p355b.C6158u1;
import p040c.p200q.p353b.p355b.C6166v;
import p040c.p200q.p353b.p358e.C6250c;

public final class EnumMultiset<E extends Enum<E>> extends C5992i<E> implements Serializable {
    public static final long serialVersionUID = 0;
    public transient int[] counts;
    public transient int distinctElements;
    public transient E[] enumConstants;
    public transient long size;
    public transient Class<E> type;

    /* renamed from: com.google.common.collect.EnumMultiset$a */
    public class C8080a extends EnumMultiset<E>.c<E> {
        public C8080a() {
            super();
        }

        /* renamed from: b */
        public E mo36527a(int i) {
            return EnumMultiset.this.enumConstants[i];
        }
    }

    /* renamed from: com.google.common.collect.EnumMultiset$b */
    public class C8081b extends EnumMultiset<E>.c<C6153t1.C6154a<E>> {

        /* renamed from: com.google.common.collect.EnumMultiset$b$a */
        public class C8082a extends C6158u1.C6160b<E> {

            /* renamed from: e */
            public final /* synthetic */ int f15031e;

            public C8082a(int i) {
                this.f15031e = i;
            }

            /* renamed from: b */
            public E mo29977a() {
                return EnumMultiset.this.enumConstants[this.f15031e];
            }

            public int getCount() {
                return EnumMultiset.this.counts[this.f15031e];
            }
        }

        public C8081b() {
            super();
        }

        /* renamed from: b */
        public C6153t1.C6154a<E> mo36527a(int i) {
            return new C8082a(i);
        }
    }

    /* renamed from: com.google.common.collect.EnumMultiset$c */
    public abstract class C8083c<T> implements Iterator<T> {

        /* renamed from: e */
        public int f15033e = 0;

        /* renamed from: l */
        public int f15034l = -1;

        public C8083c() {
        }

        /* renamed from: a */
        public abstract T mo36527a(int i);

        public boolean hasNext() {
            while (this.f15033e < EnumMultiset.this.enumConstants.length) {
                int[] access$100 = EnumMultiset.this.counts;
                int i = this.f15033e;
                if (access$100[i] > 0) {
                    return true;
                }
                this.f15033e = i + 1;
            }
            return false;
        }

        public T next() {
            if (hasNext()) {
                T a = mo36527a(this.f15033e);
                int i = this.f15033e;
                this.f15034l = i;
                this.f15033e = i + 1;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            C6166v.m17279e(this.f15034l >= 0);
            if (EnumMultiset.this.counts[this.f15034l] > 0) {
                EnumMultiset.access$210(EnumMultiset.this);
                EnumMultiset enumMultiset = EnumMultiset.this;
                long unused = enumMultiset.size = enumMultiset.size - ((long) EnumMultiset.this.counts[this.f15034l]);
                EnumMultiset.this.counts[this.f15034l] = 0;
            }
            this.f15034l = -1;
        }
    }

    public EnumMultiset(Class<E> cls) {
        this.type = cls;
        C5850m.m16583d(cls.isEnum());
        E[] eArr = (Enum[]) cls.getEnumConstants();
        this.enumConstants = eArr;
        this.counts = new int[eArr.length];
    }

    public static /* synthetic */ int access$210(EnumMultiset enumMultiset) {
        int i = enumMultiset.distinctElements;
        enumMultiset.distinctElements = i - 1;
        return i;
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Class<E> cls) {
        return new EnumMultiset<>(cls);
    }

    private boolean isActuallyE(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        E e = (Enum) obj;
        int ordinal = e.ordinal();
        E[] eArr = this.enumConstants;
        if (ordinal >= eArr.length || eArr[ordinal] != e) {
            return false;
        }
        return true;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Class<E> cls = (Class) objectInputStream.readObject();
        this.type = cls;
        E[] eArr = (Enum[]) cls.getEnumConstants();
        this.enumConstants = eArr;
        this.counts = new int[eArr.length];
        C6131q2.m17226f(this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.type);
        C6131q2.m17231k(this, objectOutputStream);
    }

    public void checkIsE(Object obj) {
        C5850m.m16594o(obj);
        if (!isActuallyE(obj)) {
            throw new ClassCastException("Expected an " + this.type + " but got " + obj);
        }
    }

    public void clear() {
        Arrays.fill(this.counts, 0);
        this.size = 0;
        this.distinctElements = 0;
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public int count(Object obj) {
        if (obj == null || !isActuallyE(obj)) {
            return 0;
        }
        return this.counts[((Enum) obj).ordinal()];
    }

    public int distinctElements() {
        return this.distinctElements;
    }

    public Iterator<E> elementIterator() {
        return new C8080a();
    }

    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    public Iterator<C6153t1.C6154a<E>> entryIterator() {
        return new C8081b();
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public Iterator<E> iterator() {
        return C6158u1.m17265i(this);
    }

    public int remove(Object obj, int i) {
        if (obj == null || !isActuallyE(obj)) {
            return 0;
        }
        Enum enumR = (Enum) obj;
        C6166v.m17276b(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        int ordinal = enumR.ordinal();
        int[] iArr = this.counts;
        int i2 = iArr[ordinal];
        if (i2 == 0) {
            return 0;
        }
        if (i2 <= i) {
            iArr[ordinal] = 0;
            this.distinctElements--;
            this.size -= (long) i2;
        } else {
            iArr[ordinal] = i2 - i;
            this.size -= (long) i;
        }
        return i2;
    }

    public int size() {
        return C6250c.m17574h(this.size);
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        C5850m.m16584e(it.hasNext(), "EnumMultiset constructor passed empty Iterable");
        EnumMultiset<E> enumMultiset = new EnumMultiset<>(((Enum) it.next()).getDeclaringClass());
        C6020k1.m16914a(enumMultiset, iterable);
        return enumMultiset;
    }

    public int add(E e, int i) {
        checkIsE(e);
        C6166v.m17276b(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        int ordinal = e.ordinal();
        int i2 = this.counts[ordinal];
        long j = (long) i;
        long j2 = ((long) i2) + j;
        C5850m.m16587h(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.counts[ordinal] = (int) j2;
        if (i2 == 0) {
            this.distinctElements++;
        }
        this.size += j;
        return i2;
    }

    public int setCount(E e, int i) {
        checkIsE(e);
        C6166v.m17276b(i, "count");
        int ordinal = e.ordinal();
        int[] iArr = this.counts;
        int i2 = iArr[ordinal];
        iArr[ordinal] = i;
        this.size += (long) (i - i2);
        if (i2 == 0 && i > 0) {
            this.distinctElements++;
        } else if (i2 > 0 && i == 0) {
            this.distinctElements--;
        }
        return i2;
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable, Class<E> cls) {
        EnumMultiset<E> create = create(cls);
        C6020k1.m16914a(create, iterable);
        return create;
    }
}
