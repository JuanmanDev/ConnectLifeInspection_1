package p040c.p429r.p460b.p461a.p464c;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.fragment.ApplianceListFragment;
import java.util.List;

/* renamed from: c.r.b.a.c.x */
/* compiled from: lambda */
public final /* synthetic */ class C7558x implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ApplianceListFragment f14259a;

    public /* synthetic */ C7558x(ApplianceListFragment applianceListFragment) {
        this.f14259a = applianceListFragment;
    }

    public final void onChanged(Object obj) {
        ApplianceListFragment.m27149subscribeObservable$lambda2(this.f14259a, (List) obj);
    }
}
