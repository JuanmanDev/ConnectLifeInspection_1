package p040c.p200q.p201a.p264c.p267b.p268a.p273h;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: c.q.a.c.b.a.h.j */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3284j implements Parcelable.Creator<GoogleSignInOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList<Scope> arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2 = null;
        String str3 = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    i = SafeParcelReader.m10940D(parcel, B);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m10967s(parcel, B, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.m10962n(parcel, B, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 5:
                    z2 = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 6:
                    z3 = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 7:
                    str = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 8:
                    str2 = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.m10967s(parcel, B, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = SafeParcelReader.m10963o(parcel, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
