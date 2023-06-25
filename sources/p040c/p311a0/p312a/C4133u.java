package p040c.p311a0.p312a;

import com.google.protobuf.GeneratedMessageLite;
import com.pauldemarco.flutter_blue.Protos$BluetoothDevice;
import p040c.p200q.p405d.C6996w0;

/* renamed from: c.a0.a.u */
/* compiled from: Protos */
public final class C4133u extends GeneratedMessageLite<C4133u, C4134a> implements Object {

    /* renamed from: o */
    public static final C4133u f8700o;

    /* renamed from: p */
    public static volatile C6996w0<C4133u> f8701p;

    /* renamed from: c.a0.a.u$a */
    /* compiled from: Protos */
    public static final class C4134a extends GeneratedMessageLite.C8426a<C4133u, C4134a> implements Object {
        public /* synthetic */ C4134a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C4134a mo25432F(C4099e eVar) {
            mo37982s();
            ((C4133u) this.f15530l).mo25429M(eVar);
            return this;
        }

        /* renamed from: G */
        public C4134a mo25433G(Protos$BluetoothDevice protos$BluetoothDevice) {
            mo37982s();
            ((C4133u) this.f15530l).mo25430N(protos$BluetoothDevice);
            return this;
        }

        /* renamed from: H */
        public C4134a mo25434H(int i) {
            mo37982s();
            ((C4133u) this.f15530l).mo25431O(i);
            return this;
        }

        public C4134a() {
            super(C4133u.f8700o);
        }
    }

    static {
        C4133u uVar = new C4133u();
        f8700o = uVar;
        GeneratedMessageLite.m23231F(C4133u.class, uVar);
    }

    /* renamed from: L */
    public static C4134a m11309L() {
        return (C4134a) f8700o.mo37969o();
    }

    /* renamed from: M */
    public final void mo25429M(C4099e eVar) {
        eVar.getClass();
    }

    /* renamed from: N */
    public final void mo25430N(Protos$BluetoothDevice protos$BluetoothDevice) {
        protos$BluetoothDevice.getClass();
    }

    /* renamed from: O */
    public final void mo25431O(int i) {
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4133u();
            case 2:
                return new C4134a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8700o, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0004", new Object[]{"device_", "advertisementData_", "rssi_"});
            case 4:
                return f8700o;
            case 5:
                C6996w0<C4133u> w0Var = f8701p;
                if (w0Var == null) {
                    synchronized (C4133u.class) {
                        w0Var = f8701p;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8700o);
                            f8701p = w0Var;
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
