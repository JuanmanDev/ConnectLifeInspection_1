package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.DeviceInfoActivity;
import com.juconnect.connectlife.model.ConlManual;

/* renamed from: c.r.b.a.a.g0 */
/* compiled from: lambda */
public final /* synthetic */ class C7495g0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ DeviceInfoActivity f14192a;

    public /* synthetic */ C7495g0(DeviceInfoActivity deviceInfoActivity) {
        this.f14192a = deviceInfoActivity;
    }

    public final void onChanged(Object obj) {
        DeviceInfoActivity.m27106subscribeObservable$lambda12(this.f14192a, (ConlManual) obj);
    }
}
