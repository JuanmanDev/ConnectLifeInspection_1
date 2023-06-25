package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.NameApplianceActivity;

/* renamed from: c.r.b.a.a.x */
/* compiled from: lambda */
public final /* synthetic */ class C7528x implements Observer {

    /* renamed from: a */
    public final /* synthetic */ NameApplianceActivity f14226a;

    public /* synthetic */ C7528x(NameApplianceActivity nameApplianceActivity) {
        this.f14226a = nameApplianceActivity;
    }

    public final void onChanged(Object obj) {
        NameApplianceActivity.m27121subscribeObservable$lambda4(this.f14226a, (Boolean) obj);
    }
}
