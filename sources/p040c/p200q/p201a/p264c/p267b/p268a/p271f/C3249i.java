package p040c.p200q.p201a.p264c.p267b.p268a.p271f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: c.q.a.c.b.a.f.i */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C3249i implements Parcelable.Creator<SignInPassword> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u != 2) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                str2 = SafeParcelReader.m10963o(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new SignInPassword(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInPassword[i];
    }
}
