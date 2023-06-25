package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zznr;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.jc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4528jc extends C4364da {
    public C4528jc() {
        super(C4877wg.class, new C4474hc(C4494i5.class));
    }

    /* renamed from: l */
    public static final void m12212l(C4877wg wgVar) {
        C4751rk.m13024c(wgVar.mo26802E(), 0);
        if (wgVar.mo26804K().zzd() >= 16) {
            m12214n(wgVar.mo26803J());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ C4310ba m12213m(int i, int i2, int i3, int i4) {
        C4929yg F = C4955zg.m13727F();
        C4317bh F2 = C4344ch.m11781F();
        F2.mo25828m(i3);
        F2.mo25827l(i2);
        F.mo26862m((C4344ch) F2.mo26052e());
        F.mo26861l(i);
        return new C4310ba((C4955zg) F.mo26052e(), i4);
    }

    /* renamed from: n */
    public static void m12214n(C4344ch chVar) {
        if (chVar.mo25856E() >= 10) {
            int J = chVar.mo25857J() - 2;
            if (J != 1) {
                if (J != 2) {
                    if (J != 3) {
                        if (J != 4) {
                            if (J != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (chVar.mo25856E() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (chVar.mo25856E() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (chVar.mo25856E() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (chVar.mo25856E() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (chVar.mo25856E() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* renamed from: a */
    public final C4337ca mo25847a() {
        return new C4501ic(this, C4955zg.class);
    }

    /* renamed from: b */
    public final zznr mo25848b() {
        return zznr.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C4572l2 mo25849c(zzacc zzacc) {
        return C4877wg.m13418I(zzacc, C4913y0.m13537a());
    }

    /* renamed from: d */
    public final String mo25850d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo25851e(C4572l2 l2Var) {
        m12212l((C4877wg) l2Var);
    }

    /* renamed from: f */
    public final int mo25891f() {
        return 2;
    }
}
