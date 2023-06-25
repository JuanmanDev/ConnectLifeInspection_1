package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;

/* renamed from: c.q.a.c.g.g.se */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4771se extends C4544k1 implements C4599m2 {
    public static final C4771se zzb;
    public C4849ve zzd;
    public int zze;

    static {
        C4771se seVar = new C4771se();
        zzb = seVar;
        C4544k1.m12255l(C4771se.class, seVar);
    }

    /* renamed from: F */
    public static C4745re m13065F() {
        return (C4745re) zzb.mo26163x();
    }

    /* renamed from: H */
    public static C4771se m13067H(zzacc zzacc, C4913y0 y0Var) {
        return (C4771se) C4544k1.m12249B(zzb, zzacc, y0Var);
    }

    /* renamed from: J */
    public static /* synthetic */ void m13068J(C4771se seVar, C4849ve veVar) {
        veVar.getClass();
        seVar.zzd = veVar;
    }

    /* renamed from: E */
    public final int mo26644E() {
        return this.zze;
    }

    /* renamed from: I */
    public final C4849ve mo26645I() {
        C4849ve veVar = this.zzd;
        return veVar == null ? C4849ve.m13327H() : veVar;
    }

    /* renamed from: v */
    public final Object mo25825v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4544k1.m12254f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new C4771se();
        } else {
            if (i2 == 4) {
                return new C4745re((C4719qe) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
