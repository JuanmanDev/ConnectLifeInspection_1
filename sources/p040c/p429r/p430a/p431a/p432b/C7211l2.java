package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterSuccessActivity;
import com.hisense.connect_life.hismart.model.JHLAgreementData;

/* renamed from: c.r.a.a.b.l2 */
/* compiled from: lambda */
public final /* synthetic */ class C7211l2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterSuccessActivity f13838a;

    public /* synthetic */ C7211l2(RegisterSuccessActivity registerSuccessActivity) {
        this.f13838a = registerSuccessActivity;
    }

    public final void onChanged(Object obj) {
        RegisterSuccessActivity.m26886subscribeObservable$lambda4(this.f13838a, (JHLAgreementData) obj);
    }
}
