package p040c.p200q.p201a.p348d.p349a.p350a;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.play.core.review.zza;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p040c.p200q.p201a.p348d.p349a.p350a.p351c.C5804i;

/* renamed from: c.q.a.d.a.a.j */
/* compiled from: com.google.android.play:review@@2.0.1 */
public final class C5824j extends C5823i {
    public C5824j(C5825k kVar, C5773k kVar2, String str) {
        super(kVar, new C5804i("OnRequestInstallCallback"), kVar2);
    }

    /* renamed from: R */
    public final void mo28894R(Bundle bundle) {
        super.mo28894R(bundle);
        this.f11344l.mo28863e(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
