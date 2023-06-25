package androidx.test.rule;

import android.os.Debug;
import org.junit.runner.Description;
import p648m.p668e.p676k.C9741c;
import p648m.p668e.p680m.p681d.C9785g;

public class DisableOnAndroidDebug implements C9741c {
    public final C9741c rule;

    public DisableOnAndroidDebug(C9741c cVar) {
        this.rule = cVar;
    }

    public final C9785g apply(C9785g gVar, Description description) {
        if (isDebugging()) {
            return gVar;
        }
        return this.rule.apply(gVar, description);
    }

    public boolean isDebugging() {
        return Debug.isDebuggerConnected();
    }
}
