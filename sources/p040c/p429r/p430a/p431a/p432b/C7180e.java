package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.PrivacyPolicyActivity;

/* renamed from: c.r.a.a.b.e */
/* compiled from: lambda */
public final /* synthetic */ class C7180e implements Observer {

    /* renamed from: a */
    public final /* synthetic */ PrivacyPolicyActivity f13806a;

    public /* synthetic */ C7180e(PrivacyPolicyActivity privacyPolicyActivity) {
        this.f13806a = privacyPolicyActivity;
    }

    public final void onChanged(Object obj) {
        PrivacyPolicyActivity.m26859subscribeObservable$lambda6(this.f13806a, (Boolean) obj);
    }
}
