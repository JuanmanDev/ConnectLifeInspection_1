package p040c.p200q.p201a.p264c.p294g.p297c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.auth.zzv;

/* renamed from: c.q.a.c.g.c.j */
public final class C3630j implements Parcelable.Creator<zzv> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                i = SafeParcelReader.m10940D(parcel, B);
            } else if (u != 2) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                str = SafeParcelReader.m10963o(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzv(i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzv[i];
    }
}
