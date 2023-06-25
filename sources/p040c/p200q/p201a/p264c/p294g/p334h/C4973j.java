package p040c.p200q.p201a.p264c.p294g.p334h;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzm;
import com.google.android.gms.internal.location.zzo;

/* renamed from: c.q.a.c.g.h.j */
public final class C4973j implements Parcelable.Creator<zzo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        zzm zzm = null;
        int i = 1;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                i = SafeParcelReader.m10940D(parcel, B);
            } else if (u == 2) {
                zzm = (zzm) SafeParcelReader.m10962n(parcel, B, zzm.CREATOR);
            } else if (u == 3) {
                iBinder = SafeParcelReader.m10939C(parcel, B);
            } else if (u != 4) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                iBinder2 = SafeParcelReader.m10939C(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzo(i, zzm, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
