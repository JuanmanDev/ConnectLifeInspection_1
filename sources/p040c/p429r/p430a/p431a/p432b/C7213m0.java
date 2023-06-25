package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginFirstActivity;
import com.hisense.connect_life.hismart.model.JHLAgreementData;

/* renamed from: c.r.a.a.b.m0 */
/* compiled from: lambda */
public final /* synthetic */ class C7213m0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginFirstActivity f13840a;

    public /* synthetic */ C7213m0(LoginFirstActivity loginFirstActivity) {
        this.f13840a = loginFirstActivity;
    }

    public final void onChanged(Object obj) {
        LoginFirstActivity.m26837subscribeObservable$lambda0(this.f13840a, (JHLAgreementData) obj);
    }
}
