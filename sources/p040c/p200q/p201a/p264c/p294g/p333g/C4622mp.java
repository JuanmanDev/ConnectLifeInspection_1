package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p527firebaseauthapi.zzaac;
import com.google.android.gms.internal.p527firebaseauthapi.zzaag;
import com.google.android.gms.internal.p527firebaseauthapi.zzzr;
import com.google.firebase.auth.zze;
import java.util.ArrayList;

/* renamed from: c.q.a.c.g.g.mp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4622mp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m10946J(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzaag zzaag = null;
        String str5 = null;
        String str6 = null;
        zze zze = null;
        ArrayList<zzaac> arrayList = null;
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
                    z = SafeParcelReader.m10970v(parcel2, B);
                    break;
                case 5:
                    str3 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 6:
                    str4 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 7:
                    zzaag = (zzaag) SafeParcelReader.m10962n(parcel2, B, zzaag.CREATOR);
                    break;
                case 8:
                    str5 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 9:
                    str6 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 10:
                    j = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 11:
                    j2 = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 12:
                    z2 = SafeParcelReader.m10970v(parcel2, B);
                    break;
                case 13:
                    zze = (zze) SafeParcelReader.m10962n(parcel2, B, zze.CREATOR);
                    break;
                case 14:
                    arrayList = SafeParcelReader.m10967s(parcel2, B, zzaac.CREATOR);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel2, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel2, J);
        return new zzzr(str, str2, z, str3, str4, zzaag, str5, str6, j, j2, z2, zze, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzzr[i];
    }
}
