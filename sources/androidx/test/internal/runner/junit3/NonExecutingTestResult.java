package androidx.test.internal.runner.junit3;

import p627i.p629b.C9387e;
import p627i.p629b.C9388f;
import p627i.p629b.C9389g;
import p627i.p629b.C9392j;

public class NonExecutingTestResult extends DelegatingTestResult {
    public NonExecutingTestResult(C9392j jVar) {
        super(jVar);
    }

    public void run(C9389g gVar) {
        startTest(gVar);
        endTest(gVar);
    }

    public void runProtected(C9388f fVar, C9387e eVar) {
    }
}
