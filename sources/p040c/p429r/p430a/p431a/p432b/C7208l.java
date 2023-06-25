package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginUsersActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.l */
/* compiled from: lambda */
public final /* synthetic */ class C7208l implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginUsersActivity f13835a;

    public /* synthetic */ C7208l(LoginUsersActivity loginUsersActivity) {
        this.f13835a = loginUsersActivity;
    }

    public final void onChanged(Object obj) {
        LoginUsersActivity.m26845subscribeObservable$lambda4(this.f13835a, (Pair) obj);
    }
}
