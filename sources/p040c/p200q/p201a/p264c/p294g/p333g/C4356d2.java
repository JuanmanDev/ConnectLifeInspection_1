package p040c.p200q.p201a.p264c.p294g.p333g;

/* renamed from: c.q.a.c.g.g.d2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4356d2 implements C4518j2 {

    /* renamed from: a */
    public final C4518j2[] f9164a;

    public C4356d2(C4518j2... j2VarArr) {
        this.f9164a = j2VarArr;
    }

    /* renamed from: a */
    public final C4491i2 mo25842a(Class cls) {
        C4518j2[] j2VarArr = this.f9164a;
        for (int i = 0; i < 2; i++) {
            C4518j2 j2Var = j2VarArr[i];
            if (j2Var.mo25843b(cls)) {
                return j2Var.mo25842a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    /* renamed from: b */
    public final boolean mo25843b(Class cls) {
        C4518j2[] j2VarArr = this.f9164a;
        for (int i = 0; i < 2; i++) {
            if (j2VarArr[i].mo25843b(cls)) {
                return true;
            }
        }
        return false;
    }
}
