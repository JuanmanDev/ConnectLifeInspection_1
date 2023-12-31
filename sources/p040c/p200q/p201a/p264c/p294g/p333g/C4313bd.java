package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: c.q.a.c.g.g.bd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4313bd {
    /* renamed from: a */
    public static byte[] m11722a(byte[] bArr) {
        int length = bArr.length;
        if (length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            copyOf[length] = ByteCompanionObject.MIN_VALUE;
            return copyOf;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }

    /* renamed from: b */
    public static byte[] m11723b(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i = 0; i < 16; i++) {
                byte b = bArr[i];
                byte b2 = (byte) ((b + b) & 254);
                bArr2[i] = b2;
                if (i < 15) {
                    bArr2[i] = (byte) (((bArr[i + 1] >> 7) & 1) | b2);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }
}
