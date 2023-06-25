package p040c.p200q.p201a.p264c.p267b.p268a.p270e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: c.q.a.c.b.a.e.c */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C3237c implements Parcelable.Creator<CredentialPickerConfig> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                z = SafeParcelReader.m10970v(parcel, B);
            } else if (u == 2) {
                z2 = SafeParcelReader.m10970v(parcel, B);
            } else if (u == 3) {
                z3 = SafeParcelReader.m10970v(parcel, B);
            } else if (u == 4) {
                i2 = SafeParcelReader.m10940D(parcel, B);
            } else if (u != 1000) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                i = SafeParcelReader.m10940D(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new CredentialPickerConfig(i, z, z2, z3, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
