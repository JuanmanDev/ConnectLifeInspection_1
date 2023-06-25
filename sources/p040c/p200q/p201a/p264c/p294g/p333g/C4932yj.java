package p040c.p200q.p201a.p264c.p294g.p333g;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: c.q.a.c.g.g.yj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4932yj implements C4574l4 {

    /* renamed from: a */
    public final C4536jk f9751a;

    /* renamed from: b */
    public final C4494i5 f9752b;

    /* renamed from: c */
    public final int f9753c;

    public C4932yj(C4536jk jkVar, C4494i5 i5Var, int i) {
        this.f9751a = jkVar;
        this.f9752b = i5Var;
        this.f9753c = i;
    }

    /* renamed from: a */
    public final byte[] mo25783a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f9753c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.f9753c, length);
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(0).array(), 8);
            this.f9752b.mo26099a(copyOfRange2, C4724qj.m12936c(bArr2, copyOfRange, copyOf));
            return this.f9751a.mo26145a(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo25784b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
