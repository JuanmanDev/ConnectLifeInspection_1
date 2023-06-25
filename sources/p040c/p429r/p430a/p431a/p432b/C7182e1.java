package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.GUserAgreementWebViewActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.e1 */
/* compiled from: lambda */
public final /* synthetic */ class C7182e1 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ GUserAgreementWebViewActivity f13808a;

    public /* synthetic */ C7182e1(GUserAgreementWebViewActivity gUserAgreementWebViewActivity) {
        this.f13808a = gUserAgreementWebViewActivity;
    }

    public final void onChanged(Object obj) {
        GUserAgreementWebViewActivity.m26826subscribeObservable$lambda3(this.f13808a, (Pair) obj);
    }
}
