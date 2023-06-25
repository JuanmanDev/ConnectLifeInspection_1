package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.i3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5106i3 extends C5279t8 implements C5310v9 {
    public static final C5106i3 zza;
    public int zzd;
    public int zze;
    public String zzf = "";
    public C5010c3 zzg;
    public boolean zzh;
    public boolean zzi;
    public boolean zzj;

    static {
        C5106i3 i3Var = new C5106i3();
        zza = i3Var;
        C5279t8.m14962u(C5106i3.class, i3Var);
    }

    /* renamed from: F */
    public static C5090h3 m14291F() {
        return (C5090h3) zza.mo27726y();
    }

    /* renamed from: I */
    public static /* synthetic */ void m14293I(C5106i3 i3Var, String str) {
        i3Var.zzd |= 2;
        i3Var.zzf = str;
    }

    /* renamed from: C */
    public final Object mo26916C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C5279t8.m14961r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C5106i3();
        } else {
            if (i2 == 4) {
                return new C5090h3((C5318w2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final int mo27314D() {
        return this.zze;
    }

    /* renamed from: E */
    public final C5010c3 mo27315E() {
        C5010c3 c3Var = this.zzg;
        return c3Var == null ? C5010c3.m13875E() : c3Var;
    }

    /* renamed from: H */
    public final String mo27316H() {
        return this.zzf;
    }

    /* renamed from: J */
    public final boolean mo27317J() {
        return this.zzh;
    }

    /* renamed from: K */
    public final boolean mo27318K() {
        return this.zzi;
    }

    /* renamed from: L */
    public final boolean mo27319L() {
        return this.zzj;
    }

    /* renamed from: M */
    public final boolean mo27320M() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: N */
    public final boolean mo27321N() {
        return (this.zzd & 32) != 0;
    }
}
