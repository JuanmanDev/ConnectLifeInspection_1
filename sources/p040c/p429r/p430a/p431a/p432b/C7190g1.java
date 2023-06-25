package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RepeatPasswordActivity;

/* renamed from: c.r.a.a.b.g1 */
/* compiled from: lambda */
public final /* synthetic */ class C7190g1 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RepeatPasswordActivity f13816a;

    public /* synthetic */ C7190g1(RepeatPasswordActivity repeatPasswordActivity) {
        this.f13816a = repeatPasswordActivity;
    }

    public final void onChanged(Object obj) {
        RepeatPasswordActivity.m26891subscribeObservable$lambda5(this.f13816a, (Boolean) obj);
    }
}
