package p040c.p200q.p201a.p264c.p294g.p298d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.q.a.c.g.d.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C3631a implements IInterface {

    /* renamed from: e */
    public final IBinder f6580e;

    /* renamed from: l */
    public final String f6581l;

    public C3631a(IBinder iBinder, String str) {
        this.f6580e = iBinder;
        this.f6581l = str;
    }

    public final IBinder asBinder() {
        return this.f6580e;
    }

    /* renamed from: d */
    public final Parcel mo20900d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6581l);
        return obtain;
    }

    /* renamed from: e */
    public final Parcel mo20901e(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f6580e.transact(2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: g */
    public final void mo20902g(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f6580e.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: k */
    public final void mo20903k(int i, Parcel parcel) {
        try {
            this.f6580e.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
