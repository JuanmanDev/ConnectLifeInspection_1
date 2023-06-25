package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.ServiceActivity;
import kotlin.Pair;

/* renamed from: c.r.b.a.a.p0 */
/* compiled from: lambda */
public final /* synthetic */ class C7513p0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ServiceActivity f14211a;

    public /* synthetic */ C7513p0(ServiceActivity serviceActivity) {
        this.f14211a = serviceActivity;
    }

    public final void onChanged(Object obj) {
        ServiceActivity.m27127subscribeObservable$lambda6(this.f14211a, (Pair) obj);
    }
}
