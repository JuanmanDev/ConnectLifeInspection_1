package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.NotificationActivity;
import java.util.List;

/* renamed from: c.r.b.a.a.n */
/* compiled from: lambda */
public final /* synthetic */ class C7508n implements Observer {

    /* renamed from: a */
    public final /* synthetic */ NotificationActivity f14206a;

    public /* synthetic */ C7508n(NotificationActivity notificationActivity) {
        this.f14206a = notificationActivity;
    }

    public final void onChanged(Object obj) {
        NotificationActivity.m27123subscribeObservable$lambda3(this.f14206a, (List) obj);
    }
}
