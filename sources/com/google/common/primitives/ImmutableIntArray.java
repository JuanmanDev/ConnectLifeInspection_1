package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import okhttp3.HttpUrl;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p358e.C6250c;

public final class ImmutableIntArray implements Serializable {
    public static final ImmutableIntArray EMPTY = new ImmutableIntArray(new int[0]);
    public final int[] array;
    public final int end;
    public final transient int start;

    /* renamed from: com.google.common.primitives.ImmutableIntArray$b */
    public static class C8210b extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: e */
        public final ImmutableIntArray f15285e;

        /* renamed from: c */
        public Integer get(int i) {
            return Integer.valueOf(this.f15285e.get(i));
        }

        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C8210b) {
                return this.f15285e.equals(((C8210b) obj).f15285e);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int access$100 = this.f15285e.start;
            for (Object next : list) {
                if (next instanceof Integer) {
                    int i = access$100 + 1;
                    if (this.f15285e.array[access$100] == ((Integer) next).intValue()) {
                        access$100 = i;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f15285e.hashCode();
        }

        public int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.f15285e.indexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.f15285e.lastIndexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        public int size() {
            return this.f15285e.length();
        }

        public List<Integer> subList(int i, int i2) {
            return this.f15285e.subArray(i, i2).asList();
        }

        public String toString() {
            return this.f15285e.toString();
        }

        public C8210b(ImmutableIntArray immutableIntArray) {
            this.f15285e = immutableIntArray;
        }
    }

    /* renamed from: com.google.common.primitives.ImmutableIntArray$c */
    public static final class C8211c {

        /* renamed from: a */
        public int[] f15286a;

        /* renamed from: b */
        public int f15287b = 0;

        public C8211c(int i) {
            this.f15286a = new int[i];
        }

        /* renamed from: f */
        public static int m22513f(int i, int i2) {
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
        public C8211c mo37123a(int i) {
            mo37127e(1);
            int[] iArr = this.f15286a;
            int i2 = this.f15287b;
            iArr[i2] = i;
            this.f15287b = i2 + 1;
            return this;
        }

        /* renamed from: b */
        public C8211c mo37124b(Iterable<Integer> iterable) {
            if (iterable instanceof Collection) {
                mo37125c((Collection) iterable);
                return this;
            }
            for (Integer intValue : iterable) {
                mo37123a(intValue.intValue());
            }
            return this;
        }

        /* renamed from: c */
        public C8211c mo37125c(Collection<Integer> collection) {
            mo37127e(collection.size());
            for (Integer intValue : collection) {
                int[] iArr = this.f15286a;
                int i = this.f15287b;
                this.f15287b = i + 1;
                iArr[i] = intValue.intValue();
            }
            return this;
        }

        /* renamed from: d */
        public ImmutableIntArray mo37126d() {
            return this.f15287b == 0 ? ImmutableIntArray.EMPTY : new ImmutableIntArray(this.f15286a, 0, this.f15287b);
        }

        /* renamed from: e */
        public final void mo37127e(int i) {
            int i2 = this.f15287b + i;
            int[] iArr = this.f15286a;
            if (i2 > iArr.length) {
                int[] iArr2 = new int[m22513f(iArr.length, i2)];
                System.arraycopy(this.f15286a, 0, iArr2, 0, this.f15287b);
                this.f15286a = iArr2;
            }
        }
    }

    public static C8211c builder(int i) {
        C5850m.m16585f(i >= 0, "Invalid initialCapacity: %s", i);
        return new C8211c(i);
    }

    public static ImmutableIntArray copyOf(int[] iArr) {
        return iArr.length == 0 ? EMPTY : new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    /* renamed from: of */
    public static ImmutableIntArray m22504of() {
        return EMPTY;
    }

    public List<Integer> asList() {
        return new C8210b();
    }

    public boolean contains(int i) {
        return indexOf(i) >= 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        if (length() != immutableIntArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (get(i) != immutableIntArray.get(i)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i) {
        C5850m.m16592m(i, length());
        return this.array[this.start + i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.start; i2 < this.end; i2++) {
            int i3 = this.array[i2];
            C6250c.m17571e(i3);
            i = (i * 31) + i3;
        }
        return i;
    }

    public int indexOf(int i) {
        for (int i2 = this.start; i2 < this.end; i2++) {
            if (this.array[i2] == i) {
                return i2 - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(int i) {
        int i2 = this.end;
        while (true) {
            i2--;
            int i3 = this.start;
            if (i2 < i3) {
                return -1;
            }
            if (this.array[i2] == i) {
                return i2 - i3;
            }
        }
    }

    public int length() {
        return this.end - this.start;
    }

    public Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }

    public ImmutableIntArray subArray(int i, int i2) {
        C5850m.m16599t(i, i2, length());
        if (i == i2) {
            return EMPTY;
        }
        int[] iArr = this.array;
        int i3 = this.start;
        return new ImmutableIntArray(iArr, i + i3, i3 + i2);
    }

    public int[] toArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public String toString() {
        if (isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(length() * 5);
        sb.append('[');
        sb.append(this.array[this.start]);
        int i = this.start;
        while (true) {
            i++;
            if (i < this.end) {
                sb.append(", ");
                sb.append(this.array[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public ImmutableIntArray trimmed() {
        return isPartialView() ? new ImmutableIntArray(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    public ImmutableIntArray(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static ImmutableIntArray copyOf(Collection<Integer> collection) {
        return collection.isEmpty() ? EMPTY : new ImmutableIntArray(C6250c.m17575i(collection));
    }

    /* renamed from: of */
    public static ImmutableIntArray m22505of(int i) {
        return new ImmutableIntArray(new int[]{i});
    }

    public ImmutableIntArray(int[] iArr, int i, int i2) {
        this.array = iArr;
        this.start = i;
        this.end = i2;
    }

    public static C8211c builder() {
        return new C8211c(10);
    }

    public static ImmutableIntArray copyOf(Iterable<Integer> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Integer>) (Collection) iterable);
        }
        C8211c builder = builder();
        builder.mo37124b(iterable);
        return builder.mo37126d();
    }

    /* renamed from: of */
    public static ImmutableIntArray m22506of(int i, int i2) {
        return new ImmutableIntArray(new int[]{i, i2});
    }

    /* renamed from: of */
    public static ImmutableIntArray m22507of(int i, int i2, int i3) {
        return new ImmutableIntArray(new int[]{i, i2, i3});
    }

    /* renamed from: of */
    public static ImmutableIntArray m22508of(int i, int i2, int i3, int i4) {
        return new ImmutableIntArray(new int[]{i, i2, i3, i4});
    }

    /* renamed from: of */
    public static ImmutableIntArray m22509of(int i, int i2, int i3, int i4, int i5) {
        return new ImmutableIntArray(new int[]{i, i2, i3, i4, i5});
    }

    /* renamed from: of */
    public static ImmutableIntArray m22510of(int i, int i2, int i3, int i4, int i5, int i6) {
        return new ImmutableIntArray(new int[]{i, i2, i3, i4, i5, i6});
    }

    /* renamed from: of */
    public static ImmutableIntArray m22511of(int i, int... iArr) {
        C5850m.m16584e(iArr.length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr2 = new int[(iArr.length + 1)];
        iArr2[0] = i;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new ImmutableIntArray(iArr2);
    }
}
