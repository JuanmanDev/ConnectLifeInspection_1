package p040c.p200q.p201a.p264c.p294g.p333g;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p527firebaseauthapi.zzzr;
import com.google.android.gms.internal.p527firebaseauthapi.zzzy;
import java.util.ArrayList;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p289n.C3552c;

/* renamed from: c.q.a.c.g.g.lm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4592lm implements C4729qo {

    /* renamed from: a */
    public final /* synthetic */ C4434g f9395a;

    /* renamed from: b */
    public final /* synthetic */ zzzr f9396b;

    /* renamed from: c */
    public final /* synthetic */ C4674on f9397c;

    /* renamed from: d */
    public final /* synthetic */ zzzy f9398d;

    /* renamed from: e */
    public final /* synthetic */ C4702po f9399e;

    public C4592lm(C4909xm xmVar, C4434g gVar, zzzr zzzr, C4674on onVar, zzzy zzzy, C4702po poVar) {
        this.f9395a = gVar;
        this.f9396b = zzzr;
        this.f9397c = onVar;
        this.f9398d = zzzy;
        this.f9399e = poVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo26081a(Object obj) {
        C4461h hVar = (C4461h) obj;
        if (this.f9395a.mo26012h("EMAIL")) {
            this.f9396b.mo33480V((String) null);
        } else {
            C4434g gVar = this.f9395a;
            if (gVar.mo26009e() != null) {
                this.f9396b.mo33480V(gVar.mo26009e());
            }
        }
        if (this.f9395a.mo26012h("DISPLAY_NAME")) {
            this.f9396b.mo33479U((String) null);
        } else {
            C4434g gVar2 = this.f9395a;
            if (gVar2.mo26008d() != null) {
                this.f9396b.mo33479U(gVar2.mo26008d());
            }
        }
        if (this.f9395a.mo26012h("PHOTO_URL")) {
            this.f9396b.mo33483Y((String) null);
        } else {
            C4434g gVar3 = this.f9395a;
            if (gVar3.mo26011g() != null) {
                this.f9396b.mo33483Y(gVar3.mo26011g());
            }
        }
        if (!TextUtils.isEmpty(this.f9395a.mo26010f())) {
            this.f9396b.mo33482X(C3552c.m9056c("redacted".getBytes()));
        }
        List e = hVar.mo26047e();
        if (e == null) {
            e = new ArrayList();
        }
        this.f9396b.mo33484Z(e);
        C4674on onVar = this.f9397c;
        zzzy zzzy = this.f9398d;
        C3495o.m8908j(zzzy);
        C3495o.m8908j(hVar);
        String b = hVar.mo26045b();
        String d = hVar.mo26046d();
        if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(d)) {
            zzzy = new zzzy(d, b, Long.valueOf(hVar.mo26044a()), zzzy.mo33501U());
        }
        onVar.mo26484e(zzzy, this.f9396b);
    }

    /* renamed from: c */
    public final void mo26082c(@Nullable String str) {
        this.f9399e.mo26082c(str);
    }
}
