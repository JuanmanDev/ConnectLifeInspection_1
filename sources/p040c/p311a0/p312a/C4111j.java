package p040c.p311a0.p312a;

import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;

/* renamed from: c.a0.a.j */
/* compiled from: Protos */
public final class C4111j extends GeneratedMessageLite<C4111j, C4112a> implements Object {

    /* renamed from: q */
    public static final C4111j f8663q;

    /* renamed from: r */
    public static volatile C6996w0<C4111j> f8664r;

    /* renamed from: o */
    public String f8665o = "";

    /* renamed from: p */
    public boolean f8666p;

    /* renamed from: c.a0.a.j$a */
    /* compiled from: Protos */
    public static final class C4112a extends GeneratedMessageLite.C8426a<C4111j, C4112a> implements Object {
        public /* synthetic */ C4112a(C4098d dVar) {
            this();
        }

        public C4112a() {
            super(C4111j.f8663q);
        }
    }

    static {
        C4111j jVar = new C4111j();
        f8663q = jVar;
        GeneratedMessageLite.m23231F(C4111j.class, jVar);
    }

    /* renamed from: K */
    public static C4112a m11207K() {
        return (C4112a) f8663q.mo37969o();
    }

    /* renamed from: I */
    public boolean mo25380I() {
        return this.f8666p;
    }

    /* renamed from: J */
    public String mo25381J() {
        return this.f8665o;
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4111j();
            case 2:
                return new C4112a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8663q, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"remoteId_", "androidAutoConnect_"});
            case 4:
                return f8663q;
            case 5:
                C6996w0<C4111j> w0Var = f8664r;
                if (w0Var == null) {
                    synchronized (C4111j.class) {
                        w0Var = f8664r;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8663q);
                            f8664r = w0Var;
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
