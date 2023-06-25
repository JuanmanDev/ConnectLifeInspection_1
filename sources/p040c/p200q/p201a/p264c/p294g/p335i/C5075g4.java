package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.g4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5075g4 extends C5279t8 implements C5310v9 {
    public static final C5075g4 zza;
    public int zzd;
    public int zze;
    public long zzf;

    static {
        C5075g4 g4Var = new C5075g4();
        zza = g4Var;
        C5279t8.m14962u(C5075g4.class, g4Var);
    }

    /* renamed from: F */
    public static C5059f4 m14124F() {
        return (C5059f4) zza.mo27726y();
    }

    /* renamed from: H */
    public static /* synthetic */ void m14126H(C5075g4 g4Var, int i) {
        g4Var.zzd |= 1;
        g4Var.zze = i;
    }

    /* renamed from: I */
    public static /* synthetic */ void m14127I(C5075g4 g4Var, long j) {
        g4Var.zzd |= 2;
        g4Var.zzf = j;
    }

    /* renamed from: C */
    public final Object mo26916C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C5279t8.m14961r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C5075g4();
        } else {
            if (i2 == 4) {
                return new C5059f4((C5364z3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final int mo27269D() {
        return this.zze;
    }

    /* renamed from: E */
    public final long mo27270E() {
        return this.zzf;
    }

    /* renamed from: J */
    public final boolean mo27271J() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: K */
    public final boolean mo27272K() {
        return (this.zzd & 1) != 0;
    }
}
