package p040c.p311a0.p312a;

import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;

/* renamed from: c.a0.a.r */
/* compiled from: Protos */
public final class C4127r extends GeneratedMessageLite<C4127r, C4128a> implements Object {

    /* renamed from: o */
    public static final C4127r f8689o;

    /* renamed from: p */
    public static volatile C6996w0<C4127r> f8690p;

    /* renamed from: c.a0.a.r$a */
    /* compiled from: Protos */
    public static final class C4128a extends GeneratedMessageLite.C8426a<C4127r, C4128a> implements Object {
        public /* synthetic */ C4128a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C4128a mo25408F(C4103f fVar) {
            mo37982s();
            ((C4127r) this.f15530l).mo25406L(fVar);
            return this;
        }

        /* renamed from: G */
        public C4128a mo25409G(String str) {
            mo37982s();
            ((C4127r) this.f15530l).mo25407M(str);
            return this;
        }

        public C4128a() {
            super(C4127r.f8689o);
        }
    }

    static {
        C4127r rVar = new C4127r();
        f8689o = rVar;
        GeneratedMessageLite.m23231F(C4127r.class, rVar);
    }

    /* renamed from: K */
    public static C4128a m11267K() {
        return (C4128a) f8689o.mo37969o();
    }

    /* renamed from: L */
    public final void mo25406L(C4103f fVar) {
        fVar.getClass();
    }

    /* renamed from: M */
    public final void mo25407M(String str) {
        str.getClass();
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4127r();
            case 2:
                return new C4128a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8689o, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"remoteId_", "characteristic_"});
            case 4:
                return f8689o;
            case 5:
                C6996w0<C4127r> w0Var = f8690p;
                if (w0Var == null) {
                    synchronized (C4127r.class) {
                        w0Var = f8690p;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8689o);
                            f8690p = w0Var;
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
