package p040c.p200q.p201a.p264c.p294g.p333g;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p527firebaseauthapi.zztk;
import com.google.android.gms.internal.p527firebaseauthapi.zztm;
import com.google.android.gms.internal.p527firebaseauthapi.zzzr;
import com.google.android.gms.internal.p527firebaseauthapi.zzzy;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p363c.p367l.p368h.C6381g;
import p040c.p200q.p363c.p367l.p368h.C6388k;

/* renamed from: c.q.a.c.g.g.ho */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4486ho implements C4620mn {

    /* renamed from: a */
    public final /* synthetic */ C4594lo f9283a;

    public C4486ho(C4594lo loVar) {
        this.f9283a = loVar;
    }

    /* renamed from: a */
    public final void mo26083a(zzzy zzzy, zzzr zzzr) {
        int i = this.f9283a.f9400a;
        boolean z = i == 2;
        C3495o.m8912n(z, "Unexpected response type: " + i);
        C4594lo loVar = this.f9283a;
        loVar.f9408i = zzzy;
        loVar.f9409j = zzzr;
        C4594lo.m12448h(loVar);
    }

    /* renamed from: b */
    public final void mo26084b(Status status) {
        String S = status.mo24534S();
        if (S != null) {
            if (S.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (S.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (S.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (S.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (S.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (S.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (S.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (S.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (S.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (S.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        C4594lo loVar = this.f9283a;
        if (loVar.f9400a == 8) {
            loVar.f9414o = true;
            mo26089g(new C4432fo(this, status));
            return;
        }
        C4594lo.m12449i(loVar, status);
        this.f9283a.mo26294j(status);
    }

    /* renamed from: c */
    public final void mo26085c(zzzy zzzy) {
        int i = this.f9283a.f9400a;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        C3495o.m8912n(z, "Unexpected response type: " + i);
        C4594lo loVar = this.f9283a;
        loVar.f9408i = zzzy;
        C4594lo.m12448h(loVar);
    }

    /* renamed from: d */
    public final void mo26086d(zztm zztm) {
        C4594lo loVar = this.f9283a;
        loVar.f9413n = zztm;
        loVar.mo26294j(C6381g.m17909a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    /* renamed from: e */
    public final void mo26087e(Status status, PhoneAuthCredential phoneAuthCredential) {
        int i = this.f9283a.f9400a;
        boolean z = i == 2;
        C3495o.m8912n(z, "Unexpected response type " + i);
        mo26090h(status, phoneAuthCredential, (String) null, (String) null);
    }

    /* renamed from: f */
    public final void mo26088f(zztk zztk) {
        mo26090h(zztk.mo33461P(), zztk.mo33462Q(), zztk.mo33463R(), zztk.mo33464S());
    }

    /* renamed from: g */
    public final void mo26089g(C4513io ioVar) {
        this.f9283a.f9407h.execute(new C4459go(this, ioVar));
    }

    /* renamed from: h */
    public final void mo26090h(Status status, AuthCredential authCredential, @Nullable String str, @Nullable String str2) {
        C4594lo.m12449i(this.f9283a, status);
        C4594lo loVar = this.f9283a;
        loVar.f9410k = authCredential;
        loVar.f9411l = str;
        loVar.f9412m = str2;
        C6388k kVar = loVar.f9405f;
        if (kVar != null) {
            kVar.mo30449b(status);
        }
        this.f9283a.mo26294j(status);
    }
}
