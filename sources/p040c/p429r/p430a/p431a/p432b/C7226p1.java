package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterInputUserInfoActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.p1 */
/* compiled from: lambda */
public final /* synthetic */ class C7226p1 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterInputUserInfoActivity f13853a;

    public /* synthetic */ C7226p1(RegisterInputUserInfoActivity registerInputUserInfoActivity) {
        this.f13853a = registerInputUserInfoActivity;
    }

    public final void onChanged(Object obj) {
        RegisterInputUserInfoActivity.m26873subscribeObservable$lambda21(this.f13853a, (Pair) obj);
    }
}
