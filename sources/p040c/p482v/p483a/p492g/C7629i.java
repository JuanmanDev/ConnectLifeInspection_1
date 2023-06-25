package p040c.p482v.p483a.p492g;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.internationalwinecooler.p529ui.webview.PropWebViewActivity;

/* renamed from: c.v.a.g.i */
/* compiled from: lambda */
public final /* synthetic */ class C7629i implements Observer {

    /* renamed from: a */
    public final /* synthetic */ PropWebViewActivity f14362a;

    public /* synthetic */ C7629i(PropWebViewActivity propWebViewActivity) {
        this.f14362a = propWebViewActivity;
    }

    public final void onChanged(Object obj) {
        PropWebViewActivity.m27212setListeners$lambda3(this.f14362a, (DeviceStatusMessage) obj);
    }
}
