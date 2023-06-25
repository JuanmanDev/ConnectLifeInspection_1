package p040c.p200q.p363c.p367l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;

/* renamed from: c.q.c.l.v */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6417v implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            SafeParcelReader.m10969u(B);
            SafeParcelReader.m10945I(parcel, B);
        }
        SafeParcelReader.m10968t(parcel, J);
        return new PhoneAuthProvider$ForceResendingToken();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PhoneAuthProvider$ForceResendingToken[i];
    }
}
