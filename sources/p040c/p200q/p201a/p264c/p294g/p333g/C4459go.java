package p040c.p200q.p201a.p264c.p294g.p333g;

import p040c.p200q.p363c.p367l.C6367f;

/* renamed from: c.q.a.c.g.g.go */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4459go implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C4513io f9250e;

    /* renamed from: l */
    public final /* synthetic */ C4486ho f9251l;

    public C4459go(C4486ho hoVar, C4513io ioVar) {
        this.f9251l = hoVar;
        this.f9250e = ioVar;
    }

    public final void run() {
        synchronized (this.f9251l.f9283a.f9406g) {
            if (!this.f9251l.f9283a.f9406g.isEmpty()) {
                this.f9250e.mo26001a((C6367f) this.f9251l.f9283a.f9406g.get(0), new Object[0]);
            }
        }
    }
}
