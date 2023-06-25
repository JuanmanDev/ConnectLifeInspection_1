package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;

/* renamed from: c.q.a.c.d.j.p0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3499p0 implements Parcelable.Creator<zav> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                i = SafeParcelReader.m10940D(parcel, B);
            } else if (u == 2) {
                iBinder = SafeParcelReader.m10939C(parcel, B);
            } else if (u == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.m10962n(parcel, B, ConnectionResult.CREATOR);
            } else if (u == 4) {
                z = SafeParcelReader.m10970v(parcel, B);
            } else if (u != 5) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                z2 = SafeParcelReader.m10970v(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zav(i, iBinder, connectionResult, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zav[i];
    }
}
