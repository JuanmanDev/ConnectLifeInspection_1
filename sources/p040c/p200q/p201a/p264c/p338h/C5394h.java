package p040c.p200q.p201a.p264c.p338h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;

/* renamed from: c.q.a.c.h.h */
public final class C5394h implements Parcelable.Creator<LocationSettingsResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                status = (Status) SafeParcelReader.m10962n(parcel, B, Status.CREATOR);
            } else if (u != 2) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                locationSettingsStates = (LocationSettingsStates) SafeParcelReader.m10962n(parcel, B, LocationSettingsStates.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsResult[i];
    }
}
