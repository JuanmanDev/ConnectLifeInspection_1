package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: c.q.a.c.d.j.j0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3479j0 implements Parcelable.Creator<MethodInvocation> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    i = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 2:
                    i2 = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 3:
                    i3 = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 4:
                    j = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 5:
                    j2 = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 6:
                    str = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 7:
                    str2 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 8:
                    i4 = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 9:
                    i5 = SafeParcelReader.m10940D(parcel2, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel2, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel2, J);
        return new MethodInvocation(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
