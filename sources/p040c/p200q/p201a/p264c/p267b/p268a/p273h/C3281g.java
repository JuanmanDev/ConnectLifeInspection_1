package p040c.p200q.p201a.p264c.p267b.p268a.p273h;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: c.q.a.c.b.a.h.g */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3281g implements Parcelable.Creator<GoogleSignInAccount> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList<Scope> arrayList = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    i = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 2:
                    str = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 3:
                    str2 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 4:
                    str3 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 5:
                    str4 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.m10962n(parcel2, B, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 8:
                    j = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 9:
                    str6 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 10:
                    arrayList = SafeParcelReader.m10967s(parcel2, B, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 12:
                    str8 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel2, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel2, J);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
