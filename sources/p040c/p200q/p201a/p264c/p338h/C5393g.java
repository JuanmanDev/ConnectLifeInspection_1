package p040c.p200q.p201a.p264c.p338h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzae;
import java.util.ArrayList;

/* renamed from: c.q.a.c.h.g */
public final class C5393g implements Parcelable.Creator<LocationSettingsRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        boolean z = false;
        ArrayList<LocationRequest> arrayList = null;
        zzae zzae = null;
        boolean z2 = false;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                arrayList = SafeParcelReader.m10967s(parcel, B, LocationRequest.CREATOR);
            } else if (u == 2) {
                z = SafeParcelReader.m10970v(parcel, B);
            } else if (u == 3) {
                z2 = SafeParcelReader.m10970v(parcel, B);
            } else if (u != 5) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                zzae = (zzae) SafeParcelReader.m10962n(parcel, B, zzae.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new LocationSettingsRequest(arrayList, z, z2, zzae);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}
