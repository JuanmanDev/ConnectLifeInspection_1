package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: c.q.a.c.g.g.pj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4697pj implements C4682p4 {

    /* renamed from: c */
    public static final Collection f9557c = Arrays.asList(new Integer[]{64});

    /* renamed from: d */
    public static final byte[] f9558d = new byte[16];

    /* renamed from: a */
    public final C4563kk f9559a;

    /* renamed from: b */
    public final byte[] f9560b;

    public C4697pj(byte[] bArr) {
        if (C4790t7.m13146a(1)) {
            Collection collection = f9557c;
            int length = bArr.length;
            if (collection.contains(Integer.valueOf(length))) {
                int i = length >> 1;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
                this.f9560b = Arrays.copyOfRange(bArr, i, length);
                this.f9559a = new C4563kk(copyOfRange);
                return;
            }
            throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    /* renamed from: a */
    public final byte[] mo25785a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        if (length >= 16) {
            Cipher cipher = (Cipher) C4958zj.f9782e.mo26891a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr4 = (byte[]) copyOfRange.clone();
            bArr4[8] = (byte) (bArr4[8] & ByteCompanionObject.MAX_VALUE);
            bArr4[12] = (byte) (bArr4[12] & ByteCompanionObject.MAX_VALUE);
            cipher.init(2, new SecretKeySpec(this.f9560b, "AES"), new IvParameterSpec(bArr4));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, length);
            byte[] doFinal = cipher.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && C4725qk.m12939a()) {
                doFinal = new byte[0];
            }
            byte[][] bArr5 = {bArr2, doFinal};
            byte[] a = this.f9559a.mo26184a(f9558d, 16);
            for (int i = 0; i <= 0; i++) {
                byte[] bArr6 = bArr5[i];
                if (bArr6 == null) {
                    bArr6 = new byte[0];
                }
                a = C4724qj.m12937d(C4313bd.m11723b(a), this.f9559a.mo26184a(bArr6, 16));
            }
            byte[] bArr7 = bArr5[1];
            int length2 = bArr7.length;
            if (length2 >= 16) {
                int length3 = a.length;
                if (length2 >= length3) {
                    int i2 = length2 - length3;
                    bArr3 = Arrays.copyOf(bArr7, length2);
                    for (int i3 = 0; i3 < a.length; i3++) {
                        int i4 = i2 + i3;
                        bArr3[i4] = (byte) (bArr3[i4] ^ a[i3]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                bArr3 = C4724qj.m12937d(C4313bd.m11722a(bArr7), C4313bd.m11723b(a));
            }
            if (C4724qj.m12935b(copyOfRange, this.f9559a.mo26184a(bArr3, 16))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
