package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterInputVerificationActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.v2 */
/* compiled from: lambda */
public final /* synthetic */ class C7251v2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterInputVerificationActivity f13878a;

    public /* synthetic */ C7251v2(RegisterInputVerificationActivity registerInputVerificationActivity) {
        this.f13878a = registerInputVerificationActivity;
    }

    public final void onChanged(Object obj) {
        RegisterInputVerificationActivity.m26876subscribeObservable$lambda3(this.f13878a, (Pair) obj);
    }
}
