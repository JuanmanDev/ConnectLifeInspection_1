package p040c.p200q.p201a.p264c.p294g.p295a;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: c.q.a.c.g.a.d */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public final class C3605d extends C3602a implements C3607f {
    public C3605d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: b */
    public final String mo20877b() {
        Parcel e = mo20876e(1, mo20875d());
        String readString = e.readString();
        e.recycle();
        return readString;
    }

    /* renamed from: w */
    public final boolean mo20878w(boolean z) {
        Parcel d = mo20875d();
        C3604c.m9145a(d, true);
        Parcel e = mo20876e(2, d);
        boolean b = C3604c.m9146b(e);
        e.recycle();
        return b;
    }
}
