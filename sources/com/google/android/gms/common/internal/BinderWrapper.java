package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import p040c.p200q.p201a.p264c.p276d.p281j.C3477i1;
import p040c.p200q.p201a.p264c.p276d.p281j.C3480j1;

@KeepName
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class BinderWrapper implements Parcelable {
    @NonNull
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new C3477i1();

    /* renamed from: e */
    public IBinder f8239e;

    public /* synthetic */ BinderWrapper(Parcel parcel, C3480j1 j1Var) {
        this.f8239e = parcel.readStrongBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f8239e);
    }
}
