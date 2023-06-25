package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzau;

/* renamed from: c.q.a.c.i.b.t */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5643t implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            if (SafeParcelReader.m10969u(B) != 2) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                bundle = SafeParcelReader.m10954f(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzau(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzau[i];
    }
}
