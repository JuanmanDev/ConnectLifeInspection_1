package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.c3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5010c3 extends C5279t8 implements C5310v9 {
    public static final C5010c3 zza;
    public int zzd;
    public C5169m3 zze;
    public C5074g3 zzf;
    public boolean zzg;
    public String zzh = "";

    static {
        C5010c3 c3Var = new C5010c3();
        zza = c3Var;
        C5279t8.m14962u(C5010c3.class, c3Var);
    }

    /* renamed from: E */
    public static C5010c3 m13875E() {
        return zza;
    }

    /* renamed from: I */
    public static /* synthetic */ void m13876I(C5010c3 c3Var, String str) {
        c3Var.zzd |= 8;
        c3Var.zzh = str;
    }

    /* renamed from: C */
    public final Object mo26916C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C5279t8.m14961r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C5010c3();
        } else {
            if (i2 == 4) {
                return new C4994b3((C5318w2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: F */
    public final C5074g3 mo27079F() {
        C5074g3 g3Var = this.zzf;
        return g3Var == null ? C5074g3.m14112E() : g3Var;
    }

    /* renamed from: G */
    public final C5169m3 mo27080G() {
        C5169m3 m3Var = this.zze;
        return m3Var == null ? C5169m3.m14452F() : m3Var;
    }

    /* renamed from: H */
    public final String mo27081H() {
        return this.zzh;
    }

    /* renamed from: J */
    public final boolean mo27082J() {
        return this.zzg;
    }

    /* renamed from: K */
    public final boolean mo27083K() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: L */
    public final boolean mo27084L() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: M */
    public final boolean mo27085M() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: N */
    public final boolean mo27086N() {
        return (this.zzd & 1) != 0;
    }
}
