package p040c.p200q.p201a.p264c.p294g.p335i;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: c.q.a.c.g.i.b7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C4998b7 implements Serializable, C5352y6 {

    /* renamed from: e */
    public final Object f9824e;

    public C4998b7(Object obj) {
        this.f9824e = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4998b7)) {
            return false;
        }
        Object obj2 = this.f9824e;
        Object obj3 = ((C4998b7) obj).f9824e;
        if (obj2 == obj3 || obj2.equals(obj3)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9824e});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f9824e + ")";
    }

    public final Object zza() {
        return this.f9824e;
    }
}
