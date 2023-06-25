package p040c.p200q.p353b.p358e;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.e.d */
/* compiled from: Longs */
public final class C6252d {

    /* renamed from: c.q.b.e.d$a */
    /* compiled from: Longs */
    public static class C6253a extends AbstractList<Long> implements RandomAccess, Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final long[] f11870e;

        /* renamed from: l */
        public final int f11871l;

        /* renamed from: m */
        public final int f11872m;

        public C6253a(long[] jArr, int i, int i2) {
            this.f11870e = jArr;
            this.f11871l = i;
            this.f11872m = i2;
        }

        /* renamed from: c */
        public Long get(int i) {
            C5850m.m16592m(i, size());
            return Long.valueOf(this.f11870e[this.f11871l + i]);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Long) && C6252d.m17584f(this.f11870e, ((Long) obj).longValue(), this.f11871l, this.f11872m) != -1;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6253a)) {
                return super.equals(obj);
            }
            C6253a aVar = (C6253a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f11870e[this.f11871l + i] != aVar.f11870e[aVar.f11871l + i]) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public Long set(int i, Long l) {
            C5850m.m16592m(i, size());
            long[] jArr = this.f11870e;
            int i2 = this.f11871l;
            long j = jArr[i2 + i];
            C5850m.m16594o(l);
            jArr[i2 + i] = l.longValue();
            return Long.valueOf(j);
        }

        /* renamed from: g */
        public long[] mo30268g() {
            return Arrays.copyOfRange(this.f11870e, this.f11871l, this.f11872m);
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.f11871l; i2 < this.f11872m; i2++) {
                i = (i * 31) + C6252d.m17583e(this.f11870e[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            int a;
            if (!(obj instanceof Long) || (a = C6252d.m17584f(this.f11870e, ((Long) obj).longValue(), this.f11871l, this.f11872m)) < 0) {
                return -1;
            }
            return a - this.f11871l;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b;
            if (!(obj instanceof Long) || (b = C6252d.m17585g(this.f11870e, ((Long) obj).longValue(), this.f11871l, this.f11872m)) < 0) {
                return -1;
            }
            return b - this.f11871l;
        }

        public int size() {
            return this.f11872m - this.f11871l;
        }

        public List<Long> subList(int i, int i2) {
            C5850m.m16599t(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            long[] jArr = this.f11870e;
            int i3 = this.f11871l;
            return new C6253a(jArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
            sb.append('[');
            sb.append(this.f11870e[this.f11871l]);
            int i = this.f11871l;
            while (true) {
                i++;
                if (i < this.f11872m) {
                    sb.append(", ");
                    sb.append(this.f11870e[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    /* renamed from: c */
    public static int m17581c(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: d */
    public static long m17582d(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) b8) & 255);
    }

    /* renamed from: e */
    public static int m17583e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: f */
    public static int m17584f(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: g */
    public static int m17585g(long[] jArr, long j, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (jArr[i3] == j) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static long[] m17586h(Collection<? extends Number> collection) {
        if (collection instanceof C6253a) {
            return ((C6253a) collection).mo30268g();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            C5850m.m16594o(obj);
            jArr[i] = ((Number) obj).longValue();
        }
        return jArr;
    }
}
