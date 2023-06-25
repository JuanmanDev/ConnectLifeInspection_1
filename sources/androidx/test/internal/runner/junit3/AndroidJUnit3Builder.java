package androidx.test.internal.runner.junit3;

import androidx.test.internal.util.AndroidRunnerBuilderUtil;
import androidx.test.internal.util.AndroidRunnerParams;
import org.junit.runner.Description;
import p627i.p629b.C9388f;
import p648m.p668e.p669j.p670d.C9703e;
import p648m.p668e.p677l.C9749f;
import p648m.p668e.p677l.p679h.C9759b;

public class AndroidJUnit3Builder extends C9703e {
    public static final C9749f NOT_A_VALID_TEST = new C9749f() {
        public Description getDescription() {
            return Description.EMPTY;
        }

        public void run(C9759b bVar) {
        }
    };
    public static final String TAG = "AndroidJUnit3Builder";
    public final AndroidRunnerParams androidRunnerParams;
    public final boolean scanningPath;

    public AndroidJUnit3Builder(AndroidRunnerParams androidRunnerParams2, boolean z) {
        this.androidRunnerParams = androidRunnerParams2;
        this.scanningPath = z;
    }

    public C9749f runnerForClass(Class<?> cls) {
        if (!AndroidRunnerBuilderUtil.isJUnit3Test(cls)) {
            return null;
        }
        if (!this.scanningPath || AndroidRunnerBuilderUtil.hasJUnit3TestMethod(cls)) {
            return new JUnit38ClassRunner((C9388f) new AndroidTestSuite(cls, this.androidRunnerParams));
        }
        return NOT_A_VALID_TEST;
    }

    @Deprecated
    public AndroidJUnit3Builder(AndroidRunnerParams androidRunnerParams2) {
        this(androidRunnerParams2, false);
    }
}
