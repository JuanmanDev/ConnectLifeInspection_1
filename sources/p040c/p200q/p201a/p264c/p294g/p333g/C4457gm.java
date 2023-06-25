package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p527firebaseauthapi.zzaac;
import com.google.android.gms.internal.p527firebaseauthapi.zztm;
import com.google.firebase.auth.zze;
import java.util.ArrayList;

/* renamed from: c.q.a.c.g.g.gm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4457gm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        ArrayList<zzaac> arrayList = null;
        zze zze = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u == 2) {
                arrayList = SafeParcelReader.m10967s(parcel, B, zzaac.CREATOR);
            } else if (u != 3) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                zze = (zze) SafeParcelReader.m10962n(parcel, B, zze.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zztm(str, arrayList, zze);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zztm[i];
    }
}
