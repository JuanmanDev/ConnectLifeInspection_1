package p040c.p482v.p483a.p492g;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.internationalwinecooler.p529ui.webview.HumitureWebViewActivity;

/* renamed from: c.v.a.g.j */
/* compiled from: lambda */
public final /* synthetic */ class C7630j implements Observer {

    /* renamed from: a */
    public final /* synthetic */ HumitureWebViewActivity f14363a;

    public /* synthetic */ C7630j(HumitureWebViewActivity humitureWebViewActivity) {
        this.f14363a = humitureWebViewActivity;
    }

    public final void onChanged(Object obj) {
        HumitureWebViewActivity.m27209setListeners$lambda5(this.f14363a, (DeviceStatusMessage) obj);
    }
}
