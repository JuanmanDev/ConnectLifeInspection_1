package p040c.p301y.p508a;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.hismart.networks.request.config.model.ConfigParsCom;
import com.juconnect.connect_life.MainActivity;

/* renamed from: c.y.a.p */
/* compiled from: lambda */
public final /* synthetic */ class C7724p implements Observer {

    /* renamed from: a */
    public static final /* synthetic */ C7724p f14498a = new C7724p();

    private /* synthetic */ C7724p() {
    }

    public final void onChanged(Object obj) {
        MainActivity.m27231subscribeFireBase$lambda28((ConfigParsCom) obj);
    }
}
