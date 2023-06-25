package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginEmailActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.v0 */
/* compiled from: lambda */
public final /* synthetic */ class C7249v0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginEmailActivity f13876a;

    public /* synthetic */ C7249v0(LoginEmailActivity loginEmailActivity) {
        this.f13876a = loginEmailActivity;
    }

    public final void onChanged(Object obj) {
        LoginEmailActivity.m26835subscribeObservable$lambda8(this.f13876a, (Pair) obj);
    }
}
