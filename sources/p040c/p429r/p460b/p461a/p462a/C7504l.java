package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.ReportTicketActivity;
import kotlin.Pair;

/* renamed from: c.r.b.a.a.l */
/* compiled from: lambda */
public final /* synthetic */ class C7504l implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ReportTicketActivity f14201a;

    public /* synthetic */ C7504l(ReportTicketActivity reportTicketActivity) {
        this.f14201a = reportTicketActivity;
    }

    public final void onChanged(Object obj) {
        ReportTicketActivity.m27124subscribeObservable$lambda3(this.f14201a, (Pair) obj);
    }
}
