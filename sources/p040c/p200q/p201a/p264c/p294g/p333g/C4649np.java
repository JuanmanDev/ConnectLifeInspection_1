package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p527firebaseauthapi.zzzr;
import com.google.android.gms.internal.p527firebaseauthapi.zzzt;
import java.util.ArrayList;

/* renamed from: c.q.a.c.g.g.np */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4649np implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        ArrayList<zzzr> arrayList = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            if (SafeParcelReader.m10969u(B) != 2) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                arrayList = SafeParcelReader.m10967s(parcel, B, zzzr.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzzt(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzzt[i];
    }
}
