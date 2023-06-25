package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RepeatPasswordActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.m1 */
/* compiled from: lambda */
public final /* synthetic */ class C7214m1 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RepeatPasswordActivity f13841a;

    public /* synthetic */ C7214m1(RepeatPasswordActivity repeatPasswordActivity) {
        this.f13841a = repeatPasswordActivity;
    }

    public final void onChanged(Object obj) {
        RepeatPasswordActivity.m26890subscribeObservable$lambda3(this.f13841a, (Pair) obj);
    }
}
