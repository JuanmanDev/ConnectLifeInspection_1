package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: c.q.a.c.g.g.tb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4794tb {

    /* renamed from: a */
    public Integer f9644a = null;

    /* renamed from: b */
    public Integer f9645b = null;

    /* renamed from: c */
    public C4820ub f9646c = C4820ub.f9668e;

    public /* synthetic */ C4794tb(C4768sb sbVar) {
    }

    /* renamed from: a */
    public final C4794tb mo26671a(int i) {
        if (i == 16 || i == 32) {
            this.f9644a = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i * 8)}));
    }

    /* renamed from: b */
    public final C4794tb mo26672b(int i) {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
        }
        this.f9645b = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public final C4794tb mo26673c(C4820ub ubVar) {
        this.f9646c = ubVar;
        return this;
    }

    /* renamed from: d */
    public final C4872wb mo26674d() {
        Integer num = this.f9644a;
        if (num != null && this.f9645b != null) {
            return new C4872wb(num.intValue(), this.f9645b.intValue(), this.f9646c, (C4846vb) null);
        }
        throw new GeneralSecurityException("Key size and/or tag size not set");
    }
}
