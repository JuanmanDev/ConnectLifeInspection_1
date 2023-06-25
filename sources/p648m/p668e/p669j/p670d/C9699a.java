package p648m.p668e.p669j.p670d;

import java.util.Arrays;
import p648m.p668e.p677l.C9749f;
import p648m.p668e.p680m.p681d.C9783e;

/* renamed from: m.e.j.d.a */
/* compiled from: AllDefaultPossibilitiesBuilder */
public class C9699a extends C9783e {
    public final boolean canUseSuiteMethod;

    public C9699a(boolean z) {
        this.canUseSuiteMethod = z;
    }

    public C9700b annotatedBuilder() {
        return new C9700b(this);
    }

    public C9701c ignoredBuilder() {
        return new C9701c();
    }

    public C9703e junit3Builder() {
        return new C9703e();
    }

    public C9704f junit4Builder() {
        return new C9704f();
    }

    public C9749f runnerForClass(Class<?> cls) {
        for (C9783e safeRunnerForClass : Arrays.asList(new C9783e[]{ignoredBuilder(), annotatedBuilder(), suiteMethodBuilder(), junit3Builder(), junit4Builder()})) {
            C9749f safeRunnerForClass2 = safeRunnerForClass.safeRunnerForClass(cls);
            if (safeRunnerForClass2 != null) {
                return safeRunnerForClass2;
            }
        }
        return null;
    }

    public C9783e suiteMethodBuilder() {
        if (this.canUseSuiteMethod) {
            return new C9706h();
        }
        return new C9705g();
    }
}
