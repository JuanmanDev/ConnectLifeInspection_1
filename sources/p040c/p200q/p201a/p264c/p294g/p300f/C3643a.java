package p040c.p200q.p201a.p264c.p294g.p300f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.q.a.c.g.f.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3643a implements IInterface {

    /* renamed from: e */
    public final IBinder f6588e;

    /* renamed from: l */
    public final String f6589l;

    public C3643a(IBinder iBinder, String str) {
        this.f6588e = iBinder;
        this.f6589l = str;
    }

    public final IBinder asBinder() {
        return this.f6588e;
    }

    /* renamed from: d */
    public final Parcel mo20908d(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f6588e.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: e */
    public final Parcel mo20909e() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6589l);
        return obtain;
    }
}
