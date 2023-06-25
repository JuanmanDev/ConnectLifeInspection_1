package p040c.p200q.p201a.p264c.p344k.p345b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* renamed from: c.q.a.c.k.b.i */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C5740i implements Parcelable.Creator<zak> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        zav zav = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                i = SafeParcelReader.m10940D(parcel, B);
            } else if (u == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.m10962n(parcel, B, ConnectionResult.CREATOR);
            } else if (u != 3) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                zav = (zav) SafeParcelReader.m10962n(parcel, B, zav.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zak(i, connectionResult, zav);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zak[i];
    }
}
