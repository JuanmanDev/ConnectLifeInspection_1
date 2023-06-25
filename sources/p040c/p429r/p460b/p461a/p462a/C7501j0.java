package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.hisense.juconnect.app_device.activity.DeviceInfoActivity;

/* renamed from: c.r.b.a.a.j0 */
/* compiled from: lambda */
public final /* synthetic */ class C7501j0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ DeviceInfoActivity f14198a;

    public /* synthetic */ C7501j0(DeviceInfoActivity deviceInfoActivity) {
        this.f14198a = deviceInfoActivity;
    }

    public final void onChanged(Object obj) {
        DeviceInfoActivity.m27105subscribeObservable$lambda10(this.f14198a, (DeviceStatusMessage) obj);
    }
}
