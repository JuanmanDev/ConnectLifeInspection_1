package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginEmailActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.u */
/* compiled from: lambda */
public final /* synthetic */ class C7244u implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginEmailActivity f13871a;

    public /* synthetic */ C7244u(LoginEmailActivity loginEmailActivity) {
        this.f13871a = loginEmailActivity;
    }

    public final void onChanged(Object obj) {
        LoginEmailActivity.m26832subscribeObservable$lambda14(this.f13871a, (Pair) obj);
    }
}
