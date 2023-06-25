package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p527firebaseauthapi.zzaaw;
import com.google.android.gms.internal.p527firebaseauthapi.zzzd;
import java.util.ArrayList;

/* renamed from: c.q.a.c.g.g.gp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4460gp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        zzaaw zzaaw = null;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 2:
                    str = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 3:
                    z = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 4:
                    str2 = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 5:
                    z2 = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 6:
                    zzaaw = (zzaaw) SafeParcelReader.m10962n(parcel, B, zzaaw.CREATOR);
                    break;
                case 7:
                    arrayList = SafeParcelReader.m10965q(parcel, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzzd(str, z, str2, z2, zzaaw, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzzd[i];
    }
}
