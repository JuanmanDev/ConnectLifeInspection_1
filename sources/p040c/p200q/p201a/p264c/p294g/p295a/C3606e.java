package p040c.p200q.p201a.p264c.p294g.p295a;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c.q.a.c.g.a.e */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public abstract class C3606e extends C3603b implements C3607f {
    /* renamed from: d */
    public static C3607f m9149d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (queryLocalInterface instanceof C3607f) {
            return (C3607f) queryLocalInterface;
        }
        return new C3605d(iBinder);
    }
}
