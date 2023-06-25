package p040c.p200q.p201a.p264c.p294g.p296b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.q.a.c.g.b.c */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C3613c extends Binder implements IInterface {
    public C3613c(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    /* renamed from: d */
    public abstract boolean mo20312d(int i, Parcel parcel, Parcel parcel2, int i2);

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return mo20312d(i, parcel, parcel2, i2);
    }
}
