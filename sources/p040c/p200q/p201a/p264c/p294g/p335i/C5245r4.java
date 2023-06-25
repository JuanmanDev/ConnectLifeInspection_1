package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.List;

/* renamed from: c.q.a.c.g.i.r4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5245r4 extends C5279t8 implements C5310v9 {
    public static final C5245r4 zza;
    public C5354y8 zzd = C5279t8.m14958n();

    static {
        C5245r4 r4Var = new C5245r4();
        zza = r4Var;
        C5279t8.m14962u(C5245r4.class, r4Var);
    }

    /* renamed from: D */
    public static C5230q4 m14711D() {
        return (C5230q4) zza.mo27726y();
    }

    /* renamed from: H */
    public static /* synthetic */ void m14713H(C5245r4 r4Var, C5275t4 t4Var) {
        t4Var.getClass();
        C5354y8 y8Var = r4Var.zzd;
        if (!y8Var.mo27230b()) {
            r4Var.zzd = C5279t8.m14959p(y8Var);
        }
        r4Var.zzd.add(t4Var);
    }

    /* renamed from: C */
    public final Object mo26916C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C5279t8.m14961r(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C5275t4.class});
        } else if (i2 == 3) {
            return new C5245r4();
        } else {
            if (i2 == 4) {
                return new C5230q4((C5364z3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: F */
    public final C5275t4 mo27540F(int i) {
        return (C5275t4) this.zzd.get(0);
    }

    /* renamed from: G */
    public final List mo27541G() {
        return this.zzd;
    }
}
