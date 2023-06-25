package androidx.test.orchestrator.listeners.result;

import androidx.test.orchestrator.listeners.result.TestResult;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class TestRunResult implements ITestRunListener {
    public static final String LOG_TAG = "TestRunResult";
    public boolean aggregateMetrics = false;
    public long elapsedTime = 0;
    public boolean isCountDirty = true;
    public boolean isRunComplete = false;
    public String runFailureError = null;
    public Map<String, String> runMetrics = new HashMap();
    public int[] statusCounts = new int[TestResult.TestStatus.values().length];
    public Map<TestIdentifier, TestResult> testResults = new LinkedHashMap();
    public String testRunName = "not started";

    private void addTestResult(TestIdentifier testIdentifier, TestResult testResult) {
        this.isCountDirty = true;
        this.testResults.put(testIdentifier, testResult);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        return java.lang.Double.toString(java.lang.Double.valueOf(java.lang.Double.parseDouble(r6)).doubleValue() + java.lang.Double.valueOf(java.lang.Double.parseDouble(r7)).doubleValue());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String combineValues(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x003e
            long r0 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0020 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0020 }
            long r1 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x0020 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0020 }
            long r2 = r0.longValue()     // Catch:{ NumberFormatException -> 0x0020 }
            long r0 = r1.longValue()     // Catch:{ NumberFormatException -> 0x0020 }
            long r2 = r2 + r0
            java.lang.String r6 = java.lang.Long.toString(r2)     // Catch:{ NumberFormatException -> 0x0020 }
            return r6
        L_0x0020:
            double r0 = java.lang.Double.parseDouble(r6)     // Catch:{ NumberFormatException -> 0x003e }
            java.lang.Double r6 = java.lang.Double.valueOf(r0)     // Catch:{ NumberFormatException -> 0x003e }
            double r0 = java.lang.Double.parseDouble(r7)     // Catch:{ NumberFormatException -> 0x003e }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ NumberFormatException -> 0x003e }
            double r1 = r6.doubleValue()     // Catch:{ NumberFormatException -> 0x003e }
            double r3 = r0.doubleValue()     // Catch:{ NumberFormatException -> 0x003e }
            double r1 = r1 + r3
            java.lang.String r6 = java.lang.Double.toString(r1)     // Catch:{ NumberFormatException -> 0x003e }
            return r6
        L_0x003e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.orchestrator.listeners.result.TestRunResult.combineValues(java.lang.String, java.lang.String):java.lang.String");
    }

    private void updateTestResult(TestIdentifier testIdentifier, TestResult.TestStatus testStatus, String str) {
        TestResult testResult = this.testResults.get(testIdentifier);
        if (testResult == null) {
            String.format("received test event without test start for %s", new Object[]{testIdentifier});
            testResult = new TestResult();
        }
        testResult.setStatus(testStatus);
        testResult.setStackTrace(str);
        addTestResult(testIdentifier, testResult);
    }

    public Set<TestIdentifier> getCompletedTests() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry next : getTestResults().entrySet()) {
            if (!((TestResult) next.getValue()).getStatus().equals(TestResult.TestStatus.INCOMPLETE)) {
                linkedHashSet.add((TestIdentifier) next.getKey());
            }
        }
        return linkedHashSet;
    }

    public long getElapsedTime() {
        return this.elapsedTime;
    }

    public String getName() {
        return this.testRunName;
    }

    public int getNumAllFailedTests() {
        return getNumTestsInState(TestResult.TestStatus.FAILURE);
    }

    public int getNumCompleteTests() {
        return getNumTests() - getNumTestsInState(TestResult.TestStatus.INCOMPLETE);
    }

    public int getNumTests() {
        return this.testResults.size();
    }

    public int getNumTestsInState(TestResult.TestStatus testStatus) {
        if (this.isCountDirty) {
            int i = 0;
            while (true) {
                int[] iArr = this.statusCounts;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = 0;
                i++;
            }
            for (TestResult status : this.testResults.values()) {
                int[] iArr2 = this.statusCounts;
                int ordinal = status.getStatus().ordinal();
                iArr2[ordinal] = iArr2[ordinal] + 1;
            }
            this.isCountDirty = false;
        }
        return this.statusCounts[testStatus.ordinal()];
    }

    public String getRunFailureMessage() {
        return this.runFailureError;
    }

    public Map<String, String> getRunMetrics() {
        return this.runMetrics;
    }

    public Map<TestIdentifier, TestResult> getTestResults() {
        return this.testResults;
    }

    public String getTextSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Total tests %d, ", new Object[]{Integer.valueOf(getNumTests())}));
        for (TestResult.TestStatus testStatus : TestResult.TestStatus.values()) {
            int numTestsInState = getNumTestsInState(testStatus);
            if (numTestsInState > 0) {
                sb.append(String.format("%s %d, ", new Object[]{testStatus.toString().toLowerCase(), Integer.valueOf(numTestsInState)}));
            }
        }
        return sb.toString();
    }

    public boolean hasFailedTests() {
        return getNumAllFailedTests() > 0;
    }

    public boolean isRunComplete() {
        return this.isRunComplete;
    }

    public boolean isRunFailure() {
        return this.runFailureError != null;
    }

    public void setAggregateMetrics(boolean z) {
        this.aggregateMetrics = z;
    }

    public void setRunComplete(boolean z) {
        this.isRunComplete = z;
    }

    public void testAssumptionFailure(TestIdentifier testIdentifier, String str) {
        updateTestResult(testIdentifier, TestResult.TestStatus.ASSUMPTION_FAILURE, str);
    }

    public void testEnded(TestIdentifier testIdentifier, Map<String, String> map) {
        TestResult testResult = this.testResults.get(testIdentifier);
        if (testResult == null) {
            testResult = new TestResult();
        }
        if (testResult.getStatus().equals(TestResult.TestStatus.INCOMPLETE)) {
            testResult.setStatus(TestResult.TestStatus.PASSED);
        }
        testResult.setEndTime(System.currentTimeMillis());
        testResult.setMetrics(map);
        addTestResult(testIdentifier, testResult);
    }

    public void testFailed(TestIdentifier testIdentifier, String str) {
        updateTestResult(testIdentifier, TestResult.TestStatus.FAILURE, str);
    }

    public void testIgnored(TestIdentifier testIdentifier) {
        updateTestResult(testIdentifier, TestResult.TestStatus.IGNORED, (String) null);
    }

    public void testRunEnded(long j, Map<String, String> map) {
        if (this.aggregateMetrics) {
            for (Map.Entry next : map.entrySet()) {
                this.runMetrics.put((String) next.getKey(), combineValues(this.runMetrics.get(next.getKey()), (String) next.getValue()));
            }
        } else {
            this.runMetrics.putAll(map);
        }
        this.elapsedTime += j;
        this.isRunComplete = true;
    }

    public void testRunFailed(String str) {
        this.runFailureError = str;
    }

    public void testRunStarted(String str, int i) {
        this.testRunName = str;
        this.isRunComplete = false;
        this.runFailureError = null;
    }

    public void testRunStopped(long j) {
        this.elapsedTime += j;
        this.isRunComplete = true;
    }

    public void testStarted(TestIdentifier testIdentifier) {
        addTestResult(testIdentifier, new TestResult());
    }
}
