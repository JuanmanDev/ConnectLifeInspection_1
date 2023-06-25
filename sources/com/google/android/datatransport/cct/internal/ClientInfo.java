package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p202a.p203h.p204f.C2363a;
import p040c.p200q.p201a.p202a.p203h.p204f.C2376e;

public abstract class ClientInfo {

    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        public final int value;

        /* access modifiers changed from: public */
        ClientType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.ClientInfo$a */
    public static abstract class C3989a {
        @NonNull
        /* renamed from: a */
        public abstract ClientInfo mo17722a();

        @NonNull
        /* renamed from: b */
        public abstract C3989a mo17723b(@Nullable C2363a aVar);

        @NonNull
        /* renamed from: c */
        public abstract C3989a mo17724c(@Nullable ClientType clientType);
    }

    @NonNull
    /* renamed from: a */
    public static C3989a m10188a() {
        return new C2376e.C2378b();
    }

    @Nullable
    /* renamed from: b */
    public abstract C2363a mo17717b();

    @Nullable
    /* renamed from: c */
    public abstract ClientType mo17718c();
}
