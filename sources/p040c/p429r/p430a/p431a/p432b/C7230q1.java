package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.ConfigTestActivity;
import com.hisense.connect_life.hismart.networks.request.config.model.ConfigParsCom;

/* renamed from: c.r.a.a.b.q1 */
/* compiled from: lambda */
public final /* synthetic */ class C7230q1 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ConfigTestActivity f13857a;

    public /* synthetic */ C7230q1(ConfigTestActivity configTestActivity) {
        this.f13857a = configTestActivity;
    }

    public final void onChanged(Object obj) {
        ConfigTestActivity.m26808subscribeObservable$lambda1(this.f13857a, (ConfigParsCom) obj);
    }
}
