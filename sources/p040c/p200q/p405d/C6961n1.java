package p040c.p200q.p405d;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: c.q.d.n1 */
/* compiled from: UnsafeUtil */
public final class C6961n1 {

    /* renamed from: a */
    public static final Logger f13327a = Logger.getLogger(C6961n1.class.getName());

    /* renamed from: b */
    public static final Unsafe f13328b = m20331F();

    /* renamed from: c */
    public static final Class<?> f13329c = C6898d.m19665b();

    /* renamed from: d */
    public static final boolean f13330d = m20362o(Long.TYPE);

    /* renamed from: e */
    public static final boolean f13331e = m20362o(Integer.TYPE);

    /* renamed from: f */
    public static final C6966e f13332f = m20329D();

    /* renamed from: g */
    public static final boolean f13333g = m20347V();

    /* renamed from: h */
    public static final boolean f13334h = m20346U();

    /* renamed from: i */
    public static final long f13335i = ((long) m20358k(byte[].class));

    /* renamed from: j */
    public static final long f13336j = m20364q(m20360m());

    /* renamed from: k */
    public static final boolean f13337k = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: c.q.d.n1$a */
    /* compiled from: UnsafeUtil */
    public static class C6962a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public Unsafe run() {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    /* renamed from: c.q.d.n1$b */
    /* compiled from: UnsafeUtil */
    public static final class C6963b extends C6966e {
        public C6963b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo32248c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public boolean mo32249d(Object obj, long j) {
            if (C6961n1.f13337k) {
                return C6961n1.m20366s(obj, j);
            }
            return C6961n1.m20367t(obj, j);
        }

        /* renamed from: e */
        public byte mo32250e(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public byte mo32251f(Object obj, long j) {
            if (C6961n1.f13337k) {
                return C6961n1.m20370w(obj, j);
            }
            return C6961n1.m20371x(obj, j);
        }

        /* renamed from: g */
        public double mo32252g(Object obj, long j) {
            return Double.longBitsToDouble(mo32262k(obj, j));
        }

        /* renamed from: h */
        public float mo32253h(Object obj, long j) {
            return Float.intBitsToFloat(mo32261i(obj, j));
        }

        /* renamed from: j */
        public long mo32254j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public void mo32255n(Object obj, long j, boolean z) {
            if (C6961n1.f13337k) {
                C6961n1.m20336K(obj, j, z);
            } else {
                C6961n1.m20337L(obj, j, z);
            }
        }

        /* renamed from: o */
        public void mo32256o(Object obj, long j, byte b) {
            if (C6961n1.f13337k) {
                C6961n1.m20339N(obj, j, b);
            } else {
                C6961n1.m20340O(obj, j, b);
            }
        }

        /* renamed from: p */
        public void mo32257p(Object obj, long j, double d) {
            mo32266s(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: q */
        public void mo32258q(Object obj, long j, float f) {
            mo32265r(obj, j, Float.floatToIntBits(f));
        }
    }

    /* renamed from: c.q.d.n1$c */
    /* compiled from: UnsafeUtil */
    public static final class C6964c extends C6966e {
        public C6964c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo32248c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public boolean mo32249d(Object obj, long j) {
            if (C6961n1.f13337k) {
                return C6961n1.m20366s(obj, j);
            }
            return C6961n1.m20367t(obj, j);
        }

        /* renamed from: e */
        public byte mo32250e(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public byte mo32251f(Object obj, long j) {
            if (C6961n1.f13337k) {
                return C6961n1.m20370w(obj, j);
            }
            return C6961n1.m20371x(obj, j);
        }

        /* renamed from: g */
        public double mo32252g(Object obj, long j) {
            return Double.longBitsToDouble(mo32262k(obj, j));
        }

        /* renamed from: h */
        public float mo32253h(Object obj, long j) {
            return Float.intBitsToFloat(mo32261i(obj, j));
        }

        /* renamed from: j */
        public long mo32254j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public void mo32255n(Object obj, long j, boolean z) {
            if (C6961n1.f13337k) {
                C6961n1.m20336K(obj, j, z);
            } else {
                C6961n1.m20337L(obj, j, z);
            }
        }

        /* renamed from: o */
        public void mo32256o(Object obj, long j, byte b) {
            if (C6961n1.f13337k) {
                C6961n1.m20339N(obj, j, b);
            } else {
                C6961n1.m20340O(obj, j, b);
            }
        }

        /* renamed from: p */
        public void mo32257p(Object obj, long j, double d) {
            mo32266s(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: q */
        public void mo32258q(Object obj, long j, float f) {
            mo32265r(obj, j, Float.floatToIntBits(f));
        }
    }

    /* renamed from: c.q.d.n1$d */
    /* compiled from: UnsafeUtil */
    public static final class C6965d extends C6966e {
        public C6965d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo32248c(long j, byte[] bArr, long j2, long j3) {
            this.f13338a.copyMemory((Object) null, j, bArr, C6961n1.f13335i + j2, j3);
        }

        /* renamed from: d */
        public boolean mo32249d(Object obj, long j) {
            return this.f13338a.getBoolean(obj, j);
        }

        /* renamed from: e */
        public byte mo32250e(long j) {
            return this.f13338a.getByte(j);
        }

        /* renamed from: f */
        public byte mo32251f(Object obj, long j) {
            return this.f13338a.getByte(obj, j);
        }

        /* renamed from: g */
        public double mo32252g(Object obj, long j) {
            return this.f13338a.getDouble(obj, j);
        }

        /* renamed from: h */
        public float mo32253h(Object obj, long j) {
            return this.f13338a.getFloat(obj, j);
        }

        /* renamed from: j */
        public long mo32254j(long j) {
            return this.f13338a.getLong(j);
        }

        /* renamed from: n */
        public void mo32255n(Object obj, long j, boolean z) {
            this.f13338a.putBoolean(obj, j, z);
        }

        /* renamed from: o */
        public void mo32256o(Object obj, long j, byte b) {
            this.f13338a.putByte(obj, j, b);
        }

        /* renamed from: p */
        public void mo32257p(Object obj, long j, double d) {
            this.f13338a.putDouble(obj, j, d);
        }

        /* renamed from: q */
        public void mo32258q(Object obj, long j, float f) {
            this.f13338a.putFloat(obj, j, f);
        }
    }

    /* renamed from: c.q.d.n1$e */
    /* compiled from: UnsafeUtil */
    public static abstract class C6966e {

        /* renamed from: a */
        public Unsafe f13338a;

        public C6966e(Unsafe unsafe) {
            this.f13338a = unsafe;
        }

        /* renamed from: a */
        public final int mo32259a(Class<?> cls) {
            return this.f13338a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int mo32260b(Class<?> cls) {
            return this.f13338a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo32248c(long j, byte[] bArr, long j2, long j3);

        /* renamed from: d */
        public abstract boolean mo32249d(Object obj, long j);

        /* renamed from: e */
        public abstract byte mo32250e(long j);

        /* renamed from: f */
        public abstract byte mo32251f(Object obj, long j);

        /* renamed from: g */
        public abstract double mo32252g(Object obj, long j);

        /* renamed from: h */
        public abstract float mo32253h(Object obj, long j);

        /* renamed from: i */
        public final int mo32261i(Object obj, long j) {
            return this.f13338a.getInt(obj, j);
        }

        /* renamed from: j */
        public abstract long mo32254j(long j);

        /* renamed from: k */
        public final long mo32262k(Object obj, long j) {
            return this.f13338a.getLong(obj, j);
        }

        /* renamed from: l */
        public final Object mo32263l(Object obj, long j) {
            return this.f13338a.getObject(obj, j);
        }

        /* renamed from: m */
        public final long mo32264m(Field field) {
            return this.f13338a.objectFieldOffset(field);
        }

        /* renamed from: n */
        public abstract void mo32255n(Object obj, long j, boolean z);

        /* renamed from: o */
        public abstract void mo32256o(Object obj, long j, byte b);

        /* renamed from: p */
        public abstract void mo32257p(Object obj, long j, double d);

        /* renamed from: q */
        public abstract void mo32258q(Object obj, long j, float f);

        /* renamed from: r */
        public final void mo32265r(Object obj, long j, int i) {
            this.f13338a.putInt(obj, j, i);
        }

        /* renamed from: s */
        public final void mo32266s(Object obj, long j, long j2) {
            this.f13338a.putLong(obj, j, j2);
        }

        /* renamed from: t */
        public final void mo32267t(Object obj, long j, Object obj2) {
            this.f13338a.putObject(obj, j, obj2);
        }
    }

    static {
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        m20358k(cls6);
        m20359l(cls6);
        m20358k(cls5);
        m20359l(cls5);
        m20358k(cls4);
        m20359l(cls4);
        m20358k(cls3);
        m20359l(cls3);
        m20358k(cls2);
        m20359l(cls2);
        m20358k(cls);
        m20359l(cls);
    }

    /* renamed from: A */
    public static int m20326A(Object obj, long j) {
        return f13332f.mo32261i(obj, j);
    }

    /* renamed from: B */
    public static long m20327B(long j) {
        return f13332f.mo32254j(j);
    }

    /* renamed from: C */
    public static long m20328C(Object obj, long j) {
        return f13332f.mo32262k(obj, j);
    }

    /* renamed from: D */
    public static C6966e m20329D() {
        if (f13328b == null) {
            return null;
        }
        if (!C6898d.m19666c()) {
            return new C6965d(f13328b);
        }
        if (f13330d) {
            return new C6964c(f13328b);
        }
        if (f13331e) {
            return new C6963b(f13328b);
        }
        return null;
    }

    /* renamed from: E */
    public static Object m20330E(Object obj, long j) {
        return f13332f.mo32263l(obj, j);
    }

    /* renamed from: F */
    public static Unsafe m20331F() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C6962a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: G */
    public static boolean m20332G() {
        return f13334h;
    }

    /* renamed from: H */
    public static boolean m20333H() {
        return f13333g;
    }

    /* renamed from: I */
    public static long m20334I(Field field) {
        return f13332f.mo32264m(field);
    }

    /* renamed from: J */
    public static void m20335J(Object obj, long j, boolean z) {
        f13332f.mo32255n(obj, j, z);
    }

    /* renamed from: K */
    public static void m20336K(Object obj, long j, boolean z) {
        m20339N(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: L */
    public static void m20337L(Object obj, long j, boolean z) {
        m20340O(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: M */
    public static void m20338M(byte[] bArr, long j, byte b) {
        f13332f.mo32256o(bArr, f13335i + j, b);
    }

    /* renamed from: N */
    public static void m20339N(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int A = m20326A(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m20343R(obj, j2, ((255 & b) << i) | (A & (~(255 << i))));
    }

    /* renamed from: O */
    public static void m20340O(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m20343R(obj, j2, ((255 & b) << i) | (m20326A(obj, j2) & (~(255 << i))));
    }

    /* renamed from: P */
    public static void m20341P(Object obj, long j, double d) {
        f13332f.mo32257p(obj, j, d);
    }

    /* renamed from: Q */
    public static void m20342Q(Object obj, long j, float f) {
        f13332f.mo32258q(obj, j, f);
    }

    /* renamed from: R */
    public static void m20343R(Object obj, long j, int i) {
        f13332f.mo32265r(obj, j, i);
    }

    /* renamed from: S */
    public static void m20344S(Object obj, long j, long j2) {
        f13332f.mo32266s(obj, j, j2);
    }

    /* renamed from: T */
    public static void m20345T(Object obj, long j, Object obj2) {
        f13332f.mo32267t(obj, j, obj2);
    }

    /* renamed from: U */
    public static boolean m20346U() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f13328b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls2.getMethod("getInt", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putInt", new Class[]{cls, Long.TYPE, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putLong", new Class[]{cls, Long.TYPE, Long.TYPE});
            cls2.getMethod("getObject", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putObject", new Class[]{cls, Long.TYPE, cls});
            if (C6898d.m19666c()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putByte", new Class[]{cls, Long.TYPE, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putBoolean", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putFloat", new Class[]{cls, Long.TYPE, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putDouble", new Class[]{cls, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f13327a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* renamed from: V */
    public static boolean m20347V() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f13328b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            if (m20360m() == null) {
                return false;
            }
            if (C6898d.m19666c()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{Long.TYPE});
            cls2.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{Long.TYPE});
            cls2.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{Long.TYPE});
            cls2.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls2.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls2.getMethod("copyMemory", new Class[]{cls, Long.TYPE, cls, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f13327a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* renamed from: i */
    public static long m20356i(ByteBuffer byteBuffer) {
        return f13332f.mo32262k(byteBuffer, f13336j);
    }

    /* renamed from: j */
    public static <T> T m20357j(Class<T> cls) {
        try {
            return f13328b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static int m20358k(Class<?> cls) {
        if (f13334h) {
            return f13332f.mo32259a(cls);
        }
        return -1;
    }

    /* renamed from: l */
    public static int m20359l(Class<?> cls) {
        if (f13334h) {
            return f13332f.mo32260b(cls);
        }
        return -1;
    }

    /* renamed from: m */
    public static Field m20360m() {
        Field p;
        if (C6898d.m19666c() && (p = m20363p(Buffer.class, "effectiveDirectAddress")) != null) {
            return p;
        }
        Field p2 = m20363p(Buffer.class, "address");
        if (p2 == null || p2.getType() != Long.TYPE) {
            return null;
        }
        return p2;
    }

    /* renamed from: n */
    public static void m20361n(long j, byte[] bArr, long j2, long j3) {
        f13332f.mo32248c(j, bArr, j2, j3);
    }

    /* renamed from: o */
    public static boolean m20362o(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C6898d.m19666c()) {
            return false;
        }
        try {
            Class<?> cls3 = f13329c;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: p */
    public static Field m20363p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static long m20364q(Field field) {
        C6966e eVar;
        if (field == null || (eVar = f13332f) == null) {
            return -1;
        }
        return eVar.mo32264m(field);
    }

    /* renamed from: r */
    public static boolean m20365r(Object obj, long j) {
        return f13332f.mo32249d(obj, j);
    }

    /* renamed from: s */
    public static boolean m20366s(Object obj, long j) {
        return m20370w(obj, j) != 0;
    }

    /* renamed from: t */
    public static boolean m20367t(Object obj, long j) {
        return m20371x(obj, j) != 0;
    }

    /* renamed from: u */
    public static byte m20368u(long j) {
        return f13332f.mo32250e(j);
    }

    /* renamed from: v */
    public static byte m20369v(byte[] bArr, long j) {
        return f13332f.mo32251f(bArr, f13335i + j);
    }

    /* renamed from: w */
    public static byte m20370w(Object obj, long j) {
        return (byte) ((m20326A(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: x */
    public static byte m20371x(Object obj, long j) {
        return (byte) ((m20326A(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: y */
    public static double m20372y(Object obj, long j) {
        return f13332f.mo32252g(obj, j);
    }

    /* renamed from: z */
    public static float m20373z(Object obj, long j) {
        return f13332f.mo32253h(obj, j);
    }
}
