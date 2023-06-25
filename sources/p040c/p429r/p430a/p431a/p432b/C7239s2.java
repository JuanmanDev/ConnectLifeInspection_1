package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.PrivacyPolicyActivity;

/* renamed from: c.r.a.a.b.s2 */
/* compiled from: lambda */
public final /* synthetic */ class C7239s2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ PrivacyPolicyActivity f13866a;

    public /* synthetic */ C7239s2(PrivacyPolicyActivity privacyPolicyActivity) {
        this.f13866a = privacyPolicyActivity;
    }

    public final void onChanged(Object obj) {
        PrivacyPolicyActivity.m26858subscribeObservable$lambda5(this.f13866a, (Boolean) obj);
    }
}
