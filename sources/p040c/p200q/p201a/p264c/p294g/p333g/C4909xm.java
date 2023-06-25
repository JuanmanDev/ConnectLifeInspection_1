package p040c.p200q.p201a.p264c.p294g.p333g;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p527firebaseauthapi.zzaay;
import com.google.android.gms.internal.p527firebaseauthapi.zztk;
import com.google.android.gms.internal.p527firebaseauthapi.zzzr;
import com.google.android.gms.internal.p527firebaseauthapi.zzzy;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.zze;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p363c.p367l.p368h.C6381g;

/* renamed from: c.q.a.c.g.g.xm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4909xm {

    /* renamed from: a */
    public final C4755ro f9735a;

    public C4909xm(C4755ro roVar) {
        C3495o.m8908j(roVar);
        this.f9735a = roVar;
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ void m13518k(C4909xm xmVar, C4569l lVar, C4674on onVar, C4702po poVar) {
        Status status;
        if (lVar.mo26202p()) {
            zze b = lVar.mo26189b();
            String d = lVar.mo26190d();
            String k = lVar.mo26197k();
            if (lVar.mo26200n()) {
                status = new Status(17012);
            } else {
                status = C6381g.m17909a(lVar.mo26191e());
            }
            onVar.mo26480a(new zztk(status, b, d, k));
            return;
        }
        xmVar.mo26839g(new zzzy(lVar.mo26196j(), lVar.mo26192f(), Long.valueOf(lVar.mo26188a()), "Bearer"), lVar.mo26195i(), lVar.mo26194h(), Boolean.valueOf(lVar.mo26201o()), lVar.mo26189b(), onVar, poVar);
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ void m13519l(C4909xm xmVar, C4674on onVar, zzzy zzzy, C4434g gVar, C4702po poVar) {
        C3495o.m8908j(onVar);
        C3495o.m8908j(zzzy);
        C3495o.m8908j(gVar);
        C3495o.m8908j(poVar);
        xmVar.f9735a.mo25864c(new C4568kp(zzzy.mo33499S()), new C4565km(xmVar, poVar, onVar, zzzy, gVar));
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m13520m(C4909xm xmVar, C4674on onVar, zzzy zzzy, zzzr zzzr, C4434g gVar, C4702po poVar) {
        C3495o.m8908j(onVar);
        C3495o.m8908j(zzzy);
        C3495o.m8908j(zzzr);
        C3495o.m8908j(gVar);
        C3495o.m8908j(poVar);
        xmVar.f9735a.mo25865d(gVar, new C4592lm(xmVar, gVar, zzzr, onVar, zzzy, poVar));
    }

    /* renamed from: a */
    public final void mo26833a(zzaay zzaay, C4674on onVar) {
        C3495o.m8908j(zzaay);
        C3495o.m8908j(onVar);
        zzaay.mo33362R(true);
        this.f9735a.mo25866e(zzaay, new C4857vm(this, onVar));
    }

    /* renamed from: b */
    public final void mo26834b(String str, String str2, @Nullable String str3, C4674on onVar) {
        C3495o.m8904f(str);
        C3495o.m8904f(str2);
        C3495o.m8908j(onVar);
        this.f9735a.mo25867f(new C4623n(str, str2, str3), new C4484hm(this, onVar));
    }

    /* renamed from: c */
    public final void mo26835c(EmailAuthCredential emailAuthCredential, C4674on onVar) {
        C3495o.m8908j(emailAuthCredential);
        C3495o.m8908j(onVar);
        if (emailAuthCredential.mo37323Y()) {
            mo26837e(emailAuthCredential.mo37318T(), new C4511im(this, emailAuthCredential, onVar));
        } else {
            mo26838f(new C4487hp(emailAuthCredential, (String) null), onVar);
        }
    }

    /* renamed from: d */
    public final void mo26836d(C4677p pVar, C4674on onVar) {
        C3495o.m8908j(pVar);
        C3495o.m8908j(onVar);
        this.f9735a.mo25868g(pVar, new C4700pm(this, onVar));
    }

    /* renamed from: e */
    public final void mo26837e(String str, C4729qo qoVar) {
        C3495o.m8908j(qoVar);
        C3495o.m8904f(str);
        zzzy R = zzzy.m21975R(str);
        if (R.mo33504X()) {
            qoVar.mo26081a(R);
            return;
        }
        this.f9735a.mo25863b(new C4541jp(R.mo33500T()), new C4883wm(this, qoVar));
    }

    /* renamed from: f */
    public final void mo26838f(C4487hp hpVar, C4674on onVar) {
        C3495o.m8908j(hpVar);
        C3495o.m8908j(onVar);
        this.f9735a.mo25862a(hpVar, new C4538jm(this, onVar));
    }

    /* renamed from: g */
    public final void mo26839g(zzzy zzzy, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable zze zze, C4674on onVar, C4702po poVar) {
        C3495o.m8908j(zzzy);
        C3495o.m8908j(poVar);
        C3495o.m8908j(onVar);
        this.f9735a.mo25864c(new C4568kp(zzzy.mo33499S()), new C4619mm(this, poVar, str2, str, bool, zze, onVar, zzzy));
    }

    /* renamed from: n */
    public final void mo26840n(String str, C4674on onVar) {
        C3495o.m8904f(str);
        C3495o.m8908j(onVar);
        this.f9735a.mo25863b(new C4541jp(str), new C4646nm(this, onVar));
    }

    /* renamed from: o */
    public final void mo26841o(String str, String str2, String str3, C4674on onVar) {
        C3495o.m8904f(str);
        C3495o.m8904f(str2);
        C3495o.m8904f(str3);
        C3495o.m8908j(onVar);
        mo26837e(str3, new C4727qm(this, str, str2, onVar));
    }

    /* renamed from: p */
    public final void mo26842p(String str, zzaay zzaay, C4674on onVar) {
        C3495o.m8904f(str);
        C3495o.m8908j(zzaay);
        C3495o.m8908j(onVar);
        mo26837e(str, new C4831um(this, zzaay, onVar));
    }

    /* renamed from: q */
    public final void mo26843q(String str, C4677p pVar, C4674on onVar) {
        C3495o.m8904f(str);
        C3495o.m8908j(pVar);
        C3495o.m8908j(onVar);
        mo26837e(str, new C4779sm(this, pVar, onVar));
    }
}
