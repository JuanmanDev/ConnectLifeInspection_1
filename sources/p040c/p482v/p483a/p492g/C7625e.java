package p040c.p482v.p483a.p492g;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.internationalwinecooler.p529ui.webview.SettingWineWebViewActivity;

/* renamed from: c.v.a.g.e */
/* compiled from: lambda */
public final /* synthetic */ class C7625e implements Observer {

    /* renamed from: a */
    public final /* synthetic */ SettingWineWebViewActivity f14358a;

    public /* synthetic */ C7625e(SettingWineWebViewActivity settingWineWebViewActivity) {
        this.f14358a = settingWineWebViewActivity;
    }

    public final void onChanged(Object obj) {
        SettingWineWebViewActivity.m27216setListeners$lambda6(this.f14358a, (DeviceStatusMessage) obj);
    }
}
