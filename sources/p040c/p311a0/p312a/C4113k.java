package p040c.p311a0.p312a;

import com.google.protobuf.GeneratedMessageLite;
import com.pauldemarco.flutter_blue.Protos$BluetoothDevice;
import p040c.p200q.p405d.C6996w0;
import p040c.p200q.p405d.C6999y;

/* renamed from: c.a0.a.k */
/* compiled from: Protos */
public final class C4113k extends GeneratedMessageLite<C4113k, C4114a> implements Object {

    /* renamed from: p */
    public static final C4113k f8667p;

    /* renamed from: q */
    public static volatile C6996w0<C4113k> f8668q;

    /* renamed from: o */
    public C6999y.C7008i<Protos$BluetoothDevice> f8669o = GeneratedMessageLite.m23232s();

    /* renamed from: c.a0.a.k$a */
    /* compiled from: Protos */
    public static final class C4114a extends GeneratedMessageLite.C8426a<C4113k, C4114a> implements Object {
        public /* synthetic */ C4114a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C4114a mo25384F(Protos$BluetoothDevice protos$BluetoothDevice) {
            mo37982s();
            ((C4113k) this.f15530l).mo25382J(protos$BluetoothDevice);
            return this;
        }

        public C4114a() {
            super(C4113k.f8667p);
        }
    }

    static {
        C4113k kVar = new C4113k();
        f8667p = kVar;
        GeneratedMessageLite.m23231F(C4113k.class, kVar);
    }

    /* renamed from: L */
    public static C4114a m11213L() {
        return (C4114a) f8667p.mo37969o();
    }

    /* renamed from: J */
    public final void mo25382J(Protos$BluetoothDevice protos$BluetoothDevice) {
        protos$BluetoothDevice.getClass();
        mo25383K();
        this.f8669o.add(protos$BluetoothDevice);
    }

    /* renamed from: K */
    public final void mo25383K() {
        C6999y.C7008i<Protos$BluetoothDevice> iVar = this.f8669o;
        if (!iVar.mo31823N()) {
            this.f8669o = GeneratedMessageLite.m23236z(iVar);
        }
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4113k();
            case 2:
                return new C4114a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f8667p, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"devices_", Protos$BluetoothDevice.class});
            case 4:
                return f8667p;
            case 5:
                C6996w0<C4113k> w0Var = f8668q;
                if (w0Var == null) {
                    synchronized (C4113k.class) {
                        w0Var = f8668q;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f8667p);
                            f8668q = w0Var;
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
