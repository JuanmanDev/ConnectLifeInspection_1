package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.PrivacyPolicyActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.t */
/* compiled from: lambda */
public final /* synthetic */ class C7240t implements Observer {

    /* renamed from: a */
    public final /* synthetic */ PrivacyPolicyActivity f13867a;

    public /* synthetic */ C7240t(PrivacyPolicyActivity privacyPolicyActivity) {
        this.f13867a = privacyPolicyActivity;
    }

    public final void onChanged(Object obj) {
        PrivacyPolicyActivity.m26855subscribeObservable$lambda2(this.f13867a, (Pair) obj);
    }
}
