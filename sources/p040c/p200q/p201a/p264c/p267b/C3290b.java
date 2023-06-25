package p040c.p200q.p201a.p264c.p267b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: c.q.a.c.b.b */
public final class C3290b implements Parcelable.Creator<AccountChangeEvent> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        long j = 0;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    i = SafeParcelReader.m10940D(parcel, B);
                    break;
                case 2:
                    j = SafeParcelReader.m10941E(parcel, B);
                    break;
                case 3:
                    str = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 4:
                    i2 = SafeParcelReader.m10940D(parcel, B);
                    break;
                case 5:
                    i3 = SafeParcelReader.m10940D(parcel, B);
                    break;
                case 6:
                    str2 = SafeParcelReader.m10963o(parcel, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new AccountChangeEvent(i, j, str, i2, i3, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEvent[i];
    }
}
