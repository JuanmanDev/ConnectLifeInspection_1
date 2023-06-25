package p040c.p429r.p460b.p461a.p464c;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hisense.juconnect.app_device.fragment.DashBoardFragment;

/* renamed from: c.r.b.a.c.j */
/* compiled from: lambda */
public final /* synthetic */ class C7544j implements SwipeRefreshLayout.OnRefreshListener {

    /* renamed from: a */
    public final /* synthetic */ DashBoardFragment f14243a;

    public /* synthetic */ C7544j(DashBoardFragment dashBoardFragment) {
        this.f14243a = dashBoardFragment;
    }

    public final void onRefresh() {
        DashBoardFragment.m27150setListeners$lambda0(this.f14243a);
    }
}
