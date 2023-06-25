package p040c.p200q.p363c.p367l.p368h;

import com.google.firebase.FirebaseNetworkException;
import p040c.p200q.p201a.p264c.p347m.C5763f;

/* renamed from: c.q.c.l.h.h */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6383h implements C5763f {

    /* renamed from: a */
    public final /* synthetic */ C6385i f12052a;

    public C6383h(C6385i iVar) {
        this.f12052a = iVar;
    }

    public final void onFailure(Exception exc) {
        if (exc instanceof FirebaseNetworkException) {
            C6387j.f12055h.mo20810f("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f12052a.f12054l.mo30486d();
        }
    }
}
