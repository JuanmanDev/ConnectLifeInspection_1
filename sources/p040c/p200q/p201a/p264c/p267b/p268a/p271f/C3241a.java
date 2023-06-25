package p040c.p200q.p201a.p264c.p267b.p268a.p271f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: c.q.a.c.b.a.f.a */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C3241a implements Parcelable.Creator<BeginSignInRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
        String str = null;
        boolean z = false;
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) SafeParcelReader.m10962n(parcel, B, BeginSignInRequest.PasswordRequestOptions.CREATOR);
            } else if (u == 2) {
                googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) SafeParcelReader.m10962n(parcel, B, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
            } else if (u == 3) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u != 4) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                z = SafeParcelReader.m10970v(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, str, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest[i];
    }
}
