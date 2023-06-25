package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p527firebaseauthapi.zzaal;
import com.google.android.gms.internal.p527firebaseauthapi.zzsg;

/* renamed from: c.q.a.c.g.g.pl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4699pl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        zzaal zzaal = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            if (SafeParcelReader.m10969u(B) != 1) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                zzaal = (zzaal) SafeParcelReader.m10962n(parcel, B, zzaal.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzsg(zzaal);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzsg[i];
    }
}
