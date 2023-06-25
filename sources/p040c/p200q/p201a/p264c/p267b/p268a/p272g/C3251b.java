package p040c.p200q.p201a.p264c.p267b.p268a.p272g;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: c.q.a.c.b.a.g.b */
public final class C3251b implements Parcelable.Creator<ProxyRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m10946J(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        long j = 0;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            int u = SafeParcelReader.m10969u(B);
            if (u == 1) {
                str = SafeParcelReader.m10963o(parcel, B);
            } else if (u == 2) {
                i2 = SafeParcelReader.m10940D(parcel, B);
            } else if (u == 3) {
                j = SafeParcelReader.m10941E(parcel, B);
            } else if (u == 4) {
                bArr = SafeParcelReader.m10955g(parcel, B);
            } else if (u == 5) {
                bundle = SafeParcelReader.m10954f(parcel, B);
            } else if (u != 1000) {
                SafeParcelReader.m10945I(parcel, B);
            } else {
                i = SafeParcelReader.m10940D(parcel, B);
            }
        }
        SafeParcelReader.m10968t(parcel, J);
        return new ProxyRequest(i, str, i2, j, bArr, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyRequest[i];
    }
}
