package p040c.p200q.p201a.p264c.p267b.p268a.p271f;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: c.q.a.c.b.a.f.b */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C3242b implements Parcelable.Creator<BeginSignInResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            if (SafeParcelReader.m10969u(B) != 1) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.m10962n(parcel, B, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new BeginSignInResult(pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInResult[i];
    }
}
