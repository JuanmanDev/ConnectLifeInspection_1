package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.zze;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.p367l.p368h.C6380f0;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzr implements AuthResult {
    public static final Parcelable.Creator<zzr> CREATOR = new C6380f0();
    @NonNull

    /* renamed from: e */
    public zzx f15399e;
    @Nullable

    /* renamed from: l */
    public zzp f15400l;
    @Nullable

    /* renamed from: m */
    public zze f15401m;

    public zzr(zzx zzx) {
        C3495o.m8908j(zzx);
        zzx zzx2 = zzx;
        this.f15399e = zzx2;
        List i0 = zzx2.mo37410i0();
        this.f15400l = null;
        for (int i = 0; i < i0.size(); i++) {
            if (!TextUtils.isEmpty(((zzt) i0.get(i)).zza())) {
                this.f15400l = new zzp(((zzt) i0.get(i)).mo30456y(), ((zzt) i0.get(i)).zza(), zzx.mo37414m0());
            }
        }
        if (this.f15400l == null) {
            this.f15400l = new zzp(zzx.mo37414m0());
        }
        this.f15401m = zzx.mo37406e0();
    }

    public zzr(@NonNull zzx zzx, @Nullable zzp zzp, @Nullable zze zze) {
        this.f15399e = zzx;
        this.f15400l = zzp;
        this.f15401m = zze;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, this.f15399e, i, false);
        C3514a.m8968q(parcel, 2, this.f15400l, i, false);
        C3514a.m8968q(parcel, 3, this.f15401m, i, false);
        C3514a.m8953b(parcel, a);
    }
}
