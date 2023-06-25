package p040c.p200q.p201a.p264c.p340i.p342b;

/* renamed from: c.q.a.c.i.b.m8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5568m8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C5691x2 f10682e;

    /* renamed from: l */
    public final /* synthetic */ C5604p8 f10683l;

    public C5568m8(C5604p8 p8Var, C5691x2 x2Var) {
        this.f10683l = p8Var;
        this.f10682e = x2Var;
    }

    public final void run() {
        synchronized (this.f10683l) {
            this.f10683l.f10749e = false;
            if (!this.f10683l.f10751m.mo28584z()) {
                this.f10683l.f10751m.f10699a.mo28487b().mo28338q().mo28259a("Connected to remote service");
                this.f10683l.f10751m.mo28582x(this.f10682e);
            }
        }
    }
}
