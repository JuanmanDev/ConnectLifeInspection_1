package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.PrivacyPolicyActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.h2 */
/* compiled from: lambda */
public final /* synthetic */ class C7195h2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ PrivacyPolicyActivity f13821a;

    public /* synthetic */ C7195h2(PrivacyPolicyActivity privacyPolicyActivity) {
        this.f13821a = privacyPolicyActivity;
    }

    public final void onChanged(Object obj) {
        PrivacyPolicyActivity.m26856subscribeObservable$lambda3(this.f13821a, (Pair) obj);
    }
}
