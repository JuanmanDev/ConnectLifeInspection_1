package p040c.p311a0.p312a;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import java.util.Map;
import p040c.p200q.p405d.C6917g0;
import p040c.p200q.p405d.C6996w0;
import p040c.p200q.p405d.C6999y;
import p040c.p311a0.p312a.C4117m;

/* renamed from: c.a0.a.e */
/* compiled from: Protos */
public final class C4099e extends GeneratedMessageLite<C4099e, C4100a> implements Object {

    /* renamed from: r */
    public static final C4099e f8645r;

    /* renamed from: s */
    public static volatile C6996w0<C4099e> f8646s;

    /* renamed from: o */
    public MapFieldLite<Integer, ByteString> f8647o = MapFieldLite.emptyMapField();

    /* renamed from: p */
    public MapFieldLite<String, ByteString> f8648p = MapFieldLite.emptyMapField();

    /* renamed from: q */
    public C6999y.C7008i<String> f8649q = GeneratedMessageLite.m23232s();

    /* renamed from: c.a0.a.e$a */
    /* compiled from: Protos */
    public static final class C4100a extends GeneratedMessageLite.C8426a<C4099e, C4100a> implements Object {
        public /* synthetic */ C4100a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C4100a mo25317F(String str) {
            mo37982s();
            ((C4099e) this.f15530l).mo25308O(str);
            return this;
        }

        /* renamed from: G */
        public C4100a mo25318G(int i, ByteString byteString) {
            byteString.getClass();
            mo37982s();
            ((C4099e) this.f15530l).mo25310Q().put(Integer.valueOf(i), byteString);
            return this;
        }

        /* renamed from: H */
        public C4100a mo25319H(String str, ByteString byteString) {
            str.getClass();
            byteString.getClass();
            mo37982s();
            ((C4099e) this.f15530l).mo25311R().put(str, byteString);
            return this;
        }

        /* renamed from: I */
        public C4100a mo25320I(boolean z) {
            mo37982s();
            ((C4099e) this.f15530l).mo25314V(z);
            return this;
        }

        /* renamed from: J */
        public C4100a mo25321J(String str) {
            mo37982s();
            ((C4099e) this.f15530l).mo25315W(str);
            return this;
        }

        /* renamed from: K */
        public C4100a mo25322K(C4117m.C4118a aVar) {
            mo37982s();
            ((C4099e) this.f15530l).mo25316X((C4117m) aVar.build());
            return this;
        }

        public C4100a() {
            super(C4099e.f8645r);
        }
    }

    /* renamed from: c.a0.a.e$b */
    /* compiled from: Protos */
    public static final class C4101b {

        /* renamed from: a */
        public static final C6917g0<Integer, ByteString> f8650a = C6917g0.m19889d(WireFormat.FieldType.INT32, 0, WireFormat.FieldType.BYTES, ByteString.EMPTY);
    }

    /* renamed from: c.a0.a.e$c */
    /* compiled from: Protos */
    public static final class C4102c {

        /* renamed from: a */
        public static final C6917g0<String, ByteString> f8651a = C6917g0.m19889d(WireFormat.FieldType.STRING, "", WireFormat.FieldType.BYTES, ByteString.EMPTY);
    }

    static {
        C4099e eVar = new C4099e();
        f8645r = eVar;
        GeneratedMessageLite.m23231F(C4099e.class, eVar);
    }

    /* renamed from: U */
    public static C4100a m11093U() {
        return (C4100a) f8645r.mo37969o();
    }

    /* renamed from: O */
    public final void mo25308O(String str) {
        str.getClass();
        mo25309P();
        this.f8649q.add(str);
    }

    /* renamed from: P */
    public final void mo25309P() {
        C6999y.C7008i<String> iVar = this.f8649q;
        if (!iVar.mo31823N()) {
            this.f8649q = GeneratedMessageLite.m23236z(iVar);
        }
    }

    /* renamed from: Q */
    public final Map<Integer, ByteString> mo25310Q() {
        return mo25312S();
    }

    /* renamed from: R */
    public final Map<String, ByteString> mo25311R() {
        return mo25313T();
    }

    /* renamed from: S */
    public final MapFieldLite<Integer, ByteString> mo25312S() {
        if (!this.f8647o.isMutable()) {
            this.f8647o = this.f8647o.mutableCopy();
        }
        return this.f8647o;
    }

    /* renamed from: T */
    public final MapFieldLite<String, ByteString> mo25313T() {
        if (!this.f8648p.isMutable()) {
            this.f8648p = this.f8648p.mutableCopy();
        }
        return this.f8648p;
    }

    /* renamed from: V */
    public final void mo25314V(boolean z) {
    }

    /* renamed from: W */
    public final void mo25315W(String str) {
        str.getClass();
    }

    /* renamed from: X */
    public final void mo25316X(C4117m mVar) {
        mVar.getClass();
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4099e();
            case 2:
                return new C4100a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8645r, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0002\u0001\u0000\u0001Ȉ\u0002\t\u0003\u0007\u00042\u00052\u0006Ț", new Object[]{"localName_", "txPowerLevel_", "connectable_", "manufacturerData_", C4101b.f8650a, "serviceData_", C4102c.f8651a, "serviceUuids_"});
            case 4:
                return f8645r;
            case 5:
                C6996w0<C4099e> w0Var = f8646s;
                if (w0Var == null) {
                    synchronized (C4099e.class) {
                        w0Var = f8646s;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8645r);
                            f8646s = w0Var;
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
