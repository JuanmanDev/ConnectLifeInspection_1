package p040c.p200q.p201a.p264c.p276d.p288m;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.ArrayList;

/* renamed from: c.q.a.c.d.m.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3549b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m10946J(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        float f = 0.0f;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    i = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 2:
                    j = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 4:
                    str = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 5:
                    i3 = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m10965q(parcel2, B);
                    break;
                case 8:
                    j2 = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 10:
                    str3 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 11:
                    i2 = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 12:
                    str2 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 13:
                    str4 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 14:
                    i4 = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 15:
                    f = SafeParcelReader.m10974z(parcel2, B);
                    break;
                case 16:
                    j3 = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 17:
                    str5 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 18:
                    z = SafeParcelReader.m10970v(parcel2, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel2, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel2, J);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
