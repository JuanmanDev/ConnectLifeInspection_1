package p040c.p429r.p460b.p461a.p464c;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.fragment.DashBoardFragment;
import kotlin.Pair;

/* renamed from: c.r.b.a.c.k */
/* compiled from: lambda */
public final /* synthetic */ class C7545k implements Observer {

    /* renamed from: a */
    public final /* synthetic */ DashBoardFragment f14244a;

    public /* synthetic */ C7545k(DashBoardFragment dashBoardFragment) {
        this.f14244a = dashBoardFragment;
    }

    public final void onChanged(Object obj) {
        DashBoardFragment.m27151subscribeObservable$lambda12(this.f14244a, (Pair) obj);
    }
}
