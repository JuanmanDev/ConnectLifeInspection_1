package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.f */
/* compiled from: lambda */
public final /* synthetic */ class C7184f implements Observer {

    /* renamed from: a */
    public final /* synthetic */ DeviceCerVerificationActivity f13810a;

    public /* synthetic */ C7184f(DeviceCerVerificationActivity deviceCerVerificationActivity) {
        this.f13810a = deviceCerVerificationActivity;
    }

    public final void onChanged(Object obj) {
        DeviceCerVerificationActivity.m26819subscribeObservable$lambda6(this.f13810a, (Pair) obj);
    }
}
