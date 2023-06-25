package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.e4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5043e4 extends C5279t8 implements C5310v9 {
    public static final C5043e4 zza;
    public int zzd;
    public int zze;
    public C5350y4 zzf;
    public C5350y4 zzg;
    public boolean zzh;

    static {
        C5043e4 e4Var = new C5043e4();
        zza = e4Var;
        C5279t8.m14962u(C5043e4.class, e4Var);
    }

    /* renamed from: E */
    public static C5027d4 m13999E() {
        return (C5027d4) zza.mo27726y();
    }

    /* renamed from: I */
    public static /* synthetic */ void m14001I(C5043e4 e4Var, int i) {
        e4Var.zzd |= 1;
        e4Var.zze = i;
    }

    /* renamed from: J */
    public static /* synthetic */ void m14002J(C5043e4 e4Var, C5350y4 y4Var) {
        y4Var.getClass();
        e4Var.zzf = y4Var;
        e4Var.zzd |= 2;
    }

    /* renamed from: K */
    public static /* synthetic */ void m14003K(C5043e4 e4Var, C5350y4 y4Var) {
        e4Var.zzg = y4Var;
        e4Var.zzd |= 4;
    }

    /* renamed from: L */
    public static /* synthetic */ void m14004L(C5043e4 e4Var, boolean z) {
        e4Var.zzd |= 8;
        e4Var.zzh = z;
    }

    /* renamed from: C */
    public final Object mo26916C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C5279t8.m14961r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C5043e4();
        } else {
            if (i2 == 4) {
                return new C5027d4((C5364z3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final int mo27181D() {
        return this.zze;
    }

    /* renamed from: G */
    public final C5350y4 mo27182G() {
        C5350y4 y4Var = this.zzf;
        return y4Var == null ? C5350y4.m15338K() : y4Var;
    }

    /* renamed from: H */
    public final C5350y4 mo27183H() {
        C5350y4 y4Var = this.zzg;
        return y4Var == null ? C5350y4.m15338K() : y4Var;
    }

    /* renamed from: M */
    public final boolean mo27184M() {
        return this.zzh;
    }

    /* renamed from: N */
    public final boolean mo27185N() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: P */
    public final boolean mo27186P() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: Q */
    public final boolean mo27187Q() {
        return (this.zzd & 4) != 0;
    }
}
