package p648m.p684g.p686e;

import java.io.PrintStream;

/* renamed from: m.g.e.e */
/* compiled from: Util */
public final class C9814e {

    /* renamed from: a */
    public static C9816b f19083a = null;

    /* renamed from: b */
    public static boolean f19084b = false;

    /* renamed from: m.g.e.e$b */
    /* compiled from: Util */
    public static final class C9816b extends SecurityManager {
        public C9816b() {
        }

        public Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    /* renamed from: a */
    public static Class<?> m26382a() {
        int i;
        C9816b b = m26383b();
        if (b == null) {
            return null;
        }
        Class<?>[] classContext = b.getClassContext();
        String name = C9814e.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 < classContext.length && (i = i2 + 2) < classContext.length) {
            return classContext[i];
        }
        throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
    }

    /* renamed from: b */
    public static C9816b m26383b() {
        C9816b bVar = f19083a;
        if (bVar != null) {
            return bVar;
        }
        if (f19084b) {
            return null;
        }
        C9816b e = m26386e();
        f19083a = e;
        f19084b = true;
        return e;
    }

    /* renamed from: c */
    public static final void m26384c(String str) {
        PrintStream printStream = System.err;
        printStream.println("SLF4J: " + str);
    }

    /* renamed from: d */
    public static final void m26385d(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    /* renamed from: e */
    public static C9816b m26386e() {
        try {
            return new C9816b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m26387f(String str) {
        String g = m26388g(str);
        if (g == null) {
            return false;
        }
        return g.equalsIgnoreCase("true");
    }

    /* renamed from: g */
    public static String m26388g(String str) {
        if (str != null) {
            try {
                return System.getProperty(str);
            } catch (SecurityException unused) {
                return null;
            }
        } else {
            throw new IllegalArgumentException("null input");
        }
    }
}
