package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.NameApplianceActivity;
import kotlin.Pair;

/* renamed from: c.r.b.a.a.r */
/* compiled from: lambda */
public final /* synthetic */ class C7516r implements Observer {

    /* renamed from: a */
    public final /* synthetic */ NameApplianceActivity f14214a;

    public /* synthetic */ C7516r(NameApplianceActivity nameApplianceActivity) {
        this.f14214a = nameApplianceActivity;
    }

    public final void onChanged(Object obj) {
        NameApplianceActivity.m27120subscribeObservable$lambda3(this.f14214a, (Pair) obj);
    }
}
