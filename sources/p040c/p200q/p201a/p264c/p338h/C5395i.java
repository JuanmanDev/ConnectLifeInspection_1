package p040c.p200q.p201a.p264c.p338h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationSettingsStates;

/* renamed from: c.q.a.c.h.i */
public final class C5395i implements Parcelable.Creator<LocationSettingsStates> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    z = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 2:
                    z2 = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 3:
                    z3 = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 4:
                    z4 = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 5:
                    z5 = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 6:
                    z6 = SafeParcelReader.m10970v(parcel, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new LocationSettingsStates(z, z2, z3, z4, z5, z6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
