package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.List;

/* renamed from: c.q.a.c.g.i.n5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5186n5 extends C5279t8 implements C5310v9 {
    public static final C5186n5 zza;
    public int zzd;
    public int zze;
    public C5354y8 zzf = C5279t8.m14958n();
    public String zzg = "";
    public String zzh = "";
    public boolean zzi;
    public double zzj;

    static {
        C5186n5 n5Var = new C5186n5();
        zza = n5Var;
        C5279t8.m14962u(C5186n5.class, n5Var);
    }

    /* renamed from: C */
    public final Object mo26916C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C5279t8.m14961r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", C5156l5.f9986a, "zzf", C5186n5.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C5186n5();
        } else {
            if (i2 == 4) {
                return new C5140k5((C5028d5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final double mo27449D() {
        return this.zzj;
    }

    /* renamed from: F */
    public final String mo27450F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final String mo27451G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final List mo27452H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final boolean mo27453I() {
        return this.zzi;
    }

    /* renamed from: J */
    public final boolean mo27454J() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: K */
    public final boolean mo27455K() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: L */
    public final boolean mo27456L() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: M */
    public final int mo27457M() {
        int a = C5171m5.m14488a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
