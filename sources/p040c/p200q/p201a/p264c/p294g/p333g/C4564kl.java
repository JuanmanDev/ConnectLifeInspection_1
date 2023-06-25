package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p527firebaseauthapi.zzry;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: c.q.a.c.g.g.kl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4564kl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        String str = null;
        PhoneAuthCredential phoneAuthCredential = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u != 2) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                phoneAuthCredential = (PhoneAuthCredential) SafeParcelReader.m10962n(parcel, B, PhoneAuthCredential.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new zzry(str, phoneAuthCredential);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzry[i];
    }
}
