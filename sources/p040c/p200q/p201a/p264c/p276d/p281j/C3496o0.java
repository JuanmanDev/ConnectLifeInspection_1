package p040c.p200q.p201a.p264c.p276d.p281j;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zat;

/* renamed from: c.q.a.c.d.j.o0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3496o0 implements Parcelable.Creator<zat> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        Account account = null;
        int i = 0;
        int i2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                i = SafeParcelReader.m10940D(parcel, B);
            } else if (u == 2) {
                account = (Account) SafeParcelReader.m10962n(parcel, B, Account.CREATOR);
            } else if (u == 3) {
                i2 = SafeParcelReader.m10940D(parcel, B);
            } else if (u != 4) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m10962n(parcel, B, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zat(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zat[i];
    }
}
