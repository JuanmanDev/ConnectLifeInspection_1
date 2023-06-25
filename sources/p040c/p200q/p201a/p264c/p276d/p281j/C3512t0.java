package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzj;
import p040c.p200q.p201a.p264c.p294g.p300f.C3653k;
import p040c.p200q.p201a.p264c.p294g.p300f.C3654l;

/* renamed from: c.q.a.c.d.j.t0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C3512t0 extends C3653k implements C3478j {
    public C3512t0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* renamed from: d */
    public final boolean mo20787d(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C3654l.m9194b(parcel);
            mo20714K(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C3654l.m9193a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            C3654l.m9194b(parcel);
            mo20713C(parcel.readInt(), (Bundle) C3654l.m9193a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            C3654l.m9194b(parcel);
            mo20715N(parcel.readInt(), parcel.readStrongBinder(), (zzj) C3654l.m9193a(parcel, zzj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
