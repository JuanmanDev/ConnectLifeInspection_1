package p040c.p200q.p201a.p264c.p267b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: c.q.a.c.b.e */
public final class C3293e implements Parcelable.Creator<TokenData> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        Long l = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    i = SafeParcelReader.m10940D(parcel, B);
                    break;
                case 2:
                    str = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 3:
                    l = SafeParcelReader.m10942F(parcel, B);
                    break;
                case 4:
                    z = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 5:
                    z2 = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m10965q(parcel, B);
                    break;
                case 7:
                    str2 = SafeParcelReader.m10963o(parcel, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new TokenData(i, str, l, z, z2, arrayList, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}
