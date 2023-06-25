package p040c.p200q.p201a.p264c.p294g.p333g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p527firebaseauthapi.zzaae;
import com.google.android.gms.internal.p527firebaseauthapi.zzzr;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzt;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p367l.p368h.C6392o;
import p040c.p200q.p363c.p367l.p368h.C6399v;
import p040c.p200q.p363c.p367l.p368h.C6403z;

/* renamed from: c.q.a.c.g.g.ln */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4593ln extends C4675oo {
    public C4593ln(C6331h hVar) {
        this.f9527a = new C4701pn(hVar);
        this.f9528b = Executors.newCachedThreadPool();
    }

    @NonNull
    /* renamed from: e */
    public static zzx m12436e(C6331h hVar, zzzr zzzr) {
        C3495o.m8908j(hVar);
        C3495o.m8908j(zzzr);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzt(zzzr, "firebase"));
        List g0 = zzzr.mo33491g0();
        if (g0 != null && !g0.isEmpty()) {
            for (int i = 0; i < g0.size(); i++) {
                arrayList.add(new zzt((zzaae) g0.get(i)));
            }
        }
        zzx zzx = new zzx(hVar, arrayList);
        zzx.mo37413l0(new zzz(zzzr.mo33475Q(), zzzr.mo33474P()));
        zzx.mo37412k0(zzzr.mo33493i0());
        zzx.mo37411j0(zzzr.mo33477S());
        zzx.mo37363b0(C6392o.m17923b(zzzr.mo33490f0()));
        return zzx;
    }

    /* renamed from: b */
    public final C5771j mo26280b(C6331h hVar, String str, String str2, @Nullable String str3, C6403z zVar) {
        C4512in inVar = new C4512in(str, str2, str3);
        inVar.mo26292e(hVar);
        inVar.mo26290c(zVar);
        return mo26486a(inVar);
    }

    /* renamed from: c */
    public final C5771j mo26281c(C6331h hVar, EmailAuthCredential emailAuthCredential, C6403z zVar) {
        C4539jn jnVar = new C4539jn(emailAuthCredential);
        jnVar.mo26292e(hVar);
        jnVar.mo26290c(zVar);
        return mo26486a(jnVar);
    }

    /* renamed from: d */
    public final C5771j mo26282d(C6331h hVar, PhoneAuthCredential phoneAuthCredential, @Nullable String str, C6403z zVar) {
        C4911xo.m13532a();
        C4566kn knVar = new C4566kn(phoneAuthCredential, str);
        knVar.mo26292e(hVar);
        knVar.mo26290c(zVar);
        return mo26486a(knVar);
    }

    /* renamed from: f */
    public final C5771j mo26283f(C6331h hVar, FirebaseUser firebaseUser, String str, C6399v vVar) {
        C4935ym ymVar = new C4935ym(str);
        ymVar.mo26292e(hVar);
        ymVar.mo26293f(firebaseUser);
        ymVar.mo26290c(vVar);
        ymVar.mo26291d(vVar);
        return mo26486a(ymVar);
    }

    /* renamed from: g */
    public final C5771j mo26284g(C6331h hVar, FirebaseUser firebaseUser, AuthCredential authCredential, C6399v vVar) {
        C3495o.m8908j(hVar);
        C3495o.m8908j(authCredential);
        C3495o.m8908j(firebaseUser);
        C3495o.m8908j(vVar);
        List Z = firebaseUser.mo37361Z();
        if (Z != null && Z.contains(authCredential.mo37314P())) {
            return C5777m.m16413e(C4728qn.m12942a(new Status(17015)));
        }
        if (authCredential instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
            if (!emailAuthCredential.mo37322X()) {
                C4961zm zmVar = new C4961zm(emailAuthCredential);
                zmVar.mo26292e(hVar);
                zmVar.mo26293f(firebaseUser);
                zmVar.mo26290c(vVar);
                zmVar.mo26291d(vVar);
                return mo26486a(zmVar);
            }
            C4350cn cnVar = new C4350cn(emailAuthCredential);
            cnVar.mo26292e(hVar);
            cnVar.mo26293f(firebaseUser);
            cnVar.mo26290c(vVar);
            cnVar.mo26291d(vVar);
            return mo26486a(cnVar);
        } else if (authCredential instanceof PhoneAuthCredential) {
            C4911xo.m13532a();
            C4323bn bnVar = new C4323bn((PhoneAuthCredential) authCredential);
            bnVar.mo26292e(hVar);
            bnVar.mo26293f(firebaseUser);
            bnVar.mo26290c(vVar);
            bnVar.mo26291d(vVar);
            return mo26486a(bnVar);
        } else {
            C3495o.m8908j(hVar);
            C3495o.m8908j(authCredential);
            C3495o.m8908j(firebaseUser);
            C3495o.m8908j(vVar);
            C4296an anVar = new C4296an(authCredential);
            anVar.mo26292e(hVar);
            anVar.mo26293f(firebaseUser);
            anVar.mo26290c(vVar);
            anVar.mo26291d(vVar);
            return mo26486a(anVar);
        }
    }

    /* renamed from: h */
    public final C5771j mo26285h(C6331h hVar, FirebaseUser firebaseUser, AuthCredential authCredential, @Nullable String str, C6399v vVar) {
        C4377dn dnVar = new C4377dn(authCredential, str);
        dnVar.mo26292e(hVar);
        dnVar.mo26293f(firebaseUser);
        dnVar.mo26290c(vVar);
        dnVar.mo26291d(vVar);
        return mo26486a(dnVar);
    }

    /* renamed from: i */
    public final C5771j mo26286i(C6331h hVar, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, C6399v vVar) {
        C4404en enVar = new C4404en(emailAuthCredential);
        enVar.mo26292e(hVar);
        enVar.mo26293f(firebaseUser);
        enVar.mo26290c(vVar);
        enVar.mo26291d(vVar);
        return mo26486a(enVar);
    }

    /* renamed from: j */
    public final C5771j mo26287j(C6331h hVar, FirebaseUser firebaseUser, String str, String str2, @Nullable String str3, C6399v vVar) {
        C4431fn fnVar = new C4431fn(str, str2, str3);
        fnVar.mo26292e(hVar);
        fnVar.mo26293f(firebaseUser);
        fnVar.mo26290c(vVar);
        fnVar.mo26291d(vVar);
        return mo26486a(fnVar);
    }

    /* renamed from: k */
    public final C5771j mo26288k(C6331h hVar, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, @Nullable String str, C6399v vVar) {
        C4911xo.m13532a();
        C4458gn gnVar = new C4458gn(phoneAuthCredential, str);
        gnVar.mo26292e(hVar);
        gnVar.mo26293f(firebaseUser);
        gnVar.mo26290c(vVar);
        gnVar.mo26291d(vVar);
        return mo26486a(gnVar);
    }

    /* renamed from: l */
    public final C5771j mo26289l(C6331h hVar, AuthCredential authCredential, @Nullable String str, C6403z zVar) {
        C4485hn hnVar = new C4485hn(authCredential, str);
        hnVar.mo26292e(hVar);
        hnVar.mo26290c(zVar);
        return mo26486a(hnVar);
    }
}
