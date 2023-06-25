package p040c.p200q.p201a.p264c.p293f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p040c.p200q.p201a.p264c.p292e.C3585a;
import p040c.p200q.p201a.p264c.p294g.p300f.C3643a;
import p040c.p200q.p201a.p264c.p294g.p300f.C3654l;

/* renamed from: c.q.a.c.f.m */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3601m extends C3643a implements IInterface {
    public C3601m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: g */
    public final C3585a mo20872g(C3585a aVar, String str, int i, C3585a aVar2) {
        Parcel e = mo20909e();
        C3654l.m9197e(e, aVar);
        e.writeString(str);
        e.writeInt(i);
        C3654l.m9197e(e, aVar2);
        Parcel d = mo20908d(2, e);
        C3585a e2 = C3585a.C3586a.m9122e(d.readStrongBinder());
        d.recycle();
        return e2;
    }

    /* renamed from: k */
    public final C3585a mo20873k(C3585a aVar, String str, int i, C3585a aVar2) {
        Parcel e = mo20909e();
        C3654l.m9197e(e, aVar);
        e.writeString(str);
        e.writeInt(i);
        C3654l.m9197e(e, aVar2);
        Parcel d = mo20908d(3, e);
        C3585a e2 = C3585a.C3586a.m9122e(d.readStrongBinder());
        d.recycle();
        return e2;
    }
}
