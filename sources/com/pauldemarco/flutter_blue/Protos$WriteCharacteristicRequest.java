package com.pauldemarco.flutter_blue;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import p040c.p200q.p405d.C6996w0;
import p040c.p200q.p405d.C6999y;
import p040c.p311a0.p312a.C4098d;

public final class Protos$WriteCharacteristicRequest extends GeneratedMessageLite<Protos$WriteCharacteristicRequest, C8760a> implements Object {

    /* renamed from: u */
    public static final Protos$WriteCharacteristicRequest f16749u;

    /* renamed from: v */
    public static volatile C6996w0<Protos$WriteCharacteristicRequest> f16750v;

    /* renamed from: o */
    public String f16751o = "";

    /* renamed from: p */
    public String f16752p = "";

    /* renamed from: q */
    public String f16753q = "";

    /* renamed from: r */
    public String f16754r = "";

    /* renamed from: s */
    public int f16755s;

    /* renamed from: t */
    public ByteString f16756t = ByteString.EMPTY;

    public enum WriteType implements C6999y.C7002c {
        WITH_RESPONSE(0),
        WITHOUT_RESPONSE(1),
        UNRECOGNIZED(-1);
        
        public static final int WITHOUT_RESPONSE_VALUE = 1;
        public static final int WITH_RESPONSE_VALUE = 0;
        public static final C6999y.C7003d<WriteType> internalValueMap = null;
        public final int value;

        /* renamed from: com.pauldemarco.flutter_blue.Protos$WriteCharacteristicRequest$WriteType$a */
        public class C8758a implements C6999y.C7003d<WriteType> {
            /* renamed from: b */
            public WriteType mo32428a(int i) {
                return WriteType.forNumber(i);
            }
        }

        /* renamed from: com.pauldemarco.flutter_blue.Protos$WriteCharacteristicRequest$WriteType$b */
        public static final class C8759b implements C6999y.C7004e {

            /* renamed from: a */
            public static final C6999y.C7004e f16757a = null;

            static {
                f16757a = new C8759b();
            }

            /* renamed from: a */
            public boolean mo32429a(int i) {
                return WriteType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C8758a();
        }

        /* access modifiers changed from: public */
        WriteType(int i) {
            this.value = i;
        }

        public static WriteType forNumber(int i) {
            if (i == 0) {
                return WITH_RESPONSE;
            }
            if (i != 1) {
                return null;
            }
            return WITHOUT_RESPONSE;
        }

        public static C6999y.C7003d<WriteType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C6999y.C7004e internalGetVerifier() {
            return C8759b.f16757a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static WriteType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.pauldemarco.flutter_blue.Protos$WriteCharacteristicRequest$a */
    public static final class C8760a extends GeneratedMessageLite.C8426a<Protos$WriteCharacteristicRequest, C8760a> implements Object {
        public /* synthetic */ C8760a(C4098d dVar) {
            this();
        }

        /* renamed from: F */
        public C8760a mo45667F(String str) {
            mo37982s();
            ((Protos$WriteCharacteristicRequest) this.f15530l).mo45663S(str);
            return this;
        }

        /* renamed from: G */
        public C8760a mo45668G(String str) {
            mo37982s();
            ((Protos$WriteCharacteristicRequest) this.f15530l).mo45664T(str);
            return this;
        }

        /* renamed from: H */
        public C8760a mo45669H(String str) {
            mo37982s();
            ((Protos$WriteCharacteristicRequest) this.f15530l).mo45665U(str);
            return this;
        }

        public C8760a() {
            super(Protos$WriteCharacteristicRequest.f16749u);
        }
    }

    static {
        Protos$WriteCharacteristicRequest protos$WriteCharacteristicRequest = new Protos$WriteCharacteristicRequest();
        f16749u = protos$WriteCharacteristicRequest;
        GeneratedMessageLite.m23231F(Protos$WriteCharacteristicRequest.class, protos$WriteCharacteristicRequest);
    }

    /* renamed from: R */
    public static C8760a m23534R() {
        return (C8760a) f16749u.mo37969o();
    }

    /* renamed from: L */
    public String mo45657L() {
        return this.f16752p;
    }

    /* renamed from: M */
    public String mo45658M() {
        return this.f16751o;
    }

    /* renamed from: N */
    public String mo45659N() {
        return this.f16754r;
    }

    /* renamed from: O */
    public String mo45660O() {
        return this.f16753q;
    }

    /* renamed from: P */
    public ByteString mo45661P() {
        return this.f16756t;
    }

    /* renamed from: Q */
    public WriteType mo45662Q() {
        WriteType forNumber = WriteType.forNumber(this.f16755s);
        return forNumber == null ? WriteType.UNRECOGNIZED : forNumber;
    }

    /* renamed from: S */
    public final void mo45663S(String str) {
        str.getClass();
        this.f16752p = str;
    }

    /* renamed from: T */
    public final void mo45664T(String str) {
        str.getClass();
        this.f16751o = str;
    }

    /* renamed from: U */
    public final void mo45665U(String str) {
        str.getClass();
        this.f16753q = str;
    }

    /* renamed from: r */
    public final Object mo25271r(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4098d.f8644a[methodToInvoke.ordinal()]) {
            case 1:
                return new Protos$WriteCharacteristicRequest();
            case 2:
                return new C8760a((C4098d) null);
            case 3:
                return GeneratedMessageLite.m23229C(f16749u, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f\u0006\n", new Object[]{"remoteId_", "characteristicUuid_", "serviceUuid_", "secondaryServiceUuid_", "writeType_", "value_"});
            case 4:
                return f16749u;
            case 5:
                C6996w0<Protos$WriteCharacteristicRequest> w0Var = f16750v;
                if (w0Var == null) {
                    synchronized (Protos$WriteCharacteristicRequest.class) {
                        w0Var = f16750v;
                        if (w0Var == null) {
                            w0Var = new GeneratedMessageLite.C8427b<>(f16749u);
                            f16750v = w0Var;
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
