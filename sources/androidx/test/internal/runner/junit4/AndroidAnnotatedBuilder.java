package androidx.test.internal.runner.junit4;

import androidx.annotation.VisibleForTesting;
import androidx.test.internal.util.AndroidRunnerParams;
import p648m.p668e.p669j.p670d.C9700b;
import p648m.p668e.p677l.C9749f;
import p648m.p668e.p680m.p681d.C9783e;

public class AndroidAnnotatedBuilder extends C9700b {
    public static final String LOG_TAG = "AndroidAnnotatedBuilder";
    public final AndroidRunnerParams androidRunnerParams;

    public AndroidAnnotatedBuilder(C9783e eVar, AndroidRunnerParams androidRunnerParams2) {
        super(eVar);
        this.androidRunnerParams = androidRunnerParams2;
    }

    @VisibleForTesting
    public C9749f buildAndroidRunner(Class<? extends C9749f> cls, Class<?> cls2) {
        return (C9749f) cls.getConstructor(new Class[]{Class.class, AndroidRunnerParams.class}).newInstance(new Object[]{cls2, this.androidRunnerParams});
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        return super.buildRunner(r0, r4);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0021 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p648m.p668e.p677l.C9749f runnerForClass(java.lang.Class<?> r4) {
        /*
            r3 = this;
            java.lang.Class<m.e.l.e> r0 = p648m.p668e.p677l.C9748e.class
            java.lang.annotation.Annotation r0 = r4.getAnnotation(r0)     // Catch:{ all -> 0x002b }
            m.e.l.e r0 = (p648m.p668e.p677l.C9748e) r0     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0026
            java.lang.Class<androidx.test.runner.AndroidJUnit4> r1 = androidx.test.runner.AndroidJUnit4.class
            java.lang.Class r2 = r0.value()     // Catch:{ all -> 0x002b }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0026
            java.lang.Class r0 = r0.value()     // Catch:{ all -> 0x002b }
            m.e.l.f r0 = r3.buildAndroidRunner(r0, r4)     // Catch:{ NoSuchMethodException -> 0x0021 }
            if (r0 == 0) goto L_0x0026
            return r0
        L_0x0021:
            m.e.l.f r4 = super.buildRunner(r0, r4)     // Catch:{ all -> 0x002b }
            return r4
        L_0x0026:
            m.e.l.f r4 = super.runnerForClass(r4)
            return r4
        L_0x002b:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.internal.runner.junit4.AndroidAnnotatedBuilder.runnerForClass(java.lang.Class):m.e.l.f");
    }
}
