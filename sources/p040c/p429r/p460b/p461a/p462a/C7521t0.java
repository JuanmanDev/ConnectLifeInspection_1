package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.ApplianceManagementActivity;
import kotlin.Pair;

/* renamed from: c.r.b.a.a.t0 */
/* compiled from: lambda */
public final /* synthetic */ class C7521t0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ApplianceManagementActivity f14219a;

    public /* synthetic */ C7521t0(ApplianceManagementActivity applianceManagementActivity) {
        this.f14219a = applianceManagementActivity;
    }

    public final void onChanged(Object obj) {
        ApplianceManagementActivity.m27098subscribeObservable$lambda7(this.f14219a, (Pair) obj);
    }
}
