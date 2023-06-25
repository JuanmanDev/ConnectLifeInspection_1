package p627i.p629b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import junit.framework.AssertionFailedError;

/* renamed from: i.b.j */
/* compiled from: TestResult */
public class C9392j {
    public List<C9390h> fErrors = new ArrayList();
    public List<C9390h> fFailures = new ArrayList();
    public List<C9391i> fListeners = new ArrayList();
    public int fRunTests = 0;
    public boolean fStop = false;

    /* renamed from: i.b.j$a */
    /* compiled from: TestResult */
    public class C9393a implements C9387e {

        /* renamed from: a */
        public final /* synthetic */ C9389g f18414a;

        public C9393a(C9392j jVar, C9389g gVar) {
            this.f18414a = gVar;
        }

        /* renamed from: a */
        public void mo47296a() {
            this.f18414a.mo47298g();
        }
    }

    private synchronized List<C9391i> cloneListeners() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.fListeners);
        return arrayList;
    }

    public synchronized void addError(C9388f fVar, Throwable th) {
        this.fErrors.add(new C9390h(fVar, th));
        for (C9391i addError : cloneListeners()) {
            addError.addError(fVar, th);
        }
    }

    public synchronized void addFailure(C9388f fVar, AssertionFailedError assertionFailedError) {
        this.fFailures.add(new C9390h(fVar, assertionFailedError));
        for (C9391i addFailure : cloneListeners()) {
            addFailure.addFailure(fVar, assertionFailedError);
        }
    }

    public synchronized void addListener(C9391i iVar) {
        this.fListeners.add(iVar);
    }

    public void endTest(C9388f fVar) {
        for (C9391i endTest : cloneListeners()) {
            endTest.endTest(fVar);
        }
    }

    public synchronized int errorCount() {
        return this.fErrors.size();
    }

    public synchronized Enumeration<C9390h> errors() {
        return Collections.enumeration(this.fErrors);
    }

    public synchronized int failureCount() {
        return this.fFailures.size();
    }

    public synchronized Enumeration<C9390h> failures() {
        return Collections.enumeration(this.fFailures);
    }

    public synchronized void removeListener(C9391i iVar) {
        this.fListeners.remove(iVar);
    }

    public void run(C9389g gVar) {
        startTest(gVar);
        runProtected(gVar, new C9393a(this, gVar));
        endTest(gVar);
    }

    public synchronized int runCount() {
        return this.fRunTests;
    }

    public void runProtected(C9388f fVar, C9387e eVar) {
        try {
            eVar.mo47296a();
        } catch (AssertionFailedError e) {
            addFailure(fVar, e);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable th) {
            addError(fVar, th);
        }
    }

    public synchronized boolean shouldStop() {
        return this.fStop;
    }

    public void startTest(C9388f fVar) {
        int countTestCases = fVar.countTestCases();
        synchronized (this) {
            this.fRunTests += countTestCases;
        }
        for (C9391i startTest : cloneListeners()) {
            startTest.startTest(fVar);
        }
    }

    public synchronized void stop() {
        this.fStop = true;
    }

    public synchronized boolean wasSuccessful() {
        return failureCount() == 0 && errorCount() == 0;
    }
}
