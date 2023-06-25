package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p527firebaseauthapi.zzaae;

/* renamed from: c.q.a.c.g.g.c */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4326c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
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
                case 2:
                    str = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 3:
                    str2 = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 4:
                    str3 = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 5:
                    str4 = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 6:
                    str5 = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 7:
                    str6 = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 8:
                    str7 = SafeParcelReader.m10963o(parcel, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzaae(str, str2, str3, str4, str5, str6, str7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaae[i];
    }
}
