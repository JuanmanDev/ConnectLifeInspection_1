package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.hismart.networks.request.message.model.WifiMessage;
import com.hisense.juconnect.app_device.activity.ApplianceManagementActivity;

/* renamed from: c.r.b.a.a.n0 */
/* compiled from: lambda */
public final /* synthetic */ class C7509n0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ApplianceManagementActivity f14207a;

    public /* synthetic */ C7509n0(ApplianceManagementActivity applianceManagementActivity) {
        this.f14207a = applianceManagementActivity;
    }

    public final void onChanged(Object obj) {
        ApplianceManagementActivity.m27097setListeners$lambda4(this.f14207a, (WifiMessage) obj);
    }
}
