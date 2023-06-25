package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p527firebaseauthapi.zztk;
import com.google.firebase.auth.zze;

/* renamed from: c.q.a.c.g.g.fm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4430fm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        Status status = null;
        zze zze = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                status = (Status) SafeParcelReader.m10962n(parcel, B, Status.CREATOR);
            } else if (u == 2) {
                zze = (zze) SafeParcelReader.m10962n(parcel, B, zze.CREATOR);
            } else if (u == 3) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u != 4) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                str2 = SafeParcelReader.m10963o(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zztk(status, zze, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zztk[i];
    }
}
