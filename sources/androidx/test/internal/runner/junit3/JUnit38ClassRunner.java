package androidx.test.internal.runner.junit3;

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

public class JUnit38ClassRunner extends C9749f implements C9754b, C9755c {
    public volatile C9388f fTest;

    public static final class OldTestClassAdaptingListener implements C9391i {
        public C9388f currentTest;
        public Description description;
        public final C9759b fNotifier;

        private Description asDescription(C9388f fVar) {
            Description description2;
            C9388f fVar2 = this.currentTest;
            if (fVar2 != null && fVar2.equals(fVar) && (description2 = this.description) != null) {
                return description2;
            }
            this.currentTest = fVar;
            if (fVar instanceof C9744b) {
                this.description = ((C9744b) fVar).getDescription();
            } else if (fVar instanceof C9389g) {
                this.description = JUnit38ClassRunner.makeDescription(fVar);
            } else {
                this.description = Description.createTestDescription(getEffectiveClass(fVar), fVar.toString());
            }
            return this.description;
        }

        private Class<? extends C9388f> getEffectiveClass(C9388f fVar) {
            return fVar.getClass();
        }

        public void addError(C9388f fVar, Throwable th) {
            this.fNotifier.mo50583f(new Failure(asDescription(fVar), th));
        }

        public void addFailure(C9388f fVar, AssertionFailedError assertionFailedError) {
            addError(fVar, assertionFailedError);
        }

        public void endTest(C9388f fVar) {
            this.fNotifier.mo50585h(asDescription(fVar));
        }

        public void startTest(C9388f fVar) {
            this.fNotifier.mo50589l(asDescription(fVar));
        }

        public OldTestClassAdaptingListener(C9759b bVar) {
            this.currentTest = null;
            this.description = null;
            this.fNotifier = bVar;
        }
    }

    public JUnit38ClassRunner(Class<?> cls) {
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

    private C9388f getTest() {
        return this.fTest;
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

    private void setTest(C9388f fVar) {
        this.fTest = fVar;
    }

    public C9391i createAdaptingListener(C9759b bVar) {
        return new OldTestClassAdaptingListener(bVar);
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

    public void run(C9759b bVar) {
        C9392j jVar = new C9392j();
        jVar.addListener(createAdaptingListener(bVar));
        getTest().run(jVar);
    }

    public void sort(C9756d dVar) {
        if (getTest() instanceof C9755c) {
            ((C9755c) getTest()).sort(dVar);
        }
    }

    public JUnit38ClassRunner(C9388f fVar) {
        setTest(fVar);
    }
}
