package p040c.p301y.p508a;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.hismart.networks.request.config.model.ConfigParsCom;
import com.juconnect.connect_life.MainActivity;

/* renamed from: c.y.a.c */
/* compiled from: lambda */
public final /* synthetic */ class C7711c implements Observer {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f14479a;

    public /* synthetic */ C7711c(MainActivity mainActivity) {
        this.f14479a = mainActivity;
    }

    public final void onChanged(Object obj) {
        MainActivity.m27232subscribeFireBase$lambda29(this.f14479a, (ConfigParsCom) obj);
    }
}
