package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: c.q.a.c.g.g.i9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4498i9 implements C4869w8 {

    /* renamed from: a */
    public final C4739r8 f9291a;

    public C4498i9(C4739r8 r8Var) {
        this.f9291a = r8Var;
    }

    /* renamed from: a */
    public final byte[] mo26023a() {
        if (Arrays.equals(this.f9291a.mo26608c(), C4417f9.f9214f)) {
            return C4417f9.f9210b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    /* renamed from: b */
    public final byte[] mo26024b(byte[] bArr, C4895x8 x8Var) {
        byte[] a = C4777sk.m13084a(x8Var.zza().mo26737c(), bArr);
        byte[] c = C4724qj.m12936c(bArr, x8Var.mo26068a().mo26737c());
        byte[] d = C4417f9.m11950d(C4417f9.f9210b);
        C4739r8 r8Var = this.f9291a;
        return r8Var.mo26607b((byte[]) null, a, "eae_prk", c, "shared_secret", d, r8Var.mo26606a());
    }
}
