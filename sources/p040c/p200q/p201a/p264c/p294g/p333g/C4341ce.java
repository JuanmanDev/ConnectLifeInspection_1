package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;

/* renamed from: c.q.a.c.g.g.ce */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4341ce extends C4544k1 implements C4599m2 {
    public static final C4341ce zzb;
    public C4530je zzd;
    public C4955zg zze;

    static {
        C4341ce ceVar = new C4341ce();
        zzb = ceVar;
        C4544k1.m12255l(C4341ce.class, ceVar);
    }

    /* renamed from: E */
    public static C4314be m11773E() {
        return (C4314be) zzb.mo26163x();
    }

    /* renamed from: G */
    public static C4341ce m11775G(zzacc zzacc, C4913y0 y0Var) {
        return (C4341ce) C4544k1.m12249B(zzb, zzacc, y0Var);
    }

    /* renamed from: J */
    public static /* synthetic */ void m11776J(C4341ce ceVar, C4530je jeVar) {
        jeVar.getClass();
        ceVar.zzd = jeVar;
    }

    /* renamed from: K */
    public static /* synthetic */ void m11777K(C4341ce ceVar, C4955zg zgVar) {
        zgVar.getClass();
        ceVar.zze = zgVar;
    }

    /* renamed from: H */
    public final C4530je mo25854H() {
        C4530je jeVar = this.zzd;
        return jeVar == null ? C4530je.m12223H() : jeVar;
    }

    /* renamed from: I */
    public final C4955zg mo25855I() {
        C4955zg zgVar = this.zze;
        return zgVar == null ? C4955zg.m13729H() : zgVar;
    }

    /* renamed from: v */
    public final Object mo25825v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4544k1.m12254f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new C4341ce();
        } else {
            if (i2 == 4) {
                return new C4314be((C4287ae) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
