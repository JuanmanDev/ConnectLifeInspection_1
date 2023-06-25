package p040c.p200q.p201a.p264c.p338h;

import android.os.IBinder;
import android.os.IInterface;
import p040c.p200q.p201a.p264c.p294g.p334h.C4968e;

/* renamed from: c.q.a.c.h.b0 */
public abstract class C5387b0 extends C4968e implements C5385a0 {
    /* renamed from: d */
    public static C5385a0 m15437d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof C5385a0 ? (C5385a0) queryLocalInterface : new C5389c0(iBinder);
    }
}
