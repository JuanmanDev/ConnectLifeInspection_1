package p040c.p311a0.p312a;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;
import p040c.p311a0.p312a.C4129s;

/* renamed from: c.a0.a.t */
/* compiled from: Protos */
public final class C4131t extends GeneratedMessageLite<C4131t, C4132a> implements Object {

    /* renamed from: o */
    public static final C4131t f8698o;

    /* renamed from: p */
    public static volatile C6996w0<C4131t> f8699p;

    /* renamed from: c.a0.a.t$a */
    /* compiled from: Protos */
    public static final class C4132a extends GeneratedMessageLite.C8426a<C4131t, C4132a> implements Object {
        public /* synthetic */ C4132a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C4132a mo25427F(C4129s.C4130a aVar) {
            mo37982s();
            ((C4131t) this.f15530l).mo25425L((C4129s) aVar.build());
            return this;
        }

        /* renamed from: G */
        public C4132a mo25428G(ByteString byteString) {
            mo37982s();
            ((C4131t) this.f15530l).mo25426M(byteString);
            return this;
        }

        public C4132a() {
            super(C4131t.f8698o);
        }
    }

    static {
        C4131t tVar = new C4131t();
        f8698o = tVar;
        GeneratedMessageLite.m23231F(C4131t.class, tVar);
    }

    public C4131t() {
        ByteString byteString = ByteString.EMPTY;
    }

    /* renamed from: K */
    public static C4132a m11299K() {
        return (C4132a) f8698o.mo37969o();
    }

    /* renamed from: L */
    public final void mo25425L(C4129s sVar) {
        sVar.getClass();
    }

    /* renamed from: M */
    public final void mo25426M(ByteString byteString) {
        byteString.getClass();
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4131t();
            case 2:
                return new C4132a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8698o, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\n", new Object[]{"request_", "value_"});
            case 4:
                return f8698o;
            case 5:
                C6996w0<C4131t> w0Var = f8699p;
                if (w0Var == null) {
                    synchronized (C4131t.class) {
                        w0Var = f8699p;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8698o);
                            f8699p = w0Var;
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
