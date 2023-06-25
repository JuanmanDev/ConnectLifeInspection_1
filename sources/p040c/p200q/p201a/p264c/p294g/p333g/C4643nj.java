package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: c.q.a.c.g.g.nj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4643nj implements C4574l4 {

    /* renamed from: e */
    public static final ThreadLocal f9475e = new C4589lj();

    /* renamed from: f */
    public static final ThreadLocal f9476f = new C4616mj();

    /* renamed from: a */
    public final byte[] f9477a;

    /* renamed from: b */
    public final byte[] f9478b;

    /* renamed from: c */
    public final SecretKeySpec f9479c;

    /* renamed from: d */
    public final int f9480d;

    public C4643nj(byte[] bArr, int i) {
        if (!C4790t7.m13146a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (i == 12 || i == 16) {
            this.f9480d = i;
            C4751rk.m13023b(bArr.length);
            this.f9479c = new SecretKeySpec(bArr, "AES");
            Cipher cipher = (Cipher) f9475e.get();
            cipher.init(1, this.f9479c);
            byte[] c = m12554c(cipher.doFinal(new byte[16]));
            this.f9477a = c;
            this.f9478b = m12554c(c);
        } else {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
    }

    /* renamed from: c */
    public static byte[] m12554c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    /* renamed from: e */
    public static byte[] m12555e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: a */
    public final byte[] mo25783a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = (length - this.f9480d) - 16;
        if (i >= 0) {
            Cipher cipher = (Cipher) f9475e.get();
            cipher.init(1, this.f9479c);
            Cipher cipher2 = cipher;
            byte[] d = mo26341d(cipher2, 0, bArr, 0, this.f9480d);
            byte[] d2 = mo26341d(cipher2, 1, bArr2, 0, 0);
            byte[] d3 = mo26341d(cipher, 2, bArr, this.f9480d, i);
            int i2 = length - 16;
            byte b = 0;
            for (int i3 = 0; i3 < 16; i3++) {
                b = (byte) (b | (((bArr[i2 + i3] ^ d2[i3]) ^ d[i3]) ^ d3[i3]));
            }
            if (b == 0) {
                Cipher cipher3 = (Cipher) f9476f.get();
                cipher3.init(1, this.f9479c, new IvParameterSpec(d));
                return cipher3.doFinal(bArr, this.f9480d, i);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo25784b(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    /* renamed from: d */
    public final byte[] mo26341d(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2;
        int length;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m12555e(bArr3, this.f9477a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = m12555e(copyOfRange, this.f9477a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f9478b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                i4++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ ByteCompanionObject.MIN_VALUE);
            bArr2 = copyOf;
        }
        return cipher.doFinal(m12555e(doFinal, bArr2));
    }
}
