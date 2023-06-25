package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzoy;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* renamed from: c.q.a.c.g.g.e5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4386e5 {

    /* renamed from: a */
    public final C4372di f9191a;

    public C4386e5(C4372di diVar) {
        this.f9191a = diVar;
    }

    /* renamed from: e */
    public static C4386e5 m11889e() {
        return new C4386e5(C4453gi.m12056G());
    }

    /* renamed from: f */
    public static C4386e5 m11890f(C4359d5 d5Var) {
        return new C4386e5((C4372di) d5Var.mo25885c().mo26164y());
    }

    @Deprecated
    /* renamed from: a */
    public final synchronized int mo25932a(C4930yh yhVar, boolean z) {
        C4426fi i;
        i = mo25938i(yhVar);
        this.f9191a.mo25908m(i);
        return i.mo25990E();
    }

    /* renamed from: b */
    public final synchronized C4359d5 mo25933b() {
        return C4359d5.m11818a((C4453gi) this.f9191a.mo26052e());
    }

    /* renamed from: c */
    public final synchronized C4386e5 mo25934c(C4305b5 b5Var) {
        mo25932a(b5Var.mo25809a(), false);
        return this;
    }

    /* renamed from: d */
    public final synchronized C4386e5 mo25935d(int i) {
        int i2 = 0;
        while (i2 < this.f9191a.mo25907l()) {
            C4426fi q = this.f9191a.mo25910q(i2);
            if (q.mo25990E() != i) {
                i2++;
            } else if (q.mo25994N() == 3) {
                this.f9191a.mo25909p(i);
            } else {
                throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }

    /* renamed from: g */
    public final synchronized int mo25936g() {
        int a;
        a = C4554kb.m12281a();
        while (mo25939j(a)) {
            a = C4554kb.m12281a();
        }
        return a;
    }

    /* renamed from: h */
    public final synchronized C4426fi mo25937h(C4826uh uhVar, zzoy zzoy) {
        C4399ei G;
        int g = mo25936g();
        if (zzoy != zzoy.UNKNOWN_PREFIX) {
            G = C4426fi.m11976G();
            G.mo25945l(uhVar);
            G.mo25946m(g);
            G.mo25948q(3);
            G.mo25947p(zzoy);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (C4426fi) G.mo26052e();
    }

    /* renamed from: i */
    public final synchronized C4426fi mo25938i(C4930yh yhVar) {
        return mo25937h(C4840v5.m13297c(yhVar), yhVar.mo26863H());
    }

    /* renamed from: j */
    public final synchronized boolean mo25939j(int i) {
        boolean z;
        Iterator it = this.f9191a.mo25911t().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((C4426fi) it.next()).mo25990E() == i) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }
}
