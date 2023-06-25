package p040c.p311a0.p312a;

import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;
import p040c.p200q.p405d.C6999y;

/* renamed from: c.a0.a.l */
/* compiled from: Protos */
public final class C4115l extends GeneratedMessageLite<C4115l, C4116a> implements Object {

    /* renamed from: p */
    public static final C4115l f8670p;

    /* renamed from: q */
    public static volatile C6996w0<C4115l> f8671q;

    /* renamed from: o */
    public C6999y.C7008i<C4107h> f8672o = GeneratedMessageLite.m23232s();

    /* renamed from: c.a0.a.l$a */
    /* compiled from: Protos */
    public static final class C4116a extends GeneratedMessageLite.C8426a<C4115l, C4116a> implements Object {
        public /* synthetic */ C4116a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C4116a mo25388F(C4107h hVar) {
            mo37982s();
            ((C4115l) this.f15530l).mo25385K(hVar);
            return this;
        }

        /* renamed from: G */
        public C4116a mo25389G(String str) {
            mo37982s();
            ((C4115l) this.f15530l).mo25387N(str);
            return this;
        }

        public C4116a() {
            super(C4115l.f8670p);
        }
    }

    static {
        C4115l lVar = new C4115l();
        f8670p = lVar;
        GeneratedMessageLite.m23231F(C4115l.class, lVar);
    }

    /* renamed from: M */
    public static C4116a m11221M() {
        return (C4116a) f8670p.mo37969o();
    }

    /* renamed from: K */
    public final void mo25385K(C4107h hVar) {
        hVar.getClass();
        mo25386L();
        this.f8672o.add(hVar);
    }

    /* renamed from: L */
    public final void mo25386L() {
        C6999y.C7008i<C4107h> iVar = this.f8672o;
        if (!iVar.mo31823N()) {
            this.f8672o = GeneratedMessageLite.m23236z(iVar);
        }
    }

    /* renamed from: N */
    public final void mo25387N(String str) {
        str.getClass();
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4115l();
            case 2:
                return new C4116a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8670p, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"remoteId_", "services_", C4107h.class});
            case 4:
                return f8670p;
            case 5:
                C6996w0<C4115l> w0Var = f8671q;
                if (w0Var == null) {
                    synchronized (C4115l.class) {
                        w0Var = f8671q;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8670p);
                            f8671q = w0Var;
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
