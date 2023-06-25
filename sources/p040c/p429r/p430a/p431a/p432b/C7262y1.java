package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterInputVerificationActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.y1 */
/* compiled from: lambda */
public final /* synthetic */ class C7262y1 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterInputVerificationActivity f13889a;

    public /* synthetic */ C7262y1(RegisterInputVerificationActivity registerInputVerificationActivity) {
        this.f13889a = registerInputVerificationActivity;
    }

    public final void onChanged(Object obj) {
        RegisterInputVerificationActivity.m26875subscribeObservable$lambda2(this.f13889a, (Pair) obj);
    }
}
