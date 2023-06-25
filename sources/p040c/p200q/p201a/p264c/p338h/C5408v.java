package p040c.p200q.p201a.p264c.p338h;

import android.os.IBinder;
import android.os.IInterface;
import p040c.p200q.p201a.p264c.p294g.p334h.C4968e;

/* renamed from: c.q.a.c.h.v */
public class C5408v extends C4968e implements C5407u {
    /* renamed from: d */
    public static C5407u m15438d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return queryLocalInterface instanceof C5407u ? (C5407u) queryLocalInterface : new C5409w(iBinder);
    }
}
