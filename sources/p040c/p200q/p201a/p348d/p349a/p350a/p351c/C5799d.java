package p040c.p200q.p201a.p348d.p349a.p350a.p351c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: c.q.a.d.a.a.c.d */
/* compiled from: com.google.android.play:review@@2.0.1 */
public final class C5799d extends C5796a implements C5801f {
    public C5799d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* renamed from: Y */
    public final void mo28893Y(String str, Bundle bundle, C5803h hVar) {
        Parcel d = mo28888d();
        d.writeString(str);
        C5798c.m16478c(d, bundle);
        C5798c.m16479d(d, hVar);
        mo28889e(2, d);
    }
}
