package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterSuccessActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.c2 */
/* compiled from: lambda */
public final /* synthetic */ class C7175c2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterSuccessActivity f13801a;

    public /* synthetic */ C7175c2(RegisterSuccessActivity registerSuccessActivity) {
        this.f13801a = registerSuccessActivity;
    }

    public final void onChanged(Object obj) {
        RegisterSuccessActivity.m26888subscribeObservable$lambda7(this.f13801a, (Pair) obj);
    }
}
