package p040c.p200q.p363c.p367l.p368h;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.p527firebaseauthapi.zzzy;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3365c;
import p040c.p200q.p363c.C6331h;

/* renamed from: c.q.c.l.h.t */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6397t {

    /* renamed from: a */
    public volatile int f12073a = 0;

    /* renamed from: b */
    public final C6387j f12074b;

    /* renamed from: c */
    public volatile boolean f12075c = false;

    public C6397t(C6331h hVar) {
        Context j = hVar.mo30404j();
        C6387j jVar = new C6387j(hVar);
        this.f12074b = jVar;
        C3365c.m8513d((Application) j.getApplicationContext());
        C3365c.m8512b().mo20467a(new C6396s(this));
    }

    /* renamed from: c */
    public final void mo30497c() {
        this.f12074b.mo30484b();
    }

    /* renamed from: d */
    public final void mo30498d(zzzy zzzy) {
        if (zzzy != null) {
            long P = zzzy.mo33497P();
            if (P <= 0) {
                P = 3600;
            }
            long Q = zzzy.mo33498Q();
            C6387j jVar = this.f12074b;
            jVar.f12057b = Q + (P * 1000);
            jVar.f12058c = -1;
            if (mo30499f()) {
                this.f12074b.mo30485c();
            }
        }
    }

    /* renamed from: f */
    public final boolean mo30499f() {
        return this.f12073a > 0 && !this.f12075c;
    }
}
