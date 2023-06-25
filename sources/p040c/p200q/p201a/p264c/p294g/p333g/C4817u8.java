package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: c.q.a.c.g.g.u8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4817u8 implements C4709q4 {

    /* renamed from: f */
    public static final byte[] f9659f = new byte[0];

    /* renamed from: a */
    public final C4895x8 f9660a;

    /* renamed from: b */
    public final C4869w8 f9661b;

    /* renamed from: c */
    public final C4765s8 f9662c;

    /* renamed from: d */
    public final int f9663d;

    /* renamed from: e */
    public final C4739r8 f9664e;

    public C4817u8(C4895x8 x8Var, C4869w8 w8Var, C4739r8 r8Var, C4765s8 s8Var, int i, byte[] bArr) {
        this.f9660a = x8Var;
        this.f9661b = w8Var;
        this.f9664e = r8Var;
        this.f9662c = s8Var;
        this.f9663d = i;
    }

    /* renamed from: b */
    public static C4817u8 m13229b(C4641nh nhVar) {
        int i;
        C4895x8 x8Var;
        if (!nhVar.mo26338N()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        } else if (!nhVar.mo26336I().mo26584O()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        } else if (!nhVar.mo26337J().zzs()) {
            C4560kh F = nhVar.mo26336I().mo26582F();
            C4869w8 b = C4921y8.m13583b(F);
            C4739r8 c = C4921y8.m13584c(F);
            C4765s8 a = C4921y8.m13582a(F);
            int J = F.mo26182J();
            int i2 = J - 2;
            if (i2 == 1) {
                i = 32;
            } else if (i2 == 2) {
                i = 65;
            } else if (i2 == 3) {
                i = 97;
            } else if (i2 == 4) {
                i = 133;
            } else {
                throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(C4398eh.m11917a(J)));
            }
            int J2 = nhVar.mo26336I().mo26582F().mo26182J() - 2;
            if (J2 == 1) {
                x8Var = C4525j9.m12204b(nhVar.mo26337J().zzt());
            } else if (J2 == 2 || J2 == 3 || J2 == 4) {
                x8Var = C4471h9.m12094b(nhVar.mo26337J().zzt(), nhVar.mo26336I().mo26583K().zzt(), C4417f9.m11953g(nhVar.mo26336I().mo26582F().mo26182J()));
            } else {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            return new C4817u8(x8Var, b, c, a, i, (byte[]) null);
        } else {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
    }

    /* renamed from: a */
    public final byte[] mo26102a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f9663d;
        if (length >= i) {
            byte[] copyOf = Arrays.copyOf(bArr, i);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, this.f9663d, length);
            C4895x8 x8Var = this.f9660a;
            C4869w8 w8Var = this.f9661b;
            C4739r8 r8Var = this.f9664e;
            C4765s8 s8Var = this.f9662c;
            return C4791t8.m13147b(copyOf, w8Var.mo26024b(copyOf, x8Var), w8Var, r8Var, s8Var, new byte[0]).mo26669a(copyOfRange, f9659f);
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }
}
