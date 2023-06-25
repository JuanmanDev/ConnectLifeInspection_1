package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.c5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5012c5 extends C5279t8 implements C5310v9 {
    public static final C5012c5 zza;
    public int zzd;
    public long zze;
    public String zzf = "";
    public String zzg = "";
    public long zzh;
    public float zzi;
    public double zzj;

    static {
        C5012c5 c5Var = new C5012c5();
        zza = c5Var;
        C5279t8.m14962u(C5012c5.class, c5Var);
    }

    /* renamed from: G */
    public static C4996b5 m13888G() {
        return (C4996b5) zza.mo27726y();
    }

    /* renamed from: K */
    public static /* synthetic */ void m13890K(C5012c5 c5Var, long j) {
        c5Var.zzd |= 1;
        c5Var.zze = j;
    }

    /* renamed from: L */
    public static /* synthetic */ void m13891L(C5012c5 c5Var, String str) {
        str.getClass();
        c5Var.zzd |= 2;
        c5Var.zzf = str;
    }

    /* renamed from: M */
    public static /* synthetic */ void m13892M(C5012c5 c5Var, String str) {
        str.getClass();
        c5Var.zzd |= 4;
        c5Var.zzg = str;
    }

    /* renamed from: N */
    public static /* synthetic */ void m13893N(C5012c5 c5Var) {
        c5Var.zzd &= -5;
        c5Var.zzg = zza.zzg;
    }

    /* renamed from: P */
    public static /* synthetic */ void m13894P(C5012c5 c5Var, long j) {
        c5Var.zzd |= 8;
        c5Var.zzh = j;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m13895Q(C5012c5 c5Var) {
        c5Var.zzd &= -9;
        c5Var.zzh = 0;
    }

    /* renamed from: R */
    public static /* synthetic */ void m13896R(C5012c5 c5Var, double d) {
        c5Var.zzd |= 32;
        c5Var.zzj = d;
    }

    /* renamed from: S */
    public static /* synthetic */ void m13897S(C5012c5 c5Var) {
        c5Var.zzd &= -33;
        c5Var.zzj = 0.0d;
    }

    /* renamed from: C */
    public final Object mo26916C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C5279t8.m14961r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C5012c5();
        } else {
            if (i2 == 4) {
                return new C4996b5((C5364z3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final double mo27087D() {
        return this.zzj;
    }

    /* renamed from: E */
    public final long mo27088E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final long mo27089F() {
        return this.zze;
    }

    /* renamed from: I */
    public final String mo27090I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final String mo27091J() {
        return this.zzg;
    }

    /* renamed from: T */
    public final boolean mo27092T() {
        return (this.zzd & 32) != 0;
    }

    /* renamed from: U */
    public final boolean mo27093U() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: V */
    public final boolean mo27094V() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: W */
    public final boolean mo27095W() {
        return (this.zzd & 4) != 0;
    }
}
