package p040c.p200q.p201a.p264c.p267b.p268a.p271f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: c.q.a.c.b.a.f.f */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C3246f implements Parcelable.Creator<SavePasswordRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        SignInPassword signInPassword = null;
        String str = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                signInPassword = (SignInPassword) SafeParcelReader.m10962n(parcel, B, SignInPassword.CREATOR);
            } else if (u != 2) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                str = SafeParcelReader.m10963o(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new SavePasswordRequest(signInPassword, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SavePasswordRequest[i];
    }
}
