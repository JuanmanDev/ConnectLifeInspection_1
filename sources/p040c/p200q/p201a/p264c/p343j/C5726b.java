package p040c.p200q.p201a.p264c.p343j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.safetynet.HarmfulAppsData;

/* renamed from: c.q.a.c.j.b */
public final class C5726b implements Parcelable.Creator<HarmfulAppsData> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 2) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u == 3) {
                bArr = SafeParcelReader.m10955g(parcel, B);
            } else if (u != 4) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                i = SafeParcelReader.m10940D(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new HarmfulAppsData(str, bArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HarmfulAppsData[i];
    }
}
