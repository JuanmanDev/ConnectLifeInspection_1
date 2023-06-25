package p040c.p200q.p201a.p264c.p294g.p334h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzm;
import com.google.android.gms.location.zzj;
import java.util.List;

/* renamed from: c.q.a.c.g.h.i */
public final class C4972i implements Parcelable.Creator<zzm> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        zzj zzj = zzm.f14797o;
        List<ClientIdentity> list = zzm.f14796n;
        String str = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                zzj = (zzj) SafeParcelReader.m10962n(parcel, B, zzj.CREATOR);
            } else if (u == 2) {
                list = SafeParcelReader.m10967s(parcel, B, ClientIdentity.CREATOR);
            } else if (u != 3) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                str = SafeParcelReader.m10963o(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzm(zzj, list, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}
