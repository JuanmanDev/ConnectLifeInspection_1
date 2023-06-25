package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.AddTicketActivity;
import kotlin.Pair;

/* renamed from: c.r.b.a.a.k0 */
/* compiled from: lambda */
public final /* synthetic */ class C7503k0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ AddTicketActivity f14200a;

    public /* synthetic */ C7503k0(AddTicketActivity addTicketActivity) {
        this.f14200a = addTicketActivity;
    }

    public final void onChanged(Object obj) {
        AddTicketActivity.m27094subscribeObservable$lambda6(this.f14200a, (Pair) obj);
    }
}
