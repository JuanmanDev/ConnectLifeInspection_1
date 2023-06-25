package androidx.test.internal.platform.util;

import androidx.test.internal.platform.ServiceLoaderWrapper;

public class TestOutputEmitter {
    public static final TestOutputHandler debugHandler = ((TestOutputHandler) ServiceLoaderWrapper.loadSingleService(TestOutputHandler.class, TestOutputEmitter$$Lambda$0.$instance));

    public static boolean captureWindowHierarchy(String str) {
        return debugHandler.captureWindowHierarchy(str);
    }

    public static void dumpThreadStates(String str) {
        debugHandler.dumpThreadStates(str);
    }

    public static final /* synthetic */ TestOutputHandler lambda$static$0$TestOutputEmitter() {
        return new TestOutputHandler() {
            public boolean captureWindowHierarchy(String str) {
                return false;
            }

            public void dumpThreadStates(String str) {
            }

            public boolean takeScreenshot(String str) {
                return false;
            }
        };
    }

    public static boolean takeScreenshot(String str) {
        return debugHandler.takeScreenshot(str);
    }
}
