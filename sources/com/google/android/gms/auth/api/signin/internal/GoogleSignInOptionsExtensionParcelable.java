package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e.C3260c;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C3260c();

    /* renamed from: e */
    public final int f8134e;

    /* renamed from: l */
    public int f8135l;

    /* renamed from: m */
    public Bundle f8136m;

    public GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.f8134e = i;
        this.f8135l = i2;
        this.f8136m = bundle;
    }

    /* renamed from: P */
    public int mo24458P() {
        return this.f8135l;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8134e);
        C3514a.m8963l(parcel, 2, mo24458P());
        C3514a.m8956e(parcel, 3, this.f8136m, false);
        C3514a.m8953b(parcel, a);
    }
}
