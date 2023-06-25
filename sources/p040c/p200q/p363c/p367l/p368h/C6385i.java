package p040c.p200q.p363c.p367l.p368h;

import com.google.firebase.auth.FirebaseAuth;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p363c.C6331h;

/* renamed from: c.q.c.l.h.i */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6385i implements Runnable {

    /* renamed from: e */
    public final String f12053e;

    /* renamed from: l */
    public final /* synthetic */ C6387j f12054l;

    public C6385i(C6387j jVar, String str) {
        this.f12054l = jVar;
        C3495o.m8904f(str);
        this.f12053e = str;
    }

    public final void run() {
        FirebaseAuth instance = FirebaseAuth.getInstance(C6331h.m17786m(this.f12053e));
        if (instance.mo37328c() != null) {
            C5771j a = instance.mo37326a(true);
            C6387j.f12055h.mo20810f("Token refreshing started", new Object[0]);
            a.mo28844e(new C6383h(this));
        }
    }
}
