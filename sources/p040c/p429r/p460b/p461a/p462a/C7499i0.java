package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.SingleZoneSetApplianceNameActivity;
import kotlin.Pair;

/* renamed from: c.r.b.a.a.i0 */
/* compiled from: lambda */
public final /* synthetic */ class C7499i0 implements Observer {

    /* renamed from: a */
    public final /* synthetic */ SingleZoneSetApplianceNameActivity f14196a;

    public /* synthetic */ C7499i0(SingleZoneSetApplianceNameActivity singleZoneSetApplianceNameActivity) {
        this.f14196a = singleZoneSetApplianceNameActivity;
    }

    public final void onChanged(Object obj) {
        SingleZoneSetApplianceNameActivity.m27136subscribeObservable$lambda0(this.f14196a, (Pair) obj);
    }
}
