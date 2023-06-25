package androidx.test.internal.runner.junit3;

import androidx.test.internal.util.AndroidRunnerParams;
import p627i.p629b.C9388f;
import p627i.p629b.C9394k;
import p648m.p668e.p669j.p670d.C9706h;
import p648m.p668e.p669j.p672f.C9714c;
import p648m.p668e.p677l.C9749f;

public class AndroidSuiteBuilder extends C9706h {
    public static final String LOG_TAG = "AndroidSuiteBuilder";
    public final AndroidRunnerParams androidRunnerParams;

    public AndroidSuiteBuilder(AndroidRunnerParams androidRunnerParams2) {
        this.androidRunnerParams = androidRunnerParams2;
    }

    public C9749f runnerForClass(Class<?> cls) {
        if (this.androidRunnerParams.isIgnoreSuiteMethods()) {
            return null;
        }
        if (!hasSuiteMethod(cls)) {
            return null;
        }
        C9388f a = C9714c.m26175a(cls);
        if (a instanceof C9394k) {
            return new JUnit38ClassRunner((C9388f) new AndroidTestSuite((C9394k) a, this.androidRunnerParams));
        }
        throw new IllegalArgumentException(String.valueOf(cls.getName()).concat("#suite() did not return a TestSuite"));
    }
}
