package androidx.test.internal.runner.junit3;

import java.util.Enumeration;
import p627i.p629b.C9388f;
import p627i.p629b.C9392j;
import p627i.p629b.C9394k;
import p648m.p668e.C9692h;
import p648m.p668e.p677l.p678g.C9750a;

@C9692h
public class NonExecutingTestSuite extends DelegatingFilterableTestSuite {
    public NonExecutingTestSuite(Class<?> cls) {
        this(new C9394k(cls));
    }

    public /* bridge */ /* synthetic */ void addTest(C9388f fVar) {
        super.addTest(fVar);
    }

    public /* bridge */ /* synthetic */ int countTestCases() {
        return super.countTestCases();
    }

    public /* bridge */ /* synthetic */ void filter(C9750a aVar) {
        super.filter(aVar);
    }

    public /* bridge */ /* synthetic */ C9394k getDelegateSuite() {
        return super.getDelegateSuite();
    }

    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    public void run(C9392j jVar) {
        super.run(new NonExecutingTestResult(jVar));
    }

    public /* bridge */ /* synthetic */ void runTest(C9388f fVar, C9392j jVar) {
        super.runTest(fVar, jVar);
    }

    public /* bridge */ /* synthetic */ void setDelegateSuite(C9394k kVar) {
        super.setDelegateSuite(kVar);
    }

    public /* bridge */ /* synthetic */ void setName(String str) {
        super.setName(str);
    }

    public /* bridge */ /* synthetic */ C9388f testAt(int i) {
        return super.testAt(i);
    }

    public /* bridge */ /* synthetic */ int testCount() {
        return super.testCount();
    }

    public /* bridge */ /* synthetic */ Enumeration tests() {
        return super.tests();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public NonExecutingTestSuite(C9394k kVar) {
        super(kVar);
    }
}
