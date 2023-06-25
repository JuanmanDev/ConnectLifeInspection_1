package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterInputUserInfoActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.k1 */
/* compiled from: lambda */
public final /* synthetic */ class C7206k1 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterInputUserInfoActivity f13833a;

    public /* synthetic */ C7206k1(RegisterInputUserInfoActivity registerInputUserInfoActivity) {
        this.f13833a = registerInputUserInfoActivity;
    }

    public final void onChanged(Object obj) {
        RegisterInputUserInfoActivity.m26869subscribeObservable$lambda15(this.f13833a, (Pair) obj);
    }
}
