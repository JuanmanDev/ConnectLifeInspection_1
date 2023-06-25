package p040c.p200q.p201a.p264c.p343j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.safetynet.zzh;

/* renamed from: c.q.a.c.j.e */
public final class C5729e implements Parcelable.Creator<zzh> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 2) {
                i = SafeParcelReader.m10940D(parcel, B);
            } else if (u != 3) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                z = SafeParcelReader.m10970v(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzh(i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzh[i];
    }
}
