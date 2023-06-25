package p040c.p200q.p201a.p264c.p294g.p333g;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* renamed from: c.q.a.c.g.g.y3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4916y3 {

    /* renamed from: a */
    public static final Unsafe f9742a = m13556l();

    /* renamed from: b */
    public static final Class f9743b = C4834v.m13268a();

    /* renamed from: c */
    public static final boolean f9744c = m13540A(Long.TYPE);

    /* renamed from: d */
    public static final C4890x3 f9745d;

    /* renamed from: e */
    public static final boolean f9746e;

    /* renamed from: f */
    public static final boolean f9747f;

    /* renamed from: g */
    public static final long f9748g = ((long) m13544E(byte[].class));

    /* renamed from: h */
    public static final boolean f9749h;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0146  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m13556l()
            f9742a = r7
            java.lang.Class r7 = p040c.p200q.p201a.p264c.p294g.p333g.C4834v.m13268a()
            f9743b = r7
            java.lang.Class r7 = java.lang.Long.TYPE
            boolean r7 = m13540A(r7)
            f9744c = r7
            java.lang.Class r7 = java.lang.Integer.TYPE
            boolean r7 = m13540A(r7)
            sun.misc.Unsafe r8 = f9742a
            r9 = 0
            if (r8 != 0) goto L_0x002e
            goto L_0x003f
        L_0x002e:
            boolean r10 = f9744c
            if (r10 == 0) goto L_0x0038
            c.q.a.c.g.g.w3 r9 = new c.q.a.c.g.g.w3
            r9.<init>(r8)
            goto L_0x003f
        L_0x0038:
            if (r7 == 0) goto L_0x003f
            c.q.a.c.g.g.v3 r9 = new c.q.a.c.g.g.v3
            r9.<init>(r8)
        L_0x003f:
            f9745d = r9
            java.lang.String r7 = "getLong"
            java.lang.String r8 = "objectFieldOffset"
            r10 = 2
            r11 = 1
            r12 = 0
            if (r9 != 0) goto L_0x004c
        L_0x004a:
            r9 = r12
            goto L_0x0074
        L_0x004c:
            sun.misc.Unsafe r9 = r9.f9729a
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x006f }
            java.lang.Class[] r13 = new java.lang.Class[r11]     // Catch:{ all -> 0x006f }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r13[r12] = r14     // Catch:{ all -> 0x006f }
            r9.getMethod(r8, r13)     // Catch:{ all -> 0x006f }
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ all -> 0x006f }
            r13[r12] = r6     // Catch:{ all -> 0x006f }
            java.lang.Class r14 = java.lang.Long.TYPE     // Catch:{ all -> 0x006f }
            r13[r11] = r14     // Catch:{ all -> 0x006f }
            r9.getMethod(r7, r13)     // Catch:{ all -> 0x006f }
            java.lang.reflect.Field r9 = m13546b()     // Catch:{ all -> 0x006f }
            if (r9 != 0) goto L_0x006d
            goto L_0x004a
        L_0x006d:
            r9 = r11
            goto L_0x0074
        L_0x006f:
            r9 = move-exception
            java.util.logging.Logger.getLogger(p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r9.toString()))
            goto L_0x004a
        L_0x0074:
            f9746e = r9
            c.q.a.c.g.g.x3 r9 = f9745d
            if (r9 != 0) goto L_0x007d
        L_0x007a:
            r6 = r12
            goto L_0x0101
        L_0x007d:
            sun.misc.Unsafe r9 = r9.f9729a
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x00fb }
            java.lang.Class[] r13 = new java.lang.Class[r11]     // Catch:{ all -> 0x00fb }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r13[r12] = r14     // Catch:{ all -> 0x00fb }
            r9.getMethod(r8, r13)     // Catch:{ all -> 0x00fb }
            java.lang.Class[] r8 = new java.lang.Class[r11]     // Catch:{ all -> 0x00fb }
            java.lang.Class<java.lang.Class> r13 = java.lang.Class.class
            r8[r12] = r13     // Catch:{ all -> 0x00fb }
            java.lang.String r13 = "arrayBaseOffset"
            r9.getMethod(r13, r8)     // Catch:{ all -> 0x00fb }
            java.lang.Class[] r8 = new java.lang.Class[r11]     // Catch:{ all -> 0x00fb }
            java.lang.Class<java.lang.Class> r13 = java.lang.Class.class
            r8[r12] = r13     // Catch:{ all -> 0x00fb }
            java.lang.String r13 = "arrayIndexScale"
            r9.getMethod(r13, r8)     // Catch:{ all -> 0x00fb }
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch:{ all -> 0x00fb }
            r8[r12] = r6     // Catch:{ all -> 0x00fb }
            java.lang.Class r13 = java.lang.Long.TYPE     // Catch:{ all -> 0x00fb }
            r8[r11] = r13     // Catch:{ all -> 0x00fb }
            java.lang.String r13 = "getInt"
            r9.getMethod(r13, r8)     // Catch:{ all -> 0x00fb }
            r8 = 3
            java.lang.Class[] r13 = new java.lang.Class[r8]     // Catch:{ all -> 0x00fb }
            r13[r12] = r6     // Catch:{ all -> 0x00fb }
            java.lang.Class r14 = java.lang.Long.TYPE     // Catch:{ all -> 0x00fb }
            r13[r11] = r14     // Catch:{ all -> 0x00fb }
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00fb }
            r13[r10] = r14     // Catch:{ all -> 0x00fb }
            java.lang.String r14 = "putInt"
            r9.getMethod(r14, r13)     // Catch:{ all -> 0x00fb }
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ all -> 0x00fb }
            r13[r12] = r6     // Catch:{ all -> 0x00fb }
            java.lang.Class r14 = java.lang.Long.TYPE     // Catch:{ all -> 0x00fb }
            r13[r11] = r14     // Catch:{ all -> 0x00fb }
            r9.getMethod(r7, r13)     // Catch:{ all -> 0x00fb }
            java.lang.Class[] r7 = new java.lang.Class[r8]     // Catch:{ all -> 0x00fb }
            r7[r12] = r6     // Catch:{ all -> 0x00fb }
            java.lang.Class r13 = java.lang.Long.TYPE     // Catch:{ all -> 0x00fb }
            r7[r11] = r13     // Catch:{ all -> 0x00fb }
            java.lang.Class r13 = java.lang.Long.TYPE     // Catch:{ all -> 0x00fb }
            r7[r10] = r13     // Catch:{ all -> 0x00fb }
            java.lang.String r13 = "putLong"
            r9.getMethod(r13, r7)     // Catch:{ all -> 0x00fb }
            java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ all -> 0x00fb }
            r7[r12] = r6     // Catch:{ all -> 0x00fb }
            java.lang.Class r13 = java.lang.Long.TYPE     // Catch:{ all -> 0x00fb }
            r7[r11] = r13     // Catch:{ all -> 0x00fb }
            java.lang.String r13 = "getObject"
            r9.getMethod(r13, r7)     // Catch:{ all -> 0x00fb }
            java.lang.Class[] r7 = new java.lang.Class[r8]     // Catch:{ all -> 0x00fb }
            r7[r12] = r6     // Catch:{ all -> 0x00fb }
            java.lang.Class r8 = java.lang.Long.TYPE     // Catch:{ all -> 0x00fb }
            r7[r11] = r8     // Catch:{ all -> 0x00fb }
            r7[r10] = r6     // Catch:{ all -> 0x00fb }
            java.lang.String r6 = "putObject"
            r9.getMethod(r6, r7)     // Catch:{ all -> 0x00fb }
            r6 = r11
            goto L_0x0101
        L_0x00fb:
            r6 = move-exception
            java.util.logging.Logger.getLogger(p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r6.toString()))
            goto L_0x007a
        L_0x0101:
            f9747f = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m13544E(r6)
            long r6 = (long) r6
            f9748g = r6
            m13544E(r5)
            m13545a(r5)
            m13544E(r4)
            m13545a(r4)
            m13544E(r3)
            m13545a(r3)
            m13544E(r2)
            m13545a(r2)
            m13544E(r1)
            m13545a(r1)
            m13544E(r0)
            m13545a(r0)
            java.lang.reflect.Field r0 = m13546b()
            if (r0 == 0) goto L_0x013d
            c.q.a.c.g.g.x3 r1 = f9745d
            if (r1 == 0) goto L_0x013d
            r1.mo26816l(r0)
        L_0x013d:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0146
            goto L_0x0147
        L_0x0146:
            r11 = r12
        L_0x0147:
            f9749h = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.<clinit>():void");
    }

    /* renamed from: A */
    public static boolean m13540A(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = C4834v.f9690a;
        try {
            Class cls3 = f9743b;
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

    /* renamed from: B */
    public static boolean m13541B(Object obj, long j) {
        return f9745d.mo26772g(obj, j);
    }

    /* renamed from: C */
    public static boolean m13542C() {
        return f9747f;
    }

    /* renamed from: D */
    public static boolean m13543D() {
        return f9746e;
    }

    /* renamed from: E */
    public static int m13544E(Class cls) {
        if (f9747f) {
            return f9745d.mo26812h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    public static int m13545a(Class cls) {
        if (f9747f) {
            return f9745d.mo26813i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m13546b() {
        int i = C4834v.f9690a;
        Field c = m13547c(Buffer.class, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m13547c(Buffer.class, "address");
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    public static Field m13547c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m13548d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int j3 = f9745d.mo26814j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        f9745d.mo26818n(obj, j2, ((b & 255) << i) | (j3 & (~(255 << i))));
    }

    /* renamed from: e */
    public static void m13549e(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b & 255) << i;
        f9745d.mo26818n(obj, j2, i2 | (f9745d.mo26814j(obj, j2) & (~(255 << i))));
    }

    /* renamed from: f */
    public static double m13550f(Object obj, long j) {
        return f9745d.mo26766a(obj, j);
    }

    /* renamed from: g */
    public static float m13551g(Object obj, long j) {
        return f9745d.mo26767b(obj, j);
    }

    /* renamed from: h */
    public static int m13552h(Object obj, long j) {
        return f9745d.mo26814j(obj, j);
    }

    /* renamed from: i */
    public static long m13553i(Object obj, long j) {
        return f9745d.mo26815k(obj, j);
    }

    /* renamed from: j */
    public static Object m13554j(Class cls) {
        try {
            return f9742a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static Object m13555k(Object obj, long j) {
        return f9745d.mo26817m(obj, j);
    }

    /* renamed from: l */
    public static Unsafe m13556l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C4812u3());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    public static void m13562r(Object obj, long j, boolean z) {
        f9745d.mo26768c(obj, j, z);
    }

    /* renamed from: s */
    public static void m13563s(byte[] bArr, long j, byte b) {
        f9745d.mo26769d(bArr, f9748g + j, b);
    }

    /* renamed from: t */
    public static void m13564t(Object obj, long j, double d) {
        f9745d.mo26770e(obj, j, d);
    }

    /* renamed from: u */
    public static void m13565u(Object obj, long j, float f) {
        f9745d.mo26771f(obj, j, f);
    }

    /* renamed from: v */
    public static void m13566v(Object obj, long j, int i) {
        f9745d.mo26818n(obj, j, i);
    }

    /* renamed from: w */
    public static void m13567w(Object obj, long j, long j2) {
        f9745d.mo26819o(obj, j, j2);
    }

    /* renamed from: x */
    public static void m13568x(Object obj, long j, Object obj2) {
        f9745d.mo26820p(obj, j, obj2);
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m13569y(Object obj, long j) {
        return ((byte) ((f9745d.mo26814j(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m13570z(Object obj, long j) {
        return ((byte) ((f9745d.mo26814j(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
