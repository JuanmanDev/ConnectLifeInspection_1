package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p264c.p267b.p268a.p271f.C3241a;
import p040c.p200q.p201a.p264c.p267b.p268a.p271f.C3244d;
import p040c.p200q.p201a.p264c.p267b.p268a.p271f.C3245e;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new C3241a();

    /* renamed from: e */
    public final PasswordRequestOptions f8052e;

    /* renamed from: l */
    public final GoogleIdTokenRequestOptions f8053l;
    @Nullable

    /* renamed from: m */
    public final String f8054m;

    /* renamed from: n */
    public final boolean f8055n;

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new C3244d();

        /* renamed from: e */
        public final boolean f8056e;
        @Nullable

        /* renamed from: l */
        public final String f8057l;
        @Nullable

        /* renamed from: m */
        public final String f8058m;

        /* renamed from: n */
        public final boolean f8059n;
        @Nullable

        /* renamed from: o */
        public final String f8060o;
        @Nullable

        /* renamed from: p */
        public final List<String> f8061p;

        public GoogleIdTokenRequestOptions(boolean z, @Nullable String str, @Nullable String str2, boolean z2, @Nullable String str3, @Nullable List<String> list) {
            this.f8056e = z;
            if (z) {
                C3495o.m8909k(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f8057l = str;
            this.f8058m = str2;
            this.f8059n = z2;
            this.f8061p = BeginSignInRequest.m10763S(list);
            this.f8060o = str3;
        }

        /* renamed from: P */
        public final boolean mo24374P() {
            return this.f8059n;
        }

        @Nullable
        /* renamed from: Q */
        public final String mo24375Q() {
            return this.f8058m;
        }

        @Nullable
        /* renamed from: R */
        public final String mo24376R() {
            return this.f8057l;
        }

        /* renamed from: S */
        public final boolean mo24377S() {
            return this.f8056e;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            if (this.f8056e != googleIdTokenRequestOptions.f8056e || !C3487m.m8886a(this.f8057l, googleIdTokenRequestOptions.f8057l) || !C3487m.m8886a(this.f8058m, googleIdTokenRequestOptions.f8058m) || this.f8059n != googleIdTokenRequestOptions.f8059n || !C3487m.m8886a(this.f8060o, googleIdTokenRequestOptions.f8060o) || !C3487m.m8886a(this.f8061p, googleIdTokenRequestOptions.f8061p)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return C3487m.m8887b(Boolean.valueOf(this.f8056e), this.f8057l, this.f8058m, Boolean.valueOf(this.f8059n), this.f8060o, this.f8061p);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C3514a.m8952a(parcel);
            C3514a.m8954c(parcel, 1, mo24377S());
            C3514a.m8970s(parcel, 2, mo24376R(), false);
            C3514a.m8970s(parcel, 3, mo24375Q(), false);
            C3514a.m8954c(parcel, 4, mo24374P());
            C3514a.m8970s(parcel, 5, this.f8060o, false);
            C3514a.m8972u(parcel, 6, this.f8061p, false);
            C3514a.m8953b(parcel, a);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new C3245e();

        /* renamed from: e */
        public final boolean f8062e;

        public PasswordRequestOptions(boolean z) {
            this.f8062e = z;
        }

        /* renamed from: P */
        public final boolean mo24381P() {
            return this.f8062e;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof PasswordRequestOptions) && this.f8062e == ((PasswordRequestOptions) obj).f8062e) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return C3487m.m8887b(Boolean.valueOf(this.f8062e));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C3514a.m8952a(parcel);
            C3514a.m8954c(parcel, 1, mo24381P());
            C3514a.m8953b(parcel, a);
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, @Nullable String str, boolean z) {
        C3495o.m8908j(passwordRequestOptions);
        this.f8052e = passwordRequestOptions;
        C3495o.m8908j(googleIdTokenRequestOptions);
        this.f8053l = googleIdTokenRequestOptions;
        this.f8054m = str;
        this.f8055n = z;
    }

    @Nullable
    /* renamed from: S */
    public static List<String> m10763S(@Nullable List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: P */
    public final GoogleIdTokenRequestOptions mo24368P() {
        return this.f8053l;
    }

    /* renamed from: Q */
    public final PasswordRequestOptions mo24369Q() {
        return this.f8052e;
    }

    /* renamed from: R */
    public final boolean mo24370R() {
        return this.f8055n;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        if (!C3487m.m8886a(this.f8052e, beginSignInRequest.f8052e) || !C3487m.m8886a(this.f8053l, beginSignInRequest.f8053l) || !C3487m.m8886a(this.f8054m, beginSignInRequest.f8054m) || this.f8055n != beginSignInRequest.f8055n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C3487m.m8887b(this.f8052e, this.f8053l, this.f8054m, Boolean.valueOf(this.f8055n));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, mo24369Q(), i, false);
        C3514a.m8968q(parcel, 2, mo24368P(), i, false);
        C3514a.m8970s(parcel, 3, this.f8054m, false);
        C3514a.m8954c(parcel, 4, mo24370R());
        C3514a.m8953b(parcel, a);
    }
}
