package p040c.p429r.p460b.p461a.p464c;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.fragment.ApplianceListFragment;
import kotlin.Pair;

/* renamed from: c.r.b.a.c.u */
/* compiled from: lambda */
public final /* synthetic */ class C7555u implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ApplianceListFragment f14255a;

    public /* synthetic */ C7555u(ApplianceListFragment applianceListFragment) {
        this.f14255a = applianceListFragment;
    }

    public final void onChanged(Object obj) {
        ApplianceListFragment.m27148subscribeObservable$lambda0(this.f14255a, (Pair) obj);
    }
}
