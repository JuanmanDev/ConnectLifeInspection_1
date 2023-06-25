package p040c.p200q.p201a.p264c.p338h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;

/* renamed from: c.q.a.c.h.d */
public final class C5390d implements Parcelable.Creator<LocationRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m10946J(parcel);
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        boolean z = false;
        long j3 = Long.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        long j4 = 0;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    i = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 2:
                    j = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 3:
                    j2 = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 4:
                    z = SafeParcelReader.m10970v(parcel2, B);
                    break;
                case 5:
                    j3 = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 6:
                    i2 = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 7:
                    f = SafeParcelReader.m10974z(parcel2, B);
                    break;
                case 8:
                    j4 = SafeParcelReader.m10941E(parcel2, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel2, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel2, J);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
