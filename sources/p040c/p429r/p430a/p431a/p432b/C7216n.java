package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RepeatPasswordActivity;

/* renamed from: c.r.a.a.b.n */
/* compiled from: lambda */
public final /* synthetic */ class C7216n implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RepeatPasswordActivity f13843a;

    public /* synthetic */ C7216n(RepeatPasswordActivity repeatPasswordActivity) {
        this.f13843a = repeatPasswordActivity;
    }

    public final void onChanged(Object obj) {
        RepeatPasswordActivity.m26889subscribeObservable$lambda1(this.f13843a, (Boolean) obj);
    }
}
