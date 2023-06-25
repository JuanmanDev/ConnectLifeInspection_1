package p040c.p311a0.p312a;

import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;
import p040c.p311a0.p312a.C4143z;

/* renamed from: c.a0.a.a0 */
/* compiled from: Protos */
public final class C4086a0 extends GeneratedMessageLite<C4086a0, C4087a> implements Object {

    /* renamed from: o */
    public static final C4086a0 f8601o;

    /* renamed from: p */
    public static volatile C6996w0<C4086a0> f8602p;

    /* renamed from: c.a0.a.a0$a */
    /* compiled from: Protos */
    public static final class C4087a extends GeneratedMessageLite.C8426a<C4086a0, C4087a> implements Object {
        public /* synthetic */ C4087a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C4087a mo25272F(C4143z.C4144a aVar) {
            mo37982s();
            ((C4086a0) this.f15530l).mo25269L((C4143z) aVar.build());
            return this;
        }

        /* renamed from: G */
        public C4087a mo25273G(boolean z) {
            mo37982s();
            ((C4086a0) this.f15530l).mo25270M(z);
            return this;
        }

        public C4087a() {
            super(C4086a0.f8601o);
        }
    }

    static {
        C4086a0 a0Var = new C4086a0();
        f8601o = a0Var;
        GeneratedMessageLite.m23231F(C4086a0.class, a0Var);
    }

    /* renamed from: K */
    public static C4087a m11048K() {
        return (C4087a) f8601o.mo37969o();
    }

    /* renamed from: L */
    public final void mo25269L(C4143z zVar) {
        zVar.getClass();
    }

    /* renamed from: M */
    public final void mo25270M(boolean z) {
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4086a0();
            case 2:
                return new C4087a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8601o, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0007", new Object[]{"request_", "success_"});
            case 4:
                return f8601o;
            case 5:
                C6996w0<C4086a0> w0Var = f8602p;
                if (w0Var == null) {
                    synchronized (C4086a0.class) {
                        w0Var = f8602p;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8601o);
                            f8602p = w0Var;
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
