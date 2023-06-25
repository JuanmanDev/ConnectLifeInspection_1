package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;
import p040c.p200q.p363c.p400x.C6818e0;
import p040c.p200q.p363c.p400x.C6851r0;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C6851r0();

    /* renamed from: e */
    public Bundle f15460e;

    /* renamed from: l */
    public Map<String, String> f15461l;

    /* renamed from: com.google.firebase.messaging.RemoteMessage$a */
    public static class C8295a {

        /* renamed from: a */
        public final Bundle f15462a = new Bundle();

        /* renamed from: b */
        public final Map<String, String> f15463b = new ArrayMap();

        public C8295a(@NonNull String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f15462a.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        @NonNull
        /* renamed from: a */
        public RemoteMessage mo37478a() {
            Bundle bundle = new Bundle();
            for (Map.Entry next : this.f15463b.entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
            bundle.putAll(this.f15462a);
            this.f15462a.remove("from");
            return new RemoteMessage(bundle);
        }
    }

    public RemoteMessage(Bundle bundle) {
        this.f15460e = bundle;
    }

    @NonNull
    /* renamed from: P */
    public Map<String, String> mo37476P() {
        if (this.f15461l == null) {
            this.f15461l = C6818e0.C6819a.m19349a(this.f15460e);
        }
        return this.f15461l;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        C6851r0.m19473c(this, parcel, i);
    }
}
