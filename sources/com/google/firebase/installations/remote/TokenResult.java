package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p200q.p363c.p394v.p397r.C6788b;

public abstract class TokenResult {

    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* renamed from: com.google.firebase.installations.remote.TokenResult$a */
    public static abstract class C8292a {
        @NonNull
        /* renamed from: a */
        public abstract TokenResult mo31543a();

        @NonNull
        /* renamed from: b */
        public abstract C8292a mo31544b(@NonNull ResponseCode responseCode);

        @NonNull
        /* renamed from: c */
        public abstract C8292a mo31545c(@NonNull String str);

        @NonNull
        /* renamed from: d */
        public abstract C8292a mo31546d(long j);
    }

    @NonNull
    /* renamed from: a */
    public static C8292a m23006a() {
        C6788b.C6790b bVar = new C6788b.C6790b();
        bVar.mo31546d(0);
        return bVar;
    }

    @Nullable
    /* renamed from: b */
    public abstract ResponseCode mo31537b();

    @Nullable
    /* renamed from: c */
    public abstract String mo31538c();

    @NonNull
    /* renamed from: d */
    public abstract long mo31539d();
}
