package p040c.p200q.p201a.p264c.p294g.p333g;

/* renamed from: c.q.a.c.g.g.li */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4588li extends C4544k1 implements C4599m2 {
    public static final C4588li zzb;
    public int zzd;
    public C4679p1 zze = C4544k1.m12251D();

    static {
        C4588li liVar = new C4588li();
        zzb = liVar;
        C4544k1.m12255l(C4588li.class, liVar);
    }

    /* renamed from: E */
    public static C4507ii m12426E() {
        return (C4507ii) zzb.mo26163x();
    }

    /* renamed from: I */
    public static /* synthetic */ void m12429I(C4588li liVar, C4561ki kiVar) {
        kiVar.getClass();
        C4679p1 p1Var = liVar.zze;
        if (!p1Var.mo26497b()) {
            liVar.zze = C4544k1.m12252d(p1Var);
        }
        liVar.zze.add(kiVar);
    }

    /* renamed from: F */
    public final C4561ki mo26276F(int i) {
        return (C4561ki) this.zze.get(0);
    }

    /* renamed from: v */
    public final Object mo25825v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4544k1.m12254f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", C4561ki.class});
        } else if (i2 == 3) {
            return new C4588li();
        } else {
            if (i2 == 4) {
                return new C4507ii((C4480hi) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
