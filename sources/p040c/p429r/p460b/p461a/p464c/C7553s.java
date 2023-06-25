package p040c.p429r.p460b.p461a.p464c;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.fragment.OneApplianceFragment;
import java.util.List;

/* renamed from: c.r.b.a.c.s */
/* compiled from: lambda */
public final /* synthetic */ class C7553s implements Observer {

    /* renamed from: a */
    public final /* synthetic */ OneApplianceFragment f14253a;

    public /* synthetic */ C7553s(OneApplianceFragment oneApplianceFragment) {
        this.f14253a = oneApplianceFragment;
    }

    public final void onChanged(Object obj) {
        OneApplianceFragment.m27167subscribeObservable$lambda21(this.f14253a, (List) obj);
    }
}
