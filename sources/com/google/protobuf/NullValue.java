package com.google.protobuf;

import p040c.p200q.p405d.C6999y;

public enum NullValue implements C6999y.C7002c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    
    public static final int NULL_VALUE_VALUE = 0;
    public static final C6999y.C7003d<NullValue> internalValueMap = null;
    public final int value;

    /* renamed from: com.google.protobuf.NullValue$a */
    public static class C8431a implements C6999y.C7003d<NullValue> {
        /* renamed from: b */
        public NullValue mo32428a(int i) {
            return NullValue.forNumber(i);
        }
    }

    /* renamed from: com.google.protobuf.NullValue$b */
    public static final class C8432b implements C6999y.C7004e {

        /* renamed from: a */
        public static final C6999y.C7004e f15541a = null;

        static {
            f15541a = new C8432b();
        }

        /* renamed from: a */
        public boolean mo32429a(int i) {
            return NullValue.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C8431a();
    }

    /* access modifiers changed from: public */
    NullValue(int i) {
        this.value = i;
    }

    public static NullValue forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static C6999y.C7003d<NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static C6999y.C7004e internalGetVerifier() {
        return C8432b.f15541a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static NullValue valueOf(int i) {
        return forNumber(i);
    }
}
