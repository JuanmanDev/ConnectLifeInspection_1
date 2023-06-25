package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.ApplianceManagementActivity;

/* renamed from: c.r.b.a.a.k */
/* compiled from: lambda */
public final /* synthetic */ class C7502k implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ApplianceManagementActivity f14199a;

    public /* synthetic */ C7502k(ApplianceManagementActivity applianceManagementActivity) {
        this.f14199a = applianceManagementActivity;
    }

    public final void onChanged(Object obj) {
        ApplianceManagementActivity.m27099subscribeObservable$lambda9(this.f14199a, (Integer) obj);
    }
}
