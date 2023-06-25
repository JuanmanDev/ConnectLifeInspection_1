package p040c.p311a0.p312a;

import com.google.protobuf.GeneratedMessageLite;
import com.pauldemarco.flutter_blue.Protos$WriteCharacteristicRequest;
import p040c.p200q.p405d.C6996w0;

/* renamed from: c.a0.a.y */
/* compiled from: Protos */
public final class C4141y extends GeneratedMessageLite<C4141y, C4142a> implements Object {

    /* renamed from: o */
    public static final C4141y f8716o;

    /* renamed from: p */
    public static volatile C6996w0<C4141y> f8717p;

    /* renamed from: c.a0.a.y$a */
    /* compiled from: Protos */
    public static final class C4142a extends GeneratedMessageLite.C8426a<C4141y, C4142a> implements Object {
        public /* synthetic */ C4142a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C4142a mo25451F(Protos$WriteCharacteristicRequest.C8760a aVar) {
            mo37982s();
            ((C4141y) this.f15530l).mo25449L((Protos$WriteCharacteristicRequest) aVar.build());
            return this;
        }

        /* renamed from: G */
        public C4142a mo25452G(boolean z) {
            mo37982s();
            ((C4141y) this.f15530l).mo25450M(z);
            return this;
        }

        public C4142a() {
            super(C4141y.f8716o);
        }
    }

    static {
        C4141y yVar = new C4141y();
        f8716o = yVar;
        GeneratedMessageLite.m23231F(C4141y.class, yVar);
    }

    /* renamed from: K */
    public static C4142a m11345K() {
        return (C4142a) f8716o.mo37969o();
    }

    /* renamed from: L */
    public final void mo25449L(Protos$WriteCharacteristicRequest protos$WriteCharacteristicRequest) {
        protos$WriteCharacteristicRequest.getClass();
    }

    /* renamed from: M */
    public final void mo25450M(boolean z) {
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4141y();
            case 2:
                return new C4142a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8716o, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0007", new Object[]{"request_", "success_"});
            case 4:
                return f8716o;
            case 5:
                C6996w0<C4141y> w0Var = f8717p;
                if (w0Var == null) {
                    synchronized (C4141y.class) {
                        w0Var = f8717p;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8716o);
                            f8717p = w0Var;
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
