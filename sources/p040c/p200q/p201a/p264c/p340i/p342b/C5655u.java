package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* renamed from: c.q.a.c.i.b.u */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5655u implements Parcelable.Creator {
    /* renamed from: a */
    public static void m16139a(zzaw zzaw, Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 2, zzaw.f14899e, false);
        C3514a.m8968q(parcel, 3, zzaw.f14900l, i, false);
        C3514a.m8970s(parcel, 4, zzaw.f14901m, false);
        C3514a.m8965n(parcel, 5, zzaw.f14902n);
        C3514a.m8953b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        zzau zzau = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 2) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u == 3) {
                zzau = (zzau) SafeParcelReader.m10962n(parcel, B, zzau.CREATOR);
            } else if (u == 4) {
                str2 = SafeParcelReader.m10963o(parcel, B);
            } else if (u != 5) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                j = SafeParcelReader.m10941E(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzaw(str, zzau, str2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaw[i];
    }
}
