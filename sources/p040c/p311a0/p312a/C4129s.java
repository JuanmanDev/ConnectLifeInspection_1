package p040c.p311a0.p312a;

import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;

/* renamed from: c.a0.a.s */
/* compiled from: Protos */
public final class C4129s extends GeneratedMessageLite<C4129s, C4130a> implements Object {

    /* renamed from: t */
    public static final C4129s f8691t;

    /* renamed from: u */
    public static volatile C6996w0<C4129s> f8692u;

    /* renamed from: o */
    public String f8693o = "";

    /* renamed from: p */
    public String f8694p = "";

    /* renamed from: q */
    public String f8695q = "";

    /* renamed from: r */
    public String f8696r = "";

    /* renamed from: s */
    public String f8697s = "";

    /* renamed from: c.a0.a.s$a */
    /* compiled from: Protos */
    public static final class C4130a extends GeneratedMessageLite.C8426a<C4129s, C4130a> implements Object {
        public /* synthetic */ C4130a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C4130a mo25420F(String str) {
            mo37982s();
            ((C4129s) this.f15530l).mo25415T(str);
            return this;
        }

        /* renamed from: G */
        public C4130a mo25421G(String str) {
            mo37982s();
            ((C4129s) this.f15530l).mo25416U(str);
            return this;
        }

        /* renamed from: H */
        public C4130a mo25422H(String str) {
            mo37982s();
            ((C4129s) this.f15530l).mo25417V(str);
            return this;
        }

        /* renamed from: I */
        public C4130a mo25423I(String str) {
            mo37982s();
            ((C4129s) this.f15530l).mo25418W(str);
            return this;
        }

        /* renamed from: J */
        public C4130a mo25424J(String str) {
            mo37982s();
            ((C4129s) this.f15530l).mo25419X(str);
            return this;
        }

        public C4130a() {
            super(C4129s.f8691t);
        }
    }

    static {
        C4129s sVar = new C4129s();
        f8691t = sVar;
        GeneratedMessageLite.m23231F(C4129s.class, sVar);
    }

    /* renamed from: S */
    public static C4130a m11279S() {
        return (C4130a) f8691t.mo37969o();
    }

    /* renamed from: N */
    public String mo25410N() {
        return this.f8697s;
    }

    /* renamed from: O */
    public String mo25411O() {
        return this.f8694p;
    }

    /* renamed from: P */
    public String mo25412P() {
        return this.f8693o;
    }

    /* renamed from: Q */
    public String mo25413Q() {
        return this.f8696r;
    }

    /* renamed from: R */
    public String mo25414R() {
        return this.f8695q;
    }

    /* renamed from: T */
    public final void mo25415T(String str) {
        str.getClass();
        this.f8697s = str;
    }

    /* renamed from: U */
    public final void mo25416U(String str) {
        str.getClass();
        this.f8694p = str;
    }

    /* renamed from: V */
    public final void mo25417V(String str) {
        str.getClass();
        this.f8693o = str;
    }

    /* renamed from: W */
    public final void mo25418W(String str) {
        str.getClass();
        this.f8696r = str;
    }

    /* renamed from: X */
    public final void mo25419X(String str) {
        str.getClass();
        this.f8695q = str;
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4129s();
            case 2:
                return new C4130a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8691t, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"remoteId_", "descriptorUuid_", "serviceUuid_", "secondaryServiceUuid_", "characteristicUuid_"});
            case 4:
                return f8691t;
            case 5:
                C6996w0<C4129s> w0Var = f8692u;
                if (w0Var == null) {
                    synchronized (C4129s.class) {
                        w0Var = f8692u;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8691t);
                            f8692u = w0Var;
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
