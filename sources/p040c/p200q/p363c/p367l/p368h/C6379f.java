package p040c.p200q.p363c.p367l.p368h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.internal.zzag;
import java.util.ArrayList;

/* renamed from: c.q.c.l.h.f */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6379f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        String str2 = null;
        ArrayList<PhoneMultiFactorInfo> arrayList = null;
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
                arrayList = SafeParcelReader.m10967s(parcel, B, PhoneMultiFactorInfo.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzag(str, str2, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzag[i];
    }
}
