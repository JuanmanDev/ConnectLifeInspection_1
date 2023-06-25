package p040c.p200q.p201a.p264c.p294g.p333g;

/* renamed from: c.q.a.c.g.g.fg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4424fg extends C4544k1 implements C4599m2 {
    public static final C4424fg zzb;
    public C4667og zzd;
    public C4928yf zze;
    public int zzf;

    static {
        C4424fg fgVar = new C4424fg();
        zzb = fgVar;
        C4544k1.m12255l(C4424fg.class, fgVar);
    }

    /* renamed from: F */
    public static C4370dg m11966F() {
        return (C4370dg) zzb.mo26163x();
    }

    /* renamed from: H */
    public static C4424fg m11968H() {
        return zzb;
    }

    /* renamed from: J */
    public static /* synthetic */ void m11969J(C4424fg fgVar, C4667og ogVar) {
        ogVar.getClass();
        fgVar.zzd = ogVar;
    }

    /* renamed from: K */
    public static /* synthetic */ void m11970K(C4424fg fgVar, C4928yf yfVar) {
        yfVar.getClass();
        fgVar.zze = yfVar;
    }

    /* renamed from: E */
    public final C4928yf mo25987E() {
        C4928yf yfVar = this.zze;
        return yfVar == null ? C4928yf.m13599G() : yfVar;
    }

    /* renamed from: I */
    public final C4667og mo25988I() {
        C4667og ogVar = this.zzd;
        return ogVar == null ? C4667og.m12723G() : ogVar;
    }

    /* renamed from: L */
    public final int mo25989L() {
        int i = this.zzf;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* renamed from: v */
    public final Object mo25825v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4544k1.m12254f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C4424fg();
        } else {
            if (i2 == 4) {
                return new C4370dg((C4343cg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
