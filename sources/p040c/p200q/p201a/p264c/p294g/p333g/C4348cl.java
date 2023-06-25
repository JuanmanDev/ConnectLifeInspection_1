package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p527firebaseauthapi.zzri;

/* renamed from: c.q.a.c.g.g.cl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4348cl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u == 2) {
                str2 = SafeParcelReader.m10963o(parcel, B);
            } else if (u != 3) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                str3 = SafeParcelReader.m10963o(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzri(str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzri[i];
    }
}
