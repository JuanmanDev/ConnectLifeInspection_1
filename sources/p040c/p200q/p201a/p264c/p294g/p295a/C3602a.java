package p040c.p200q.p201a.p264c.p294g.p295a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.q.a.c.g.a.a */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public class C3602a implements IInterface {

    /* renamed from: e */
    public final IBinder f6571e;

    /* renamed from: l */
    public final String f6572l = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public C3602a(IBinder iBinder, String str) {
        this.f6571e = iBinder;
    }

    public final IBinder asBinder() {
        return this.f6571e;
    }

    /* renamed from: d */
    public final Parcel mo20875d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6572l);
        return obtain;
    }

    /* renamed from: e */
    public final Parcel mo20876e(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f6571e.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
