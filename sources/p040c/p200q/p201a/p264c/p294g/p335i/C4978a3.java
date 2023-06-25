package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.List;

/* renamed from: c.q.a.c.g.i.a3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C4978a3 extends C5279t8 implements C5310v9 {
    public static final C4978a3 zza;
    public int zzd;
    public int zze;
    public String zzf = "";
    public C5354y8 zzg = C5279t8.m14958n();
    public boolean zzh;
    public C5074g3 zzi;
    public boolean zzj;
    public boolean zzk;
    public boolean zzl;

    static {
        C4978a3 a3Var = new C4978a3();
        zza = a3Var;
        C5279t8.m14962u(C4978a3.class, a3Var);
    }

    /* renamed from: F */
    public static C5363z2 m13751F() {
        return (C5363z2) zza.mo27726y();
    }

    /* renamed from: L */
    public static /* synthetic */ void m13753L(C4978a3 a3Var, String str) {
        a3Var.zzd |= 2;
        a3Var.zzf = str;
    }

    /* renamed from: M */
    public static /* synthetic */ void m13754M(C4978a3 a3Var, int i, C5010c3 c3Var) {
        c3Var.getClass();
        C5354y8 y8Var = a3Var.zzg;
        if (!y8Var.mo27230b()) {
            a3Var.zzg = C5279t8.m14959p(y8Var);
        }
        a3Var.zzg.set(i, c3Var);
    }

    /* renamed from: C */
    public final Object mo26916C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C5279t8.m14961r(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", C5010c3.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C4978a3();
        } else {
            if (i2 == 4) {
                return new C5363z2((C5318w2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final int mo26917D() {
        return this.zzg.size();
    }

    /* renamed from: E */
    public final int mo26918E() {
        return this.zze;
    }

    /* renamed from: H */
    public final C5010c3 mo26919H(int i) {
        return (C5010c3) this.zzg.get(i);
    }

    /* renamed from: I */
    public final C5074g3 mo26920I() {
        C5074g3 g3Var = this.zzi;
        return g3Var == null ? C5074g3.m14112E() : g3Var;
    }

    /* renamed from: J */
    public final String mo26921J() {
        return this.zzf;
    }

    /* renamed from: K */
    public final List mo26922K() {
        return this.zzg;
    }

    /* renamed from: N */
    public final boolean mo26923N() {
        return this.zzj;
    }

    /* renamed from: P */
    public final boolean mo26924P() {
        return this.zzk;
    }

    /* renamed from: Q */
    public final boolean mo26925Q() {
        return this.zzl;
    }

    /* renamed from: R */
    public final boolean mo26926R() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: S */
    public final boolean mo26927S() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: T */
    public final boolean mo26928T() {
        return (this.zzd & 64) != 0;
    }
}
