package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.RegisterSuccessActivity;

/* renamed from: c.r.a.a.b.k */
/* compiled from: lambda */
public final /* synthetic */ class C7204k implements Observer {

    /* renamed from: a */
    public final /* synthetic */ RegisterSuccessActivity f13831a;

    public /* synthetic */ C7204k(RegisterSuccessActivity registerSuccessActivity) {
        this.f13831a = registerSuccessActivity;
    }

    public final void onChanged(Object obj) {
        RegisterSuccessActivity.m26885subscribeObservable$lambda3(this.f13831a, (Boolean) obj);
    }
}
