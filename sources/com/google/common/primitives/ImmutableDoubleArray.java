package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import okhttp3.HttpUrl;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p358e.C6248b;

public final class ImmutableDoubleArray implements Serializable {
    public static final ImmutableDoubleArray EMPTY = new ImmutableDoubleArray(new double[0]);
    public final double[] array;
    public final int end;
    public final transient int start;

    /* renamed from: com.google.common.primitives.ImmutableDoubleArray$b */
    public static class C8207b extends AbstractList<Double> implements RandomAccess, Serializable {

        /* renamed from: e */
        public final ImmutableDoubleArray f15282e;

        /* renamed from: c */
        public Double get(int i) {
            return Double.valueOf(this.f15282e.get(i));
        }

        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C8207b) {
                return this.f15282e.equals(((C8207b) obj).f15282e);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int access$100 = this.f15282e.start;
            for (Object next : list) {
                if (next instanceof Double) {
                    int i = access$100 + 1;
                    if (ImmutableDoubleArray.areEqual(this.f15282e.array[access$100], ((Double) next).doubleValue())) {
                        access$100 = i;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f15282e.hashCode();
        }

        public int indexOf(Object obj) {
            if (obj instanceof Double) {
                return this.f15282e.indexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return this.f15282e.lastIndexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        public int size() {
            return this.f15282e.length();
        }

        public List<Double> subList(int i, int i2) {
            return this.f15282e.subArray(i, i2).asList();
        }

        public String toString() {
            return this.f15282e.toString();
        }

        public C8207b(ImmutableDoubleArray immutableDoubleArray) {
            this.f15282e = immutableDoubleArray;
        }
    }

    /* renamed from: com.google.common.primitives.ImmutableDoubleArray$c */
    public static final class C8208c {

        /* renamed from: a */
        public double[] f15283a;

        /* renamed from: b */
        public int f15284b = 0;

        public C8208c(int i) {
            this.f15283a = new double[i];
        }

        /* renamed from: f */
        public static int m22498f(int i, int i2) {
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
        public C8208c mo37093a(double d) {
            mo37097e(1);
            double[] dArr = this.f15283a;
            int i = this.f15284b;
            dArr[i] = d;
            this.f15284b = i + 1;
            return this;
        }

        /* renamed from: b */
        public C8208c mo37094b(Iterable<Double> iterable) {
            if (iterable instanceof Collection) {
                mo37095c((Collection) iterable);
                return this;
            }
            for (Double doubleValue : iterable) {
                mo37093a(doubleValue.doubleValue());
            }
            return this;
        }

        /* renamed from: c */
        public C8208c mo37095c(Collection<Double> collection) {
            mo37097e(collection.size());
            for (Double doubleValue : collection) {
                double[] dArr = this.f15283a;
                int i = this.f15284b;
                this.f15284b = i + 1;
                dArr[i] = doubleValue.doubleValue();
            }
            return this;
        }

        /* renamed from: d */
        public ImmutableDoubleArray mo37096d() {
            return this.f15284b == 0 ? ImmutableDoubleArray.EMPTY : new ImmutableDoubleArray(this.f15283a, 0, this.f15284b);
        }

        /* renamed from: e */
        public final void mo37097e(int i) {
            int i2 = this.f15284b + i;
            double[] dArr = this.f15283a;
            if (i2 > dArr.length) {
                double[] dArr2 = new double[m22498f(dArr.length, i2)];
                System.arraycopy(this.f15283a, 0, dArr2, 0, this.f15284b);
                this.f15283a = dArr2;
            }
        }
    }

    public static boolean areEqual(double d, double d2) {
        return Double.doubleToLongBits(d) == Double.doubleToLongBits(d2);
    }

    public static C8208c builder(int i) {
        C5850m.m16585f(i >= 0, "Invalid initialCapacity: %s", i);
        return new C8208c(i);
    }

    public static ImmutableDoubleArray copyOf(double[] dArr) {
        if (dArr.length == 0) {
            return EMPTY;
        }
        return new ImmutableDoubleArray(Arrays.copyOf(dArr, dArr.length));
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m22489of() {
        return EMPTY;
    }

    public List<Double> asList() {
        return new C8207b();
    }

    public boolean contains(double d) {
        return indexOf(d) >= 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableDoubleArray)) {
            return false;
        }
        ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
        if (length() != immutableDoubleArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (!areEqual(get(i), immutableDoubleArray.get(i))) {
                return false;
            }
        }
        return true;
    }

    public double get(int i) {
        C5850m.m16592m(i, length());
        return this.array[this.start + i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.start; i2 < this.end; i2++) {
            i = (i * 31) + C6248b.m17559d(this.array[i2]);
        }
        return i;
    }

    public int indexOf(double d) {
        for (int i = this.start; i < this.end; i++) {
            if (areEqual(this.array[i], d)) {
                return i - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(double d) {
        int i = this.end;
        while (true) {
            i--;
            if (i < this.start) {
                return -1;
            }
            if (areEqual(this.array[i], d)) {
                return i - this.start;
            }
        }
    }

    public int length() {
        return this.end - this.start;
    }

    public Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }

    public ImmutableDoubleArray subArray(int i, int i2) {
        C5850m.m16599t(i, i2, length());
        if (i == i2) {
            return EMPTY;
        }
        double[] dArr = this.array;
        int i3 = this.start;
        return new ImmutableDoubleArray(dArr, i + i3, i3 + i2);
    }

    public double[] toArray() {
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

    public ImmutableDoubleArray trimmed() {
        return isPartialView() ? new ImmutableDoubleArray(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    public ImmutableDoubleArray(double[] dArr) {
        this(dArr, 0, dArr.length);
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m22490of(double d) {
        return new ImmutableDoubleArray(new double[]{d});
    }

    public ImmutableDoubleArray(double[] dArr, int i, int i2) {
        this.array = dArr;
        this.start = i;
        this.end = i2;
    }

    public static C8208c builder() {
        return new C8208c(10);
    }

    public static ImmutableDoubleArray copyOf(Collection<Double> collection) {
        return collection.isEmpty() ? EMPTY : new ImmutableDoubleArray(C6248b.m17563h(collection));
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m22491of(double d, double d2) {
        return new ImmutableDoubleArray(new double[]{d, d2});
    }

    public static ImmutableDoubleArray copyOf(Iterable<Double> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Double>) (Collection) iterable);
        }
        C8208c builder = builder();
        builder.mo37094b(iterable);
        return builder.mo37096d();
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m22492of(double d, double d2, double d3) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3});
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m22493of(double d, double d2, double d3, double d4) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3, d4});
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m22494of(double d, double d2, double d3, double d4, double d5) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3, d4, d5});
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m22495of(double d, double d2, double d3, double d4, double d5, double d6) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3, d4, d5, d6});
    }

    /* renamed from: of */
    public static ImmutableDoubleArray m22496of(double d, double... dArr) {
        C5850m.m16584e(dArr.length <= 2147483646, "the total number of elements must fit in an int");
        double[] dArr2 = new double[(dArr.length + 1)];
        dArr2[0] = d;
        System.arraycopy(dArr, 0, dArr2, 1, dArr.length);
        return new ImmutableDoubleArray(dArr2);
    }
}
