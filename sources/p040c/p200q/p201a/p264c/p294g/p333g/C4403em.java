package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p527firebaseauthapi.zzti;
import com.google.firebase.auth.ActionCodeSettings;

/* renamed from: c.q.a.c.g.g.em */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4403em implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        String str2 = null;
        ActionCodeSettings actionCodeSettings = null;
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
                actionCodeSettings = (ActionCodeSettings) SafeParcelReader.m10962n(parcel, B, ActionCodeSettings.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzti(str, str2, actionCodeSettings);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzti[i];
    }
}