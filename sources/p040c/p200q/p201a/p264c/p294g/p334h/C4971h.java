package p040c.p200q.p201a.p264c.p294g.p334h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzbh;

/* renamed from: c.q.a.c.g.h.h */
public final class C4971h implements Parcelable.Creator<zzbh> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m10946J(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        short s = 0;
        int i2 = 0;
        String str = null;
        float f = 0.0f;
        long j = 0;
        int i3 = -1;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    str = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 2:
                    j = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 3:
                    s = SafeParcelReader.m10943G(parcel2, B);
                    break;
                case 4:
                    d = SafeParcelReader.m10972x(parcel2, B);
                    break;
                case 5:
                    d2 = SafeParcelReader.m10972x(parcel2, B);
                    break;
                case 6:
                    f = SafeParcelReader.m10974z(parcel2, B);
                    break;
                case 7:
                    i = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 8:
                    i2 = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 9:
                    i3 = SafeParcelReader.m10940D(parcel2, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel2, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel2, J);
        return new zzbh(str, i, s, d, d2, f, j, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbh[i];
    }
}
