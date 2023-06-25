package p040c.p200q.p405d;

import androidx.test.espresso.base.RootsOracle;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.ProtoSyntax;

/* renamed from: c.q.d.f0 */
/* compiled from: ManifestSchemaFactory */
public final class C6912f0 implements C6908e1 {

    /* renamed from: b */
    public static final C6951l0 f13224b = new C6913a();

    /* renamed from: a */
    public final C6951l0 f13225a;

    /* renamed from: c.q.d.f0$a */
    /* compiled from: ManifestSchemaFactory */
    public static class C6913a implements C6951l0 {
        /* renamed from: a */
        public C6947k0 mo31934a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        /* renamed from: b */
        public boolean mo31935b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: c.q.d.f0$b */
    /* compiled from: ManifestSchemaFactory */
    public static class C6914b implements C6951l0 {

        /* renamed from: a */
        public C6951l0[] f13226a;

        public C6914b(C6951l0... l0VarArr) {
            this.f13226a = l0VarArr;
        }

        /* renamed from: a */
        public C6947k0 mo31934a(Class<?> cls) {
            for (C6951l0 l0Var : this.f13226a) {
                if (l0Var.mo31935b(cls)) {
                    return l0Var.mo31934a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        /* renamed from: b */
        public boolean mo31935b(Class<?> cls) {
            for (C6951l0 b : this.f13226a) {
                if (b.mo31935b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C6912f0() {
        this(m19809b());
    }

    /* renamed from: b */
    public static C6951l0 m19809b() {
        return new C6914b(C6995w.m20689c(), m19810c());
    }

    /* renamed from: c */
    public static C6951l0 m19810c() {
        try {
            return (C6951l0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(RootsOracle.GET_GLOBAL_INSTANCE, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f13224b;
        }
    }

    /* renamed from: d */
    public static boolean m19811d(C6947k0 k0Var) {
        return k0Var.mo31753c() == ProtoSyntax.PROTO2;
    }

    /* renamed from: e */
    public static <T> C6903d1<T> m19812e(Class<T> cls, C6947k0 k0Var) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            if (m19811d(k0Var)) {
                return C6977p0.m20514Q(cls, k0Var, C6987t0.m20638b(), C6899d0.m19668b(), C6915f1.m19830M(), C6984s.m20622b(), C6943j0.m20115b());
            }
            return C6977p0.m20514Q(cls, k0Var, C6987t0.m20638b(), C6899d0.m19668b(), C6915f1.m19830M(), (C6979q<?>) null, C6943j0.m20115b());
        } else if (m19811d(k0Var)) {
            return C6977p0.m20514Q(cls, k0Var, C6987t0.m20637a(), C6899d0.m19667a(), C6915f1.m19825H(), C6984s.m20621a(), C6943j0.m20114a());
        } else {
            return C6977p0.m20514Q(cls, k0Var, C6987t0.m20637a(), C6899d0.m19667a(), C6915f1.m19826I(), (C6979q<?>) null, C6943j0.m20114a());
        }
    }

    /* renamed from: a */
    public <T> C6903d1<T> mo31910a(Class<T> cls) {
        C6915f1.m19827J(cls);
        C6947k0 a = this.f13225a.mo31934a(cls);
        if (!a.mo31751a()) {
            return m19812e(cls, a);
        }
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return C6980q0.m20596l(C6915f1.m19830M(), C6984s.m20622b(), a.mo31752b());
        }
        return C6980q0.m20596l(C6915f1.m19825H(), C6984s.m20621a(), a.mo31752b());
    }

    public C6912f0(C6951l0 l0Var) {
        C6999y.m20708b(l0Var, "messageInfoFactory");
        this.f13225a = l0Var;
    }
}
