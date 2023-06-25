package p040c.p200q.p201a.p264c.p276d.p289n.p290r;

import android.os.Process;

/* renamed from: c.q.a.c.d.n.r.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3568b implements Runnable {

    /* renamed from: e */
    public final Runnable f6553e;

    public C3568b(Runnable runnable, int i) {
        this.f6553e = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f6553e.run();
    }
}
