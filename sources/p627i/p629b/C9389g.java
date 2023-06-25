package p627i.p629b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: i.b.g */
/* compiled from: TestCase */
public abstract class C9389g extends C9383a implements C9388f {

    /* renamed from: a */
    public String f18411a;

    public C9389g() {
        this.f18411a = null;
    }

    /* renamed from: b */
    public static void m25324b(String str, Object obj) {
        C9383a.m25312b(str, obj);
    }

    /* renamed from: d */
    public static void m25325d(String str) {
        C9383a.m25314d(str);
        throw null;
    }

    public int countTestCases() {
        return 1;
    }

    /* renamed from: f */
    public String mo47297f() {
        return this.f18411a;
    }

    /* renamed from: g */
    public void mo47298g() {
        setUp();
        try {
            runTest();
            try {
                tearDown();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable unused) {
        }
        if (th != null) {
            throw th;
        }
    }

    /* renamed from: h */
    public void mo47299h(String str) {
        this.f18411a = str;
    }

    public void run(C9392j jVar) {
        jVar.run(this);
    }

    public void runTest() {
        m25324b("TestCase.fName cannot be null", this.f18411a);
        try {
            Method method = getClass().getMethod(this.f18411a, (Class[]) null);
            if (Modifier.isPublic(method.getModifiers())) {
                try {
                    method.invoke(this, new Object[0]);
                } catch (InvocationTargetException e) {
                    e.fillInStackTrace();
                    throw e.getTargetException();
                } catch (IllegalAccessException e2) {
                    e2.fillInStackTrace();
                    throw e2;
                }
            } else {
                m25325d("Method \"" + this.f18411a + "\" should be public");
                throw null;
            }
        } catch (NoSuchMethodException unused) {
            m25325d("Method \"" + this.f18411a + "\" not found");
            throw null;
        }
    }

    public void setUp() {
    }

    public void tearDown() {
    }

    public String toString() {
        return mo47297f() + "(" + getClass().getName() + ")";
    }

    public C9389g(String str) {
        this.f18411a = str;
    }
}
