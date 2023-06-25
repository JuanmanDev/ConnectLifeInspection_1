package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Arrays;

/* renamed from: c.q.a.c.g.g.fb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4419fb {

    /* renamed from: a */
    public final Class f9224a;

    /* renamed from: b */
    public final C4829uk f9225b;

    public /* synthetic */ C4419fb(Class cls, C4829uk ukVar, C4392eb ebVar) {
        this.f9224a = cls;
        this.f9225b = ukVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4419fb)) {
            return false;
        }
        C4419fb fbVar = (C4419fb) obj;
        if (!fbVar.f9224a.equals(this.f9224a) || !fbVar.f9225b.equals(this.f9225b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9224a, this.f9225b});
    }

    public final String toString() {
        String simpleName = this.f9224a.getSimpleName();
        String valueOf = String.valueOf(this.f9225b);
        return simpleName + ", object identifier: " + valueOf;
    }
}
