package p040c.p200q.p201a.p264c.p294g.p333g;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.f9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4417f9 {

    /* renamed from: a */
    public static final byte[] f9209a = m11949c(1, 0);

    /* renamed from: b */
    public static final byte[] f9210b = m11949c(2, 32);

    /* renamed from: c */
    public static final byte[] f9211c = m11949c(2, 16);

    /* renamed from: d */
    public static final byte[] f9212d = m11949c(2, 17);

    /* renamed from: e */
    public static final byte[] f9213e = m11949c(2, 18);

    /* renamed from: f */
    public static final byte[] f9214f = m11949c(2, 1);

    /* renamed from: g */
    public static final byte[] f9215g = m11949c(2, 2);

    /* renamed from: h */
    public static final byte[] f9216h = m11949c(2, 3);

    /* renamed from: i */
    public static final byte[] f9217i = m11949c(2, 1);

    /* renamed from: j */
    public static final byte[] f9218j = m11949c(2, 2);

    /* renamed from: k */
    public static final byte[] f9219k = m11949c(2, 3);

    /* renamed from: l */
    public static final byte[] f9220l = new byte[0];

    /* renamed from: m */
    public static final byte[] f9221m = "KEM".getBytes(StandardCharsets.UTF_8);

    /* renamed from: n */
    public static final byte[] f9222n = "HPKE".getBytes(StandardCharsets.UTF_8);

    /* renamed from: o */
    public static final byte[] f9223o = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    /* renamed from: a */
    public static void m11947a(C4560kh khVar) {
        if (khVar.mo26182J() == 2 || khVar.mo26182J() == 1) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(C4398eh.m11917a(khVar.mo26182J())));
        }
        String str = "UNRECOGNIZED";
        if (khVar.mo26181I() == 2 || khVar.mo26181I() == 1) {
            int I = khVar.mo26181I();
            if (I == 2) {
                str = "KDF_UNKNOWN";
            } else if (I == 3) {
                str = "HKDF_SHA256";
            } else if (I == 4) {
                str = "HKDF_SHA384";
            } else if (I == 5) {
                str = "HKDF_SHA512";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        } else if (khVar.mo26180H() == 2 || khVar.mo26180H() == 1) {
            int H = khVar.mo26180H();
            if (H == 2) {
                str = "AEAD_UNKNOWN";
            } else if (H == 3) {
                str = "AES_128_GCM";
            } else if (H == 4) {
                str = "AES_256_GCM";
            } else if (H == 5) {
                str = "CHACHA20_POLY1305";
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    /* renamed from: b */
    public static byte[] m11948b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return C4724qj.m12936c(f9222n, bArr, bArr2, bArr3);
    }

    /* renamed from: c */
    public static byte[] m11949c(int i, int i2) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((i2 >> (((i - i3) - 1) * 8)) & 255);
        }
        return bArr;
    }

    /* renamed from: d */
    public static byte[] m11950d(byte[] bArr) {
        return C4724qj.m12936c(f9221m, bArr);
    }

    /* renamed from: e */
    public static byte[] m11951e(String str, byte[] bArr, byte[] bArr2) {
        return C4724qj.m12936c(f9223o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    /* renamed from: f */
    public static byte[] m11952f(String str, byte[] bArr, byte[] bArr2, int i) {
        return C4724qj.m12936c(m11949c(2, i), f9223o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    /* renamed from: g */
    public static int m11953g(int i) {
        int i2 = i - 2;
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }
}
