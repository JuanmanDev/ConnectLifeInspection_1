package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginResetPswActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.j0 */
/* compiled from: lambda */
public final /* synthetic */ class C7201j0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginResetPswActivity f13828a;

    public /* synthetic */ C7201j0(LoginResetPswActivity loginResetPswActivity) {
        this.f13828a = loginResetPswActivity;
    }

    public final void onChanged(Object obj) {
        LoginResetPswActivity.m26842subscribeObservable$lambda3(this.f13828a, (Pair) obj);
    }
}
