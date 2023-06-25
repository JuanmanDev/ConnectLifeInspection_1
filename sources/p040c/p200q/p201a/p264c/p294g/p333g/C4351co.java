package p040c.p200q.p201a.p264c.p294g.p333g;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.p527firebaseauthapi.zzaay;
import com.google.android.gms.internal.p527firebaseauthapi.zzzp;
import com.google.android.gms.internal.p527firebaseauthapi.zzzy;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p363c.C6331h;

/* renamed from: c.q.a.c.g.g.co */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4351co extends C4755ro implements C4325bp {

    /* renamed from: a */
    public C4884wn f9150a;

    /* renamed from: b */
    public C4910xn f9151b;

    /* renamed from: c */
    public C4885wo f9152c;

    /* renamed from: d */
    public final C4324bo f9153d;

    /* renamed from: e */
    public final C6331h f9154e;

    /* renamed from: f */
    public final String f9155f;

    /* renamed from: g */
    public C4378do f9156g;

    public C4351co(C6331h hVar, C4324bo boVar, C4885wo woVar, C4884wn wnVar, C4910xn xnVar) {
        this.f9154e = hVar;
        this.f9155f = hVar.mo30406o().mo30419b();
        C3495o.m8908j(boVar);
        this.f9153d = boVar;
        mo25870i((C4885wo) null, (C4884wn) null, (C4910xn) null);
        C4352cp.m11808e(this.f9155f, this);
    }

    /* renamed from: a */
    public final void mo25862a(C4487hp hpVar, C4729qo qoVar) {
        C3495o.m8908j(hpVar);
        C3495o.m8908j(qoVar);
        C4884wn wnVar = this.f9150a;
        C4807to.m13174a(wnVar.mo26785a("/emailLinkSignin", this.f9155f), hpVar, qoVar, C4514ip.class, wnVar.f9714b);
    }

    /* renamed from: b */
    public final void mo25863b(C4541jp jpVar, C4729qo qoVar) {
        C3495o.m8908j(jpVar);
        C3495o.m8908j(qoVar);
        C4885wo woVar = this.f9152c;
        C4807to.m13174a(woVar.mo26785a("/token", this.f9155f), jpVar, qoVar, zzzy.class, woVar.f9714b);
    }

    /* renamed from: c */
    public final void mo25864c(C4568kp kpVar, C4729qo qoVar) {
        C3495o.m8908j(kpVar);
        C3495o.m8908j(qoVar);
        C4884wn wnVar = this.f9150a;
        C4807to.m13174a(wnVar.mo26785a("/getAccountInfo", this.f9155f), kpVar, qoVar, zzzp.class, wnVar.f9714b);
    }

    /* renamed from: d */
    public final void mo25865d(C4434g gVar, C4729qo qoVar) {
        C3495o.m8908j(gVar);
        C3495o.m8908j(qoVar);
        C4884wn wnVar = this.f9150a;
        C4807to.m13174a(wnVar.mo26785a("/setAccountInfo", this.f9155f), gVar, qoVar, C4461h.class, wnVar.f9714b);
    }

    /* renamed from: e */
    public final void mo25866e(zzaay zzaay, C4729qo qoVar) {
        C3495o.m8908j(zzaay);
        C3495o.m8908j(qoVar);
        C4884wn wnVar = this.f9150a;
        C4807to.m13174a(wnVar.mo26785a("/verifyAssertion", this.f9155f), zzaay, qoVar, C4569l.class, wnVar.f9714b);
    }

    /* renamed from: f */
    public final void mo25867f(C4623n nVar, C4729qo qoVar) {
        C3495o.m8908j(nVar);
        C3495o.m8908j(qoVar);
        C4884wn wnVar = this.f9150a;
        C4807to.m13174a(wnVar.mo26785a("/verifyPassword", this.f9155f), nVar, qoVar, C4650o.class, wnVar.f9714b);
    }

    /* renamed from: g */
    public final void mo25868g(C4677p pVar, C4729qo qoVar) {
        C3495o.m8908j(pVar);
        C3495o.m8908j(qoVar);
        C4884wn wnVar = this.f9150a;
        C4807to.m13174a(wnVar.mo26785a("/verifyPhoneNumber", this.f9155f), pVar, qoVar, C4704q.class, wnVar.f9714b);
    }

    @NonNull
    /* renamed from: h */
    public final C4378do mo25869h() {
        if (this.f9156g == null) {
            C6331h hVar = this.f9154e;
            this.f9156g = new C4378do(hVar.mo30404j(), hVar, this.f9153d.mo25834b());
        }
        return this.f9156g;
    }

    /* renamed from: i */
    public final void mo25870i(C4885wo woVar, C4884wn wnVar, C4910xn xnVar) {
        this.f9152c = null;
        this.f9150a = null;
        this.f9151b = null;
        String a = C4963zo.m13741a("firebear.secureToken");
        if (TextUtils.isEmpty(a)) {
            a = C4352cp.m11807d(this.f9155f);
        } else {
            "Found hermetic configuration for secureToken URL: ".concat(String.valueOf(a));
        }
        if (this.f9152c == null) {
            this.f9152c = new C4885wo(a, mo25869h());
        }
        String a2 = C4963zo.m13741a("firebear.identityToolkit");
        if (TextUtils.isEmpty(a2)) {
            a2 = C4352cp.m11805b(this.f9155f);
        } else {
            "Found hermetic configuration for identityToolkit URL: ".concat(String.valueOf(a2));
        }
        if (this.f9150a == null) {
            this.f9150a = new C4884wn(a2, mo25869h());
        }
        String a3 = C4963zo.m13741a("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(a3)) {
            a3 = C4352cp.m11806c(this.f9155f);
        } else {
            "Found hermetic configuration for identityToolkitV2 URL: ".concat(String.valueOf(a3));
        }
        if (this.f9151b == null) {
            this.f9151b = new C4910xn(a3, mo25869h());
        }
    }
}
