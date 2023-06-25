package p040c.p200q.p201a.p264c.p294g.p335i;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: c.q.a.c.g.i.i1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5104i1 extends C5181n0 implements C5136k1 {
    public C5104i1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: c */
    public final int mo27312c() {
        Parcel e = mo27445e(2, mo27444d());
        int readInt = e.readInt();
        e.recycle();
        return readInt;
    }

    /* renamed from: j */
    public final void mo27313j(String str, String str2, Bundle bundle, long j) {
        Parcel d = mo27444d();
        d.writeString(str);
        d.writeString(str2);
        C5211p0.m14619e(d, bundle);
        d.writeLong(j);
        mo27446g(1, d);
    }
}
