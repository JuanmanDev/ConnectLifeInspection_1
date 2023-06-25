package p040c.p311a0.p312a;

import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;

/* renamed from: c.a0.a.n */
/* compiled from: Protos */
public final class C4119n extends GeneratedMessageLite<C4119n, C4120a> implements Object {

    /* renamed from: q */
    public static final C4119n f8675q;

    /* renamed from: r */
    public static volatile C6996w0<C4119n> f8676r;

    /* renamed from: o */
    public String f8677o = "";

    /* renamed from: p */
    public int f8678p;

    /* renamed from: c.a0.a.n$a */
    /* compiled from: Protos */
    public static final class C4120a extends GeneratedMessageLite.C8426a<C4119n, C4120a> implements Object {
        public /* synthetic */ C4120a(C4098d dVar) {
            this();
        }

        public C4120a() {
            super(C4119n.f8675q);
        }
    }

    static {
        C4119n nVar = new C4119n();
        f8675q = nVar;
        GeneratedMessageLite.m23231F(C4119n.class, nVar);
    }

    /* renamed from: K */
    public static C4120a m11235K() {
        return (C4120a) f8675q.mo37969o();
    }

    /* renamed from: I */
    public int mo25392I() {
        return this.f8678p;
    }

    /* renamed from: J */
    public String mo25393J() {
        return this.f8677o;
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4119n();
            case 2:
                return new C4120a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8675q, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u000b", new Object[]{"remoteId_", "mtu_"});
            case 4:
                return f8675q;
            case 5:
                C6996w0<C4119n> w0Var = f8676r;
                if (w0Var == null) {
                    synchronized (C4119n.class) {
                        w0Var = f8676r;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8675q);
                            f8676r = w0Var;
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
