package p040c.p311a0.p312a;

import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;

/* renamed from: c.a0.a.p */
/* compiled from: Protos */
public final class C4123p extends GeneratedMessageLite<C4123p, C4124a> implements Object {

    /* renamed from: o */
    public static final C4123p f8681o;

    /* renamed from: p */
    public static volatile C6996w0<C4123p> f8682p;

    /* renamed from: c.a0.a.p$a */
    /* compiled from: Protos */
    public static final class C4124a extends GeneratedMessageLite.C8426a<C4123p, C4124a> implements Object {
        public /* synthetic */ C4124a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C4124a mo25400F(C4103f fVar) {
            mo37982s();
            ((C4123p) this.f15530l).mo25398L(fVar);
            return this;
        }

        /* renamed from: G */
        public C4124a mo25401G(String str) {
            mo37982s();
            ((C4123p) this.f15530l).mo25399M(str);
            return this;
        }

        public C4124a() {
            super(C4123p.f8681o);
        }
    }

    static {
        C4123p pVar = new C4123p();
        f8681o = pVar;
        GeneratedMessageLite.m23231F(C4123p.class, pVar);
    }

    /* renamed from: K */
    public static C4124a m11251K() {
        return (C4124a) f8681o.mo37969o();
    }

    /* renamed from: L */
    public final void mo25398L(C4103f fVar) {
        fVar.getClass();
    }

    /* renamed from: M */
    public final void mo25399M(String str) {
        str.getClass();
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4123p();
            case 2:
                return new C4124a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8681o, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"remoteId_", "characteristic_"});
            case 4:
                return f8681o;
            case 5:
                C6996w0<C4123p> w0Var = f8682p;
                if (w0Var == null) {
                    synchronized (C4123p.class) {
                        w0Var = f8682p;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8681o);
                            f8682p = w0Var;
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
