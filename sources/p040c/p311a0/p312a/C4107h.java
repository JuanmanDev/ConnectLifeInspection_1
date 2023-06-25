package p040c.p311a0.p312a;

import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;
import p040c.p200q.p405d.C6999y;

/* renamed from: c.a0.a.h */
/* compiled from: Protos */
public final class C4107h extends GeneratedMessageLite<C4107h, C4108a> implements Object {

    /* renamed from: q */
    public static final C4107h f8657q;

    /* renamed from: r */
    public static volatile C6996w0<C4107h> f8658r;

    /* renamed from: o */
    public C6999y.C7008i<C4103f> f8659o = GeneratedMessageLite.m23232s();

    /* renamed from: p */
    public C6999y.C7008i<C4107h> f8660p = GeneratedMessageLite.m23232s();

    /* renamed from: c.a0.a.h$a */
    /* compiled from: Protos */
    public static final class C4108a extends GeneratedMessageLite.C8426a<C4107h, C4108a> implements Object {
        public /* synthetic */ C4108a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C4108a mo25355F(C4103f fVar) {
            mo37982s();
            ((C4107h) this.f15530l).mo25348N(fVar);
            return this;
        }

        /* renamed from: G */
        public C4108a mo25356G(C4107h hVar) {
            mo37982s();
            ((C4107h) this.f15530l).mo25349O(hVar);
            return this;
        }

        /* renamed from: H */
        public C4108a mo25357H(boolean z) {
            mo37982s();
            ((C4107h) this.f15530l).mo25352S(z);
            return this;
        }

        /* renamed from: I */
        public C4108a mo25358I(String str) {
            mo37982s();
            ((C4107h) this.f15530l).mo25353T(str);
            return this;
        }

        /* renamed from: J */
        public C4108a mo25359J(String str) {
            mo37982s();
            ((C4107h) this.f15530l).mo25354U(str);
            return this;
        }

        public C4108a() {
            super(C4107h.f8657q);
        }
    }

    static {
        C4107h hVar = new C4107h();
        f8657q = hVar;
        GeneratedMessageLite.m23231F(C4107h.class, hVar);
    }

    /* renamed from: R */
    public static C4108a m11159R() {
        return (C4108a) f8657q.mo37969o();
    }

    /* renamed from: N */
    public final void mo25348N(C4103f fVar) {
        fVar.getClass();
        mo25350P();
        this.f8659o.add(fVar);
    }

    /* renamed from: O */
    public final void mo25349O(C4107h hVar) {
        hVar.getClass();
        mo25351Q();
        this.f8660p.add(hVar);
    }

    /* renamed from: P */
    public final void mo25350P() {
        C6999y.C7008i<C4103f> iVar = this.f8659o;
        if (!iVar.mo31823N()) {
            this.f8659o = GeneratedMessageLite.m23236z(iVar);
        }
    }

    /* renamed from: Q */
    public final void mo25351Q() {
        C6999y.C7008i<C4107h> iVar = this.f8660p;
        if (!iVar.mo31823N()) {
            this.f8660p = GeneratedMessageLite.m23236z(iVar);
        }
    }

    /* renamed from: S */
    public final void mo25352S(boolean z) {
    }

    /* renamed from: T */
    public final void mo25353T(String str) {
        str.getClass();
    }

    /* renamed from: U */
    public final void mo25354U(String str) {
        str.getClass();
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Class<C4107h> cls = C4107h.class;
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4107h();
            case 2:
                return new C4108a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8657q, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004\u001b\u0005\u001b", new Object[]{"uuid_", "remoteId_", "isPrimary_", "characteristics_", C4103f.class, "includedServices_", cls});
            case 4:
                return f8657q;
            case 5:
                C6996w0<C4107h> w0Var = f8658r;
                if (w0Var == null) {
                    synchronized (cls) {
                        w0Var = f8658r;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8657q);
                            f8658r = w0Var;
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
