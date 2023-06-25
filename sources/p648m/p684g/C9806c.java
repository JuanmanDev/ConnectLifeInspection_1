package p648m.p684g;

import com.juconnect.vivino.global.UrlConstKt;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.impl.StaticLoggerBinder;
import p648m.p684g.p685d.C9809c;
import p648m.p684g.p686e.C9810a;
import p648m.p684g.p686e.C9812c;
import p648m.p684g.p686e.C9813d;
import p648m.p684g.p686e.C9814e;

/* renamed from: m.g.c */
/* compiled from: LoggerFactory */
public final class C9806c {

    /* renamed from: a */
    public static volatile int f19062a;

    /* renamed from: b */
    public static final C9813d f19063b = new C9813d();

    /* renamed from: c */
    public static final C9810a f19064c = new C9810a();

    /* renamed from: d */
    public static boolean f19065d = C9814e.m26387f("slf4j.detectLoggerNameMismatch");

    /* renamed from: e */
    public static final String[] f19066e = {"1.6", "1.7"};

    /* renamed from: f */
    public static String f19067f = "org/slf4j/impl/StaticLoggerBinder.class";

    /* renamed from: a */
    public static final void m26337a() {
        Set<URL> set = null;
        try {
            if (!m26348l()) {
                set = m26342f();
                m26355s(set);
            }
            StaticLoggerBinder.getSingleton();
            f19062a = 3;
            m26354r(set);
            m26343g();
            m26352p();
            f19063b.mo50730b();
        } catch (NoClassDefFoundError e) {
            if (m26349m(e.getMessage())) {
                f19062a = 4;
                C9814e.m26384c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                C9814e.m26384c("Defaulting to no-operation (NOP) logger implementation");
                C9814e.m26384c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                return;
            }
            m26341e(e);
            throw e;
        } catch (NoSuchMethodError e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                f19062a = 2;
                C9814e.m26384c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                C9814e.m26384c("Your binding is version 1.5.5 or earlier.");
                C9814e.m26384c("Upgrade your binding to version 1.6.x.");
            }
            throw e2;
        } catch (Exception e3) {
            m26341e(e3);
            throw new IllegalStateException("Unexpected initialization failure", e3);
        }
    }

    /* renamed from: b */
    public static void m26338b(C9809c cVar, int i) {
        if (cVar.mo50710a().mo50723c()) {
            m26339c(i);
        } else if (!cVar.mo50710a().mo50724d()) {
            m26340d();
        }
    }

    /* renamed from: c */
    public static void m26339c(int i) {
        C9814e.m26384c("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        C9814e.m26384c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        C9814e.m26384c("See also http://www.slf4j.org/codes.html#replay");
    }

    /* renamed from: d */
    public static void m26340d() {
        C9814e.m26384c("The following set of substitute loggers may have been accessed");
        C9814e.m26384c("during the initialization phase. Logging calls during this");
        C9814e.m26384c("phase were not honored. However, subsequent logging calls to these");
        C9814e.m26384c("loggers will work as normally expected.");
        C9814e.m26384c("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    /* renamed from: e */
    public static void m26341e(Throwable th) {
        f19062a = 2;
        C9814e.m26385d("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* renamed from: f */
    public static Set<URL> m26342f() {
        Enumeration<URL> enumeration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C9806c.class.getClassLoader();
            if (classLoader == null) {
                enumeration = ClassLoader.getSystemResources(f19067f);
            } else {
                enumeration = classLoader.getResources(f19067f);
            }
            while (enumeration.hasMoreElements()) {
                linkedHashSet.add(enumeration.nextElement());
            }
        } catch (IOException e) {
            C9814e.m26385d("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* renamed from: g */
    public static void m26343g() {
        synchronized (f19063b) {
            f19063b.mo50733e();
            for (C9812c next : f19063b.mo50732d()) {
                next.mo50728g(m26346j(next.getName()));
            }
        }
    }

    /* renamed from: h */
    public static C9804a m26344h() {
        if (f19062a == 0) {
            synchronized (C9806c.class) {
                if (f19062a == 0) {
                    f19062a = 1;
                    m26351o();
                }
            }
        }
        int i = f19062a;
        if (i == 1) {
            return f19063b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        } else if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        } else {
            if (i == 4) {
                return f19064c;
            }
            throw new IllegalStateException("Unreachable code");
        }
    }

    /* renamed from: i */
    public static C9805b m26345i(Class<?> cls) {
        Class<?> a;
        C9805b j = m26346j(cls.getName());
        if (f19065d && (a = C9814e.m26382a()) != null && m26350n(cls, a)) {
            C9814e.m26384c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", new Object[]{j.getName(), a.getName()}));
            C9814e.m26384c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return j;
    }

    /* renamed from: j */
    public static C9805b m26346j(String str) {
        return m26344h().mo50699a(str);
    }

    /* renamed from: k */
    public static boolean m26347k(Set<URL> set) {
        return set.size() > 1;
    }

    /* renamed from: l */
    public static boolean m26348l() {
        String g = C9814e.m26388g("java.vendor.url");
        if (g == null) {
            return false;
        }
        return g.toLowerCase().contains(UrlConstKt.APP_PLATFORM);
    }

    /* renamed from: m */
    public static boolean m26349m(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("org/slf4j/impl/StaticLoggerBinder") || str.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    /* renamed from: n */
    public static boolean m26350n(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    /* renamed from: o */
    public static final void m26351o() {
        m26337a();
        if (f19062a == 3) {
            m26356t();
        }
    }

    /* renamed from: p */
    public static void m26352p() {
        LinkedBlockingQueue<C9809c> c = f19063b.mo50731c();
        int size = c.size();
        ArrayList<C9809c> arrayList = new ArrayList<>(128);
        int i = 0;
        while (c.drainTo(arrayList, 128) != 0) {
            for (C9809c cVar : arrayList) {
                m26353q(cVar);
                int i2 = i + 1;
                if (i == 0) {
                    m26338b(cVar, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    /* renamed from: q */
    public static void m26353q(C9809c cVar) {
        if (cVar != null) {
            C9812c a = cVar.mo50710a();
            String name = a.getName();
            if (a.mo50725e()) {
                throw new IllegalStateException("Delegate logger cannot be null at this state.");
            } else if (!a.mo50724d()) {
                if (a.mo50723c()) {
                    a.mo50727f(cVar);
                } else {
                    C9814e.m26384c(name);
                }
            }
        }
    }

    /* renamed from: r */
    public static void m26354r(Set<URL> set) {
        if (set != null && m26347k(set)) {
            C9814e.m26384c("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
        }
    }

    /* renamed from: s */
    public static void m26355s(Set<URL> set) {
        if (m26347k(set)) {
            C9814e.m26384c("Class path contains multiple SLF4J bindings.");
            for (URL url : set) {
                C9814e.m26384c("Found binding in [" + url + "]");
            }
            C9814e.m26384c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* renamed from: t */
    public static final void m26356t() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String startsWith : f19066e) {
                if (str.startsWith(startsWith)) {
                    z = true;
                }
            }
            if (!z) {
                C9814e.m26384c("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f19066e).toString());
                C9814e.m26384c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            C9814e.m26385d("Unexpected problem occured during version sanity check", th);
        }
    }
}
