package p040c.p200q.p201a.p264c.p294g.p333g;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.p527firebaseauthapi.zzzp;
import com.google.android.gms.internal.p527firebaseauthapi.zzzr;
import com.google.android.gms.internal.p527firebaseauthapi.zzzy;
import java.util.List;

/* renamed from: c.q.a.c.g.g.km */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4565km implements C4729qo {

    /* renamed from: a */
    public final /* synthetic */ C4702po f9336a;

    /* renamed from: b */
    public final /* synthetic */ C4674on f9337b;

    /* renamed from: c */
    public final /* synthetic */ zzzy f9338c;

    /* renamed from: d */
    public final /* synthetic */ C4434g f9339d;

    /* renamed from: e */
    public final /* synthetic */ C4909xm f9340e;

    public C4565km(C4909xm xmVar, C4702po poVar, C4674on onVar, zzzy zzzy, C4434g gVar) {
        this.f9340e = xmVar;
        this.f9336a = poVar;
        this.f9337b = onVar;
        this.f9338c = zzzy;
        this.f9339d = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo26081a(Object obj) {
        List P = ((zzzp) obj).mo33472P();
        if (P == null || P.isEmpty()) {
            this.f9336a.mo26082c("No users");
        } else {
            C4909xm.m13520m(this.f9340e, this.f9337b, this.f9338c, (zzzr) P.get(0), this.f9339d, this.f9336a);
        }
    }

    /* renamed from: c */
    public final void mo26082c(@Nullable String str) {
        this.f9336a.mo26082c(str);
    }
}
