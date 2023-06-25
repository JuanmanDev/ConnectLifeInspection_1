package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.List;

/* renamed from: c.q.a.c.g.i.m4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5170m4 extends C5279t8 implements C5310v9 {
    public static final C5170m4 zza;
    public int zzd;
    public String zze = "";
    public String zzf = "";
    public long zzg;
    public float zzh;
    public double zzi;
    public C5354y8 zzj = C5279t8.m14958n();

    static {
        C5170m4 m4Var = new C5170m4();
        zza = m4Var;
        C5279t8.m14962u(C5170m4.class, m4Var);
    }

    /* renamed from: H */
    public static C5155l4 m14462H() {
        return (C5155l4) zza.mo27726y();
    }

    /* renamed from: M */
    public static /* synthetic */ void m14464M(C5170m4 m4Var, String str) {
        str.getClass();
        m4Var.zzd |= 1;
        m4Var.zze = str;
    }

    /* renamed from: N */
    public static /* synthetic */ void m14465N(C5170m4 m4Var, String str) {
        str.getClass();
        m4Var.zzd |= 2;
        m4Var.zzf = str;
    }

    /* renamed from: P */
    public static /* synthetic */ void m14466P(C5170m4 m4Var) {
        m4Var.zzd &= -3;
        m4Var.zzf = zza.zzf;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m14467Q(C5170m4 m4Var, long j) {
        m4Var.zzd |= 4;
        m4Var.zzg = j;
    }

    /* renamed from: R */
    public static /* synthetic */ void m14468R(C5170m4 m4Var) {
        m4Var.zzd &= -5;
        m4Var.zzg = 0;
    }

    /* renamed from: S */
    public static /* synthetic */ void m14469S(C5170m4 m4Var, double d) {
        m4Var.zzd |= 16;
        m4Var.zzi = d;
    }

    /* renamed from: T */
    public static /* synthetic */ void m14470T(C5170m4 m4Var) {
        m4Var.zzd &= -17;
        m4Var.zzi = 0.0d;
    }

    /* renamed from: U */
    public static /* synthetic */ void m14471U(C5170m4 m4Var, C5170m4 m4Var2) {
        m4Var2.getClass();
        m4Var.mo27426c0();
        m4Var.zzj.add(m4Var2);
    }

    /* renamed from: V */
    public static /* synthetic */ void m14472V(C5170m4 m4Var, Iterable iterable) {
        m4Var.mo27426c0();
        C5046e7.m14014g(iterable, m4Var.zzj);
    }

    /* renamed from: C */
    public final Object mo26916C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C5279t8.m14961r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", C5170m4.class});
        } else if (i2 == 3) {
            return new C5170m4();
        } else {
            if (i2 == 4) {
                return new C5155l4((C5364z3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final double mo27414D() {
        return this.zzi;
    }

    /* renamed from: E */
    public final float mo27415E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final int mo27416F() {
        return this.zzj.size();
    }

    /* renamed from: G */
    public final long mo27417G() {
        return this.zzg;
    }

    /* renamed from: J */
    public final String mo27418J() {
        return this.zze;
    }

    /* renamed from: K */
    public final String mo27419K() {
        return this.zzf;
    }

    /* renamed from: L */
    public final List mo27420L() {
        return this.zzj;
    }

    /* renamed from: X */
    public final boolean mo27421X() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: Y */
    public final boolean mo27422Y() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: Z */
    public final boolean mo27423Z() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: a0 */
    public final boolean mo27424a0() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: b0 */
    public final boolean mo27425b0() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: c0 */
    public final void mo27426c0() {
        C5354y8 y8Var = this.zzj;
        if (!y8Var.mo27230b()) {
            this.zzj = C5279t8.m14959p(y8Var);
        }
    }
}
