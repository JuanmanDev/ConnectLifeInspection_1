package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.ChangePasswordActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.w2 */
/* compiled from: lambda */
public final /* synthetic */ class C7255w2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ChangePasswordActivity f13882a;

    public /* synthetic */ C7255w2(ChangePasswordActivity changePasswordActivity) {
        this.f13882a = changePasswordActivity;
    }

    public final void onChanged(Object obj) {
        ChangePasswordActivity.m26806subscribeObservable$lambda3(this.f13882a, (Pair) obj);
    }
}
