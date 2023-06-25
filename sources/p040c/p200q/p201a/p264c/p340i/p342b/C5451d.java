package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;

/* renamed from: c.q.a.c.i.b.d */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5451d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m10946J(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        zzkw zzkw = null;
        String str3 = null;
        zzaw zzaw = null;
        zzaw zzaw2 = null;
        zzaw zzaw3 = null;
        boolean z = false;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 2:
                    str = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 3:
                    str2 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 4:
                    zzkw = (zzkw) SafeParcelReader.m10962n(parcel2, B, zzkw.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 6:
                    z = SafeParcelReader.m10970v(parcel2, B);
                    break;
                case 7:
                    str3 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 8:
                    zzaw = (zzaw) SafeParcelReader.m10962n(parcel2, B, zzaw.CREATOR);
                    break;
                case 9:
                    j2 = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 10:
                    zzaw2 = (zzaw) SafeParcelReader.m10962n(parcel2, B, zzaw.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 12:
                    zzaw3 = (zzaw) SafeParcelReader.m10962n(parcel2, B, zzaw.CREATOR);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel2, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel2, J);
        return new zzac(str, str2, zzkw, j, z, str3, zzaw, j2, zzaw2, j3, zzaw3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzac[i];
    }
}
