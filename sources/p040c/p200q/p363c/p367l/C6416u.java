package p040c.p200q.p363c.p367l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.ActionCodeSettings;

/* renamed from: c.q.c.l.u */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6416u implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    str = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 2:
                    str2 = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 3:
                    str3 = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 4:
                    str4 = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 5:
                    z = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 6:
                    str5 = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 7:
                    z2 = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 8:
                    str6 = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 9:
                    i = SafeParcelReader.m10940D(parcel, B);
                    break;
                case 10:
                    str7 = SafeParcelReader.m10963o(parcel, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new ActionCodeSettings(str, str2, str3, str4, z, str5, z2, str6, i, str7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActionCodeSettings[i];
    }
}
