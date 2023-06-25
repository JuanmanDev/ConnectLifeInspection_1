package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p040c.p200q.p201a.p348d.p349a.p350a.C5819e;

@SuppressLint({"RestrictedApi"})
/* compiled from: com.google.android.play:review@@2.0.1 */
public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator<ReviewInfo> CREATOR = new C5819e();

    /* renamed from: a */
    public abstract PendingIntent mo36430a();

    /* renamed from: b */
    public abstract boolean mo36431b();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(mo36430a(), 0);
        parcel.writeInt(mo36431b() ? 1 : 0);
    }
}
