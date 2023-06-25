package p040c.p429r.p460b.p461a.p462a;

import androidx.lifecycle.Observer;
import com.hisense.juconnect.app_device.activity.ApplicationSettingsActivity;

/* renamed from: c.r.b.a.a.q */
/* compiled from: lambda */
public final /* synthetic */ class C7514q implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ApplicationSettingsActivity f14212a;

    public /* synthetic */ C7514q(ApplicationSettingsActivity applicationSettingsActivity) {
        this.f14212a = applicationSettingsActivity;
    }

    public final void onChanged(Object obj) {
        ApplicationSettingsActivity.m27102subscribeObservable$lambda3(this.f14212a, (Boolean) obj);
    }
}
