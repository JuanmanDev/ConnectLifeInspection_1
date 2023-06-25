package p040c.p200q.p201a.p264c.p338h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.zzaj;

/* renamed from: c.q.a.c.h.j */
public final class C5396j implements Parcelable.Creator<zzaj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        long j = -1;
        long j2 = -1;
        int i = 1;
        int i2 = 1;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                i = SafeParcelReader.m10940D(parcel, B);
            } else if (u == 2) {
                i2 = SafeParcelReader.m10940D(parcel, B);
            } else if (u == 3) {
                j = SafeParcelReader.m10941E(parcel, B);
            } else if (u != 4) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                j2 = SafeParcelReader.m10941E(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzaj(i, i2, j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaj[i];
    }
}
