package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.r0 */
/* compiled from: lambda */
public final /* synthetic */ class C7233r0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ DeviceCerVerificationActivity f13860a;

    public /* synthetic */ C7233r0(DeviceCerVerificationActivity deviceCerVerificationActivity) {
        this.f13860a = deviceCerVerificationActivity;
    }

    public final void onChanged(Object obj) {
        DeviceCerVerificationActivity.m26820subscribeObservable$lambda7(this.f13860a, (Pair) obj);
    }
}
