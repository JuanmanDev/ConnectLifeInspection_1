package p040c.p200q.p201a.p264c.p276d.p280i;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: c.q.a.c.d.i.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3442d implements Parcelable.Creator<WebImage> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        int i = 0;
        int i2 = 0;
        Uri uri = null;
        int i3 = 0;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                i = SafeParcelReader.m10940D(parcel, B);
            } else if (u == 2) {
                uri = (Uri) SafeParcelReader.m10962n(parcel, B, Uri.CREATOR);
            } else if (u == 3) {
                i3 = SafeParcelReader.m10940D(parcel, B);
            } else if (u != 4) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                i2 = SafeParcelReader.m10940D(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new WebImage(i, uri, i3, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WebImage[i];
    }
}
