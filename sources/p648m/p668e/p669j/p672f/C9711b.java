package p648m.p668e.p669j.p672f;

import java.lang.annotation.Annotation;
import junit.framework.AssertionFailedError;
import org.junit.runner.Description;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.notification.Failure;
import p627i.p628a.C9382a;
import p627i.p629b.C9388f;
import p627i.p629b.C9389g;
import p627i.p629b.C9391i;
import p627i.p629b.C9392j;
import p627i.p629b.C9394k;
import p648m.p668e.p677l.C9744b;
import p648m.p668e.p677l.C9749f;
import p648m.p668e.p677l.p678g.C9750a;
import p648m.p668e.p677l.p678g.C9754b;
import p648m.p668e.p677l.p678g.C9755c;
import p648m.p668e.p677l.p678g.C9756d;
import p648m.p668e.p677l.p679h.C9759b;

/* renamed from: m.e.j.f.b */
/* compiled from: JUnit38ClassRunner */
public class C9711b extends C9749f implements C9754b, C9755c {

    /* renamed from: a */
    public volatile C9388f f18982a;

    /* renamed from: m.e.j.f.b$b */
    /* compiled from: JUnit38ClassRunner */
    public static final class C9713b implements C9391i {

        /* renamed from: a */
        public final C9759b f18983a;

        /* renamed from: a */
        public final Description mo50534a(C9388f fVar) {
            if (fVar instanceof C9744b) {
                return ((C9744b) fVar).getDescription();
            }
            return Description.createTestDescription(mo50535b(fVar), mo50536c(fVar));
        }

        public void addError(C9388f fVar, Throwable th) {
            this.f18983a.mo50583f(new Failure(mo50534a(fVar), th));
        }

        public void addFailure(C9388f fVar, AssertionFailedError assertionFailedError) {
            addError(fVar, assertionFailedError);
        }

        /* renamed from: b */
        public final Class<? extends C9388f> mo50535b(C9388f fVar) {
            return fVar.getClass();
        }

        /* renamed from: c */
        public final String mo50536c(C9388f fVar) {
            if (fVar instanceof C9389g) {
                return ((C9389g) fVar).mo47297f();
            }
            return fVar.toString();
        }

        public void endTest(C9388f fVar) {
            this.f18983a.mo50585h(mo50534a(fVar));
        }

        public void startTest(C9388f fVar) {
            this.f18983a.mo50589l(mo50534a(fVar));
        }

        public C9713b(C9759b bVar) {
            this.f18983a = bVar;
        }
    }

    public C9711b(Class<?> cls) {
        this((C9388f) new C9394k((Class<?>) cls.asSubclass(C9389g.class)));
    }

    public static String createSuiteDescription(C9394k kVar) {
        String str;
        int countTestCases = kVar.countTestCases();
        if (countTestCases == 0) {
            str = "";
        } else {
            str = String.format(" [example: %s]", new Object[]{kVar.testAt(0)});
        }
        return String.format("TestSuite with %s tests%s", new Object[]{Integer.valueOf(countTestCases), str});
    }

    public static Annotation[] getAnnotations(C9389g gVar) {
        try {
            return gVar.getClass().getMethod(gVar.mo47297f(), new Class[0]).getDeclaredAnnotations();
        } catch (NoSuchMethodException | SecurityException unused) {
            return new Annotation[0];
        }
    }

    public static Description makeDescription(C9388f fVar) {
        if (fVar instanceof C9389g) {
            C9389g gVar = (C9389g) fVar;
            return Description.createTestDescription(gVar.getClass(), gVar.mo47297f(), getAnnotations(gVar));
        } else if (fVar instanceof C9394k) {
            C9394k kVar = (C9394k) fVar;
            Description createSuiteDescription = Description.createSuiteDescription(kVar.getName() == null ? createSuiteDescription(kVar) : kVar.getName(), new Annotation[0]);
            int testCount = kVar.testCount();
            for (int i = 0; i < testCount; i++) {
                createSuiteDescription.addChild(makeDescription(kVar.testAt(i)));
            }
            return createSuiteDescription;
        } else if (fVar instanceof C9744b) {
            return ((C9744b) fVar).getDescription();
        } else {
            if (fVar instanceof C9382a) {
                return makeDescription(((C9382a) fVar).mo47286g());
            }
            return Description.createSuiteDescription(fVar.getClass());
        }
    }

    public C9391i createAdaptingListener(C9759b bVar) {
        return new C9713b(bVar);
    }

    public void filter(C9750a aVar) {
        if (getTest() instanceof C9754b) {
            ((C9754b) getTest()).filter(aVar);
        } else if (getTest() instanceof C9394k) {
            C9394k kVar = (C9394k) getTest();
            C9394k kVar2 = new C9394k(kVar.getName());
            int testCount = kVar.testCount();
            for (int i = 0; i < testCount; i++) {
                C9388f testAt = kVar.testAt(i);
                if (aVar.shouldRun(makeDescription(testAt))) {
                    kVar2.addTest(testAt);
                }
            }
            setTest(kVar2);
            if (kVar2.testCount() == 0) {
                throw new NoTestsRemainException();
            }
        }
    }

    public Description getDescription() {
        return makeDescription(getTest());
    }

    public final C9388f getTest() {
        return this.f18982a;
    }

    public void run(C9759b bVar) {
        C9392j jVar = new C9392j();
        jVar.addListener(createAdaptingListener(bVar));
        getTest().run(jVar);
    }

    public final void setTest(C9388f fVar) {
        this.f18982a = fVar;
    }

    public void sort(C9756d dVar) {
        if (getTest() instanceof C9755c) {
            ((C9755c) getTest()).sort(dVar);
        }
    }

    public C9711b(C9388f fVar) {
        setTest(fVar);
    }
}
