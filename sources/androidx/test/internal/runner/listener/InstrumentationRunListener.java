package androidx.test.internal.runner.listener;

import android.app.Instrumentation;
import android.os.Bundle;
import java.io.PrintStream;
import org.junit.runner.Result;
import p648m.p668e.p677l.p679h.C9757a;

public abstract class InstrumentationRunListener extends C9757a {
    public Instrumentation instr;

    public Instrumentation getInstrumentation() {
        return this.instr;
    }

    public void instrumentationRunFinished(PrintStream printStream, Bundle bundle, Result result) {
    }

    public void sendStatus(int i, Bundle bundle) {
        getInstrumentation().sendStatus(i, bundle);
    }

    public void sendString(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("stream", str);
        sendStatus(0, bundle);
    }

    public void setInstrumentation(Instrumentation instrumentation) {
        this.instr = instrumentation;
    }
}
