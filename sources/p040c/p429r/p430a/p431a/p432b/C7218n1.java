package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.PasswordActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.n1 */
/* compiled from: lambda */
public final /* synthetic */ class C7218n1 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ PasswordActivity f13845a;

    public /* synthetic */ C7218n1(PasswordActivity passwordActivity) {
        this.f13845a = passwordActivity;
    }

    public final void onChanged(Object obj) {
        PasswordActivity.m26852subscribeObservable$lambda5(this.f13845a, (Pair) obj);
    }
}
