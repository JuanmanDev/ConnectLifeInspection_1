package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p527firebaseauthapi.zzaay;

/* renamed from: c.q.a.c.g.g.j */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4515j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m10946J(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
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
                    str5 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 7:
                    str6 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 8:
                    str7 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 9:
                    str8 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 10:
                    z = SafeParcelReader.m10970v(parcel2, B);
                    break;
                case 11:
                    z2 = SafeParcelReader.m10970v(parcel2, B);
                    break;
                case 12:
                    str9 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 13:
                    str10 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 14:
                    str11 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 15:
                    str12 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 16:
                    z3 = SafeParcelReader.m10970v(parcel2, B);
                    break;
                case 17:
                    str13 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel2, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel2, J);
        return new zzaay(str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, str10, str11, str12, z3, str13);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaay[i];
    }
}
