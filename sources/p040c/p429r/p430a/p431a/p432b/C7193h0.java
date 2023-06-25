package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterSuccessActivity;
import kotlin.Pair;

/* renamed from: c.r.a.a.b.h0 */
/* compiled from: lambda */
public final /* synthetic */ class C7193h0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterSuccessActivity f13819a;

    public /* synthetic */ C7193h0(RegisterSuccessActivity registerSuccessActivity) {
        this.f13819a = registerSuccessActivity;
    }

    public final void onChanged(Object obj) {
        RegisterSuccessActivity.m26883subscribeObservable$lambda1(this.f13819a, (Pair) obj);
    }
}
