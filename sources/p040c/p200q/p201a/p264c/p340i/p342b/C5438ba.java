package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzkw;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* renamed from: c.q.a.c.i.b.ba */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5438ba implements Parcelable.Creator {
    /* renamed from: a */
    public static void m15558a(zzkw zzkw, Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, zzkw.f14903e);
        C3514a.m8970s(parcel, 2, zzkw.f14904l, false);
        C3514a.m8965n(parcel, 3, zzkw.f14905m);
        C3514a.m8966o(parcel, 4, zzkw.f14906n, false);
        C3514a.m8961j(parcel, 5, (Float) null, false);
        C3514a.m8970s(parcel, 6, zzkw.f14907o, false);
        C3514a.m8970s(parcel, 7, zzkw.f14908p, false);
        C3514a.m8959h(parcel, 8, zzkw.f14909q, false);
        C3514a.m8953b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    i = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 2:
                    str = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 3:
                    j = SafeParcelReader.m10941E(parcel2, B);
                    break;
                case 4:
                    l = SafeParcelReader.m10942F(parcel2, B);
                    break;
                case 5:
                    f = SafeParcelReader.m10937A(parcel2, B);
                    break;
                case 6:
                    str2 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 7:
                    str3 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 8:
                    d = SafeParcelReader.m10973y(parcel2, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel2, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel2, J);
        return new zzkw(i, str, j, l, f, str2, str3, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzkw[i];
    }
}
