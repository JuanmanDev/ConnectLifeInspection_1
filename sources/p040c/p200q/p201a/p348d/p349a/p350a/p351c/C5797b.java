package p040c.p200q.p201a.p348d.p349a.p350a.p351c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.q.a.d.a.a.c.b */
/* compiled from: com.google.android.play:review@@2.0.1 */
public class C5797b extends Binder implements IInterface {
    public C5797b(String str) {
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    public final IBinder asBinder() {
        return this;
    }

    /* renamed from: d */
    public abstract boolean mo28891d(int i, Parcel parcel, Parcel parcel2, int i2);

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo28891d(i, parcel, parcel2, i2);
    }
}
