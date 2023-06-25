package p040c.p200q.p363c.p367l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.UserProfileChangeRequest;

/* renamed from: c.q.c.l.s */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6414s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 2) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u == 3) {
                str2 = SafeParcelReader.m10963o(parcel, B);
            } else if (u == 4) {
                z = SafeParcelReader.m10970v(parcel, B);
            } else if (u != 5) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                z2 = SafeParcelReader.m10970v(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new UserProfileChangeRequest(str, str2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UserProfileChangeRequest[i];
    }
}
