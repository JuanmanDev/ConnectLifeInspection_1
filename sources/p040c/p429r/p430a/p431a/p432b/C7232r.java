package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.r */
/* compiled from: lambda */
public final /* synthetic */ class C7232r implements Observer {

    /* renamed from: a */
    public final /* synthetic */ DeviceCerVerificationActivity f13859a;

    public /* synthetic */ C7232r(DeviceCerVerificationActivity deviceCerVerificationActivity) {
        this.f13859a = deviceCerVerificationActivity;
    }

    public final void onChanged(Object obj) {
        DeviceCerVerificationActivity.m26817subscribeObservable$lambda3(this.f13859a, (Pair) obj);
    }
}
