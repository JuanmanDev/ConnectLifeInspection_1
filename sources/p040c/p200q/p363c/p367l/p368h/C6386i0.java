package p040c.p200q.p363c.p367l.p368h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p527firebaseauthapi.zzzy;
import com.google.firebase.auth.internal.zzbb;
import com.google.firebase.auth.internal.zzt;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import com.google.firebase.auth.zze;
import java.util.ArrayList;

/* renamed from: c.q.c.l.h.i0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6386i0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m10946J(parcel);
        zzzy zzzy = null;
        zzt zzt = null;
        String str = null;
        String str2 = null;
        ArrayList<zzt> arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        zzz zzz = null;
        zze zze = null;
        zzbb zzbb = null;
        boolean z = false;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    zzzy = (zzzy) SafeParcelReader.m10962n(parcel2, B, zzzy.CREATOR);
                    break;
                case 2:
                    zzt = (zzt) SafeParcelReader.m10962n(parcel2, B, zzt.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 4:
                    str2 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 5:
                    arrayList = SafeParcelReader.m10967s(parcel2, B, zzt.CREATOR);
                    break;
                case 6:
                    arrayList2 = SafeParcelReader.m10965q(parcel2, B);
                    break;
                case 7:
                    str3 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 8:
                    bool = SafeParcelReader.m10971w(parcel2, B);
                    break;
                case 9:
                    zzz = (zzz) SafeParcelReader.m10962n(parcel2, B, zzz.CREATOR);
                    break;
                case 10:
                    z = SafeParcelReader.m10970v(parcel2, B);
                    break;
                case 11:
                    zze = (zze) SafeParcelReader.m10962n(parcel2, B, zze.CREATOR);
                    break;
                case 12:
                    zzbb = (zzbb) SafeParcelReader.m10962n(parcel2, B, zzbb.CREATOR);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel2, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel2, J);
        return new zzx(zzzy, zzt, str, str2, arrayList, arrayList2, str3, bool, zzz, z, zze, zzbb);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzx[i];
    }
}
