package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.List;

/* renamed from: c.q.a.c.g.i.a5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C4980a5 extends C5279t8 implements C5310v9 {
    public static final C4980a5 zza;
    public int zzd;
    public int zze;
    public C5339x8 zzf = C5279t8.m14956l();

    static {
        C4980a5 a5Var = new C4980a5();
        zza = a5Var;
        C5279t8.m14962u(C4980a5.class, a5Var);
    }

    /* renamed from: G */
    public static C5365z4 m13769G() {
        return (C5365z4) zza.mo27726y();
    }

    /* renamed from: J */
    public static /* synthetic */ void m13771J(C4980a5 a5Var, int i) {
        a5Var.zzd |= 1;
        a5Var.zze = i;
    }

    /* renamed from: K */
    public static /* synthetic */ void m13772K(C4980a5 a5Var, Iterable iterable) {
        C5339x8 x8Var = a5Var.zzf;
        if (!x8Var.mo27230b()) {
            a5Var.zzf = C5279t8.m14957m(x8Var);
        }
        C5046e7.m14014g(iterable, a5Var.zzf);
    }

    /* renamed from: C */
    public final Object mo26916C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C5279t8.m14961r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C4980a5();
        } else {
            if (i2 == 4) {
                return new C5365z4((C5364z3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final int mo26930D() {
        return this.zzf.size();
    }

    /* renamed from: E */
    public final int mo26931E() {
        return this.zze;
    }

    /* renamed from: F */
    public final long mo26932F(int i) {
        return this.zzf.mo27365h(i);
    }

    /* renamed from: I */
    public final List mo26933I() {
        return this.zzf;
    }

    /* renamed from: L */
    public final boolean mo26934L() {
        return (this.zzd & 1) != 0;
    }
}
