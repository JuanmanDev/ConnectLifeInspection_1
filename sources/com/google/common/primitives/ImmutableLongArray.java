package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import okhttp3.HttpUrl;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p358e.C6252d;

public final class ImmutableLongArray implements Serializable {
    public static final ImmutableLongArray EMPTY = new ImmutableLongArray(new long[0]);
    public final long[] array;
    public final int end;
    public final transient int start;

    /* renamed from: com.google.common.primitives.ImmutableLongArray$b */
    public static class C8213b extends AbstractList<Long> implements RandomAccess, Serializable {

        /* renamed from: e */
        public final ImmutableLongArray f15288e;

        /* renamed from: c */
        public Long get(int i) {
            return Long.valueOf(this.f15288e.get(i));
        }

        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C8213b) {
                return this.f15288e.equals(((C8213b) obj).f15288e);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int access$100 = this.f15288e.start;
            for (Object next : list) {
                if (next instanceof Long) {
                    int i = access$100 + 1;
                    if (this.f15288e.array[access$100] == ((Long) next).longValue()) {
                        access$100 = i;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f15288e.hashCode();
        }

        public int indexOf(Object obj) {
            if (obj instanceof Long) {
                return this.f15288e.indexOf(((Long) obj).longValue());
            }
            return -1;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return this.f15288e.lastIndexOf(((Long) obj).longValue());
            }
            return -1;
        }

        public int size() {
            return this.f15288e.length();
        }

        public List<Long> subList(int i, int i2) {
            return this.f15288e.subArray(i, i2).asList();
        }

        public String toString() {
            return this.f15288e.toString();
        }

        public C8213b(ImmutableLongArray immutableLongArray) {
            this.f15288e = immutableLongArray;
        }
    }

    /* renamed from: com.google.common.primitives.ImmutableLongArray$c */
    public static final class C8214c {

        /* renamed from: a */
        public long[] f15289a;

        /* renamed from: b */
        public int f15290b = 0;

        public C8214c(int i) {
            this.f15289a = new long[i];
        }

        /* renamed from: f */
        public static int m22528f(int i, int i2) {
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
        public C8214c mo37153a(long j) {
            mo37157e(1);
            long[] jArr = this.f15289a;
            int i = this.f15290b;
            jArr[i] = j;
            this.f15290b = i + 1;
            return this;
        }

        /* renamed from: b */
        public C8214c mo37154b(Iterable<Long> iterable) {
            if (iterable instanceof Collection) {
                mo37155c((Collection) iterable);
                return this;
            }
            for (Long longValue : iterable) {
                mo37153a(longValue.longValue());
            }
            return this;
        }

        /* renamed from: c */
        public C8214c mo37155c(Collection<Long> collection) {
            mo37157e(collection.size());
            for (Long longValue : collection) {
                long[] jArr = this.f15289a;
                int i = this.f15290b;
                this.f15290b = i + 1;
                jArr[i] = longValue.longValue();
            }
            return this;
        }

        /* renamed from: d */
        public ImmutableLongArray mo37156d() {
            return this.f15290b == 0 ? ImmutableLongArray.EMPTY : new ImmutableLongArray(this.f15289a, 0, this.f15290b);
        }

        /* renamed from: e */
        public final void mo37157e(int i) {
            int i2 = this.f15290b + i;
            long[] jArr = this.f15289a;
            if (i2 > jArr.length) {
                long[] jArr2 = new long[m22528f(jArr.length, i2)];
                System.arraycopy(this.f15289a, 0, jArr2, 0, this.f15290b);
                this.f15289a = jArr2;
            }
        }
    }

    public static C8214c builder(int i) {
        C5850m.m16585f(i >= 0, "Invalid initialCapacity: %s", i);
        return new C8214c(i);
    }

    public static ImmutableLongArray copyOf(long[] jArr) {
        if (jArr.length == 0) {
            return EMPTY;
        }
        return new ImmutableLongArray(Arrays.copyOf(jArr, jArr.length));
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    /* renamed from: of */
    public static ImmutableLongArray m22519of() {
        return EMPTY;
    }

    public List<Long> asList() {
        return new C8213b();
    }

    public boolean contains(long j) {
        return indexOf(j) >= 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableLongArray)) {
            return false;
        }
        ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
        if (length() != immutableLongArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (get(i) != immutableLongArray.get(i)) {
                return false;
            }
        }
        return true;
    }

    public long get(int i) {
        C5850m.m16592m(i, length());
        return this.array[this.start + i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.start; i2 < this.end; i2++) {
            i = (i * 31) + C6252d.m17583e(this.array[i2]);
        }
        return i;
    }

    public int indexOf(long j) {
        for (int i = this.start; i < this.end; i++) {
            if (this.array[i] == j) {
                return i - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(long j) {
        int i = this.end;
        while (true) {
            i--;
            int i2 = this.start;
            if (i < i2) {
                return -1;
            }
            if (this.array[i] == j) {
                return i - i2;
            }
        }
    }

    public int length() {
        return this.end - this.start;
    }

    public Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }

    public ImmutableLongArray subArray(int i, int i2) {
        C5850m.m16599t(i, i2, length());
        if (i == i2) {
            return EMPTY;
        }
        long[] jArr = this.array;
        int i3 = this.start;
        return new ImmutableLongArray(jArr, i + i3, i3 + i2);
    }

    public long[] toArray() {
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

    public ImmutableLongArray trimmed() {
        return isPartialView() ? new ImmutableLongArray(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    public ImmutableLongArray(long[] jArr) {
        this(jArr, 0, jArr.length);
    }

    /* renamed from: of */
    public static ImmutableLongArray m22520of(long j) {
        return new ImmutableLongArray(new long[]{j});
    }

    public ImmutableLongArray(long[] jArr, int i, int i2) {
        this.array = jArr;
        this.start = i;
        this.end = i2;
    }

    public static C8214c builder() {
        return new C8214c(10);
    }

    public static ImmutableLongArray copyOf(Collection<Long> collection) {
        return collection.isEmpty() ? EMPTY : new ImmutableLongArray(C6252d.m17586h(collection));
    }

    /* renamed from: of */
    public static ImmutableLongArray m22521of(long j, long j2) {
        return new ImmutableLongArray(new long[]{j, j2});
    }

    public static ImmutableLongArray copyOf(Iterable<Long> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Long>) (Collection) iterable);
        }
        C8214c builder = builder();
        builder.mo37154b(iterable);
        return builder.mo37156d();
    }

    /* renamed from: of */
    public static ImmutableLongArray m22522of(long j, long j2, long j3) {
        return new ImmutableLongArray(new long[]{j, j2, j3});
    }

    /* renamed from: of */
    public static ImmutableLongArray m22523of(long j, long j2, long j3, long j4) {
        return new ImmutableLongArray(new long[]{j, j2, j3, j4});
    }

    /* renamed from: of */
    public static ImmutableLongArray m22524of(long j, long j2, long j3, long j4, long j5) {
        return new ImmutableLongArray(new long[]{j, j2, j3, j4, j5});
    }

    /* renamed from: of */
    public static ImmutableLongArray m22525of(long j, long j2, long j3, long j4, long j5, long j6) {
        return new ImmutableLongArray(new long[]{j, j2, j3, j4, j5, j6});
    }

    /* renamed from: of */
    public static ImmutableLongArray m22526of(long j, long... jArr) {
        C5850m.m16584e(jArr.length <= 2147483646, "the total number of elements must fit in an int");
        long[] jArr2 = new long[(jArr.length + 1)];
        jArr2[0] = j;
        System.arraycopy(jArr, 0, jArr2, 1, jArr.length);
        return new ImmutableLongArray(jArr2);
    }
}
