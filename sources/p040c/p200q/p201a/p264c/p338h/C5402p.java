package p040c.p200q.p201a.p264c.p338h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import java.util.ArrayList;

/* renamed from: c.q.a.c.h.p */
public final class C5402p implements Parcelable.Creator<ActivityTransitionRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        ArrayList<ActivityTransition> arrayList = null;
        String str = null;
        ArrayList<ClientIdentity> arrayList2 = null;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                arrayList = SafeParcelReader.m10967s(parcel, B, ActivityTransition.CREATOR);
            } else if (u == 2) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u != 3) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                arrayList2 = SafeParcelReader.m10967s(parcel, B, ClientIdentity.CREATOR);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new ActivityTransitionRequest(arrayList, str, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionRequest[i];
    }
}
