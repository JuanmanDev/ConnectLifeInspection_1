package p040c.p429r.p460b.p461a.p464c;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hisense.juconnect.app_device.fragment.TicketsBaseFragment;

/* renamed from: c.r.b.a.c.n */
/* compiled from: lambda */
public final /* synthetic */ class C7548n implements SwipeRefreshLayout.OnRefreshListener {

    /* renamed from: a */
    public final /* synthetic */ TicketsBaseFragment f14247a;

    public /* synthetic */ C7548n(TicketsBaseFragment ticketsBaseFragment) {
        this.f14247a = ticketsBaseFragment;
    }

    public final void onRefresh() {
        TicketsBaseFragment.m27170setListeners$lambda2(this.f14247a);
    }
}
