package p040c.p200q.p363c.p400x;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.messaging.RemoteMessage;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* renamed from: c.q.c.x.r0 */
/* compiled from: RemoteMessageCreator */
public class C6851r0 implements Parcelable.Creator<RemoteMessage> {
    /* renamed from: c */
    public static void m19473c(RemoteMessage remoteMessage, Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8956e(parcel, 2, remoteMessage.f15460e, false);
        C3514a.m8953b(parcel, a);
    }

    @Nullable
    /* renamed from: a */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            if (SafeParcelReader.m10969u(B) != 2) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                bundle = SafeParcelReader.m10954f(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new RemoteMessage(bundle);
    }

    @Nullable
    /* renamed from: b */
    public RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
