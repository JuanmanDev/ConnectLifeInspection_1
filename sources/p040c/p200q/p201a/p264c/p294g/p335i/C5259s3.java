package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.s3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5259s3 extends C5279t8 implements C5310v9 {
    public static final C5259s3 zza;
    public int zzd;
    public String zze = "";
    public boolean zzf;
    public boolean zzg;
    public int zzh;

    static {
        C5259s3 s3Var = new C5259s3();
        zza = s3Var;
        C5279t8.m14962u(C5259s3.class, s3Var);
    }

    /* renamed from: G */
    public static /* synthetic */ void m14728G(C5259s3 s3Var, String str) {
        str.getClass();
        s3Var.zzd |= 1;
        s3Var.zze = str;
    }

    /* renamed from: C */
    public final Object mo26916C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C5279t8.m14961r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C5259s3();
        } else {
            if (i2 == 4) {
                return new C5244r3((C5184n3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final int mo27553D() {
        return this.zzh;
    }

    /* renamed from: F */
    public final String mo27554F() {
        return this.zze;
    }

    /* renamed from: H */
    public final boolean mo27555H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final boolean mo27556I() {
        return this.zzg;
    }

    /* renamed from: J */
    public final boolean mo27557J() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: K */
    public final boolean mo27558K() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: L */
    public final boolean mo27559L() {
        return (this.zzd & 8) != 0;
    }
}
