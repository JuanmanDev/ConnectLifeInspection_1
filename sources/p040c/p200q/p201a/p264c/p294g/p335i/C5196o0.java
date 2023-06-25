package p040c.p200q.p201a.p264c.p294g.p335i;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.q.a.c.g.i.o0 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public class C5196o0 extends Binder implements IInterface {
    public C5196o0(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    /* renamed from: d */
    public abstract boolean mo27139d(int i, Parcel parcel, Parcel parcel2, int i2);

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo27139d(i, parcel, parcel2, i2);
    }
}
