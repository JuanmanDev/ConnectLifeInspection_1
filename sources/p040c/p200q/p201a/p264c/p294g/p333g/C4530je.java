package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;

/* renamed from: c.q.a.c.g.g.je */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4530je extends C4544k1 implements C4599m2 {
    public static final C4530je zzb;
    public C4611me zzd;
    public int zze;

    static {
        C4530je jeVar = new C4530je();
        zzb = jeVar;
        C4544k1.m12255l(C4530je.class, jeVar);
    }

    /* renamed from: F */
    public static C4503ie m12221F() {
        return (C4503ie) zzb.mo26163x();
    }

    /* renamed from: H */
    public static C4530je m12223H() {
        return zzb;
    }

    /* renamed from: I */
    public static C4530je m12224I(zzacc zzacc, C4913y0 y0Var) {
        return (C4530je) C4544k1.m12249B(zzb, zzacc, y0Var);
    }

    /* renamed from: K */
    public static /* synthetic */ void m12225K(C4530je jeVar, C4611me meVar) {
        meVar.getClass();
        jeVar.zzd = meVar;
    }

    /* renamed from: E */
    public final int mo26135E() {
        return this.zze;
    }

    /* renamed from: J */
    public final C4611me mo26136J() {
        C4611me meVar = this.zzd;
        return meVar == null ? C4611me.m12485H() : meVar;
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
            return new C4530je();
        } else {
            if (i2 == 4) {
                return new C4503ie((C4476he) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
