package p040c.p200q.p201a.p264c.p344k.p345b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;

/* renamed from: c.q.a.c.k.b.h */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C5739h implements Parcelable.Creator<zai> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        int i = 0;
        zat zat = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                i = SafeParcelReader.m10940D(parcel, B);
            } else if (u != 2) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                zat = (zat) SafeParcelReader.m10962n(parcel, B, zat.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zai(i, zat);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zai[i];
    }
}
