package p040c.p200q.p201a.p264c.p275c;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: c.q.a.c.c.c */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class C3298c implements Parcelable.Creator<CloudMessage> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            if (SafeParcelReader.m10969u(B) != 1) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                intent = (Intent) SafeParcelReader.m10962n(parcel, B, Intent.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new CloudMessage(intent);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CloudMessage[i];
    }
}
