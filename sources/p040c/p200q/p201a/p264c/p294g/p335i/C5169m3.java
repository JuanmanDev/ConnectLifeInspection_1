package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.List;

/* renamed from: c.q.a.c.g.i.m3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5169m3 extends C5279t8 implements C5310v9 {
    public static final C5169m3 zza;
    public int zzd;
    public int zze;
    public String zzf = "";
    public boolean zzg;
    public C5354y8 zzh = C5279t8.m14958n();

    static {
        C5169m3 m3Var = new C5169m3();
        zza = m3Var;
        C5279t8.m14962u(C5169m3.class, m3Var);
    }

    /* renamed from: F */
    public static C5169m3 m14452F() {
        return zza;
    }

    /* renamed from: C */
    public final Object mo26916C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C5279t8.m14961r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", C5138k3.f9976a, "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C5169m3();
        } else {
            if (i2 == 4) {
                return new C5122j3((C5318w2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final int mo27406D() {
        return this.zzh.size();
    }

    /* renamed from: G */
    public final String mo27407G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final List mo27408H() {
        return this.zzh;
    }

    /* renamed from: I */
    public final boolean mo27409I() {
        return this.zzg;
    }

    /* renamed from: J */
    public final boolean mo27410J() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: K */
    public final boolean mo27411K() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: L */
    public final boolean mo27412L() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: M */
    public final int mo27413M() {
        int a = C5154l3.m14424a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
