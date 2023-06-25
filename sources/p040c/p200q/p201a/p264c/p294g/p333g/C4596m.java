package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p527firebaseauthapi.zzabc;

/* renamed from: c.q.a.c.g.g.m */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4596m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z = false;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 2) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u == 3) {
                str2 = SafeParcelReader.m10963o(parcel, B);
            } else if (u == 4) {
                j = SafeParcelReader.m10941E(parcel, B);
            } else if (u != 5) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                z = SafeParcelReader.m10970v(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzabc(str, str2, j, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzabc[i];
    }
}
