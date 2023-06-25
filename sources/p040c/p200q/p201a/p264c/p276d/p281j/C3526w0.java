package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.IBinder;
import android.os.IInterface;
import p040c.p200q.p201a.p264c.p294g.p300f.C3653k;

/* renamed from: c.q.a.c.d.j.w0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C3526w0 extends C3653k implements C3529x0 {
    /* renamed from: e */
    public static C3529x0 m9004e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof C3529x0 ? (C3529x0) queryLocalInterface : new C3523v0(iBinder);
    }
}
