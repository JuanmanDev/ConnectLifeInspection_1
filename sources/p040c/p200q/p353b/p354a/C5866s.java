package p040c.p200q.p353b.p354a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: c.q.b.a.s */
/* compiled from: Throwables */
public final class C5866s {

    /* renamed from: a */
    public static final Object f11384a;

    static {
        Object b = m16618b();
        f11384a = b;
        if (b != null) {
            m16617a();
        }
        if (f11384a != null) {
            m16620d();
        }
    }

    /* renamed from: a */
    public static Method m16617a() {
        return m16619c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    /* renamed from: b */
    public static Object m16618b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Method m16619c(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Method m16620d() {
        try {
            Method c = m16619c("getStackTraceDepth", Throwable.class);
            if (c == null) {
                return null;
            }
            c.invoke(m16618b(), new Object[]{new Throwable()});
            return c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static void m16621e(Throwable th) {
        C5850m.m16594o(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
