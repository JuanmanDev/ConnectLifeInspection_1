package p040c.p200q.p201a.p264c.p338h;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

/* renamed from: c.q.a.c.h.l */
public final class C5398l implements Parcelable.Creator<ActivityRecognitionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        long j = 0;
        long j2 = 0;
        ArrayList<DetectedActivity> arrayList = null;
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                arrayList = SafeParcelReader.m10967s(parcel, B, DetectedActivity.CREATOR);
            } else if (u == 2) {
                j = SafeParcelReader.m10941E(parcel, B);
            } else if (u == 3) {
                j2 = SafeParcelReader.m10941E(parcel, B);
            } else if (u == 4) {
                i = SafeParcelReader.m10940D(parcel, B);
            } else if (u != 5) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                bundle = SafeParcelReader.m10954f(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new ActivityRecognitionResult(arrayList, j, j2, i, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
