package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginUsersActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.x0 */
/* compiled from: lambda */
public final /* synthetic */ class C7257x0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginUsersActivity f13884a;

    public /* synthetic */ C7257x0(LoginUsersActivity loginUsersActivity) {
        this.f13884a = loginUsersActivity;
    }

    public final void onChanged(Object obj) {
        LoginUsersActivity.m26848subscribeObservable$lambda7(this.f13884a, (Pair) obj);
    }
}
