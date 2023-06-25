package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p267b.p268a.p271f.C3247g;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new C3247g();

    /* renamed from: e */
    public final PendingIntent f8069e;

    public SavePasswordResult(PendingIntent pendingIntent) {
        C3495o.m8908j(pendingIntent);
        this.f8069e = pendingIntent;
    }

    /* renamed from: P */
    public PendingIntent mo24396P() {
        return this.f8069e;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SavePasswordResult)) {
            return false;
        }
        return C3487m.m8886a(this.f8069e, ((SavePasswordResult) obj).f8069e);
    }

    public int hashCode() {
        return C3487m.m8887b(this.f8069e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, mo24396P(), i, false);
        C3514a.m8953b(parcel, a);
    }
}
