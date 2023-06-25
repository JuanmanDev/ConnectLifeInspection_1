package p040c.p200q.p363c.p367l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p527firebaseauthapi.zzaay;
import com.google.firebase.auth.zze;

/* renamed from: c.q.c.l.w */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6418w implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzaay zzaay = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    zzaay = (zzaay) SafeParcelReader.m10962n(parcel, B, zzaay.CREATOR);
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
                default:
                    SafeParcelReader.m10945I(parcel, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zze(str, str2, str3, zzaay, str4, str5, str6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zze[i];
    }
}
