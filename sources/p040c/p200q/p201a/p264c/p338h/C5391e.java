package p040c.p200q.p201a.p264c.p338h;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationResult;
import java.util.List;

/* renamed from: c.q.a.c.h.e */
public final class C5391e implements Parcelable.Creator<LocationResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        List<Location> list = LocationResult.f14847l;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            if (SafeParcelReader.m10969u(B) != 1) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                list = SafeParcelReader.m10967s(parcel, B, Location.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }
}
