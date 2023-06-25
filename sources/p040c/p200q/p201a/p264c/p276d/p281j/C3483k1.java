package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zzj;

/* renamed from: c.q.a.c.d.j.k1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3483k1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        Bundle bundle = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                bundle = SafeParcelReader.m10954f(parcel, B);
            } else if (u == 2) {
                featureArr = (Feature[]) SafeParcelReader.m10966r(parcel, B, Feature.CREATOR);
            } else if (u == 3) {
                i = SafeParcelReader.m10940D(parcel, B);
            } else if (u != 4) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) SafeParcelReader.m10962n(parcel, B, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzj(bundle, featureArr, i, connectionTelemetryConfiguration);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
