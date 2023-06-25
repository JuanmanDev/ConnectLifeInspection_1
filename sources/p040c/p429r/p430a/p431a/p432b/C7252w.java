package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginEmailActivity;
import com.hisense.connect_life.hismart.model.JHLAgreementData;

/* renamed from: c.r.a.a.b.w */
/* compiled from: lambda */
public final /* synthetic */ class C7252w implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginEmailActivity f13879a;

    public /* synthetic */ C7252w(LoginEmailActivity loginEmailActivity) {
        this.f13879a = loginEmailActivity;
    }

    public final void onChanged(Object obj) {
        LoginEmailActivity.m26830subscribeObservable$lambda10(this.f13879a, (JHLAgreementData) obj);
    }
}
