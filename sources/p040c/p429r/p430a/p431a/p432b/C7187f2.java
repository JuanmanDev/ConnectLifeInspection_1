package p040c.p429r.p430a.p431a.p432b;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.app_account.activity.ConfigTestActivity;
import com.hisense.connect_life.hismart.networks.request.config.model.ConfigParsCom;

/* renamed from: c.r.a.a.b.f2 */
/* compiled from: lambda */
public final /* synthetic */ class C7187f2 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ConfigTestActivity f13813a;

    public /* synthetic */ C7187f2(ConfigTestActivity configTestActivity) {
        this.f13813a = configTestActivity;
    }

    public final void onChanged(Object obj) {
        ConfigTestActivity.m26807subscribeObservable$lambda0(this.f13813a, (ConfigParsCom) obj);
    }
}
