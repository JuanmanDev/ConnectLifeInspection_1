package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginForgotPswInputEmailActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.y2 */
/* compiled from: lambda */
public final /* synthetic */ class C7263y2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginForgotPswInputEmailActivity f13890a;

    public /* synthetic */ C7263y2(LoginForgotPswInputEmailActivity loginForgotPswInputEmailActivity) {
        this.f13890a = loginForgotPswInputEmailActivity;
    }

    public final void onChanged(Object obj) {
        LoginForgotPswInputEmailActivity.m26839subscribeObservable$lambda1(this.f13890a, (Pair) obj);
    }
}
