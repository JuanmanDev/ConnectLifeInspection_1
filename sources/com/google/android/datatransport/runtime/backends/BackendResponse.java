package com.google.android.datatransport.runtime.backends;

import p040c.p200q.p201a.p202a.p205i.p214x.C2550b;

public abstract class BackendResponse {

    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static BackendResponse m10200a() {
        return new C2550b(Status.FATAL_ERROR, -1);
    }

    /* renamed from: d */
    public static BackendResponse m10201d() {
        return new C2550b(Status.INVALID_PAYLOAD, -1);
    }

    /* renamed from: e */
    public static BackendResponse m10202e(long j) {
        return new C2550b(Status.OK, j);
    }

    /* renamed from: f */
    public static BackendResponse m10203f() {
        return new C2550b(Status.TRANSIENT_ERROR, -1);
    }

    /* renamed from: b */
    public abstract long mo17997b();

    /* renamed from: c */
    public abstract Status mo17998c();
}
