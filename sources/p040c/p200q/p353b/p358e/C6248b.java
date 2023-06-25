package p040c.p200q.p353b.p358e;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.e.b */
/* compiled from: Doubles */
public final class C6248b {

    /* renamed from: c.q.b.e.b$a */
    /* compiled from: Doubles */
    public static class C6249a extends AbstractList<Double> implements RandomAccess, Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final double[] f11864e;

        /* renamed from: l */
        public final int f11865l;

        /* renamed from: m */
        public final int f11866m;

        public C6249a(double[] dArr, int i, int i2) {
            this.f11864e = dArr;
            this.f11865l = i;
            this.f11866m = i2;
        }

        /* renamed from: c */
        public Double get(int i) {
            C5850m.m16592m(i, size());
            return Double.valueOf(this.f11864e[this.f11865l + i]);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Double) && C6248b.m17560e(this.f11864e, ((Double) obj).doubleValue(), this.f11865l, this.f11866m) != -1;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6249a)) {
                return super.equals(obj);
            }
            C6249a aVar = (C6249a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f11864e[this.f11865l + i] != aVar.f11864e[aVar.f11865l + i]) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public Double set(int i, Double d) {
            C5850m.m16592m(i, size());
            double[] dArr = this.f11864e;
            int i2 = this.f11865l;
            double d2 = dArr[i2 + i];
            C5850m.m16594o(d);
            dArr[i2 + i] = d.doubleValue();
            return Double.valueOf(d2);
        }

        /* renamed from: g */
        public double[] mo30240g() {
            return Arrays.copyOfRange(this.f11864e, this.f11865l, this.f11866m);
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.f11865l; i2 < this.f11866m; i2++) {
                i = (i * 31) + C6248b.m17559d(this.f11864e[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            int a;
            if (!(obj instanceof Double) || (a = C6248b.m17560e(this.f11864e, ((Double) obj).doubleValue(), this.f11865l, this.f11866m)) < 0) {
                return -1;
            }
            return a - this.f11865l;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b;
            if (!(obj instanceof Double) || (b = C6248b.m17562g(this.f11864e, ((Double) obj).doubleValue(), this.f11865l, this.f11866m)) < 0) {
                return -1;
            }
            return b - this.f11865l;
        }

        public int size() {
            return this.f11866m - this.f11865l;
        }

        public List<Double> subList(int i, int i2) {
            C5850m.m16599t(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            double[] dArr = this.f11864e;
            int i3 = this.f11865l;
            return new C6249a(dArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append('[');
            sb.append(this.f11864e[this.f11865l]);
            int i = this.f11865l;
            while (true) {
                i++;
                if (i < this.f11866m) {
                    sb.append(", ");
                    sb.append(this.f11864e[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    static {
        m17558c();
    }

    /* renamed from: c */
    public static Pattern m17558c() {
        return Pattern.compile(("[+-]?(?:NaN|Infinity|" + ("(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)" + "(?:[eE][+-]?\\d+#)?[fFdD]?") + "|" + ("0[xX]" + "(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)" + "[pP][+-]?\\d+#[fFdD]?") + ")").replace("#", "+"));
    }

    /* renamed from: d */
    public static int m17559d(double d) {
        return Double.valueOf(d).hashCode();
    }

    /* renamed from: e */
    public static int m17560e(double[] dArr, double d, int i, int i2) {
        while (i < i2) {
            if (dArr[i] == d) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: f */
    public static boolean m17561f(double d) {
        return Double.NEGATIVE_INFINITY < d && d < Double.POSITIVE_INFINITY;
    }

    /* renamed from: g */
    public static int m17562g(double[] dArr, double d, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (dArr[i3] == d) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static double[] m17563h(Collection<? extends Number> collection) {
        if (collection instanceof C6249a) {
            return ((C6249a) collection).mo30240g();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            C5850m.m16594o(obj);
            dArr[i] = ((Number) obj).doubleValue();
        }
        return dArr;
    }
}
