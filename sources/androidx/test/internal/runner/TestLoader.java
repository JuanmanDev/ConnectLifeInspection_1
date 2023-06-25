package androidx.test.internal.runner;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import p648m.p668e.p677l.C9749f;
import p648m.p668e.p677l.p679h.C9759b;
import p648m.p668e.p680m.p681d.C9783e;

public class TestLoader {
    public static final String LOG_TAG = "TestLoader";
    public final ClassLoader classLoader;
    public final C9783e runnerBuilder;
    public final Map<String, C9749f> runnersMap = new LinkedHashMap();

    public static class ScanningRunnerBuilder extends C9783e {
        public final C9783e runnerBuilder;

        public ScanningRunnerBuilder(C9783e eVar) {
            this.runnerBuilder = eVar;
        }

        public C9749f runnerForClass(Class<?> cls) {
            if (!Modifier.isAbstract(cls.getModifiers())) {
                return this.runnerBuilder.runnerForClass(cls);
            }
            TestLoader.logDebug(String.format("Skipping abstract class %s: not a test", new Object[]{cls.getName()}));
            return null;
        }
    }

    @VisibleForTesting
    public static class UnloadableClassRunner extends C9749f {
        public final Description description;
        public final Failure failure;

        public UnloadableClassRunner(Description description2, Failure failure2) {
            this.description = description2;
            this.failure = failure2;
        }

        public Description getDescription() {
            return this.description;
        }

        public void run(C9759b bVar) {
            bVar.mo50589l(this.description);
            bVar.mo50583f(this.failure);
            bVar.mo50585h(this.description);
        }
    }

    public TestLoader(ClassLoader classLoader2, C9783e eVar) {
        this.classLoader = classLoader2;
        this.runnerBuilder = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void doCreateRunner(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            java.util.Map<java.lang.String, m.e.l.f> r0 = r7.runnersMap
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            r0 = 0
            r1 = 1
            r2 = 0
            java.lang.ClassLoader r3 = r7.classLoader     // Catch:{ ClassNotFoundException -> 0x0044 }
            java.lang.Class r3 = java.lang.Class.forName(r8, r2, r3)     // Catch:{ ClassNotFoundException -> 0x0044 }
            m.e.m.d.e r4 = r7.runnerBuilder     // Catch:{ ClassNotFoundException -> 0x0044 }
            m.e.l.f r4 = r4.safeRunnerForClass(r3)     // Catch:{ ClassNotFoundException -> 0x0044 }
            if (r4 != 0) goto L_0x002c
            java.lang.String r5 = "Skipping class %s: not a test"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x0044 }
            java.lang.String r3 = r3.getName()     // Catch:{ ClassNotFoundException -> 0x0044 }
            r6[r2] = r3     // Catch:{ ClassNotFoundException -> 0x0044 }
            java.lang.String r3 = java.lang.String.format(r5, r6)     // Catch:{ ClassNotFoundException -> 0x0044 }
            logDebug(r3)     // Catch:{ ClassNotFoundException -> 0x0044 }
            goto L_0x0042
        L_0x002c:
            m.e.l.f r5 = androidx.test.internal.runner.junit3.AndroidJUnit3Builder.NOT_A_VALID_TEST     // Catch:{ ClassNotFoundException -> 0x0044 }
            if (r4 != r5) goto L_0x0042
            java.lang.String r4 = "Skipping class %s: not a valid test"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x0044 }
            java.lang.String r3 = r3.getName()     // Catch:{ ClassNotFoundException -> 0x0044 }
            r5[r2] = r3     // Catch:{ ClassNotFoundException -> 0x0044 }
            java.lang.String r3 = java.lang.String.format(r4, r5)     // Catch:{ ClassNotFoundException -> 0x0044 }
            logDebug(r3)     // Catch:{ ClassNotFoundException -> 0x0044 }
            goto L_0x0060
        L_0x0042:
            r0 = r4
            goto L_0x0060
        L_0x0044:
            r3 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r8
            java.lang.String r4 = "Could not find class: %s"
            java.lang.String.format(r4, r1)
            java.lang.annotation.Annotation[] r1 = new java.lang.annotation.Annotation[r2]
            org.junit.runner.Description r1 = org.junit.runner.Description.createSuiteDescription(r8, r1)
            org.junit.runner.notification.Failure r2 = new org.junit.runner.notification.Failure
            r2.<init>(r1, r3)
            if (r9 != 0) goto L_0x0060
            androidx.test.internal.runner.TestLoader$UnloadableClassRunner r0 = new androidx.test.internal.runner.TestLoader$UnloadableClassRunner
            r0.<init>(r1, r2)
        L_0x0060:
            if (r0 == 0) goto L_0x0067
            java.util.Map<java.lang.String, m.e.l.f> r9 = r7.runnersMap
            r9.put(r8, r0)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.internal.runner.TestLoader.doCreateRunner(java.lang.String, boolean):void");
    }

    public static void logDebug(String str) {
        boolean isLoggable = Log.isLoggable(LOG_TAG, 3);
    }

    public static TestLoader testLoader(ClassLoader classLoader2, C9783e eVar, boolean z) {
        if (z) {
            eVar = new ScanningRunnerBuilder(eVar);
        }
        if (classLoader2 == null) {
            classLoader2 = TestLoader.class.getClassLoader();
        }
        return new TestLoader(classLoader2, eVar);
    }

    public List<C9749f> getRunnersFor(Collection<String> collection, boolean z) {
        for (String doCreateRunner : collection) {
            doCreateRunner(doCreateRunner, z);
        }
        return new ArrayList(this.runnersMap.values());
    }
}
