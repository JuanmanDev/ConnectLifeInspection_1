package p040c.p200q.p201a.p264c.p294g.p333g;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.a7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4280a7 implements C4574l4 {

    /* renamed from: c */
    public static final byte[] f9119c = new byte[0];

    /* renamed from: a */
    public final C4930yh f9120a;

    /* renamed from: b */
    public final C4574l4 f9121b;

    public C4280a7(C4930yh yhVar, C4574l4 l4Var) {
        this.f9120a = yhVar;
        this.f9121b = l4Var;
    }

    /* renamed from: a */
    public final byte[] mo25783a(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((C4574l4) C4840v5.m13304j(this.f9120a.mo26865J(), this.f9121b.mo25783a(bArr3, f9119c), C4574l4.class)).mo25783a(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    /* renamed from: b */
    public final byte[] mo25784b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
