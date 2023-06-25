package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: c.q.a.c.d.j.l1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3486l1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) SafeParcelReader.m10962n(parcel, B, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 3:
                    z2 = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 4:
                    iArr = SafeParcelReader.m10958j(parcel, B);
                    break;
                case 5:
                    i = SafeParcelReader.m10940D(parcel, B);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.m10958j(parcel, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z, z2, iArr, i, iArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
