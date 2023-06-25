package p040c.p200q.p201a.p264c.p267b.p268a.p273h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: c.q.a.c.b.a.h.l */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C3286l implements Parcelable.Creator<SignInAccount> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 4) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u == 7) {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m10962n(parcel, B, GoogleSignInAccount.CREATOR);
            } else if (u != 8) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                str2 = SafeParcelReader.m10963o(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }
}
