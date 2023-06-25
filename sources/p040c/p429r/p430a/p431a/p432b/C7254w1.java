package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterInputUserInfoActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.w1 */
/* compiled from: lambda */
public final /* synthetic */ class C7254w1 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterInputUserInfoActivity f13881a;

    public /* synthetic */ C7254w1(RegisterInputUserInfoActivity registerInputUserInfoActivity) {
        this.f13881a = registerInputUserInfoActivity;
    }

    public final void onChanged(Object obj) {
        RegisterInputUserInfoActivity.m26868subscribeObservable$lambda14(this.f13881a, (Pair) obj);
    }
}
