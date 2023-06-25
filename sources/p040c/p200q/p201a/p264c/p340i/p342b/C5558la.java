package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.q.a.c.i.b.la */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5558la implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m10946J(parcel);
        boolean z = true;
        boolean z2 = true;
        String str = "";
        String str2 = str;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str10 = null;
        String str11 = null;
        long j6 = -2147483648L;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 2:
                    str3 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 3:
                    str4 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 4:
                    str5 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 5:
                    str6 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 6:
                    j = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 7:
                    j2 = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 8:
                    str7 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 9:
                    z = SafeParcelReader.m10970v(parcel2, B);
                    break;
                case 10:
                    z3 = SafeParcelReader.m10970v(parcel2, B);
                    break;
                case 11:
                    j6 = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 12:
                    str8 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 13:
                    j3 = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 14:
                    j4 = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 15:
                    i = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 16:
                    z2 = SafeParcelReader.m10970v(parcel2, B);
                    break;
                case 18:
                    z4 = SafeParcelReader.m10970v(parcel2, B);
                    break;
                case 19:
                    str9 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 21:
                    bool = SafeParcelReader.m10971w(parcel2, B);
                    break;
                case 22:
                    j5 = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 23:
                    arrayList = SafeParcelReader.m10965q(parcel2, B);
                    break;
                case 24:
                    str10 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 25:
                    str = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 26:
                    str2 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 27:
                    str11 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel2, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel2, J);
        return new zzq(str3, str4, str5, str6, j, j2, str7, z, z3, j6, str8, j3, j4, i, z2, z4, str9, bool, j5, (List) arrayList, str10, str, str2, str11);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
