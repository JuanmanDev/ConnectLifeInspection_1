package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.zax;
import p040c.p200q.p201a.p264c.p292e.C3585a;
import p040c.p200q.p201a.p264c.p294g.p298d.C3631a;
import p040c.p200q.p201a.p264c.p294g.p298d.C3633c;

/* renamed from: c.q.a.c.d.j.i0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3476i0 extends C3631a implements IInterface {
    public C3476i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    /* renamed from: v */
    public final C3585a mo20736v(C3585a aVar, zax zax) {
        Parcel d = mo20900d();
        C3633c.m9180c(d, aVar);
        C3633c.m9179b(d, zax);
        Parcel e = mo20901e(2, d);
        C3585a e2 = C3585a.C3586a.m9122e(e.readStrongBinder());
        e.recycle();
        return e2;
    }
}
