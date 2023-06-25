package p040c.p200q.p201a.p264c.p294g.p333g;

/* renamed from: c.q.a.c.g.g.g9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4444g9 implements C4869w8 {

    /* renamed from: a */
    public final C4739r8 f9243a;

    /* renamed from: b */
    public final int f9244b;

    public C4444g9(C4739r8 r8Var, int i) {
        this.f9243a = r8Var;
        this.f9244b = i;
    }

    /* renamed from: c */
    public static C4444g9 m12038c(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return new C4444g9(new C4739r8("HmacSha256"), 1);
        }
        if (i2 != 1) {
            return new C4444g9(new C4739r8("HmacSha512"), 3);
        }
        return new C4444g9(new C4739r8("HmacSha384"), 2);
    }

    /* renamed from: a */
    public final byte[] mo26023a() {
        int i = this.f9244b - 1;
        if (i == 0) {
            return C4417f9.f9211c;
        }
        if (i != 1) {
            return C4417f9.f9213e;
        }
        return C4417f9.f9212d;
    }

    /* renamed from: b */
    public final byte[] mo26024b(byte[] bArr, C4895x8 x8Var) {
        byte[] h = C4906xj.m13508h(C4906xj.m13509i(this.f9244b, x8Var.zza().mo26737c()), C4906xj.m13511k(C4906xj.m13512l(this.f9244b), 1, bArr));
        byte[] c = C4724qj.m12936c(bArr, x8Var.mo26068a().mo26737c());
        byte[] d = C4417f9.m11950d(mo26023a());
        C4739r8 r8Var = this.f9243a;
        return r8Var.mo26607b((byte[]) null, h, "eae_prk", c, "shared_secret", d, r8Var.mo26606a());
    }
}
