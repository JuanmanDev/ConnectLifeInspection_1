package androidx.test.internal.runner.junit4;

import androidx.test.internal.runner.RunnerArgs;
import androidx.test.internal.runner.junit4.statement.RunAfters;
import androidx.test.internal.runner.junit4.statement.RunBefores;
import androidx.test.internal.runner.junit4.statement.UiThreadStatement;
import androidx.test.internal.util.AndroidRunnerParams;
import androidx.test.platform.app.InstrumentationRegistry;
import java.util.List;
import org.junit.Test;
import p648m.p668e.C9685a;
import p648m.p668e.C9688d;
import p648m.p668e.p669j.p672f.p675f.C9732c;
import p648m.p668e.p680m.C9769a;
import p648m.p668e.p680m.p681d.C9781d;
import p648m.p668e.p680m.p681d.C9785g;

public class AndroidJUnit4ClassRunner extends C9769a {
    public final AndroidRunnerParams androidRunnerParams;

    public AndroidJUnit4ClassRunner(Class<?> cls, AndroidRunnerParams androidRunnerParams2) {
        super(cls);
        this.androidRunnerParams = androidRunnerParams2;
    }

    public static AndroidRunnerParams createRunnerParams() {
        return new AndroidRunnerParams(InstrumentationRegistry.getInstrumentation(), InstrumentationRegistry.getArguments(), new RunnerArgs.Builder().fromBundle(InstrumentationRegistry.getInstrumentation(), InstrumentationRegistry.getArguments()).build().testTimeout, false);
    }

    private long getTimeout(Test test) {
        if (test == null) {
            return 0;
        }
        return test.timeout();
    }

    public C9785g methodInvoker(C9781d dVar, Object obj) {
        if (UiThreadStatement.shouldRunOnUiThread(dVar)) {
            return new UiThreadStatement(super.methodInvoker(dVar, obj), true);
        }
        return super.methodInvoker(dVar, obj);
    }

    public C9785g withAfters(C9781d dVar, Object obj, C9785g gVar) {
        List<C9781d> i = getTestClass().mo50675i(C9685a.class);
        return i.isEmpty() ? gVar : new RunAfters(dVar, gVar, i, obj);
    }

    public C9785g withBefores(C9781d dVar, Object obj, C9785g gVar) {
        List<C9781d> i = getTestClass().mo50675i(C9688d.class);
        return i.isEmpty() ? gVar : new RunBefores(dVar, gVar, i, obj);
    }

    public C9785g withPotentialTimeout(C9781d dVar, Object obj, C9785g gVar) {
        long timeout = getTimeout((Test) dVar.getAnnotation(Test.class));
        if (timeout <= 0 && this.androidRunnerParams.getPerTestTimeout() > 0) {
            timeout = this.androidRunnerParams.getPerTestTimeout();
        }
        if (timeout <= 0) {
            return gVar;
        }
        return new C9732c(gVar, timeout);
    }

    public AndroidJUnit4ClassRunner(Class<?> cls) {
        this(cls, createRunnerParams());
    }
}
