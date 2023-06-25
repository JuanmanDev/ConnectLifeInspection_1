package com.google.protobuf;

import p040c.p200q.p405d.C6999y;

public enum Field$Cardinality implements C6999y.C7002c {
    CARDINALITY_UNKNOWN(0),
    CARDINALITY_OPTIONAL(1),
    CARDINALITY_REQUIRED(2),
    CARDINALITY_REPEATED(3),
    UNRECOGNIZED(-1);
    
    public static final int CARDINALITY_OPTIONAL_VALUE = 1;
    public static final int CARDINALITY_REPEATED_VALUE = 3;
    public static final int CARDINALITY_REQUIRED_VALUE = 2;
    public static final int CARDINALITY_UNKNOWN_VALUE = 0;
    public static final C6999y.C7003d<Field$Cardinality> internalValueMap = null;
    public final int value;

    /* renamed from: com.google.protobuf.Field$Cardinality$a */
    public static class C8420a implements C6999y.C7003d<Field$Cardinality> {
        /* renamed from: b */
        public Field$Cardinality mo32428a(int i) {
            return Field$Cardinality.forNumber(i);
        }
    }

    /* renamed from: com.google.protobuf.Field$Cardinality$b */
    public static final class C8421b implements C6999y.C7004e {

        /* renamed from: a */
        public static final C6999y.C7004e f15515a = null;

        static {
            f15515a = new C8421b();
        }

        /* renamed from: a */
        public boolean mo32429a(int i) {
            return Field$Cardinality.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C8420a();
    }

    /* access modifiers changed from: public */
    Field$Cardinality(int i) {
        this.value = i;
    }

    public static Field$Cardinality forNumber(int i) {
        if (i == 0) {
            return CARDINALITY_UNKNOWN;
        }
        if (i == 1) {
            return CARDINALITY_OPTIONAL;
        }
        if (i == 2) {
            return CARDINALITY_REQUIRED;
        }
        if (i != 3) {
            return null;
        }
        return CARDINALITY_REPEATED;
    }

    public static C6999y.C7003d<Field$Cardinality> internalGetValueMap() {
        return internalValueMap;
    }

    public static C6999y.C7004e internalGetVerifier() {
        return C8421b.f15515a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Field$Cardinality valueOf(int i) {
        return forNumber(i);
    }
}
