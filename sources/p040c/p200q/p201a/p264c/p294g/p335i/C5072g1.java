package p040c.p200q.p201a.p264c.p294g.p335i;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: c.q.a.c.g.i.g1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class C5072g1 extends C5196o0 implements C5088h1 {
    public C5072g1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* renamed from: d */
    public final boolean mo27139d(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        C5211p0.m14617c(parcel);
        mo26910D((Bundle) C5211p0.m14615a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
