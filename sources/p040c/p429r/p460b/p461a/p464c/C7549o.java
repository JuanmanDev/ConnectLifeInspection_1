package p040c.p429r.p460b.p461a.p464c;

import androidx.lifecycle.Observer;
import com.hisense.connect_life.hismart.networks.request.message.MsgObserverViewModel;
import com.hisense.connect_life.hismart.networks.request.message.model.WifiMessage;
import com.hisense.juconnect.app_device.fragment.DashBoardFragment;

/* renamed from: c.r.b.a.c.o */
/* compiled from: lambda */
public final /* synthetic */ class C7549o implements Observer {

    /* renamed from: a */
    public final /* synthetic */ DashBoardFragment f14248a;

    /* renamed from: b */
    public final /* synthetic */ MsgObserverViewModel f14249b;

    public /* synthetic */ C7549o(DashBoardFragment dashBoardFragment, MsgObserverViewModel msgObserverViewModel) {
        this.f14248a = dashBoardFragment;
        this.f14249b = msgObserverViewModel;
    }

    public final void onChanged(Object obj) {
        DashBoardFragment.m27155subscribeObservable$lambda9$lambda6(this.f14248a, this.f14249b, (WifiMessage) obj);
    }
}
