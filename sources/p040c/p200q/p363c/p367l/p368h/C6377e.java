package p040c.p200q.p363c.p367l.p368h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.internal.zzae;
import com.google.firebase.auth.internal.zzag;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.zze;
import java.util.ArrayList;

/* renamed from: c.q.c.l.h.e */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6377e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        ArrayList<PhoneMultiFactorInfo> arrayList = null;
        zzag zzag = null;
        String str = null;
        zze zze = null;
        zzx zzx = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                arrayList = SafeParcelReader.m10967s(parcel, B, PhoneMultiFactorInfo.CREATOR);
            } else if (u == 2) {
                zzag = (zzag) SafeParcelReader.m10962n(parcel, B, zzag.CREATOR);
            } else if (u == 3) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u == 4) {
                zze = (zze) SafeParcelReader.m10962n(parcel, B, zze.CREATOR);
            } else if (u != 5) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                zzx = (zzx) SafeParcelReader.m10962n(parcel, B, zzx.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzae(arrayList, zzag, str, zze, zzx);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzae[i];
    }
}
