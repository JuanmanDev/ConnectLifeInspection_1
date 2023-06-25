package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.IBinder;
import android.os.Parcel;
import p040c.p200q.p201a.p264c.p292e.C3585a;
import p040c.p200q.p201a.p264c.p294g.p300f.C3643a;

/* renamed from: c.q.a.c.d.j.w1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3527w1 extends C3643a implements C3533y1 {
    public C3527w1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: b */
    public final int mo20800b() {
        Parcel d = mo20908d(2, mo20909e());
        int readInt = d.readInt();
        d.recycle();
        return readInt;
    }

    /* renamed from: c */
    public final C3585a mo20801c() {
        Parcel d = mo20908d(1, mo20909e());
        C3585a e = C3585a.C3586a.m9122e(d.readStrongBinder());
        d.recycle();
        return e;
    }
}
