package com.pauldemarco.flutter_blue;

import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;
import p040c.p200q.p405d.C6999y;
import p040c.p311a0.p312a.C4098d;

public final class Protos$BluetoothDevice extends GeneratedMessageLite<Protos$BluetoothDevice, C8751a> implements Object {

    /* renamed from: o */
    public static final Protos$BluetoothDevice f16738o;

    /* renamed from: p */
    public static volatile C6996w0<Protos$BluetoothDevice> f16739p;

    public enum Type implements C6999y.C7002c {
        UNKNOWN(0),
        CLASSIC(1),
        LE(2),
        DUAL(3),
        UNRECOGNIZED(-1);
        
        public static final int CLASSIC_VALUE = 1;
        public static final int DUAL_VALUE = 3;
        public static final int LE_VALUE = 2;
        public static final int UNKNOWN_VALUE = 0;
        public static final C6999y.C7003d<Type> internalValueMap = null;
        public final int value;

        /* renamed from: com.pauldemarco.flutter_blue.Protos$BluetoothDevice$Type$a */
        public class C8749a implements C6999y.C7003d<Type> {
            /* renamed from: b */
            public Type mo32428a(int i) {
                return Type.forNumber(i);
            }
        }

        /* renamed from: com.pauldemarco.flutter_blue.Protos$BluetoothDevice$Type$b */
        public static final class C8750b implements C6999y.C7004e {

            /* renamed from: a */
            public static final C6999y.C7004e f16741a = null;

            static {
                f16741a = new C8750b();
            }

            /* renamed from: a */
            public boolean mo32429a(int i) {
                return Type.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C8749a();
        }

        /* access modifiers changed from: public */
        Type(int i) {
            this.value = i;
        }

        public static Type forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return CLASSIC;
            }
            if (i == 2) {
                return LE;
            }
            if (i != 3) {
                return null;
            }
            return DUAL;
        }

        public static C6999y.C7003d<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public static C6999y.C7004e internalGetVerifier() {
            return C8750b.f16741a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Type valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.pauldemarco.flutter_blue.Protos$BluetoothDevice$a */
    public static final class C8751a extends GeneratedMessageLite.C8426a<Protos$BluetoothDevice, C8751a> implements Object {
        public /* synthetic */ C8751a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C8751a mo45646F(String str) {
            mo37982s();
            ((Protos$BluetoothDevice) this.f15530l).mo45642M(str);
            return this;
        }

        /* renamed from: G */
        public C8751a mo45647G(String str) {
            mo37982s();
            ((Protos$BluetoothDevice) this.f15530l).mo45643N(str);
            return this;
        }

        /* renamed from: H */
        public C8751a mo45648H(Type type) {
            mo37982s();
            ((Protos$BluetoothDevice) this.f15530l).mo45644O(type);
            return this;
        }

        public C8751a() {
            super(Protos$BluetoothDevice.f16738o);
        }
    }

    static {
        Protos$BluetoothDevice protos$BluetoothDevice = new Protos$BluetoothDevice();
        f16738o = protos$BluetoothDevice;
        GeneratedMessageLite.m23231F(Protos$BluetoothDevice.class, protos$BluetoothDevice);
    }

    /* renamed from: L */
    public static C8751a m23498L() {
        return (C8751a) f16738o.mo37969o();
    }

    /* renamed from: M */
    public final void mo45642M(String str) {
        str.getClass();
    }

    /* renamed from: N */
    public final void mo45643N(String str) {
        str.getClass();
    }

    /* renamed from: O */
    public final void mo45644O(Type type) {
        type.getNumber();
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new Protos$BluetoothDevice();
            case 2:
                return new C8751a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f16738o, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"remoteId_", "name_", "type_"});
            case 4:
                return f16738o;
            case 5:
                C6996w0<Protos$BluetoothDevice> w0Var = f16739p;
                if (w0Var == null) {
                    synchronized (Protos$BluetoothDevice.class) {
                        w0Var = f16739p;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f16738o);
                            f16739p = w0Var;
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
