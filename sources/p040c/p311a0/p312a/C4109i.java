package p040c.p311a0.p312a;

import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;

/* renamed from: c.a0.a.i */
/* compiled from: Protos */
public final class C4109i extends GeneratedMessageLite<C4109i, C4110a> implements Object {

    /* renamed from: o */
    public static final C4109i f8661o;

    /* renamed from: p */
    public static volatile C6996w0<C4109i> f8662p;

    /* renamed from: c.a0.a.i$a */
    /* compiled from: Protos */
    public static final class C4110a extends GeneratedMessageLite.C8426a<C4109i, C4110a> implements Object {
        public /* synthetic */ C4110a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C4110a mo25370F(boolean z) {
            mo37982s();
            ((C4109i) this.f15530l).mo25360T(z);
            return this;
        }

        /* renamed from: G */
        public C4110a mo25371G(boolean z) {
            mo37982s();
            ((C4109i) this.f15530l).mo25361U(z);
            return this;
        }

        /* renamed from: H */
        public C4110a mo25372H(boolean z) {
            mo37982s();
            ((C4109i) this.f15530l).mo25362V(z);
            return this;
        }

        /* renamed from: I */
        public C4110a mo25373I(boolean z) {
            mo37982s();
            ((C4109i) this.f15530l).mo25363W(z);
            return this;
        }

        /* renamed from: J */
        public C4110a mo25374J(boolean z) {
            mo37982s();
            ((C4109i) this.f15530l).mo25364X(z);
            return this;
        }

        /* renamed from: K */
        public C4110a mo25375K(boolean z) {
            mo37982s();
            ((C4109i) this.f15530l).mo25365Y(z);
            return this;
        }

        /* renamed from: L */
        public C4110a mo25376L(boolean z) {
            mo37982s();
            ((C4109i) this.f15530l).mo25366Z(z);
            return this;
        }

        /* renamed from: M */
        public C4110a mo25377M(boolean z) {
            mo37982s();
            ((C4109i) this.f15530l).mo25367a0(z);
            return this;
        }

        /* renamed from: N */
        public C4110a mo25378N(boolean z) {
            mo37982s();
            ((C4109i) this.f15530l).mo25368b0(z);
            return this;
        }

        /* renamed from: P */
        public C4110a mo25379P(boolean z) {
            mo37982s();
            ((C4109i) this.f15530l).mo25369c0(z);
            return this;
        }

        public C4110a() {
            super(C4109i.f8661o);
        }
    }

    static {
        C4109i iVar = new C4109i();
        f8661o = iVar;
        GeneratedMessageLite.m23231F(C4109i.class, iVar);
    }

    /* renamed from: S */
    public static C4110a m11184S() {
        return (C4110a) f8661o.mo37969o();
    }

    /* renamed from: T */
    public final void mo25360T(boolean z) {
    }

    /* renamed from: U */
    public final void mo25361U(boolean z) {
    }

    /* renamed from: V */
    public final void mo25362V(boolean z) {
    }

    /* renamed from: W */
    public final void mo25363W(boolean z) {
    }

    /* renamed from: X */
    public final void mo25364X(boolean z) {
    }

    /* renamed from: Y */
    public final void mo25365Y(boolean z) {
    }

    /* renamed from: Z */
    public final void mo25366Z(boolean z) {
    }

    /* renamed from: a0 */
    public final void mo25367a0(boolean z) {
    }

    /* renamed from: b0 */
    public final void mo25368b0(boolean z) {
    }

    /* renamed from: c0 */
    public final void mo25369c0(boolean z) {
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4109i();
            case 2:
                return new C4110a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8661o, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007", new Object[]{"broadcast_", "read_", "writeWithoutResponse_", "write_", "notify_", "indicate_", "authenticatedSignedWrites_", "extendedProperties_", "notifyEncryptionRequired_", "indicateEncryptionRequired_"});
            case 4:
                return f8661o;
            case 5:
                C6996w0<C4109i> w0Var = f8662p;
                if (w0Var == null) {
                    synchronized (C4109i.class) {
                        w0Var = f8662p;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8661o);
                            f8662p = w0Var;
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
