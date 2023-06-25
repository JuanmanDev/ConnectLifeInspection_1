package p040c.p200q.p201a.p264c.p294g.p335i;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzcl;

/* renamed from: c.q.a.c.g.i.n1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5182n1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m10946J(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    j = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 2:
                    j2 = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 3:
                    z = SafeParcelReader.m10970v(parcel2, B);
                    break;
                case 4:
                    str = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 5:
                    str2 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 6:
                    str3 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 7:
                    bundle = SafeParcelReader.m10954f(parcel2, B);
                    break;
                case 8:
                    str4 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel2, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel2, J);
        return new zzcl(j, j2, z, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcl[i];
    }
}
