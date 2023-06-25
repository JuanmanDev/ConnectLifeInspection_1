package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.p367l.C6414s;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class UserProfileChangeRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new C6414s();
    @Nullable

    /* renamed from: e */
    public String f15369e;
    @Nullable

    /* renamed from: l */
    public String f15370l;

    /* renamed from: m */
    public boolean f15371m;

    /* renamed from: n */
    public boolean f15372n;
    @Nullable

    /* renamed from: o */
    public Uri f15373o;

    /* renamed from: com.google.firebase.auth.UserProfileChangeRequest$a */
    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public static class C8250a {
        @Nullable

        /* renamed from: a */
        public String f15374a;
        @Nullable

        /* renamed from: b */
        public Uri f15375b;

        /* renamed from: c */
        public boolean f15376c;

        /* renamed from: d */
        public boolean f15377d;

        @NonNull
        /* renamed from: a */
        public UserProfileChangeRequest mo37386a() {
            String str;
            String str2 = this.f15374a;
            Uri uri = this.f15375b;
            if (uri == null) {
                str = null;
            } else {
                str = uri.toString();
            }
            return new UserProfileChangeRequest(str2, str, this.f15376c, this.f15377d);
        }
    }

    public UserProfileChangeRequest(@Nullable String str, @Nullable String str2, boolean z, boolean z2) {
        this.f15369e = str;
        this.f15370l = str2;
        this.f15371m = z;
        this.f15372n = z2;
        this.f15373o = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    @Nullable
    /* renamed from: P */
    public String mo37384P() {
        return this.f15369e;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 2, mo37384P(), false);
        C3514a.m8970s(parcel, 3, this.f15370l, false);
        C3514a.m8954c(parcel, 4, this.f15371m);
        C3514a.m8954c(parcel, 5, this.f15372n);
        C3514a.m8953b(parcel, a);
    }
}
