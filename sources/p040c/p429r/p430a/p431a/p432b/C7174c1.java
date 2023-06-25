package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity;

/* renamed from: c.r.a.a.b.c1 */
/* compiled from: lambda */
public final /* synthetic */ class C7174c1 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ DeviceCerVerificationActivity f13800a;

    public /* synthetic */ C7174c1(DeviceCerVerificationActivity deviceCerVerificationActivity) {
        this.f13800a = deviceCerVerificationActivity;
    }

    public final void onChanged(Object obj) {
        DeviceCerVerificationActivity.m26821subscribeObservable$lambda8(this.f13800a, (Boolean) obj);
    }
}
