package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginUsersActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.o */
/* compiled from: lambda */
public final /* synthetic */ class C7220o implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginUsersActivity f13847a;

    public /* synthetic */ C7220o(LoginUsersActivity loginUsersActivity) {
        this.f13847a = loginUsersActivity;
    }

    public final void onChanged(Object obj) {
        LoginUsersActivity.m26846subscribeObservable$lambda5(this.f13847a, (Pair) obj);
    }
}
