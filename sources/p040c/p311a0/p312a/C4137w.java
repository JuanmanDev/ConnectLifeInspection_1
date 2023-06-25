package p040c.p311a0.p312a;

import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;

/* renamed from: c.a0.a.w */
/* compiled from: Protos */
public final class C4137w extends GeneratedMessageLite<C4137w, C4138a> implements Object {

    /* renamed from: t */
    public static final C4137w f8707t;

    /* renamed from: u */
    public static volatile C6996w0<C4137w> f8708u;

    /* renamed from: o */
    public String f8709o = "";

    /* renamed from: p */
    public String f8710p = "";

    /* renamed from: q */
    public String f8711q = "";

    /* renamed from: r */
    public String f8712r = "";

    /* renamed from: s */
    public boolean f8713s;

    /* renamed from: c.a0.a.w$a */
    /* compiled from: Protos */
    public static final class C4138a extends GeneratedMessageLite.C8426a<C4137w, C4138a> implements Object {
        public /* synthetic */ C4138a(C4098d dVar) {
            this();
        }

        public C4138a() {
            super(C4137w.f8707t);
        }
    }

    static {
        C4137w wVar = new C4137w();
        f8707t = wVar;
        GeneratedMessageLite.m23231F(C4137w.class, wVar);
    }

    /* renamed from: N */
    public static C4138a m11326N() {
        return (C4138a) f8707t.mo37969o();
    }

    /* renamed from: I */
    public String mo25440I() {
        return this.f8712r;
    }

    /* renamed from: J */
    public boolean mo25441J() {
        return this.f8713s;
    }

    /* renamed from: K */
    public String mo25442K() {
        return this.f8709o;
    }

    /* renamed from: L */
    public String mo25443L() {
        return this.f8711q;
    }

    /* renamed from: M */
    public String mo25444M() {
        return this.f8710p;
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4137w();
            case 2:
                return new C4138a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8707t, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0007", new Object[]{"remoteId_", "serviceUuid_", "secondaryServiceUuid_", "characteristicUuid_", "enable_"});
            case 4:
                return f8707t;
            case 5:
                C6996w0<C4137w> w0Var = f8708u;
                if (w0Var == null) {
                    synchronized (C4137w.class) {
                        w0Var = f8708u;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8707t);
                            f8708u = w0Var;
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
