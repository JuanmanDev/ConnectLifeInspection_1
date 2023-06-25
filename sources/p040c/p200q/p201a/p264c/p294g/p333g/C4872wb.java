package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Arrays;

/* renamed from: c.q.a.c.g.g.wb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4872wb extends C4899xc {

    /* renamed from: a */
    public final int f9722a;

    /* renamed from: b */
    public final int f9723b;

    /* renamed from: c */
    public final C4820ub f9724c;

    public /* synthetic */ C4872wb(int i, int i2, C4820ub ubVar, C4846vb vbVar) {
        this.f9722a = i;
        this.f9723b = i2;
        this.f9724c = ubVar;
    }

    /* renamed from: a */
    public final int mo26794a() {
        return this.f9722a;
    }

    /* renamed from: b */
    public final int mo26795b() {
        C4820ub ubVar = this.f9724c;
        if (ubVar == C4820ub.f9668e) {
            return this.f9723b;
        }
        if (ubVar == C4820ub.f9665b || ubVar == C4820ub.f9666c || ubVar == C4820ub.f9667d) {
            return this.f9723b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    /* renamed from: c */
    public final C4820ub mo26796c() {
        return this.f9724c;
    }

    /* renamed from: d */
    public final boolean mo26797d() {
        return this.f9724c != C4820ub.f9668e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4872wb)) {
            return false;
        }
        C4872wb wbVar = (C4872wb) obj;
        if (wbVar.f9722a == this.f9722a && wbVar.mo26795b() == mo26795b() && wbVar.f9724c == this.f9724c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9723b), this.f9724c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9724c);
        int i = this.f9723b;
        int i2 = this.f9722a;
        return "AES-CMAC Parameters (variant: " + valueOf + ", " + i + "-byte tags, and " + i2 + "-byte key)";
    }
}
