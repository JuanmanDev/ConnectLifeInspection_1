package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterInputUserInfoActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.i1 */
/* compiled from: lambda */
public final /* synthetic */ class C7198i1 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterInputUserInfoActivity f13825a;

    public /* synthetic */ C7198i1(RegisterInputUserInfoActivity registerInputUserInfoActivity) {
        this.f13825a = registerInputUserInfoActivity;
    }

    public final void onChanged(Object obj) {
        RegisterInputUserInfoActivity.m26872subscribeObservable$lambda20(this.f13825a, (Pair) obj);
    }
}
