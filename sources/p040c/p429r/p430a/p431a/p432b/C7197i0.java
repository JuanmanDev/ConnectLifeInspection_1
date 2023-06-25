package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginUsersActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.i0 */
/* compiled from: lambda */
public final /* synthetic */ class C7197i0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginUsersActivity f13824a;

    public /* synthetic */ C7197i0(LoginUsersActivity loginUsersActivity) {
        this.f13824a = loginUsersActivity;
    }

    public final void onChanged(Object obj) {
        LoginUsersActivity.m26844subscribeObservable$lambda2(this.f13824a, (Pair) obj);
    }
}
