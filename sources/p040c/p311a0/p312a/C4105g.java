package p040c.p311a0.p312a;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;

/* renamed from: c.a0.a.g */
/* compiled from: Protos */
public final class C4105g extends GeneratedMessageLite<C4105g, C4106a> implements Object {

    /* renamed from: o */
    public static final C4105g f8655o;

    /* renamed from: p */
    public static volatile C6996w0<C4105g> f8656p;

    /* renamed from: c.a0.a.g$a */
    /* compiled from: Protos */
    public static final class C4106a extends GeneratedMessageLite.C8426a<C4105g, C4106a> implements Object {
        public /* synthetic */ C4106a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C4106a mo25343F(String str) {
            mo37982s();
            ((C4105g) this.f15530l).mo25338O(str);
            return this;
        }

        /* renamed from: G */
        public C4106a mo25344G(String str) {
            mo37982s();
            ((C4105g) this.f15530l).mo25339P(str);
            return this;
        }

        /* renamed from: H */
        public C4106a mo25345H(String str) {
            mo37982s();
            ((C4105g) this.f15530l).mo25340Q(str);
            return this;
        }

        /* renamed from: I */
        public C4106a mo25346I(String str) {
            mo37982s();
            ((C4105g) this.f15530l).mo25341R(str);
            return this;
        }

        /* renamed from: J */
        public C4106a mo25347J(ByteString byteString) {
            mo37982s();
            ((C4105g) this.f15530l).mo25342S(byteString);
            return this;
        }

        public C4106a() {
            super(C4105g.f8655o);
        }
    }

    static {
        C4105g gVar = new C4105g();
        f8655o = gVar;
        GeneratedMessageLite.m23231F(C4105g.class, gVar);
    }

    public C4105g() {
        ByteString byteString = ByteString.EMPTY;
    }

    /* renamed from: N */
    public static C4106a m11141N() {
        return (C4106a) f8655o.mo37969o();
    }

    /* renamed from: O */
    public final void mo25338O(String str) {
        str.getClass();
    }

    /* renamed from: P */
    public final void mo25339P(String str) {
        str.getClass();
    }

    /* renamed from: Q */
    public final void mo25340Q(String str) {
        str.getClass();
    }

    /* renamed from: R */
    public final void mo25341R(String str) {
        str.getClass();
    }

    /* renamed from: S */
    public final void mo25342S(ByteString byteString) {
        byteString.getClass();
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4105g();
            case 2:
                return new C4106a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8655o, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\n", new Object[]{"uuid_", "remoteId_", "serviceUuid_", "characteristicUuid_", "value_"});
            case 4:
                return f8655o;
            case 5:
                C6996w0<C4105g> w0Var = f8656p;
                if (w0Var == null) {
                    synchronized (C4105g.class) {
                        w0Var = f8656p;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8655o);
                            f8656p = w0Var;
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
