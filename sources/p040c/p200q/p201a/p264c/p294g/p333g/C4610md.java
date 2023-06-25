package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Arrays;
import java.util.List;

/* renamed from: c.q.a.c.g.g.md */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4610md {

    /* renamed from: a */
    public final C4421fd f9436a;

    /* renamed from: b */
    public final List f9437b;

    /* renamed from: c */
    public final Integer f9438c;

    public /* synthetic */ C4610md(C4421fd fdVar, List list, Integer num, C4583ld ldVar) {
        this.f9436a = fdVar;
        this.f9437b = list;
        this.f9438c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4610md)) {
            return false;
        }
        C4610md mdVar = (C4610md) obj;
        if (this.f9436a.equals(mdVar.f9436a) && this.f9437b.equals(mdVar.f9437b)) {
            Integer num = this.f9438c;
            Integer num2 = mdVar.f9438c;
            if (num == num2) {
                return true;
            }
            if (num == null || !num.equals(num2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9436a, this.f9437b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[]{this.f9436a, this.f9437b, this.f9438c});
    }
}
