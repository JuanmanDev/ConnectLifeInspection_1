package p040c.p200q.p201a.p264c.p293f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p040c.p200q.p201a.p264c.p292e.C3585a;
import p040c.p200q.p201a.p264c.p294g.p300f.C3643a;
import p040c.p200q.p201a.p264c.p294g.p300f.C3654l;

/* renamed from: c.q.a.c.f.l */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3600l extends C3643a implements IInterface {
    public C3600l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: Z */
    public final C3585a mo20865Z(C3585a aVar, String str, int i) {
        Parcel e = mo20909e();
        C3654l.m9197e(e, aVar);
        e.writeString(str);
        e.writeInt(i);
        Parcel d = mo20908d(2, e);
        C3585a e2 = C3585a.C3586a.m9122e(d.readStrongBinder());
        d.recycle();
        return e2;
    }

    /* renamed from: a0 */
    public final C3585a mo20866a0(C3585a aVar, String str, int i, C3585a aVar2) {
        Parcel e = mo20909e();
        C3654l.m9197e(e, aVar);
        e.writeString(str);
        e.writeInt(i);
        C3654l.m9197e(e, aVar2);
        Parcel d = mo20908d(8, e);
        C3585a e2 = C3585a.C3586a.m9122e(d.readStrongBinder());
        d.recycle();
        return e2;
    }

    /* renamed from: b0 */
    public final C3585a mo20867b0(C3585a aVar, String str, int i) {
        Parcel e = mo20909e();
        C3654l.m9197e(e, aVar);
        e.writeString(str);
        e.writeInt(i);
        Parcel d = mo20908d(4, e);
        C3585a e2 = C3585a.C3586a.m9122e(d.readStrongBinder());
        d.recycle();
        return e2;
    }

    /* renamed from: c0 */
    public final C3585a mo20868c0(C3585a aVar, String str, boolean z, long j) {
        Parcel e = mo20909e();
        C3654l.m9197e(e, aVar);
        e.writeString(str);
        C3654l.m9195c(e, z);
        e.writeLong(j);
        Parcel d = mo20908d(7, e);
        C3585a e2 = C3585a.C3586a.m9122e(d.readStrongBinder());
        d.recycle();
        return e2;
    }

    /* renamed from: g */
    public final int mo20869g() {
        Parcel d = mo20908d(6, mo20909e());
        int readInt = d.readInt();
        d.recycle();
        return readInt;
    }

    /* renamed from: k */
    public final int mo20870k(C3585a aVar, String str, boolean z) {
        Parcel e = mo20909e();
        C3654l.m9197e(e, aVar);
        e.writeString(str);
        C3654l.m9195c(e, z);
        Parcel d = mo20908d(3, e);
        int readInt = d.readInt();
        d.recycle();
        return readInt;
    }

    /* renamed from: v */
    public final int mo20871v(C3585a aVar, String str, boolean z) {
        Parcel e = mo20909e();
        C3654l.m9197e(e, aVar);
        e.writeString(str);
        C3654l.m9195c(e, z);
        Parcel d = mo20908d(5, e);
        int readInt = d.readInt();
        d.recycle();
        return readInt;
    }
}
