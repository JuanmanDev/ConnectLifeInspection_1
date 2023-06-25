package p040c.p429r.p460b.p461a.p464c;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.fragment.TicketsBaseFragment;
import java.util.List;

/* renamed from: c.r.b.a.c.m */
/* compiled from: lambda */
public final /* synthetic */ class C7547m implements Observer {

    /* renamed from: a */
    public final /* synthetic */ TicketsBaseFragment f14246a;

    public /* synthetic */ C7547m(TicketsBaseFragment ticketsBaseFragment) {
        this.f14246a = ticketsBaseFragment;
    }

    public final void onChanged(Object obj) {
        TicketsBaseFragment.m27169initWidgets$lambda1(this.f14246a, (List) obj);
    }
}
