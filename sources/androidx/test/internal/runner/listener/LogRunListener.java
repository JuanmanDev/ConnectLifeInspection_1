package androidx.test.internal.runner.listener;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import p648m.p668e.p677l.p679h.C9757a;

public class LogRunListener extends C9757a {
    public static final String TAG = "TestRunner";

    public void testAssumptionFailure(Failure failure) {
        String valueOf = String.valueOf(failure.getDescription().getDisplayName());
        if (valueOf.length() != 0) {
            "assumption failed: ".concat(valueOf);
        } else {
            new String("assumption failed: ");
        }
        failure.getTrace();
    }

    public void testFailure(Failure failure) {
        String valueOf = String.valueOf(failure.getDescription().getDisplayName());
        if (valueOf.length() != 0) {
            "failed: ".concat(valueOf);
        } else {
            new String("failed: ");
        }
        failure.getTrace();
    }

    public void testFinished(Description description) {
        String valueOf = String.valueOf(description.getDisplayName());
        if (valueOf.length() != 0) {
            "finished: ".concat(valueOf);
        } else {
            new String("finished: ");
        }
    }

    public void testIgnored(Description description) {
        String valueOf = String.valueOf(description.getDisplayName());
        if (valueOf.length() != 0) {
            "ignored: ".concat(valueOf);
        } else {
            new String("ignored: ");
        }
    }

    public void testRunFinished(Result result) {
        String.format("run finished: %d tests, %d failed, %d ignored", new Object[]{Integer.valueOf(result.getRunCount()), Integer.valueOf(result.getFailureCount()), Integer.valueOf(result.getIgnoreCount())});
    }

    public void testRunStarted(Description description) {
        String.format("run started: %d tests", new Object[]{Integer.valueOf(description.testCount())});
    }

    public void testStarted(Description description) {
        String valueOf = String.valueOf(description.getDisplayName());
        if (valueOf.length() != 0) {
            "started: ".concat(valueOf);
        } else {
            new String("started: ");
        }
    }
}
