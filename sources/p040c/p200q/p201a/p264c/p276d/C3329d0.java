package p040c.p200q.p201a.p264c.p276d;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.zzo;

/* renamed from: c.q.a.c.d.d0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3329d0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u == 2) {
                z = SafeParcelReader.m10970v(parcel, B);
            } else if (u == 3) {
                z2 = SafeParcelReader.m10970v(parcel, B);
            } else if (u == 4) {
                iBinder = SafeParcelReader.m10939C(parcel, B);
            } else if (u != 5) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                z3 = SafeParcelReader.m10970v(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzo(str, z, z2, iBinder, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
