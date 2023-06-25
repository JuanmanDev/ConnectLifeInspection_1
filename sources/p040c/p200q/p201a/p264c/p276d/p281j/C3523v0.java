package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import p040c.p200q.p201a.p264c.p292e.C3585a;
import p040c.p200q.p201a.p264c.p294g.p300f.C3643a;
import p040c.p200q.p201a.p264c.p294g.p300f.C3654l;

/* renamed from: c.q.a.c.d.j.v0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3523v0 extends C3643a implements C3529x0 {
    public C3523v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: G */
    public final zzq mo20794G(zzo zzo) {
        Parcel e = mo20909e();
        C3654l.m9196d(e, zzo);
        Parcel d = mo20908d(6, e);
        zzq zzq = (zzq) C3654l.m9193a(d, zzq.CREATOR);
        d.recycle();
        return zzq;
    }

    /* renamed from: M */
    public final zzq mo20795M(zzo zzo) {
        Parcel e = mo20909e();
        C3654l.m9196d(e, zzo);
        Parcel d = mo20908d(8, e);
        zzq zzq = (zzq) C3654l.m9193a(d, zzq.CREATOR);
        d.recycle();
        return zzq;
    }

    /* renamed from: f */
    public final boolean mo20796f() {
        Parcel d = mo20908d(7, mo20909e());
        boolean f = C3654l.m9198f(d);
        d.recycle();
        return f;
    }

    /* renamed from: r */
    public final boolean mo20797r(zzs zzs, C3585a aVar) {
        Parcel e = mo20909e();
        C3654l.m9196d(e, zzs);
        C3654l.m9197e(e, aVar);
        Parcel d = mo20908d(5, e);
        boolean f = C3654l.m9198f(d);
        d.recycle();
        return f;
    }
}
