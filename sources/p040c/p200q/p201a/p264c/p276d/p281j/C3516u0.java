package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.IBinder;
import android.os.Parcel;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: c.q.a.c.d.j.u0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3516u0 implements C3481k {

    /* renamed from: e */
    public final IBinder f6515e;

    public C3516u0(IBinder iBinder) {
        this.f6515e = iBinder;
    }

    public final IBinder asBinder() {
        return this.f6515e;
    }

    /* renamed from: z */
    public final void mo20741z(C3478j jVar, @Nullable GetServiceRequest getServiceRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                C3490m1.m8891a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6515e.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
