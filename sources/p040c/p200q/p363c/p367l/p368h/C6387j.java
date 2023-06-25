package p040c.p200q.p363c.p367l.p368h;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.work.PeriodicWorkRequest;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p284k.C3537a;
import p040c.p200q.p201a.p264c.p276d.p289n.C3556g;
import p040c.p200q.p201a.p264c.p294g.p333g.C4283aa;
import p040c.p200q.p363c.C6331h;

/* renamed from: c.q.c.l.h.j */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6387j {

    /* renamed from: h */
    public static final C3537a f12055h = new C3537a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a */
    public final C6331h f12056a;

    /* renamed from: b */
    public volatile long f12057b;

    /* renamed from: c */
    public volatile long f12058c;

    /* renamed from: d */
    public final long f12059d = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;

    /* renamed from: e */
    public final HandlerThread f12060e;

    /* renamed from: f */
    public final Handler f12061f = new C4283aa(this.f12060e.getLooper());

    /* renamed from: g */
    public final Runnable f12062g = new C6385i(this, this.f12056a.mo30405n());

    public C6387j(C6331h hVar) {
        f12055h.mo20810f("Initializing TokenRefresher", new Object[0]);
        C3495o.m8908j(hVar);
        this.f12056a = hVar;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f12060e = handlerThread;
        handlerThread.start();
    }

    /* renamed from: b */
    public final void mo30484b() {
        this.f12061f.removeCallbacks(this.f12062g);
    }

    /* renamed from: c */
    public final void mo30485c() {
        C3537a aVar = f12055h;
        long j = this.f12057b;
        long j2 = this.f12059d;
        aVar.mo20810f("Scheduling refresh for " + (j - j2), new Object[0]);
        mo30484b();
        this.f12058c = Math.max((this.f12057b - C3556g.m9065c().mo20838a()) - this.f12059d, 0) / 1000;
        this.f12061f.postDelayed(this.f12062g, this.f12058c * 1000);
    }

    /* renamed from: d */
    public final void mo30486d() {
        long j;
        int i = (int) this.f12058c;
        if (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) {
            long j2 = this.f12058c;
            j = j2 + j2;
        } else {
            j = i != 960 ? 30 : 960;
        }
        this.f12058c = j;
        this.f12057b = C3556g.m9065c().mo20838a() + (this.f12058c * 1000);
        C3537a aVar = f12055h;
        long j3 = this.f12057b;
        aVar.mo20810f("Scheduling refresh for " + j3, new Object[0]);
        this.f12061f.postDelayed(this.f12062g, this.f12058c * 1000);
    }
}
