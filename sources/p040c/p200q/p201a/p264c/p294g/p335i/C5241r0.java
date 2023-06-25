package p040c.p200q.p201a.p264c.p294g.p335i;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c.q.a.c.g.i.r0 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public abstract class C5241r0 extends C5196o0 implements C5256s0 {
    /* renamed from: e */
    public static C5256s0 m14700e(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof C5256s0 ? (C5256s0) queryLocalInterface : new C5226q0(iBinder);
    }
}
