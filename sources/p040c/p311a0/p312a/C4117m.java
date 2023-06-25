package p040c.p311a0.p312a;

import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;

/* renamed from: c.a0.a.m */
/* compiled from: Protos */
public final class C4117m extends GeneratedMessageLite<C4117m, C4118a> implements Object {

    /* renamed from: o */
    public static final C4117m f8673o;

    /* renamed from: p */
    public static volatile C6996w0<C4117m> f8674p;

    /* renamed from: c.a0.a.m$a */
    /* compiled from: Protos */
    public static final class C4118a extends GeneratedMessageLite.C8426a<C4117m, C4118a> implements Object {
        public /* synthetic */ C4118a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C4118a mo25391F(int i) {
            mo37982s();
            ((C4117m) this.f15530l).mo25390K(i);
            return this;
        }

        public C4118a() {
            super(C4117m.f8673o);
        }
    }

    static {
        C4117m mVar = new C4117m();
        f8673o = mVar;
        GeneratedMessageLite.m23231F(C4117m.class, mVar);
    }

    /* renamed from: J */
    public static C4118a m11230J() {
        return (C4118a) f8673o.mo37969o();
    }

    /* renamed from: K */
    public final void mo25390K(int i) {
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4117m();
            case 2:
                return new C4118a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8673o, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return f8673o;
            case 5:
                C6996w0<C4117m> w0Var = f8674p;
                if (w0Var == null) {
                    synchronized (C4117m.class) {
                        w0Var = f8674p;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8673o);
                            f8674p = w0Var;
                        }
                    }
                }
                return w0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
