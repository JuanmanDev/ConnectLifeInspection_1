package p040c.p200q.p201a.p264c.p294g.p333g;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* renamed from: c.q.a.c.g.g.n7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C4631n7 {

    /* renamed from: a */
    public final C4577l7 f9462a;

    /* renamed from: b */
    public final C4577l7 f9463b;

    public C4631n7(byte[] bArr) {
        if (C4790t7.m13146a(1)) {
            this.f9462a = mo26307a(bArr, 1);
            this.f9463b = mo26307a(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    /* renamed from: a */
    public abstract C4577l7 mo26307a(byte[] bArr, int i);

    /* renamed from: b */
    public final byte[] mo26326b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            try {
                byte[] bArr4 = new byte[32];
                this.f9463b.mo26256c(bArr, 0).get(bArr4);
                int remaining = byteBuffer.remaining();
                int i = remaining % 16;
                int i2 = i == 0 ? remaining : (remaining + 16) - i;
                ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(0);
                order.put(byteBuffer);
                order.position(i2);
                order.putLong(0);
                order.putLong((long) remaining);
                if (C4724qj.m12935b(C4712q7.m12897a(bArr4, order.array()), bArr3)) {
                    byteBuffer.position(position);
                    return this.f9462a.mo26257d(bArr, byteBuffer);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    /* renamed from: c */
    public final byte[] mo26327c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return mo26326b(ByteBuffer.wrap(bArr2), bArr, bArr3);
    }
}
