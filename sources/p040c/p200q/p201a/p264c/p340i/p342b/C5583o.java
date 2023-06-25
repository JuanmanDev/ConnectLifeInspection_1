package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Handler;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p294g.p335i.C5361z0;

/* renamed from: c.q.a.c.i.b.o */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public abstract class C5583o {

    /* renamed from: d */
    public static volatile Handler f10705d;

    /* renamed from: a */
    public final C5601p5 f10706a;

    /* renamed from: b */
    public final Runnable f10707b;

    /* renamed from: c */
    public volatile long f10708c;

    public C5583o(C5601p5 p5Var) {
        C3495o.m8908j(p5Var);
        this.f10706a = p5Var;
        this.f10707b = new C5571n(this, p5Var);
    }

    /* renamed from: b */
    public final void mo28495b() {
        this.f10708c = 0;
        mo28498f().removeCallbacks(this.f10707b);
    }

    /* renamed from: c */
    public abstract void mo28128c();

    /* renamed from: d */
    public final void mo28496d(long j) {
        mo28495b();
        if (j >= 0) {
            this.f10708c = this.f10706a.mo28488c().mo20838a();
            if (!mo28498f().postDelayed(this.f10707b, j)) {
                this.f10706a.mo28487b().mo28339r().mo28260b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: e */
    public final boolean mo28497e() {
        return this.f10708c != 0;
    }

    /* renamed from: f */
    public final Handler mo28498f() {
        Handler handler;
        if (f10705d != null) {
            return f10705d;
        }
        synchronized (C5583o.class) {
            if (f10705d == null) {
                f10705d = new C5361z0(this.f10706a.mo28490f().getMainLooper());
            }
            handler = f10705d;
        }
        return handler;
    }
}
