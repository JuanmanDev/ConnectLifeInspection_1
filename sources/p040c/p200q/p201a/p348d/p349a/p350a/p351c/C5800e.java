package p040c.p200q.p201a.p348d.p349a.p350a.p351c;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c.q.a.d.a.a.c.e */
/* compiled from: com.google.android.play:review@@2.0.1 */
public abstract class C5800e extends C5797b implements C5801f {
    /* renamed from: e */
    public static C5801f m16481e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof C5801f ? (C5801f) queryLocalInterface : new C5799d(iBinder);
    }
}
