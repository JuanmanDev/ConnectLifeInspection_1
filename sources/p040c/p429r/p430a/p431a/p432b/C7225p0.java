package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.PrivacyPolicyActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.p0 */
/* compiled from: lambda */
public final /* synthetic */ class C7225p0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ PrivacyPolicyActivity f13852a;

    public /* synthetic */ C7225p0(PrivacyPolicyActivity privacyPolicyActivity) {
        this.f13852a = privacyPolicyActivity;
    }

    public final void onChanged(Object obj) {
        PrivacyPolicyActivity.m26857subscribeObservable$lambda4(this.f13852a, (Pair) obj);
    }
}
