package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterInputUserInfoActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.r1 */
/* compiled from: lambda */
public final /* synthetic */ class C7234r1 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterInputUserInfoActivity f13861a;

    public /* synthetic */ C7234r1(RegisterInputUserInfoActivity registerInputUserInfoActivity) {
        this.f13861a = registerInputUserInfoActivity;
    }

    public final void onChanged(Object obj) {
        RegisterInputUserInfoActivity.m26870subscribeObservable$lambda18(this.f13861a, (Pair) obj);
    }
}
