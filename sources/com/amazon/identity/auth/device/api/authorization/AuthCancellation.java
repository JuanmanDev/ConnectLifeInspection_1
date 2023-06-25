package com.amazon.identity.auth.device.api.authorization;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants$BUNDLE_KEY;

public final class AuthCancellation implements Parcelable {
    public static final Parcelable.Creator<AuthCancellation> CREATOR = new C3800a();

    /* renamed from: e */
    public final Cause f6874e;

    /* renamed from: l */
    public final String f6875l;

    public enum Cause {
        FAILED_AUTHENTICATION;

        public static Cause fromCode(int i) {
            return FAILED_AUTHENTICATION;
        }
    }

    /* renamed from: com.amazon.identity.auth.device.api.authorization.AuthCancellation$a */
    public static class C3800a implements Parcelable.Creator<AuthCancellation> {
        /* renamed from: a */
        public AuthCancellation createFromParcel(Parcel parcel) {
            return new AuthCancellation(parcel, (C3800a) null);
        }

        /* renamed from: b */
        public AuthCancellation[] newArray(int i) {
            return new AuthCancellation[i];
        }
    }

    public /* synthetic */ AuthCancellation(Parcel parcel, C3800a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthCancellation.class != obj.getClass()) {
            return false;
        }
        AuthCancellation authCancellation = (AuthCancellation) obj;
        if (this.f6874e != authCancellation.f6874e) {
            return false;
        }
        String str = this.f6875l;
        if (str == null) {
            if (authCancellation.f6875l != null) {
                return false;
            }
        } else if (!str.equals(authCancellation.f6875l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Cause cause = this.f6874e;
        int i = 0;
        int hashCode = ((cause == null ? 0 : cause.hashCode()) + 31) * 31;
        String str = this.f6875l;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return String.format("%s {cause='%s', description='%s'}", new Object[]{super.toString(), this.f6874e.toString(), this.f6875l});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6874e.name());
        parcel.writeString(this.f6875l);
    }

    public AuthCancellation(Parcel parcel) {
        this.f6874e = Cause.valueOf(parcel.readString());
        this.f6875l = parcel.readString();
    }

    public AuthCancellation(Bundle bundle) {
        this(Cause.fromCode(bundle.getInt(AuthzConstants$BUNDLE_KEY.CAUSE_ID.val)), bundle.getString(AuthzConstants$BUNDLE_KEY.ON_CANCEL_DESCRIPTION.val));
    }

    public AuthCancellation(Cause cause, String str) {
        this.f6874e = cause;
        this.f6875l = str;
    }
}
