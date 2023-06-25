package p040c.p200q.p201a.p264c.p294g.p333g;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p527firebaseauthapi.zzaae;
import com.google.android.gms.internal.p527firebaseauthapi.zzaag;
import com.google.android.gms.internal.p527firebaseauthapi.zzzp;
import com.google.android.gms.internal.p527firebaseauthapi.zzzr;
import com.google.android.gms.internal.p527firebaseauthapi.zzzy;
import com.google.firebase.auth.zze;
import java.util.List;

/* renamed from: c.q.a.c.g.g.mm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4619mm implements C4729qo {

    /* renamed from: a */
    public final /* synthetic */ C4702po f9443a;

    /* renamed from: b */
    public final /* synthetic */ String f9444b;

    /* renamed from: c */
    public final /* synthetic */ String f9445c;

    /* renamed from: d */
    public final /* synthetic */ Boolean f9446d;

    /* renamed from: e */
    public final /* synthetic */ zze f9447e;

    /* renamed from: f */
    public final /* synthetic */ C4674on f9448f;

    /* renamed from: g */
    public final /* synthetic */ zzzy f9449g;

    public C4619mm(C4909xm xmVar, C4702po poVar, String str, String str2, Boolean bool, zze zze, C4674on onVar, zzzy zzzy) {
        this.f9443a = poVar;
        this.f9444b = str;
        this.f9445c = str2;
        this.f9446d = bool;
        this.f9447e = zze;
        this.f9448f = onVar;
        this.f9449g = zzzy;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo26081a(Object obj) {
        List P = ((zzzp) obj).mo33472P();
        if (P == null || P.isEmpty()) {
            this.f9443a.mo26082c("No users.");
            return;
        }
        int i = 0;
        zzzr zzzr = (zzzr) P.get(0);
        zzaag a0 = zzzr.mo33485a0();
        List R = a0 != null ? a0.mo33354R() : null;
        if (R != null && !R.isEmpty()) {
            if (!TextUtils.isEmpty(this.f9444b)) {
                while (true) {
                    if (i >= R.size()) {
                        break;
                    } else if (((zzaae) R.get(i)).mo33350U().equals(this.f9444b)) {
                        ((zzaae) R.get(i)).mo33352W(this.f9445c);
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                ((zzaae) R.get(0)).mo33352W(this.f9445c);
            }
        }
        zzzr.mo33481W(this.f9446d.booleanValue());
        zzzr.mo33478T(this.f9447e);
        this.f9448f.mo26484e(this.f9449g, zzzr);
    }

    /* renamed from: c */
    public final void mo26082c(@Nullable String str) {
        this.f9443a.mo26082c(str);
    }
}
