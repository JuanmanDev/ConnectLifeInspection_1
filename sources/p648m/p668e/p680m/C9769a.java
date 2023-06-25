package p648m.p668e.p680m;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.runner.Description;
import p648m.p668e.C9685a;
import p648m.p668e.C9688d;
import p648m.p668e.C9692h;
import p648m.p668e.C9693i;
import p648m.p668e.p669j.p672f.p673d.C9716b;
import p648m.p668e.p669j.p672f.p674e.C9717a;
import p648m.p668e.p669j.p672f.p675f.C9730a;
import p648m.p668e.p669j.p672f.p675f.C9731b;
import p648m.p668e.p669j.p672f.p675f.C9732c;
import p648m.p668e.p669j.p672f.p675f.C9736d;
import p648m.p668e.p669j.p672f.p675f.C9737e;
import p648m.p668e.p669j.p672f.p675f.C9738f;
import p648m.p668e.p676k.C9739a;
import p648m.p668e.p676k.C9740b;
import p648m.p668e.p676k.C9741c;
import p648m.p668e.p677l.p679h.C9759b;
import p648m.p668e.p680m.p681d.C9781d;
import p648m.p668e.p680m.p681d.C9785g;

/* renamed from: m.e.m.a */
/* compiled from: BlockJUnit4ClassRunner */
public class C9769a extends C9771b<C9781d> {
    public final ConcurrentHashMap<C9781d, Description> methodDescriptions = new ConcurrentHashMap<>();

    /* renamed from: m.e.m.a$a */
    /* compiled from: BlockJUnit4ClassRunner */
    public class C9770a extends C9716b {
        public C9770a() {
        }

        /* renamed from: b */
        public Object mo50543b() {
            return C9769a.this.createTest();
        }
    }

    public C9769a(Class<?> cls) {
        super(cls);
    }

    private boolean expectsException(Test test) {
        return getExpectedException(test) != null;
    }

    private Class<? extends Throwable> getExpectedException(Test test) {
        if (test == null || test.expected() == Test.None.class) {
            return null;
        }
        return test.expected();
    }

    private List<C9739a> getMethodRules(Object obj) {
        return rules(obj);
    }

    private long getTimeout(Test test) {
        if (test == null) {
            return 0;
        }
        return test.timeout();
    }

    private boolean hasOneConstructor() {
        return getTestClass().mo50676j().getConstructors().length == 1;
    }

    private void validateMethods(List<Throwable> list) {
        C9717a.f18989g.mo50544i(getTestClass(), list);
    }

    private C9785g withMethodRules(C9781d dVar, List<C9741c> list, Object obj, C9785g gVar) {
        for (C9739a next : getMethodRules(obj)) {
            if (!list.contains(next)) {
                gVar = next.mo50563a(gVar, dVar, obj);
            }
        }
        return gVar;
    }

    private C9785g withRules(C9781d dVar, Object obj, C9785g gVar) {
        List<C9741c> testRules = getTestRules(obj);
        return withTestRules(dVar, testRules, withMethodRules(dVar, testRules, obj, gVar));
    }

    private C9785g withTestRules(C9781d dVar, List<C9741c> list, C9785g gVar) {
        return list.isEmpty() ? gVar : new C9740b(gVar, list, describeChild(dVar));
    }

    public void collectInitializationErrors(List<Throwable> list) {
        super.collectInitializationErrors(list);
        validateNoNonStaticInnerClass(list);
        validateConstructor(list);
        validateInstanceMethods(list);
        validateFields(list);
        validateMethods(list);
    }

    public List<C9781d> computeTestMethods() {
        return getTestClass().mo50675i(Test.class);
    }

    public Object createTest() {
        return getTestClass().mo50678l().newInstance(new Object[0]);
    }

    public List<C9781d> getChildren() {
        return computeTestMethods();
    }

    public List<C9741c> getTestRules(Object obj) {
        Class<C9741c> cls = C9741c.class;
        List<C9741c> g = getTestClass().mo50672g(obj, C9693i.class, cls);
        g.addAll(getTestClass().mo50668c(obj, C9693i.class, cls));
        return g;
    }

    public C9785g methodBlock(C9781d dVar) {
        try {
            Object a = new C9770a().mo50542a();
            return withRules(dVar, a, withAfters(dVar, a, withBefores(dVar, a, withPotentialTimeout(dVar, a, possiblyExpectingExceptions(dVar, a, methodInvoker(dVar, a))))));
        } catch (Throwable th) {
            return new C9731b(th);
        }
    }

    public C9785g methodInvoker(C9781d dVar, Object obj) {
        return new C9736d(dVar, obj);
    }

    public C9785g possiblyExpectingExceptions(C9781d dVar, Object obj, C9785g gVar) {
        Test test = (Test) dVar.getAnnotation(Test.class);
        return expectsException(test) ? new C9730a(gVar, getExpectedException(test)) : gVar;
    }

    public List<C9739a> rules(Object obj) {
        Class<C9739a> cls = C9739a.class;
        List<C9739a> g = getTestClass().mo50672g(obj, C9693i.class, cls);
        g.addAll(getTestClass().mo50668c(obj, C9693i.class, cls));
        return g;
    }

    public String testName(C9781d dVar) {
        return dVar.mo50642c();
    }

    public void validateConstructor(List<Throwable> list) {
        validateOnlyOneConstructor(list);
        validateZeroArgConstructor(list);
    }

    public void validateFields(List<Throwable> list) {
        C9717a.f18987e.mo50544i(getTestClass(), list);
    }

    @Deprecated
    public void validateInstanceMethods(List<Throwable> list) {
        validatePublicVoidNoArgMethods(C9685a.class, false, list);
        validatePublicVoidNoArgMethods(C9688d.class, false, list);
        validateTestMethods(list);
        if (computeTestMethods().size() == 0) {
            list.add(new Exception("No runnable methods"));
        }
    }

    public void validateNoNonStaticInnerClass(List<Throwable> list) {
        if (getTestClass().mo50679o()) {
            list.add(new Exception("The inner class " + getTestClass().mo50677k() + " is not static."));
        }
    }

    public void validateOnlyOneConstructor(List<Throwable> list) {
        if (!hasOneConstructor()) {
            list.add(new Exception("Test class should have exactly one public constructor"));
        }
    }

    public void validateTestMethods(List<Throwable> list) {
        validatePublicVoidNoArgMethods(Test.class, false, list);
    }

    public void validateZeroArgConstructor(List<Throwable> list) {
        if (!getTestClass().mo50679o() && hasOneConstructor() && getTestClass().mo50678l().getParameterTypes().length != 0) {
            list.add(new Exception("Test class should have exactly one public zero-argument constructor"));
        }
    }

    public C9785g withAfters(C9781d dVar, Object obj, C9785g gVar) {
        List<C9781d> i = getTestClass().mo50675i(C9685a.class);
        return i.isEmpty() ? gVar : new C9737e(gVar, i, obj);
    }

    public C9785g withBefores(C9781d dVar, Object obj, C9785g gVar) {
        List<C9781d> i = getTestClass().mo50675i(C9688d.class);
        return i.isEmpty() ? gVar : new C9738f(gVar, i, obj);
    }

    @Deprecated
    public C9785g withPotentialTimeout(C9781d dVar, Object obj, C9785g gVar) {
        long timeout = getTimeout((Test) dVar.getAnnotation(Test.class));
        if (timeout <= 0) {
            return gVar;
        }
        C9732c.C9734b b = C9732c.m26210b();
        b.mo50559e(timeout, TimeUnit.MILLISECONDS);
        return b.mo50558d(gVar);
    }

    public Description describeChild(C9781d dVar) {
        Description description = this.methodDescriptions.get(dVar);
        if (description != null) {
            return description;
        }
        Description createTestDescription = Description.createTestDescription(getTestClass().mo50676j(), testName(dVar), dVar.getAnnotations());
        this.methodDescriptions.putIfAbsent(dVar, createTestDescription);
        return createTestDescription;
    }

    public boolean isIgnored(C9781d dVar) {
        return dVar.getAnnotation(C9692h.class) != null;
    }

    public void runChild(C9781d dVar, C9759b bVar) {
        Description describeChild = describeChild(dVar);
        if (isIgnored(dVar)) {
            bVar.mo50586i(describeChild);
        } else {
            runLeaf(methodBlock(dVar), describeChild, bVar);
        }
    }
}
