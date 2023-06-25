package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.AddApplianceSinglePairActivity;
import kotlin.Pair;

/* renamed from: c.r.b.a.a.z */
/* compiled from: lambda */
public final /* synthetic */ class C7532z implements Observer {

    /* renamed from: a */
    public final /* synthetic */ AddApplianceSinglePairActivity f14230a;

    public /* synthetic */ C7532z(AddApplianceSinglePairActivity addApplianceSinglePairActivity) {
        this.f14230a = addApplianceSinglePairActivity;
    }

    public final void onChanged(Object obj) {
        AddApplianceSinglePairActivity.m27093subscribeObservable$lambda0(this.f14230a, (Pair) obj);
    }
}
