package p040c.p200q.p201a.p264c.p338h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.zzj;

/* renamed from: c.q.a.c.h.s */
public final class C5405s implements Parcelable.Creator<zzj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m10946J(parcel);
        boolean z = true;
        long j = 50;
        float f = 0.0f;
        long j2 = Long.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                z = SafeParcelReader.m10970v(parcel2, B);
            } else if (u == 2) {
                j = SafeParcelReader.m10941E(parcel2, B);
            } else if (u == 3) {
                f = SafeParcelReader.m10974z(parcel2, B);
            } else if (u == 4) {
                j2 = SafeParcelReader.m10941E(parcel2, B);
            } else if (u != 5) {
                SafeParcelReader.m10945I(parcel2, B);
            } else {
                i = SafeParcelReader.m10940D(parcel2, B);
            }
        }
        SafeParcelReader.m10968t(parcel2, J);
        return new zzj(z, j, f, j2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
