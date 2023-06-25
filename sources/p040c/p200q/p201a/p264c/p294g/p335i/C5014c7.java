package p040c.p200q.p201a.p264c.p294g.p335i;

import java.io.Serializable;

/* renamed from: c.q.a.c.g.i.c7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5014c7 {
    /* renamed from: a */
    public static C5352y6 m13908a(C5352y6 y6Var) {
        if ((y6Var instanceof C4982a7) || (y6Var instanceof C5367z6)) {
            return y6Var;
        }
        if (y6Var instanceof Serializable) {
            return new C5367z6(y6Var);
        }
        return new C4982a7(y6Var);
    }

    /* renamed from: b */
    public static C5352y6 m13909b(Object obj) {
        return new C4998b7(obj);
    }
}
