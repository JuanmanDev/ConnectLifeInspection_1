package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p267b.p268a.p270e.C3238d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new C3238d();

    /* renamed from: e */
    public final int f8033e;

    /* renamed from: l */
    public final boolean f8034l;

    /* renamed from: m */
    public final String[] f8035m;

    /* renamed from: n */
    public final CredentialPickerConfig f8036n;

    /* renamed from: o */
    public final CredentialPickerConfig f8037o;

    /* renamed from: p */
    public final boolean f8038p;
    @Nullable

    /* renamed from: q */
    public final String f8039q;
    @Nullable

    /* renamed from: r */
    public final String f8040r;

    /* renamed from: s */
    public final boolean f8041s;

    public CredentialRequest(int i, boolean z, String[] strArr, @Nullable CredentialPickerConfig credentialPickerConfig, @Nullable CredentialPickerConfig credentialPickerConfig2, boolean z2, @Nullable String str, @Nullable String str2, boolean z3) {
        this.f8033e = i;
        this.f8034l = z;
        C3495o.m8908j(strArr);
        this.f8035m = strArr;
        this.f8036n = credentialPickerConfig == null ? new CredentialPickerConfig.C4068a().mo24348a() : credentialPickerConfig;
        this.f8037o = credentialPickerConfig2 == null ? new CredentialPickerConfig.C4068a().mo24348a() : credentialPickerConfig2;
        if (i < 3) {
            this.f8038p = true;
            this.f8039q = null;
            this.f8040r = null;
        } else {
            this.f8038p = z2;
            this.f8039q = str;
            this.f8040r = str2;
        }
        this.f8041s = z3;
    }

    @NonNull
    /* renamed from: P */
    public final String[] mo24349P() {
        return this.f8035m;
    }

    @NonNull
    /* renamed from: Q */
    public final CredentialPickerConfig mo24350Q() {
        return this.f8037o;
    }

    @NonNull
    /* renamed from: R */
    public final CredentialPickerConfig mo24351R() {
        return this.f8036n;
    }

    @Nullable
    /* renamed from: S */
    public final String mo24352S() {
        return this.f8040r;
    }

    @Nullable
    /* renamed from: T */
    public final String mo24353T() {
        return this.f8039q;
    }

    /* renamed from: U */
    public final boolean mo24354U() {
        return this.f8038p;
    }

    /* renamed from: V */
    public final boolean mo24355V() {
        return this.f8034l;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8954c(parcel, 1, mo24355V());
        C3514a.m8971t(parcel, 2, mo24349P(), false);
        C3514a.m8968q(parcel, 3, mo24351R(), i, false);
        C3514a.m8968q(parcel, 4, mo24350Q(), i, false);
        C3514a.m8954c(parcel, 5, mo24354U());
        C3514a.m8970s(parcel, 6, mo24353T(), false);
        C3514a.m8970s(parcel, 7, mo24352S(), false);
        C3514a.m8954c(parcel, 8, this.f8041s);
        C3514a.m8963l(parcel, 1000, this.f8033e);
        C3514a.m8953b(parcel, a);
    }
}
