package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.g3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5074g3 extends C5279t8 implements C5310v9 {
    public static final C5074g3 zza;
    public int zzd;
    public int zze;
    public boolean zzf;
    public String zzg = "";
    public String zzh = "";
    public String zzi = "";

    static {
        C5074g3 g3Var = new C5074g3();
        zza = g3Var;
        C5279t8.m14962u(C5074g3.class, g3Var);
    }

    /* renamed from: E */
    public static C5074g3 m14112E() {
        return zza;
    }

    /* renamed from: C */
    public final Object mo26916C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C5279t8.m14961r(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", C5042e3.f9874a, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C5074g3();
        } else {
            if (i2 == 4) {
                return new C5026d3((C5318w2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: F */
    public final String mo27259F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final String mo27260G() {
        return this.zzi;
    }

    /* renamed from: H */
    public final String mo27261H() {
        return this.zzh;
    }

    /* renamed from: I */
    public final boolean mo27262I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final boolean mo27263J() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: K */
    public final boolean mo27264K() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: L */
    public final boolean mo27265L() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: M */
    public final boolean mo27266M() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: N */
    public final boolean mo27267N() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: P */
    public final int mo27268P() {
        int a = C5058f3.m14057a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
