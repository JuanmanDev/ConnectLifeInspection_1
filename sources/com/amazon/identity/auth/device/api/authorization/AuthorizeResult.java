package com.amazon.identity.auth.device.api.authorization;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants$BUNDLE_KEY;

public final class AuthorizeResult implements Parcelable {
    public static final Parcelable.Creator<AuthorizeResult> CREATOR = new C3802a();

    /* renamed from: e */
    public String f6884e;

    /* renamed from: l */
    public String f6885l;

    /* renamed from: m */
    public User f6886m;

    /* renamed from: n */
    public String f6887n;

    /* renamed from: o */
    public String f6888o;

    /* renamed from: com.amazon.identity.auth.device.api.authorization.AuthorizeResult$a */
    public static class C3802a implements Parcelable.Creator<AuthorizeResult> {
        /* renamed from: a */
        public AuthorizeResult createFromParcel(Parcel parcel) {
            return new AuthorizeResult(parcel, (C3802a) null);
        }

        /* renamed from: b */
        public AuthorizeResult[] newArray(int i) {
            return new AuthorizeResult[i];
        }
    }

    public /* synthetic */ AuthorizeResult(Parcel parcel, C3802a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthorizeResult.class != obj.getClass()) {
            return false;
        }
        AuthorizeResult authorizeResult = (AuthorizeResult) obj;
        String str = this.f6884e;
        if (str == null) {
            if (authorizeResult.f6884e != null) {
                return false;
            }
        } else if (!str.equals(authorizeResult.f6884e)) {
            return false;
        }
        String str2 = this.f6885l;
        if (str2 == null) {
            if (authorizeResult.f6885l != null) {
                return false;
            }
        } else if (!str2.equals(authorizeResult.f6885l)) {
            return false;
        }
        User user = this.f6886m;
        if (user == null) {
            if (authorizeResult.f6886m != null) {
                return false;
            }
        } else if (!user.equals(authorizeResult.f6886m)) {
            return false;
        }
        String str3 = this.f6887n;
        if (str3 == null) {
            if (authorizeResult.f6887n != null) {
                return false;
            }
        } else if (!str3.equals(authorizeResult.f6887n)) {
            return false;
        }
        String str4 = this.f6888o;
        if (str4 == null) {
            if (authorizeResult.f6888o != null) {
                return false;
            }
        } else if (!str4.equals(authorizeResult.f6888o)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f6884e;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f6885l;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        User user = this.f6886m;
        int hashCode3 = (hashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        String str3 = this.f6887n;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f6888o;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6884e);
        parcel.writeString(this.f6885l);
        parcel.writeParcelable(this.f6886m, i);
        parcel.writeString(this.f6887n);
        parcel.writeString(this.f6888o);
    }

    public AuthorizeResult(Bundle bundle) {
        this(bundle, (User) null);
    }

    public AuthorizeResult(Bundle bundle, User user) {
        this.f6884e = bundle.getString(AuthzConstants$BUNDLE_KEY.TOKEN.val);
        this.f6885l = bundle.getString(AuthzConstants$BUNDLE_KEY.AUTHORIZATION_CODE.val);
        this.f6887n = bundle.getString(AuthzConstants$BUNDLE_KEY.CLIENT_ID.val);
        this.f6888o = bundle.getString(AuthzConstants$BUNDLE_KEY.REDIRECT_URI.val);
        this.f6886m = user;
    }

    public AuthorizeResult(Parcel parcel) {
        this.f6884e = parcel.readString();
        this.f6885l = parcel.readString();
        this.f6886m = (User) parcel.readParcelable(User.class.getClassLoader());
        this.f6887n = parcel.readString();
        this.f6888o = parcel.readString();
    }
}
