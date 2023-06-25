package p040c.p311a0.p312a;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;
import p040c.p200q.p405d.C6999y;

/* renamed from: c.a0.a.f */
/* compiled from: Protos */
public final class C4103f extends GeneratedMessageLite<C4103f, C4104a> implements Object {

    /* renamed from: p */
    public static final C4103f f8652p;

    /* renamed from: q */
    public static volatile C6996w0<C4103f> f8653q;

    /* renamed from: o */
    public C6999y.C7008i<C4105g> f8654o = GeneratedMessageLite.m23232s();

    /* renamed from: c.a0.a.f$a */
    /* compiled from: Protos */
    public static final class C4104a extends GeneratedMessageLite.C8426a<C4103f, C4104a> implements Object {
        public /* synthetic */ C4104a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C4104a mo25331F(C4105g gVar) {
            mo37982s();
            ((C4103f) this.f15530l).mo25323P(gVar);
            return this;
        }

        /* renamed from: G */
        public C4104a mo25332G(C4109i iVar) {
            mo37982s();
            ((C4103f) this.f15530l).mo25325S(iVar);
            return this;
        }

        /* renamed from: H */
        public C4104a mo25333H(String str) {
            mo37982s();
            ((C4103f) this.f15530l).mo25326T(str);
            return this;
        }

        /* renamed from: I */
        public C4104a mo25334I(String str) {
            mo37982s();
            ((C4103f) this.f15530l).mo25327U(str);
            return this;
        }

        /* renamed from: J */
        public C4104a mo25335J(String str) {
            mo37982s();
            ((C4103f) this.f15530l).mo25328V(str);
            return this;
        }

        /* renamed from: K */
        public C4104a mo25336K(String str) {
            mo37982s();
            ((C4103f) this.f15530l).mo25329W(str);
            return this;
        }

        /* renamed from: L */
        public C4104a mo25337L(ByteString byteString) {
            mo37982s();
            ((C4103f) this.f15530l).mo25330X(byteString);
            return this;
        }

        public C4104a() {
            super(C4103f.f8652p);
        }
    }

    static {
        C4103f fVar = new C4103f();
        f8652p = fVar;
        GeneratedMessageLite.m23231F(C4103f.class, fVar);
    }

    public C4103f() {
        ByteString byteString = ByteString.EMPTY;
    }

    /* renamed from: R */
    public static C4104a m11118R() {
        return (C4104a) f8652p.mo37969o();
    }

    /* renamed from: P */
    public final void mo25323P(C4105g gVar) {
        gVar.getClass();
        mo25324Q();
        this.f8654o.add(gVar);
    }

    /* renamed from: Q */
    public final void mo25324Q() {
        C6999y.C7008i<C4105g> iVar = this.f8654o;
        if (!iVar.mo31823N()) {
            this.f8654o = GeneratedMessageLite.m23236z(iVar);
        }
    }

    /* renamed from: S */
    public final void mo25325S(C4109i iVar) {
        iVar.getClass();
    }

    /* renamed from: T */
    public final void mo25326T(String str) {
        str.getClass();
    }

    /* renamed from: U */
    public final void mo25327U(String str) {
        str.getClass();
    }

    /* renamed from: V */
    public final void mo25328V(String str) {
        str.getClass();
    }

    /* renamed from: W */
    public final void mo25329W(String str) {
        str.getClass();
    }

    /* renamed from: X */
    public final void mo25330X(ByteString byteString) {
        byteString.getClass();
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4103f();
            case 2:
                return new C4104a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8652p, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u001b\u0006\t\u0007\n", new Object[]{"uuid_", "remoteId_", "serviceUuid_", "secondaryServiceUuid_", "descriptors_", C4105g.class, "properties_", "value_"});
            case 4:
                return f8652p;
            case 5:
                C6996w0<C4103f> w0Var = f8653q;
                if (w0Var == null) {
                    synchronized (C4103f.class) {
                        w0Var = f8653q;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8652p);
                            f8653q = w0Var;
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
