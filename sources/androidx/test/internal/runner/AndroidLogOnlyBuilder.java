package androidx.test.internal.runner;

import androidx.test.internal.runner.junit3.JUnit38ClassRunner;
import androidx.test.internal.runner.junit3.NonExecutingTestSuite;
import androidx.test.internal.util.AndroidRunnerBuilderUtil;
import androidx.test.internal.util.AndroidRunnerParams;
import androidx.test.internal.util.Checks;
import java.util.List;
import p627i.p629b.C9388f;
import p627i.p629b.C9394k;
import p648m.p668e.p669j.p672f.C9710a;
import p648m.p668e.p669j.p672f.C9714c;
import p648m.p668e.p677l.C9749f;
import p648m.p668e.p680m.p681d.C9783e;

public class AndroidLogOnlyBuilder extends C9783e {
    public final AndroidRunnerBuilder builder;
    public int runnerCount = 0;
    public final AndroidRunnerParams runnerParams;
    public final boolean scanningPath;

    public AndroidLogOnlyBuilder(AndroidRunnerParams androidRunnerParams, boolean z, List<Class<? extends C9783e>> list) {
        this.runnerParams = (AndroidRunnerParams) Checks.checkNotNull(androidRunnerParams, "runnerParams cannot be null!");
        this.scanningPath = z;
        this.builder = new AndroidRunnerBuilder(this, androidRunnerParams, z, list);
    }

    public C9749f runnerForClass(Class<?> cls) {
        this.runnerCount++;
        if (AndroidRunnerBuilderUtil.isJUnit3Test(cls)) {
            if (!this.scanningPath || AndroidRunnerBuilderUtil.hasJUnit3TestMethod(cls)) {
                return new JUnit38ClassRunner((C9388f) new NonExecutingTestSuite(cls));
            }
            return null;
        } else if (!AndroidRunnerBuilderUtil.hasSuiteMethod(cls)) {
            int i = this.runnerCount;
            C9749f runnerForClass = this.builder.runnerForClass(cls);
            if (runnerForClass == null) {
                return null;
            }
            if (!(runnerForClass instanceof C9710a) && this.runnerCount <= i) {
                return new NonExecutingRunner(runnerForClass);
            }
            return runnerForClass;
        } else if (this.runnerParams.isIgnoreSuiteMethods()) {
            return null;
        } else {
            C9388f a = C9714c.m26175a(cls);
            if (a instanceof C9394k) {
                return new JUnit38ClassRunner((C9388f) new NonExecutingTestSuite((C9394k) a));
            }
            throw new IllegalArgumentException(String.valueOf(cls.getName()).concat("#suite() did not return a TestSuite"));
        }
    }
}
