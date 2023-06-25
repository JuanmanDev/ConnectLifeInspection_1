package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginEmailActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.z0 */
/* compiled from: lambda */
public final /* synthetic */ class C7265z0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginEmailActivity f13892a;

    public /* synthetic */ C7265z0(LoginEmailActivity loginEmailActivity) {
        this.f13892a = loginEmailActivity;
    }

    public final void onChanged(Object obj) {
        LoginEmailActivity.m26831subscribeObservable$lambda12(this.f13892a, (Pair) obj);
    }
}
