package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.m9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5175m9 implements C5265s9 {

    /* renamed from: a */
    public final C5265s9[] f10001a;

    public C5175m9(C5265s9... s9VarArr) {
        this.f10001a = s9VarArr;
    }

    /* renamed from: a */
    public final C5250r9 mo27401a(Class cls) {
        C5265s9[] s9VarArr = this.f10001a;
        for (int i = 0; i < 2; i++) {
            C5265s9 s9Var = s9VarArr[i];
            if (s9Var.mo27402b(cls)) {
                return s9Var.mo27401a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    /* renamed from: b */
    public final boolean mo27402b(Class cls) {
        C5265s9[] s9VarArr = this.f10001a;
        for (int i = 0; i < 2; i++) {
            if (s9VarArr[i].mo27402b(cls)) {
                return true;
            }
        }
        return false;
    }
}
