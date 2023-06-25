package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p275c.C3298c;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class CloudMessage extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<CloudMessage> CREATOR = new C3298c();
    @NonNull

    /* renamed from: e */
    public Intent f8148e;

    public CloudMessage(@NonNull Intent intent) {
        this.f8148e = intent;
    }

    @NonNull
    /* renamed from: P */
    public Intent mo24468P() {
        return this.f8148e;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, this.f8148e, i, false);
        C3514a.m8953b(parcel, a);
    }
}
