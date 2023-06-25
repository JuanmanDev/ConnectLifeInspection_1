package com.google.android.gms.common.server.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @Nullable
    /* renamed from: c */
    public Object mo24625c(@NonNull String str) {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean mo24626e(@NonNull String str) {
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field next : mo24326a().values()) {
            if (mo24328d(next)) {
                if (!fastJsonResponse.mo24328d(next) || !C3487m.m8886a(mo24327b(next), fastJsonResponse.mo24327b(next))) {
                    return false;
                }
            } else if (fastJsonResponse.mo24328d(next)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field next : mo24326a().values()) {
            if (mo24328d(next)) {
                Object b = mo24327b(next);
                C3495o.m8908j(b);
                i = (i * 31) + b.hashCode();
            }
        }
        return i;
    }
}
