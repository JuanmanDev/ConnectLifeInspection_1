package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterSuccessActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.m2 */
/* compiled from: lambda */
public final /* synthetic */ class C7215m2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterSuccessActivity f13842a;

    public /* synthetic */ C7215m2(RegisterSuccessActivity registerSuccessActivity) {
        this.f13842a = registerSuccessActivity;
    }

    public final void onChanged(Object obj) {
        RegisterSuccessActivity.m26884subscribeObservable$lambda2(this.f13842a, (Pair) obj);
    }
}
