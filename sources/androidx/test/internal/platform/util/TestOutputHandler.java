package androidx.test.internal.platform.util;

public interface TestOutputHandler {
    boolean captureWindowHierarchy(String str);

    void dumpThreadStates(String str);

    boolean takeScreenshot(String str);
}
