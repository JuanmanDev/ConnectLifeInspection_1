package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p527firebaseauthapi.zzsk;

/* renamed from: c.q.a.c.g.g.rl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4752rl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            if (SafeParcelReader.m10969u(B) != 1) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                str = SafeParcelReader.m10963o(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzsk(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzsk[i];
    }
}
