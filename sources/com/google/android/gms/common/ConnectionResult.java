package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.C3575q;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class ConnectionResult extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C3575q();
    @NonNull

    /* renamed from: o */
    public static final ConnectionResult f8152o = new ConnectionResult(0);

    /* renamed from: e */
    public final int f8153e;

    /* renamed from: l */
    public final int f8154l;
    @Nullable

    /* renamed from: m */
    public final PendingIntent f8155m;
    @Nullable

    /* renamed from: n */
    public final String f8156n;

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    public ConnectionResult(int i, int i2, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        this.f8153e = i;
        this.f8154l = i2;
        this.f8155m = pendingIntent;
        this.f8156n = str;
    }

    @NonNull
    /* renamed from: U */
    public static String m10849U(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i + ")";
                }
        }
    }

    /* renamed from: P */
    public int mo24483P() {
        return this.f8154l;
    }

    @Nullable
    /* renamed from: Q */
    public String mo24484Q() {
        return this.f8156n;
    }

    @Nullable
    /* renamed from: R */
    public PendingIntent mo24485R() {
        return this.f8155m;
    }

    /* renamed from: S */
    public boolean mo24486S() {
        return (this.f8154l == 0 || this.f8155m == null) ? false : true;
    }

    /* renamed from: T */
    public boolean mo24487T() {
        return this.f8154l == 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f8154l == connectionResult.f8154l && C3487m.m8886a(this.f8155m, connectionResult.f8155m) && C3487m.m8886a(this.f8156n, connectionResult.f8156n);
    }

    public int hashCode() {
        return C3487m.m8887b(Integer.valueOf(this.f8154l), this.f8155m, this.f8156n);
    }

    @NonNull
    public String toString() {
        C3487m.C3488a c = C3487m.m8888c(this);
        c.mo20747a("statusCode", m10849U(this.f8154l));
        c.mo20747a("resolution", this.f8155m);
        c.mo20747a("message", this.f8156n);
        return c.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8153e);
        C3514a.m8963l(parcel, 2, mo24483P());
        C3514a.m8968q(parcel, 3, mo24485R(), i, false);
        C3514a.m8970s(parcel, 4, mo24484Q(), false);
        C3514a.m8953b(parcel, a);
    }

    public ConnectionResult(int i, @Nullable PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public ConnectionResult(int i, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        this(1, i, pendingIntent, str);
    }
}
