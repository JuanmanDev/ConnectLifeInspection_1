package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.List;

/* renamed from: c.q.a.c.g.g.gi */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4453gi extends C4544k1 implements C4599m2 {
    public static final C4453gi zzb;
    public int zzd;
    public C4679p1 zze = C4544k1.m12251D();

    static {
        C4453gi giVar = new C4453gi();
        zzb = giVar;
        C4544k1.m12255l(C4453gi.class, giVar);
    }

    /* renamed from: G */
    public static C4372di m12056G() {
        return (C4372di) zzb.mo26163x();
    }

    /* renamed from: J */
    public static C4453gi m12058J(byte[] bArr, C4913y0 y0Var) {
        return (C4453gi) C4544k1.m12250C(zzb, bArr, y0Var);
    }

    /* renamed from: M */
    public static /* synthetic */ void m12060M(C4453gi giVar, C4426fi fiVar) {
        fiVar.getClass();
        C4679p1 p1Var = giVar.zze;
        if (!p1Var.mo26497b()) {
            giVar.zze = C4544k1.m12252d(p1Var);
        }
        giVar.zze.add(fiVar);
    }

    /* renamed from: E */
    public final int mo26033E() {
        return this.zze.size();
    }

    /* renamed from: F */
    public final int mo26034F() {
        return this.zzd;
    }

    /* renamed from: H */
    public final C4426fi mo26035H(int i) {
        return (C4426fi) this.zze.get(i);
    }

    /* renamed from: K */
    public final List mo26036K() {
        return this.zze;
    }

    /* renamed from: v */
    public final Object mo25825v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4544k1.m12254f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", C4426fi.class});
        } else if (i2 == 3) {
            return new C4453gi();
        } else {
            if (i2 == 4) {
                return new C4372di((C4345ci) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
