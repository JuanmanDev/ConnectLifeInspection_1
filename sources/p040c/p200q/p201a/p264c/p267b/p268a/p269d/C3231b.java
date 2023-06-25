package p040c.p200q.p201a.p264c.p267b.p268a.p269d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: c.q.a.c.b.a.d.b */
public final class C3231b implements Parcelable.Creator<zzo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        ArrayList<String> arrayList4 = null;
        ArrayList<String> arrayList5 = null;
        int i = 0;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    i = SafeParcelReader.m10940D(parcel, B);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m10965q(parcel, B);
                    break;
                case 3:
                    arrayList2 = SafeParcelReader.m10965q(parcel, B);
                    break;
                case 4:
                    arrayList3 = SafeParcelReader.m10965q(parcel, B);
                    break;
                case 5:
                    arrayList4 = SafeParcelReader.m10965q(parcel, B);
                    break;
                case 6:
                    arrayList5 = SafeParcelReader.m10965q(parcel, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzo(i, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
