package p040c.p429r.p460b.p461a.p464c;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.fragment.DashBoardFragment;
import kotlin.Pair;

/* renamed from: c.r.b.a.c.l */
/* compiled from: lambda */
public final /* synthetic */ class C7546l implements Observer {

    /* renamed from: a */
    public final /* synthetic */ DashBoardFragment f14245a;

    public /* synthetic */ C7546l(DashBoardFragment dashBoardFragment) {
        this.f14245a = dashBoardFragment;
    }

    public final void onChanged(Object obj) {
        DashBoardFragment.m27152subscribeObservable$lambda2(this.f14245a, (Pair) obj);
    }
}
