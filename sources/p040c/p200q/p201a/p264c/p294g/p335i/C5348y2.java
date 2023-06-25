package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.List;

/* renamed from: c.q.a.c.g.i.y2 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5348y2 extends C5279t8 implements C5310v9 {
    public static final C5348y2 zza;
    public int zzd;
    public int zze;
    public C5354y8 zzf = C5279t8.m14958n();
    public C5354y8 zzg = C5279t8.m14958n();
    public boolean zzh;
    public boolean zzi;

    static {
        C5348y2 y2Var = new C5348y2();
        zza = y2Var;
        C5279t8.m14962u(C5348y2.class, y2Var);
    }

    /* renamed from: L */
    public static /* synthetic */ void m15321L(C5348y2 y2Var, int i, C5106i3 i3Var) {
        i3Var.getClass();
        C5354y8 y8Var = y2Var.zzf;
        if (!y8Var.mo27230b()) {
            y2Var.zzf = C5279t8.m14959p(y8Var);
        }
        y2Var.zzf.set(i, i3Var);
    }

    /* renamed from: M */
    public static /* synthetic */ void m15322M(C5348y2 y2Var, int i, C4978a3 a3Var) {
        a3Var.getClass();
        C5354y8 y8Var = y2Var.zzg;
        if (!y8Var.mo27230b()) {
            y2Var.zzg = C5279t8.m14959p(y8Var);
        }
        y2Var.zzg.set(i, a3Var);
    }

    /* renamed from: C */
    public final Object mo26916C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C5279t8.m14961r(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", C5106i3.class, "zzg", C4978a3.class, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C5348y2();
        } else {
            if (i2 == 4) {
                return new C5333x2((C5318w2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final int mo27940D() {
        return this.zze;
    }

    /* renamed from: E */
    public final int mo27941E() {
        return this.zzg.size();
    }

    /* renamed from: F */
    public final int mo27942F() {
        return this.zzf.size();
    }

    /* renamed from: H */
    public final C4978a3 mo27943H(int i) {
        return (C4978a3) this.zzg.get(i);
    }

    /* renamed from: I */
    public final C5106i3 mo27944I(int i) {
        return (C5106i3) this.zzf.get(i);
    }

    /* renamed from: J */
    public final List mo27945J() {
        return this.zzg;
    }

    /* renamed from: K */
    public final List mo27946K() {
        return this.zzf;
    }

    /* renamed from: N */
    public final boolean mo27947N() {
        return (this.zzd & 1) != 0;
    }
}
