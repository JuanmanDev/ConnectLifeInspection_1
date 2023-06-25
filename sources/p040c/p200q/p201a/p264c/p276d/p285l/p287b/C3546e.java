package p040c.p200q.p201a.p264c.p276d.p285l.p287b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zan;

/* renamed from: c.q.a.c.d.l.b.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3546e implements Parcelable.Creator<SafeParcelResponse> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        Parcel parcel2 = null;
        int i = 0;
        zan zan = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                i = SafeParcelReader.m10940D(parcel, B);
            } else if (u == 2) {
                parcel2 = SafeParcelReader.m10960l(parcel, B);
            } else if (u != 3) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                zan = (zan) SafeParcelReader.m10962n(parcel, B, zan.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new SafeParcelResponse(i, parcel2, zan);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
