package p040c.p200q.p201a.p348d.p349a.p350a;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.zza;

/* renamed from: c.q.a.d.a.a.e */
/* compiled from: com.google.android.play:review@@2.0.1 */
public final class C5819e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zza((PendingIntent) parcel.readParcelable(ReviewInfo.class.getClassLoader()), parcel.readInt() != 0);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ReviewInfo[i];
    }
}
