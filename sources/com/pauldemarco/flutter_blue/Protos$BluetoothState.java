package com.pauldemarco.flutter_blue;

import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;
import p040c.p200q.p405d.C6999y;
import p040c.p311a0.p312a.C4098d;

public final class Protos$BluetoothState extends GeneratedMessageLite<Protos$BluetoothState, C8754a> implements Object {

    /* renamed from: o */
    public static final Protos$BluetoothState f16742o;

    /* renamed from: p */
    public static volatile C6996w0<Protos$BluetoothState> f16743p;

    public enum State implements C6999y.C7002c {
        UNKNOWN(0),
        UNAVAILABLE(1),
        UNAUTHORIZED(2),
        TURNING_ON(3),
        ON(4),
        TURNING_OFF(5),
        OFF(6),
        UNRECOGNIZED(-1);
        
        public static final int OFF_VALUE = 6;
        public static final int ON_VALUE = 4;
        public static final int TURNING_OFF_VALUE = 5;
        public static final int TURNING_ON_VALUE = 3;
        public static final int UNAUTHORIZED_VALUE = 2;
        public static final int UNAVAILABLE_VALUE = 1;
        public static final int UNKNOWN_VALUE = 0;
        public static final C6999y.C7003d<State> internalValueMap = null;
        public final int value;

        /* renamed from: com.pauldemarco.flutter_blue.Protos$BluetoothState$State$a */
        public class C8752a implements C6999y.C7003d<State> {
            /* renamed from: b */
            public State mo32428a(int i) {
                return State.forNumber(i);
            }
        }

        /* renamed from: com.pauldemarco.flutter_blue.Protos$BluetoothState$State$b */
        public static final class C8753b implements C6999y.C7004e {

            /* renamed from: a */
            public static final C6999y.C7004e f16745a = null;

            static {
                f16745a = new C8753b();
            }

            /* renamed from: a */
            public boolean mo32429a(int i) {
                return State.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C8752a();
        }

        /* access modifiers changed from: public */
        State(int i) {
            this.value = i;
        }

        public static State forNumber(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return UNAVAILABLE;
                case 2:
                    return UNAUTHORIZED;
                case 3:
                    return TURNING_ON;
                case 4:
                    return ON;
                case 5:
                    return TURNING_OFF;
                case 6:
                    return OFF;
                default:
                    return null;
            }
        }

        public static C6999y.C7003d<State> internalGetValueMap() {
            return internalValueMap;
        }

        public static C6999y.C7004e internalGetVerifier() {
            return C8753b.f16745a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static State valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.pauldemarco.flutter_blue.Protos$BluetoothState$a */
    public static final class C8754a extends GeneratedMessageLite.C8426a<Protos$BluetoothState, C8754a> implements Object {
        public /* synthetic */ C8754a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C8754a mo45651F(State state) {
            mo37982s();
            ((Protos$BluetoothState) this.f15530l).mo45649K(state);
            return this;
        }

        public C8754a() {
            super(Protos$BluetoothState.f16742o);
        }
    }

    static {
        Protos$BluetoothState protos$BluetoothState = new Protos$BluetoothState();
        f16742o = protos$BluetoothState;
        GeneratedMessageLite.m23231F(Protos$BluetoothState.class, protos$BluetoothState);
    }

    /* renamed from: J */
    public static C8754a m23511J() {
        return (C8754a) f16742o.mo37969o();
    }

    /* renamed from: K */
    public final void mo45649K(State state) {
        state.getNumber();
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new Protos$BluetoothState();
            case 2:
                return new C8754a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f16742o, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"state_"});
            case 4:
                return f16742o;
            case 5:
                C6996w0<Protos$BluetoothState> w0Var = f16743p;
                if (w0Var == null) {
                    synchronized (Protos$BluetoothState.class) {
                        w0Var = f16743p;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f16742o);
                            f16743p = w0Var;
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
