package java9.util.concurrent;

import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.util.Random;
import p620g.p621a.C9336c;
import p620g.p621a.p622d.C9360e;
import p620g.p621a.p624f.C9369c;
import p620g.p621a.p624f.C9372e;
import p620g.p621a.p624f.C9375g;
import p620g.p621a.p624f.C9380j;

public class ThreadLocalRandom extends Random {
    public static final String BAD_BOUND = "bound must be positive";
    public static final String BAD_RANGE = "bound must be greater than origin";
    public static final String BAD_SIZE = "size must be non-negative";
    public static final double DOUBLE_UNIT = 1.1102230246251565E-16d;
    public static final float FLOAT_UNIT = 5.9604645E-8f;
    public static final ThreadLocalRandom instance = new ThreadLocalRandom();
    public static final ThreadLocal<Double> nextLocalGaussian = new ThreadLocal<>();
    public static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};
    public static final long serialVersionUID = 9123313859120073139L;
    public boolean initialized = true;

    /* renamed from: java9.util.concurrent.ThreadLocalRandom$a */
    public static final class C9484a implements C9336c.C9337a {
        public C9484a(long j, long j2, double d, double d2) {
        }

        /* renamed from: b */
        public int mo47950b() {
            return 17728;
        }
    }

    /* renamed from: java9.util.concurrent.ThreadLocalRandom$b */
    public static final class C9485b implements C9336c.C9338b {
        public C9485b(long j, long j2, int i, int i2) {
        }

        /* renamed from: b */
        public int mo47951b() {
            return 17728;
        }
    }

    /* renamed from: java9.util.concurrent.ThreadLocalRandom$c */
    public static final class C9486c implements C9336c.C9339c {
        public C9486c(long j, long j2, long j3, long j4) {
        }

        /* renamed from: b */
        public int mo47952b() {
            return 17728;
        }
    }

    public static ThreadLocalRandom current() {
        if (C9360e.m25279d() == 0) {
            C9360e.m25285j();
        }
        return instance;
    }

    /* access modifiers changed from: private */
    public final double internalNextDouble(double d, double d2) {
        double nextLong = ((double) (nextLong() >>> 11)) * 1.1102230246251565E-16d;
        if (d >= d2) {
            return nextLong;
        }
        double d3 = (nextLong * (d2 - d)) + d;
        return d3 >= d2 ? Double.longBitsToDouble(Double.doubleToLongBits(d2) - 1) : d3;
    }

    /* access modifiers changed from: private */
    public final int internalNextInt(int i, int i2) {
        int i3;
        int k = C9360e.m25286k(nextSeed());
        if (i >= i2) {
            return k;
        }
        int i4 = i2 - i;
        int i5 = i4 - 1;
        if ((i4 & i5) == 0) {
            i3 = k & i5;
        } else if (i4 > 0) {
            int i6 = k >>> 1;
            while (true) {
                int i7 = i6 + i5;
                i3 = i6 % i4;
                if (i7 - i3 >= 0) {
                    break;
                }
                i6 = C9360e.m25286k(nextSeed()) >>> 1;
            }
        } else {
            while (true) {
                if (k >= i && k < i2) {
                    return k;
                }
                k = C9360e.m25286k(nextSeed());
            }
        }
        return i3 + i;
    }

    /* access modifiers changed from: private */
    public final long internalNextLong(long j, long j2) {
        long l = C9360e.m25287l(nextSeed());
        if (j >= j2) {
            return l;
        }
        long j3 = j2 - j;
        long j4 = j3 - 1;
        if ((j3 & j4) == 0) {
            return (l & j4) + j;
        }
        if (j3 > 0) {
            while (true) {
                long j5 = l >>> 1;
                long j6 = j5 + j4;
                long j7 = j5 % j3;
                if (j6 - j7 >= 0) {
                    return j7 + j;
                }
                l = C9360e.m25287l(nextSeed());
            }
        } else {
            while (true) {
                if (l >= j && l < j2) {
                    return l;
                }
                l = C9360e.m25287l(nextSeed());
            }
        }
    }

    private final long nextSeed() {
        return C9360e.m25289n();
    }

    private Object readResolve() {
        return current();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("rnd", C9360e.m25281f());
        putFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    public C9369c doubles(long j) {
        if (j >= 0) {
            return C9380j.m25306a(new C9484a(0, j, Double.MAX_VALUE, 0.0d), false);
        }
        throw new IllegalArgumentException(BAD_SIZE);
    }

    public C9372e ints(long j) {
        if (j >= 0) {
            return C9380j.m25307b(new C9485b(0, j, Integer.MAX_VALUE, 0), false);
        }
        throw new IllegalArgumentException(BAD_SIZE);
    }

    public C9375g longs(long j) {
        if (j >= 0) {
            return C9380j.m25308c(new C9486c(0, j, Long.MAX_VALUE, 0), false);
        }
        throw new IllegalArgumentException(BAD_SIZE);
    }

    public boolean nextBoolean() {
        return C9360e.m25286k(nextSeed()) < 0;
    }

    public double nextDouble() {
        return ((double) (C9360e.m25287l(nextSeed()) >>> 11)) * 1.1102230246251565E-16d;
    }

    public float nextFloat() {
        return ((float) (C9360e.m25286k(nextSeed()) >>> 8)) * 5.9604645E-8f;
    }

    public double nextGaussian() {
        Double d = nextLocalGaussian.get();
        if (d != null) {
            nextLocalGaussian.set((Object) null);
            return d.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d2 = (nextDouble * nextDouble) + (nextDouble2 * nextDouble2);
            if (d2 < 1.0d && d2 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d2) * -2.0d) / d2);
                nextLocalGaussian.set(Double.valueOf(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    public int nextInt() {
        return C9360e.m25286k(nextSeed());
    }

    public long nextLong() {
        return C9360e.m25287l(nextSeed());
    }

    public void setSeed(long j) {
        if (this.initialized) {
            throw new UnsupportedOperationException();
        }
    }

    public double nextDouble(double d) {
        if (d > 0.0d) {
            double l = ((double) (C9360e.m25287l(nextSeed()) >>> 11)) * 1.1102230246251565E-16d * d;
            return l < d ? l : Double.longBitsToDouble(Double.doubleToLongBits(d) - 1);
        }
        throw new IllegalArgumentException(BAD_BOUND);
    }

    public int nextInt(int i) {
        if (i > 0) {
            int k = C9360e.m25286k(nextSeed());
            int i2 = i - 1;
            if ((i & i2) == 0) {
                return k & i2;
            }
            while (true) {
                int i3 = k >>> 1;
                int i4 = i3 + i2;
                int i5 = i3 % i;
                if (i4 - i5 >= 0) {
                    return i5;
                }
                k = C9360e.m25286k(nextSeed());
            }
        } else {
            throw new IllegalArgumentException(BAD_BOUND);
        }
    }

    public long nextLong(long j) {
        if (j > 0) {
            long l = C9360e.m25287l(nextSeed());
            long j2 = j - 1;
            if ((j & j2) == 0) {
                return l & j2;
            }
            while (true) {
                long j3 = l >>> 1;
                long j4 = j3 + j2;
                long j5 = j3 % j;
                if (j4 - j5 >= 0) {
                    return j5;
                }
                l = C9360e.m25287l(nextSeed());
            }
        } else {
            throw new IllegalArgumentException(BAD_BOUND);
        }
    }

    public C9369c doubles() {
        return C9380j.m25306a(new C9484a(0, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d), false);
    }

    public C9372e ints() {
        return C9380j.m25307b(new C9485b(0, Long.MAX_VALUE, Integer.MAX_VALUE, 0), false);
    }

    public C9375g longs() {
        return C9380j.m25308c(new C9486c(0, Long.MAX_VALUE, Long.MAX_VALUE, 0), false);
    }

    public double nextDouble(double d, double d2) {
        if (d < d2) {
            return internalNextDouble(d, d2);
        }
        throw new IllegalArgumentException(BAD_RANGE);
    }

    public C9369c doubles(long j, double d, double d2) {
        if (j < 0) {
            throw new IllegalArgumentException(BAD_SIZE);
        } else if (d < d2) {
            return C9380j.m25306a(new C9484a(0, j, d, d2), false);
        } else {
            throw new IllegalArgumentException(BAD_RANGE);
        }
    }

    public C9372e ints(long j, int i, int i2) {
        if (j < 0) {
            throw new IllegalArgumentException(BAD_SIZE);
        } else if (i < i2) {
            return C9380j.m25307b(new C9485b(0, j, i, i2), false);
        } else {
            throw new IllegalArgumentException(BAD_RANGE);
        }
    }

    public C9375g longs(long j, long j2, long j3) {
        if (j < 0) {
            throw new IllegalArgumentException(BAD_SIZE);
        } else if (j2 < j3) {
            return C9380j.m25308c(new C9486c(0, j, j2, j3), false);
        } else {
            throw new IllegalArgumentException(BAD_RANGE);
        }
    }

    public int nextInt(int i, int i2) {
        if (i < i2) {
            return internalNextInt(i, i2);
        }
        throw new IllegalArgumentException(BAD_RANGE);
    }

    public long nextLong(long j, long j2) {
        if (j < j2) {
            return internalNextLong(j, j2);
        }
        throw new IllegalArgumentException(BAD_RANGE);
    }

    public C9369c doubles(double d, double d2) {
        if (d < d2) {
            return C9380j.m25306a(new C9484a(0, Long.MAX_VALUE, d, d2), false);
        }
        throw new IllegalArgumentException(BAD_RANGE);
    }

    public C9372e ints(int i, int i2) {
        if (i < i2) {
            return C9380j.m25307b(new C9485b(0, Long.MAX_VALUE, i, i2), false);
        }
        throw new IllegalArgumentException(BAD_RANGE);
    }

    public C9375g longs(long j, long j2) {
        if (j < j2) {
            return C9380j.m25308c(new C9486c(0, Long.MAX_VALUE, j, j2), false);
        }
        throw new IllegalArgumentException(BAD_RANGE);
    }
}
