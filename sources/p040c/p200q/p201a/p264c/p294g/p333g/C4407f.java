package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p527firebaseauthapi.zzaal;

/* renamed from: c.q.a.c.g.g.f */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4407f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m10946J(parcel);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    str = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 2:
                    j = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 3:
                    z = SafeParcelReader.m10970v(parcel2, B);
                    break;
                case 4:
                    str2 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 5:
                    str3 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 6:
                    str4 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 7:
                    z2 = SafeParcelReader.m10970v(parcel2, B);
                    break;
                case 8:
                    str5 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel2, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel2, J);
        return new zzaal(str, j, z, str2, str3, str4, z2, str5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaal[i];
    }
}
