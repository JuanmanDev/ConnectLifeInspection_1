package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: c.q.a.c.d.j.w */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3525w implements Parcelable.Creator<ClientIdentity> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                i = SafeParcelReader.m10940D(parcel, B);
            } else if (u != 2) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                str = SafeParcelReader.m10963o(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new ClientIdentity(i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ClientIdentity[i];
    }
}
