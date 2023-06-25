package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.List;

/* renamed from: c.q.a.c.g.i.i4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5107i4 extends C5279t8 implements C5310v9 {
    public static final C5107i4 zza;
    public int zzd;
    public C5354y8 zze = C5279t8.m14958n();
    public String zzf = "";
    public long zzg;
    public long zzh;
    public int zzi;

    static {
        C5107i4 i4Var = new C5107i4();
        zza = i4Var;
        C5279t8.m14962u(C5107i4.class, i4Var);
    }

    /* renamed from: H */
    public static C5091h4 m14303H() {
        return (C5091h4) zza.mo27726y();
    }

    /* renamed from: M */
    public static /* synthetic */ void m14305M(C5107i4 i4Var, int i, C5170m4 m4Var) {
        m4Var.getClass();
        i4Var.mo27332Y();
        i4Var.zze.set(i, m4Var);
    }

    /* renamed from: N */
    public static /* synthetic */ void m14306N(C5107i4 i4Var, C5170m4 m4Var) {
        m4Var.getClass();
        i4Var.mo27332Y();
        i4Var.zze.add(m4Var);
    }

    /* renamed from: P */
    public static /* synthetic */ void m14307P(C5107i4 i4Var, Iterable iterable) {
        i4Var.mo27332Y();
        C5046e7.m14014g(iterable, i4Var.zze);
    }

    /* renamed from: R */
    public static /* synthetic */ void m14309R(C5107i4 i4Var, int i) {
        i4Var.mo27332Y();
        i4Var.zze.remove(i);
    }

    /* renamed from: S */
    public static /* synthetic */ void m14310S(C5107i4 i4Var, String str) {
        str.getClass();
        i4Var.zzd |= 1;
        i4Var.zzf = str;
    }

    /* renamed from: T */
    public static /* synthetic */ void m14311T(C5107i4 i4Var, long j) {
        i4Var.zzd |= 2;
        i4Var.zzg = j;
    }

    /* renamed from: U */
    public static /* synthetic */ void m14312U(C5107i4 i4Var, long j) {
        i4Var.zzd |= 4;
        i4Var.zzh = j;
    }

    /* renamed from: C */
    public final Object mo26916C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C5279t8.m14961r(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", C5170m4.class, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C5107i4();
        } else {
            if (i2 == 4) {
                return new C5091h4((C5364z3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final int mo27322D() {
        return this.zzi;
    }

    /* renamed from: E */
    public final int mo27323E() {
        return this.zze.size();
    }

    /* renamed from: F */
    public final long mo27324F() {
        return this.zzh;
    }

    /* renamed from: G */
    public final long mo27325G() {
        return this.zzg;
    }

    /* renamed from: J */
    public final C5170m4 mo27326J(int i) {
        return (C5170m4) this.zze.get(i);
    }

    /* renamed from: K */
    public final String mo27327K() {
        return this.zzf;
    }

    /* renamed from: L */
    public final List mo27328L() {
        return this.zze;
    }

    /* renamed from: V */
    public final boolean mo27329V() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: W */
    public final boolean mo27330W() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: X */
    public final boolean mo27331X() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: Y */
    public final void mo27332Y() {
        C5354y8 y8Var = this.zze;
        if (!y8Var.mo27230b()) {
            this.zze = C5279t8.m14959p(y8Var);
        }
    }
}
