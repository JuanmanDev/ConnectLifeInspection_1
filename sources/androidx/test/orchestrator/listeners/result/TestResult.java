package androidx.test.orchestrator.listeners.result;

import java.util.Arrays;
import java.util.Map;

public class TestResult {
    public long endTime;
    public Map<String, String> metrics;
    public String stackTrace;
    public long startTime;
    public TestStatus status;

    public enum TestStatus {
        FAILURE,
        PASSED,
        INCOMPLETE,
        ASSUMPTION_FAILURE,
        IGNORED
    }

    public TestResult() {
        this.startTime = 0;
        this.endTime = 0;
        this.status = TestStatus.INCOMPLETE;
        this.startTime = System.currentTimeMillis();
    }

    public static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TestResult.class != obj.getClass()) {
            return false;
        }
        TestResult testResult = (TestResult) obj;
        if (!equal(this.metrics, testResult.metrics) || !equal(this.stackTrace, testResult.stackTrace) || !equal(this.status, testResult.status)) {
            return false;
        }
        return true;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public Map<String, String> getMetrics() {
        return this.metrics;
    }

    public String getStackTrace() {
        return this.stackTrace;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public TestStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.metrics, this.stackTrace, this.status});
    }

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public void setMetrics(Map<String, String> map) {
        this.metrics = map;
    }

    public void setStackTrace(String str) {
        this.stackTrace = str;
    }

    public TestResult setStatus(TestStatus testStatus) {
        this.status = testStatus;
        return this;
    }
}
