package p040c.p200q.p201a.p264c.p294g.p333g;

import android.content.Context;
import com.google.android.gms.internal.p527firebaseauthapi.zzrq;
import com.google.android.gms.internal.p527firebaseauthapi.zzru;
import com.google.android.gms.internal.p527firebaseauthapi.zzrw;
import com.google.android.gms.internal.p527firebaseauthapi.zzry;
import com.google.android.gms.internal.p527firebaseauthapi.zzsm;
import com.google.android.gms.internal.p527firebaseauthapi.zzsq;
import com.google.android.gms.internal.p527firebaseauthapi.zzss;
import com.google.android.gms.internal.p527firebaseauthapi.zzsu;
import com.google.firebase.auth.PhoneAuthCredential;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p284k.C3537a;
import p040c.p200q.p363c.C6331h;

/* renamed from: c.q.a.c.g.g.pn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4701pn {

    /* renamed from: b */
    public static final C3537a f9564b = new C3537a("FirebaseAuth", "FirebaseAuthFallback:");

    /* renamed from: a */
    public final C4909xm f9565a;

    public C4701pn(C6331h hVar) {
        C3495o.m8908j(hVar);
        Context j = hVar.mo30404j();
        C3495o.m8908j(j);
        this.f9565a = new C4909xm(new C4351co(hVar, C4324bo.m11745a(), (C4885wo) null, (C4884wn) null, (C4910xn) null));
        new C4937yo(j);
    }

    /* renamed from: a */
    public final void mo26531a(zzrq zzrq, C4620mn mnVar) {
        C3495o.m8908j(zzrq);
        C3495o.m8908j(mnVar);
        C3495o.m8904f(zzrq.zza());
        this.f9565a.mo26840n(zzrq.zza(), new C4674on(mnVar, f9564b));
    }

    /* renamed from: b */
    public final void mo26532b(zzru zzru, C4620mn mnVar) {
        C3495o.m8908j(zzru);
        C3495o.m8904f(zzru.mo33427P());
        C3495o.m8904f(zzru.mo33428Q());
        C3495o.m8904f(zzru.zza());
        C3495o.m8908j(mnVar);
        this.f9565a.mo26841o(zzru.mo33427P(), zzru.mo33428Q(), zzru.zza(), new C4674on(mnVar, f9564b));
    }

    /* renamed from: c */
    public final void mo26533c(zzrw zzrw, C4620mn mnVar) {
        C3495o.m8908j(zzrw);
        C3495o.m8904f(zzrw.mo33432Q());
        C3495o.m8908j(zzrw.mo33431P());
        C3495o.m8908j(mnVar);
        this.f9565a.mo26842p(zzrw.mo33432Q(), zzrw.mo33431P(), new C4674on(mnVar, f9564b));
    }

    /* renamed from: d */
    public final void mo26534d(zzry zzry, C4620mn mnVar) {
        C3495o.m8908j(mnVar);
        C3495o.m8908j(zzry);
        PhoneAuthCredential P = zzry.mo33434P();
        C3495o.m8908j(P);
        String Q = zzry.mo33435Q();
        C3495o.m8904f(Q);
        this.f9565a.mo26843q(Q, C4859vo.m13341a(P), new C4674on(mnVar, f9564b));
    }

    /* renamed from: e */
    public final void mo26535e(zzsm zzsm, C4620mn mnVar) {
        C3495o.m8908j(zzsm);
        C3495o.m8908j(zzsm.mo33443P());
        C3495o.m8908j(mnVar);
        this.f9565a.mo26833a(zzsm.mo33443P(), new C4674on(mnVar, f9564b));
    }

    /* renamed from: f */
    public final void mo26536f(zzsq zzsq, C4620mn mnVar) {
        C3495o.m8908j(zzsq);
        C3495o.m8904f(zzsq.zza());
        C3495o.m8904f(zzsq.mo33446P());
        C3495o.m8908j(mnVar);
        this.f9565a.mo26834b(zzsq.zza(), zzsq.mo33446P(), zzsq.mo33447Q(), new C4674on(mnVar, f9564b));
    }

    /* renamed from: g */
    public final void mo26537g(zzss zzss, C4620mn mnVar) {
        C3495o.m8908j(zzss);
        C3495o.m8908j(zzss.mo33450P());
        C3495o.m8908j(mnVar);
        this.f9565a.mo26835c(zzss.mo33450P(), new C4674on(mnVar, f9564b));
    }

    /* renamed from: h */
    public final void mo26538h(zzsu zzsu, C4620mn mnVar) {
        C3495o.m8908j(mnVar);
        C3495o.m8908j(zzsu);
        PhoneAuthCredential P = zzsu.mo33452P();
        C3495o.m8908j(P);
        this.f9565a.mo26836d(C4859vo.m13341a(P), new C4674on(mnVar, f9564b));
    }
}
