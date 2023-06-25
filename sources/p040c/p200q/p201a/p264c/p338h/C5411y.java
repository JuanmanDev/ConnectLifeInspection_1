package p040c.p200q.p201a.p264c.p338h;

import android.os.IBinder;
import android.os.IInterface;
import p040c.p200q.p201a.p264c.p294g.p334h.C4968e;

/* renamed from: c.q.a.c.h.y */
public abstract class C5411y extends C4968e implements C5410x {
    /* renamed from: d */
    public static C5410x m15439d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof C5410x ? (C5410x) queryLocalInterface : new C5412z(iBinder);
    }
}
