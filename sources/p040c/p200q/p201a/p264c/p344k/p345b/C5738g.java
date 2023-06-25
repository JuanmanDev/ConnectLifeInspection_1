package p040c.p200q.p201a.p264c.p344k.p345b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.signin.internal.zag;
import java.util.ArrayList;

/* renamed from: c.q.a.c.k.b.g */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C5738g implements Parcelable.Creator<zag> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                arrayList = SafeParcelReader.m10965q(parcel, B);
            } else if (u != 2) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                str = SafeParcelReader.m10963o(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zag(arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zag[i];
    }
}
