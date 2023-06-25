package p040c.p200q.p201a.p348d.p349a.p350a.p351c;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: c.q.a.d.a.a.c.g */
/* compiled from: com.google.android.play:review@@2.0.1 */
public abstract class C5802g extends C5797b implements C5803h {
    public C5802g() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    /* renamed from: d */
    public final boolean mo28891d(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        C5798c.m16477b(parcel);
        mo28894R((Bundle) C5798c.m16476a(parcel, Bundle.CREATOR));
        return true;
    }
}
