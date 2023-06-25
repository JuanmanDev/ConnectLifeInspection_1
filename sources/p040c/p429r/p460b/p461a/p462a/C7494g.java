package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.hisense.juconnect.app_device.activity.KeyLockActivity;

/* renamed from: c.r.b.a.a.g */
/* compiled from: lambda */
public final /* synthetic */ class C7494g implements Observer {

    /* renamed from: a */
    public final /* synthetic */ KeyLockActivity f14191a;

    public /* synthetic */ C7494g(KeyLockActivity keyLockActivity) {
        this.f14191a = keyLockActivity;
    }

    public final void onChanged(Object obj) {
        KeyLockActivity.m27116subscribeObservable$lambda4(this.f14191a, (DeviceStatusMessage) obj);
    }
}
