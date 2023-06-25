package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;

/* renamed from: c.q.a.c.g.g.og */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4667og extends C4544k1 implements C4599m2 {
    public static final C4667og zzb;
    public int zzd;
    public int zze;
    public zzacc zzf = zzacc.zzb;

    static {
        C4667og ogVar = new C4667og();
        zzb = ogVar;
        C4544k1.m12255l(C4667og.class, ogVar);
    }

    /* renamed from: E */
    public static C4640ng m12721E() {
        return (C4640ng) zzb.mo26163x();
    }

    /* renamed from: G */
    public static C4667og m12723G() {
        return zzb;
    }

    /* renamed from: H */
    public final zzacc mo26472H() {
        return this.zzf;
    }

    /* renamed from: J */
    public final int mo26473J() {
        int i = this.zzd;
        int i2 = 5;
        if (i == 0) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 4;
        } else if (i != 3) {
            i2 = i != 4 ? i != 5 ? 0 : 7 : 6;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* renamed from: K */
    public final int mo26474K() {
        int b = C4799tg.m13165b(this.zze);
        if (b == 0) {
            return 1;
        }
        return b;
    }

    /* renamed from: v */
    public final Object mo25825v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4544k1.m12254f(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C4667og();
        } else {
            if (i2 == 4) {
                return new C4640ng((C4613mg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
