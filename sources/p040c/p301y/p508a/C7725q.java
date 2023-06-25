package p040c.p301y.p508a;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.hismart.networks.request.config.model.ConfigParsCom;
import com.juconnect.connect_life.MainActivity;

/* renamed from: c.y.a.q */
/* compiled from: lambda */
public final /* synthetic */ class C7725q implements Observer {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f14499a;

    public /* synthetic */ C7725q(MainActivity mainActivity) {
        this.f14499a = mainActivity;
    }

    public final void onChanged(Object obj) {
        MainActivity.m27233subscribeFireBase$lambda30(this.f14499a, (ConfigParsCom) obj);
    }
}
