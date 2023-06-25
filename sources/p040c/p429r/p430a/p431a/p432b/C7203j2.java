package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.j2 */
/* compiled from: lambda */
public final /* synthetic */ class C7203j2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ DeviceCerVerificationActivity f13830a;

    public /* synthetic */ C7203j2(DeviceCerVerificationActivity deviceCerVerificationActivity) {
        this.f13830a = deviceCerVerificationActivity;
    }

    public final void onChanged(Object obj) {
        DeviceCerVerificationActivity.m26818subscribeObservable$lambda4(this.f13830a, (Pair) obj);
    }
}
