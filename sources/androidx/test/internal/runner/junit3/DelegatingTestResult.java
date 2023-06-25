package androidx.test.internal.runner.junit3;

import java.util.Enumeration;
import junit.framework.AssertionFailedError;
import p627i.p629b.C9387e;
import p627i.p629b.C9388f;
import p627i.p629b.C9390h;
import p627i.p629b.C9391i;
import p627i.p629b.C9392j;

public class DelegatingTestResult extends C9392j {
    public C9392j wrappedResult;

    public DelegatingTestResult(C9392j jVar) {
        this.wrappedResult = jVar;
    }

    public void addError(C9388f fVar, Throwable th) {
        this.wrappedResult.addError(fVar, th);
    }

    public void addFailure(C9388f fVar, AssertionFailedError assertionFailedError) {
        this.wrappedResult.addFailure(fVar, assertionFailedError);
    }

    public void addListener(C9391i iVar) {
        this.wrappedResult.addListener(iVar);
    }

    public void endTest(C9388f fVar) {
        this.wrappedResult.endTest(fVar);
    }

    public int errorCount() {
        return this.wrappedResult.errorCount();
    }

    public Enumeration<C9390h> errors() {
        return this.wrappedResult.errors();
    }

    public int failureCount() {
        return this.wrappedResult.failureCount();
    }

    public Enumeration<C9390h> failures() {
        return this.wrappedResult.failures();
    }

    public void removeListener(C9391i iVar) {
        this.wrappedResult.removeListener(iVar);
    }

    public int runCount() {
        return this.wrappedResult.runCount();
    }

    public void runProtected(C9388f fVar, C9387e eVar) {
        this.wrappedResult.runProtected(fVar, eVar);
    }

    public boolean shouldStop() {
        return this.wrappedResult.shouldStop();
    }

    public void startTest(C9388f fVar) {
        this.wrappedResult.startTest(fVar);
    }

    public void stop() {
        this.wrappedResult.stop();
    }

    public boolean wasSuccessful() {
        return this.wrappedResult.wasSuccessful();
    }
}
