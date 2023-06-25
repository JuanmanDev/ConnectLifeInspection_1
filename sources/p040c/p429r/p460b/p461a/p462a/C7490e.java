package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.SingleZoneSetApplianceNameActivity;
import kotlin.Pair;

/* renamed from: c.r.b.a.a.e */
/* compiled from: lambda */
public final /* synthetic */ class C7490e implements Observer {

    /* renamed from: a */
    public final /* synthetic */ SingleZoneSetApplianceNameActivity f14187a;

    public /* synthetic */ C7490e(SingleZoneSetApplianceNameActivity singleZoneSetApplianceNameActivity) {
        this.f14187a = singleZoneSetApplianceNameActivity;
    }

    public final void onChanged(Object obj) {
        SingleZoneSetApplianceNameActivity.m27137subscribeObservable$lambda1(this.f14187a, (Pair) obj);
    }
}
