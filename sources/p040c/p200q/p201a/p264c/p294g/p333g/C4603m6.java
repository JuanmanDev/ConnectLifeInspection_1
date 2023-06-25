package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zznr;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.m6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4603m6 extends C4364da {
    public C4603m6() {
        super(C4692pe.class, new C4549k6(C4574l4.class));
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ C4310ba m12470k(int i, int i2, int i3) {
        C4745re F = C4771se.m13065F();
        F.mo26613l(i);
        C4823ue F2 = C4849ve.m13325F();
        F2.mo26730l(16);
        F.mo26614m((C4849ve) F2.mo26052e());
        return new C4310ba((C4771se) F.mo26052e(), i3);
    }

    /* renamed from: a */
    public final C4337ca mo25847a() {
        return new C4576l6(this, C4771se.class);
    }

    /* renamed from: b */
    public final zznr mo25848b() {
        return zznr.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C4572l2 mo25849c(zzacc zzacc) {
        return C4692pe.m12811H(zzacc, C4913y0.m13537a());
    }

    /* renamed from: d */
    public final String mo25850d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo25851e(C4572l2 l2Var) {
        C4692pe peVar = (C4692pe) l2Var;
        C4751rk.m13024c(peVar.mo26523E(), 0);
        C4751rk.m13023b(peVar.mo26525J().zzd());
        if (peVar.mo26524I().mo26778E() != 12 && peVar.mo26524I().mo26778E() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
