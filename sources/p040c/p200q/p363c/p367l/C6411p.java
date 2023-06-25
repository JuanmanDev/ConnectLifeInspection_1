package p040c.p200q.p363c.p367l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneMultiFactorInfo;

/* renamed from: c.q.c.l.p */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6411p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u == 2) {
                str2 = SafeParcelReader.m10963o(parcel, B);
            } else if (u == 3) {
                j = SafeParcelReader.m10941E(parcel, B);
            } else if (u != 4) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                str3 = SafeParcelReader.m10963o(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new PhoneMultiFactorInfo(str, str2, j, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PhoneMultiFactorInfo[i];
    }
}
