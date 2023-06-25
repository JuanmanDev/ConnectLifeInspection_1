package p040c.p200q.p201a.p264c.p276d.p285l.p287b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.zam;

/* renamed from: c.q.a.c.d.l.b.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3543b implements Parcelable.Creator<zam> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        int i = 0;
        FastJsonResponse.Field field = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                i = SafeParcelReader.m10940D(parcel, B);
            } else if (u == 2) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u != 3) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                field = (FastJsonResponse.Field) SafeParcelReader.m10962n(parcel, B, FastJsonResponse.Field.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zam(i, str, field);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zam[i];
    }
}
