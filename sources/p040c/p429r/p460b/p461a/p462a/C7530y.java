package p040c.p429r.p460b.p461a.p462a;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hisense.juconnect.app_device.activity.ApplianceManagementActivity;

/* renamed from: c.r.b.a.a.y */
/* compiled from: lambda */
public final /* synthetic */ class C7530y implements SwipeRefreshLayout.OnRefreshListener {

    /* renamed from: a */
    public final /* synthetic */ ApplianceManagementActivity f14228a;

    public /* synthetic */ C7530y(ApplianceManagementActivity applianceManagementActivity) {
        this.f14228a = applianceManagementActivity;
    }

    public final void onRefresh() {
        ApplianceManagementActivity.m27095setListeners$lambda1(this.f14228a);
    }
}
