package p040c.p200q.p201a.p264c.p294g.p333g;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.ec */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4393ec {

    /* renamed from: a */
    public C4690pc f9195a = null;

    /* renamed from: b */
    public C4855vk f9196b = null;

    /* renamed from: c */
    public Integer f9197c = null;

    public /* synthetic */ C4393ec(C4366dc dcVar) {
    }

    /* renamed from: a */
    public final C4393ec mo25940a(Integer num) {
        this.f9197c = num;
        return this;
    }

    /* renamed from: b */
    public final C4393ec mo25941b(C4855vk vkVar) {
        this.f9196b = vkVar;
        return this;
    }

    /* renamed from: c */
    public final C4393ec mo25942c(C4690pc pcVar) {
        this.f9195a = pcVar;
        return this;
    }

    /* renamed from: d */
    public final C4447gc mo25943d() {
        C4855vk vkVar;
        C4829uk b;
        C4690pc pcVar = this.f9195a;
        if (pcVar == null || (vkVar = this.f9196b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (pcVar.mo26513a() != vkVar.mo26782a()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (pcVar.mo26516d() && this.f9197c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
        } else if (this.f9195a.mo26516d() || this.f9197c == null) {
            if (this.f9195a.mo26515c() == C4636nc.f9473e) {
                b = C4829uk.m13256b(new byte[0]);
            } else if (this.f9195a.mo26515c() == C4636nc.f9472d || this.f9195a.mo26515c() == C4636nc.f9471c) {
                b = C4829uk.m13256b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f9197c.intValue()).array());
            } else if (this.f9195a.mo26515c() == C4636nc.f9470b) {
                b = C4829uk.m13256b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f9197c.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(String.valueOf(this.f9195a.mo26515c()))));
            }
            return new C4447gc(this.f9195a, this.f9196b, b, this.f9197c, (C4420fc) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
        }
    }
}
