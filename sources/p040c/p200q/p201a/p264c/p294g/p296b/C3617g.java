package p040c.p200q.p201a.p264c.p294g.p296b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p310authapi.zzt;

/* renamed from: c.q.a.c.g.b.g */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C3617g implements Parcelable.Creator<zzt> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            if (SafeParcelReader.m10969u(B) != 1) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                credential = (Credential) SafeParcelReader.m10962n(parcel, B, Credential.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzt(credential);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzt[i];
    }
}
