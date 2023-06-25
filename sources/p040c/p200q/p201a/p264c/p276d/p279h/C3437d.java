package p040c.p200q.p201a.p264c.p276d.p279h;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: c.q.a.c.d.h.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3437d implements Parcelable.Creator<DataHolder> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        int i = 0;
        int i2 = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                strArr = SafeParcelReader.m10964p(parcel, B);
            } else if (u == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.m10966r(parcel, B, CursorWindow.CREATOR);
            } else if (u == 3) {
                i2 = SafeParcelReader.m10940D(parcel, B);
            } else if (u == 4) {
                bundle = SafeParcelReader.m10954f(parcel, B);
            } else if (u != 1000) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                i = SafeParcelReader.m10940D(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.mo24569R();
        return dataHolder;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
