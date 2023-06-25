package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterInputUserInfoActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.n0 */
/* compiled from: lambda */
public final /* synthetic */ class C7217n0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterInputUserInfoActivity f13844a;

    public /* synthetic */ C7217n0(RegisterInputUserInfoActivity registerInputUserInfoActivity) {
        this.f13844a = registerInputUserInfoActivity;
    }

    public final void onChanged(Object obj) {
        RegisterInputUserInfoActivity.m26871subscribeObservable$lambda19(this.f13844a, (Pair) obj);
    }
}
