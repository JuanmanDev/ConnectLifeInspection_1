package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: c.q.a.c.g.g.nk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4644nk implements C4494i5 {

    /* renamed from: a */
    public final C4637nd f9481a;

    /* renamed from: b */
    public final int f9482b;

    public C4644nk(C4637nd ndVar, int i) {
        this.f9481a = ndVar;
        this.f9482b = i;
        if (i >= 10) {
            ndVar.mo26184a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final void mo26099a(byte[] bArr, byte[] bArr2) {
        if (!C4724qj.m12935b(this.f9481a.mo26184a(bArr2, this.f9482b), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
