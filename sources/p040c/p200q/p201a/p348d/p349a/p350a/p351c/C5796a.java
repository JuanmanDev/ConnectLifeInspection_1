package p040c.p200q.p201a.p348d.p349a.p350a.p351c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.q.a.d.a.a.c.a */
/* compiled from: com.google.android.play:review@@2.0.1 */
public class C5796a implements IInterface {

    /* renamed from: e */
    public final IBinder f11307e;

    /* renamed from: l */
    public final String f11308l = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    public C5796a(IBinder iBinder, String str) {
        this.f11307e = iBinder;
    }

    public final IBinder asBinder() {
        return this.f11307e;
    }

    /* renamed from: d */
    public final Parcel mo28888d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f11308l);
        return obtain;
    }

    /* renamed from: e */
    public final void mo28889e(int i, Parcel parcel) {
        try {
            this.f11307e.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
