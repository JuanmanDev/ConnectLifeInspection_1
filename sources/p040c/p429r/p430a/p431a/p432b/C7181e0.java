package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterSuccessActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.e0 */
/* compiled from: lambda */
public final /* synthetic */ class C7181e0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterSuccessActivity f13807a;

    public /* synthetic */ C7181e0(RegisterSuccessActivity registerSuccessActivity) {
        this.f13807a = registerSuccessActivity;
    }

    public final void onChanged(Object obj) {
        RegisterSuccessActivity.m26887subscribeObservable$lambda6(this.f13807a, (Pair) obj);
    }
}
