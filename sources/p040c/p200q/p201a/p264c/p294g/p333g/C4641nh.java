package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;

/* renamed from: c.q.a.c.g.g.nh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4641nh extends C4544k1 implements C4599m2 {
    public static final C4641nh zzb;
    public int zzd;
    public C4722qh zze;
    public zzacc zzf = zzacc.zzb;

    static {
        C4641nh nhVar = new C4641nh();
        zzb = nhVar;
        C4544k1.m12255l(C4641nh.class, nhVar);
    }

    /* renamed from: F */
    public static C4614mh m12541F() {
        return (C4614mh) zzb.mo26163x();
    }

    /* renamed from: H */
    public static C4641nh m12543H(zzacc zzacc, C4913y0 y0Var) {
        return (C4641nh) C4544k1.m12249B(zzb, zzacc, y0Var);
    }

    /* renamed from: L */
    public static /* synthetic */ void m12545L(C4641nh nhVar, C4722qh qhVar) {
        qhVar.getClass();
        nhVar.zze = qhVar;
    }

    /* renamed from: E */
    public final int mo26335E() {
        return this.zzd;
    }

    /* renamed from: I */
    public final C4722qh mo26336I() {
        C4722qh qhVar = this.zze;
        return qhVar == null ? C4722qh.m12924I() : qhVar;
    }

    /* renamed from: J */
    public final zzacc mo26337J() {
        return this.zzf;
    }

    /* renamed from: N */
    public final boolean mo26338N() {
        return this.zze != null;
    }

    /* renamed from: v */
    public final Object mo25825v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4544k1.m12254f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C4641nh();
        } else {
            if (i2 == 4) {
                return new C4614mh((C4587lh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
