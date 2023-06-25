package p040c.p311a0.p312a;

import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;

/* renamed from: c.a0.a.o */
/* compiled from: Protos */
public final class C4121o extends GeneratedMessageLite<C4121o, C4122a> implements Object {

    /* renamed from: o */
    public static final C4121o f8679o;

    /* renamed from: p */
    public static volatile C6996w0<C4121o> f8680p;

    /* renamed from: c.a0.a.o$a */
    /* compiled from: Protos */
    public static final class C4122a extends GeneratedMessageLite.C8426a<C4121o, C4122a> implements Object {
        public /* synthetic */ C4122a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C4122a mo25396F(int i) {
            mo37982s();
            ((C4121o) this.f15530l).mo25394L(i);
            return this;
        }

        /* renamed from: G */
        public C4122a mo25397G(String str) {
            mo37982s();
            ((C4121o) this.f15530l).mo25395M(str);
            return this;
        }

        public C4122a() {
            super(C4121o.f8679o);
        }
    }

    static {
        C4121o oVar = new C4121o();
        f8679o = oVar;
        GeneratedMessageLite.m23231F(C4121o.class, oVar);
    }

    /* renamed from: K */
    public static C4122a m11242K() {
        return (C4122a) f8679o.mo37969o();
    }

    /* renamed from: L */
    public final void mo25394L(int i) {
    }

    /* renamed from: M */
    public final void mo25395M(String str) {
        str.getClass();
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4121o();
            case 2:
                return new C4122a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8679o, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u000b", new Object[]{"remoteId_", "mtu_"});
            case 4:
                return f8679o;
            case 5:
                C6996w0<C4121o> w0Var = f8680p;
                if (w0Var == null) {
                    synchronized (C4121o.class) {
                        w0Var = f8680p;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8679o);
                            f8680p = w0Var;
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
