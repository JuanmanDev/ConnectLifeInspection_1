package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p040c.p200q.p201a.p264c.p292e.C3585a;
import p040c.p200q.p201a.p264c.p294g.p300f.C3653k;
import p040c.p200q.p201a.p264c.p294g.p300f.C3654l;

/* renamed from: c.q.a.c.d.j.x1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C3530x1 extends C3653k implements C3533y1 {
    public C3530x1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: e */
    public static C3533y1 m9011e(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof C3533y1 ? (C3533y1) queryLocalInterface : new C3527w1(iBinder);
    }

    /* renamed from: d */
    public final boolean mo20787d(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C3585a c = mo20801c();
            parcel2.writeNoException();
            C3654l.m9197e(parcel2, c);
        } else if (i != 2) {
            return false;
        } else {
            int b = mo20800b();
            parcel2.writeNoException();
            parcel2.writeInt(b);
        }
        return true;
    }
}
