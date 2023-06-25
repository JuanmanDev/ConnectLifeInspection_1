package p040c.p311a0.p312a;

import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;

/* renamed from: c.a0.a.x */
/* compiled from: Protos */
public final class C4139x extends GeneratedMessageLite<C4139x, C4140a> implements Object {

    /* renamed from: o */
    public static final C4139x f8714o;

    /* renamed from: p */
    public static volatile C6996w0<C4139x> f8715p;

    /* renamed from: c.a0.a.x$a */
    /* compiled from: Protos */
    public static final class C4140a extends GeneratedMessageLite.C8426a<C4139x, C4140a> implements Object {
        public /* synthetic */ C4140a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C4140a mo25447F(C4103f fVar) {
            mo37982s();
            ((C4139x) this.f15530l).mo25445L(fVar);
            return this;
        }

        /* renamed from: G */
        public C4140a mo25448G(String str) {
            mo37982s();
            ((C4139x) this.f15530l).mo25446M(str);
            return this;
        }

        public C4140a() {
            super(C4139x.f8714o);
        }
    }

    static {
        C4139x xVar = new C4139x();
        f8714o = xVar;
        GeneratedMessageLite.m23231F(C4139x.class, xVar);
    }

    /* renamed from: K */
    public static C4140a m11336K() {
        return (C4140a) f8714o.mo37969o();
    }

    /* renamed from: L */
    public final void mo25445L(C4103f fVar) {
        fVar.getClass();
    }

    /* renamed from: M */
    public final void mo25446M(String str) {
        str.getClass();
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4139x();
            case 2:
                return new C4140a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8714o, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0007", new Object[]{"remoteId_", "characteristic_", "success_"});
            case 4:
                return f8714o;
            case 5:
                C6996w0<C4139x> w0Var = f8715p;
                if (w0Var == null) {
                    synchronized (C4139x.class) {
                        w0Var = f8715p;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8714o);
                            f8715p = w0Var;
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
