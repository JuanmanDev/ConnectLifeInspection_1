package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: c.q.a.c.g.g.lc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4582lc {

    /* renamed from: a */
    public Integer f9389a = null;

    /* renamed from: b */
    public Integer f9390b = null;

    /* renamed from: c */
    public C4609mc f9391c = null;

    /* renamed from: d */
    public C4636nc f9392d = C4636nc.f9473e;

    public /* synthetic */ C4582lc(C4555kc kcVar) {
    }

    /* renamed from: a */
    public final C4582lc mo26264a(C4609mc mcVar) {
        this.f9391c = mcVar;
        return this;
    }

    /* renamed from: b */
    public final C4582lc mo26265b(int i) {
        this.f9389a = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public final C4582lc mo26266c(int i) {
        this.f9390b = Integer.valueOf(i);
        return this;
    }

    /* renamed from: d */
    public final C4582lc mo26267d(C4636nc ncVar) {
        this.f9392d = ncVar;
        return this;
    }

    /* renamed from: e */
    public final C4690pc mo26268e() {
        Integer num = this.f9389a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        } else if (this.f9390b == null) {
            throw new GeneralSecurityException("tag size is not set");
        } else if (this.f9391c == null) {
            throw new GeneralSecurityException("hash type is not set");
        } else if (num.intValue() >= 16) {
            int intValue = this.f9390b.intValue();
            C4609mc mcVar = this.f9391c;
            if (intValue >= 10) {
                if (mcVar == C4609mc.f9430b) {
                    if (intValue > 20) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (mcVar == C4609mc.f9431c) {
                    if (intValue > 28) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (mcVar == C4609mc.f9432d) {
                    if (intValue > 32) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (mcVar == C4609mc.f9433e) {
                    if (intValue > 48) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (mcVar != C4609mc.f9434f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                } else if (intValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{Integer.valueOf(intValue)}));
                }
                return new C4690pc(this.f9389a.intValue(), this.f9390b.intValue(), this.f9392d, this.f9391c, (C4663oc) null);
            }
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(intValue)}));
        } else {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[]{this.f9389a}));
        }
    }
}
