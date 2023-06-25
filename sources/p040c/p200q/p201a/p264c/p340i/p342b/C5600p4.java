package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Process;
import androidx.annotation.GuardedBy;
import java.util.concurrent.BlockingQueue;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.p4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5600p4 extends Thread {

    /* renamed from: e */
    public final Object f10742e;

    /* renamed from: l */
    public final BlockingQueue f10743l;
    @GuardedBy("threadLifeCycleLock")

    /* renamed from: m */
    public boolean f10744m = false;

    /* renamed from: n */
    public final /* synthetic */ C5612q4 f10745n;

    public C5600p4(C5612q4 q4Var, String str, BlockingQueue blockingQueue) {
        this.f10745n = q4Var;
        C3495o.m8908j(str);
        C3495o.m8908j(blockingQueue);
        this.f10742e = new Object();
        this.f10743l = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    public final void mo28517a() {
        synchronized (this.f10742e) {
            this.f10742e.notifyAll();
        }
    }

    /* renamed from: b */
    public final void mo28518b() {
        synchronized (this.f10745n.f10772i) {
            if (!this.f10744m) {
                this.f10745n.f10773j.release();
                this.f10745n.f10772i.notifyAll();
                C5612q4 q4Var = this.f10745n;
                if (this == q4Var.f10766c) {
                    q4Var.f10766c = null;
                } else if (this == q4Var.f10767d) {
                    q4Var.f10767d = null;
                } else {
                    q4Var.f10699a.mo28487b().mo28339r().mo28259a("Current scheduler thread is neither worker nor network");
                }
                this.f10744m = true;
            }
        }
    }

    /* renamed from: c */
    public final void mo28519c(InterruptedException interruptedException) {
        this.f10745n.f10699a.mo28487b().mo28344w().mo28260b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f10745n.f10773j.acquire();
                z = true;
            } catch (InterruptedException e) {
                mo28519c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C5588o4 o4Var = (C5588o4) this.f10743l.poll();
                if (o4Var != null) {
                    Process.setThreadPriority(true != o4Var.f10713l ? 10 : threadPriority);
                    o4Var.run();
                } else {
                    synchronized (this.f10742e) {
                        if (this.f10743l.peek() == null) {
                            boolean unused = this.f10745n.f10774k;
                            try {
                                this.f10742e.wait(30000);
                            } catch (InterruptedException e2) {
                                mo28519c(e2);
                            }
                        }
                    }
                    synchronized (this.f10745n.f10772i) {
                        if (this.f10743l.peek() == null) {
                            mo28518b();
                            mo28518b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            mo28518b();
            throw th;
        }
    }
}
