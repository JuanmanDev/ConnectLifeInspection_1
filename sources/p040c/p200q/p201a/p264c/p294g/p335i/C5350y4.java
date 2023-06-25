package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.List;

/* renamed from: c.q.a.c.g.i.y4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5350y4 extends C5279t8 implements C5310v9 {
    public static final C5350y4 zza;
    public C5339x8 zzd = C5279t8.m14956l();
    public C5339x8 zze = C5279t8.m14956l();
    public C5354y8 zzf = C5279t8.m14958n();
    public C5354y8 zzg = C5279t8.m14958n();

    static {
        C5350y4 y4Var = new C5350y4();
        zza = y4Var;
        C5279t8.m14962u(C5350y4.class, y4Var);
    }

    /* renamed from: I */
    public static C5335x4 m15336I() {
        return (C5335x4) zza.mo27726y();
    }

    /* renamed from: K */
    public static C5350y4 m15338K() {
        return zza;
    }

    /* renamed from: R */
    public static /* synthetic */ void m15339R(C5350y4 y4Var, Iterable iterable) {
        C5339x8 x8Var = y4Var.zzd;
        if (!x8Var.mo27230b()) {
            y4Var.zzd = C5279t8.m14957m(x8Var);
        }
        C5046e7.m14014g(iterable, y4Var.zzd);
    }

    /* renamed from: T */
    public static /* synthetic */ void m15341T(C5350y4 y4Var, Iterable iterable) {
        C5339x8 x8Var = y4Var.zze;
        if (!x8Var.mo27230b()) {
            y4Var.zze = C5279t8.m14957m(x8Var);
        }
        C5046e7.m14014g(iterable, y4Var.zze);
    }

    /* renamed from: V */
    public static /* synthetic */ void m15343V(C5350y4 y4Var, Iterable iterable) {
        y4Var.mo27960b0();
        C5046e7.m14014g(iterable, y4Var.zzf);
    }

    /* renamed from: X */
    public static /* synthetic */ void m15345X(C5350y4 y4Var, int i) {
        y4Var.mo27960b0();
        y4Var.zzf.remove(i);
    }

    /* renamed from: Y */
    public static /* synthetic */ void m15346Y(C5350y4 y4Var, Iterable iterable) {
        y4Var.mo27961c0();
        C5046e7.m14014g(iterable, y4Var.zzg);
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m15348a0(C5350y4 y4Var, int i) {
        y4Var.mo27961c0();
        y4Var.zzg.remove(i);
    }

    /* renamed from: C */
    public final Object mo26916C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C5279t8.m14961r(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", C5075g4.class, "zzg", C4980a5.class});
        } else if (i2 == 3) {
            return new C5350y4();
        } else {
            if (i2 == 4) {
                return new C5335x4((C5364z3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final int mo27950D() {
        return this.zzf.size();
    }

    /* renamed from: E */
    public final int mo27951E() {
        return this.zze.size();
    }

    /* renamed from: F */
    public final int mo27952F() {
        return this.zzg.size();
    }

    /* renamed from: G */
    public final int mo27953G() {
        return this.zzd.size();
    }

    /* renamed from: H */
    public final C5075g4 mo27954H(int i) {
        return (C5075g4) this.zzf.get(i);
    }

    /* renamed from: L */
    public final C4980a5 mo27955L(int i) {
        return (C4980a5) this.zzg.get(i);
    }

    /* renamed from: M */
    public final List mo27956M() {
        return this.zzf;
    }

    /* renamed from: N */
    public final List mo27957N() {
        return this.zze;
    }

    /* renamed from: P */
    public final List mo27958P() {
        return this.zzg;
    }

    /* renamed from: Q */
    public final List mo27959Q() {
        return this.zzd;
    }

    /* renamed from: b0 */
    public final void mo27960b0() {
        C5354y8 y8Var = this.zzf;
        if (!y8Var.mo27230b()) {
            this.zzf = C5279t8.m14959p(y8Var);
        }
    }

    /* renamed from: c0 */
    public final void mo27961c0() {
        C5354y8 y8Var = this.zzg;
        if (!y8Var.mo27230b()) {
            this.zzg = C5279t8.m14959p(y8Var);
        }
    }
}
