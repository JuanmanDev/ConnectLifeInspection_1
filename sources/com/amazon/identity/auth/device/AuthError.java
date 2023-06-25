package com.amazon.identity.auth.device;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

public class AuthError extends Exception implements Parcelable, IInterface {
    public static final String AUTH_ERROR_EXECEPTION = "AUTH_ERROR_EXECEPTION";
    public static final Parcelable.Creator<AuthError> CREATOR = new C3799a();
    public static final String LOG_TAG = AuthError.class.getName();
    public static final int RESULT_AUTH_ERROR = 1;
    public static final long serialVersionUID = 1;
    public final ERROR_TYPE _type;

    public enum ERROR_CATEGORY {
        ACTION,
        BAD_REQUEST,
        NETWORK,
        INTERNAL,
        UNKNOWN
    }

    public enum ERROR_TYPE {
        ERROR_INVALID_TOKEN(ERROR_CATEGORY.ACTION, 1),
        ERROR_INVALID_GRANT(ERROR_CATEGORY.ACTION, 2),
        ERROR_INVALID_CLIENT(ERROR_CATEGORY.ACTION, 3),
        ERROR_INVALID_SCOPE(ERROR_CATEGORY.ACTION, 4),
        ERROR_UNAUTHORIZED_CLIENT(ERROR_CATEGORY.ACTION, 5),
        ERROR_WEBVIEW_SSL(ERROR_CATEGORY.ACTION, 6),
        ERROR_ACCESS_DENIED(ERROR_CATEGORY.ACTION, 7),
        ERROR_COM(ERROR_CATEGORY.NETWORK, 8),
        ERROR_IO(ERROR_CATEGORY.NETWORK, 9),
        ERROR_BAD_PARAM(ERROR_CATEGORY.INTERNAL, 10),
        ERROR_JSON(ERROR_CATEGORY.INTERNAL, 11),
        ERROR_PARSE(ERROR_CATEGORY.INTERNAL, 12),
        ERROR_SERVER_REPSONSE(ERROR_CATEGORY.INTERNAL, 13),
        ERROR_DATA_STORAGE(ERROR_CATEGORY.INTERNAL, 14),
        ERROR_THREAD(ERROR_CATEGORY.INTERNAL, 15),
        ERROR_DCP_DMS(ERROR_CATEGORY.ACTION, 16),
        ERROR_FORCE_UPDATE(ERROR_CATEGORY.ACTION, 17),
        ERROR_REVOKE_AUTH(ERROR_CATEGORY.INTERNAL, 18),
        ERROR_AUTH_DIALOG(ERROR_CATEGORY.INTERNAL, 19),
        ERROR_BAD_API_PARAM(ERROR_CATEGORY.BAD_REQUEST, 20),
        ERROR_INIT(ERROR_CATEGORY.BAD_REQUEST, 21),
        ERROR_RESOURCES(ERROR_CATEGORY.BAD_REQUEST, 22),
        ERROR_DIRECTED_ID_NOT_FOUND(ERROR_CATEGORY.BAD_REQUEST, 23),
        ERROR_INVALID_API(ERROR_CATEGORY.BAD_REQUEST, 24),
        ERROR_SECURITY(ERROR_CATEGORY.BAD_REQUEST, 25),
        ERROR_UNKNOWN(ERROR_CATEGORY.UNKNOWN, 26),
        ERROR_REGISTRATION(ERROR_CATEGORY.ACTION, 27),
        ERROR_MISSING_CODE_CHALLENGE(ERROR_CATEGORY.BAD_REQUEST, 28),
        ERROR_MISSING_TOKEN_FOR_REQUIRED_SCOPES(ERROR_CATEGORY.BAD_REQUEST, 29);
        
        public static int ERROR_CODE_V2;
        public final ERROR_CATEGORY _category;
        public final int _value;

        /* access modifiers changed from: public */
        static {
            ERROR_CODE_V2 = 27;
        }

        /* access modifiers changed from: public */
        ERROR_TYPE(ERROR_CATEGORY error_category, int i) {
            this._category = error_category;
            this._value = i;
        }

        public static ERROR_TYPE fromValue(int i) {
            for (ERROR_TYPE error_type : values()) {
                if (error_type.value() == i) {
                    return error_type;
                }
            }
            return ERROR_UNKNOWN;
        }

        public ERROR_CATEGORY getCategory() {
            return this._category;
        }

        public int value() {
            return this._value;
        }
    }

    /* renamed from: com.amazon.identity.auth.device.AuthError$a */
    public static class C3799a implements Parcelable.Creator<AuthError> {
        /* renamed from: a */
        public AuthError createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Throwable th = (Throwable) parcel.readValue(Throwable.class.getClassLoader());
            ERROR_TYPE error_type = (ERROR_TYPE) parcel.readSerializable();
            if (error_type == ERROR_TYPE.ERROR_UNKNOWN) {
                error_type = ERROR_TYPE.fromValue(parcel.readInt());
            }
            return new AuthError(readString, th, error_type);
        }

        /* renamed from: b */
        public AuthError[] newArray(int i) {
            return new AuthError[i];
        }
    }

    public AuthError(String str, ERROR_TYPE error_type) {
        super(str);
        this._type = error_type;
    }

    public static AuthError extractError(Intent intent) {
        try {
            return (AuthError) intent.getParcelableExtra(AUTH_ERROR_EXECEPTION);
        } catch (Exception unused) {
            C1485a.m829b(LOG_TAG, "Error Extracting AuthError");
            return null;
        }
    }

    public static <T> AuthError getAuthError(Throwable th, Class<T> cls) {
        return getAuthError(th, cls, ERROR_TYPE.ERROR_UNKNOWN);
    }

    public static Bundle getErrorBundle(AuthError authError) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(AUTH_ERROR_EXECEPTION, authError);
        return bundle;
    }

    public IBinder asBinder() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public ERROR_CATEGORY getCategory() {
        return this._type.getCategory();
    }

    public ERROR_TYPE getType() {
        return this._type;
    }

    public String toString() {
        return "AuthError cat= " + this._type.getCategory() + " type=" + this._type + " - " + super.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getMessage());
        if (getCause() != null) {
            parcel.writeValue(getCause());
        } else {
            parcel.writeValue((Object) null);
        }
        if (this._type.value() < ERROR_TYPE.ERROR_CODE_V2) {
            parcel.writeSerializable(this._type);
        } else {
            parcel.writeSerializable(ERROR_TYPE.ERROR_UNKNOWN);
        }
        parcel.writeInt(this._type.value());
    }

    public static <T> AuthError getAuthError(Throwable th, Class<T> cls, ERROR_TYPE error_type) {
        return new AuthError("Unexpected error in " + cls.getName(), th, error_type);
    }

    public AuthError(String str, Throwable th, ERROR_TYPE error_type) {
        super(str, th);
        this._type = error_type;
    }

    public static AuthError extractError(Bundle bundle) {
        try {
            return (AuthError) bundle.getParcelable(AUTH_ERROR_EXECEPTION);
        } catch (Exception unused) {
            C1485a.m829b(LOG_TAG, "Error Extracting AuthError");
            return null;
        }
    }

    public static Bundle getErrorBundle(Intent intent) {
        return getErrorBundle(extractError(intent));
    }

    public static <T> Bundle getErrorBundle(Throwable th, Class<T> cls, ERROR_TYPE error_type) {
        return getErrorBundle(getAuthError(th, cls, error_type));
    }

    public AuthError(Parcel parcel) {
        this(parcel.readString(), (Throwable) parcel.readValue(Throwable.class.getClassLoader()), (ERROR_TYPE) parcel.readSerializable());
    }
}
