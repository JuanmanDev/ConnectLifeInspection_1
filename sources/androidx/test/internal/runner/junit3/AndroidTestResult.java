package androidx.test.internal.runner.junit3;

import android.app.Instrumentation;
import android.os.Bundle;
import android.test.AndroidTestCase;
import android.test.InstrumentationTestCase;
import java.util.concurrent.TimeoutException;
import junit.framework.AssertionFailedError;
import p627i.p629b.C9387e;
import p627i.p629b.C9388f;
import p627i.p629b.C9389g;
import p627i.p629b.C9392j;

public class AndroidTestResult extends DelegatingTestResult {
    public final Bundle bundle;
    public final Instrumentation instr;
    public long timeout;

    public AndroidTestResult(Bundle bundle2, Instrumentation instrumentation, C9392j jVar) {
        super(jVar);
        this.bundle = bundle2;
        this.instr = instrumentation;
    }

    public void run(C9389g gVar) {
        if (gVar instanceof AndroidTestCase) {
            ((AndroidTestCase) gVar).setContext(this.instr.getTargetContext());
        }
        if (gVar instanceof InstrumentationTestCase) {
            ((InstrumentationTestCase) gVar).injectInstrumentation(this.instr);
        }
        super.run(gVar);
    }

    public void runProtected(C9388f fVar, C9387e eVar) {
        try {
            eVar.mo47296a();
        } catch (AssertionFailedError e) {
            super.addFailure(fVar, e);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (InterruptedException unused) {
            super.addError(fVar, new TimeoutException(String.format("Test timed out after %d milliseconds", new Object[]{Long.valueOf(this.timeout)})));
        } catch (Throwable th) {
            super.addError(fVar, th);
        }
    }

    public void setCurrentTimeout(long j) {
        this.timeout = j;
    }
}
