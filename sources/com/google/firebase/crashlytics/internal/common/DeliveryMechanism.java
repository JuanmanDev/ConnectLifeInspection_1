package com.google.firebase.crashlytics.internal.common;

public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: id */
    public final int f15432id;

    /* access modifiers changed from: public */
    DeliveryMechanism(int i) {
        this.f15432id = i;
    }

    public static DeliveryMechanism determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int getId() {
        return this.f15432id;
    }

    public String toString() {
        return Integer.toString(this.f15432id);
    }
}
