package androidx.test.internal.runner.listener;

import android.app.Instrumentation;
import android.os.Bundle;
import java.io.File;
import java.io.PrintStream;
import org.junit.runner.Result;

public class CoverageListener extends InstrumentationRunListener {
    public static final String DEFAULT_COVERAGE_FILE_NAME = "coverage.ec";
    public static final String EMMA_RUNTIME_CLASS = "com.vladium.emma.rt.RT";
    public static final String REPORT_KEY_COVERAGE_PATH = "coverageFilePath";
    public static final String TAG = "CoverageListener";
    public String coverageFilePath;

    public CoverageListener(String str) {
        this.coverageFilePath = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007c, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007e, code lost:
        reportEmmaError(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0082, code lost:
        reportEmmaError(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0086, code lost:
        reportEmmaError(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008a, code lost:
        reportEmmaError(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008e, code lost:
        reportEmmaError(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0092, code lost:
        reportEmmaError(r10, "Is Emma/JaCoCo jar on classpath?", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0026 */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x001c A[ExcHandler: InvocationTargetException (r11v7 'e' java.lang.reflect.InvocationTargetException A[CUSTOM_DECLARE]), Splitter:B:1:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x001e A[ExcHandler: IllegalAccessException (r11v6 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:1:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0020 A[ExcHandler: IllegalArgumentException (r11v5 'e' java.lang.IllegalArgumentException A[CUSTOM_DECLARE]), Splitter:B:1:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0022 A[ExcHandler: NoSuchMethodException (r11v4 'e' java.lang.NoSuchMethodException A[CUSTOM_DECLARE]), Splitter:B:1:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024 A[ExcHandler: SecurityException (r11v3 'e' java.lang.SecurityException A[CUSTOM_DECLARE]), Splitter:B:1:0x000b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void generateCoverageReport(java.io.PrintStream r10, android.os.Bundle r11) {
        /*
            r9 = this;
            java.lang.String r0 = "com.vladium.emma.rt.RT"
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r9.coverageFilePath
            r1.<init>(r2)
            r2 = 0
            r3 = 1
            android.app.Instrumentation r4 = r9.getInstrumentation()     // Catch:{ ClassNotFoundException -> 0x0026, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            android.content.Context r4 = r4.getTargetContext()     // Catch:{ ClassNotFoundException -> 0x0026, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0026, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r4)     // Catch:{ ClassNotFoundException -> 0x0026, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            goto L_0x0041
        L_0x001c:
            r11 = move-exception
            goto L_0x007e
        L_0x001e:
            r11 = move-exception
            goto L_0x0082
        L_0x0020:
            r11 = move-exception
            goto L_0x0086
        L_0x0022:
            r11 = move-exception
            goto L_0x008a
        L_0x0024:
            r11 = move-exception
            goto L_0x008e
        L_0x0026:
            android.app.Instrumentation r4 = r9.getInstrumentation()     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            android.content.Context r4 = r4.getContext()     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r4)     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            java.lang.String r4 = "Generating coverage for alternate test context."
            java.lang.String r5 = "\nWarning: %s"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            r6[r2] = r4     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            r10.format(r5, r6)     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
        L_0x0041:
            java.lang.String r4 = "dumpCoverageData"
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            java.lang.Class r7 = r1.getClass()     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            r6[r2] = r7     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            r6[r3] = r7     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            r8 = 2
            r6[r8] = r7     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            java.lang.reflect.Method r0 = r0.getMethod(r4, r6)     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            r5[r2] = r1     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            r5[r3] = r1     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            r5[r8] = r1     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            r0.invoke(r4, r5)     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            java.lang.String r0 = "coverageFilePath"
            java.lang.String r1 = r9.coverageFilePath     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            r11.putString(r0, r1)     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            java.lang.String r11 = "\nGenerated code coverage data to %s"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            java.lang.String r1 = r9.coverageFilePath     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            r0[r2] = r1     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            r10.format(r11, r0)     // Catch:{ ClassNotFoundException -> 0x007c, SecurityException -> 0x0024, NoSuchMethodException -> 0x0022, IllegalArgumentException -> 0x0020, IllegalAccessException -> 0x001e, InvocationTargetException -> 0x001c }
            goto L_0x0097
        L_0x007c:
            r11 = move-exception
            goto L_0x0092
        L_0x007e:
            r9.reportEmmaError(r10, r11)
            goto L_0x0097
        L_0x0082:
            r9.reportEmmaError(r10, r11)
            goto L_0x0097
        L_0x0086:
            r9.reportEmmaError(r10, r11)
            goto L_0x0097
        L_0x008a:
            r9.reportEmmaError(r10, r11)
            goto L_0x0097
        L_0x008e:
            r9.reportEmmaError(r10, r11)
            goto L_0x0097
        L_0x0092:
            java.lang.String r0 = "Is Emma/JaCoCo jar on classpath?"
            r9.reportEmmaError(r10, r0, r11)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.internal.runner.listener.CoverageListener.generateCoverageReport(java.io.PrintStream, android.os.Bundle):void");
    }

    private void reportEmmaError(PrintStream printStream, Exception exc) {
        reportEmmaError(printStream, "", exc);
    }

    public void instrumentationRunFinished(PrintStream printStream, Bundle bundle, Result result) {
        generateCoverageReport(printStream, bundle);
    }

    public void setInstrumentation(Instrumentation instrumentation) {
        super.setInstrumentation(instrumentation);
        if (this.coverageFilePath == null) {
            String absolutePath = instrumentation.getTargetContext().getFilesDir().getAbsolutePath();
            String str = File.separator;
            StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 11 + String.valueOf(str).length());
            sb.append(absolutePath);
            sb.append(str);
            sb.append(DEFAULT_COVERAGE_FILE_NAME);
            this.coverageFilePath = sb.toString();
        }
    }

    private void reportEmmaError(PrintStream printStream, String str, Exception exc) {
        String valueOf = String.valueOf(str);
        printStream.format("\nError: %s", new Object[]{valueOf.length() != 0 ? "Failed to generate Emma/JaCoCo coverage. ".concat(valueOf) : new String("Failed to generate Emma/JaCoCo coverage. ")});
    }
}
