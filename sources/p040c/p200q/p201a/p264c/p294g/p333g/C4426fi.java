package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzoy;

/* renamed from: c.q.a.c.g.g.fi */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4426fi extends C4544k1 implements C4599m2 {
    public static final C4426fi zzb;
    public C4826uh zzd;
    public int zze;
    public int zzf;
    public int zzg;

    static {
        C4426fi fiVar = new C4426fi();
        zzb = fiVar;
        C4544k1.m12255l(C4426fi.class, fiVar);
    }

    /* renamed from: G */
    public static C4399ei m11976G() {
        return (C4399ei) zzb.mo26163x();
    }

    /* renamed from: J */
    public static /* synthetic */ void m11978J(C4426fi fiVar, C4826uh uhVar) {
        uhVar.getClass();
        fiVar.zzd = uhVar;
    }

    /* renamed from: E */
    public final int mo25990E() {
        return this.zzf;
    }

    /* renamed from: F */
    public final C4826uh mo25991F() {
        C4826uh uhVar = this.zzd;
        return uhVar == null ? C4826uh.m13239H() : uhVar;
    }

    /* renamed from: I */
    public final zzoy mo25992I() {
        zzoy zzb2 = zzoy.zzb(this.zzg);
        return zzb2 == null ? zzoy.UNRECOGNIZED : zzb2;
    }

    /* renamed from: M */
    public final boolean mo25993M() {
        return this.zzd != null;
    }

    /* renamed from: N */
    public final int mo25994N() {
        int i = this.zze;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* renamed from: v */
    public final Object mo25825v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4544k1.m12254f(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C4426fi();
        } else {
            if (i2 == 4) {
                return new C4399ei((C4345ci) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
