package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginEmailActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.s1 */
/* compiled from: lambda */
public final /* synthetic */ class C7238s1 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginEmailActivity f13865a;

    public /* synthetic */ C7238s1(LoginEmailActivity loginEmailActivity) {
        this.f13865a = loginEmailActivity;
    }

    public final void onChanged(Object obj) {
        LoginEmailActivity.m26834subscribeObservable$lambda6(this.f13865a, (Pair) obj);
    }
}
