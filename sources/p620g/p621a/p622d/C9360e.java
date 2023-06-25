package p620g.p621a.p622d;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import sun.misc.Unsafe;

/* renamed from: g.a.d.e */
/* compiled from: TLRandom */
public final class C9360e {

    /* renamed from: a */
    public static final Unsafe f18366a = C9364f.f18379a;

    /* renamed from: b */
    public static final boolean f18367b;

    /* renamed from: c */
    public static final boolean f18368c;

    /* renamed from: d */
    public static final long f18369d;

    /* renamed from: e */
    public static final long f18370e;

    /* renamed from: f */
    public static final long f18371f;

    /* renamed from: g */
    public static final long f18372g;

    /* renamed from: h */
    public static final ThreadLocal<C9363c> f18373h = new C9361a();

    /* renamed from: i */
    public static final AtomicInteger f18374i = new AtomicInteger();

    /* renamed from: j */
    public static final AtomicLong f18375j = new AtomicLong(m25287l(System.currentTimeMillis()) ^ m25287l(System.nanoTime()));

    /* renamed from: g.a.d.e$a */
    /* compiled from: TLRandom */
    public static class C9361a extends ThreadLocal<C9363c> {
        /* renamed from: a */
        public C9363c initialValue() {
            return new C9363c((C9361a) null);
        }
    }

    /* renamed from: g.a.d.e$b */
    /* compiled from: TLRandom */
    public static class C9362b implements PrivilegedAction<Boolean> {
        /* renamed from: a */
        public Boolean run() {
            return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
        }
    }

    /* renamed from: g.a.d.e$c */
    /* compiled from: TLRandom */
    public static final class C9363c {

        /* renamed from: a */
        public long f18376a;

        /* renamed from: b */
        public int f18377b;

        /* renamed from: c */
        public int f18378c;

        public C9363c() {
        }

        public /* synthetic */ C9363c(C9361a aVar) {
            this();
        }
    }

    static {
        try {
            f18367b = m25284i();
            boolean g = m25282g();
            f18368c = g;
            if (!g) {
                f18369d = f18366a.objectFieldOffset(Thread.class.getDeclaredField("threadLocals"));
                f18370e = f18366a.objectFieldOffset(Thread.class.getDeclaredField("inheritableThreadLocals"));
                f18371f = f18366a.objectFieldOffset(Thread.class.getDeclaredField(f18367b ? "accessControlContext" : "inheritedAccessControlContext"));
                f18372g = f18366a.objectFieldOffset(Thread.class.getDeclaredField("contextClassLoader"));
            } else {
                f18369d = 0;
                f18370e = 0;
                f18371f = 0;
                f18372g = 0;
            }
            if (((Boolean) AccessController.doPrivileged(new C9362b())).booleanValue()) {
                byte[] seed = SecureRandom.getSeed(8);
                long j = ((long) seed[0]) & 255;
                for (int i = 1; i < 8; i++) {
                    j = (j << 8) | (((long) seed[i]) & 255);
                }
                f18375j.set(j);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static final int m25276a(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        m25292q(i4);
        return i4;
    }

    /* renamed from: b */
    public static final void m25277b(Thread thread) {
        if (!f18368c) {
            f18366a.putObject(thread, f18369d, (Object) null);
            f18366a.putObject(thread, f18370e, (Object) null);
        }
    }

    /* renamed from: c */
    public static final int m25278c() {
        return m25279d();
    }

    /* renamed from: d */
    public static int m25279d() {
        return f18373h.get().f18377b;
    }

    /* renamed from: e */
    public static int m25280e() {
        return f18373h.get().f18378c;
    }

    /* renamed from: f */
    public static long m25281f() {
        return f18373h.get().f18376a;
    }

    /* renamed from: g */
    public static boolean m25282g() {
        if (m25283h("android.util.DisplayMetrics")) {
            return true;
        }
        return m25283h("org.robovm.rt.bro.Bro");
    }

    /* renamed from: h */
    public static boolean m25283h(String str) {
        Class<?> cls;
        try {
            cls = Class.forName(str, false, C9360e.class.getClassLoader());
        } catch (Throwable unused) {
            cls = null;
        }
        return cls != null;
    }

    /* renamed from: i */
    public static boolean m25284i() {
        String property;
        if (!m25283h("com.ibm.misc.JarVersion") || (property = System.getProperty("java.class.version", "45")) == null || property.length() < 2 || "52".compareTo(property.substring(0, 2)) <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static final void m25285j() {
        int addAndGet = f18374i.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        m25294s(m25287l(f18375j.getAndAdd(-4942790177534073029L)));
        m25292q(addAndGet);
    }

    /* renamed from: k */
    public static int m25286k(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        return (int) (((j2 ^ (j2 >>> 33)) * -4265267296055464877L) >>> 32);
    }

    /* renamed from: l */
    public static long m25287l(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
        return j3 ^ (j3 >>> 33);
    }

    /* renamed from: m */
    public static final int m25288m() {
        int i;
        int e = m25280e();
        if (e != 0) {
            int i2 = e ^ (e << 13);
            int i3 = i2 ^ (i2 >>> 17);
            i = i3 ^ (i3 << 5);
        } else {
            i = m25286k(f18375j.getAndAdd(-4942790177534073029L));
            if (i == 0) {
                i = 1;
            }
        }
        m25293r(i);
        return i;
    }

    /* renamed from: n */
    public static final long m25289n() {
        long f = m25281f() - 7046029254386353131L;
        m25294s(f);
        return f;
    }

    /* renamed from: o */
    public static final void m25290o(Thread thread, ClassLoader classLoader) {
        if (!f18368c) {
            f18366a.putObject(thread, f18372g, classLoader);
        }
    }

    /* renamed from: p */
    public static final void m25291p(Thread thread, AccessControlContext accessControlContext) {
        if (!f18368c) {
            f18366a.putOrderedObject(thread, f18371f, accessControlContext);
        }
    }

    /* renamed from: q */
    public static void m25292q(int i) {
        f18373h.get().f18377b = i;
    }

    /* renamed from: r */
    public static void m25293r(int i) {
        f18373h.get().f18378c = i;
    }

    /* renamed from: s */
    public static void m25294s(long j) {
        f18373h.get().f18376a = j;
    }
}
