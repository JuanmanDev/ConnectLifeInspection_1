package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p267b.p268a.p271f.C3242b;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new C3242b();

    /* renamed from: e */
    public final PendingIntent f8063e;

    public BeginSignInResult(PendingIntent pendingIntent) {
        C3495o.m8908j(pendingIntent);
        this.f8063e = pendingIntent;
    }

    /* renamed from: P */
    public final PendingIntent mo24385P() {
        return this.f8063e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, mo24385P(), i, false);
        C3514a.m8953b(parcel, a);
    }
}
