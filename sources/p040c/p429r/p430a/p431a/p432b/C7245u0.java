package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginOrRegisterActivity;
import com.hisense.connect_life.hismart.model.JHLAgreementData;

/* renamed from: c.r.a.a.b.u0 */
/* compiled from: lambda */
public final /* synthetic */ class C7245u0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginOrRegisterActivity f13872a;

    public /* synthetic */ C7245u0(LoginOrRegisterActivity loginOrRegisterActivity) {
        this.f13872a = loginOrRegisterActivity;
    }

    public final void onChanged(Object obj) {
        LoginOrRegisterActivity.m26840subscribeObservable$lambda1(this.f13872a, (JHLAgreementData) obj);
    }
}
