package p040c.p200q.p201a.p264c.p338h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.zzae;

/* renamed from: c.q.a.c.h.f */
public final class C5392f implements Parcelable.Creator<zzae> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                str2 = SafeParcelReader.m10963o(parcel, B);
            } else if (u == 2) {
                str3 = SafeParcelReader.m10963o(parcel, B);
            } else if (u != 5) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                str = SafeParcelReader.m10963o(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzae(str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzae[i];
    }
}
