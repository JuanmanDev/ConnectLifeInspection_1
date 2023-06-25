package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p200q.p363c.p394v.p397r.C6785a;

public abstract class InstallationResponse {

    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    /* renamed from: com.google.firebase.installations.remote.InstallationResponse$a */
    public static abstract class C8291a {
        @NonNull
        /* renamed from: a */
        public abstract InstallationResponse mo31531a();

        @NonNull
        /* renamed from: b */
        public abstract C8291a mo31532b(@NonNull TokenResult tokenResult);

        @NonNull
        /* renamed from: c */
        public abstract C8291a mo31533c(@NonNull String str);

        @NonNull
        /* renamed from: d */
        public abstract C8291a mo31534d(@NonNull String str);

        @NonNull
        /* renamed from: e */
        public abstract C8291a mo31535e(@NonNull ResponseCode responseCode);

        @NonNull
        /* renamed from: f */
        public abstract C8291a mo31536f(@NonNull String str);
    }

    @NonNull
    /* renamed from: a */
    public static C8291a m22994a() {
        return new C6785a.C6787b();
    }

    @Nullable
    /* renamed from: b */
    public abstract TokenResult mo31523b();

    @Nullable
    /* renamed from: c */
    public abstract String mo31524c();

    @Nullable
    /* renamed from: d */
    public abstract String mo31525d();

    @Nullable
    /* renamed from: e */
    public abstract ResponseCode mo31526e();

    @Nullable
    /* renamed from: f */
    public abstract String mo31528f();
}
