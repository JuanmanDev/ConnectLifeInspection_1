package androidx.test.internal.runner;

import android.app.Instrumentation;
import android.os.Bundle;
import androidx.test.internal.runner.listener.InstrumentationRunListener;
import androidx.test.internal.util.Checks;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.runner.Result;
import p648m.p668e.p677l.C9745c;
import p648m.p668e.p677l.C9746d;
import p648m.p668e.p677l.p679h.C9757a;

public final class TestExecutor {
    public static final String LOG_TAG = "TestExecutor";
    public final Instrumentation instr;
    public final List<C9757a> listeners;

    public static class Builder {
        public final Instrumentation instr;
        public final List<C9757a> listeners = new ArrayList();

        public Builder(Instrumentation instrumentation) {
            this.instr = instrumentation;
        }

        public Builder addRunListener(C9757a aVar) {
            this.listeners.add(aVar);
            return this;
        }

        public TestExecutor build() {
            return new TestExecutor(this);
        }
    }

    private void reportRunEnded(List<C9757a> list, PrintStream printStream, Bundle bundle, Result result) {
        for (C9757a next : list) {
            if (next instanceof InstrumentationRunListener) {
                ((InstrumentationRunListener) next).instrumentationRunFinished(printStream, bundle, result);
            }
        }
    }

    private void setUpListeners(C9745c cVar) {
        for (C9757a next : this.listeners) {
            String valueOf = String.valueOf(next.getClass().getName());
            if (valueOf.length() != 0) {
                "Adding listener ".concat(valueOf);
            } else {
                new String("Adding listener ");
            }
            cVar.mo50566a(next);
            if (next instanceof InstrumentationRunListener) {
                ((InstrumentationRunListener) next).setInstrumentation(this.instr);
            }
        }
    }

    public Bundle execute(C9746d dVar) {
        String format;
        Bundle bundle = new Bundle();
        Result result = new Result();
        try {
            C9745c cVar = new C9745c();
            setUpListeners(cVar);
            Result d = cVar.mo50568d(dVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(byteArrayOutputStream);
            reportRunEnded(this.listeners, printStream, bundle, d);
            printStream.close();
            format = String.format("\n%s", new Object[]{byteArrayOutputStream.toString()});
        } catch (Throwable th) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            PrintStream printStream2 = new PrintStream(byteArrayOutputStream2);
            reportRunEnded(this.listeners, printStream2, bundle, result);
            printStream2.close();
            bundle.putString("stream", String.format("\n%s", new Object[]{byteArrayOutputStream2.toString()}));
            throw th;
        }
        bundle.putString("stream", format);
        return bundle;
    }

    public TestExecutor(Builder builder) {
        this.listeners = (List) Checks.checkNotNull(builder.listeners);
        this.instr = builder.instr;
    }
}
