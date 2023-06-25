package p040c.p200q.p353b.p358e;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.e.c */
/* compiled from: Ints */
public final class C6250c {

    /* renamed from: c.q.b.e.c$a */
    /* compiled from: Ints */
    public static class C6251a extends AbstractList<Integer> implements RandomAccess, Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final int[] f11867e;

        /* renamed from: l */
        public final int f11868l;

        /* renamed from: m */
        public final int f11869m;

        public C6251a(int[] iArr, int i, int i2) {
            this.f11867e = iArr;
            this.f11868l = i;
            this.f11869m = i2;
        }

        /* renamed from: c */
        public Integer get(int i) {
            C5850m.m16592m(i, size());
            return Integer.valueOf(this.f11867e[this.f11868l + i]);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Integer) && C6250c.m17572f(this.f11867e, ((Integer) obj).intValue(), this.f11868l, this.f11869m) != -1;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6251a)) {
                return super.equals(obj);
            }
            C6251a aVar = (C6251a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f11867e[this.f11868l + i] != aVar.f11867e[aVar.f11868l + i]) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public Integer set(int i, Integer num) {
            C5850m.m16592m(i, size());
            int[] iArr = this.f11867e;
            int i2 = this.f11868l;
            int i3 = iArr[i2 + i];
            C5850m.m16594o(num);
            iArr[i2 + i] = num.intValue();
            return Integer.valueOf(i3);
        }

        /* renamed from: g */
        public int[] mo30254g() {
            return Arrays.copyOfRange(this.f11867e, this.f11868l, this.f11869m);
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.f11868l; i2 < this.f11869m; i2++) {
                int i3 = this.f11867e[i2];
                C6250c.m17571e(i3);
                i = (i * 31) + i3;
            }
            return i;
        }

        public int indexOf(Object obj) {
            int a;
            if (!(obj instanceof Integer) || (a = C6250c.m17572f(this.f11867e, ((Integer) obj).intValue(), this.f11868l, this.f11869m)) < 0) {
                return -1;
            }
            return a - this.f11868l;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b;
            if (!(obj instanceof Integer) || (b = C6250c.m17573g(this.f11867e, ((Integer) obj).intValue(), this.f11868l, this.f11869m)) < 0) {
                return -1;
            }
            return b - this.f11868l;
        }

        public int size() {
            return this.f11869m - this.f11868l;
        }

        public List<Integer> subList(int i, int i2) {
            C5850m.m16599t(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.f11867e;
            int i3 = this.f11868l;
            return new C6251a(iArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f11867e[this.f11868l]);
            int i = this.f11868l;
            while (true) {
                i++;
                if (i < this.f11869m) {
                    sb.append(", ");
                    sb.append(this.f11867e[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    /* renamed from: c */
    public static int m17569c(long j) {
        int i = (int) j;
        C5850m.m16587h(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    /* renamed from: d */
    public static int m17570d(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: e */
    public static int m17571e(int i) {
        return i;
    }

    /* renamed from: f */
    public static int m17572f(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: g */
    public static int m17573g(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static int m17574h(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: i */
    public static int[] m17575i(Collection<? extends Number> collection) {
        if (collection instanceof C6251a) {
            return ((C6251a) collection).mo30254g();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            C5850m.m16594o(obj);
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
