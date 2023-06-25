package p040c.p200q.p201a.p264c.p294g.p333g;

import androidx.core.app.Person;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: c.q.a.c.g.g.t8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4791t8 {

    /* renamed from: f */
    public static final byte[] f9638f = new byte[0];

    /* renamed from: a */
    public final C4765s8 f9639a;

    /* renamed from: b */
    public final BigInteger f9640b;

    /* renamed from: c */
    public final byte[] f9641c;

    /* renamed from: d */
    public final byte[] f9642d;

    /* renamed from: e */
    public BigInteger f9643e = BigInteger.ZERO;

    public C4791t8(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, C4765s8 s8Var) {
        this.f9641c = bArr2;
        this.f9642d = bArr3;
        this.f9640b = bigInteger;
        this.f9639a = s8Var;
    }

    /* renamed from: b */
    public static C4791t8 m13147b(byte[] bArr, byte[] bArr2, C4869w8 w8Var, C4739r8 r8Var, C4765s8 s8Var, byte[] bArr3) {
        C4739r8 r8Var2 = r8Var;
        byte[] b = C4417f9.m11948b(w8Var.mo26023a(), r8Var.mo26608c(), s8Var.mo26509a());
        byte[] c = C4724qj.m12936c(C4417f9.f9209a, r8Var2.mo26610e(C4417f9.f9220l, f9638f, "psk_id_hash", b), r8Var2.mo26610e(C4417f9.f9220l, bArr3, "info_hash", b));
        C4739r8 r8Var3 = r8Var;
        byte[] e = r8Var2.mo26610e(bArr2, f9638f, "secret", b);
        byte[] bArr4 = c;
        byte[] bArr5 = b;
        return new C4791t8(bArr, r8Var3.mo26609d(e, bArr4, Person.KEY_KEY, bArr5, s8Var.zza()), r8Var3.mo26609d(e, bArr4, "base_nonce", bArr5, 12), BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), s8Var);
    }

    /* renamed from: a */
    public final byte[] mo26669a(byte[] bArr, byte[] bArr2) {
        return this.f9639a.mo26510b(this.f9641c, mo26670c(), bArr, bArr2);
    }

    /* renamed from: c */
    public final synchronized byte[] mo26670c() {
        byte[] d;
        byte[] bArr = this.f9642d;
        byte[] byteArray = this.f9643e.toByteArray();
        int length = byteArray.length;
        if (length != 12) {
            if (length > 13) {
                throw new GeneralSecurityException("integer too large");
            } else if (length != 13) {
                byte[] bArr2 = new byte[12];
                System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                byteArray = bArr2;
            } else if (byteArray[0] == 0) {
                byteArray = Arrays.copyOfRange(byteArray, 1, 13);
            } else {
                throw new GeneralSecurityException("integer too large");
            }
        }
        d = C4724qj.m12937d(bArr, byteArray);
        if (this.f9643e.compareTo(this.f9640b) < 0) {
            this.f9643e = this.f9643e.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return d;
    }
}
