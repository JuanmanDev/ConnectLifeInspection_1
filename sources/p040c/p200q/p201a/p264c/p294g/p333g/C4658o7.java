package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Arrays;

/* renamed from: c.q.a.c.g.g.o7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4658o7 extends C4577l7 {
    public C4658o7(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* renamed from: a */
    public final int mo26167a() {
        return 24;
    }

    /* renamed from: b */
    public final int[] mo26168b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            int[] iArr3 = new int[16];
            C4469h7.m12090b(iArr3, this.f9381a);
            iArr3[12] = iArr[0];
            iArr3[13] = iArr[1];
            iArr3[14] = iArr[2];
            iArr3[15] = iArr[3];
            C4469h7.m12091c(iArr3);
            iArr3[4] = iArr3[12];
            iArr3[5] = iArr3[13];
            iArr3[6] = iArr3[14];
            iArr3[7] = iArr3[15];
            C4469h7.m12090b(iArr2, Arrays.copyOf(iArr3, 8));
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
    }
}
