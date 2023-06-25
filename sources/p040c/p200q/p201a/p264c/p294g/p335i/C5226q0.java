package p040c.p200q.p201a.p264c.p294g.p335i;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: c.q.a.c.g.i.q0 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5226q0 extends C5181n0 implements C5256s0 {
    public C5226q0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: F */
    public final Bundle mo27511F(Bundle bundle) {
        Parcel d = mo27444d();
        C5211p0.m14619e(d, bundle);
        Parcel e = mo27445e(1, d);
        Bundle bundle2 = (Bundle) C5211p0.m14615a(e, Bundle.CREATOR);
        e.recycle();
        return bundle2;
    }
}
