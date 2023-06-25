package p040c.p200q.p201a.p264c.p294g.p333g;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.p527firebaseauthapi.zztm;
import com.google.android.gms.internal.p527firebaseauthapi.zzzy;
import com.google.firebase.auth.zze;
import p040c.p200q.p363c.p367l.p368h.C6381g;

/* renamed from: c.q.a.c.g.g.jm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4538jm implements C4729qo {

    /* renamed from: a */
    public final /* synthetic */ C4674on f9317a;

    /* renamed from: b */
    public final /* synthetic */ C4909xm f9318b;

    public C4538jm(C4909xm xmVar, C4674on onVar) {
        this.f9318b = xmVar;
        this.f9317a = onVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo26081a(Object obj) {
        C4514ip ipVar = (C4514ip) obj;
        if (ipVar.mo26122g()) {
            this.f9317a.mo26481b(new zztm(ipVar.mo26119d(), ipVar.mo26121f(), (zze) null));
            return;
        }
        this.f9318b.mo26839g(new zzzy(ipVar.mo26120e(), ipVar.mo26118b(), Long.valueOf(ipVar.mo26117a()), "Bearer"), (String) null, (String) null, Boolean.valueOf(ipVar.mo26123h()), (zze) null, this.f9317a, this);
    }

    /* renamed from: c */
    public final void mo26082c(@Nullable String str) {
        this.f9317a.mo26483d(C6381g.m17909a(str));
    }
}
