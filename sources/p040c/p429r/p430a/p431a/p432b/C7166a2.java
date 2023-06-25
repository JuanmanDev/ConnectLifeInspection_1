package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginUsersActivity;
import com.hisense.connect_life.hismart.model.JHLAgreementData;

/* renamed from: c.r.a.a.b.a2 */
/* compiled from: lambda */
public final /* synthetic */ class C7166a2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginUsersActivity f13792a;

    public /* synthetic */ C7166a2(LoginUsersActivity loginUsersActivity) {
        this.f13792a = loginUsersActivity;
    }

    public final void onChanged(Object obj) {
        LoginUsersActivity.m26847subscribeObservable$lambda6(this.f13792a, (JHLAgreementData) obj);
    }
}
