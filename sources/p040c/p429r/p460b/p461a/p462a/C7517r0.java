package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.DeviceInfoActivity;
import kotlin.Pair;

/* renamed from: c.r.b.a.a.r0 */
/* compiled from: lambda */
public final /* synthetic */ class C7517r0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ DeviceInfoActivity f14215a;

    public /* synthetic */ C7517r0(DeviceInfoActivity deviceInfoActivity) {
        this.f14215a = deviceInfoActivity;
    }

    public final void onChanged(Object obj) {
        DeviceInfoActivity.m27108subscribeObservable$lambda8(this.f14215a, (Pair) obj);
    }
}
