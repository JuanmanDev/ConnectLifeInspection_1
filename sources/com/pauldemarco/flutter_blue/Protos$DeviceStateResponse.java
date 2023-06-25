package com.pauldemarco.flutter_blue;

import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;
import p040c.p200q.p405d.C6999y;
import p040c.p311a0.p312a.C4098d;

public final class Protos$DeviceStateResponse extends GeneratedMessageLite<Protos$DeviceStateResponse, C8757a> implements Object {

    /* renamed from: o */
    public static final Protos$DeviceStateResponse f16746o;

    /* renamed from: p */
    public static volatile C6996w0<Protos$DeviceStateResponse> f16747p;

    public enum BluetoothDeviceState implements C6999y.C7002c {
        DISCONNECTED(0),
        CONNECTING(1),
        CONNECTED(2),
        DISCONNECTING(3),
        UNRECOGNIZED(-1);
        
        public static final int CONNECTED_VALUE = 2;
        public static final int CONNECTING_VALUE = 1;
        public static final int DISCONNECTED_VALUE = 0;
        public static final int DISCONNECTING_VALUE = 3;
        public static final C6999y.C7003d<BluetoothDeviceState> internalValueMap = null;
        public final int value;

        /* renamed from: com.pauldemarco.flutter_blue.Protos$DeviceStateResponse$BluetoothDeviceState$a */
        public class C8755a implements C6999y.C7003d<BluetoothDeviceState> {
            /* renamed from: b */
            public BluetoothDeviceState mo32428a(int i) {
                return BluetoothDeviceState.forNumber(i);
            }
        }

        /* renamed from: com.pauldemarco.flutter_blue.Protos$DeviceStateResponse$BluetoothDeviceState$b */
        public static final class C8756b implements C6999y.C7004e {

            /* renamed from: a */
            public static final C6999y.C7004e f16748a = null;

            static {
                f16748a = new C8756b();
            }

            /* renamed from: a */
            public boolean mo32429a(int i) {
                return BluetoothDeviceState.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C8755a();
        }

        /* access modifiers changed from: public */
        BluetoothDeviceState(int i) {
            this.value = i;
        }

        public static BluetoothDeviceState forNumber(int i) {
            if (i == 0) {
                return DISCONNECTED;
            }
            if (i == 1) {
                return CONNECTING;
            }
            if (i == 2) {
                return CONNECTED;
            }
            if (i != 3) {
                return null;
            }
            return DISCONNECTING;
        }

        public static C6999y.C7003d<BluetoothDeviceState> internalGetValueMap() {
            return internalValueMap;
        }

        public static C6999y.C7004e internalGetVerifier() {
            return C8756b.f16748a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static BluetoothDeviceState valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.pauldemarco.flutter_blue.Protos$DeviceStateResponse$a */
    public static final class C8757a extends GeneratedMessageLite.C8426a<Protos$DeviceStateResponse, C8757a> implements Object {
        public /* synthetic */ C8757a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C8757a mo45655F(String str) {
            mo37982s();
            ((Protos$DeviceStateResponse) this.f15530l).mo45652L(str);
            return this;
        }

        /* renamed from: G */
        public C8757a mo45656G(BluetoothDeviceState bluetoothDeviceState) {
            mo37982s();
            ((Protos$DeviceStateResponse) this.f15530l).mo45653M(bluetoothDeviceState);
            return this;
        }

        public C8757a() {
            super(Protos$DeviceStateResponse.f16746o);
        }
    }

    static {
        Protos$DeviceStateResponse protos$DeviceStateResponse = new Protos$DeviceStateResponse();
        f16746o = protos$DeviceStateResponse;
        GeneratedMessageLite.m23231F(Protos$DeviceStateResponse.class, protos$DeviceStateResponse);
    }

    /* renamed from: K */
    public static C8757a m23521K() {
        return (C8757a) f16746o.mo37969o();
    }

    /* renamed from: L */
    public final void mo45652L(String str) {
        str.getClass();
    }

    /* renamed from: M */
    public final void mo45653M(BluetoothDeviceState bluetoothDeviceState) {
        bluetoothDeviceState.getNumber();
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new Protos$DeviceStateResponse();
            case 2:
                return new C8757a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f16746o, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"remoteId_", "state_"});
            case 4:
                return f16746o;
            case 5:
                C6996w0<Protos$DeviceStateResponse> w0Var = f16747p;
                if (w0Var == null) {
                    synchronized (Protos$DeviceStateResponse.class) {
                        w0Var = f16747p;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f16746o);
                            f16747p = w0Var;
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
