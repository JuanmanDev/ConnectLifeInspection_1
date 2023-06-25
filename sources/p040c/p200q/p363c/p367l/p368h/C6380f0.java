package p040c.p200q.p363c.p367l.p368h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.internal.zzp;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.zze;

/* renamed from: c.q.c.l.h.f0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6380f0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        zzx zzx = null;
        zzp zzp = null;
        zze zze = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                zzx = (zzx) SafeParcelReader.m10962n(parcel, B, zzx.CREATOR);
            } else if (u == 2) {
                zzp = (zzp) SafeParcelReader.m10962n(parcel, B, zzp.CREATOR);
            } else if (u != 3) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                zze = (zze) SafeParcelReader.m10962n(parcel, B, zze.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzr(zzx, zzp, zze);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
