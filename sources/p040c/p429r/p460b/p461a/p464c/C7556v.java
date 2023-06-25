package p040c.p429r.p460b.p461a.p464c;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.hismart.networks.request.message.MsgObserverViewModel;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.hisense.juconnect.app_device.fragment.DashBoardFragment;

/* renamed from: c.r.b.a.c.v */
/* compiled from: lambda */
public final /* synthetic */ class C7556v implements Observer {

    /* renamed from: a */
    public final /* synthetic */ DashBoardFragment f14256a;

    /* renamed from: b */
    public final /* synthetic */ MsgObserverViewModel f14257b;

    public /* synthetic */ C7556v(DashBoardFragment dashBoardFragment, MsgObserverViewModel msgObserverViewModel) {
        this.f14256a = dashBoardFragment;
        this.f14257b = msgObserverViewModel;
    }

    public final void onChanged(Object obj) {
        DashBoardFragment.m27156subscribeObservable$lambda9$lambda8(this.f14256a, this.f14257b, (DeviceStatusMessage) obj);
    }
}
