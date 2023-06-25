package p040c.p200q.p201a.p264c.p276d.p285l.p287b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* renamed from: c.q.a.c.d.l.b.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3542a implements Parcelable.Creator<FastJsonResponse.Field> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        String str2 = null;
        zaa zaa = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    i = SafeParcelReader.m10940D(parcel, B);
                    break;
                case 2:
                    i2 = SafeParcelReader.m10940D(parcel, B);
                    break;
                case 3:
                    z = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 4:
                    i3 = SafeParcelReader.m10940D(parcel, B);
                    break;
                case 5:
                    z2 = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 6:
                    str = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 7:
                    i4 = SafeParcelReader.m10940D(parcel, B);
                    break;
                case 8:
                    str2 = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 9:
                    zaa = (zaa) SafeParcelReader.m10962n(parcel, B, zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new FastJsonResponse.Field(i, i2, z, i3, z2, str, i4, str2, zaa);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FastJsonResponse.Field[i];
    }
}
