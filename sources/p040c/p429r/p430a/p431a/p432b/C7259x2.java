package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginResetFirstActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.x2 */
/* compiled from: lambda */
public final /* synthetic */ class C7259x2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginResetFirstActivity f13886a;

    public /* synthetic */ C7259x2(LoginResetFirstActivity loginResetFirstActivity) {
        this.f13886a = loginResetFirstActivity;
    }

    public final void onChanged(Object obj) {
        LoginResetFirstActivity.m26841subscribeObservable$lambda2(this.f13886a, (Pair) obj);
    }
}
