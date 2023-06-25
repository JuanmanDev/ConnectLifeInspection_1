package p040c.p200q.p201a.p264c.p294g.p333g;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: c.q.a.c.g.g.l7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C4577l7 {

    /* renamed from: a */
    public int[] f9381a;

    /* renamed from: b */
    public final int f9382b;

    public C4577l7(byte[] bArr, int i) {
        if (bArr.length == 32) {
            this.f9381a = C4469h7.m12092d(bArr);
            this.f9382b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: a */
    public abstract int mo26167a();

    /* renamed from: b */
    public abstract int[] mo26168b(int[] iArr, int i);

    /* renamed from: c */
    public final ByteBuffer mo26256c(byte[] bArr, int i) {
        int[] b = mo26168b(C4469h7.m12092d(bArr), i);
        int[] iArr = (int[]) b.clone();
        C4469h7.m12091c(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            b[i2] = b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }

    /* renamed from: d */
    public final byte[] mo26257d(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length == mo26167a()) {
            int remaining = byteBuffer.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer c = mo26256c(bArr, this.f9382b + i2);
                if (i2 == i - 1) {
                    C4724qj.m12934a(allocate, byteBuffer, c, remaining % 64);
                } else {
                    C4724qj.m12934a(allocate, byteBuffer, c, 64);
                }
            }
            return allocate.array();
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo26167a());
    }
}
