package androidx.test.internal.runner.junit4.statement;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p648m.p668e.p680m.p681d.C9781d;
import p648m.p668e.p680m.p681d.C9785g;

public class RunBefores extends UiThreadStatement {
    public final List<C9781d> befores;
    public final C9785g next;
    public final Object target;

    public RunBefores(C9781d dVar, C9785g gVar, List<C9781d> list, Object obj) {
        super(gVar, UiThreadStatement.shouldRunOnUiThread(dVar));
        this.next = gVar;
        this.befores = list;
        this.target = obj;
    }

    public void evaluate() {
        final AtomicReference atomicReference = new AtomicReference();
        for (final C9781d next2 : this.befores) {
            if (UiThreadStatement.shouldRunOnUiThread(next2)) {
                UiThreadStatement.runOnUiThread(new Runnable() {
                    public void run() {
                        try {
                            next2.mo50657m(RunBefores.this.target, new Object[0]);
                        } catch (Throwable th) {
                            atomicReference.set(th);
                        }
                    }
                });
                Throwable th = (Throwable) atomicReference.get();
                if (th != null) {
                    throw th;
                }
            } else {
                next2.mo50657m(this.target, new Object[0]);
            }
        }
        this.next.evaluate();
    }
}
