package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.DeviceInfoActivity;
import kotlin.Pair;

/* renamed from: c.r.b.a.a.d */
/* compiled from: lambda */
public final /* synthetic */ class C7488d implements Observer {

    /* renamed from: a */
    public final /* synthetic */ DeviceInfoActivity f14185a;

    public /* synthetic */ C7488d(DeviceInfoActivity deviceInfoActivity) {
        this.f14185a = deviceInfoActivity;
    }

    public final void onChanged(Object obj) {
        DeviceInfoActivity.m27107subscribeObservable$lambda5(this.f14185a, (Pair) obj);
    }
}
