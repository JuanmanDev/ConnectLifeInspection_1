package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p267b.p268a.p270e.C3239e;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new C3239e();

    /* renamed from: e */
    public final int f8042e;

    /* renamed from: l */
    public final CredentialPickerConfig f8043l;

    /* renamed from: m */
    public final boolean f8044m;

    /* renamed from: n */
    public final boolean f8045n;

    /* renamed from: o */
    public final String[] f8046o;

    /* renamed from: p */
    public final boolean f8047p;
    @Nullable

    /* renamed from: q */
    public final String f8048q;
    @Nullable

    /* renamed from: r */
    public final String f8049r;

    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, @Nullable String str, @Nullable String str2) {
        this.f8042e = i;
        C3495o.m8908j(credentialPickerConfig);
        this.f8043l = credentialPickerConfig;
        this.f8044m = z;
        this.f8045n = z2;
        C3495o.m8908j(strArr);
        this.f8046o = strArr;
        if (this.f8042e < 2) {
            this.f8047p = true;
            this.f8048q = null;
            this.f8049r = null;
            return;
        }
        this.f8047p = z3;
        this.f8048q = str;
        this.f8049r = str2;
    }

    @NonNull
    /* renamed from: P */
    public final String[] mo24357P() {
        return this.f8046o;
    }

    @NonNull
    /* renamed from: Q */
    public final CredentialPickerConfig mo24358Q() {
        return this.f8043l;
    }

    @Nullable
    /* renamed from: R */
    public final String mo24359R() {
        return this.f8049r;
    }

    @Nullable
    /* renamed from: S */
    public final String mo24360S() {
        return this.f8048q;
    }

    /* renamed from: T */
    public final boolean mo24361T() {
        return this.f8044m;
    }

    /* renamed from: U */
    public final boolean mo24362U() {
        return this.f8047p;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, mo24358Q(), i, false);
        C3514a.m8954c(parcel, 2, mo24361T());
        C3514a.m8954c(parcel, 3, this.f8045n);
        C3514a.m8971t(parcel, 4, mo24357P(), false);
        C3514a.m8954c(parcel, 5, mo24362U());
        C3514a.m8970s(parcel, 6, mo24360S(), false);
        C3514a.m8970s(parcel, 7, mo24359R(), false);
        C3514a.m8963l(parcel, 1000, this.f8042e);
        C3514a.m8953b(parcel, a);
    }
}
