package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p527firebaseauthapi.zzaac;
import com.google.android.gms.internal.p527firebaseauthapi.zzaaj;

/* renamed from: c.q.a.c.g.g.e */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4380e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzaac zzaac = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 2) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u == 3) {
                str2 = SafeParcelReader.m10963o(parcel, B);
            } else if (u == 4) {
                str3 = SafeParcelReader.m10963o(parcel, B);
            } else if (u != 5) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                zzaac = (zzaac) SafeParcelReader.m10962n(parcel, B, zzaac.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzaaj(str, str2, str3, zzaac);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaaj[i];
    }
}
