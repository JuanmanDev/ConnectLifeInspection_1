package androidx.test.internal.runner.listener;

import androidx.annotation.VisibleForTesting;
import androidx.test.internal.runner.TestSize;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;

public class SuiteAssignmentPrinter extends InstrumentationRunListener {
    @VisibleForTesting
    public long endTime;
    @VisibleForTesting
    public long startTime;
    @VisibleForTesting
    public boolean timingValid;

    @VisibleForTesting
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    public void testAssumptionFailure(Failure failure) {
        this.timingValid = false;
    }

    public void testFailure(Failure failure) {
        this.timingValid = false;
    }

    public void testFinished(Description description) {
        long currentTimeMillis = getCurrentTimeMillis();
        this.endTime = currentTimeMillis;
        if (this.timingValid) {
            long j = this.startTime;
            if (j >= 0) {
                long j2 = currentTimeMillis - j;
                TestSize testSizeForRunTime = TestSize.getTestSizeForRunTime((float) j2);
                TestSize fromDescription = TestSize.fromDescription(description);
                if (!testSizeForRunTime.equals(fromDescription)) {
                    sendString(String.format("\n%s#%s: current size: %s. suggested: %s runTime: %d ms\n", new Object[]{description.getClassName(), description.getMethodName(), fromDescription, testSizeForRunTime.getSizeQualifierName(), Long.valueOf(j2)}));
                } else {
                    sendString(MAPCookie.DOT);
                    String.format("%s#%s assigned correctly as %s. runTime: %d ms\n", new Object[]{description.getClassName(), description.getMethodName(), testSizeForRunTime.getSizeQualifierName(), Long.valueOf(j2)});
                }
                this.startTime = -1;
            }
        }
        sendString("F");
        String.format("%s#%s: skipping suite assignment due to test failure\n", new Object[]{description.getClassName(), description.getMethodName()});
        this.startTime = -1;
    }

    public void testIgnored(Description description) {
        this.timingValid = false;
    }

    public void testStarted(Description description) {
        this.timingValid = true;
        this.startTime = getCurrentTimeMillis();
    }
}
