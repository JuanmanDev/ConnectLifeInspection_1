package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Arrays;

/* renamed from: c.q.a.c.g.g.hb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4473hb {

    /* renamed from: a */
    public final Class f9274a;

    /* renamed from: b */
    public final Class f9275b;

    public /* synthetic */ C4473hb(Class cls, Class cls2, C4446gb gbVar) {
        this.f9274a = cls;
        this.f9275b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4473hb)) {
            return false;
        }
        C4473hb hbVar = (C4473hb) obj;
        if (!hbVar.f9274a.equals(this.f9274a) || !hbVar.f9275b.equals(this.f9275b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9274a, this.f9275b});
    }

    public final String toString() {
        String simpleName = this.f9274a.getSimpleName();
        String simpleName2 = this.f9275b.getSimpleName();
        return simpleName + " with serialization type: " + simpleName2;
    }
}
