package p040c.p200q.p363c.p370n.p371h.p374j;

import android.os.Process;

/* renamed from: c.q.c.n.h.j.j */
/* compiled from: BackgroundPriorityRunnable */
public abstract class C6509j implements Runnable {
    /* renamed from: a */
    public abstract void mo30688a();

    public final void run() {
        Process.setThreadPriority(10);
        mo30688a();
    }
}
