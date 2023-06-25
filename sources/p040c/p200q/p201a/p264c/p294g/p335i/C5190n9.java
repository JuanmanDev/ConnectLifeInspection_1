package p040c.p200q.p201a.p264c.p294g.p335i;

import androidx.test.espresso.base.RootsOracle;

/* renamed from: c.q.a.c.g.i.n9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5190n9 implements C5081ga {

    /* renamed from: b */
    public static final C5265s9 f10015b = new C5160l9();

    /* renamed from: a */
    public final C5265s9 f10016a;

    public C5190n9() {
        C5265s9 s9Var;
        C5265s9[] s9VarArr = new C5265s9[2];
        s9VarArr[0] = C5219p8.m14645c();
        try {
            s9Var = (C5265s9) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(RootsOracle.GET_GLOBAL_INSTANCE, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            s9Var = f10015b;
        }
        s9VarArr[1] = s9Var;
        C5175m9 m9Var = new C5175m9(s9VarArr);
        C5369z8.m15426f(m9Var, "messageInfoFactory");
        this.f10016a = m9Var;
    }

    /* renamed from: a */
    public static boolean m14539a(C5250r9 r9Var) {
        return r9Var.mo27194b() == 1;
    }

    /* renamed from: e */
    public final C5065fa mo27274e(Class cls) {
        Class<C5279t8> cls2 = C5279t8.class;
        C5097ha.m14250g(cls);
        C5250r9 a = this.f10016a.mo27401a(cls);
        if (a.mo27193a()) {
            if (cls2.isAssignableFrom(cls)) {
                return C5355y9.m15368j(C5097ha.m14244b(), C5127j8.m14378b(), a.zza());
            }
            return C5355y9.m15368j(C5097ha.m14245b0(), C5127j8.m14377a(), a.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m14539a(a)) {
                return C5340x9.m15254L(cls, a, C4985aa.m13784b(), C5128j9.m14380d(), C5097ha.m14244b(), C5127j8.m14378b(), C5235q9.m14688b());
            }
            return C5340x9.m15254L(cls, a, C4985aa.m13784b(), C5128j9.m14380d(), C5097ha.m14244b(), (C5095h8) null, C5235q9.m14688b());
        } else if (m14539a(a)) {
            return C5340x9.m15254L(cls, a, C4985aa.m13783a(), C5128j9.m14379c(), C5097ha.m14245b0(), C5127j8.m14377a(), C5235q9.m14687a());
        } else {
            return C5340x9.m15254L(cls, a, C4985aa.m13783a(), C5128j9.m14379c(), C5097ha.m14242a(), (C5095h8) null, C5235q9.m14687a());
        }
    }
}
