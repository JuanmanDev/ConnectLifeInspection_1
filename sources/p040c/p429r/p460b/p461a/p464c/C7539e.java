package p040c.p429r.p460b.p461a.p464c;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hisense.juconnect.app_device.fragment.NotificationBaseFragment;

/* renamed from: c.r.b.a.c.e */
/* compiled from: lambda */
public final /* synthetic */ class C7539e implements SwipeRefreshLayout.OnRefreshListener {

    /* renamed from: a */
    public final /* synthetic */ NotificationBaseFragment f14238a;

    public /* synthetic */ C7539e(NotificationBaseFragment notificationBaseFragment) {
        this.f14238a = notificationBaseFragment;
    }

    public final void onRefresh() {
        NotificationBaseFragment.m27162setListeners$lambda3(this.f14238a);
    }
}
