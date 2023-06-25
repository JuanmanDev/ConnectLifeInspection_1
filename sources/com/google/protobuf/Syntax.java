package com.google.protobuf;

import p040c.p200q.p405d.C6999y;

public enum Syntax implements C6999y.C7002c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);
    
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    public static final C6999y.C7003d<Syntax> internalValueMap = null;
    public final int value;

    /* renamed from: com.google.protobuf.Syntax$a */
    public static class C8433a implements C6999y.C7003d<Syntax> {
        /* renamed from: b */
        public Syntax mo32428a(int i) {
            return Syntax.forNumber(i);
        }
    }

    /* renamed from: com.google.protobuf.Syntax$b */
    public static final class C8434b implements C6999y.C7004e {

        /* renamed from: a */
        public static final C6999y.C7004e f15542a = null;

        static {
            f15542a = new C8434b();
        }

        /* renamed from: a */
        public boolean mo32429a(int i) {
            return Syntax.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C8433a();
    }

    /* access modifiers changed from: public */
    Syntax(int i) {
        this.value = i;
    }

    public static Syntax forNumber(int i) {
        if (i == 0) {
            return SYNTAX_PROTO2;
        }
        if (i != 1) {
            return null;
        }
        return SYNTAX_PROTO3;
    }

    public static C6999y.C7003d<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static C6999y.C7004e internalGetVerifier() {
        return C8434b.f15542a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Syntax valueOf(int i) {
        return forNumber(i);
    }
}
