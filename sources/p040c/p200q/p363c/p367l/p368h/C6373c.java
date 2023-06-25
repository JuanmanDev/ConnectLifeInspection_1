package p040c.p200q.p363c.p367l.p368h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.internal.zzz;

/* renamed from: c.q.c.l.h.c */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6373c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                j = SafeParcelReader.m10941E(parcel, B);
            } else if (u != 2) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                j2 = SafeParcelReader.m10941E(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzz(j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzz[i];
    }
}
