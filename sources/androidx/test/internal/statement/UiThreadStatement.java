package androidx.test.internal.statement;

import androidx.test.platform.app.InstrumentationRegistry;
import java.util.concurrent.atomic.AtomicReference;
import p648m.p668e.p680m.p681d.C9785g;

public class UiThreadStatement extends C9785g {
    public final C9785g base;
    public final boolean runOnUiThread;

    public UiThreadStatement(C9785g gVar, boolean z) {
        this.base = gVar;
        this.runOnUiThread = z;
    }

    public void evaluate() {
        if (this.runOnUiThread) {
            final AtomicReference atomicReference = new AtomicReference();
            InstrumentationRegistry.getInstrumentation().runOnMainSync(new Runnable() {
                public void run() {
                    try {
                        UiThreadStatement.this.base.evaluate();
                    } catch (Throwable th) {
                        atomicReference.set(th);
                    }
                }
            });
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                throw th;
            }
            return;
        }
        this.base.evaluate();
    }
}
