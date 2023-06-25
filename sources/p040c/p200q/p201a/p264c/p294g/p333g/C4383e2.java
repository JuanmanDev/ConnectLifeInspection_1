package p040c.p200q.p201a.p264c.p294g.p333g;

import androidx.test.espresso.base.RootsOracle;

/* renamed from: c.q.a.c.g.g.e2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4383e2 implements C4915y2 {

    /* renamed from: b */
    public static final C4518j2 f9186b = new C4329c2();

    /* renamed from: a */
    public final C4518j2 f9187a;

    public C4383e2() {
        C4518j2 j2Var;
        C4518j2[] j2VarArr = new C4518j2[2];
        j2VarArr[0] = C4436g1.m12013c();
        try {
            j2Var = (C4518j2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(RootsOracle.GET_GLOBAL_INSTANCE, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            j2Var = f9186b;
        }
        j2VarArr[1] = j2Var;
        C4356d2 d2Var = new C4356d2(j2VarArr);
        C4706q1.m12869f(d2Var, "messageInfoFactory");
        this.f9187a = d2Var;
    }

    /* renamed from: a */
    public static boolean m11879a(C4491i2 i2Var) {
        return i2Var.mo26094b() == 1;
    }

    /* renamed from: e */
    public final C4889x2 mo25931e(Class cls) {
        Class<C4544k1> cls2 = C4544k1.class;
        C4941z2.m13665g(cls);
        C4491i2 a = this.f9187a.mo25842a(cls);
        if (a.mo26093a()) {
            if (cls2.isAssignableFrom(cls)) {
                return C4680p2.m12764k(C4941z2.m13659b(), C4301b1.m11698b(), a.zza());
            }
            return C4680p2.m12764k(C4941z2.m13660b0(), C4301b1.m11697a(), a.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m11879a(a)) {
                return C4653o2.m12623Q(cls, a, C4733r2.m12977b(), C4940z1.m13627e(), C4941z2.m13659b(), C4301b1.m11698b(), C4464h2.m12085b());
            }
            return C4653o2.m12623Q(cls, a, C4733r2.m12977b(), C4940z1.m13627e(), C4941z2.m13659b(), (C4939z0) null, C4464h2.m12085b());
        } else if (m11879a(a)) {
            return C4653o2.m12623Q(cls, a, C4733r2.m12976a(), C4940z1.m13626d(), C4941z2.m13660b0(), C4301b1.m11697a(), C4464h2.m12084a());
        } else {
            return C4653o2.m12623Q(cls, a, C4733r2.m12976a(), C4940z1.m13626d(), C4941z2.m13657a(), (C4939z0) null, C4464h2.m12084a());
        }
    }
}
