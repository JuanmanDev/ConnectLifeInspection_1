package p040c.p200q.p201a.p264c.p267b.p268a.p271f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: c.q.a.c.b.a.f.d */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C3244d implements Parcelable.Creator<BeginSignInRequest.GoogleIdTokenRequestOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    z = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 2:
                    str = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 3:
                    str2 = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 4:
                    z2 = SafeParcelReader.m10970v(parcel, B);
                    break;
                case 5:
                    str3 = SafeParcelReader.m10963o(parcel, B);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m10965q(parcel, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(z, str, str2, z2, str3, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
    }
}
