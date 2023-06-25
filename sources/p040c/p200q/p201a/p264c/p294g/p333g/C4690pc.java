package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Arrays;

/* renamed from: c.q.a.c.g.g.pc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4690pc extends C4899xc {

    /* renamed from: a */
    public final int f9553a;

    /* renamed from: b */
    public final int f9554b;

    /* renamed from: c */
    public final C4636nc f9555c;

    /* renamed from: d */
    public final C4609mc f9556d;

    public /* synthetic */ C4690pc(int i, int i2, C4636nc ncVar, C4609mc mcVar, C4663oc ocVar) {
        this.f9553a = i;
        this.f9554b = i2;
        this.f9555c = ncVar;
        this.f9556d = mcVar;
    }

    /* renamed from: a */
    public final int mo26513a() {
        return this.f9553a;
    }

    /* renamed from: b */
    public final int mo26514b() {
        C4636nc ncVar = this.f9555c;
        if (ncVar == C4636nc.f9473e) {
            return this.f9554b;
        }
        if (ncVar == C4636nc.f9470b || ncVar == C4636nc.f9471c || ncVar == C4636nc.f9472d) {
            return this.f9554b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    /* renamed from: c */
    public final C4636nc mo26515c() {
        return this.f9555c;
    }

    /* renamed from: d */
    public final boolean mo26516d() {
        return this.f9555c != C4636nc.f9473e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4690pc)) {
            return false;
        }
        C4690pc pcVar = (C4690pc) obj;
        if (pcVar.f9553a == this.f9553a && pcVar.mo26514b() == mo26514b() && pcVar.f9555c == this.f9555c && pcVar.f9556d == this.f9556d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9554b), this.f9555c, this.f9556d});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9555c);
        String valueOf2 = String.valueOf(this.f9556d);
        int i = this.f9554b;
        int i2 = this.f9553a;
        return "HMAC Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + i + "-byte tags, and " + i2 + "-byte key)";
    }
}
