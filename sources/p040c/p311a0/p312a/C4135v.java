package p040c.p311a0.p312a;

import com.google.protobuf.GeneratedMessageLite;
import java.util.List;
import p040c.p200q.p405d.C6996w0;
import p040c.p200q.p405d.C6999y;

/* renamed from: c.a0.a.v */
/* compiled from: Protos */
public final class C4135v extends GeneratedMessageLite<C4135v, C4136a> implements Object {

    /* renamed from: r */
    public static final C4135v f8702r;

    /* renamed from: s */
    public static volatile C6996w0<C4135v> f8703s;

    /* renamed from: o */
    public int f8704o;

    /* renamed from: p */
    public C6999y.C7008i<String> f8705p = GeneratedMessageLite.m23232s();

    /* renamed from: q */
    public boolean f8706q;

    /* renamed from: c.a0.a.v$a */
    /* compiled from: Protos */
    public static final class C4136a extends GeneratedMessageLite.C8426a<C4135v, C4136a> implements Object {
        public /* synthetic */ C4136a(C4098d dVar) {
            this();
        }

        public C4136a() {
            super(C4135v.f8702r);
        }
    }

    static {
        C4135v vVar = new C4135v();
        f8702r = vVar;
        GeneratedMessageLite.m23231F(C4135v.class, vVar);
    }

    /* renamed from: N */
    public static C4136a m11318N() {
        return (C4136a) f8702r.mo37969o();
    }

    /* renamed from: I */
    public boolean mo25435I() {
        return this.f8706q;
    }

    /* renamed from: J */
    public int mo25436J() {
        return this.f8704o;
    }

    /* renamed from: K */
    public String mo25437K(int i) {
        return this.f8705p.get(i);
    }

    /* renamed from: L */
    public int mo25438L() {
        return this.f8705p.size();
    }

    /* renamed from: M */
    public List<String> mo25439M() {
        return this.f8705p;
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4135v();
            case 2:
                return new C4136a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8702r, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ț\u0003\u0007", new Object[]{"androidScanMode_", "serviceUuids_", "allowDuplicates_"});
            case 4:
                return f8702r;
            case 5:
                C6996w0<C4135v> w0Var = f8703s;
                if (w0Var == null) {
                    synchronized (C4135v.class) {
                        w0Var = f8703s;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8702r);
                            f8703s = w0Var;
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
