package p040c.p200q.p201a.p264c.p294g.p298d;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.q.a.c.g.d.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C3632b extends Binder implements IInterface {
    public C3632b(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    /* renamed from: k */
    public abstract boolean mo20905k(int i, Parcel parcel, Parcel parcel2, int i2);

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo20905k(i, parcel, parcel2, i2);
    }
}
