package p040c.p200q.p201a.p264c.p294g.p296b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.q.a.c.g.b.d */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C3614d implements IInterface {

    /* renamed from: e */
    public final IBinder f6575e;

    /* renamed from: l */
    public final String f6576l;

    public C3614d(IBinder iBinder, String str) {
        this.f6575e = iBinder;
        this.f6576l = str;
    }

    public IBinder asBinder() {
        return this.f6575e;
    }

    /* renamed from: d */
    public final Parcel mo20882d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6576l);
        return obtain;
    }

    /* renamed from: e */
    public final void mo20883e(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f6575e.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
