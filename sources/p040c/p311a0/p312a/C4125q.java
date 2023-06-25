package p040c.p311a0.p312a;

import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;

/* renamed from: c.a0.a.q */
/* compiled from: Protos */
public final class C4125q extends GeneratedMessageLite<C4125q, C4126a> implements Object {

    /* renamed from: s */
    public static final C4125q f8683s;

    /* renamed from: t */
    public static volatile C6996w0<C4125q> f8684t;

    /* renamed from: o */
    public String f8685o = "";

    /* renamed from: p */
    public String f8686p = "";

    /* renamed from: q */
    public String f8687q = "";

    /* renamed from: r */
    public String f8688r = "";

    /* renamed from: c.a0.a.q$a */
    /* compiled from: Protos */
    public static final class C4126a extends GeneratedMessageLite.C8426a<C4125q, C4126a> implements Object {
        public /* synthetic */ C4126a(C4098d dVar) {
            this();
        }

        public C4126a() {
            super(C4125q.f8683s);
        }
    }

    static {
        C4125q qVar = new C4125q();
        f8683s = qVar;
        GeneratedMessageLite.m23231F(C4125q.class, qVar);
    }

    /* renamed from: M */
    public static C4126a m11258M() {
        return (C4126a) f8683s.mo37969o();
    }

    /* renamed from: I */
    public String mo25402I() {
        return this.f8686p;
    }

    /* renamed from: J */
    public String mo25403J() {
        return this.f8685o;
    }

    /* renamed from: K */
    public String mo25404K() {
        return this.f8688r;
    }

    /* renamed from: L */
    public String mo25405L() {
        return this.f8687q;
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4125q();
            case 2:
                return new C4126a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8683s, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"remoteId_", "characteristicUuid_", "serviceUuid_", "secondaryServiceUuid_"});
            case 4:
                return f8683s;
            case 5:
                C6996w0<C4125q> w0Var = f8684t;
                if (w0Var == null) {
                    synchronized (C4125q.class) {
                        w0Var = f8684t;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8683s);
                            f8684t = w0Var;
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
