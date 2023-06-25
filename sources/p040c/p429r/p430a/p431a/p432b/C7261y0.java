package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.LoginEmailActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.y0 */
/* compiled from: lambda */
public final /* synthetic */ class C7261y0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ LoginEmailActivity f13888a;

    public /* synthetic */ C7261y0(LoginEmailActivity loginEmailActivity) {
        this.f13888a = loginEmailActivity;
    }

    public final void onChanged(Object obj) {
        LoginEmailActivity.m26833subscribeObservable$lambda16(this.f13888a, (Pair) obj);
    }
}
