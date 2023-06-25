package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;

/* renamed from: c.q.a.c.g.g.zd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4952zd extends C4544k1 implements C4599m2 {
    public static final C4952zd zzb;
    public int zzd;
    public C4449ge zze;
    public C4877wg zzf;

    static {
        C4952zd zdVar = new C4952zd();
        zzb = zdVar;
        C4544k1.m12255l(C4952zd.class, zdVar);
    }

    /* renamed from: F */
    public static C4926yd m13717F() {
        return (C4926yd) zzb.mo26163x();
    }

    /* renamed from: H */
    public static C4952zd m13719H(zzacc zzacc, C4913y0 y0Var) {
        return (C4952zd) C4544k1.m12249B(zzb, zzacc, y0Var);
    }

    /* renamed from: L */
    public static /* synthetic */ void m13721L(C4952zd zdVar, C4449ge geVar) {
        geVar.getClass();
        zdVar.zze = geVar;
    }

    /* renamed from: M */
    public static /* synthetic */ void m13722M(C4952zd zdVar, C4877wg wgVar) {
        wgVar.getClass();
        zdVar.zzf = wgVar;
    }

    /* renamed from: E */
    public final int mo26886E() {
        return this.zzd;
    }

    /* renamed from: I */
    public final C4449ge mo26887I() {
        C4449ge geVar = this.zze;
        return geVar == null ? C4449ge.m12046H() : geVar;
    }

    /* renamed from: J */
    public final C4877wg mo26888J() {
        C4877wg wgVar = this.zzf;
        return wgVar == null ? C4877wg.m13417H() : wgVar;
    }

    /* renamed from: v */
    public final Object mo25825v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4544k1.m12254f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C4952zd();
        } else {
            if (i2 == 4) {
                return new C4926yd((C4900xd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
