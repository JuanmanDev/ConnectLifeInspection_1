package p040c.p200q.p201a.p264c.p294g.p335i;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: c.q.a.c.g.i.j1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class C5120j1 extends C5196o0 implements C5136k1 {
    public C5120j1() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: d */
    public final boolean mo27139d(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            long readLong = parcel.readLong();
            C5211p0.m14617c(parcel);
            mo27313j(parcel.readString(), parcel.readString(), (Bundle) C5211p0.m14615a(parcel, Bundle.CREATOR), readLong);
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int c = mo27312c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
        }
        return true;
    }
}
