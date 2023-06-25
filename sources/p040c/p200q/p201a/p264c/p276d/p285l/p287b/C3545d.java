package p040c.p200q.p201a.p264c.p276d.p285l.p287b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zam;
import java.util.ArrayList;

/* renamed from: c.q.a.c.d.l.b.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3545d implements Parcelable.Creator<zal> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        int i = 0;
        ArrayList<zam> arrayList = null;
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
                arrayList = SafeParcelReader.m10967s(parcel, B, zam.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zal(i, str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zal[i];
    }
}
