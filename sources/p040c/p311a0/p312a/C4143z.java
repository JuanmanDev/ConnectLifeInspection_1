package p040c.p311a0.p312a;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;

/* renamed from: c.a0.a.z */
/* compiled from: Protos */
public final class C4143z extends GeneratedMessageLite<C4143z, C4144a> implements Object {

    /* renamed from: u */
    public static final C4143z f8718u;

    /* renamed from: v */
    public static volatile C6996w0<C4143z> f8719v;

    /* renamed from: o */
    public String f8720o = "";

    /* renamed from: p */
    public String f8721p = "";

    /* renamed from: q */
    public String f8722q = "";

    /* renamed from: r */
    public String f8723r = "";

    /* renamed from: s */
    public String f8724s = "";

    /* renamed from: t */
    public ByteString f8725t = ByteString.EMPTY;

    /* renamed from: c.a0.a.z$a */
    /* compiled from: Protos */
    public static final class C4144a extends GeneratedMessageLite.C8426a<C4143z, C4144a> implements Object {
        public /* synthetic */ C4144a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C4144a mo25463F(String str) {
            mo37982s();
            ((C4143z) this.f15530l).mo25459T(str);
            return this;
        }

        /* renamed from: G */
        public C4144a mo25464G(String str) {
            mo37982s();
            ((C4143z) this.f15530l).mo25460U(str);
            return this;
        }

        /* renamed from: H */
        public C4144a mo25465H(String str) {
            mo37982s();
            ((C4143z) this.f15530l).mo25461V(str);
            return this;
        }

        /* renamed from: I */
        public C4144a mo25466I(String str) {
            mo37982s();
            ((C4143z) this.f15530l).mo25462W(str);
            return this;
        }

        public C4144a() {
            super(C4143z.f8718u);
        }
    }

    static {
        C4143z zVar = new C4143z();
        f8718u = zVar;
        GeneratedMessageLite.m23231F(C4143z.class, zVar);
    }

    /* renamed from: S */
    public static C4144a m11356S() {
        return (C4144a) f8718u.mo37969o();
    }

    /* renamed from: M */
    public String mo25453M() {
        return this.f8724s;
    }

    /* renamed from: N */
    public String mo25454N() {
        return this.f8721p;
    }

    /* renamed from: O */
    public String mo25455O() {
        return this.f8720o;
    }

    /* renamed from: P */
    public String mo25456P() {
        return this.f8723r;
    }

    /* renamed from: Q */
    public String mo25457Q() {
        return this.f8722q;
    }

    /* renamed from: R */
    public ByteString mo25458R() {
        return this.f8725t;
    }

    /* renamed from: T */
    public final void mo25459T(String str) {
        str.getClass();
        this.f8724s = str;
    }

    /* renamed from: U */
    public final void mo25460U(String str) {
        str.getClass();
        this.f8721p = str;
    }

    /* renamed from: V */
    public final void mo25461V(String str) {
        str.getClass();
        this.f8720o = str;
    }

    /* renamed from: W */
    public final void mo25462W(String str) {
        str.getClass();
        this.f8722q = str;
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4143z();
            case 2:
                return new C4144a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8718u, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\n", new Object[]{"remoteId_", "descriptorUuid_", "serviceUuid_", "secondaryServiceUuid_", "characteristicUuid_", "value_"});
            case 4:
                return f8718u;
            case 5:
                C6996w0<C4143z> w0Var = f8719v;
                if (w0Var == null) {
                    synchronized (C4143z.class) {
                        w0Var = f8719v;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8718u);
                            f8719v = w0Var;
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
