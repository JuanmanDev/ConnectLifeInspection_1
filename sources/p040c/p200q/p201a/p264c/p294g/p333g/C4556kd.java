package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Arrays;

/* renamed from: c.q.a.c.g.g.kd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4556kd {

    /* renamed from: a */
    public final C4278a5 f9326a;

    /* renamed from: b */
    public final int f9327b;

    /* renamed from: c */
    public final C4521j5 f9328c;

    public /* synthetic */ C4556kd(C4278a5 a5Var, int i, C4521j5 j5Var, C4529jd jdVar) {
        this.f9326a = a5Var;
        this.f9327b = i;
        this.f9328c = j5Var;
    }

    /* renamed from: a */
    public final int mo26170a() {
        return this.f9327b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4556kd)) {
            return false;
        }
        C4556kd kdVar = (C4556kd) obj;
        if (this.f9326a == kdVar.f9326a && this.f9327b == kdVar.f9327b && this.f9328c.equals(kdVar.f9328c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9326a, Integer.valueOf(this.f9327b), Integer.valueOf(this.f9328c.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", new Object[]{this.f9326a, Integer.valueOf(this.f9327b), this.f9328c});
    }
}
