package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zax;

/* renamed from: c.q.a.c.d.j.q0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3502q0 implements Parcelable.Creator<zax> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        int i = 0;
        int i2 = 0;
        Scope[] scopeArr = null;
        int i3 = 0;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                i = SafeParcelReader.m10940D(parcel, B);
            } else if (u == 2) {
                i3 = SafeParcelReader.m10940D(parcel, B);
            } else if (u == 3) {
                i2 = SafeParcelReader.m10940D(parcel, B);
            } else if (u != 4) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                scopeArr = (Scope[]) SafeParcelReader.m10966r(parcel, B, Scope.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zax(i, i3, i2, scopeArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zax[i];
    }
}
