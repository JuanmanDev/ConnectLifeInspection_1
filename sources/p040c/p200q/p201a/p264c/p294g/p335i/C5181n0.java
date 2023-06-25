package p040c.p200q.p201a.p264c.p294g.p335i;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.q.a.c.g.i.n0 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public class C5181n0 implements IInterface {

    /* renamed from: e */
    public final IBinder f10009e;

    /* renamed from: l */
    public final String f10010l;

    public C5181n0(IBinder iBinder, String str) {
        this.f10009e = iBinder;
        this.f10010l = str;
    }

    public final IBinder asBinder() {
        return this.f10009e;
    }

    /* renamed from: d */
    public final Parcel mo27444d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10010l);
        return obtain;
    }

    /* renamed from: e */
    public final Parcel mo27445e(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f10009e.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: g */
    public final void mo27446g(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f10009e.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
