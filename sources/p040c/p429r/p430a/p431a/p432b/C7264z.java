package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginForgotPswInputEmailActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.z */
/* compiled from: lambda */
public final /* synthetic */ class C7264z implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginForgotPswInputEmailActivity f13891a;

    public /* synthetic */ C7264z(LoginForgotPswInputEmailActivity loginForgotPswInputEmailActivity) {
        this.f13891a = loginForgotPswInputEmailActivity;
    }

    public final void onChanged(Object obj) {
        LoginForgotPswInputEmailActivity.m26838subscribeObservable$lambda0(this.f13891a, (Pair) obj);
    }
}
