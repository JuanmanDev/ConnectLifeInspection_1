package androidx.test.internal.runner.junit3;

import org.junit.runner.Description;
import org.junit.runner.manipulation.NoTestsRemainException;
import p627i.p629b.C9388f;
import p627i.p629b.C9394k;
import p648m.p668e.C9692h;
import p648m.p668e.p677l.p678g.C9750a;
import p648m.p668e.p677l.p678g.C9754b;

@C9692h
public class DelegatingFilterableTestSuite extends DelegatingTestSuite implements C9754b {
    public DelegatingFilterableTestSuite(C9394k kVar) {
        super(kVar);
    }

    public static Description makeDescription(C9388f fVar) {
        return JUnit38ClassRunner.makeDescription(fVar);
    }

    public void filter(C9750a aVar) {
        C9394k delegateSuite = getDelegateSuite();
        C9394k kVar = new C9394k(delegateSuite.getName());
        int testCount = delegateSuite.testCount();
        for (int i = 0; i < testCount; i++) {
            C9388f testAt = delegateSuite.testAt(i);
            if (aVar.shouldRun(makeDescription(testAt))) {
                kVar.addTest(testAt);
            }
        }
        setDelegateSuite(kVar);
        if (kVar.testCount() == 0) {
            throw new NoTestsRemainException();
        }
    }
}
