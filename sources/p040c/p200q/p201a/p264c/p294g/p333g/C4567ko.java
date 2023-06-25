package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p347m.C5773k;

/* renamed from: c.q.a.c.g.g.ko */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4567ko {

    /* renamed from: a */
    public final C4594lo f9342a;

    /* renamed from: b */
    public final C5773k f9343b;

    public C4567ko(C4594lo loVar, C5773k kVar) {
        this.f9342a = loVar;
        this.f9343b = kVar;
    }

    /* renamed from: a */
    public final void mo26187a(Object obj, Status status) {
        C3495o.m8909k(this.f9343b, "completion source cannot be null");
        if (status != null) {
            C4594lo loVar = this.f9342a;
            if (loVar.f9413n != null) {
                C5773k kVar = this.f9343b;
                FirebaseAuth instance = FirebaseAuth.getInstance(loVar.f9402c);
                C4594lo loVar2 = this.f9342a;
                kVar.mo28860b(C4728qn.m12944c(instance, loVar2.f9413n, ("reauthenticateWithCredential".equals(loVar2.zza()) || "reauthenticateWithCredentialWithData".equals(this.f9342a.zza())) ? this.f9342a.f9403d : null));
                return;
            }
            AuthCredential authCredential = loVar.f9410k;
            if (authCredential != null) {
                this.f9343b.mo28860b(C4728qn.m12943b(status, authCredential, loVar.f9411l, loVar.f9412m));
            } else {
                this.f9343b.mo28860b(C4728qn.m12942a(status));
            }
        } else {
            this.f9343b.mo28861c(obj);
        }
    }
}
