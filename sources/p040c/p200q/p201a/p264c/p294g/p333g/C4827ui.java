package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;

/* renamed from: c.q.a.c.g.g.ui */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4827ui extends C4544k1 implements C4599m2 {
    public static final C4827ui zzb;
    public int zzd;
    public C4905xi zze;

    static {
        C4827ui uiVar = new C4827ui();
        zzb = uiVar;
        C4544k1.m12255l(C4827ui.class, uiVar);
    }

    /* renamed from: F */
    public static C4801ti m13247F() {
        return (C4801ti) zzb.mo26163x();
    }

    /* renamed from: H */
    public static C4827ui m13249H(zzacc zzacc, C4913y0 y0Var) {
        return (C4827ui) C4544k1.m12249B(zzb, zzacc, y0Var);
    }

    /* renamed from: K */
    public static /* synthetic */ void m13251K(C4827ui uiVar, C4905xi xiVar) {
        xiVar.getClass();
        uiVar.zze = xiVar;
    }

    /* renamed from: E */
    public final int mo26734E() {
        return this.zzd;
    }

    /* renamed from: I */
    public final C4905xi mo26735I() {
        C4905xi xiVar = this.zze;
        return xiVar == null ? C4905xi.m13495G() : xiVar;
    }

    /* renamed from: v */
    public final Object mo25825v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4544k1.m12254f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new C4827ui();
        } else {
            if (i2 == 4) {
                return new C4801ti((C4775si) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
