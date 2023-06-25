package p040c.p200q.p201a.p264c.p276d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.zzq;

/* renamed from: c.q.a.c.d.e0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3331e0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        boolean z = false;
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                z = SafeParcelReader.m10970v(parcel, B);
            } else if (u == 2) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u == 3) {
                i2 = SafeParcelReader.m10940D(parcel, B);
            } else if (u != 4) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                i = SafeParcelReader.m10940D(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzq(z, str, i2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
