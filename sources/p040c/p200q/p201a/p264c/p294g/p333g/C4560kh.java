package p040c.p200q.p201a.p264c.p294g.p333g;

/* renamed from: c.q.a.c.g.g.kh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4560kh extends C4544k1 implements C4599m2 {
    public static final C4560kh zzb;
    public int zzd;
    public int zze;
    public int zzf;

    static {
        C4560kh khVar = new C4560kh();
        zzb = khVar;
        C4544k1.m12255l(C4560kh.class, khVar);
    }

    /* renamed from: E */
    public static C4533jh m12290E() {
        return (C4533jh) zzb.mo26163x();
    }

    /* renamed from: G */
    public static C4560kh m12292G() {
        return zzb;
    }

    /* renamed from: H */
    public final int mo26180H() {
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

    /* renamed from: I */
    public final int mo26181I() {
        int i = this.zze;
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

    /* renamed from: J */
    public final int mo26182J() {
        int i = this.zzd;
        int i2 = 4;
        if (i == 0) {
            i2 = 2;
        } else if (i == 1) {
            i2 = 3;
        } else if (i != 2) {
            i2 = i != 3 ? i != 4 ? 0 : 6 : 5;
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
            return C4544k1.m12254f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C4560kh();
        } else {
            if (i2 == 4) {
                return new C4533jh((C4506ih) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
