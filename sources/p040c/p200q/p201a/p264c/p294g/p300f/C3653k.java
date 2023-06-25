package p040c.p200q.p201a.p264c.p294g.p300f;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.q.a.c.g.f.k */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3653k extends Binder implements IInterface {
    public C3653k(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    /* renamed from: d */
    public boolean mo20787d(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo20787d(i, parcel, parcel2, i2);
    }
}
