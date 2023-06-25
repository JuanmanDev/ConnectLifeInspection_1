package p040c.p200q.p201a.p264c.p294g.p333g;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.mb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4608mb {

    /* renamed from: a */
    public C4872wb f9427a = null;

    /* renamed from: b */
    public C4855vk f9428b = null;

    /* renamed from: c */
    public Integer f9429c = null;

    public /* synthetic */ C4608mb(C4581lb lbVar) {
    }

    /* renamed from: a */
    public final C4608mb mo26308a(C4855vk vkVar) {
        this.f9428b = vkVar;
        return this;
    }

    /* renamed from: b */
    public final C4608mb mo26309b(Integer num) {
        this.f9429c = num;
        return this;
    }

    /* renamed from: c */
    public final C4608mb mo26310c(C4872wb wbVar) {
        this.f9427a = wbVar;
        return this;
    }

    /* renamed from: d */
    public final C4662ob mo26311d() {
        C4855vk vkVar;
        C4829uk b;
        C4872wb wbVar = this.f9427a;
        if (wbVar == null || (vkVar = this.f9428b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (wbVar.mo26794a() != vkVar.mo26782a()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (wbVar.mo26797d() && this.f9429c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
        } else if (this.f9427a.mo26797d() || this.f9429c == null) {
            if (this.f9427a.mo26796c() == C4820ub.f9668e) {
                b = C4829uk.m13256b(new byte[0]);
            } else if (this.f9427a.mo26796c() == C4820ub.f9667d || this.f9427a.mo26796c() == C4820ub.f9666c) {
                b = C4829uk.m13256b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f9429c.intValue()).array());
            } else if (this.f9427a.mo26796c() == C4820ub.f9665b) {
                b = C4829uk.m13256b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f9429c.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(String.valueOf(this.f9427a.mo26796c()))));
            }
            return new C4662ob(this.f9427a, this.f9428b, b, this.f9429c, (C4635nb) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
        }
    }
}
