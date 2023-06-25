package androidx.test.internal.util;

import android.util.Log;
import androidx.core.p028os.EnvironmentCompat;
import androidx.test.internal.util.ProcSummary;

public final class LogUtil {
    public static volatile String myProcName;

    public interface Supplier<T> {
        T get();
    }

    public static boolean isLoggable(String str, int i) {
        if (str.length() > 23) {
            str = str.substring(0, 22);
        }
        return Log.isLoggable(str, i);
    }

    public static final /* synthetic */ String lambda$logDebug$0$LogUtil(String str) {
        return str;
    }

    public static final /* synthetic */ String lambda$logDebugWithProcess$1$LogUtil(String str) {
        String procName = procName();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(procName).length());
        sb.append(str);
        sb.append(" in ");
        sb.append(procName);
        return sb.toString();
    }

    public static void logDebug(String str, String str2, Object... objArr) {
        logDebug(str, (Supplier<String>) new LogUtil$$Lambda$0(str2), objArr);
    }

    public static void logDebugWithProcess(String str, String str2, Object... objArr) {
        logDebug(str, (Supplier<String>) new LogUtil$$Lambda$1(str2), objArr);
    }

    public static final String procName() {
        String str;
        String str2 = myProcName;
        if (str2 != null) {
            return str2;
        }
        try {
            str = ProcSummary.summarize("self").cmdline;
        } catch (ProcSummary.SummaryException unused) {
            str = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return (str.length() <= 64 || !str.contains("-classpath")) ? str : "robolectric";
    }

    public static void logDebug(String str, Supplier<String> supplier, Object... objArr) {
        if (isLoggable(str, 3)) {
            String.format(supplier.get(), objArr);
        }
    }
}
