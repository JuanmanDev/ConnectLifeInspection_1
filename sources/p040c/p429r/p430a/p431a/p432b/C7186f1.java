package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterSetPasswordActivity;

/* renamed from: c.r.a.a.b.f1 */
/* compiled from: lambda */
public final /* synthetic */ class C7186f1 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterSetPasswordActivity f13812a;

    public /* synthetic */ C7186f1(RegisterSetPasswordActivity registerSetPasswordActivity) {
        this.f13812a = registerSetPasswordActivity;
    }

    public final void onChanged(Object obj) {
        RegisterSetPasswordActivity.m26881subscribeObservable$lambda2(this.f13812a, (Boolean) obj);
    }
}
