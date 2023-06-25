package p627i.p629b;

import androidx.test.internal.runner.listener.InstrumentationResultPrinter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import p648m.p668e.p669j.C9694a;

/* renamed from: i.b.k */
/* compiled from: TestSuite */
public class C9394k implements C9388f {
    public String fName;
    public Vector<C9388f> fTests;

    /* renamed from: i.b.k$a */
    /* compiled from: TestSuite */
    public static class C9395a extends C9389g {

        /* renamed from: b */
        public final /* synthetic */ String f18415b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9395a(String str, String str2) {
            super(str);
            this.f18415b = str2;
        }

        public void runTest() {
            C9389g.m25325d(this.f18415b);
            throw null;
        }
    }

    public C9394k() {
        this.fTests = new Vector<>(10);
    }

    private void addTestMethod(Method method, List<String> list, Class<?> cls) {
        String name = method.getName();
        if (!list.contains(name)) {
            if (isPublicTestMethod(method)) {
                list.add(name);
                addTest(createTest(cls, name));
            } else if (isTestMethod(method)) {
                addTest(warning("Test method isn't public: " + method.getName() + "(" + cls.getCanonicalName() + ")"));
            }
        }
    }

    private void addTestsFromTestCase(Class<?> cls) {
        this.fName = cls.getName();
        try {
            getTestConstructor(cls);
            if (!Modifier.isPublic(cls.getModifiers())) {
                addTest(warning("Class " + cls.getName() + " is not public"));
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 = cls; C9388f.class.isAssignableFrom(cls2); cls2 = cls2.getSuperclass()) {
                for (Method addTestMethod : C9694a.m26157a(cls2)) {
                    addTestMethod(addTestMethod, arrayList, cls);
                }
            }
            if (this.fTests.size() == 0) {
                addTest(warning("No tests found in " + cls.getName()));
            }
        } catch (NoSuchMethodException unused) {
            addTest(warning("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()"));
        }
    }

    public static C9388f createTest(Class<?> cls, String str) {
        Object obj;
        try {
            Constructor<?> testConstructor = getTestConstructor(cls);
            try {
                if (testConstructor.getParameterTypes().length == 0) {
                    obj = testConstructor.newInstance(new Object[0]);
                    if (obj instanceof C9389g) {
                        ((C9389g) obj).mo47299h(str);
                    }
                } else {
                    obj = testConstructor.newInstance(new Object[]{str});
                }
                return (C9388f) obj;
            } catch (InstantiationException e) {
                return warning("Cannot instantiate test case: " + str + " (" + exceptionToString(e) + ")");
            } catch (InvocationTargetException e2) {
                return warning("Exception in constructor: " + str + " (" + exceptionToString(e2.getTargetException()) + ")");
            } catch (IllegalAccessException e3) {
                return warning("Cannot access test case: " + str + " (" + exceptionToString(e3) + ")");
            }
        } catch (NoSuchMethodException unused) {
            return warning("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()");
        }
    }

    public static String exceptionToString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static Constructor<?> getTestConstructor(Class<?> cls) {
        try {
            return cls.getConstructor(new Class[]{String.class});
        } catch (NoSuchMethodException unused) {
            return cls.getConstructor(new Class[0]);
        }
    }

    private boolean isPublicTestMethod(Method method) {
        return isTestMethod(method) && Modifier.isPublic(method.getModifiers());
    }

    private boolean isTestMethod(Method method) {
        return method.getParameterTypes().length == 0 && method.getName().startsWith(InstrumentationResultPrinter.REPORT_KEY_NAME_TEST) && method.getReturnType().equals(Void.TYPE);
    }

    private C9388f testCaseForClass(Class<?> cls) {
        Class<C9389g> cls2 = C9389g.class;
        if (cls2.isAssignableFrom(cls)) {
            return new C9394k((Class<?>) cls.asSubclass(cls2));
        }
        return warning(cls.getCanonicalName() + " does not extend TestCase");
    }

    public static C9388f warning(String str) {
        return new C9395a("warning", str);
    }

    public void addTest(C9388f fVar) {
        this.fTests.add(fVar);
    }

    public void addTestSuite(Class<? extends C9389g> cls) {
        addTest(new C9394k((Class<?>) cls));
    }

    public int countTestCases() {
        Iterator<C9388f> it = this.fTests.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().countTestCases();
        }
        return i;
    }

    public String getName() {
        return this.fName;
    }

    public void run(C9392j jVar) {
        Iterator<C9388f> it = this.fTests.iterator();
        while (it.hasNext()) {
            C9388f next = it.next();
            if (!jVar.shouldStop()) {
                runTest(next, jVar);
            } else {
                return;
            }
        }
    }

    public void runTest(C9388f fVar, C9392j jVar) {
        fVar.run(jVar);
    }

    public void setName(String str) {
        this.fName = str;
    }

    public C9388f testAt(int i) {
        return this.fTests.get(i);
    }

    public int testCount() {
        return this.fTests.size();
    }

    public Enumeration<C9388f> tests() {
        return this.fTests.elements();
    }

    public String toString() {
        if (getName() != null) {
            return getName();
        }
        return super.toString();
    }

    public C9394k(Class<?> cls) {
        this.fTests = new Vector<>(10);
        addTestsFromTestCase(cls);
    }

    public C9394k(Class<? extends C9389g> cls, String str) {
        this((Class<?>) cls);
        setName(str);
    }

    public C9394k(String str) {
        this.fTests = new Vector<>(10);
        setName(str);
    }

    public C9394k(Class<?>... clsArr) {
        this.fTests = new Vector<>(10);
        for (Class<?> testCaseForClass : clsArr) {
            addTest(testCaseForClass(testCaseForClass));
        }
    }

    public C9394k(Class<? extends C9389g>[] clsArr, String str) {
        this((Class<?>[]) clsArr);
        setName(str);
    }
}
