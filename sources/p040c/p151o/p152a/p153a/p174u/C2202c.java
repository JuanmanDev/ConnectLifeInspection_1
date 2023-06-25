package p040c.p151o.p152a.p153a.p174u;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: c.o.a.a.u.c */
/* compiled from: CipherUtils */
public class C2202c {
    /* renamed from: a */
    public static String m3347a(byte[] bArr) {
        byte[] bArr2 = new byte[(bArr.length + 1)];
        bArr2[0] = 1;
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        return new BigInteger(bArr2).toString(36);
    }

    /* renamed from: b */
    public static byte[] m3348b(String str) {
        byte[] byteArray = new BigInteger(str, 36).toByteArray();
        return Arrays.copyOfRange(byteArray, 1, byteArray.length);
    }
}
